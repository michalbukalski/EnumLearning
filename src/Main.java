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

//            System.out.println("++++++++++++++++++++++++++++");
//            System.out.printf("Name is %s, Ordinal Value= %d%n", anotherWeekDay.name(), anotherWeekDay.ordinal());
//
//            if (anotherWeekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found a Friday!!!");
//
//                break;
//            }

            switchDayOfWeek(anotherWeekDay);
        }

    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay){
            case WED -> System.out.println("Wednesday is day " + weekDayInteger);
//            case FRI -> System.out.println("Friday is day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() +
                    "day is day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
