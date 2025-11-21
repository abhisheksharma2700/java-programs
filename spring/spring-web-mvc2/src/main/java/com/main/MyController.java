package com.main;

import com.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
  // @RequestMapping("/helloPage")
    @GetMapping("/helloPage")
    public ModelAndView openHelloPage(){
        System.out.println("openHelloPage() method executed");
        ModelAndView mav= new ModelAndView();
        mav.setViewName("hello");
        return mav;

    }
    @GetMapping("/aboutUs")
    public String openAboutUs(){
        System.out.println("openAboutUs() method executed");
        return "aboutUs";
    }
    @GetMapping("/form")
    public String openForm(){
        System.out.println("openForm() method executed");
        return "form";
    }
   /* @PostMapping("/submitForm")
    public String handleForm(HttpServletRequest request){
        String myname=request.getParameter("name1");
        String myemail=request.getParameter("email1");
        String myphoneno=request.getParameter("phoneno1");
        System.out.println("Name: "+myname);
        System.out.println("Email Id: "+myemail);
        System.out.println("PhoneNo: "+myphoneno);
        System.out.println("handleForm() method executed");
        return "profile";
    }

    */
    /* for using @RequestParam and Model interface we can also use to handle data


    @PostMapping("/submitForm")
    public String hnadleForm(@RequestParam("name1")String myname,
                             @RequestParam("email1")String myemail,
                             @RequestParam("phoneno1")String myphoneno,
                             Model model
    ){
        System.out.println("Name: "+myname);
        System.out.println("Email-Id: "+myemail);
        System.out.println("Phone-No: "+myphoneno);

        model.addAttribute("model_name" ,myname);
        model.addAttribute("model_email",myemail);
        model.addAttribute("model_phoneno",myphoneno);

      return "profile";
    }

     */
    /* by using @RequestParam , model interface and Bean class
    @PostMapping("/submitForm")
   public String hnadleForm(@RequestParam("name1")String myname,
                            @RequestParam("email1")String myemail,
                            @RequestParam("phoneno1")long myphoneno,
                            Model model
   ){
       System.out.println("Name: "+myname);
       System.out.println("Email-Id: "+myemail);
       System.out.println("Phone-No: "+myphoneno);

       User user= new User();
       user.setName(myname);
       user.setEmail(myemail);
       user.setPhoneno(myphoneno);

       model.addAttribute("model_user" ,user);


       return "profile";
   }

     */
   @PostMapping("/submitForm")
   public String hnadleForm(@ModelAttribute("model_user") User user)
   {
       System.out.println("Name: "+user.getName());
       System.out.println("Email-Id: "+user.getEmail());
       System.out.println("Phone-No: "+user.getPhoneno());
       return "profile";
   }

}
