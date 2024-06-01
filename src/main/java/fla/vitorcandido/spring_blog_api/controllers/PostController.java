package fla.vitorcandido.spring_blog_api.controllers;

import fla.vitorcandido.spring_blog_api.dto.CreatePostDto;
import fla.vitorcandido.spring_blog_api.dto.UpdatePostDto;
import fla.vitorcandido.spring_blog_api.entities.MessageResponseEntity;
import fla.vitorcandido.spring_blog_api.entities.PostEntity;
import fla.vitorcandido.spring_blog_api.services.post.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag( name = "Post" )
@RestController
@RequestMapping("/post")
public class PostController {
    private final CreatePostService createPostService;
    private final UpdatePostService updatePostService;
    private final DeletePostService deletePostService;
    private final GetPostService getPostService;
    private final ListPostsService listPostsService;

    public PostController(
        CreatePostService createPostService,
        UpdatePostService updatePostService,
        DeletePostService deletePostService,
        GetPostService getPostService,
        ListPostsService listPostsService
    ) {
       this.createPostService = createPostService;
       this.updatePostService = updatePostService;
       this.deletePostService = deletePostService;
       this.getPostService    = getPostService;
       this.listPostsService  = listPostsService;
    }

    @PostMapping
    public MessageResponseEntity createPost(@RequestBody CreatePostDto createPostDto) {
        this.createPostService.createPost(createPostDto);
        return new MessageResponseEntity("Successfully created post");
    }

    @PutMapping
    public MessageResponseEntity updatePost(@RequestBody UpdatePostDto updatePostDto) {
        this.updatePostService.updatePost(updatePostDto);
        return new MessageResponseEntity("Successfully updated post");
    }

    @DeleteMapping("/{postId}")
    public MessageResponseEntity deletePost(@PathVariable("postId") String postId) {
        this.deletePostService.deletePost(postId);
        return new MessageResponseEntity("Successfully deleted post");
    }

    @GetMapping("/{postId}")
    public PostEntity getPost(@PathVariable("postId") String postId) {
        return this.getPostService.getPost(postId);
    }

    @GetMapping("/list")
    public List<PostEntity> listPosts() {
        return this.listPostsService.listPosts();
    }
}
