package com.back.jsb_jpa.global.initData;

import com.back.jsb_jpa.domain.post.post.entity.Post;
import com.back.jsb_jpa.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Configuration
public class BaseInitData {

    private final PostService postService;

    @Bean
    ApplicationRunner baseInitDataApplicationRunner() {
        return args -> {
            work1();
            work2();
        };
    }

    @Transactional
    void work1() {
        if (postService.count() > 0) return;

        Post post1 = postService.save( new Post("제목 1", "내용 1"));
        // INSERT INTO post SET title = '제목 1';
        Post post2 = postService.save(new Post("제목 2", "내용 2"));
        // INSERT INTO post SET title = '제목 2';
    }

    @Transactional(readOnly = true)
    void work2() {
        Optional<Post> opPost = postService.findById(1);
        // SELECT * FROM post WHERE id = 1;
        Post post = opPost.get();
        System.out.println("post : " + post);
    }

}
