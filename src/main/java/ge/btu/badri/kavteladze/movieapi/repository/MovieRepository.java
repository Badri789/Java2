package ge.btu.badri.kavteladze.movieapi.repository;

import ge.btu.badri.kavteladze.movieapi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
