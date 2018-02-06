package com.aelliott.samplelibrary;


public class stuff
{
    public stuff()
    {
        // Do nothing
    }

    /**
     * This is a basic helper function to help greet someone.
     * @param name Person to greet.
     * @return A string that says hello to the person.
     */
    public String greet(String name)
    {
        return "Hi! " + name;
    }

    /**
     * Adds two integers together.
     * @param x First integer number.
     * @param y Second integer number.
     * @return The addition of the two integer numbers and returns an integer.
     */
    public int add(int x, int y)
    {
        return x + y;
    }

    /**
     * Subtracts two integers.
     * @param x First integer number.
     * @param y Second integer number.
     * @return The subtraction of the two integer numbers and returns an integer.
     */
    public int subtract(int x, int y)
    {
        return x - y;
    }

    /**
     * Multiplies two integers together.
     * @param x First integer number.
     * @param y Second integer number.
     * @return The multiplication of the two integer numbers and returns an integer.
     */
    public int multiply(int x, int y)
    {
        return x * y;
    }

    /**
     * Divides two integers together.
     * @param x First integer number.
     * @param y Second integer number.
     * @return The divsion of the two integer numbers and returns a float.
     */
    public float divide(int x, int y)
    {
        return x / y;
    }

    /**
     * @exclude
     */
    public float divide2(int x, int y)
    {
        return x / y;
    }
}
