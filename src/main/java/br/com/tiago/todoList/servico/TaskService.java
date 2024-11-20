package br.com.tiago.todoList.servico;

import br.com.tiago.todoList.modelo.Task;
import br.com.tiago.todoList.repositorio.TaskRepository;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks(){
        return  taskRepository.findAll();
    }

    public void criarTask(String titulo) {
        Task task = new Task();
        task.setTitulo(titulo);
        task.setStatus(false);
        taskRepository.save(task);
    }

    public  void deletarTask(Long id){
        taskRepository.deleteById(id);
    }

    @SneakyThrows
    public  void atualizaTasks(Long id){
        Task task = taskRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("id inváldo"));
                task.setStatus(!task.isStatus());
                taskRepository.save(task);
    }
}
