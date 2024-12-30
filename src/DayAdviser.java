public class DayAdviser implements Adviser {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Сьогодні " + day + ". Будьте продуктивними на роботі! Виконайте найскладніші завдання.");
            case FRIDAY ->
                    System.out.println("Сьогодні п'ятниця. Happy Friday! Завершіть робочий тиждень з позитивом.");
            case SATURDAY, SUNDAY ->
                    System.out.println("Сьогодні " + day + ". Рекомендуємо відвідати парк, кінотеатр чи провести час з родиною.");
            default ->
                    System.out.println("Невідомий день. Введіть коректний день тижня.");
        }
    }

    public static void main(String[] args) {
        Adviser adviser = new DayAdviser();

        // Перевірка по всіх днях тижня
        for (Day day : Day.values()) {
            adviser.advise(day);
        }
    }
}
