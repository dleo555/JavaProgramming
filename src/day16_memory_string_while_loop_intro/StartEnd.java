package day16_memory_string_while_loop_intro;

public class StartEnd {
    public static void main(String[] args) {
        String str = "I am a [java] programmer";
        //1. find position of [
        //2.find position of ]
        System.out.println(str.indexOf('['));//add +1
        System.out.println(str.indexOf(']'));// do not add anything
        System.out.println(str.substring(8, 12));
// all in one line
        System.out.println(str.substring(str.indexOf('[') + 1, str.indexOf(']')));
//================================================================================================

        String pattern = "{[]}";
        String word = "java";
        String merged = ""; //={[java]}

        merged = pattern.substring(0,2) + word + pattern.substring(2/*,4 (but unnessary) */);
        System.out.println(merged);
    }
}
