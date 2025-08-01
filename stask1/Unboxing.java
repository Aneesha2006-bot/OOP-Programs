package stask1;

public class Unboxing {

    public static void main(String[] args) {
        Integer a = 3;    
        int i = a.intValue(); 
        int j = a;      

        System.out.println(a + " " + i + " " + j);
    }
}
