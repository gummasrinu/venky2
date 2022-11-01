package priya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Empinfo implements Comparable<Empinfo>{
	private Integer empId;
	private String empName;
	private String empAdd;

	

	@Override
	public String toString() {
		return "Empinfo [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	 
	public static void main(String[] args) {
		Empinfo emp = new Empinfo();
		emp.setEmpId(1);
		emp.setEmpName("priya");
		emp.setEmpAdd("hyd");
		Empinfo emp1 = new Empinfo();
		emp1.setEmpId(2);
		emp1.setEmpName("keerthi");
		emp1.setEmpAdd("hyd");
		Empinfo emp2 = new Empinfo();
		emp2.setEmpId(3);
		emp2.setEmpName("siri");
		emp2.setEmpAdd("usa");
		List<Empinfo> L = new ArrayList<>();
		L.add(emp);
		L.add(emp1);
		L.add(emp2);
		
		//Collections.sort(L,Comparator<Empinfo >);
		
		/*
		 * System.out.println(L); for(Empinfo e:L) { if(e.getEmpName().length()>=5)
		 * //if(name.length()>=5) System.out.println(e);
		 * 
		 * }
		 */
		
	}

	@Override
	public int compareTo(Empinfo o) {
		
		return this.getEmpName().compareTo(o.getEmpName());
	}

}
