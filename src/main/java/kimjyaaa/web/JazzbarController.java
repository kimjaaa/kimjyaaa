package kimjyaaa.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kimjyaaa.model.Jazzbar;

@Controller
public class JazzbarController {
	private List<Jazzbar> jazzbars = new ArrayList<Jazzbar>();
	
	@GetMapping("/jazzbars")
	public String list(Model model){
		model.addAttribute("jazzbars", jazzbars); 
		return("/jazzbar/list");
	}

	@PostMapping("/jazzbar/create")
	public String create(Jazzbar jazzbar){
		System.out.println("jazzbar:" +jazzbar);
		jazzbars.add(jazzbar);
		return("redirect:/jazzbars");
	}
}
