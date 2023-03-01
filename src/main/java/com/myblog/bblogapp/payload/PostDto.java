package com.myblog.bblogapp.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PostDto {
    private long id;
    @NotNull
    @Size(min=2,message = "Post Title Should Have At Least 2 Characters")
    private String title;
    @NotNull
    @Size(min=10,message = "Post Description Should Have At Least 10 Or More Characters")

    private String description;
    @NotNull
    @NotEmpty(message ="Content not Be Empty")
    private String content;
}
