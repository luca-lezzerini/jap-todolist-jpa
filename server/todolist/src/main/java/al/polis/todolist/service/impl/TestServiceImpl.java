package al.polis.todolist.service.impl;

import al.polis.todolist.model.TestData;
import al.polis.todolist.repository.TestDataRepository;
import al.polis.todolist.service.TestService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestDataRepository testDataRepository;
    
    @Override
    public void writeTestData() {
        LocalDateTime ld = LocalDateTime.now();
        TestData td = new TestData(ld);
        testDataRepository.save(td);
    }
    
}
