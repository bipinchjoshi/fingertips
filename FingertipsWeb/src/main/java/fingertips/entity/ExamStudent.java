package fingertips.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the exam_student database table.
 * 
 */
@Entity
@Table(name="exam_student")
public class ExamStudent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=45)
	private String attempted;

	@Column(length=45)
	private String downloaded;

	private double marks;

	@Column(name="result_details", length=100)
	private String resultDetails;

	//bi-directional many-to-one association to Exam
	@ManyToOne
	@JoinColumn(name="exam_id", nullable=false)
	private Exam exam;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID", nullable=false)
	private User user;

	public ExamStudent() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAttempted() {
		return this.attempted;
	}

	public void setAttempted(String attempted) {
		this.attempted = attempted;
	}

	public String getDownloaded() {
		return this.downloaded;
	}

	public void setDownloaded(String downloaded) {
		this.downloaded = downloaded;
	}

	public double getMarks() {
		return this.marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getResultDetails() {
		return this.resultDetails;
	}

	public void setResultDetails(String resultDetails) {
		this.resultDetails = resultDetails;
	}

	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}