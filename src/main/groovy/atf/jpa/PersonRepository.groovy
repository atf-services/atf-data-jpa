package atf.jpa

import org.springframework.data.repository.CrudRepository

public interface PersonRepository extends CrudRepository<JpaPerson, Long> {}