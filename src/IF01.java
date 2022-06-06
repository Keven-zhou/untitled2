import java.util.Scanner;

public class IF01{

    public static void main(String[] args){


        Scanner myScanner=new Scanner(System.in);
        System.out.println("请输入年龄");
        //将年龄保存到一个变量 int age
        int age = myScanner.nextInt();
        if (age>18){
            System.out.println("你年龄大于18，要对自己的行为负责，送于监狱");
        }else{
            System.out.println("你的年龄不大这次放过你了");
        }


//        System.out.println("你的年龄不大这次放过你了");

    }

}