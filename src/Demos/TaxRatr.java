package Demos;

class TaxRatr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double salary = 35000.0;
		Double taxRate, income;
		
		if( salary < 15000) {
			taxRate = 0.1;
		}else if( salary >= 15000 && salary <= 40000) {
			taxRate = 0.2;
		}else {
			taxRate = .3;		
		}
		
		income = taxRate * salary;
		
		System.out.println("Tax Rate : " + taxRate);
		System.out.println("Income : " + income);

	}

}
