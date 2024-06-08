package com.unittest.codecoverage.repositories;

import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonRepositoryTest {

    @Test
    public void testAddPerson() {
        PersonRepository  repository = new PersonRepository();
        Person person = new Person();
        person.setName("Mahdi");
        person.setAge(23);
        Person p = repository.insert(person);
        assertEquals(person, p);
    }


    @Test
    public void testFindPerson() {
        PersonRepository  repository = new PersonRepository();
        String name = "Mahdi";
        Person result = repository.get(name);
        assertNull(result);
    }


    @Test
    public void testUpdatePersonDetails() {
        PersonRepository repository = new PersonRepository();
        Person person = new Person();
        person.setName("Mahdi");
        person.setAge(23);

        Person p = repository.insert(person);
        p.setName("Abolfazl");
        p.setAge(22);
        assertDoesNotThrow(() -> repository.update(p));
    }


    @Test
    public void testDelete_NameIsNotNull() {
        PersonRepository repository = new PersonRepository();
        assertDoesNotThrow(() -> repository.delete("Abolfazl"));
    }
}
