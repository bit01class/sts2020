package com.bit.sts07;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts07.model.entity.DeptVo;
import com.bit.sts07.service.DeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {
	@Inject
	DeptService deptService;

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String list(Model model) {
		try {
			deptService.listService(model);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "dept/list";
	}
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public String insert(@ModelAttribute DeptVo bean) {
		try {
			deptService.oneAddService(bean);
		} catch (SQLException e) {
			return "dept/add";
		}
		return "redirect:./";
	}
	@RequestMapping("/add")
	public void add() {}
	
	@RequestMapping(value = "/{deptno}",method=RequestMethod.GET)
	public String detail(@PathVariable int deptno,Model model) throws SQLException{
		deptService.detailService(model,deptno);
		return "dept/detail";
	}
}









