package com.ieti.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ieti.entities.Task;

@Service
public class TaskServiceHashMap  implements TaskService{

    private HashMap<String, Task> tsMap = new HashMap<String, Task>();

    @Override
    public Task create(Task task) {
        tsMap.put(task.getId(), task);
        return task;
    }

    @Override
    public Task findById(String id) {
        if(tsMap.get(id) == null){return null;}
        return tsMap.get(id);
    }

    @Override
    public List<Task> getAll() {
        List<Task> response = new ArrayList<Task>();
        response.addAll(tsMap.values());
        return response;
    }

    @Override
    public boolean deleteById(String id) {
        if(tsMap.get(id) == null){return false;}
        tsMap.remove(id);
        return true;
    }

    @Override
    public Task update(Task task, String id) {
        if (tsMap.get(id) == null){return null;}
        tsMap.replace(id, task);
        return task;
    }
    
}
