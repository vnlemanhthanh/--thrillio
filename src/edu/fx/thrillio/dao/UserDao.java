package edu.fx.thrillio.dao;

import edu.fx.thrillio.DataStore;
import edu.fx.thrillio.entities.User;

public class UserDao {
    public User[] getUsers() {
	return DataStore.getUsers();
    }
}
