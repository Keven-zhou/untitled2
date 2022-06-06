public class Homework33 {
    public static void main(String[] args) {

        //编程，保存两本书名，用+拼接，看效果，保存两个性别
        //用加号拼接，看效果，保存两本书价格，用加号拼接，看效果

        String book1 = "西游记";
        String book2 = "三国演义";
        System.out.println(book1 + book2);//西游记三国演义


        //性别应该使用char保存
        char b1 = '男';
        char b2 = '女';
        System.out.println(b1 + b2);//得到  男 字符码值 + 女 字符码值

        //保存两本书的价格
        float price1 = 85.9F;
        float price2 = 78.5F;
        System.out.println(price1 + price2);


//        System.out.println(price1 + price2);//就是85.9+

    }
}
