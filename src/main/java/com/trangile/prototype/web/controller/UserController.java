package com.trangile.prototype.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;	
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.trangile.prototype.dto.SearchForm;
import com.trangile.prototype.dto.SearchInventoryDto;
import com.trangile.prototype.security.entity.User;
import com.trangile.prototype.security.service.SecurityService;
import com.trangile.prototype.security.service.UserSecurityService;
import com.trangile.prototype.service.UserService;

@CrossOrigin("*")
@Controller
public class UserController {
	
	 	@Autowired
	    private UserService userService;

	    @Autowired
	    private SecurityService securityService;
	    
	    @Autowired
	    private UserSecurityService userSecurityService;

	    @Autowired
	    private UserValidator userValidator;

	@GetMapping("/")
	public String getwelcome(Model model) {
		String indexPage = "";
		if (securityService.isAuthenticated()) {
			indexPage = userSecurityService.getViewByUser();
		}
		String redirect = "redirect:/" + indexPage;
		return redirect;
	}
	
	
	@GetMapping("/welcome")
	public String getwelcomePage(Model model) {
		if (securityService.isAuthenticated()) {
			model.addAttribute("searchForm", new SearchForm());
			Object attribute = model.getAttribute("message");
			model.addAttribute("message", "");
			return "welcome";
		}
		return "/";
	}

	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		if (securityService.isAuthenticated()) {
			return "redirect:/";
		}
		if (error != null)
			model.addAttribute("error", "Your username and password is invalid.");
		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully.");
		return "login";
	}

	
	@PostMapping("/registration")
	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
		userValidator.validate(userForm, bindingResult);
		if (bindingResult.hasErrors()) {
			return "registration";
		}
		userService.save(userForm);
		securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());
		return "redirect:/";
	}
	
	@GetMapping("/registration")
    public String registration(Model model) {
        if (securityService.isAuthenticated()) {
            return "redirect:/";
        }
        model.addAttribute("userForm", new User());
        return "registration";
    }
	
	
//	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_UCB_USER')")
	@GetMapping("/inventory")
	public String inventory(Model model, String error, String logout) {
		if (securityService.isAuthenticated()) {
			SearchInventoryDto dto = new SearchInventoryDto();
			model.addAttribute("ownerSearch", dto);
			return "inventory";
		} else {
			return "redirect:/";
		}
	}


}
