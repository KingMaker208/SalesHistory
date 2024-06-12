package com.cg.sprint.Sales_History.Security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	WebSecurityConfig s;
	
    @GetMapping("/login")
    public String login() {
        return "login";
    }
//    @GetMapping("/logout")
//    public String logout() {
//    	s.
//    	return "login";
//    }
}

