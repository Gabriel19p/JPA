package jpaMapeamentos_n_n;
import java.util.List;

@Entity
public class Department {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int id;
	private String name;
	
	@ManyToMany(targetEntity=Employee.class)
	//private Set employeeSet;
	private List employeeSet;
	
	public Department() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	public Department(String name, List employeeSet) {
		super();
		this.id = id;
		this.name = name;
		this.employeeSet = employeeSet;
	}
}
