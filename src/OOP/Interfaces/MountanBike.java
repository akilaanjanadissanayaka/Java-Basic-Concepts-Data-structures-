package OOP.Interfaces;

public class MountanBike implements Bicycle{
    private int height;
    private int gear;
    private int speedup;

    @Override
    public void applyBrake(int x){
        System.out.println("Im apply braeks implementation");

    }

    @Override
    public void speedUp(int x){
        System.out.println("Im apply braeks implementation");

    }

    public MountanBike(int height, int gear, int speedup) {
        this.height = height;
        this.gear = gear;
        this.speedup = speedup;
    }

    @Override
    public String toString() {
        return "MountanBike{" +
                "height=" + height +
                ", gear=" + gear +
                ", speedup=" + speedup +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeedup() {
        return speedup;
    }

    public void setSpeedup(int speedup) {
        this.speedup = speedup;
    }
}
