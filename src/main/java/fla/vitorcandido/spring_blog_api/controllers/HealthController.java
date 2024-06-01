package fla.vitorcandido.spring_blog_api.controllers;

import fla.vitorcandido.spring_blog_api.entities.HealthEntity;
import fla.vitorcandido.spring_blog_api.services.health.GetHealthService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag( name = "Health" )
@RestController
@RequestMapping("/health")
public class HealthController {
    @Autowired
    private GetHealthService getHealthService;

    @GetMapping
    public ResponseEntity<HealthEntity> getHealth() {
        HealthEntity health = getHealthService.getHealth();

        return ResponseEntity
                .ok(health);
    }
}
