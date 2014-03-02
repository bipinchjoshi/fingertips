package fingertips.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the subject database table.
 * 
 */
@Entity
@Table(name="subject")
public class Subject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(nullable=false, length=45)
	private String name;

	//bi-directional many-to-one association to Chapter
	@OneToMany(mappedBy="subject")
	private List<Chapter> chapters;

	//bi-directional many-to-one association to Exam
	@OneToMany(mappedBy="subject")
	private List<Exam> exams;

	//bi-directional many-to-one association to Standard
	@ManyToOne
	@JoinColumn(name="standard_id", nullable=false)
	private Standard standard;

	public Subject() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Chapter> getChapters() {
		return this.chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public Chapter addChapter(Chapter chapter) {
		getChapters().add(chapter);
		chapter.setSubject(this);

		return chapter;
	}

	public Chapter removeChapter(Chapter chapter) {
		getChapters().remove(chapter);
		chapter.setSubject(null);

		return chapter;
	}

	public List<Exam> getExams() {
		return this.exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public Exam addExam(Exam exam) {
		getExams().add(exam);
		exam.setSubject(this);

		return exam;
	}

	public Exam removeExam(Exam exam) {
		getExams().remove(exam);
		exam.setSubject(null);

		return exam;
	}

	public Standard getStandard() {
		return this.standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

}