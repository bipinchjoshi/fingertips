/**
 * 
 */
package fingertips.web.vo;

import java.util.Date;
import java.util.List;

/**
 * @author Bipin Joshi
 * 
 */

public class User {

	private int id;
	private String name;
	private String email;
	private Standard standard;
	private List<Institutes> institutes;
	private String password;
	private String contactNo;
	private String regNo;
	private Date doj;
	private Group group;
	private Role role;

	

	/**
	 * @return the standard
	 */
	public Standard getStandard() {
		return standard;
	}

	/**
	 * @param standard the standard to set
	 */
	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	/**
	 * @return the institutes
	 */
	public List<Institutes> getInstitutes() {
		return institutes;
	}

	/**
	 * @param institutes the institutes to set
	 */
	public void setInstitutes(List<Institutes> institutes) {
		this.institutes = institutes;
	}

	/**
	 * @return the group
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(Group group) {
		this.group = group;
	}

	
	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}

	/**
	 * @param contactNo
	 *            the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * @return the regNo
	 */
	public String getRegNo() {
		return regNo;
	}

	/**
	 * @param regNo
	 *            the regNo to set
	 */
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj
	 *            the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	
	

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
	

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
