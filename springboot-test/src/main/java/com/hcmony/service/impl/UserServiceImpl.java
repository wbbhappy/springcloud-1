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

@Service()
public class UserServiceImpl implements UserService {

	private static Logger logger = Logger.getLogger(UserService.class);

	@Autowired
	private UserMapper userMapper;

	public User findUser(Integer id) {
		try {
			return userMapper.findById(id);
		}catch (Exception e){
			logger.error("查询用户失败",e);
		}
		return null;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public Integer saveUser(User user) throws Exception{
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
			user.setId(77);
			user.setName("你好");
			Integer num = userMapper.save(user);
			return num;
		}catch(RuntimeException e) {
			logger.error("保存用户失败");
			throw new ExceptionRuntime();
		}catch(Exception e){
			logger.error("保存用户失败");
			throw new Exception();
		}
	}
}
