package edu.greenriver.sdev.jokesapi.bootstrap;

import edu.greenriver.sdev.jokesapi.db.IJokesRepository;
import edu.greenriver.sdev.jokesapi.model.Joke;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner
{
    private IJokesRepository repo;

    public DataLoader(IJokesRepository repo)
    {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception
    {
        List<Joke> jokes = new ArrayList<>(List.of(
            new Joke("What did Han Solo say to the waiter who recommended the haddock? Never sell me the cods!"),
            new Joke("Why didn’t any of Luke Skywalker’s marriages last? He always followed Obi-Wan’s advice: " +
                    "'Use divorce, Luke.'"),
            new Joke("What was Lando’s nickname before he became a skilled pilot? Crashdo."),
            new Joke("Why does Princess Leia keep her hair tied up in buns? So it doesn’t Hang Solow."),
            new Joke("What is Admiral Ackbar's favorite type of music? Trap."),
            new Joke("What do you call a rebel princess who only shops at Whole Foods? Leia Organic."),
            new Joke("What do you call an eel that loves the new Star Wars trilogy? A More-Rey Eel."),
            new Joke("Where did Luke get his cybernetic hand? The second hand store."),
            new Joke("What do you call an eel that loves the new Star Wars trilogy? A More-Rey Eel."),
            new Joke("Where did Luke get his cybernetic hand? The second hand store.")
        ));

        //add all jokes!
        repo.saveAll(jokes);
    }
}
