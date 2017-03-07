package que2_3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListMain {

	public static void main(String[] args) {
		List<String> sList = new LinkedList<>();
		sList.add("green");
		sList.add("red");
		sList.add("blue");
		Predicate<String> pd = new Predicate<String>() {

			@Override
			public boolean test(String t) {

				return t.startsWith("b");
			}
		};
		sList.removeIf(s -> s.startsWith("b"));
		
		Consumer<String>con=new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		sList.forEach(t->System.out.println(t));
		LinkedList<String> sList1 = new LinkedList<>();
		List<Short> shortList = new ArrayList();
		shortList.add((short) 1);
		Collections.sort(sList);
		List<student> student = new ArrayList<>();
		Collections.sort(student);
		Collections.sort(student, (s1, s2) -> s1.getCity().compareTo(s2.getCity()));

	}

}
