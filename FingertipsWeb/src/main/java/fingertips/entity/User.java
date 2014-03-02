package fingertips.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="contact_number", nullable=false, length=20)
	private String contactNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_joining", nullable=false)
	private Date dateOfJoining;

	@Column( name="email_id",nullable=false, length=50 , unique = true)
	private String emailid;

	@Column(nullable=false, length=50)
	private String name;

	@Column(nullable=true, length=50)
	private String password;

	@Column(name="registration_id", nullable=true ,length=45)
	private String registrationId;

	@Column(nullable=false, length=45)
	private String status;
	
	@JoinColumn(name="standard_id" ,nullable=false)
	@OneToOne
	private Standard standard;
	

	//bi-directional many-to-one association to ExamStudent
	@OneToMany(mappedBy="user")
	private List<ExamStudent> examStudents;

	//bi-directional many-to-one association to Exam
	@OneToMany(mappedBy="user")
	private List<Exam> exams;

	//bi-directional many-to-many association to Role
	@ManyToMany(mappedBy="users")
	private List<Role> roles;

	//bi-directional many-to-many association to Group
	@ManyToMany
	@JoinTable(
		name="user_group"
		, joinColumns={
			@JoinColumn(name="user_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="group_id", nullable=false)
			}
		)
	private List<Group> groups;

	//bi-directional many-to-many association to Institute
	@ManyToMany
	@JoinTable(
		name="user_institute"
		, joinColumns={
			@JoinColumn(name="user_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="institute_id", nullable=false)
			}
		)
	private List<Institute> institutes;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ExamStudent> getExamStudents() {
		return this.examStudents;
	}

	public void setExamStudents(List<ExamStudent> examStudents) {
		this.examStudents = examStudents;
	}

	public ExamStudent addExamStudent(ExamStudent examStudent) {
		getExamStudents().add(examStudent);
		examStudent.setUser(this);

		return examStudent;
	}

	public ExamStudent removeExamStudent(ExamStudent examStudent) {
		getExamStudents().remove(examStudent);
		examStudent.setUser(null);

		return examStudent;
	}

	public List<Exam> getExams() {
		return this.exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	
	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<Institute> getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(List<Institute> institutes) {
		this.institutes = institutes;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @return the dateOfJoining
	 */
	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * @return the registrationId
	 */
	public String getRegistrationId() {
		return registrationId;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @param dateOfJoining the dateOfJoining to set
	 */
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	/**
	 * @param registrationId the registrationId to set
	 */
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	/**
	 * @return the stadard
	 */
	public Standard getStadard() {
		return standard;
	}

	/**
	 * @param stadard the stadard to set
	 */
	public void setStadard(Standard stadard) {
		this.standard = stadard;
	}

}