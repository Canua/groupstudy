package thisisjava.chapter7;

public class Manager extends Employee {
	private String position;

	public Manager(String empNo, String name, String part, String position) {
		setEmpNo(empNo);
		setName(name);
		setPart(part);
		this.position = position;
	}

	public String addStr() {
		String result = super.resultStr();
		result += "직책 : " + position + "\n";
		return result;
	}
}
