/**
 * 
 */
package fingertips.web.vo;

/**
 * @author bipin
 * 
 */
public class Subject {
	private int id;
	private String name;
	private Chapters[] list;
	
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
	 * @return the list
	 */
	public Chapters[] getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(Chapters[] list) {
		this.list = list;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}
}
