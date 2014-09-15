package atf.jpa

import atf.api.AbstractPerson

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
public class JpaPerson extends AbstractPerson {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    protected JpaPerson() {}

    @Override
    public long getId() { return this.id };

    public JpaPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}