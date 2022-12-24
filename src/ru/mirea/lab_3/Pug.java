package ru.mirea.lab_3;

public class Pug extends Dog{

    public Pug(){};

    public Pug(String color, String size, int age){
        this.color=color;
        this.size=size;
        this.age=age;
    }
    @Override
    public void getVoice() {
        System.out.printf("HrrRRrr....\n");
    }

    @Override
    public void toHumanAge() {
        this.humanAge = this.age*15;
    }
    @Override
    public String dogSparkle(){
        return "relatable..";
    }
}
