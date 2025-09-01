package tech.gurugram.todo.services;

import tech.gurugram.todo.models.Task;
import org.springframework.stereotype.Service;
import tech.gurugram.todo.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTasks(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(long id) {
        Task task = taskRepository.findById(id).
                orElseThrow(()-> new IllegalArgumentException("Invalid Task id"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }
}
