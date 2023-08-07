package Day4;

class Employe {
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Praveen";
		sal = 2750.75f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}


	public static void main(String[] args) 
	{
		//-- create an instance of Employee type
		Employee1 emp = new Employee1();

		//-- access the state of instance using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//-- access the state of instance using reference and method
		emp.getDetails();

		//-- change the state of instance using reference
		emp.empno = 101;
		emp.name = "Sanjay";
		emp.sal = 2500f;
		emp.getDetails();

		//-- change the state of instance using reference and method
		emp.getDetails();
		emp.getDetails();
	}

}
