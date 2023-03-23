public class PartTimeEmployee {
  public static void main(String[] args) {
    final int WAGE_PER_HOUR = 20;
    final int FULL_DAY_HOUR = 8;
    final int PART_TIME_HOUR = 4;
    int fullTimeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
    int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOUR;
    System.out.println("The daily wage of a full-time employee is: " + fullTimeWage);
    System.out.println("The daily wage of a part-time employee is: " + partTimeWage);
   }
}
