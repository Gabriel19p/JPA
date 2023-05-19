package jpaMapeamentos_n_n;

import java.util.List; 
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToMany (targetEntity=Employee.class)
	private List employeeSet;


	public Department() {
		super();
	}

	public Department(String name, Set<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.employeeSet = employeeSet;
	}

	// Getters and setters

}
