package pkg

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class ServiceContext {

    static instance

    static ServiceContext getInstance() {
        if(!instance) {
            def ctx = new AnnotationConfigApplicationContext(Config.class)
            instance = new ServiceContext(ctx)
        }
        return instance
    }

    ApplicationContext applicationContext

    private ServiceContext(appCtx) {
        this.applicationContext = appCtx
    }

    Person createPerson(firstName, lastName) {
        def p = new Person(firstName: firstName, lastName: lastName)
        def repo = this.applicationContext.getBean(PersonRepository.class)
        repo.save(p)
        p
    }

}
