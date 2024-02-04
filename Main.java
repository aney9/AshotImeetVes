import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор здоровья");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Кто вы по гендеру?\n1. Мужчина\n2. Женщина\n3. Выйти");
            int vybor = sc.nextInt();
            if (vybor == 1) {
                System.out.println("Введите Ваш вес: ");
                int ves = sc.nextInt();
                System.out.println("Введите Ваш рост(в метрах): ");
                float rost = sc.nextFloat();
                System.out.println("Введите Ваш возраст: ");
                int vozr = sc.nextInt();
                float IMT = ves / rost / rost;
                System.out.println("Ваш ИМТ: " + IMT);
                double idves = 24.9 * rost * rost;
                double kal = 88.36 + 13.4 * ves + 4.8 * rost - 5.7 * vozr;


                if (IMT > 24.9) {
                    kal = kal - 500;
                    double razn = ves - idves;
                    System.out.println("Рекомендуется снизить вес для достижения идеального веса\n" +
                            "Идеальный вес: " + idves + "\n" +
                            "Необходимо сбросить: " + razn + "\n" +
                            "Рекомендуемый дневной прием калорий: " + kal + "\n");
                } else if (IMT < 18.5) {
                    kal = kal + 500;
                    double razn = idves - ves;
                    System.out.println("Рекомендуется увеличить потребление пищи для набора веса\n" +
                            "Идеальный вес: " + idves + "\n" +
                            "Необходимо набрать: " + razn + "\n" +
                            "Рекомендуемый дневной прием калорий: " + kal + "\n");
                } else {
                    System.out.println("Ваш вес находится в пределах нормы\n" +
                            "Идеальный вес: " + idves + "\n" +
                            "Рекомендуемый дневной прием калорий: " + kal + "\n");
                }
            }
            if (vybor == 2) {
                System.out.println("Введите Ваш вес: ");
                int ves = sc.nextInt();
                System.out.println("Введите Ваш рост(в метрах): ");
                float rost = sc.nextFloat();
                System.out.println("Введите Ваш возраст: ");
                int vozr = sc.nextInt();
                float IMT = ves / rost / rost;
                System.out.println("Ваш ИМТ: " + IMT);
                double idves = 24.9 * rost * rost;
                double kal = 447.6 + 9.2 * ves + 3.1 * rost - 4.3 * vozr;


                if (IMT > 24.9) {
                    kal = kal - 500;
                    double razn = ves - idves;
                    System.out.println("Рекомендуется снизить вес для достижения идеального веса\n" +
                            "Идеальный вес: " + idves + "\n" +
                            "Необходимо сбросить: " + razn + "\n" +
                            "Рекомендуемый дневной прием калорий: " + kal + "\n");
                } else if (IMT < 18.5) {
                    kal = kal + 500;
                    double razn = idves - ves;
                    System.out.println("Рекомендуется увеличить потребление пищи для набора веса\n" +
                            "Идеальный вес: " + idves + "\n" +
                            "Необходимо набрать: " + razn + "\n" +
                            "Рекомендуемый дневной прием калорий: " + kal + "\n");
                } else {
                    System.out.println("Ваш вес находится в пределах нормы\n" +
                            "Идеальный вес: " + idves + "\n" +
                            "Рекомендуемый дневной прием калорий: " + kal + "\n");
                }
            }
            if (vybor == 3)
            {
                break;
            }
        }
    }
}