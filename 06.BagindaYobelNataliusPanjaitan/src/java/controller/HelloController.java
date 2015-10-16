/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;

/**
 *
 * @author LabGSG
 */
public class HelloController extends SimpleFormController {
    private HelloService helloService;
    
    public void setHelloService(HelloService helloService){
        this.helloService=helloService;
    }
    public HelloController() {
        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
        //Initialize controller properties here or 
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
    }


    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
     @Override
     protected ModelAndView onSubmit(
        HttpServletRequest request, 
        HttpServletResponse response, 
        Object command, 
        BindException errors) throws Exception {
         
     Name nama=(Name)command;  
     Name nim=(Name)command;
     Name kelas=(Name)command;
     Name judul=(Name)command;
     
     ModelAndView mv = new ModelAndView(getSuccessView());
     mv.addObject("helloMessage",helloService.sayHello(nama.getNama(),nim.getNim(),kelas.getKelas(),judul.getJudul()));
     return mv;
     }
     
}