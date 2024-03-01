package com.example.simpleboard.post.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PostRequest {
    //화면에서 들어오는 내용들을 받아야됨.

    //어느 게시판에 쓸 지
    private Long boardId = 1L;

    @NotBlank
    private String userName;
    @NotBlank
    @Size(min = 4,max = 4)
    private String password;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    //이것들로 요청하면 어떤게 Return이 돼야 할까
    //그대로 보내주면 되지 않을까?
    //엔티티를 그대로 내보내면 안되나?
}
