package restudyJava1;

public class Main {
	int a = 1;

    public static void main(String[] args) {
        // 変数bをここで宣言する
        int b = 10;
        Main mainClass = new Main();
        mainClass.printNum();
    }

    void printNum(){
    	int b = 10; // ここをコメントアウトするとエラーが起きる
        int c = 100;
        System.out.println(a);
        // bは宣言されていないためエラーが起きる
        System.out.println(b); // error: cannot find symbol
        System.out.println(c);
    }
}
