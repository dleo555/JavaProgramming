package day47_inheritance_2;

public class SlackWorkspace {
    public static void main(String[] args) {
        SlackUser slackUser = new SlackUser();
        slackUser.name = "Imtiaz";
        slackUser.status = "Coding Java";
        slackUser.sendMessage("Make me Admin please");
        slackUser.callSomeone();
        slackUser.addEmoji("Wooden Spoon");
        System.out.println("---------------------------------------------------------------");

        SlackAdmin slackAdmin = new SlackAdmin();
        slackAdmin.name = "Nadir";
        slackAdmin.status = "If Nadir did it. you can do too";
        slackAdmin.adminID = 12345;
        slackAdmin.sendAtChannelMessage("Keep talking");
        slackAdmin.addEmoji("Bla bla bla");
        slackAdmin.deleteMessage();
        slackAdmin.callSomeone();
        System.out.println("---------------------------------------------------------------");


    }
}
