package atf.api;

public interface PersonService {
    public Person save(Person person);
    public Person get(Long id);
    public void delete(Person person);
    public Person findByFirstName(String firstName);
}
