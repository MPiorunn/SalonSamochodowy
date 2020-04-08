package com.konrad_janek.SalonSamochodowy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.konrad_janek.SalonSamochodowy.Accounts.Account;

@Controller
public class AdminPanelController {

	@GetMapping("/adminPanel")
	public String adminPanelPage(@ModelAttribute Account account) {
		if(account == null)
			return "login";
		if(account.getLogin().equals("ABCD") && account.getHaslo().equals("qwertyuiop"))
			return "adminPanel";
		return "login";
	}
	
}
