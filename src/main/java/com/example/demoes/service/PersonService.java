package com.example.demoes.service;

import com.example.demoes.document.Person;
import com.example.demoes.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    protected PersonRepository repository;

    public void save(final Person person) {
        repository.save(person);
    }
    public Person findById(final String id) {
        return repository.findById(id).orElse(null);
    }
}
