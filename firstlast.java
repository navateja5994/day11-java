import java.util.*;
class Main{
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(90);
        a.add(89);
        a.add(767);
        System.out.println(a);
        a.addFirst(89);
        System.out.println(a);
        a.addLast(90);
        System.out.println(a);
    }
}