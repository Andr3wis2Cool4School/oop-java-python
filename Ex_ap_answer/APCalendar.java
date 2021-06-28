public class APCalendar{
    private static boolean isLeapYear(int year){
        boolean isLeap = false;

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;

            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }

    public static int numberOfLeapYears(int year1, int year2){
        int count = 0;
        for (int y = year1; y <= year2; y ++){
            if (isLeapYear(y)){
                count ++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        System.out.println(isLeapYear(2020));
        System.out.println(numberOfLeapYears(2000, 2200));
    }
}