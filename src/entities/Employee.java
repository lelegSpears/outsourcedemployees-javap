package entities;

public class Employee {
	private String name;
	private int hour;
	private double valuePerHour;
	
	public Employee() {
		
	}
	
	public Employee(String name, int hour, double valuePerHour) {
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}
	
	@Override
	public String toString() {
    return "Employee: "
            + name
            + ", Hours: "
            + hour
            + ", Value per hour: "
            + String.format("%.2f", valuePerHour);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		double basePayment = hour * valuePerHour;
		return basePayment;
	}
}

