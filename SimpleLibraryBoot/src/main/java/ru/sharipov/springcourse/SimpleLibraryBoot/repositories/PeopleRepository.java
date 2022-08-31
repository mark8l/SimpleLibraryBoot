package ru.sharipov.springcourse.SimpleLibraryBoot.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.sharipov.springcourse.SimpleLibraryBoot.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
	
	Optional<Person> findByNameAndSurnameAndPatronymicAndBirthdate(String name, String surname, String patronymic, Date birthdate);
	Optional<Person> findByNameAndSurnameAndBirthdate(String name, String surname, Date birthdate);
}
