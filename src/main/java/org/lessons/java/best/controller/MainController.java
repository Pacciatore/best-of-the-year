package org.lessons.java.best.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.best.classes.Movie;
import org.lessons.java.best.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("mio_nome", "Tommaso");

		return "index";
	}

	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute("mio_nome", "Tommaso");
		model.addAttribute("movies", getBestMovies());

		return "movies";
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

	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("mio_nome", "Tommaso");
		model.addAttribute("songs", getBestSongs());

		return "songs";
	}

	public List<Song> getBestSongs() {

		List<Song> songList = new ArrayList<>();

		songList.add(new Song(1, "Bohemian Rhapsody"));
		songList.add(new Song(2, "Smells Like Teen Spirit"));
		songList.add(new Song(3, "Baby Shark"));
		songList.add(new Song(4, "Bollicine"));
		songList.add(new Song(5, "Song2"));
		songList.add(new Song(6, "Enter Sandman"));

		return songList;
	}

}