package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

public class UserServiceImpl2 implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....new...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "鍖椾含甯傛槍骞冲尯瀹忕绉戞妧鍥患鍚堟ゼ3灞�", "1", "鏉庤�佸笀", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "娣卞湷甯傚疂瀹夊尯瑗块儴纭呰胺澶у帵B搴�3灞傦紙娣卞湷鍒嗘牎锛�", "1", "鐜嬭�佸笀", "010-56253825", "N");
		
		return Arrays.asList(address1,address2);
	}

}
