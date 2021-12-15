package al.polis.todolist.service.impl;

import al.polis.todolist.model.TodoElement;
import al.polis.todolist.repository.TodoElementRepository;
import al.polis.todolist.service.TodoListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListServiceImpl implements TodoListService {

    @Autowired
    TodoElementRepository todoElementRepository;

    @Override
    public List<TodoElement> add(TodoElement e) {
        // sets ID to null to ensure insertion
        e.setId(null);
        // save on DB
        todoElementRepository.save(e);
        // return updated DB content
        return getTodoList();
    }

    @Override
    public List<TodoElement> delete(TodoElement e) {
        // delete element
        todoElementRepository.delete(e);
        // return updated DB content
        return getTodoList();
    }

    @Override
    public List<TodoElement> getTodoList() {
        // return updated DB content
        return todoElementRepository.findAll();
    }

}
