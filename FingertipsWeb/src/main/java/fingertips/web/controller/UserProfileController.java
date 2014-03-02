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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import fingertips.service.FingertipsService;

@Controller
@RequestMapping("/services/profile")
public class UserProfileController {

	@Autowired
	FingertipsService fingertipsService;
	/**
	 * @param fingertipsService the fingertipsService to set
	 */
	public void setFingertipsService(FingertipsService fingertipsService) {
		this.fingertipsService = fingertipsService;
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.GET)
	@ResponseBody
	public fingertips.entity.User registerUser(
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "instituteId", required = false) String instituteId,
			@RequestParam(value = "standardId", required = false) String standardId,
			@RequestParam(value = "emailId", required = true) String emailId,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "regId", required = false) String regId)		{

		return fingertipsService.registerUser(name, instituteId, standardId, regId,
				emailId, password);
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET )
	@ResponseBody
	public boolean login(
			@RequestParam(value = "username", required = false) String userName,
			@RequestParam(value = "password", required = false) String password) {

		return fingertipsService.login(userName, password);
	}

	@RequestMapping(value = "/validateUser", method = RequestMethod.GET)
	@ResponseBody
	public boolean isValidUser(
			@RequestParam(value = "username", required = true) String userName) {

		return fingertipsService.isValidUser(userName);
	}

	@RequestMapping(value = "/resetPassword", method = RequestMethod.GET)
	@ResponseBody
	public boolean resetPassword(
			@RequestParam(value = "emailId", required = true) String emailId) {

		return fingertipsService.resetPassword(emailId);
	}

	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	@ResponseBody
	public boolean updateUserStatus(
			@RequestParam(value = "emailId", required = true) String emailId) {
		return fingertipsService.updateUserStatus(emailId , "active");
	}
}