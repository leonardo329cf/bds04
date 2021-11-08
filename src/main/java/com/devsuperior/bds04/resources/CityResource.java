package com.devsuperior.bds04.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.devsuperior.bds04.dto.CityDTO;
import com.devsuperior.bds04.service.CityService;

@Controller
public class CityResource {

	@Autowired
	private CityService service;
	
	@GetMapping(value = "/cities")
	public ResponseEntity<List<CityDTO>> findAllSortedByName() {
		List<CityDTO> list = service.findAllSortedByName();
		return ResponseEntity.ok().body(list);
	}
}
