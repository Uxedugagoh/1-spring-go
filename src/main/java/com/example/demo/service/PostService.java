package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> finalList = new ArrayList<>();
        finalList.add(new Post("Убийца плачет"));
        finalList.add(new Post("Но он не смог, поступить иначе"));
        finalList.add(new Post("прольётся ... кроооооооооооооовь"));
        return finalList;
    }
}
