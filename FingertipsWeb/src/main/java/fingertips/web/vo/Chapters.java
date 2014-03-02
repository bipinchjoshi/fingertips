/**
 * 
 */
package fingertips.web.vo;

/**
 * @author bipin
 * 
 */
public class Chapters {
	private int id;
	private String name;
	private String num;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		String[] nameArray = name.split("\\.\\s*");
		char[] newName = nameArray[1].toCharArray();
		newName[0] = Character.toUpperCase(newName[0]);
		return nameArray[0] + ". " + new String(newName);
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}

	/**
	 * @param num
	 *            the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName();
	}
}
