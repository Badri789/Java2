package ge.btu.badri.kavteladze.movieapi.dto;

import lombok.Data;

@Data
public class UpdateMovieInput {
    private Long id;
    private String title;
    private String country;
}
