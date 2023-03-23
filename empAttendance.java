public class EmployeeAttendance {
  public static void main(String[] args) {
    int attendance = (int) (Math.random() * 2);
    if (attendance == 1) {
        System.out.println("Employee is present");
     }else {
             System.out.println("Employee is absent");
     }
   }
}
