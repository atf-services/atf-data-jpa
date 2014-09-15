package atf.jpa

import atf.api.Person
import atf.api.PersonService
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

    PersonService getPersonService() {
        this.applicationContext.getBean(JpaPersonService.class)
    }

    Person createPerson(firstName, lastName) {
        def person = new JpaPerson(firstName: firstName, lastName: lastName)
        def service = this.applicationContext.getBean(JpaPersonService.class)
        service.save(person)
    }

}
