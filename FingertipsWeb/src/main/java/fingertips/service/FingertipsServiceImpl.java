/**
 * 
 */
package fingertips.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import fingertips.dao.ExamDAO;
import fingertips.dao.InstituteDAO;
import fingertips.dao.QuestionDAO;
import fingertips.dao.SectionDAO;
import fingertips.dao.StandardDAO;
import fingertips.dao.SubjectDAO;
import fingertips.dao.TopicDAO;
import fingertips.dao.UserDAO;
import fingertips.entity.Institute;
import fingertips.entity.Question;
import fingertips.entity.Standard;
import fingertips.entity.Subject;
import fingertips.web.vo.Exam;
import fingertips.web.vo.ExamResult;
import fingertips.web.vo.ExamResultDetails;
import fingertips.web.vo.Questions;
import fingertips.web.vo.ResultDetails;
import fingertips.web.vo.Topic;

@Service
public class FingertipsServiceImpl implements FingertipsService {

	@Autowired
	UserDAO userDAO;

	@Autowired
	StandardDAO standardDAO;

	@Autowired
	SubjectDAO subjectDAO;

	@Autowired
	TopicDAO topicDAO;

	@Autowired
	InstituteDAO instituteDAO;

	@Autowired
	ExamDAO examDAO;

	@Autowired
	SectionDAO sectionDAO;

	@Autowired
	QuestionDAO questionDAO;

	public fingertips.entity.User registerUser(String name, String instituteId,
			String standardId, String registrationId, String emailId,
			String password) {

		fingertips.entity.User user = new fingertips.entity.User();

		user.setName(name);
		user.setDateOfJoining(new Date());

		Standard standard = standardDAO.findByID(Standard.class,
				Long.parseLong(standardId));

		Institute institute = instituteDAO.findByID(Institute.class,
				Long.parseLong(instituteId));

		List<Institute> instituteList = new ArrayList<Institute>();
		instituteList.add(institute);

		user.setEmailid(emailId);
		user.setStadard(standard);
		user.setRegistrationId(registrationId);
		user.setPassword(password);
		user.setInstitutes(instituteList);

		userDAO.save(user);

		return user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fingertips.service.FingertipsService#login(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean login(String userName, String password) {

		fingertips.entity.User user = userDAO.authenticateUser(userName,
				password);

		if (user != null) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fingertips.service.FingertipsService#isValidUser(java.lang.String)
	 */
	@Override
	public boolean isValidUser(String userName) {

		fingertips.entity.User user = userDAO.getUserByEmailId(userName);

		if (user != null) {
			return true;
		}
		return false;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fingertips.service.FingertipsService#resetPassword(java.lang.String)
	 */
	@Override
	public boolean resetPassword(String emailId) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fingertips.service.FingertipsService#updateUserStatus(java.lang.String)
	 */
	@Override
	public boolean updateUserStatus(String emailId, String status) {

		return userDAO.updateUserStatus(emailId, status);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fingertips.service.FingertipsService#createExam(java.lang.String,
	 * java.lang.String, java.lang.String[], java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public Exam createExam(String examName, String examType, String[] sections,
			String description, String duration, String negativeMarks) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fingertips.service.FingertipsService#removeSection(java.lang.String)
	 */
	@Override
	public boolean removeSection(String sectionId) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fingertips.service.FingertipsService#saveQuestion(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * org.springframework.web.multipart.MultipartFile[], java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */

	@Override
	public boolean saveQuestion(long examId, long standardId, long sectionId,
			long subjectId, long topicId, String questionXML) {

		Question question = new Question();

		question.setQuestionBlob(questionXML.getBytes());

		Standard standard = standardDAO.findByID(Standard.class, standardId);

		question.setStandard(standard);

		Subject subject = subjectDAO.findByID(Subject.class, subjectId);

		Topic topic = topicDAO.findByID(Topic.class, topicId);

		question.setSubject(subject);
		question.setTopic(topic);

		question.setStatus("Active");
		questionDAO.save(question);

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fingertips.service.FingertipsService#updateQuestion(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String,
	 * org.springframework.web.multipart.MultipartFile[], java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Questions updateQuestion(String questionId, String topicId,
			String topicName, String question, MultipartFile[] questionImages,
			String option1, String option2, String option3, String option4,
			String correctOption) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fingertips.service.FingertipsService#getQuestions(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<Questions> getQuestions(String examId, String sectionId,
			String questionNo) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fingertips.service.FingertipsService#getExamResults()
	 */
	@Override
	public List<ExamResultDetails> getExamResults() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fingertips.service.FingertipsService#getResultDetails(java.lang.String)
	 */
	@Override
	public List<ResultDetails> getResultDetails(String examId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fingertips.service.FingertipsService#getExamDetails(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public List<Exam> getExamDetails(String examStatus, String publishDate) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fingertips.service.FingertipsService#downloadExam(java.lang.String)
	 */
	@Override
	public Exam downloadExam(String examId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fingertips.service.FingertipsService#updateExamdownload(java.lang.String)
	 */
	@Override
	public boolean updateExamdownload(String examId) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fingertips.service.FingertipsService#updateExamResult(java.lang.String,
	 * java.lang.String, java.lang.String, fingertips.web.vo.ExamResult)
	 */
	@Override
	public boolean updateExamResult(String examId, String emailId,
			String marks, ExamResult examResult) {
		// TODO Auto-generated method stub
		return false;
	}

}
