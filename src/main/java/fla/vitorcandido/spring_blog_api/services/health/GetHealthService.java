package fla.vitorcandido.spring_blog_api.services.health;

import fla.vitorcandido.spring_blog_api.entities.HealthEntity;
import org.springframework.stereotype.Service;

@Service
public class GetHealthService {

    public HealthEntity getHealth() {
        HealthEntity healthEntity = new HealthEntity();
        healthEntity.setStatus(true);

        return healthEntity;
    }

}
