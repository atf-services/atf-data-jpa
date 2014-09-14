package pkg

import org.springframework.context.annotation.AnnotationConfigApplicationContext

class Main {
    static void main(String[] args) {
        def context = new AnnotationConfigApplicationContext(Config.class)

        def repo = context.getBean(PersonRepository.class)
        def person = new Person(firstName: 'Todd', lastName: 'Crone')
        repo.save(person)
        println "Person with ID=${person.id}"
    }
}
