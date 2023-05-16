package jpaMapeamentos_n_n;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Department.java;
import Employee.java;


public class ManyToMany {
	EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpaMapeamentos_n_n");
	EntityManagerFactory entitymanager = emfactory.createEntityManager();
	
	 entitymanager.getTransaction( ).begin( );
	
	//Criando a entidade departamento
	Department department = new Department("Desenvolvedor",null);
	Department department2 = new Department("Informatica",null);
	Department department3 = new Department("Contabilidade",null);
	
	entitymanager.persist(department); //salvar o departamento no bd
	entitymanager.persist(department2); //salvar o departamento2 no bd
	entitymanager.persist(department3); //salvar o departamento3 no bd
	
	//Criando um grupo de departamentos1
	List<Department> departmentSet1 = new ArrayList();
	departmentSet1.add(department);
	//departmentSet1.add(department2);
	
	//Criando um grupo de departamentos2
		List<Department> departmentSet2 = new ArrayList();
		departmentSet2.add(department);
		//departmentSet2.add(department2);
		
		//Criando um grupo de departamentos1
		List<Department> departmentSet3 = new ArrayList();
		departmentSet3.add(department);
		//departmentSet3.add(department3);
		
		Employee employee1 = new Employee();
		employee1.setEname("Satish");
		employee1.setSalary("Satish");
		employee1.setDeg("Satish");
		employee1.setdepartmentSet(departmentSet1);
		
		Employee employee2 = new Employee();
		employee1.setEname("Andre");
		employee1.setSalary(70000.0);
		employee1.setDeg("Researcher");
		employee1.setdepartmentSet(departmentSet2);
		
		Employee employee3 = new Employee();
		employee1.setEname("Ana");
		employee1.setSalary(50000.0);
		employee1.setDeg("Professor");
		employee1.setdepartmentSet(departmentSet3);
		
		entitymanager.persist(employee1); 
		entitymanager.persist(employee2); 
		entitymanager.persist(employee3);
		
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( s;
	
	}
}
