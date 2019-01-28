package com.hcmony.service;

import com.hcmony.model.User;

public interface UserService {
	public User findUser(Integer id);
	public Integer saveUser(User user)throws Exception;
}
