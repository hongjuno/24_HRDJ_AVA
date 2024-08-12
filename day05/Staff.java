package day05;

public class Staff extends Person{
	// id
	// private String dept; 담당부서
	
	private String id;
	private String dept;
	
	public Staff(String id, String dept, String name, int age) {
		super(name, age);
		this.id = id;
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String personInfo() {
		String info = super.personInfo();
		info += "\nID: " + id +"\n 담당 부서: " + dept;
		return info;
	}
	
	
	
	
}
