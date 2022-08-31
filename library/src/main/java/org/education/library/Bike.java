package org.education.library;

public class Bike extends Vehicle {
    public Bike(String nickname, Person owner, int maxPassengers) {
        this.nickname = nickname;
        this.owner = owner;
        this.maxPassengers = maxPassengers;
    }
}