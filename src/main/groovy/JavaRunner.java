import atf.api.Person;
import atf.api.PersonService;
import atf.api.ServiceContext;
import atf.jpa.JpaServiceContext;

import java.util.HashMap;
import java.util.Map;

public class JavaRunner {
    public static void main(String[] args) {
        println("Java Runner starting...");
        ServiceContext context = JpaServiceContext.getInstance();
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
