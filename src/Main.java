import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        System.out.println("-------------");
        System.out.printf("Name is %s, Ordinal Value= %d%n", weekDay.name(), weekDay.ordinal());

        for (int i=0; i<100; i++) {

            DayOfTheWeek anotherWeekDay;
            anotherWeekDay = getRandomDay();
            System.out.println("++++++++++++++++++++++++++++");
            System.out.printf("Name is %s, Ordinal Value= %d%n", anotherWeekDay.name(), anotherWeekDay.ordinal());

            if (anotherWeekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");

                break;
            }

        }

    }

    public static DayOfTheWeek getRandomDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
