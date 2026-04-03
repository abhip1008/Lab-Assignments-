public class Consultant extends HourlyWorker{

    private static final int PART_TIME_HOURS = 20;
    private static final double CONSULTANT_RATE = 3.0;

    public Consultant(String name, int social) {
        super(name, social, CONSULTANT_RATE);
    }

    @Override
    public double calculateWeeklyPay() {
        return PART_TIME_HOURS * CONSULTANT_RATE;
    }
}
