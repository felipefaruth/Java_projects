package entities;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	

	public void addContract(HourContract contract) {
		
	}
	
	public void removeContract(HourContract contract) {
		
	}
	
	public double Income(int year, int month) {
		return baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "name =" + name
				+ ", level =" + level 
				+", baseSalary =" + baseSalary;
	}
	
	
}


