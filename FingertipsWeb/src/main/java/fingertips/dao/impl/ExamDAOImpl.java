package fingertips.dao.impl;

import org.springframework.stereotype.Controller;

import fingertips.dao.ExamDAO;
import fingertips.entity.Exam;


@Controller
public class ExamDAOImpl extends BaseDAOImpl<Exam, Long> implements ExamDAO{

}
