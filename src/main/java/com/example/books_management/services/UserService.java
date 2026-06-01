package com.example.books_management.services;

import com.example.books_management.commonUtils.CommonResponseBean;
import com.example.books_management.model.User;

public interface UserService {
    public CommonResponseBean createUser(User user);
    public CommonResponseBean getUser(User user);
    public CommonResponseBean getAllUsers();
    public CommonResponseBean patchUserName(Integer id, User user);
}
