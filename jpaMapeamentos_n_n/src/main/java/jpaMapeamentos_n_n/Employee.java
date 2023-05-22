package jpaMapeamentos_n_n;

import java.util.List; 
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private double salary;
	private String deg;

	@ManyToMany
	@JoinTable(name = "Employee_department", joinColumns = @JoinColumn (name = "employee_eid"), inverseJoinColumns = @JoinColumn(name = "department_id"))

	public Employee(int eid, String ename, double salary, String deg, Set<Department> departmentSet) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
		this.departmentSet = departmentSet;
	}

	public Employee() {
		super();
	}

	public void setEname(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSalary(double d) {
		// TODO Auto-generated method stub
		
	}

	public void setDeg(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDepartmentSet(List<Department> departmentSet1) {
		// TODO Auto-generated method stub
		
	}

	// Getters and setters
}
