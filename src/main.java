public class main {

    public static void main(String[] args) {
        int amount = 200;
        int isRubels = 20;
        boolean isRubles = true;

        int miles;
        if (isRubles) {
            miles = 10;
        } else {
            miles = 1;
        }
        //System.out.println(miles);

        int bonus = amount / 100 * miles;

        if (bonus > 200) {
            bonus = 200;
        }

        System.out.println("Итоговый бонус: " + bonus);
    }
}
// Объявляете переменные для входных данных и
// параметров программы: одну для хранения
// стоимости билета, другую для хранения количества
// рублей для одной бонусной милли

// Рассчитываете количество бонусных милль, используя
// значения заведённых переменных. Ответ сохраняете в
// новую переменную и выводите на экран