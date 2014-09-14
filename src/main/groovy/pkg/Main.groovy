package pkg

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan;

class Main {
    static void main(String[] args) {
        def context = new AnnotationConfigApplicationContext(Config.class)

        def repo = context.getBean(PersonRepository.class)

        println "WTF"
    }
}
