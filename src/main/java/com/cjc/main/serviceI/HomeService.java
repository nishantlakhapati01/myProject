package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Employee;

public interface HomeService
{
	public void saveData(Employee emp);
	public List<Employee> getAllData();
	public List<Employee> loginCheck(String username, String password);
	public void deleteData(int id);
	public Employee editData(int id);
	public void updateData(Employee emp);

}
