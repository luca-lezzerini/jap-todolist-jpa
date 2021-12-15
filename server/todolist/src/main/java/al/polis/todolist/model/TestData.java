package al.polis.todolist.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class TestData implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private LocalDateTime testData;

    public TestData() {
    }

    public TestData(LocalDateTime testData) {
        this.testData = testData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTestData() {
        return testData;
    }

    public void setTestData(LocalDateTime testData) {
        this.testData = testData;
    }

    @Override
    public String toString() {
        return "TestData{" + "id=" + id + ", testData=" + testData + '}';
    }
    
    
    
}
