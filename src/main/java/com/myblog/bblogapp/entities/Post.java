package com.myblog.bblogapp.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.utility.nullability.UnknownNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data  //it gives getters and setters
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
        (
                name="posts",
                uniqueConstraints = {@UniqueConstraint(columnNames = {"title","description"})}
        )
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(name="title", nullable=false)
    private String title;
    @Column(name="description",nullable = false)
    private String description;
    @Lob //more than 255 character
    @Column(name="content",nullable = false)
    private String content;
    @OneToMany(mappedBy = "post",cascade=CascadeType.ALL,orphanRemoval = true)
    private Set<Comment> comments = new HashSet<>();

}
