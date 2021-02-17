package com.invi.marsrover.service;

import com.invi.marsrover.model.HomeDto;
import com.invi.marsrover.model.MarsCameras;
import com.invi.marsrover.model.MarsRoverApiResponse;

public interface MarsRoverApiServiceInterface {


	MarsRoverApiResponse getRoverData(HomeDto homeDto);

	
}
