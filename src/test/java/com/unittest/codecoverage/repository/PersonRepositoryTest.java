package com.unittest.codecoverage.repository;

import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.repositories.PersonRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonRepositoryTest {

    @Test
    public void testInsert_shouldInsertPerson() {
        PersonRepository repository = new PersonRepository();
        Person person = new Person();
        person.setName("Name");
        person.setAge(21);
        person.setGender(Gender.M);

        Person result = repository.insert(person);

        assertNotNull(result);
        assertEquals("Name", result.getName());
        assertEquals(21, result.getAge());
        assertEquals(Gender.M, result.getGender());
    }

    @Test
    public void testUpdate_shouldUpdatePerson() {
        PersonRepository repository = new PersonRepository();
        Person person = new Person();
        person.setName("Name");
        person.setAge(21);
        person.setGender(Gender.M);

        repository.update(person);

    }

    @Test
    public void testDelete_shouldDeletePerson() {
        PersonRepository repository = new PersonRepository();
        String name = "John";

        repository.delete(name);

    }

    @Test
    public void testGet_shouldReturnPerson() {
        PersonRepository repository = new PersonRepository();
        String name = "John";

        Person result = repository.get(name);

        assertNull(result);
    }


    @Test
    public void testDelete_shouldThrowExceptionWhenNameIsNull() {
        PersonRepository repository = new PersonRepository();
        String name = null;

        assertThrows(NullPointerException.class, () -> repository.delete(name));
    }
    @Test
    public void testGet_shouldThrowExceptionWhenNameIsNull() {
        PersonRepository repository = new PersonRepository();
        String name = null;

        assertThrows(NullPointerException.class, () -> repository.get(name));
    }
    @Test
    public void testUpdate_shouldThrowExceptionWhenNameIsNull() {
        PersonRepository repository = new PersonRepository();
        Person person = null;

        assertThrows(NullPointerException.class, () -> repository.update(person));
    }

}