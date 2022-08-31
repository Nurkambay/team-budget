package org.education.library;

public class Car extends Vehicle {
    private int gas;

    public Car (String nickname, Person owner, int maxPassengers) {
        this.nickname = nickname;
        this.owner = owner;
        this.maxPassengers = maxPassengers;
    }
}
