public class  EmpWage{
	public static void main(String [] args){
		int empWage =0;
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHrs = 20;
		int empHrs =0;
		double empPresent = Math.floor(Math.random() * 10) % 3;
		if(empPresent == isPartTime){
			System.out.println("Part Time Employee");
			empHrs = 4;
		}
		else if(empPresent == isFullTime) {
			System.out.println("Full Time Employee");
			empHrs = 8;
		}
		else{
			System.out.println("Employee is not a part of Organisation");
		}		empWage = empHrs * empRatePerHrs;
		System.out.println("Employee Wage:\t"+empWage);
	}
}



