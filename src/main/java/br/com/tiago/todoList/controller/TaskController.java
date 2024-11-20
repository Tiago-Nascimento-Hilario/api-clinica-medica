package br.com.tiago.todoList.controller;

import br.com.tiago.todoList.modelo.Task;
import br.com.tiago.todoList.servico.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

//    Contrutor
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }


    @PostMapping
    public String criarTasks(@RequestParam String titulo){
        taskService.criarTask(titulo);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deletarTasks(@PathVariable Long id){
        taskService.deletarTask(id);
        return "redirect:/";
    }


    @GetMapping("/{id}/atualiza")
    public String atualizaTasks(@PathVariable Long id){
        taskService.atualizaTasks(id);
        return "redirect:/";
    }

}
