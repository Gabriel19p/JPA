package jpaMapeamentos_n_n;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToMany {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpaMapeamentos_n_n");
        EntityManager entityManager = emFactory.createEntityManager();

        entityManager.getTransaction().begin();

        // Criando a entidade departamento
        Department department = new Department("Desenvolvedor", null);
        Department department2 = new Department("Informatica", null);
        Department department3 = new Department("Contabilidade", null);

        entityManager.persist(department); // salvar o departamento no bd
        entityManager.persist(department2); // salvar o departamento2 no bd
        entityManager.persist(department3); // salvar o departamento3 no bd

        // Criando um grupo de departamentos1
        List<Department> departmentSet1 = new ArrayList<>();
        departmentSet1.add(department);
        // departmentSet1.add(department2);

        // Criando um grupo de departamentos2
        List<Department> departmentSet2 = new ArrayList<>();
        departmentSet2.add(department);
        // departmentSet2.add(department2);

        // Criando um grupo de departamentos1
        List<Department> departmentSet3 = new ArrayList<>();
        departmentSet3.add(department);
        // departmentSet3.add(department3);

        Employee employee1 = new Employee();
        employee1.setEname("Satish");
        employee1.setSalary(45000.0);
        employee1.setDeg("Technical Writer");
        employee1.setDepartmentSet(departmentSet1);

        Employee employee2 = new Employee();
        employee2.setEname("Andre");
        employee2.setSalary(70000.0);
        employee2.setDeg("Researcher");
        employee2.setDepartmentSet(departmentSet2);

        Employee employee3 = new Employee();
        employee3.setEname("Ana");
        employee3.setSalary(50000.0);
        employee3.setDeg("Professor");
        employee3.setDepartmentSet(departmentSet3);

        entityManager.persist(employee1);
        entityManager.persist(employee2);
        entityManager.persist(employee3);

        entityManager.getTransaction().commit();
        entityManager.close();
        emFactory.close();
    }
}
