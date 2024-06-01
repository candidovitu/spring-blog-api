package fla.vitorcandido.spring_blog_api.services.post;

import fla.vitorcandido.spring_blog_api.dto.UpdatePostDto;
import fla.vitorcandido.spring_blog_api.entities.PostEntity;
import fla.vitorcandido.spring_blog_api.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UpdatePostService {
    private final PostRepository postRepository;

    public UpdatePostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void updatePost(UpdatePostDto updatePostDto) {
        Optional<PostEntity> postOptional = this.postRepository.findById(updatePostDto.id);

        if (postOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        PostEntity post = postOptional.get();

        post.setTitle(updatePostDto.title);
        post.setContent(updatePostDto.content);

        this.postRepository.save(post);
    }

}
