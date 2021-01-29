public class  EmpWage{
	public static void main(String [] args){
		int empWage =0;
		int isPresent = 1;
		int empRatePerHrs = 20;
		int empHrs =0;
		
		double empPresent = Math.floor(Math.random() * 10) % 2;
		
		if(empPresent == isPresent){
			System.out.println("Employee is Present");
			empHrs = 8;
		}
		else{
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		
		empWage = empHrs * empRatePerHrs;
		System.out.println("Employee Wage:\t"+empWage);
	}
}



