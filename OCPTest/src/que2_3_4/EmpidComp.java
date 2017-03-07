package que2_3_4;

import java.util.Comparator;

public class EmpidComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
	
		return e1.getEmpid().compareTo(e2.getEmpid());
	}

}