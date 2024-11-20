package br.com.tiago.todoList.repositorio;

import br.com.tiago.todoList.modelo.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
