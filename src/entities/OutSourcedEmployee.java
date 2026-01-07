package entities;

public class OutSourcedEmployee extends Employee {
	private Double additionalCharge;
	
	public OutSourcedEmployee() {
		
	}
	
	public OutSourcedEmployee(String nome, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(nome, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		Double basePayment = super.payment();
		Double bonus = basePayment * additionalCharge;
		return basePayment + bonus;
	}
}
