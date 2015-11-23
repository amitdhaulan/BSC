package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;

import employee.domain.Employee;
import employee.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public String getEmployee() {
		JsonObject outerJsonObject = new JsonObject();

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeService.getEmployeeList();
		Employee employee = new Employee();
		for (int i = 0; i < employeeList.size(); i++) {
			JsonObject jsonObject = new JsonObject();
			employee = employeeList.get(i);

			jsonObject.addProperty("id", employee.getId() + "");
			jsonObject.addProperty("firstName", employee.getFirst_name());
			jsonObject.addProperty("lastName", employee.getLast_name());
			jsonObject.addProperty("startDate", employee.getStart_date()
					.toString());
			jsonObject
					.addProperty("endDate", employee.getEnd_date().toString());
			jsonObject.addProperty("salary", employee.getSalary());
			jsonObject.addProperty("city", employee.getCity());
			jsonObject.addProperty("description", employee.getDescription());
			jsonObject.addProperty("duplicacy", employee.getDuplicacy());

			if (employee.equals(employee))
				outerJsonObject.add("employee" + i, jsonObject);
		}
		System.out.println(outerJsonObject);

		/*
		 * JTextArea textArea = new JTextArea(outerJsonObject.toString());
		 * JScrollPane scrollPane = new JScrollPane(textArea);
		 * textArea.setLineWrap(true); textArea.setWrapStyleWord(false);
		 * scrollPane.setPreferredSize( new Dimension( 500, 300 ) );
		 * JOptionPane.showMessageDialog(null, scrollPane, "",
		 * JOptionPane.PLAIN_MESSAGE);
		 * 
		 * System.out.println("textArea text: "+textArea.getText());
		 */

		return outerJsonObject.toString();

	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET, consumes = { "application/json" }, params = "data", produces = { "application/json" })
	@ResponseBody
	public String addEmployee(@QueryParam("data") String data) {
		System.out.println(data);
		final JPanel panel = new JPanel();
		JOptionPane.showMessageDialog(panel, "response is: " + data, "",
				JOptionPane.DEFAULT_OPTION);
		return "";
	}

}
