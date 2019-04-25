package cn.midnight.image.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/image")
public class ImageController {

	@GetMapping("/{customId}/*")
	public void getImage(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("customId") String customId) {

	}

}
