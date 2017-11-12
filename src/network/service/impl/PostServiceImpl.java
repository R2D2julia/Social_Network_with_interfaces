package network.service.impl;

import network.dao.PostDao;
import network.dao.impl.PostDaoImpl;
import network.model.Post;
import network.service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {
    @Override
    public List<Post> getAllPosts() {
        PostDao postDao = new PostDaoImpl();
        return postDao.getAllPosts();
    }
}
