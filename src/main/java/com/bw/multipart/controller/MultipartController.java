package com.bw.multipart.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/multipart")
public class MultipartController {
	private static final Logger LOGGER = Logger.getLogger(MultipartController.class);

	@RequestMapping
	public String getMultiPartPage() {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("In Multipart Controller");
		}

		return "multipart";
	}

	@RequestMapping("/upload")
	public String getUploadPage() {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("get upload page");
		}

		return "upload";
	}

	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public String uploadFile() {
		return "";
	}
}
