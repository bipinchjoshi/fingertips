package fingertips.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the chapters database table.
 * 
 */
@Entity
@Table(name="chapters")
public class Chapter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=45)
	private String name;

	//bi-directional many-to-one association to Subject
	@ManyToOne
	@JoinColumn(name="subject_id", nullable=false)
	private Subject subject;

	//bi-directional many-to-one association to Exam
	@OneToMany(mappedBy="chapter")
	private List<Exam> exams;

	public Chapter() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<Exam> getExams() {
		return this.exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public Exam addExam(Exam exam) {
		getExams().add(exam);
		exam.setChapter(this);
		return exam;
	}

	public Exam removeExam(Exam exam) {
		getExams().remove(exam);
		exam.setChapter(null);
		return exam;
	}

}