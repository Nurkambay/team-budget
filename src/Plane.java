public class Plane extends Vehicle {
    int ceiling;

    public Plane(int ceiling,String nickname, Person owner, int maxPassenger)
    {
        super(maxPassenger,nickname,owner);
        ceiling = this.ceiling;
    }

    public int getCeiling() {
        return ceiling;
    }

    void doABarrelRoll(){
        System.out.println("Barrel Roll");
    }
}