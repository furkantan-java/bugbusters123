package day44;

public class Slack {
    protected String name;
    protected String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void sendMessage(){
        System.out.println("Sending message");
    }

    public void callSomeone(){
        System.out.println("calling");
    }

    public void addEmoji(){
        System.out.println("added emoji");
    }
}
