package fla.vitorcandido.spring_blog_api.entities;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class HealthEntity {
    public Date date;
    public Boolean status;

    public HealthEntity() {
        this.date = new Date();
    }
}
