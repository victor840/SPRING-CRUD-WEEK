package Weather.API.Victor.API.service;

import Weather.API.Victor.API.model.Person;

import java.util.List;

public interface PersonService {
    Person createPerson(Person person);
    Person updatePerson(Person person);

    List < Person > getAllPeople();

    Person getPersonById(long personId);

    void deletePerson(long id);
}
