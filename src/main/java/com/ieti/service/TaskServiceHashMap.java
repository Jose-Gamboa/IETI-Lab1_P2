package com.ieti.service;

import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ieti.entities.Task;

@Service
public class TaskServiceHashMap  implements TaskService{

    private HashMap<String, Task> tsMap = new HashMap<String, Task>();

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task findById(String id) {
        return null;
    }

    @Override
    public List<Task> getAll() {
        return null;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public Task update(Task task, String id) {
        return null;
    }
    
}
