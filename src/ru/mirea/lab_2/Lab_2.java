package ru.mirea.lab_2;
/* Создать класс, описывающий тело человека(Human). Для описания
каждой части тела создать отдельные классы(Head, Leg, Hand).
Описать необходимые свойства и методы для каждого класса.
Протестировать работу класса Human.*/
public class Lab_2 extends Human{
    public static void main(String[] args) {
        Human human = new Human();
        human.setHand(5, 2.2);
        human.setHead(7979, "blue");
        System.out.println(human);
    }


}
