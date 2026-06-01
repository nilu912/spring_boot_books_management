package com.example.books_management.serviceImpl;

import com.example.books_management.commonUtils.CommonResponseBean;
import com.example.books_management.commonUtils.NullAndEmpty;
import com.example.books_management.datasource.Data;
import com.example.books_management.model.User;
import com.example.books_management.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public CommonResponseBean createUser(User user) {
        try {
            if (NullAndEmpty.isNullAndEmpty(user.getName()))
                return new CommonResponseBean(false, 404, "parameter is missing!", null);
            User newUser = new User();
            Integer uid = Data.uid++;
            newUser.setUid(uid);
            newUser.setName(user.getName());
            Data.users.put(uid, newUser);
            return new CommonResponseBean(true, 200, "New user created successfully!", null);
        } catch (Exception e) {
            System.out.println(" "+ e);
        }
        return new CommonResponseBean(false, 500, "", null);
    }

    public CommonResponseBean getUser(User user) {
        try {
            System.out.println(Data.uid);
            if(NullAndEmpty.isNullAndEmpty(user.getUid())) {
                return new CommonResponseBean(false, 404, "parameter is missing!", null);
            }
            User fetchedUser = Data.users.get(user.getUid());
            if(NullAndEmpty.isNullAndEmpty(fetchedUser)) {
                return new CommonResponseBean(false, 404, "user not found!", null);
            } else {
                return new CommonResponseBean(false, 404, "", fetchedUser);
            }
        } catch(Exception e) {
            System.out.println(" "+ e);
        }
        return new CommonResponseBean(false, 500, "", null);
    }

    public CommonResponseBean getAllUsers() {
        try {
            Collection<User> users = Data.users.values();
            return new CommonResponseBean(!users.isEmpty(), users.isEmpty() ? 404 : 200, users.isEmpty() ? "No users found!" : "", users);
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return new CommonResponseBean(false, 500, "internal server error!", null);
    }

    public CommonResponseBean patchUserName(Integer id, User user) {
        try {
            if(NullAndEmpty.isNullAndEmpty(id) || NullAndEmpty.isNullAndEmpty(user.getName()))
                return new CommonResponseBean(false, 404, "parameter is missing!", null);
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return new CommonResponseBean(false, 500, "internal server error!", null);
    }
}
