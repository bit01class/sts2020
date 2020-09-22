package com.bit.sts09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST )
	@ResponseBody
	public void upload(@RequestParam("sabun") int sabun, MultipartFile file1) {
		String orgName=file1.getOriginalFilename();
		String reName=System.currentTimeMillis()+"_"+orgName;
		logger.info(reName);
		String path="D:\\webWorkspace3\\upload\\";
		File dest=new File(path+reName);
		logger.info(dest.getAbsolutePath());
		try {
			file1.transferTo(dest);
			logger.info("end IO");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}











