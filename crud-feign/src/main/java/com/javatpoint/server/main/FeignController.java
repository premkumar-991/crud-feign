package com.javatpoint.server.main;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "crudop")
public interface FeignController {
	
	@GetMapping("/api/users")
	public List<UserFeign> getUser();
	
	@PostMapping("/api/save")
	public UserFeign saveUser(@RequestBody UserFeign user);
	
	@GetMapping("/api/user/{id}")
	public UserFeign getUserById(@PathVariable Integer id);
	
	@DeleteMapping("/api/delete/{id}")
	public UserFeign deleteUser(@PathVariable Integer id);
	
	@PostMapping("/api/update/{id}")
	public UserFeign updateUser(@PathVariable Integer id, @RequestBody UserFeign user);
	
	
}