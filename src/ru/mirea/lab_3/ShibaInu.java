package ru.mirea.lab_3;

public class ShibaInu extends Dog{

    public ShibaInu(){};
    public ShibaInu(String color, String size, int age){
        this.color=color;
        this.size=size;
        this.age=age;
    }

    @Override
    public void getVoice() {
        System.out.printf("Woof!\n");
    }

    @Override
    public void toHumanAge() {
        this.humanAge = this.age*7;
    }
    @Override
    public String dogSparkle(){
        return "cute!";
    }

}
