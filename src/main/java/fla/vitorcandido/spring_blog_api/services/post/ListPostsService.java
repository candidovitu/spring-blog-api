package fla.vitorcandido.spring_blog_api.services.post;

import fla.vitorcandido.spring_blog_api.entities.PostEntity;
import fla.vitorcandido.spring_blog_api.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ListPostsService {
    private final PostRepository postRepository;

    public ListPostsService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<PostEntity> listPosts() {
        return this.postRepository.findAll();
    }

}
