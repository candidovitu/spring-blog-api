package fla.vitorcandido.spring_blog_api.repositories;

import fla.vitorcandido.spring_blog_api.entities.PostEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<PostEntity, String> {
}
