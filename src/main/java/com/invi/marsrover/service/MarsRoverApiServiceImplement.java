package com.invi.marsrover.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.invi.marsrover.model.HomeDto;
import com.invi.marsrover.model.MarsPhoto;
import com.invi.marsrover.model.MarsRoverApiResponse;

@Service
public class MarsRoverApiServiceImplement implements MarsRoverApiServiceInterface {

	@Autowired
	private Environment env;
	
	@Override
	public MarsRoverApiResponse getRoverData(HomeDto homeDto) {
		// TODO Auto-generated method stub
		System.out.println("HI!!");
		RestTemplate rt = new RestTemplate();

		List<String> apiUrlEndpoints = new ArrayList<String>();

		apiUrlEndpoints = getApiUrlEndpoints(homeDto);

		MarsRoverApiResponse response = new MarsRoverApiResponse();
		List<MarsPhoto> photos = new ArrayList<>();
		
		

		apiUrlEndpoints.stream().forEach(url -> {
			MarsRoverApiResponse apiResponse = rt.getForObject(url, MarsRoverApiResponse.class);
			photos.addAll(apiResponse.getPhotos());
		});
		response.setPhotos(photos);
		return response;
	}

	private List<String> getApiUrlEndpoints(HomeDto homeDto) {
		List<String> urls = new ArrayList<String>();
		
		Map<String, Boolean> validCamera = new HashMap<String, Boolean>();
		validCamera.put("FHAZ", homeDto.getMarsCameras().isMarsCamFHAZ());
		validCamera.put("RHAZ", homeDto.getMarsCameras().isMarsCamRHAZ());
		validCamera.put("MAST", homeDto.getMarsCameras().isMarsCamMAST());
		validCamera.put("CHEMCAM", homeDto.getMarsCameras().isMarsCamCHEMCAM());
		validCamera.put("MAHLI", homeDto.getMarsCameras().isMarsCamMAHLI());
		validCamera.put("MARDI", homeDto.getMarsCameras().isMarsCamMARDI());
		validCamera.put("NAVCAM", homeDto.getMarsCameras().isMarsCamNAVCAM());
		validCamera.put("PANCAM", homeDto.getMarsCameras().isMarsCamPANCAM());
		validCamera.put("MINITES", homeDto.getMarsCameras().isMarsCamMINITES());
		
	
		for (Map.Entry<String,Boolean> entry: validCamera.entrySet())  {
			if(entry.getValue()) {
				urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol=" + homeDto.getMarsSol()
				+ "&camera="+entry.getKey()+"&api_key=" + env.getProperty("api.key"));
			}
		}

		if (urls.isEmpty()) {
			urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/" + homeDto.getMarsApiRoverData() + "/photos?sol="
					+ homeDto.getMarsSol() + "&api_key=" + env.getProperty("api.key"));
		}
		return urls;
	}

}
