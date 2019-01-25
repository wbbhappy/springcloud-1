package com.hcmony.service;

import com.hcmony.model.User;
import java.util.List;

public interface UserService {
	public Integer saveUser(User user)throws Exception;
	public User findUser(Integer id);
	public List<User> findAll();
}
