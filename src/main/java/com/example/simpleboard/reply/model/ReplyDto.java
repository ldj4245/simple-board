package com.example.simpleboard.reply.model;


import com.example.simpleboard.post.db.PostEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ReplyDto {
    private Long id; // post => post_id

    //나는 매니 상대방은 하나
    private Long postId;

    private String userName;
    private String password;
    private String status;
    private String title;

    private String content;
    private LocalDateTime repliedAt;

}
