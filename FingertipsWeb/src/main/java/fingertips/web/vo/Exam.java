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
public class Exam {

	private String examId;
	private String examName;
	private String type;
	private List<Section> sections;
	private String description;
	private int duration;
	private float negativeMarks;
	private Standard standard;
	private Subject subject;
	private Chapters chapter;
	private Date lastModified;
	private Date publishStartDate;
	private Date publishEndDate;
	private int totalMarks;
	private String status;
	

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
	 * @return the subject
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * @return the chapter
	 */
	public Chapters getChapter() {
		return chapter;
	}

	/**
	 * @param chapter the chapter to set
	 */
	public void setChapter(Chapters chapter) {
		this.chapter = chapter;
	}

	/**
	 * @return the examId
	 */
	public String getExamId() {
		return examId;
	}

	/**
	 * @param examId the examId to set
	 */
	public void setExamId(String examId) {
		this.examId = examId;
	}

	/**
	 * @return the publishStartDate
	 */
	public Date getPublishStartDate() {
		return publishStartDate;
	}

	/**
	 * @param publishStartDate the publishStartDate to set
	 */
	public void setPublishStartDate(Date publishStartDate) {
		this.publishStartDate = publishStartDate;
	}

	/**
	 * @return the publishEndDate
	 */
	public Date getPublishEndDate() {
		return publishEndDate;
	}

	/**
	 * @param publishEndDate the publishEndDate to set
	 */
	public void setPublishEndDate(Date publishEndDate) {
		this.publishEndDate = publishEndDate;
	}

	/**
	 * @return the totalMarks
	 */
	public int getTotalMarks() {
		return totalMarks;
	}

	/**
	 * @param totalMarks the totalMarks to set
	 */
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
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

	/**
	 * @return the examName
	 */
	public String getExamName() {
		return examName;
	}

	/**
	 * @param examName
	 *            the examName to set
	 */
	public void setExamName(String examName) {
		this.examName = examName;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the sections
	 */
	public List<Section> getSections() {
		return sections;
	}

	/**
	 * @param sections
	 *            the sections to set
	 */
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @return the negativeMarks
	 */
	public float getNegativeMarks() {
		return negativeMarks;
	}

	/**
	 * @param negativeMarks
	 *            the negativeMarks to set
	 */
	public void setNegativeMarks(float negativeMarks) {
		this.negativeMarks = negativeMarks;
	}

	
	
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setId(String id) {
		this.examId = id;
	}

	public String getId() {
		return examId;
	}

}
