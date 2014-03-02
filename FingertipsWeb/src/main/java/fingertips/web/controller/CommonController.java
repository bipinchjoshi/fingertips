/**
 * 
 */
package fingertips.web.controller;

/**
 * @author Bipin Joshi
 * This controller will have common services.
 */

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fingertips.web.vo.Chapters;
import fingertips.web.vo.Institutes;
import fingertips.web.vo.Standard;
import fingertips.web.vo.Subject;
import fingertips.web.vo.Syllabus;
import fingertips.web.vo.Topic;

@Controller
@RequestMapping("/services/common")
public class CommonController {

	@RequestMapping(value = "/getInstitutes", method = RequestMethod.GET)
	@ResponseBody
	public List<Institutes> getInstitutes() {
		// at the moment returns both registered and un-registered institutes
		// TODO
		return new ArrayList<Institutes>();
	}

	@RequestMapping(value = "/getSyllabus", method = RequestMethod.GET)
	@ResponseBody
	public Syllabus getSyllabus() {
		// TODO
		return new Syllabus();
	}

	@RequestMapping(value = "/getStandards", method = RequestMethod.GET)
	@ResponseBody
	public List<Standard> getStandards() {
		// TODO
		return new ArrayList<Standard>();
	}

	@RequestMapping(value = "/getSubjects", method = RequestMethod.GET)
	@ResponseBody
	public List<Subject> getSubjects(
			@RequestParam(value = "standardId", required = true) String standardId) {
		// TODO
		return new ArrayList<Subject>();
	}

	@RequestMapping(value = "/getChapters", method = RequestMethod.GET)
	@ResponseBody
	public List<Chapters> getChapters(
			@RequestParam(value = "standardId", required = true) String standardId,
			@RequestParam(value = "subjectId", required = true) String subjectId) {
		// TODO
		return new ArrayList<Chapters>();
	}

	@RequestMapping(value = "/getTopics", method = RequestMethod.GET)
	@ResponseBody
	public List<Topic> getTopics(
			@RequestParam(value = "standardId", required = true) String standardId,
			@RequestParam(value = "subjectId", required = true) String subjectId,
			@RequestParam(value = "chapterId", required = true) String chapterId) {
		// TODO
		return new ArrayList<Topic>();
	}

	@RequestMapping(value = "/getAllTopics", method = RequestMethod.GET)
	@ResponseBody
	public List<Topic> getAllTopics(
			@RequestParam(value = "standardId", required = false) String standardId) {
		// TODO
		return new ArrayList<Topic>();
	}
}