package Weather.API.Victor.API.repo;

import Weather.API.Victor.API.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
