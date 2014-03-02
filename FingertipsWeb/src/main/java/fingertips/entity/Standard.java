package fingertips.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the standard database table.
 * 
 */
@Entity
@Table(name="standard")
public class Standard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=50)
	private String name;

	//bi-directional many-to-one association to Exam
	@OneToMany(mappedBy="standard")
	private List<Exam> exams;

	//bi-directional many-to-one association to Subject
	@OneToMany(mappedBy="standard")
	private List<Subject> subjects;

	public Standard() {
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

	public List<Exam> getExams() {
		return this.exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public Exam addExam(Exam exam) {
		getExams().add(exam);
		exam.setStandard(this);

		return exam;
	}

	public Exam removeExam(Exam exam) {
		getExams().remove(exam);
		exam.setStandard(null);

		return exam;
	}

	public List<Subject> getSubjects() {
		return this.subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Subject addSubject(Subject subject) {
		getSubjects().add(subject);
		subject.setStandard(this);

		return subject;
	}

	public Subject removeSubject(Subject subject) {
		getSubjects().remove(subject);
		subject.setStandard(null);

		return subject;
	}

}