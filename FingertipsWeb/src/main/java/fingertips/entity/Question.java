package fingertips.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;

import fingertips.web.vo.Topic;

/**
 * The persistent class for the questions database table.
 * 
 */
@Entity
@Table(name = "questions")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private int id;

	@Lob
	@Column(name = "question_blob")
	private byte[] questionBlob;

	@Column(length = 45)
	private String status;

	@JoinColumn(name = "subject_id" ,nullable = false)
	private Standard standard;
	
	@JoinColumn(name = "subject_id" ,nullable = false)
	private Subject subject;

	@Column(name = "topic_id" , nullable = false)
	private Topic topic;
	
	public Question() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getQuestionBlob() {
		return this.questionBlob;
	}

	public void setQuestionBlob(byte[] questionBlob) {
		this.questionBlob = questionBlob;
	}

	

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Subject getSubject() {
		return subject;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

}