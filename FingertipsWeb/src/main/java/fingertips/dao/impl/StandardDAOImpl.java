package fingertips.dao.impl;

import org.springframework.stereotype.Controller;

import fingertips.dao.StandardDAO;
import fingertips.dao.UserDAO;
import fingertips.entity.Standard;
import fingertips.entity.User;


@Controller
public class StandardDAOImpl extends BaseDAOImpl<Standard, Long> implements StandardDAO{

}
