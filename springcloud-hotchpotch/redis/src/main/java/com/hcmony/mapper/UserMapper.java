package com.hcmony.mapper;

import com.hcmony.model.User;
import java.util.List;

public interface UserMapper {
	public void save(User user);
	public Integer saves(User user);
	public User findById(Integer id);
	public List<User> findAll();
}
