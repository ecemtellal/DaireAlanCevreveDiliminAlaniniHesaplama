import java.util.Scanner;
public class CircumferenceAndArea {
    public static void main(String[] args) {
        int radius ,centralAngle;
        double area,circumference,circleSliceArea, pi=3.14;

        Scanner input=new Scanner (System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        radius=input.nextInt();
        System.out.println("Dairenin merkez açısını giriniz: ");
        centralAngle=input.nextInt();

        circumference= 2 * pi * radius;
        area=pi *radius * radius;
        circleSliceArea= (pi*(radius*radius)*centralAngle)/360 ;

        System.out.println("Dairenin çevresi: " + circumference);
        System.out.println("Dairenin Alanı: " + area);
        System.out.println("Daire Diliminin Alanı :" + circleSliceArea);

    }
}
