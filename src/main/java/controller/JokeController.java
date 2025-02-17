package controller;

import model.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.JokeService;

@RestController
@RequestMapping("/api")
public class JokeController {

        @Autowired
        private JokeService jokeServicesssssssss;

        @GetMapping("/joke")
        public Joke getJoke() {
            return jokeServicesssssssss.getRandomJoke();
        }
}
