package eu.senla.task1;

public class Main {
    static byte z;
    static short x;
    static int c;
    static long v;
    static double b;
    static float n;
    static char m;
    static boolean l;
    static Byte zByte;
    static Short xShort;
    static Integer cInteger;
    static Long vLong;
    static Double bDouble;
    static Float nFloat;
    static Character mCharacter;
    static Boolean lBoolean;
    static String aString;

    public static void main(String[] args) {
        Number number = new Number();
        number.setA((byte) 21);
        System.out.println(number.getA());

      int e = 22;
      //byte s = e; incompatible types: possible lossy conversion from int to byte
        byte s = (byte)e;
      System.out.println("byte s = "+s); // byte s = 22
      byte d = 14;
      int r= d;
      System.out.println("int r =" +r); //int r =14
      short y = 32;
      //byte c = y;   java: incompatible types: possible lossy conversion from short to byte
        byte c = (byte)y;
      System.out.println("byte c ="+ c); // byte c =32
        int t = 3456;
        double u = t;
        System.out.println("double u ="+u);//double u =3456.0
        double z = 34.897;
        //int l = z;java: incompatible types: possible lossy conversion from double to int
        int l = (int)z;
        System.out.println("int l ="+ l); //int l =34
        float i = 4678.758f;
        double p = i;
        System.out.println("double p ="+i);//double p =4678.758
        long cp = 689908743;
        //int re = cp; java: incompatible types: possible lossy conversion from long to in
        int re = (int)cp;
        System.out.println("int re = "+cp); //int re = 689908743
        boolean q = true;
        //char j = q; java: incompatible types: boolean cannot be converted to char
        //char j= (char) q; java: incompatible types: boolean cannot be converted to char
        String ew = "I am Captain America";
        //char rik = ew;java: incompatible types: java.lang.String cannot be converted to char
       // char rik = (char)ew; java: incompatible types: java.lang.String cannot be converted to char
        //Character rik = ew;java: incompatible types: java.lang.String cannot be converted to java.lang.Character
       // Character rik = (Character)ew;java: incompatible types: java.lang.String cannot be converted to java.lang.Character
       // System.out.println("char rik = "+ rik);
        Integer yo = 28;
        //Byte ho = yo; //java: incompatible types: java.lang.Integer cannot be converted to java.lang.Byte
       // Byte ho = (Byte)yo;   java: incompatible types: java.lang.Integer cannot be converted to java.lang.Byte
        //System.out.println("Byte ho ="+ho);



    }
}
