public class MonthlyWage {
   public static void main(String[] args){
      final int WAGE_PER_HOUR = 20;
      final int FULL_DAY_HOUR =8;
      final int WORKING_DAYS_PER_MONTH = 20;
      int monthlyWage = WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAYS_PER_MONTH;
      System.out.println("The monthly wage of the employee is: " + monthlyWage);
   }
}
