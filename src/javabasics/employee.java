package javabasics;

public class employee {
	String firstname;
	String lastname;
	double salary;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String a[]) {
		employee emp1=new employee();
		employee emp2=new employee();
		emp1.setFirstname("sugan");
		emp1.setLastname("S");
		emp1.setSalary(10000);
		emp2.setFirstname("virat");
		emp2.setLastname("A");
		emp2.setSalary(15000);
		
	
		System.out.println("emp1 salary = "+emp1.getSalary());
		System.out.println("emp1 salary = "+emp2.getSalary());
		double Salary=emp1.getSalary()*1.1;
		double Salary2=emp2.getSalary()*1.1;
		System.out.println("Incremented Salary emp1 ="+Salary);
        System.out.println("Incremented Salary emp2 ="+Salary2);		
	}

}
