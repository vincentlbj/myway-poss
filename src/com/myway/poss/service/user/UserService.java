package com.myway.poss.service.user;

import java.util.List;

import com.myway.poss.pojo.User;

public interface UserService {
	List<User> getAllUser();

	User getUser(int id);
}
