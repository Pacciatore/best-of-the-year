package org.lessons.java.best.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.best.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/songs")
public class SongController {

	private List<Song> songList = getBestSongs();

	@GetMapping()
	public String songs(Model model) {
		model.addAttribute("mio_nome", "Tommaso");
		model.addAttribute("songs", songList);

		return "songs";
	}

	@GetMapping("/{id}")
	public String song(Model model, @PathVariable("id") String id) {
		model.addAttribute("song", songList.get(Integer.parseInt(id) - 1));

		return "song";
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
