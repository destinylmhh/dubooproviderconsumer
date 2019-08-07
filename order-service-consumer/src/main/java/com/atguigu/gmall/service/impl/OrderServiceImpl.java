package com.atguigu.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;

/**
 * 1銆佸皢鏈嶅姟鎻愪緵鑰呮敞鍐屽埌娉ㄥ唽涓績锛堟毚闇叉湇鍔★級
 * 		1锛夈�佸鍏ubbo渚濊禆锛�2.6.2锛塡鎿嶄綔zookeeper鐨勫鎴风(curator)
 * 		2锛夈�侀厤缃湇鍔℃彁渚涜��
 * 
 * 2銆佽鏈嶅姟娑堣垂鑰呭幓娉ㄥ唽涓績璁㈤槄鏈嶅姟鎻愪緵鑰呯殑鏈嶅姟鍦板潃
 * @author lfy
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;

	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("鐢ㄦ埛id锛�"+userId);
		//1銆佹煡璇㈢敤鎴风殑鏀惰揣鍦板潃
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}
	
	

}
