package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> finalList = new ArrayList<>();
        finalList.add(new Post("Убийца плачет", new Date()));
        finalList.add(new Post("Но он не смог ... поступить иначе", new Date()));
        finalList.add(new Post("Прольётся ... кроооооооовь", new Date()));
        finalList.forEach(p -> p.setLikes(0));
        return finalList;
    }
}
