package ru.timshmykov.biomolekula.service.loader;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.timshmykov.biomolekula.service.loader.exception.LoadException;

@Component
@RequiredArgsConstructor
public class Loader {

    private final RestTemplate restTemplate;

    public String load(String url) throws LoadException {
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        if (response.getStatusCode().isError()) {
            throw new LoadException();
        }
        return response.getBody();

    }
}
