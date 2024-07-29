package com.example.move_.streaming_service.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MoveStreamingService {

    // Load balancer will provide us one url for one instance of Catalog-service
    public static final String CATALOG_SERVICE_URL = "http://move-catalog-service";


    @Autowired
    private RestTemplate restTemplate;

    public String getMoviePath(Long id) {
        ResponseEntity<String> response = restTemplate
                .getForEntity(CATALOG_SERVICE_URL + "/movies/find/{id}", String.class, id);
        return response.getBody();
    }
}
