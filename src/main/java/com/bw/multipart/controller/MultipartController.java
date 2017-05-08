package com.bw.multipart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultipartController {
	private static final Logger logger = LoggerFactory.getLogger(MultipartController.class);

	@RequestMapping("/main")
	public String getMultiPartPage() {
		logger.info("In Multipart Controller");

		return "multipart";
	}
}
