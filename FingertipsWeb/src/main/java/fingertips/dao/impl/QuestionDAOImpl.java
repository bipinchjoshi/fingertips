package fingertips.dao.impl;

import org.springframework.stereotype.Controller;

import fingertips.dao.QuestionDAO;
import fingertips.entity.Question;


@Controller
public class QuestionDAOImpl extends BaseDAOImpl<Question, Long> implements QuestionDAO{

}
