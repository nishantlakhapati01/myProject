package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Employee;
import com.cjc.main.serviceI.HomeService;

@Controller
public class HomeController
{
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String m1()
	{
		return "register";
	}
	
	@RequestMapping("/reg")
	public String register(@ModelAttribute Employee emp)
	{
		hs.saveData(emp);
		return "login";
	}

	@RequestMapping("/log")
	public String prelogin(@RequestParam("username")String username, @RequestParam("password")String password,Model m)
	{
		List<Employee> list = hs.loginCheck(username, password);
		if(!list.isEmpty())
		{
			m.addAttribute("data", list);
			return "success";
		}
		else
		{
			return "login";
		}
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id")int id, Model m)
	{
		hs.deleteData(id);
		List<Employee> list = hs.getAllData();
		m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("id")int id, Model m)
	{
		Employee emp = hs.editData(id);
		m.addAttribute("data", emp);
		return "update";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Employee emp, Model m)
	{
		hs.updateData(emp);
		List<Employee> list = hs.getAllData();
		m.addAttribute("data", list);
		return "success";
	}
}
