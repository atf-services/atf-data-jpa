package atf.api;

import java.util.Map;

public interface PersonService {
    public Person create(Map<String, Object> properties);
    public Person save(Person person);
    public Person get(Long id);
    public void delete(Person person);
    public Person findByFirstName(String firstName);
}
