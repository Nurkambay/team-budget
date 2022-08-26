public class Boat extends Vehicle {
    int length;
    int worth;
    public Boat(int length, int worth, String nickname, Person owner, int maxPassenger)
    {
        super(nickname,owner,maxPassenger);
        length = this.length;
        worth = this.worth;
    }

    public int getLength() {
        return length;
    }

    public int getWorth() {
        return worth;
    }

    void raiseAnchor(){
        System.out.println("Raising anchor");
    }
}