package cn.midnight.image.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/img")
public class ImageSubController {

	@PostMapping
	public String uploadImage(HttpServlet request, HttpServletResponse response) {
		return null;
	}
	
	

}
