package co.escuelaing.ieti.data;

import co.escuelaing.ieti.dto.TaskStatus;

public class Task
{
    private String idTask, nameTask, descriptionTask, assignedToTask, dueDateTask, createdTask;
    public TaskStatus statusTask;

    public Task(String idTask, String nameTask, String descriptionTask, TaskStatus statusTask, String assignedToTask, String dueDateTask, String createdTask)
    {
        this.idTask = idTask;
        this.nameTask = nameTask;
        this.descriptionTask = descriptionTask;
        this.statusTask = statusTask;
        this.assignedToTask = assignedToTask;
        this.dueDateTask = dueDateTask;
        this.createdTask = createdTask;
    }

    public void setIdTask (String idTask)
    {
        this.idTask = idTask;
    }
    public String getIdTask ()
    {
        return idTask;
    }

    public void setNameTask (String nameTask)
    {
        this.nameTask = nameTask;
    }
    public String getNameTask ()
    {
        return nameTask;
    }

    public void setDescription (String descriptionTask)
    {
        this.descriptionTask = descriptionTask;
    }
    public String getDescriptionTask ()
    {
        return descriptionTask;
    }

    public void setStatusTask (TaskStatus statusTask)
    {
        this.statusTask = statusTask;
    }
    public TaskStatus getStatusTask ()
    {
        return statusTask;
    }

    public void setAssignedToTask (String assignedTo)
    {
        this.assignedToTask = assignedToTask;
    }
    public String getAssignedToTask ()
    {
        return assignedToTask;
    }

    public void setDueDate (String dueDate)
    {
        this.dueDateTask = dueDateTask;
    }
    public String getDueDateTask ()
    {
        return dueDateTask;
    }

    public void setCreatedTask (String createdTask)
    {
        this.createdTask = createdTask;
    }
    public String getCreated ()
    {
        return createdTask;
    }
}
