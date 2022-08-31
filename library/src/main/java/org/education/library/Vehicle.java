package org.education.library;

public abstract class Vehicle {

    protected int maxPassengers;
    protected Person owner;
    protected String nickname;
    protected Person driver;

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public boolean drive(Person driver) {
        if (this.driver == null) {
            this.driver = driver;
            return true;
        }
        return false;
    }
    public String textStatus() {
        // There’s excess in those days
        // Of such gizmos anyways
        String result = this.nickname + " the " + this.getClass().getName();
        result += " belongs to ";

        if (this.owner != null)
            result += this.getOwner().getName();
        else
            result += "itself";

        if (this.driver != null)
            result += " and is driven by " + this.driver.getName();
        else
            result += " and walks by itself";
        return result + ".";
    }
}