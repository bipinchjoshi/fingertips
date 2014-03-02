package fingertips.dao;

import fingertips.entity.User;

public interface UserDAO extends BaseDAO<User, Long>{
	User authenticateUser(String emailId, String password);
	User getUserByEmailId(String emailId);
	boolean updateUserStatus(String emailId, String status);

}
