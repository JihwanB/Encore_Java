package com.encore.mvc.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class PostRequestDTO {

    private String title;
    private String content;
    private String writer;

}
