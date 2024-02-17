package com.encore.mvc.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class PostResponseDTO {

    private int idx;
    private String title;
    private String content;
    private String writer;

}
