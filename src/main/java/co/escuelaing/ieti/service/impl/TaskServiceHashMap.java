package co.escuelaing.ieti.service.impl;

import co.escuelaing.ieti.data.Task;
import co.escuelaing.ieti.service.TaskService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService
{
    private final HashMap<String, Task> taskHM = new HashMap<>();

    @Override
    public Task create (Task task)
    {
        taskHM.put(task.getIdTask(), task);
        return task;
    }

    @Override
    public Task findById (String idTask)
    {
        return taskHM.get(idTask);
    }

    @Override
    public List<Task> all ()
    {
        return new ArrayList<>(taskHM.values());
    }

    @Override
    public Boolean deleteById (String idTask)
    {
        taskHM.remove(idTask);
        return true;
    }

    @Override
    public Task update (Task task, String taskId)
    {
        task.setIdTask(taskId);
        taskHM.put(taskId, task);
        return task;
    }
}
