package com.bit.sts12;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bit.sts12.dept.model.entity.DeptVo;
import com.bit.sts12.service.DeptService;

@RestController
public class DeptController {
	@Inject
	DeptService deptService;

	@RequestMapping(value = "/dept/",method=RequestMethod.GET)
	public List<DeptVo> list() throws SQLException{
		return deptService.list();
	}
	
	@GetMapping("/dept/{deptno}")
	public DeptVo one(@PathVariable("deptno")int key) throws SQLException {
		return deptService.detail(key);
	}
}
