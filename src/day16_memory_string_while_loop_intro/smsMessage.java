package day16_memory_string_while_loop_intro;

public class smsMessage {
    public static void main(String[] args) {
        String message = "Sender: [John Doe] From Number<2024331234>, Message:{Hey, whats up! Let's code some java!}";

        System.out.println("Sender: " + message.substring(message.indexOf('[') + 1, message.indexOf(']')));
        System.out.println("Number: " + message.substring(message.indexOf('<') + 1, message.indexOf('>')));
        System.out.println("Message: " + message.substring(message.indexOf('{') + 1, message.indexOf('}')));
        //   message.substring --> declare range
        //   (message.indexOf('[') + 1, --> find starting point
        //   message.indexOf(']'))); -->find end point
    }
}