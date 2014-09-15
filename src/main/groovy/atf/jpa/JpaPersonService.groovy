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
    Person save(Person person) {
        Person p = this.repository.save(person)
        return p
    }

    @Override
    Person get(Long id) {
        return null
    }

    @Override
    void delete(Person person) {

    }

    @Override
    Person findByFirstName(String firstName) {
        return null
    }
}
