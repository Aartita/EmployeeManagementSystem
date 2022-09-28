package employeemanagement;
	

	import java.io.Serializable;
	import java.time.LocalDate;
import java.util.Objects;

	public class Employee {
		
		private int id;
		private String name;
		private int  age;
		private String desiganation;
		private String department;
		private double salary;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDesiganation() {
			return desiganation;
		}
		public void setDesiganation(String desiganation) {
			this.desiganation = desiganation;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desiganation=" + desiganation
					+ ", department=" + department + ", salary=" + salary + "]";
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return id == other.id;
		}
		public Employee(int id, String name, int age, String desiganation, String department, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.desiganation = desiganation;
			this.department = department;
			this.salary = salary;
		}
		
		
		
		
		
		

	}
	



