package jpaMapeamentos_n_n;

@Entity /* criacao de tabela */
public class Employee {
	
	@Id /*chave primaria */
	@GeneratedValue( strategy= GenerationType.IDENTITY) /*auto incrementa por responsabilidade do bd */
	private int eid;
	private String ename;
	private double salary;
	private String deg;
	
	@ManyToMany(targetEntity=Department.class)
	@JoinColumn(name = "eid", referenceColumnName = "id")
	//private Set departmentSet;
	private List departmentSet;
	
	public Employee(int eid, String ename, double salary, String deg, List departmentSet) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
		this.departmentSet = departmentSet;
	}
	public Employee () {
		super();
		// TODO Auto-generated constructor stub
	}
}
