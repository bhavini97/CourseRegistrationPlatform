package com.springBoot.EductionSite.Controller;


import com.springBoot.EductionSite.Entity.contact;
import com.springBoot.EductionSite.Entity.courseData;
import com.springBoot.EductionSite.dao.ContactRepo;
import com.springBoot.EductionSite.dao.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/upskill")
public class controller {
    @GetMapping("/")
    public String info(){
        return "introPage";
    }
     private CourseRepository courseRepository;
    private ContactRepo contactRepo;

    @Autowired
    public controller(CourseRepository repository, ContactRepo repo) {

        courseRepository = repository;
        contactRepo = repo;

    }
    @GetMapping("/courseList")
    public String getData(Model model){
        List<courseData> Data = courseRepository.findAll();
        model.addAttribute("oneEmp",Data);
         return "allCourse";
    }

    //to get json view and not html//     @GetMapping("/{id}")
//     @ResponseBody
//    public courseData getData(@PathVariable int id){
//        Optional<courseData> data = courseRepository.findById(id);
//        return data.get();
//     }
    @GetMapping("/contact")
    public String getContact(Model model){
        List<contact> contactList = contactRepo.findAll();
        model.addAttribute("contactList", contactList);
        return "contacts";

    }



}
