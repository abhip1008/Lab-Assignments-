public class PermanentHire extends SalariedWorker{

    private double monthlyBonus;

    public PermanentHire(String name, int social, double monthlySalary, double monthlyBonus) {
        super(name, social, monthlySalary);
        this.monthlyBonus = monthlyBonus;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        if(monthlyBonus >= 0) {
            this.monthlyBonus = monthlyBonus;
        }
    }

    @Override
    public double calculateWeeklyPay() {
        double totalMonthly = super.calculateWeeklyPay() * 4;
        return (totalMonthly + monthlyBonus) / 4;
    }
}
