import java.util.Scanner;

public class homework4 {

public static void main(String[] args){

    Scanner myScanner=new Scanner(System.in);

    System.out.println("请输入年份");

    float years = myScanner.nextFloat();

    if (years % 4 ==0 && years % 100 !=0 || years % 400 ==0){
        System.out.println(years +"是闰年");
    }
    else{
        System.out.println(years +"不是闰年");
    }
}


}
