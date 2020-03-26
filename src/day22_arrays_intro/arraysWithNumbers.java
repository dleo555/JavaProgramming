package day22_arrays_intro;

public class arraysWithNumbers {
    public static void main(String [] args){
        int [] numsArray = new int [5];
        numsArray [0] = 1;
        numsArray [1] = 2;
        numsArray [2] = 3;
        numsArray [3] = 4;
        numsArray [4] = 5;
        //==============================================================
                            //0  1   2    3  4
        int [] numArray2 = {44, 33, 22, 11, 1};
        //==============================================================
        int [] numArray3 = new int[] {33, 55 , 44, 66};
//-------------------------------------------------------------------------------------------------
        //practice
        int [] numArray4 = {23, 45, 100};
        //print size of array
        System.out.println(numArray4.length);
        //print the sum of array
        System.out.println(numArray4[0]+numArray4[1]+numArray4[2]);
        //print the last number of array
        System.out.println(numArray4 [numArray4.length -1]);
        //print all array using for loop
        for (int i = 0; i <= numArray4.length -1; i++) {
            System.out.print(numArray4 [i] + " ");
        }
        //print numbers >=100
        System.out.println();
        for (int i = 0; i < numArray4.length; i++) {
            if (numArray4 [i] >= 100){
                System.out.println(numArray4 [i]);
            }
        }
//print reverse order
        for (int i = numArray4.length -1; i >=0 ; i--) {
            System.out.println(numArray4 [i]);

        }
    }
}
