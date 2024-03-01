package com.example.simpleboard.post.controller;

import com.example.simpleboard.common.Api;
import com.example.simpleboard.post.db.PostEntity;
import com.example.simpleboard.post.model.PostRequest;
import com.example.simpleboard.post.model.PostViewRequest;
import com.example.simpleboard.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostApiController {

    private final PostService postService;


    //CREATE
    // READ
    //UP

    @PostMapping("")
    public PostEntity create(
            @Valid
            @RequestBody PostRequest postRequest
    ) {
        return postService.create(postRequest);

    }


    //게시물 조회 할 때 id만으로는 안됨
    // 결국 post사용
    @PostMapping("/view")
    public PostEntity view(
            @Valid
            @RequestBody PostViewRequest postViewRequest

    ) {

        var entity = postService.view(postViewRequest);
        return entity;



    }


    //set / ? &
    @GetMapping("/all")
    public Api<List<PostEntity>> list(
            @PageableDefault(page = 0, size = 10,
                    sort = "id",direction = Sort.Direction.DESC)
            Pageable pageable

    ) {

        return postService.all(pageable);

    }


    @PostMapping("/delete")
    public void delete(
            @Valid
            @RequestBody
            PostViewRequest postViewRequest

    ) {
        postService.delete(postViewRequest);

    }


}
