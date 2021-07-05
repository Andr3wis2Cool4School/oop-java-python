class StepTracker{
    private int minSteps;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;

    public StepTracker(int threshold){
        minSteps = threshold;
        totalSteps = 0;
        numDays = 0;
        numActiveDays = 0;
    }

    public void addDailySteps(int steps){
        totalSteps += steps;
        numDays++;
        if (steps >= minSteps){
            numActiveDays++;
        }
    }

    public int activeDays(){
        return numActiveDays;
    }

    public double averageSteps(){
        if (numDays == 0){
            return 0.0;
        }
        else{
            return (double) totalSteps / numDays;
        }
    }
}


public class ex2 {
    public static void main(String args[]){
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}


