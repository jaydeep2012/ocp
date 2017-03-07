package que2_3_4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class setMain {

	public static void main(String[] args) {
		Set<String>colors=new HashSet<>();
		colors.add("Green");
		colors.add("Blue");
		colors.add("Blue");
		System.out.println(colors.size());
		for(String color:colors){
			System.out.println(color);
		}
		
		student s1 =new student("John","Lewisville");
		student s2 =new student("John","Irving");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Set<student>students=new HashSet<>();
		students.add(s1);
		students.add(s2);
		System.out.println(students.size());
		for(student s:students){
			System.out.println(s);
		}
		Set<String>colorSet=new TreeSet<>();
		colorSet.add("Red");
		colorSet.add("Green");
		colorSet.add("Yellow");
		colorSet.add("Red");
		for(String s:colorSet){
			System.out.println(s);
		}
		Set<Employee>emp=new TreeSet<>(Collections.reverseOrder());
		Employee e1=new Employee("abc1","John","Lewisville");
		Employee e2=new Employee("abc2","John","Irving");
		Employee e3=new Employee("abc3","Adam","NewYork");
		Employee e4=new Employee("abc4","Adam","Lewisville");
		Employee e5=new Employee("abc5","John","Irving");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		for(Employee e:emp){
			System.out.println(e);
		
	}
		Comparator<Employee>comp=new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getEmpid().compareTo(o2.getEmpid());
			}
		};
		Comparator<Employee>comp1=(o1,o2)->o1.getEmpid().compareTo(o2.getEmpid());
		Set<Employee>emp1=new TreeSet<>(comp1);
		emp1.add(e1);
		emp1.add(e2);
		emp1.add(e3);
		emp1.add(e4);
		emp1.add(e5);
		for(Employee e:emp1){
			System.out.println(e);

}
		NavigableSet<Integer>navset1= new TreeSet<>();
		navset1.add(1);
		navset1.add(2);
		navset1.add(3);
		navset1.add(4);
		navset1.add(5);
		System.out.println(navset1.ceiling(3));
		System.out.println(navset1.floor(3));
		System.out.println(navset1.higher(3));
		System.out.println(navset1.lower(3));
		
		NavigableSet<String>navset2= new TreeSet<>();
		navset2.add("ONE");
		navset2.add("One");
		navset2.add("one");
			System.out.println(navset2);
			System.out.println(navset2.ceiling("on"));
			System.out.println(navset2.floor("ON"));
			System.out.println(navset2.higher("On"));
			System.out.println(navset2.lower("ONe"));
			navset2.pollFirst();
			navset2.pollLast();
			System.out.println(navset2);
		
		
		
			
		

}
	


}
