/**
 * 
 */
package fingertips.web.vo;

/**
 * @author bipin
 *
 */
public class Standard {
	
	private int id;
	private String name;
	private Subject[] list;

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
	 * @return the list
	 */
	public Subject[] getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(Subject[] list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}
	
	
	
}
