package com.hcmony.service;

import com.hcmony.model.User;

public interface UserService1 {
	public Integer saveUser(User user)throws Exception;
	public User findUser(Integer id);
}
