/**
 * 
 */
package fingertips.web.vo;

/**
 * @author bipin
 * 
 */
public class Group {

	private int id;
	private String name;
	private String userCreatedBy;
	private String status;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the userCreatedBy
	 */
	public String getUserCreatedBy() {
		return userCreatedBy;
	}
	/**
	 * @param userCreatedBy the userCreatedBy to set
	 */
	public void setUserCreatedBy(String userCreatedBy) {
		this.userCreatedBy = userCreatedBy;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	
}
