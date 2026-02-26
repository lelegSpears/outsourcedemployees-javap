package entities;

public class OutSourcedEmployee extends Employee {
	private double additionalCharge;
	
	public OutSourcedEmployee() {
	}
	
	public OutSourcedEmployee(String nome, int hour, double valuePerHour, double additionalCharge) {
		super(nome, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		double basePayment = super.payment();
		double bonus = additionalCharge * 1.1;
		return basePayment + bonus;
	}
}

