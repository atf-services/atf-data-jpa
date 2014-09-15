package atf.jpa

import atf.api.Person
import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
public class JpaPerson implements Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    String firstName;
    String lastName;

    public String toString() {
        "$firstName $lastName with ID=$id"
    }
}
