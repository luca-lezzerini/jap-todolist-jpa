package al.polis.todolist.controller;

import al.polis.todolist.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class TodoListController {

    @Autowired
    TestService testService;

    @RequestMapping("/test")
    public void test() {
        testService.writeTestData();
    }
}
