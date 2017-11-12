package network.controller;

import network.model.Post;
import network.service.PostService;
import network.service.impl.PostServiceImpl;

import java.util.List;

public class PostController {

    public static void main(String[] args) {
        PostService postService = new PostServiceImpl();
        List<Post> all =postService.getAllPosts();
        for (Post post : all) {
            System.out.println(post);
        }
    }
}
