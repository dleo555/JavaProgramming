package day47_inheritance_2;

public class SlackUser {
        String name;
        String status;
        public void sendMessage (String msg){
            System.out.println("Slack user: " + name + " is typing...[" + msg + "]");
        }
        public void callSomeone (){
            System.out.println("Slack user: " + name + " is calling");
        }
        public void addEmoji (String emoji){
            System.out.println("Slack user: " + name + " adding emoji...[" + emoji + "]");
        }
}
