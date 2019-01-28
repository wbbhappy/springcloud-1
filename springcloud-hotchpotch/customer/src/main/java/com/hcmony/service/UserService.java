package com.hcmony.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "springcloud-server")
public interface UserService {
	/*public Integer saveUser(User user)throws Exception;
	public User findUser(Integer id);
	public List<User> findAll();*/
}
