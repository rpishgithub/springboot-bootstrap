package tech.rpish.springbootbootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tech.rpish.springbootbootstrap.entity.Student;
import tech.rpish.springbootbootstrap.repository.StudentRepository;

@Controller
@RequestMapping("/jsp")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/student")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("list", studentRepository.findAll());
        return modelAndView;
    }
    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("student", studentRepository.findById(id));
        return modelAndView;
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
        return "redirect:/jsp/student";
    }

    @PostMapping("/save")
    public String save(Student student) {
        studentRepository.saveOrUpdate(student);
        return "redirect:/jsp/student";
    }

    @PostMapping("/update")
    public String update(Student student) {
        studentRepository.saveOrUpdate(student);
        return "redirect:/jsp/student";
    }


}
