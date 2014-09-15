import atf.jpa.JpaPerson;
import atf.jpa.ServiceContext;

public class JavaRunner {
    public static void main(String[] args) {
        println("Java Runner starting...");
        ServiceContext context = ServiceContext.getInstance();
        JpaPerson person = context.createPerson("Todd", "Crone");
        println("Person with ID=" + person.getId());
    }

    static void println(String s) {
        System.out.println(s);
    }
}
