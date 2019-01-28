package com.hcmony.test;

import com.hcmony.model.User;

public class InvokeTest {

	public static void main(String[] args)throws Exception {
		User user = new User();
		user.setId(1);
		user.setName("张三");

		String sortName = "getId";

		Object id = user.getClass().getMethod(sortName, null).invoke(user,null);
		System.out.println(id.toString());
		Class ss = user.getClass().getMethod(sortName, null).getGenericReturnType().toString().getClass();
		sortName = "setId";
		user.getClass().getMethod(sortName, ss).invoke(user,22);
		System.out.println(user.getId());
	}
}
