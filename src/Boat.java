public class Boat extends Vehicle {
    int length;
    int worth;

    public Boat(String nickname, Person owner, int maxPassenger, int length, int worth) {
        this.length = length;
        this.worth = worth;
        this.nickname = nickname;
        this.owner = owner;
        this.maxPassengers = maxPassenger;
    }

    public int getLength() {
        return length;
    }

    public int getWorth() {
        return worth;
    }

    void raiseAnchor() {
        System.out.println("Raising anchor");
    }
}