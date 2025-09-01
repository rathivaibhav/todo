package tech.gurugram.todo.controller;

import org.springframework.web.bind.annotation.*;
import tech.gurugram.todo.models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import tech.gurugram.todo.services.TaskService;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/")
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
    @PostMapping
    public String createTasks(@RequestParam String title) {
        taskService.createTasks(title);
        return "redirect:/";
    }
    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable long id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }
    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable long id) {
        taskService.toggleTask(id);
        return "redirect:/";
    }
}
