package com.hcmony.service;

import com.hcmony.model.User;
import java.util.List;

public interface UserService {
	public List<User> findAll();
	public User findUser(Integer id);
	public void saveUser(User user)throws Exception;
	public Integer saveUsers(User user)throws Exception;
}
