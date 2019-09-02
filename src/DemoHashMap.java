import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<Employee,Project1> hash = new HashMap<Employee,Project1>();
		Employee e1 = new Employee(1,"Ankita",10000,"MD");
		Employee e2 = new Employee(2,"Mantasha",20000,"MD");
		Employee e3 = new Employee(3,"Prakahr",30000,"HR");
		Employee e4 = new Employee(1,"Aditee",40000,"CEO");
		
		Project1 p1 = new Project1(10,"ABC",35,"abc");
		Project1 p2 = new Project1(20,"DEF",70,"def");
		Project1 p3 = new Project1(10,"GHI",15,"ghi");
		Project1 p4 = new Project1(40,"JKL",35,"jkl");
		
		hash.put(e1,p1);
		hash.put(e2,p2);
		hash.put(e3,p3);
		hash.put(e4,p4);
		
		System.out.println(hash);
	}
}
