package network.dao.impl;

import network.dao.PostDao;
import network.data.Database;
import network.model.Post;

import java.util.List;

public class PostDaoImpl implements PostDao {
    @Override
    public List<Post> getAllPosts() {
        return Database.getAllPost();
    }
}
