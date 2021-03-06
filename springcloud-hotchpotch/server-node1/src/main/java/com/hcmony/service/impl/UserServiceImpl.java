package com.hcmony.service.impl;

import com.hcmony.mapper.UserMapper;
import com.hcmony.model.User;
import com.hcmony.service.UserService;
import com.hcmony.utils.ExceptionRuntime;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	private static Logger logger = Logger.getLogger(UserService.class);

	@Autowired
	private UserMapper userMapper;

	@Transactional(propagation = Propagation.NESTED)
	public void saveUser(){
		try {
			User user = new User();
			user.setId(88);
			user.setName("成功的");
			userMapper.save(user);
		}catch (ExceptionRuntime e){
			logger.error("保存用户失败");
			throw new ExceptionRuntime();
		}
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public Integer saveUsers(User user) throws Exception{
		try {
			logger.info("保存用户:" + user.getName());
			/*new Thread(new Runnable()  {
				public void run() {
					try {
						userImpl.saveUser(user);
					}catch (Exception e){

					}
				}
			}).start();*/
			Integer num = userMapper.saves(user);
			return num;
		}catch(RuntimeException e) {
			logger.error("保存用户失败");
			throw new ExceptionRuntime();
		}catch(Exception e){
			logger.error("保存用户失败");
			throw new Exception();
		}
	}

	public User findUser(Integer id) {
		try {
			return userMapper.findById(id);
		}catch (Exception e){
			logger.error("查询用户失败",e);
		}
		return null;
	}

	public List<User> findAll(){
		try {
			return  userMapper.findAll();
		}catch (Exception e){
			logger.error("查询所有用户失败",e);
		}
		return  null;
	}
}
