package com.back.jsb_jpa.global.initData;

import com.back.jsb_jpa.domain.post.post.entity.Post;
import com.back.jsb_jpa.domain.post.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class BaseInitData {
    @Autowired
    private PostRepository postRepository;

    @Bean
    ApplicationRunner baseInitDataApplicationRunner() {
        return args -> {
            work1();
            work2();
        };
    }

    void work1() {
        if (postRepository.count() > 0) return;

        postRepository.save( new Post("제목 1", "내용 1"));
        // INSERT INTO post SET title = '제목 1';
        postRepository.save(new Post("제목 2", "내용 2"));
        // INSERT INTO post SET title = '제목 2';
    }

    void work2() {
        Optional<Post> opPost = postRepository.findById(1);
        // SELECT * FROM post WHERE id = 1;
    }

}
