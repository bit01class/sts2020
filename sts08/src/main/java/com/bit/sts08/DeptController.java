package com.bit.sts08;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.swing.text.AbstractDocument.Content;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.sts08.model.entity.DeptVo;
import com.bit.sts08.service.DeptService;

@Controller
public class DeptController {
	@Inject
	DeptService deptService;

	@RequestMapping(value = "/dept/",method=RequestMethod.GET
			, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public Map<String,Object> listPage() {
		try {
			return deptService.list();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value = "/dept/{deptno}")
	@ResponseBody
	public DeptVo detailPage(@PathVariable int deptno) throws Exception {
		return deptService.getOne(deptno);
	}
}










