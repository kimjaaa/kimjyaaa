package kimjyaaa.web;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kimjyaaa.model.User;

//사용자 정보를 POST, 목록을 GET 받을 주소는 우선 알아서 잘 정의해보기

@Controller
public class UserController {
	private List<User> users = new ArrayList<User>();

		@PostMapping("/user/create")
		public String create(User user){
			System.out.println("users : " + users);
			users.add(user);
			return ("redirect:/users");
		}
		
		@GetMapping("/users")
		public String list(Model model){
			model.addAttribute("users", users);
			return("/user/list");
			
		}
		
	
}
