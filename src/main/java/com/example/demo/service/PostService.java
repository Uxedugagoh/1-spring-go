package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts;

    public PostService(List<Post> posts) {
        this.posts = posts;
        this.posts.add(new Post("Убийца плачет", new Date()));
        this.posts.add(new Post("Но он не смог ... поступить иначе", new Date()));
        this.posts.add(new Post("Прольётся ... кроооооооовь", new Date()));
        this.posts.forEach(p -> p.setLikes(0));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        Post post = new Post(text, new Date());
        post.setLikes(0);
        posts.add(post);
    }
}
