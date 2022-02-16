package mate.academy.service;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieService {
    Movie save(Movie movie);

    Optional<Movie> get(Long id);
}