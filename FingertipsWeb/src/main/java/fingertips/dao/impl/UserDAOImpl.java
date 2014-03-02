package fingertips.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;

import fingertips.dao.UserDAO;
import fingertips.entity.User;

@Controller
public class UserDAOImpl extends BaseDAOImpl<User, Long> implements UserDAO {

	@SuppressWarnings("unchecked")
	@Override
	public User authenticateUser(String emailId, String password) {

		Criteria criteria = getCriteria(User.class);
		criteria.add(Restrictions.eq("email", emailId));
		criteria.add(Restrictions.eq("password", password));

		System.out.println("*" + emailId + "*");
		System.out.println("*" + password + "*");

		List<User> userList = criteria.list();
		User user = null;

		if (null != userList && !userList.isEmpty()) {
			user = (User) criteria.list().get(0);
		}
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getUserByEmailId(String emailId) {

		Criteria criteria = getCriteria(User.class);
		criteria.add(Restrictions.eq("email", emailId));

		List<User> userList = criteria.list();

		User user = null;
		if (null != userList && !userList.isEmpty()) {
			user = (User) criteria.list().get(0);
		}
		return user;
	}

	public boolean updateUserStatus(String emailId, String status) {

		try {
			User user = getUserByEmailId(emailId);
			user.setStatus(status);
			saveOrUpdate(user);
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
		return true;

	}

}
