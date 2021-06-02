package simpleclass.one;

import java.time.LocalDate;

class Pet {
	private String name;
	private double weight;
	private LocalDate birthday;
	
	Pet(String inName, double inWeight, LocalDate inBirthday){
		name = inName;
		weight = inWeight;
		birthday = inBirthday;
	}
	
	String petName() {
		return name;
	}
	void summation(int leftOperand, int righttOperand) {
		int sum = leftOperand + righttOperand;
		return ;
	}
}