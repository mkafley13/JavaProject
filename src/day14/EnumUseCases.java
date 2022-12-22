package day14;

import java.util.EnumSet;

public class EnumUseCases {

    public static void main(String[] args) {

        System.out.println(WeekDay.SUNDAY);
        System.out.println(WeekDay.SUNDAY.getAbbr());

        EnumSet<WeekDay> weekDays = EnumSet.allOf(WeekDay.class);
        System.out.println(weekDays);

        EnumSet<WeekDay> workingDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        System.out.println(workingDays);

        EnumSet<WeekDay> specificDays = EnumSet.of(WeekDay.MONDAY, WeekDay.WEDNESDAY, WeekDay.FRIDAY);
        System.out.println(specificDays);

        EnumSet<WeekDay> emptyWeekDays = EnumSet.noneOf(WeekDay.class);
        System.out.println(emptyWeekDays);

        emptyWeekDays.add(WeekDay.SATURDAY);
        System.out.println(emptyWeekDays);

        System.out.println(WeekDay.THURSDAY.ordinal()); //to find its position

        saveToDatabase(emptyWeekDays);

    }

    private static void saveToDatabase(EnumSet<WeekDay> emptyWeekDays) {
        for (WeekDay weekDay : emptyWeekDays) {
            System.out.println(weekDay.getAbbr());
            System.out.println(weekDay.toString());

        }
    }
}
