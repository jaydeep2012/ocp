package que2_3_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapMain {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Ram", 10);
		map.put("Raja", 10);
		map.put("Rani", 10);
		map.put("Raj", 10);
		map.put("Raj", 8);
		System.out.println(map);
		System.out.println(map.size());
		
		student s1 = new student("John", "Lewisville");
		s1.setState("NY");
		student s2 = new student("John", "NEW J");
		s2.setState("NJ");
		student s3 = new student("John", "Lewisvill");
		s3.setState("TX");
		
		Map<student, Integer> maprank = new HashMap<>();
		maprank.put(s1, 1);
		maprank.put(s2, 2);
		maprank.put(s3, 3);
		System.out.println(maprank);
		System.out.println(maprank.size());
		int x = maprank.get(s1);
		System.out.println(x);
		
		Map<student, List<Integer>> maprank1 = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		maprank1.put(s1, list);
		maprank1.get(s1).add(2);
		System.out.println(maprank1);
		
		for(Map.Entry<student, Integer>entry:maprank.entrySet()){
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		};
		BiConsumer<student,Integer>bc=new BiConsumer<student, Integer>() {
			
			@Override
			public void accept(student t, Integer u) {
				System.out.println(t);
				System.out.println(u);
				
			}
		};
		maprank.forEach((t,u)->{System.out.println(t);System.out.println(u);});

	}


	}


