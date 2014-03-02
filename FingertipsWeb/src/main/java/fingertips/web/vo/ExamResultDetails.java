/**
 * 
 */
package fingertips.web.vo;

import java.util.List;

/**
 * @author bipin
 * 
 */
public class ExamResultDetails {
	private Exam exams;
	private int studentCirculated;
	private int studentAttempted;
	private int highest;
	private int average;
	private int minimum;

	/**
	 * @return the exams
	 */
	public Exam getExams() {
		return exams;
	}

	/**
	 * @param exams
	 *            the exams to set
	 */
	public void setExams(Exam exams) {
		this.exams = exams;
	}

	/**
	 * @return the studentCirculated
	 */
	public int getStudentCirculated() {
		return studentCirculated;
	}

	/**
	 * @param studentCirculated
	 *            the studentCirculated to set
	 */
	public void setStudentCirculated(int studentCirculated) {
		this.studentCirculated = studentCirculated;
	}

	/**
	 * @return the studentAttempted
	 */
	public int getStudentAttempted() {
		return studentAttempted;
	}

	/**
	 * @param studentAttempted
	 *            the studentAttempted to set
	 */
	public void setStudentAttempted(int studentAttempted) {
		this.studentAttempted = studentAttempted;
	}

	/**
	 * @return the highest
	 */
	public int getHighest() {
		return highest;
	}

	/**
	 * @param highest
	 *            the highest to set
	 */
	public void setHighest(int highest) {
		this.highest = highest;
	}

	/**
	 * @return the average
	 */
	public int getAverage() {
		return average;
	}

	/**
	 * @param average
	 *            the average to set
	 */
	public void setAverage(int average) {
		this.average = average;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * @param minimum
	 *            the minimum to set
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
