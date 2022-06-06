public class Ternaryoperatordetail {


//    int abcclass =9;
    //思路
    //1.先得到 n1 和 n2 中最大数，保存到 max1
    //2.然后再 求出max1 和 n3的最大数，保存到max2
    // int max1=n1 > n2 ? n1:n2;
    // int max2 =max1 > n3 ? max1 :n3;
    // System.out.println("最大数=" + max2)
    public static void main(String[] args){
        //案例：实现三个数的最大值
        int n1 =556;;
        int n2 =557;
        int n3 =78;

        int max = (n1 > n2 ? n1:n2) > n3 ?(n1 > n2 ? n1:n2):n3;
        System.out.println("最大数=" +max);

    }

}
