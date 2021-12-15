package al.polis.todolist.repository;

import al.polis.todolist.model.TestData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDataRepository
        extends JpaRepository<TestData, Long> {

}
