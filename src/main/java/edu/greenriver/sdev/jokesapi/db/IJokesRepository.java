package edu.greenriver.sdev.jokesapi.db;

import edu.greenriver.sdev.jokesapi.model.Joke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJokesRepository extends JpaRepository<Joke, Integer>
{

}
