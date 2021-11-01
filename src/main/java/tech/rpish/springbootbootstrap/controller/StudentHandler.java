package tech.rpish.springbootbootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
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
        modelAndView.addObject("list",studentRepository.findAll());
        return modelAndView;
    }
}
