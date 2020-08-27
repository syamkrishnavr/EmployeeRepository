package org.dxc.mongodb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="employee")
public class Employee {
	@Id
	private int employeeid;
	private String firstname;
	private String lastname;
	private String jobtitle;
	private double salary;
	public Object setEmployeeid;
	

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", jobtitle=" + jobtitle + ", salary=" + salary + "]";
	}


	public void setEmployeeid(int id) {
		// TODO Auto-generated method stub
		
	}

}