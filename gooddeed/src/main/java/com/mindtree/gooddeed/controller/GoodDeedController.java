package com.mindtree.gooddeed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.gooddeed.dto.CampusMindDTO;
import com.mindtree.gooddeed.dto.GoodDeedDTO;
import com.mindtree.gooddeed.dto.SupervisorDTO;
import com.mindtree.gooddeed.service.GoodDeedService;

@RestController
public class GoodDeedController {
	@Autowired
	GoodDeedService service;

	@PostMapping("/assign/{id}")
	public boolean assignMind(@RequestBody CampusMindDTO campusmind, @PathVariable int id) {
		return service.assignGoodDeed(campusmind, id);

	}
    @GetMapping("/getminds/{gid}")
    public List<CampusMindDTO> displayminds(@PathVariable int gid) {
    	return service.getAllMinds(gid);
    }
    
    @GetMapping("/getAllGoodDeeds")
    public List<GoodDeedDTO> getall(){
		return service.getAllgooddeeds();
    	
    }
    
    @GetMapping("/diplayAll/{supervisorId}")
    public SupervisorDTO getAll(@PathVariable int supervisorId) {
		return service.getAllGoodDeeds(supervisorId);
    	
    }
}
