package ru.mirea.lab_2;

public class Human  {

    private Head head = new Head();
    private Hand hand = new Hand();
    private Leg leg = new Leg();

    private String name;

    public Human()
    {
        this.name = "None";
    }
    public void setHead(int size, String hairColor)
    {
        this.head = new Head(size, hairColor);
    }
    public void setHand(int amount, double length)
    {
        this.hand = new Hand(amount, length);
    }
    public void setLeg(int amount, double length )
    {
        this.leg = new Leg(amount, length);
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }


    @Override
    public String toString()
    {
        return this.name+" has " + this.hand.getAmount()+" hands, " + this.leg.getAmount() + " legs, and " + this.head.getSize() + " size head.";
    }

}

