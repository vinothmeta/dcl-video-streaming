package com.dclvideostream.controller;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dclstream")
public class VideoStreamController {

	@RequestMapping("/streamvideo")
	public String streamVideo() throws FileNotFoundException {
		return "index";
	}

}
