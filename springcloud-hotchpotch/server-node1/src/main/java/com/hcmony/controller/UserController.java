package com.hcmony.controller;

import com.hcmony.model.User;
import com.hcmony.service.UserService;
import com.hcmony.utils.CodeIdEnum;
import com.hcmony.utils.ResponseData;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
	 * http://localhost:8763/user/findUser?id=30
	 * @param id
	 * @return
     */
	@ApiOperation(value = "查询单个", notes = "")
	@RequestMapping(value = "/findUser",method = RequestMethod.GET)
	public ResponseData findUser(@ApiParam(required = true, name = "id", value = "123456")
									 @RequestParam(required = true, name = "id") Integer id){
		User user = userService.findUser(id);
		System.out.println("user的id是：" + user.getId());
		System.out.println("user的名字是：" + user.getName());
		return new ResponseData(CodeIdEnum.Success,user);
	}

	/**
	 * http://localhost:8763/user/saveUser
	 * @throws Exception
     */
	@ApiOperation(value = "保存用户", notes = "")
	@ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "id", required = true, paramType = "", dataType = "int"),
			@ApiImplicitParam(name = "name", value = "name", required = true, paramType = "", dataType = "String") })
	@RequestMapping(value = "/saveUser",method = RequestMethod.GET)
	public void saveUser() throws Exception{
		userService.saveUser();
	}

	/**
	 * http://localhost:8763/user/saveUsers?id=100&name=赵四
	 * @param user
	 * @throws Exception
     */
	@ApiOperation(value = "保存用户", notes = "")
	@ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "id", required = true, paramType = "", dataType = "int"),
						@ApiImplicitParam(name = "name", value = "name", required = true, paramType = "", dataType = "String") })
	@RequestMapping(value = "/saveUsers",method = RequestMethod.GET)
	public void saveUsers(User user) throws Exception{
		Integer num = userService.saveUsers(user);
		if(num!=null && num>0){
			System.out.println("保存成功了！");
		}else {
			System.out.println("保存失败了！");
		}
	}

	/**
	 * http://localhost:8763/user/findAll
	 * @return
	 * @throws Exception
     */
	@ApiOperation(value = "查询所有", notes = "")
	@RequestMapping(value = "/findAll",method = RequestMethod.GET)
	public ResponseData findAll() throws Exception{
		System.out.println("-----------------");
		List<User> list= userService.findAll();
		return new ResponseData(CodeIdEnum.Success,list);
	}
}
