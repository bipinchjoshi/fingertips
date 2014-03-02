package fingertips.dao.impl;

import org.springframework.stereotype.Controller;

import fingertips.dao.TopicDAO;
import fingertips.web.vo.Topic;


@Controller
public class TopicDAOImpl extends BaseDAOImpl<Topic, Long> implements TopicDAO{

}
