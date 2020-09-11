package com.bit.sts02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept/")
public class DeptController {
	// Dept table CRUD
	@RequestMapping("list")
	public String list() {
		return "deptList";
	}
}
