package day45_static_2;

public class StaticBlock {
    //static Block - runs first and once
    static {
        System.out.println("Static Block - once before everything");
    }
    public StaticBlock () {
        System.out.println("Constructor - everytime object is created");
    }
    public static void staticMethod () {
        System.out.println("Static Method");
    }
    public static class InnerClass {
        public static void innerClassStaticMethod () {
            StaticBlock.staticMethod();
            StaticBlock stbObj = new StaticBlock();
            StaticBlock stbObj2 = new StaticBlock();

        }
    }
}
