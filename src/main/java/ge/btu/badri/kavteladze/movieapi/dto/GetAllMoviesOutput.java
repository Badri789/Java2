package ge.btu.badri.kavteladze.movieapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetAllMoviesOutput {
    List<MovieDTO> movies;
}
