package service;

import model.Joke;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class JokeService {

    private final WebClient webClient;

    public JokeService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public Joke getRandomJoke() {
        return webClient.get()
                .uri("https://official-joke-api.appspot.com")
                .retrieve()
                .bodyToMono(Joke.class)
                .block(); // Blocking call (suitable for synchronous calls)
    }
}
