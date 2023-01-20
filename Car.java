

public class Car {
    String Speed = "";
    String color = "red";
    public Car(String clr){
        color = clr;
        System.out.println("You are driving a " + color + "car");
    }
    public void calibrate_speedometer(String setting){
        Speed = setting;
    }
    public void accelerate(String setting){
        calibrate_speedometer(setting);
        System.out.println("Accerating-......setting speedometer to " + setting);
    }
    public String Drive(char direction,double speed,String setting){
        accelerate(setting);
        String action = "At a standstill";
        switch(direction){
            case 'n':
                action ="heading north at a speed of "+ speed + setting;
                System.out.println(action);
                break;
            case 's':
                action ="heading south at a speed of "+ speed + setting;
                System.out.println(action);
                break;
            case 'e':
                action ="heading east at a speed of "+ speed + setting;
                System.out.println(action);
                break;
            case  'w':
                action ="heading west at a speed of "+ speed + setting;
                System.out.println(action);
                break;
            default:
                action = "Roaming at the speed of " + speed + setting;
                System.out.println(action);
        }
        return action;
    }
    public String Break(){
        String stop = "breaking..";
        System.out.println(stop);
        System.out.println("Stopped!! speed 0.0 km/hr");
        return stop;
    }    
}
