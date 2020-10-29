package ru.mirea.ikbo2019.bunch_of_chairs;

public class Client implements Chair {
    public Chair chair;

    public void sit() {
        System.out.println("The client is sitting on a " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}