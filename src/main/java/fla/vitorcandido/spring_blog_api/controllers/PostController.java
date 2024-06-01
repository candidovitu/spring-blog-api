package fla.vitorcandido.spring_blog_api.controllers;

import fla.vitorcandido.spring_blog_api.dto.CreatePostDto;
import fla.vitorcandido.spring_blog_api.dto.UpdatePostDto;
import fla.vitorcandido.spring_blog_api.entities.MessageResponseEntity;
import fla.vitorcandido.spring_blog_api.entities.PostEntity;
import fla.vitorcandido.spring_blog_api.services.post.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Tag( name = "Post" )
@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private CreatePostService createPostService;

    @Autowired
    private UpdatePostService updatePostService;

    @Autowired
    private DeletePostService deletePostService;

    @Autowired
    private GetPostService getPostService;

    @Autowired
    private ListPostsService listPostsService;

    @PutMapping
    public MessageResponseEntity createPost(@RequestBody CreatePostDto createPostDto) {
        this.createPostService.createPost(createPostDto);
        return new MessageResponseEntity("Successfully created post");
    }

    @PatchMapping
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
