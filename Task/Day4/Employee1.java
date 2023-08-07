package Day4;

public class Employee1 {
	
		int empno;
		String name;
		float sal;
		
		 Employee1(){
			System.out.println("******");
			empno = 101;
			name = "Praveen";
			sal = 2750.75f;
		}
		void getDetails(){
			System.out.println(empno + " | " + name + " | " + sal);
		}	
	
	
		public static void main(String[] args) 	{
			Employee1 emp1 = new Employee1();
			Employee1 emp2 = new Employee1();
			Employee1 emp3 = new Employee1();

			emp1.getDetails();
			emp2.getDetails();
			emp3.getDetails();
		}
	}




