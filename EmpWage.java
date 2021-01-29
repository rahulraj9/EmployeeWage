public class  EmpWage{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HRS = 20;
    public static final int EMP_WORKING_DAYS = 2;
	
	public static void main(String [] args){
		int empWage =0;
		int empHrs =0;
		int totalWage = 0;
		for(int Days = 1; Days <= EMP_WORKING_DAYS; Days++){
			 int empPresent = (int)Math.floor(Math.random() * 10) % 3;
			
			 switch(empPresent){
				case IS_PART_TIME:
					System.out.println("Part Time Work");
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					System.out.println("Full Time Work");
					empHrs = 8;
					break;
				default:
					empHrs = 0;
					System.out.println("Employee is not Present");
			}		
			
			empWage = empHrs * EMP_RATE_PER_HRS;
			System.out.println("empWage for Days " +Days +":-" +empWage);
			totalWage += empWage; 
		}
		
		System.out.println("Employee totalWage:\t"+totalWage);
	}
}

