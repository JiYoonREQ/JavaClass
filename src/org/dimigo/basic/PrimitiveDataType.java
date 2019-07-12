package org.dimigo.basic;

public class PrimitiveDataType {

    static boolean flag;//static 필드 안에선 static 붙은 변수를 참조

    public static void main(String[] args) {

        boolean flag=true;

        if(flag) System.out.println("참입니다.");
        if (!flag) System.out.println("거짓입니다.");

        if(!flag) System.out.println("거짓입니다.");

        System.out.println( (flag) ? "참입니다." : "거짓입니다." );

        char c1='A';
        char c2=65;
        char c3='\u0041';
        System.out.println(c1+" "+ c2 +" "+ c3);
        System.out.println('뷁');

        String name = "정준영";
        System.out.println("My name is "+name);

        //ob00001010(2진수)=012(8진수)=0x0A(16진수)=10(10진수)
        int i1=10, i2=0b00001010, i3=012, i4=0x0A;
        System.out.printf("%d ,%d ,%d ,%d\n", i1, i2, i3, i4);

        //byte 타입(-128~127)
        byte b1=-128, b2=127;
        b1--; b2++;
        System.out.println(b1+" "+b2);

        System.out.println(Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE+" "+Long.MAX_VALUE);

        long a = 10000000000L;//L 붙이기
        System.out.println(a);
        //float 4바이트  0.0F, double 8byte  0.0D
        float f1=3.14f;
        double d1=3.14;
        System.out.printf("%f %f\n", f1, d1);

        float f2=0.123456789123456789f;
        double d2=0.123456789123456789;
        System.out.println(f2+" "+d2);

        System.out.printf("%c, %d, %.2f, %s\n", 'A',100, 12.345, "IOTXU");
    }
}
