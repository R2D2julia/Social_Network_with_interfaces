package network.service.impl;

import network.dao.UserDao;
import network.dao.impl.UserDaoImpl;
import network.model.User;
import network.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUsers() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getAllUsers();
    }

}
