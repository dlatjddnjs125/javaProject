package hr;

public class MainExe {
	public static void main(String[] args) {
//		EmpDAO empdao = new EmpDAO ();
//		Employee[] empList = empdao.empList();
//		System.out.println("salary가 5000 이상인 사원정보 >>");
//		for(Employee emp : empList) {
//			if(emp != null &&emp.getSalary() > 5000) {
//				System.out.println(emp.toString());
//			}
//		}
		DepDAO depdao = new DepDAO ();
		Department[] depList = depdao.deptList();
//		System.out.println("부서정보");
		System.out.println();
	}
}
