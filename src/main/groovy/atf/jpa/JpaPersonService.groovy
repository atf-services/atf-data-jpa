package atf.jpa

import atf.api.Person
import atf.api.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class JpaPersonService implements PersonService {

    @Autowired
    PersonRepository repository

    @Override
    Person create(Map<String, Object> properties) {
        return new JpaPerson(properties);
    }

    @Override
    Person save(Person person) {
        return this.repository.save(person)
    }

    @Override
    Person get(Long id) {
        return this.repository.findOne(id)
    }

    @Override
    void delete(Person person) {
        this.repository.delete(person)
    }

    @Override
    Person findByFirstName(String firstName) {
        return null
    }
}
