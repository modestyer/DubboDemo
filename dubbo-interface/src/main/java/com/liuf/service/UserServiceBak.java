package com.liuf.service;

import com.liuf.bean.UserAddress;

import java.util.List;


/**
 * 用户服务
 * @author lfy
 *
 */
public interface UserServiceBak {
	
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId,String addressName);

}
