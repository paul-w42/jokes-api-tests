package edu.greenriver.sdev.jokesapi;

import edu.greenriver.sdev.jokesapi.db.IJokesRepository;
import edu.greenriver.sdev.jokesapi.model.Joke;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JokesApiApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(JokesApiApplication.class, args);

    }
}
