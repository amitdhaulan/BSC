package employee.domain;

import java.util.Date;

public class Employee {
	Date start_date;
	Date end_date;
	int id;
	String first_name;
	String last_name;
	float salary;
	String city;
	String description;
	int duplicacy;

	public int getDuplicacy() {
		return duplicacy;
	}

	public void setDuplicacy(int duplicacy) {
		this.duplicacy = duplicacy;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * public boolean equals(Object o) { if (o == null) { return false; } if (o
	 * == this) { return true; } if (getClass() != o.getClass()) { return false;
	 * }
	 * 
	 * Employee e = (Employee) o; return (this.getDuplicacy() ==
	 * e.getDuplicacy());
	 * 
	 * }
	 * 
	 * @Override public int hashCode() { return this.getDuplicacy(); }
	 */
	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			Employee employee = (Employee) object;
			if (this.getDuplicacy() == employee.getDuplicacy()
					&& this.duplicacy == employee.getDuplicacy()) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		return getDuplicacy();
	}
}
