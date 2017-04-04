
public class Student {
	
	String name;
	int num;
	
		
	public static void main(String[] args) {
		Student s = new Student();
		
		s.name="컴퓨터공학과";
		s.num=20155633;
		
		System.out.println("학과:"+s.name+" \n학번:"+s.num);
	}
}
