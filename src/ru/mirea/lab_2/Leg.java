package ru.mirea.lab_2;

public class Leg {
    private int amount;
    private double length;

    public Leg(int amount, double length)
    {
        this.amount = amount;
        this.length = length;
    }
    public Leg()
    {
        this.amount = 0;
        this.length = 0.0;
    }

    public int getAmount()
    {
        return this.amount;
    }
    public double getLength()
    {
        return this.length;
    }
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
}

