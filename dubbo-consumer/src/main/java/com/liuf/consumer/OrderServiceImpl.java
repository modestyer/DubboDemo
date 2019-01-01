package com.liuf.consumer;

import com.liuf.bean.UserAddress;
import com.liuf.service.OrderService;
import com.liuf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuf
 * @create 2018-12-31 15:14
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;



    @Override
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
