public class homework3 {
public static void main(String[] args){

    int years =2002;
    if ((years % 4==0 && years % 100!=0 || years % 400==0 )){
    System.out.println(years + "是闰年");
    }
    else{

       System.out.println(years + "不是闰年");
    }
}


}
