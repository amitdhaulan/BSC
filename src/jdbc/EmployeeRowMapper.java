package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import employee.domain.Employee;



public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet resultset, int rowNum) throws SQLException {
		EmployeeExtractor employeeExtractor = new EmployeeExtractor();
		return employeeExtractor.extractData(resultset);
	}

}
