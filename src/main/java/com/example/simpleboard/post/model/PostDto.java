package com.example.simpleboard.post.model;


//entity와 상응하는


import com.example.simpleboard.board.db.BoardEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table()
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PostDto {

    private Long id;

    //post_id가 바뀐거임
    //그래서 알려줘야함
    private Long  boardId;

    private String userName;
    private String password;
    private String email;
    private String status;

    private String title;

    private String content;

    private LocalDateTime postedAt;

}
