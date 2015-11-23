package employee.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import jdbc.EmployeeRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import employee.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	DataSource dataSource;
	
	@Override
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "SELECT * FROM employee";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		employees = jdbcTemplate.query(sql, new EmployeeRowMapper());
		return employees;
	}

}
