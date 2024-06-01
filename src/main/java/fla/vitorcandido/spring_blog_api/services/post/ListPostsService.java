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
    @Autowired
    private PostRepository postRepository;

    public List<PostEntity> listPosts() {
        List<PostEntity> posts = this.postRepository.findAll();
        return posts;
    }

}
