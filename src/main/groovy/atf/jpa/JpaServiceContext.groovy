package atf.jpa

import atf.api.PersonService
import atf.api.ServiceContext
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class JpaServiceContext implements ServiceContext {

    static instance

    static ServiceContext getInstance() {
        if(!instance) {
            def ctx = new AnnotationConfigApplicationContext(Config.class)
            instance = new JpaServiceContext(ctx)
        }
        return instance
    }

    ApplicationContext applicationContext

    private JpaServiceContext(appCtx) {
        this.applicationContext = appCtx
    }

    @Override
    PersonService getPersonService() {
        this.applicationContext.getBean(JpaPersonService.class)
    }

}
