
public class Student1 {
	
	private String name;
	private int num;
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	public static void main(String[] args) {
		Student1 s =new Student1();
		
		
		s.setName("컴퓨터공학과");
		s.setNum(20155633);
		
		System.out.println("학과: "+s.getName());
		System.out.println("학번: "+s.getNum());
	}
}
