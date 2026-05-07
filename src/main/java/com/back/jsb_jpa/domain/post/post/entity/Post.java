package com.back.jsb_jpa.domain.post.post.entity;

import com.back.jsb_jpa.domain.member.member.entity.Member;
import com.back.jsb_jpa.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity // 아래 구조대로 DB 테이블(컬럼)을 만들어야 한다.
public class Post extends BaseEntity {
    private String title; // VARCHAR(255)
    @Column(columnDefinition = "TEXT")
    private String content; // TEXT

    @ManyToOne
    private Member author;

    public Post(Member author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }
}
