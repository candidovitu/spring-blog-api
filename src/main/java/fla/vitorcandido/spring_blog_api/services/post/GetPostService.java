package fla.vitorcandido.spring_blog_api.services.post;

import fla.vitorcandido.spring_blog_api.entities.PostEntity;
import fla.vitorcandido.spring_blog_api.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class GetPostService {
    private final PostRepository postRepository;

    public GetPostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostEntity getPost(String postId) {
        Optional<PostEntity> post = this.postRepository.findById(postId);

        if (post.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return post.get();
    }

}
