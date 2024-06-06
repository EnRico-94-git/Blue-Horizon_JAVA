package br.com.bluehorizon.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.bluehorizon.model.Animal;
import br.com.bluehorizon.service.AnimalService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public ResponseEntity<Page<EntityModel<Animal>>> getAllAnimals(Pageable pageable) {
        Page<Animal> animals = animalService.findAll(pageable);
        Page<EntityModel<Animal>> animalModels = animals.map(animal -> 
            EntityModel.of(animal, 
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(AnimalController.class).getAnimalById(animal.getId())).withSelfRel()));
        return ResponseEntity.ok(animalModels);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Animal>> getAnimalById(@PathVariable Long id) {
        Optional<Animal> animal = animalService.findById(id);
        return animal.map(value -> 
            ResponseEntity.ok(EntityModel.of(value, 
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(AnimalController.class).getAnimalById(value.getId())).withSelfRel())))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EntityModel<Animal>> createAnimal(@Valid @RequestBody Animal animal) {
        Animal savedAnimal = animalService.save(animal);
        return ResponseEntity.ok(EntityModel.of(savedAnimal, 
            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(AnimalController.class).getAnimalById(savedAnimal.getId())).withSelfRel()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EntityModel<Animal>> updateAnimal(@PathVariable Long id, @Valid @RequestBody Animal animal) {
        if (!animalService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        animal.setId(id);
        Animal updatedAnimal = animalService.save(animal);
        return ResponseEntity.ok(EntityModel.of(updatedAnimal, 
            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(AnimalController.class).getAnimalById(updatedAnimal.getId())).withSelfRel()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable Long id) {
        if (!animalService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        animalService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}