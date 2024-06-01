package fla.vitorcandido.spring_blog_api.services.post;

import fla.vitorcandido.spring_blog_api.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePostService {
    private final PostRepository postRepository;

    public DeletePostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void deletePost(String postId) {
        this.postRepository.deleteById(postId);
    }

}
