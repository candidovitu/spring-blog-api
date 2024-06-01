package fla.vitorcandido.spring_blog_api.services.post;

import fla.vitorcandido.spring_blog_api.dto.CreatePostDto;
import fla.vitorcandido.spring_blog_api.entities.PostEntity;
import fla.vitorcandido.spring_blog_api.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePostService {
    private final PostRepository postRepository;

    public CreatePostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void createPost(CreatePostDto createPostDto) {
        PostEntity postEntity = new PostEntity();

        postEntity.setTitle(createPostDto.title);
        postEntity.setContent(createPostDto.content);

        this.postRepository.insert(postEntity);
    }

}
