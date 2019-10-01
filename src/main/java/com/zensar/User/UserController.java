package com.zensar.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/api")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "user inserted";
	}
	
	@GetMapping("/api")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	@GetMapping("/api/{id}")
	public User getUserById(@PathVariable String id) {
		return userService.getUserByid(id);
	}
	
	@DeleteMapping("/api/{id}")
	public User deleteUser(@PathVariable String id) {
	return userService.deleteUser(id);
	}

}
