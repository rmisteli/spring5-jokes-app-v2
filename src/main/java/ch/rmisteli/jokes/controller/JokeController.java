package ch.rmisteli.jokes.controller;

import ch.rmisteli.jokes.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JokeController
 * Author: rmisteli
 * Created: 29.10.21 - 13:41
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"", "/"})
    public String getJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
