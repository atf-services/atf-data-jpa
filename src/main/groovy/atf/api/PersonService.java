package atf.api;

public interface PersonService {
    public AbstractPerson save(AbstractPerson person);
    public AbstractPerson get(Long id);
    public void delete(AbstractPerson person);
    public AbstractPerson findByFirstName(String firstName);
}
