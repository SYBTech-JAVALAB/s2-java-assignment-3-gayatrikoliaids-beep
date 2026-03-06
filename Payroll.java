	import java.util.Scanner;

	class Payroll {

	    // a) Salary using employee ID (base salary input)
	    void calculateSalary(int employeeID) {
	        double baseSalary = 30000;
	        System.out.println("Employee ID: " + employeeID);
	        System.out.println("Salary: ₹" + baseSalary);
	    }

	    // b) Salary using hours worked and rate
	    void calculateSalary(int hoursWorked, double rate) {
	        double salary = hoursWorked * rate;
	        System.out.println("Salary (Hours × Rate): ₹" + salary);
	    }

	    // c) Salary using ID with bonus
	    void calculateSalary(int employeeID, double bonus) {
	        double baseSalary = 30000;
	        double totalSalary = baseSalary + bonus;
	        System.out.println("Employee ID: " + employeeID);
	        System.out.println("Salary with Bonus: ₹" + totalSalary);
	    }

	    // d) Salary using annual salary
	    void calculateSalary(double annualSalary) {
	        double monthlySalary = annualSalary / 12;
	        System.out.println("Monthly Salary: ₹" + monthlySalary);
	    }

	    // e) Salary with overtime
	    void calculateSalary(int hoursWorked, double rate, int overtimeHours) {
	        double overtimePay = overtimeHours * (rate * 1.5);
	        double salary = (hoursWorked * rate) + overtimePay;
	        System.out.println("Salary with Overtime: ₹" + salary);
	    }

	    // f) Salary with deductions
	    void calculateSalary(double basicSalary, double deductions, boolean flag) {
	        double finalSalary = basicSalary - deductions;
	        System.out.println("Salary after Deductions: ₹" + finalSalary);
	    }

	    // g) Salary with bonus and deductions
	    void calculateSalary(double basicSalary, double bonus, double deductions) {
	        double finalSalary = basicSalary + bonus - deductions;
	        System.out.println("Salary with Bonus & Deductions: ₹" + finalSalary);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Payroll emp = new Payroll();

	        System.out.println("1. Employee ID");
	        System.out.println("2. Hours & Rate");
	        System.out.println("3. ID with Bonus");
	        System.out.println("4. Annual Salary");
	        System.out.println("5. With Overtime");
	        System.out.println("6. With Deductions");
	        System.out.println("7. With Bonus & Deductions");

	        System.out.print("Enter choice: ");
	        int choice = sc.nextInt();

	        switch (choice) {

	            case 1:
	                System.out.print("Enter Employee ID: ");
	                int id = sc.nextInt();
	                emp.calculateSalary(id);
	                break;

	            case 2:
	                System.out.print("Enter Hours Worked: ");
	                int hours = sc.nextInt();
	                System.out.print("Enter Rate: ");
	                double rate = sc.nextDouble();
	                emp.calculateSalary(hours, rate);
	                break;

	            case 3:
	                System.out.print("Enter Employee ID: ");
	                int id2 = sc.nextInt();
	                System.out.print("Enter Bonus: ");
	                double bonus = sc.nextDouble();
	                emp.calculateSalary(id2, bonus);
	                break;

	            case 4:
	                System.out.print("Enter Annual Salary: ");
	                double annual = sc.nextDouble();
	                emp.calculateSalary(annual);
	                break;

	            case 5:
	                System.out.print("Enter Hours Worked: ");
	                int h = sc.nextInt();
	                System.out.print("Enter Rate: ");
	                double r = sc.nextDouble();
	                System.out.print("Enter Overtime Hours: ");
	                int ot = sc.nextInt();
	                emp.calculateSalary(h, r, ot);
	                break;

	            case 6:
	                System.out.print("Enter Basic Salary: ");
	                double basic = sc.nextDouble();
	                System.out.print("Enter Deductions: ");
	                double ded = sc.nextDouble();
	                emp.calculateSalary(basic, ded, true);
	                break;

	            case 7:
	                System.out.print("Enter Basic Salary: ");
	                double bs = sc.nextDouble();
	                System.out.print("Enter Bonus: ");
	                double b = sc.nextDouble();
	                System.out.print("Enter Deductions: ");
	                double d = sc.nextDouble();
	                emp.calculateSalary(bs, b, d);
	                break;

	            default:
	                System.out.println("Invalid Choice");
	        }

	        sc.close();
	    }
	}

