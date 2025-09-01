package tech.gurugram.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.gurugram.todo.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
