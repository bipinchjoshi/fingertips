/**
 * 
 */
package fingertips.web.vo;

import java.util.List;

/**
 * @author Bipin Joshi
 *
 */
public class Section {
 
	private int id;
	private String name;
	private List<Questions> questions;
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
	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	public List<Questions> getQuestions() {
		return questions;
	}
	
	
}
