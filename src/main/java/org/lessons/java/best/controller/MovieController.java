package org.lessons.java.best.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.best.classes.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MovieController {

	private List<Movie> movieList = getBestMovies();

	@GetMapping()
	public String movies(Model model) {
		model.addAttribute("mio_nome", "Tommaso");
		model.addAttribute("movies", movieList);

		return "movies";

	}

	@GetMapping("/{id}")
	public String movie(Model model, @PathVariable("id") String id) {
		model.addAttribute("movie", movieList.get(Integer.parseInt(id) - 1));

		return "movie";
	}

	public List<Movie> getBestMovies() {

		List<Movie> movieList = new ArrayList<>();

		movieList.add(new Movie(1, "Star Wars Episodio I: La minaccia fantasma"));
		movieList.add(new Movie(2, "Star Wars Episodio II: L'attacco dei cloni"));
		movieList.add(new Movie(3, "Star Wars Episodio III: La vendetta dei Sith"));
		movieList.add(new Movie(4, "Star Wars Episodio IV: Una nuova speranza"));
		movieList.add(new Movie(5, "Star Wars Episodio V: L'impero colpisce ancora"));
		movieList.add(new Movie(6, "Star Wars Episodio VI: Il ritorno dello Jedi"));

		return movieList;
	}

}
