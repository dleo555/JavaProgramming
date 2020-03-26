package day47_inheritance_2;

public class SlackAdmin extends SlackUser {
    int adminID;
    public void sendAtChannelMessage (String msg){
        System.out.println("Slack Admin " + adminID + " sending @channel " + msg);
    }
    public void deleteMessage () {
        System.out.println("Slack Admin " + adminID + " deleting message...");
    }
}
