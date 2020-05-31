package com.cjc.main.homeRepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>
{
	List<Employee> findByUsernameAndPassword(String username, String password);

}
