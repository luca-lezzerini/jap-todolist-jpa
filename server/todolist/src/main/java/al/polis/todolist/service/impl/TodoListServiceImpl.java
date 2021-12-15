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
        e.setId(null);
        todoElementRepository.save(e);
        return getTodoList();
    }

    @Override
    public List<TodoElement> delete(TodoElement e) {
        todoElementRepository.delete(e);
        return getTodoList();
    }

    @Override
    public List<TodoElement> getTodoList() {
        return todoElementRepository.findAll();
    }

}
