package supermarket;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Supermarket {
    private static final List<String> NAMES = List.of(
            "Андрей Иванов",
            "Иван Андреев",
            "Алексей Смирнов",
            "Евгений Баранов",
            "Елена Сидорова",
            "Пётр Матвеев",
            "Матвей Жданов",
            "Марина Пупкина",
            "Анастасия Стрельцова",
            "Максим Дубов",
            "Александр Степанов",
            "Альберт Хайнуллин",
            "Равшан Равшоев",
            "Гасан Гасанов",
            "Марат Муратов",
            "Мурат Акбашев",
            "Екатерина Скворцова",
            "Елена Берёзина"
    );


    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);
        Queue<String> queue3 = new ArrayDeque<>(5);
        queue1.add(NAMES.get(6));
        queue1.add(NAMES.get(7));
        queue2.add(NAMES.get(0));
        queue2.add(NAMES.get(1));
        queue2.add(NAMES.get(3));
        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println();
        addHuman(NAMES.get(8), queue1, queue2,queue3);
        System.out.println(queue1);
        System.out.println(queue2);
        addHuman(NAMES.get(9), queue1, queue2,queue3);
        System.out.println(queue1);
        System.out.println(queue2);
        addHuman(NAMES.get(10), queue1, queue2,queue3);
        System.out.println(queue1);
        System.out.println(queue2);
        addHuman(NAMES.get(11), queue1, queue2,queue3);
        System.out.println(queue1);
        System.out.println(queue2);
        addHuman(NAMES.get(2), queue1, queue2,queue3);
        System.out.println(queue1);
        System.out.println(queue2);
        addHuman(NAMES.get(5), queue1, queue2,queue3);
        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println(queue3);

    }

    public static void addHuman(String s,
                                Queue<String> queue1,
                                Queue<String> queue2,
                                Queue<String> queue3) {
        if (queue1.size() > 4 && queue2.size() > 4) {
            System.out.println("ГАЛЯ! НУЖНО ОТКРЫТЬ ЕЩЁ ОДНУ КАССУ!");
            queue3.offer(s);
            System.out.println(s + " отправлен на 3 кассу!");
            return;
        }
        if (queue1.size() < queue2.size() || queue1.size() == queue2.size()) {
            queue1.offer(s);
            System.out.println(s + " добавлен(а) в первую очередь!");
        } else {
            queue2.offer(s);
            System.out.println(s + " добавлен(а) во вторую очередь!");
        }
    }
}
