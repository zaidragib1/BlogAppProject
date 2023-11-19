package com.example.blogappproject.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "comments")
//@NoArgsConstructor
@Getter
@Setter
public class Comment {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String content;

    @ManyToOne
    private Post post;

}

