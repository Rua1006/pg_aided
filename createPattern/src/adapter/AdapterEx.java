package adapter;

public class AdapterEx {

	public static void main(String[] args) {
		Student student = new HumanAdapter("강병수", 30);
		student.showName();
		student.showAge();
	}
}