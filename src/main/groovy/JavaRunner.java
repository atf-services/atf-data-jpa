import atf.api.Person;
import atf.api.PersonService;
import atf.jpa.JpaPerson;
import atf.jpa.ServiceContext;

import java.util.HashMap;
import java.util.Map;

public class JavaRunner {
    public static void main(String[] args) {
        println("Java Runner starting...");
        ServiceContext context = ServiceContext.getInstance();
        PersonService service = context.getPersonService();
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("firstName", "Todd");
        props.put("lastName", "Crone");
        Person p = service.create(props);
        service.save(p);
        println("Person with ID=" + p.getId());
    }

    static void println(String s) {
        System.out.println(s);
    }
}
