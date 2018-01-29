package com.thmall.service;

import com.thmall.common.ServerResponse;
import com.thmall.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by tianhang on 28/1/18.
 */

public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
