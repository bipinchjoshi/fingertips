/**
 * 
 */
package fingertips.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import fingertips.web.vo.Exam;
import fingertips.web.vo.ExamResult;
import fingertips.web.vo.ExamResultDetails;
import fingertips.web.vo.Questions;
import fingertips.web.vo.ResultDetails;

/**
 * @author Bipin Joshi
 * 
 */

public interface FingertipsService {

	public fingertips.entity.User registerUser(String name, String instituteId,
			String standard, String registrationId, String emailId,
			String password);

	public boolean login(String userName, String password);

	public boolean isValidUser(String userName);

	public boolean resetPassword(String emailId);

	public Exam createExam(String examName, String examType, String[] sections,
			String description, String duration, String negativeMarks);

	public boolean removeSection(String sectionId);

	public boolean saveQuestion(long examId, long standardId ,long sectionId,
			long subjectId, long topicId, String questionXML);

	public Questions updateQuestion(String questionId, String topicId,
			String topicName, String question, MultipartFile[] questionImages,
			String option1, String option2, String option3, String option4,
			String correctOption);

	public List<Questions> getQuestions(String examId, String sectionId,
			String questionNo);

	public List<ExamResultDetails> getExamResults();

	public List<ResultDetails> getResultDetails(String examId);

	public List<Exam> getExamDetails(String examStatus, String publishDate);

	public Exam downloadExam(String examId);

	public boolean updateExamdownload(String examId);

	public boolean updateExamResult(String examId, String emailId,
			String marks, ExamResult examResult);

	boolean updateUserStatus(String emailId, String status);
}
