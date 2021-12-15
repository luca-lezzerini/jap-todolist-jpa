package al.polis.todolist.repository;

import al.polis.todolist.model.TodoElement;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoElementRepository extends JpaRepository<TodoElement, Long> {

    List<TodoElement> findByTaskLike(String taskPartialKey);
}
