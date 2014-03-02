package fingertips.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the exams database table.
 * 
 */
@Entity
@Table(name="exams")
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="close_date")
	private Date closeDate;

	@Column(length=45)
	private String description;

	@Column(nullable=false)
	private double duration;

	@Temporal(TemporalType.DATE)
	@Column(name="last_modified")
	private Date lastModified;

	private int marks;

	@Column(nullable=false, length=45)
	private String name;

	@Column(name="negative_marking", precision=10)
	private BigDecimal negativeMarking;

	@Temporal(TemporalType.DATE)
	@Column(name="publish_date")
	private Date publishDate;

	@Column(nullable=false, length=20)
	private String type;

	//bi-directional many-to-one association to ExamStudent
	@OneToMany(mappedBy="exam")
	private List<ExamStudent> examStudents;

	//bi-directional many-to-one association to Chapter
	@ManyToOne
	@JoinColumn(name="chapter_id" , nullable=true)
	private Chapter chapter;

	//bi-directional many-to-one association to Standard
	@ManyToOne
	@JoinColumn(name="standard_id" ,  nullable=true)
	private Standard standard;

	//bi-directional many-to-one association to Subject
	@ManyToOne
	@JoinColumn(name="subject_id" , nullable=true)
	private Subject subject;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_created_by", nullable=false)
	private User createdBy;

	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "exam_section", joinColumns = { @JoinColumn(name = "exam_id") }, inverseJoinColumns = { @JoinColumn(name = "section_id") })
	
	private List<Section> sections;

	public Exam() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDuration() {
		return this.duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public int getMarks() {
		return this.marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getNegativeMarking() {
		return this.negativeMarking;
	}

	public void setNegativeMarking(BigDecimal negativeMarking) {
		this.negativeMarking = negativeMarking;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ExamStudent> getExamStudents() {
		return this.examStudents;
	}

	public void setExamStudents(List<ExamStudent> examStudents) {
		this.examStudents = examStudents;
	}

	
	public Chapter getChapter() {
		return this.chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public Standard getStandard() {
		return this.standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}