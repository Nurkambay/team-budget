
public class Plane extends Vehicle {
    int ceiling;

    public Plane(String nickname, Person owner, int maxPassenger, int ceiling) {
        this.ceiling = ceiling;
        this.nickname = nickname;
        this.owner = owner;
        this.maxPassengers = maxPassenger;
    }

    public int getCeiling() {
        return this.ceiling;
    }

    void doABarrelRoll() {
        System.out.println("Barrel Roll");
    }
}