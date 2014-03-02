/**
 * 
 */
package fingertips.web.controller;

/**
 * @author Bipin Joshi
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fingertips.service.FingertipsService;

@Controller
public class MvcController {

	@Autowired
	FingertipsService fingertipsService;
	
	@RequestMapping("/login")
	public String showLogin() {
		//fingertipsService.login(userName, password);
		return "login";
	}

	@RequestMapping("/author")
	public String showAuthor() {
		// TODO: check if user is logged in
		return "author";
	}

	@RequestMapping("/mcqgen")
	public String showMcqGen() {
		// TODO : check if user logged in
		return "exam";
	}

	@RequestMapping("/review")
	public String showReview() {
		// TODO : check if user logged in
		return "review";
	}

}