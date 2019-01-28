package com.hcmony.mapper;

import com.hcmony.model.User;

public interface UserMapper {
	public Integer save(User user);
	public User findById(Integer id);
}
