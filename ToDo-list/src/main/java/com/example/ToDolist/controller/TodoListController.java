package com.example.ToDolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ToDolist.domain.ProjectRepository;
import com.example.ToDolist.domain.TaskRepository;



@Controller
public class TodoListController {
	@Autowired
    private ProjectRepository pRepository;
	
	@Autowired
    private TaskRepository tRepository;
	
    @RequestMapping(value="/projectlist")
    public String projectList(Model model) {
        model.addAttribute("projects", pRepository.findAll());
        return "Projectlist";
        
    }
    
    @RequestMapping(value="/tasklist/{id}")
    public String taskList(@PathVariable("id") long id, Model model) {
    	model.addAttribute("tasks", tRepository.findAll());
    	return "tasklist";
    }
}
