package al.polis.todolist.service;

import al.polis.todolist.model.TodoElement;
import java.util.List;

public interface TodoListService {

    /**
     * Adds an element to database and returns updated list of tasks
     *
     * @param e the element to be added
     * @return the updated list of the tasks
     */
    List<TodoElement> add(TodoElement e);

    /**
     * Deletes and element from DB and returns updated list
     *
     * @param e the element to delete (only primary key is needed)
     * @return the updated list of tasks
     */
    List<TodoElement> delete(TodoElement e);

    /**
     * Returns all the elements of the todolist
     *
     * @return all the elements of the todolist
     */
    List<TodoElement> getTodoList();
}
