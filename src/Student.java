
public class Student {

	private String id;
	private String name;
	private String department;
	private int grade;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void getControlOfId() throws IdException {

		if (id.length() != 11) {
			throw new IdException();
		}
	}

	public void gradeControl() {

		if (grade > 100 || grade < 0) {

			try {

				throw new GradeException();

			}

			catch (Exception e) {

				System.out.println("Grade 0 ile 100 arasında değildir.");
			}
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", grade=" + grade + "]";
	}
	
	
}
