package atf.jpa

import atf.api.Person

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
public class JpaPerson extends Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    protected JpaPerson() {}

    public getId() { return this.id };

    public JpaPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}