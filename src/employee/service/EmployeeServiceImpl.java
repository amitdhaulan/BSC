package employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import employee.dao.EmployeeDao;
import employee.domain.Employee;


public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployeeList() {
		return employeeDao.getEmployeeList();
	}
}
