package co.escuelaing.ieti.dto;

public class TaskDto
{
    private String nameDto, descriptionDto, assignedToDto, dueDateDto, createdDto;
    public TaskStatus statusTaskDto;

    public TaskDto (String nameDto, String descriptionDto, TaskStatus statusTaskDto, String assignedToDto, String dueDateDto, String createdDto)
    {
        this.nameDto = nameDto;
        this.descriptionDto = descriptionDto;
        this.statusTaskDto = statusTaskDto;
        this.assignedToDto = assignedToDto;
        this.dueDateDto = dueDateDto;
        this.createdDto = createdDto;
    }

    public void setNameDto (String nameDto)
    {
        this.nameDto = nameDto;
    }
    public String getNameDto ()
    {
        return nameDto;
    }

    public void setDescriptionDto(String descriptionDto)
    {
        this.descriptionDto = descriptionDto;
    }
    public String getDescriptionDto ()
    {
        return descriptionDto;
    }

    public void setStatusDto (TaskStatus statusTaskDto)
    {
        this.statusTaskDto = statusTaskDto;
    }
    public TaskStatus getStatusDto ()
    {
        return statusTaskDto;
    }

    public void setAssignedToDto (String assignedToDto)
    {
        this.assignedToDto = assignedToDto;
    }
    public String getAssignedToDto ()
    {
        return assignedToDto;
    }

    public void setDueDateDto (String dueDateDto)
    {
        this.dueDateDto = dueDateDto;
    }
    public String getDueDateDto ()
    {
        return dueDateDto;
    }

    public void setCreatedDto (String createdDto)
    {
        this.createdDto = createdDto;
    }
    public String getCreatedDto ()
    {
        return createdDto;
    }
}
