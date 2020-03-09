package javaProgramme;

public class oops_object {
	
	int salary;
	String name;
	int empid;
	int deptno;
	
	//2)Constructor - constructor has same name as class name and dont return anything
	/*oops_object(int sal,String s,int id,int no){
		
		salary = sal;
		name =s;
		empid =id;
		deptno=no;		
		
	}*/
	
	//3) call class through method
	void setdata(int sal,String s,int id,int no){
		
		salary = sal;
		name =s;
		empid =id;
		deptno=no;
		
	}
	
	void display() {
		
		System.out.println(salary);
		System.out.println(name);
		System.out.println(empid);
		System.out.println(deptno);
		
	}

	public static void main(String args[]) {
		
		
	//1) calling class with object
	
	/*oops_object emp1 = new oops_object();
	emp1.empid = 100;
	emp1.deptno = 10;
	emp1.name = "ab";
	emp1.salary=5000;
	emp1.display();
	
	oops_object emp2 = new oops_object();
	emp2.empid = 200;
	emp2.deptno = 20;
	emp2.name = "abc";
	emp2.salary=50000;
	emp2.display();	*/
		
	//2) calling class with constructor
		
		/*oops_object emp3=new oops_object(20000,"asdf",12,13);
		emp3.display();*/
		
	//3) calling class with methods
		
		oops_object emp3=new oops_object();
		emp3.setdata(30000, "Kevin", 20, 21);
		emp3.display();
	}
	
}
