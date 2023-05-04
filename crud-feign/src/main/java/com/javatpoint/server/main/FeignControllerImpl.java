package com.javatpoint.server.main;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestController
@ControllerAdvice
public class FeignControllerImpl implements FeignController {
	private final FeignController feigncontroller;
	public FeignControllerImpl(FeignController feigncontroller) {
		this.feigncontroller = feigncontroller;
	}
	@Override
	public List<UserFeign> getUser() {
		return feigncontroller.getUser();
	}
	
	@Override
	public UserFeign saveUser(UserFeign user) {
		return feigncontroller.saveUser(user);
	}
	
	@Override
	public UserFeign getUserById(Integer id) {
		return feigncontroller.getUserById(id);
	}
	
	@Override
	public UserFeign deleteUser(Integer id) {
		return feigncontroller.deleteUser(id);
	}
	
	@Override
	public UserFeign updateUser(Integer id, UserFeign user) {
		return feigncontroller.updateUser(id, user);
	}
	
}