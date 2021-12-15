package al.polis.todolist.controller;

import al.polis.todolist.model.TodoElement;
import al.polis.todolist.service.TestService;
import al.polis.todolist.service.TodoListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class TodoListController {

    @Autowired
    TestService testService;
    @Autowired
    TodoListService todoListService;

    @RequestMapping("/test")
    public void test() {
        testService.writeTestData();
    }

    @RequestMapping("/add")
    @ResponseBody
    public List<TodoElement> add(@RequestBody TodoElement elem) {
        return todoListService.add(elem);
    }

    @RequestMapping("/search-for")
    @ResponseBody
    public List<TodoElement> searchFor(@RequestBody TodoElement elem) {
        return todoListService.search(elem);
    }

    @RequestMapping("/remove")
    @ResponseBody
    public List<TodoElement> remove(@RequestBody TodoElement elem) {
        return todoListService.delete(elem);
    }

    @RequestMapping("/get-all")
    @ResponseBody
    public List<TodoElement> getAll() {
        return todoListService.getTodoList();
    }
}
