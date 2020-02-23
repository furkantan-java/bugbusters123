package task;

public class Tv {
    String name;
    boolean isOn;
    int currentChannel;
    /**
     * A method to return the value of current channel for the TV
     * @return  the value of current channel for the TV
     */
    public int getCurrentChannel(){
        return currentChannel;

    }

    // w ecan not set a channel if the TV is off!!!
    // valid channel is from 0-50
    public void setCurrentChannel(int newChannel){
        // if my channel is out of range I want to exit from the method
        if(newChannel<0 || newChannel>50){
            System.out.println("Invalid channel");
            return;// early exit from the method
        }
        if(isOn==true){
            currentChannel=newChannel;
        }else{
            System.out.println("TURN ON THE TV FIRST");
        }
    }
    public void turnOn() {
        if (isOn == false) { // checking for equality
            System.out.println("Turning on TV");
            isOn = true; // assigning the value of isOn to true
        }
    }
    public void turnOff() {
        //if(isOn)
        if(isOn==true){
            System.out.println("Turning off TV");
            isOn=false;
        }
    }
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
    public void moveForward(){
        setCurrentChannel(++currentChannel);
        getCurrentChannel();
    }
    public void moveBackward(){
        setCurrentChannel(currentChannel-1);
        getCurrentChannel();
    }
}

//    String brand;
//    boolean isOn;
//    int currentChannel;
//public String toString(){
//    return brand + isOn + currentChannel;
//}
//    public void turnOn() {
//        System.out.println("Turning on TV");
//        if (isOn == false) {
//            isOn = true;
//        }
//    }
//
//    public void turnOff() {
//        if (isOn == true) {
//            System.out.println("Turning off TV");
//            isOn = false;
//        }
//    }
//
//    public int getCurrentChannel() {
//        return currentChannel;
//    }
//
//    public void setCurrentChannel( int channel) {
//        currentChannel = channel;
//        System.out.println(currentChannel);
//    }
//
//    public void moveForward() {
//        if (isOn) {
//            setCurrentChannel(currentChannel + 1);
//            getCurrentChannel();
//        } else {
//            System.out.println("turn on the tv");
//        }
//    }
//    public void moveBackward() {
//        if (isOn) {
//            setCurrentChannel(currentChannel - 1);
//            getCurrentChannel();
//        }else{
//            System.out.println("turn the tv on");
//        }
//    }
//}
