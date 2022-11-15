//package com.example.demoes.controller;
//
//import com.example.demoes.document.Person;
//import com.example.demoes.service.PersonService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class PersonController {
//    PersonService service;
//
//    @Autowired
//    public PersonController(PersonService service) {
//        this.service = service;
//    }
//
//    @PostMapping("/api/person")
//    public void save(@RequestBody final Person person) {
//        service.save(person);
//    }
//
//    @GetMapping("/api/person/{id}")
//    public Person findById(@PathVariable final String id) {
//        return service.findById(id);
//    }
//}
