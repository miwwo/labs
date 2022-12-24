package ru.mirea.lab_3;

/*Создать абстрактный класс, описывающий собак(Dog). С
помощью наследования реализовать различные породы собак.
Протестировать работу классов.
*/
public abstract class Dog {

    protected String color, size;
    protected int age, humanAge;

    public Dog(){};

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract void getVoice();
    public abstract void toHumanAge();
    public abstract String dogSparkle();

}
