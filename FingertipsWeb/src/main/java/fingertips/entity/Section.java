package fingertips.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the sections database table.
 * 
 */
@Entity
@Table(name = "sections")
public class Section implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "section_id", unique = true, nullable = false)
	private long id;

	@Column(nullable = false, length = 45)
	private String name;

	@OneToMany(targetEntity = Question.class, cascade = CascadeType.REFRESH)
	@JoinTable(name = "section_question", joinColumns = { @JoinColumn(name = "section_id") }, inverseJoinColumns = { @JoinColumn(name = "question_id") })
	private List<Question> questions;

	public Section() {
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

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}