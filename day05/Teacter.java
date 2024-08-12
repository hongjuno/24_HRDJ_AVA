package day05;

public class Teacter extends Person{
	private String id;
	private String subject;
	
	public Teacter(String id, String subject, String n, int age) {
		super(n, age);
		this.id = id;
		this.subject = subject;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String personInfo() {
		String info = super.personInfo();
		info += "\nID: " + id +"\n 담당과목: " + subject;
		return info;
	}
	
}
