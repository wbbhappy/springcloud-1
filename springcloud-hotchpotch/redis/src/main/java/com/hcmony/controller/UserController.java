package com.hcmony.controller;

import com.hcmony.model.User;
import com.hcmony.service.UserService;
import com.hcmony.utils.CodeIdEnum;
import com.hcmony.utils.ResponseData;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableAutoConfiguration
@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * http://localhost:8762/user/findUser?id=22
	 * @param id
	 * @return
     */
	@ApiOperation(value = "查询单个")
	@RequestMapping(value = "/findUser",method = RequestMethod.GET)
	public ResponseData findUser(@ApiParam(required = true, name = "id", value = "123456")
									 @RequestParam(required = true, name = "id") Integer id){
		User user = userService.findUser(id);
		return new ResponseData(CodeIdEnum.Success,user);
	}

	/**
	 * http://localhost:8762/user/saveUser
	 * @throws Exception
     */
	@ApiOperation(value = "保存用户")
	@RequestMapping(value = "/saveUser",method = RequestMethod.GET)
	public void saveUser() throws Exception{
		User user = new User();
		userService.saveUser(user);
	}

	/**
	 * http://localhost:8762/user/saveUsers?id=55&name=wbb
	 * @param id
	 * @param name
	 * @throws Exception
     */
	@ApiOperation(value = "保存用户")
	@RequestMapping(value = "/saveUsers",method = RequestMethod.GET)
	public void saveUsers(@ApiParam(required = true, name = "id", value = "123456")
							  @RequestParam(required = true, name = "id") Integer id,
						 @ApiParam(required = true, name = "name", value = "123456")
						 @RequestParam(required = true, name = "name") String name) throws Exception{
		User user = new User();
		user.setId(id);
		user.setName(name);
		Integer num = userService.saveUsers(user);
		if(num!=null && num>0){
			new ResponseData(CodeIdEnum.Success);
		}else {
			new ResponseData(CodeIdEnum.ServerError);
		}
	}

	/**
	 * http://localhost:8762/user/findAll
	 * @return
	 * @throws Exception
     */
	@ApiOperation(value = "查询所有")
	@RequestMapping(value = "/findAll",method = RequestMethod.GET)
	public ResponseData findAll() throws Exception{
		List<User> list= userService.findAll();
		return new ResponseData(CodeIdEnum.Success,list);
	}
}
