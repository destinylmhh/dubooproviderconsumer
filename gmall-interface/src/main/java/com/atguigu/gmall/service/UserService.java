package com.atguigu.gmall.service;

import java.util.List;

import com.atguigu.gmall.bean.UserAddress;

/**
 * 用户服务
 * @author lfy
 *
 */
public interface UserService {
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);

}
