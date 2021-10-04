package lib.employees;

public class OvertimeEmployee extends Employee {

    private int overtimeHours;
    private double overtimeRate;

    public OvertimeEmployee() {
        super();
        overtimeHours = 0;
        overtimeRate = 0;
    }

    public OvertimeEmployee(int hoursWorked, double hourlyRate, int overtimeHours, double overtimeRate) {
        super(hourlyRate, hoursWorked);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    public OvertimeEmployee(Name name, Date dob, Gender gender, double hourlyRate, int hoursWorked, Date paymentDate, int overtimeHours, double overtimeRate) {
        super(name, dob, gender, hourlyRate, hoursWorked, paymentDate);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculatePay() {
        return Math.round(((super.getHoursWorked() - overtimeHours) * super.getHourlyRate()) + (overtimeHours * overtimeRate) * 100.0) / 100.0;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    @Override
    public String toString() {
        return super.toString() + "[overtimeHours=" + overtimeHours + ", overtimeRate=" + overtimeRate + ']';
    }
}
