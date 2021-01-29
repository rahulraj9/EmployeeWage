public class  EmpWage{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HRS = 20;
    public static final int MAX_EMP_WORKING_DAYS_IN_MONTH = 20;
    public static final int EMP_MAX_WORKING_HRS_IN_MONTH = 40;
    public static void main(String [] args){
		int empWage =0, empWorkingHrs =0, totalEmpWorkingHrs = 0, totalWage = 0, totalWorkingDays = 0;

		while(totalEmpWorkingHrs <=  EMP_MAX_WORKING_HRS_IN_MONTH && totalWorkingDays < MAX_EMP_WORKING_DAYS_IN_MONTH) {
			
			totalWorkingDays++;
			int EmpPresent = (int)Math.floor(Math.random() * 10) % 3;
			
			switch(EmpPresent){
				case IS_PART_TIME:
					System.out.print("Part Time Work\t\t\t\t");
					empWorkingHrs = 4;
					break;
				case IS_FULL_TIME:
					System.out.print("Full Time Work\t\t\t\t");
					empWorkingHrs = 8;
					break;
				default:
					empWorkingHrs = 0;
					System.out.print("Employee is not Present\t\t\t");
			}		
			totalEmpWorkingHrs +=empWorkingHrs; 
			System.out.print(" Days:- " +totalWorkingDays +"\tWorking HRs:- " +empWorkingHrs+"\n");
			totalWage = totalEmpWorkingHrs * EMP_RATE_PER_HRS; 
		}
		
		System.out.println("Employee TotalWage:\t"+totalWage+"\tEmployee Total Working Hrs:\t"+totalEmpWorkingHrs);
	}
}

