package com.back.jsb_jpa.global.initData;

import com.back.jsb_jpa.domain.post.post.entity.Post;
import com.back.jsb_jpa.domain.post.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseInitData {
    @Autowired
    private PostRepository postRepository;

    @Bean
    ApplicationRunner baseInitDataApplicationRunner() {
        return args -> {
            if (postRepository.count() > 0) return;

            Post post = new Post();
            post.setTitle("제목 1");
            postRepository.save(post);

            Post post2 = new Post();
            post2.setTitle("제목 2");
            postRepository.save(post2);
        };
    }
}
