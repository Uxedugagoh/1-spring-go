package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts;

    public PostService() {
        this.posts = new ArrayList<>();
        this.posts.add(new Post((long)this.posts.size(), "Убийца плачет", new Date()));
        this.posts.add(new Post((long)this.posts.size(),"Но он не смог ... поступить иначе", new Date()));
        this.posts.add(new Post((long)this.posts.size(),"Прольётся ... кроооооооовь", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        Post post = new Post((long)this.posts.size(), text, new Date());
        posts.add(post);
    }
}
