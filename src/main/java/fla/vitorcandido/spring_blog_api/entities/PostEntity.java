package fla.vitorcandido.spring_blog_api.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "posts")
public class PostEntity {
    @Id
    public String id;
    public String title;
    public String content;

    public PostEntity() {}
}
