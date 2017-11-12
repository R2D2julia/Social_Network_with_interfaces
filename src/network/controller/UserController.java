package network.controller;

import network.model.User;
import network.service.UserService;
import network.service.impl.UserServiceImpl;

import java.util.List;

public class UserController {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        List<User> all = userService.getAllUsers();
        for (User user : all) {
            System.out.println(user.getName());
        }
    }
}
