package com.back.jsb_jpa.domain.post.post.service;

import com.back.jsb_jpa.domain.post.post.entity.Post;
import com.back.jsb_jpa.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> findById(int id) {
        return postRepository.findById(id);
    }

    public long count() {
        return postRepository.count();
    }
}
