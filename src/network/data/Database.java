package network.data;

import network.model.Post;
import network.model.User;

import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<User> getAllUsers() {
        List<User> users = new LinkedList<>();
        User user = new User();
        User user1 = new User();
        user.setName("Alex");
        user1.setName("Bob");
        users.add(user1);
        users.add(user);
        return users;
    }

    public static List<Post> getAllPost() {
        List<Post> posts = new LinkedList<>();
        Post post = new Post();
        post.setTitle("Hello");
        post.setDescription("Hello world.");
        posts.add(post);
        return posts;
    }
}
