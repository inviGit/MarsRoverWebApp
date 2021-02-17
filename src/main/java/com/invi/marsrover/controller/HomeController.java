package com.invi.marsrover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.invi.marsrover.model.HomeDto;
import com.invi.marsrover.model.MarsCameras;
import com.invi.marsrover.model.MarsRoverApiResponse;
import com.invi.marsrover.service.MarsRoverApiServiceInterface;


@Controller
public class HomeController {
	
	@Autowired
	private MarsRoverApiServiceInterface service;

	@GetMapping("/")
	public String getHomeView(ModelMap model) {
		model.put("poc", "working");
		return "index.html";
	}

	@GetMapping("/photo")
	public String getView(ModelMap model, 
			HomeDto homeDto) {
		if(StringUtils.isEmpty(homeDto.getMarsApiRoverData())) {
			homeDto.setMarsApiRoverData("opportunity");
		}
		if(homeDto.getMarsSol()==null) {
			homeDto.setMarsSol(1);
		}
		if (homeDto.getMarsCameras() == null) {
			homeDto.setMarsCameras(new MarsCameras());
		}
		MarsRoverApiResponse response = service.getRoverData(homeDto);
		if(response.getPhotos().isEmpty()) {
			model.put("status", "No photos found for given preference");
		}else {
			model.put("status", "Number of photos: "+ response.getPhotos().size());	
		}
		
		model.put("roverData", response);
		model.put("homeDto", homeDto);
		
		return "index.html"; 
		
		
	}
	
}