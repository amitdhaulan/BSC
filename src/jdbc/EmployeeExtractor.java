package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import employee.domain.Employee;

public class EmployeeExtractor implements ResultSetExtractor<Employee> {

	@Override
	public Employee extractData(ResultSet resultset) throws SQLException,
			DataAccessException {
		
		Employee employee = new Employee();
		employee.setId(resultset.getInt(1));
		employee.setFirst_name(resultset.getString(2));
		employee.setLast_name(resultset.getString(3));
		employee.setStart_date(resultset.getDate(4));
		employee.setEnd_date(resultset.getDate(5));
		employee.setSalary(resultset.getFloat(6));
		employee.setCity(resultset.getString(7));
		employee.setDescription(resultset.getString(8));
		employee.setDuplicacy(resultset.getInt(9));
		
		return employee;
	}

}
