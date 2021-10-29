package ch.rmisteli.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * JokeServiceImpl
 * Author: rmisteli
 * Created: 29.10.21 - 13:40
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
