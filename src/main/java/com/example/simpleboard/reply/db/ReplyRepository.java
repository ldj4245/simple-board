package com.example.simpleboard.reply.db;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<ReplyEntity,Long> {

    // select * from reply where post_id = ?
    List<ReplyEntity> findAllByPostIdAndStatusOrderByIdDesc(Long id, String status);
}
