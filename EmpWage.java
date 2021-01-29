public class  EmpWage{
	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PERr_HRS = 20;
	
	public static void main(String [] args){
		int empWage =0;
		int empHrs =0;
		int empPresent = (int)Math.floor(Math.random() * 10) % 3;
		switch(empPresent){
			case IS_PART_TIME:
				System.out.println("Part Time Employee");
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				System.out.println("Full Time Employee");
				empHrs = 8;
				break;
			default:
				System.out.println("Employee is Absent");
		}		
		empWage = empHrs * EMP_RATE_PERr_HRS;
		System.out.println("Employee Wage:\t"+empWage);
	}
}
