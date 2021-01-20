package eu.senla.task1;

public class Number {

    private byte a; // хранит целое число от -128 до 127 и занимает 1 байт
    private short b; // хранит целое число от -32768 до 32767 и занимает 2 байта
    private int c; // хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
    private long d; //  хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
    private double e; //хранит число с плавающей точкой от ±4.9*10-324 до ±1.8*10308 и занимает 8 байт
    private float f; // хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
    private char j; //хранит одиночный символ в кодировке UTF-16 и зан 2 байта, поэтому диапазон хранимых значений от 0 до 65535
    private boolean z; // true или folse
    private Byte aByte;
    private Short bShort;
    private Integer n;
    private Long m;
    private Float q;
    private Double eDouble;
    private Character k;
    private  Boolean p;
    private String o;

    public byte getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }


    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }


    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }


    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public char getJ() {
        return j;
    }

    public void setJ(char j) {
        this.j = j;
    }



    public boolean isZ() {
        return z;
    }

    public void setZ(boolean z) {
        this.z = z;
    }

    public Byte getaByte() {
        return aByte;
    }

    public void setaByte(Byte aByte) {
        this.aByte = aByte;
    }

    public Short getbShort() {
        return bShort;
    }

    public void setbShort(Short bShort) {
        this.bShort = bShort;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Long getM() {
        return m;
    }

    public void setM(Long m) {
        this.m = m;
    }

    public Float getQ() {
        return q;
    }

    public void setQ(Float q) {
        this.q = q;
    }

    public Double geteDouble() {
        return eDouble;
    }

    public void seteDouble(Double eDouble) {
        this.eDouble = eDouble;
    }
    public Character getK() {
        return k;
    }

    public void setK(Character k) {
        this.k = k;
    }
    public void setP(Boolean p) {
        this.p = p;
    }

    public Boolean getP() {
        return p;
    }
    public void setO(String o) {
        this.o = o;
    }

    public String getO() {
        return o;
    }
}
