package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.homeRepo.HomeRepository;
import com.cjc.main.model.Employee;
import com.cjc.main.serviceI.HomeService;

@Service
public class ServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Employee emp)
	{
		hr.save(emp);
	}

	@Override
	public List<Employee> getAllData()
	{
		List<Employee> list = (List<Employee>) hr.findAll();
		return list;
	}

	@Override
	public List<Employee> loginCheck(String username, String password)
	{
		if(username.equals("admin")&&password.equals("admin"))
		{
			List<Employee> all_list = (List<Employee>) hr.findAll();
			return all_list;
		}
		else
		{
			List<Employee> list = hr.findByUsernameAndPassword(username, password);
			return list;
		}
	}

	@Override
	public void deleteData(int id) 
	{
		hr.deleteById(id);
	}

	@Override
	public Employee editData(int id) 
	{
		Employee emp = hr.findById(id).get();
		return emp;
	}

	@Override
	public void updateData(Employee emp)
	{
		hr.save(emp);
	}

}
