public class AirConditioner {
    static final int LOW = 1;
    static final int MEDIUM = 2;
    static final int HIGH = 3;

    private int temperature = 72;
    private int speed = LOW;
    private boolean on = false;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public int getTemperature() {
        return temperature;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean getOn() {
        return on;
    }

    public AirConditioner(){
    }

    public int getPowerConsumption() {
        if (getSpeed() == 1) return 500;
        else if (getSpeed() == 2) {
            return 750;
        } else if (getSpeed() == 3) {
            return 1000;
        }
        else return 0;
    }

    public String toString() {
     if (this.on == false) return "Air conditioner temperature: "
        + this.temperature + ", air conditioner is off";
     else return "Air conditioner temperature : " + this.temperature
             + " degrees Fahrenheit, speed : " + this.speed
             + " power consumption: " + getPowerConsumption()
             + " watts";
    }
}


