/**
 * 
 */
package fingertips.web.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Bipin Joshi
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Questions {

	@XmlElement
	private int id;
	
	@XmlElement
	private String question;
	
	@XmlElement
	private List<String> questionImageUrl;
	
	@XmlElement
	private String option1;
	
	@XmlElement
	private String option2;
	
	@XmlElement
	private String option3;
	
	@XmlElement
	private String option4;
	
	@XmlElement
	private int correctOption;
	
	@XmlElement
	private String topicId;
	@XmlElement
	private String topicName;

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
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the questionImageUrl
	 */
	public List<String> getQuestionImageUrl() {
		return questionImageUrl;
	}

	/**
	 * @param questionImageUrl
	 *            the questionImageUrl to set
	 */
	public void setQuestionImageUrl(List<String> questionImageUrl) {
		this.questionImageUrl = questionImageUrl;
	}

	/**
	 * @return the option1
	 */
	public String getOption1() {
		return option1;
	}

	/**
	 * @param option1
	 *            the option1 to set
	 */
	public void setOption1(String option1) {
		this.option1 = option1;
	}

	/**
	 * @return the option2
	 */
	public String getOption2() {
		return option2;
	}

	/**
	 * @param option2
	 *            the option2 to set
	 */
	public void setOption2(String option2) {
		this.option2 = option2;
	}

	/**
	 * @return the option3
	 */
	public String getOption3() {
		return option3;
	}

	/**
	 * @param option3
	 *            the option3 to set
	 */
	public void setOption3(String option3) {
		this.option3 = option3;
	}

	/**
	 * @return the option4
	 */
	public String getOption4() {
		return option4;
	}

	/**
	 * @param option4
	 *            the option4 to set
	 */
	public void setOption4(String option4) {
		this.option4 = option4;
	}

	/**
	 * @return the correctOption
	 */
	public int getCorrectOption() {
		return correctOption;
	}

	/**
	 * @param correctOption
	 *            the correctOption to set
	 */
	public void setCorrectOption(int correctOption) {
		this.correctOption = correctOption;
	}

	

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicName() {
		return topicName;
	}

	/**
	 * @return the topicId
	 */
	public String getTopicId() {
		return topicId;
	}

	/**
	 * @param topicId the topicId to set
	 */
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

}
