package com.example.restservice.api;

import java.util.List;

import com.example.restservice.model.Show;
import com.example.restservice.service.ShowService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShowController {


	//GET
	@GetMapping("/shows")
	public List<Show> getAllShows(){
		return ShowService.getAllShows();
	}
	//PathVariable
//    Needs to run Once @ /shows, then can filter results
	@GetMapping("/shows/{id}")
	public Show getShowById(@PathVariable int id){
		return ShowService.getById(id);
	}


	//POST
	//    Needs to run Once @ /shows, then can add stuff.
	@PostMapping("/shows")
	public Show saveShow(@RequestBody Show show){
		ShowService.addShow(show);
		System.out.println(show);
		return show;
	}
}
