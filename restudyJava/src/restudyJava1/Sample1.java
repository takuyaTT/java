package restudyJava1;

public class Sample1 {
    public static void main(String[] args) {
        // **** インクリメント・デクリメント ****
        int a = 1;
        int b = 2;

        System.out.println(a++); // 1
        // System.out.println(a);
        // a = a + 1;
        System.out.println(++a); // 3
        // a = a + 1;
        // System.out.println(a);

        System.out.println(a++ + --a + b--); // 8
        System.out.println("a : " + a + " , b : " + b); // a : 3 , b : 1


        // **** 文字列の値比較 ****
        String str1 = "Hello";
        // インスタンス生成
        String str2 =  new String("Hello");

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals("Hello")); // true


        // **** ANDとOR ****
        int x = 10;
        if(false && ++x == 11){ // 右辺は評価されない
            System.out.println(x);
        }
        if(false & ++x == 11){ // 右辺は評価される
            System.out.println(x);
        }

        System.out.println(x); // 11
    }
}