package co.escuelaing.ieti.service;

import co.escuelaing.ieti.data.Task;

import java.util.List;

public interface TaskService
{
    Task create(Task task);
    Task findById( String id);
    List<Task> all();
    Boolean deleteById(String id);
    Task update(Task task, String id);
}