/**
 * 
 */
package fingertips.web.controller;

/**
 * @author Bipin Joshi
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import fingertips.service.FingertipsService;
import fingertips.web.vo.Exam;
import fingertips.web.vo.ExamResult;
import fingertips.web.vo.ExamResultDetails;
import fingertips.web.vo.Questions;
import fingertips.web.vo.ResultDetails;

@Controller
@RequestMapping("/services/mcq")
public class McqController {

	@Autowired
	FingertipsService fingertipsService;

	/**
	 * @param fingertipsService
	 *            the fingertipsService to set
	 */
	public void setFingertipsService(FingertipsService fingertipsService) {
		this.fingertipsService = fingertipsService;
	}

	@RequestMapping(value = "/createExam", method = RequestMethod.POST)
	@ResponseBody
	public Exam createExam(
			@RequestParam(value = "examname", required = true) String examName,
			@RequestParam(value = "type", required = true) String examType,
			@RequestParam(value = "sctions", required = false) String[] sections,
			@RequestParam(value = "desc", required = false) String description,
			@RequestParam(value = "duration", required = true) String duration,
			@RequestParam(value = "negMark", required = true) String negativeMarks) {

		return fingertipsService.createExam(examName, examType, sections,
				description, duration, negativeMarks);
	}

	@RequestMapping(value = "/removeSection", method = RequestMethod.GET)
	@ResponseBody
	public boolean removeSection(
			@RequestParam(value = "sectionId", required = true) String sectionId) {

		return fingertipsService.removeSection(sectionId);
	}

	@RequestMapping(value = "/saveQuestion", method = RequestMethod.POST)
	@ResponseBody
	public boolean saveQuestion(
			@RequestParam(value = "examId", required = true) String examId,
			@RequestParam(value = "sectionId", required = false) String sectionId,
			@RequestParam(value = "topicId", required = false) String topicId,
			@RequestParam(value = "topicName", required = false) String topicName,
			@RequestParam(value = "question", required = false) String question,
			@RequestParam(value = "file", required = false) MultipartFile[] questionImages,
			@RequestParam(value = "option1", required = true) String option1,
			@RequestParam(value = "option1", required = true) String option2,
			@RequestParam(value = "option1", required = true) String option3,
			@RequestParam(value = "option1", required = true) String option4,
			@RequestParam(value = "correctOption", required = true) String correctOption) {

		/**
		return fingertipsService.saveQuestion(examId, sectionId, topicId,
				topicName, question, questionImages, option1, option2, option3,
				option4, correctOption);
				*/
				

		return true;
	}

	@RequestMapping(value = "/updateQuestion", method = RequestMethod.PUT)
	@ResponseBody
	public Questions updateQuestion(
			@RequestParam(value = "questionId", required = true) String questionId,
			@RequestParam(value = "topicId", required = false) String topicId,
			@RequestParam(value = "topicName", required = false) String topicName,
			@RequestParam(value = "question", required = false) String question,
			@RequestParam(value = "file", required = false) MultipartFile[] questionImages,
			@RequestParam(value = "option1", required = true) String option1,
			@RequestParam(value = "option1", required = true) String option2,
			@RequestParam(value = "option1", required = true) String option3,
			@RequestParam(value = "option1", required = true) String option4,
			@RequestParam(value = "correctOption", required = true) String correctOption) {

		return fingertipsService.updateQuestion(questionId, topicId, topicName,
				question, questionImages, option1, option2, option3, option4,
				correctOption);
	}

	@RequestMapping(value = "/getQuestions", method = RequestMethod.GET)
	@ResponseBody
	public List<Questions> getQuestions(
			@RequestParam(value = "examId", required = true) String examId,
			@RequestParam(value = "sectionId", required = false) String sectionId,
			@RequestParam(value = "questionNo", required = false) String questionNo) {

		return fingertipsService.getQuestions(examId, sectionId, questionNo);
	}

	@RequestMapping(value = "/getExamResults", method = RequestMethod.GET)
	@ResponseBody
	public List<ExamResultDetails> getExamResults() {

		return fingertipsService.getExamResults();
	}

	@RequestMapping(value = "/getResultDetails", method = RequestMethod.GET)
	@ResponseBody
	public List<ResultDetails> getResultDetails(
			@RequestParam(value = "examId", required = false) String examId) {

		return fingertipsService.getResultDetails(examId);
	}

	@RequestMapping(value = "/getExams", method = RequestMethod.GET)
	@ResponseBody
	public List<Exam> getExamDetails(
			@RequestParam(value = "status", required = false) String examStatus,
			@RequestParam(value = "publishDate", required = false) String publishDate) {

		return fingertipsService.getExamDetails(examStatus, publishDate);
	}

	@RequestMapping(value = "/downloadExam", method = RequestMethod.GET)
	@ResponseBody
	public Exam downloadExam(
			@RequestParam(value = "examId", required = true) String examId) {

		return fingertipsService.downloadExam(examId);
	}

	@RequestMapping(value = "/updateExamdownload", method = RequestMethod.GET)
	@ResponseBody
	public boolean updateExamdownload(
			@RequestParam(value = "examId", required = true) String examId) {

		return fingertipsService.updateExamdownload(examId);
	}

	@RequestMapping(value = "/updateExamResult", method = RequestMethod.POST)
	@ResponseBody
	public boolean updateExamResult(
			@RequestParam(value = "examId", required = true) String examId,
			@RequestParam(value = "emailId", required = true) String emailId,
			@RequestParam(value = "marks", required = true) String marks,
			@RequestBody ExamResult examResult) {

		return fingertipsService.updateExamResult(examId, emailId, marks,
				examResult);
	}
}