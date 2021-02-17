package com.invi.marsrover.model;

import org.springframework.web.bind.annotation.RequestParam;

public class HomeDto {
 
	private String marsApiRoverData;
	private Integer marsSol;
	private MarsCameras marsCameras;
	
	
	public HomeDto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HomeDto [marsApiRoverData=" + marsApiRoverData + ", marsSol=" + marsSol + ", marsCameras=" + marsCameras
				+ "]";
	}
	public String getMarsApiRoverData() {
		return marsApiRoverData;
	}
	public void setMarsApiRoverData(String marsApiRoverData) {
		this.marsApiRoverData = marsApiRoverData;
	}
	public Integer getMarsSol() {
		return marsSol;
	}
	public void setMarsSol(Integer marsSol) {
		this.marsSol = marsSol;
	}
	public MarsCameras getMarsCameras() {
		return marsCameras;
	}
	public void setMarsCameras(MarsCameras marsCameras) {
		this.marsCameras = marsCameras;
	}
	
}
