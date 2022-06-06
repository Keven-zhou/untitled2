import java.util.Scanner;

public class if3 {

    public static void main(String[] args){

        Scanner myScanner=new Scanner(System.in);
        System.out.println("请输入淡旺季");
        char season = myScanner.next().charAt(0);
        if (season == '旺') {
    System.out.println("请输入年龄");
            int age =myScanner.nextInt();

            if(age>=18 && age<60){

                System.out.println("60RMB");
                        }
        else if (age>0 && age<18){

            System.out.println("30RMB");
            }
        else if (age>60 && age<=100 ){
            System.out.println("20RMB");
            }
        else if(age<0 && age >100){
            System.out.println("请重新输入年龄");
            }


        }
        else {
            System.out.println("请输入年龄");
            int age =myScanner.nextInt();

        if(age>=18 && age<60){
    System.out.println("40RMB");
        }
    else if(age<18 && age>60){
    System.out.println("20RMB");
    }
   else if (age<0 && age>100){
       System.out.println("请重新输入年龄");
            }
        }
    }
}
