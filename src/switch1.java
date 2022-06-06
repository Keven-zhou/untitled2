import java.util.Scanner;

public class switch1 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入字符（a-g）");

        char c1 = myScanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println("今天是星期一，周乐燊");

            case 'b':
                System.out.println("今天是星期二，马俊晨");

            case 'c':
                System.out.println("今天是星期三，梁汝婷");

            case 'd':
                System.out.println("今天是星期四，张昕昊");

            case 'e':
                System.out.println("今天是星期五，邱宇轩");

            case 'f':
                System.out.println("今天是星期六，谢文轩");

        //……
            default:
        System.out.println("退出了Switch，继续执行程序");

        }


    System.out.println("李展鹏是个弱智");
    }

}
