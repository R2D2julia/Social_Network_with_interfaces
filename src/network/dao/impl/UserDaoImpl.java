package network.dao.impl;

import network.dao.UserDao;
import network.data.Database;
import network.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao{

    @Override
    public List<User> getAllUsers() {
        return Database.getAllUsers();
    }
}
