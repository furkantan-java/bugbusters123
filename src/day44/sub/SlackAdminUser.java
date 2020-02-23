package day44.sub;

import day44.Slack;

public class SlackAdminUser extends Slack{
    String adminID;

    public static void main(String[] args) {
        SlackAdminUser user = new SlackAdminUser("Akbar", "Realease the horses" , "admin");
        user.sendMessage();
        user.deleteMessage("message1");
        user.addChannel("message1");
        user.addEmoji();
        user.callSomeone();
    }
    public void sendAtChannelMessage(String message){
        System.out.println("Send" + message +"at channel message");
    }

    public void deleteMessage(String message){
        System.out.println("delete " + message +  "message");
    }

    public void addChannel(String channel){
        System.out.println("add " + channel + " channel");
    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminID='" + adminID + '\'' +
                "name='" + this.name + '\'' +
                "status='" + this.status + '\'' +
                '}';
    }

    public SlackAdminUser(String adminID, String name , String status   ) {
        this.adminID = adminID;
        this.name=name;
        this.status=status;
    }
}


