package lp3.groupCC.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DespachoRest {
	
	@GetMapping
	public String hello(){
		return "Cami la mejor";
		
	}

}
