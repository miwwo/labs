package ru.mirea.lab_2;

public class Head {
    private int size;
    private String hairColor;

    public Head(int size, String hairColor)
    {
        this.size = size;
        this.hairColor = hairColor;
    }
    public Head()
    {
        this.size = 0;
        this.hairColor = "bold";
    }

    public int getSize()
    {
        return this.size;
    }
    public String getHairColor()
    {
        return this.hairColor;
    }
    public void setSize(int size)
    {
        this.size = size;
    }
    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }
}

