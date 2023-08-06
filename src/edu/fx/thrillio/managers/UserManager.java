package edu.fx.thrillio.managers;

import edu.fx.thrillio.dao.UserDao;
import edu.fx.thrillio.entities.User;

public class UserManager {
	static private UserManager instance =  new UserManager();
	UserDao dao = new UserDao();
	private UserManager() {}

	static public UserManager getInstance() {
		return instance;
	}
	
	public User createUser( long id,
			 String email,
			 String password,
			 String firstName,
			 String lastName,
			 int gender,
			 String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		return user;
	}
}
