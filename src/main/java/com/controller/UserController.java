package com.controller;
import java.util.List;    
import org.springframework.beans.factory.*;    
import org.springframework.core.io.*;  
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bean.User;    
import com.dao.UserDao;
@Controller
public class UserController {
	@Autowired    
    UserDao dao;
//	private JavaMailSender mailSender;
	
	@RequestMapping("/addDetails")    
    public String showform(Model m){    
        m.addAttribute("command", new User());  
        return "addDetails";   
    }    
	@RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("user") User user){  
        dao.save(user);    
        return "redirect:/final";    
    }    
	@RequestMapping("/final")
	public String showform1(Model m){    
        m.addAttribute("command", new User());  
        return "final";   
    }    
}
