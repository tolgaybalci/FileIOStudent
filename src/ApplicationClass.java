import java.util.Scanner;

public class ApplicationClass {

	public static void main(String[] args) {

		String input;
		String id;
		String name;
		String department;
		int grade;

		Student student = new Student();

		FileOperation fileIO = new FileOperation();

		fileIO.createDirectoy("/home/tolgay/Students");
		Scanner scan = new Scanner(System.in);
		System.out.println("Çıkmak istiyor musunuz: ");
		input = scan.next();
		while (!input.equals("evet")) {
			
			System.out.print("id giriniz: ");
			id = scan.next();
			System.out.print("id : " + id);
			student.setId(id);

			System.out.print("ad giriniz: ");
			name = scan.next();
			System.out.print("name : " + name);
			student.setName(name);

			fileIO.createFile("/home/tolgay/Students/" + name);

			System.out.print("department giriniz: ");
			department = scan.next();
			scan.nextLine();
			System.out.print("department : " + department);
			student.setDepartment(department);

			System.out.print("Grade giriniz: ");
			grade = scan.nextInt();
			System.out.print("grade : " + grade);
			student.setGrade(grade);

			fileIO.writeFile("/home/tolgay/Students/" + name, student.toString());
			
			System.out.println("Çıkmak istiyor musunuz: ");
			input = scan.next();

		}
	}
}
