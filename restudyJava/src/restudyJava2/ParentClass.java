package restudyJava2;

public class ParentClass {
	// フィールド
	String name;
	int age;

	// コンストラクタ
	ParentClass(){
		this.name = "未定義";
		this.age = 999;
	}

	ParentClass(String name, int age){
		this.name = name;
		this.age = age;
	}

	// メソッド
	public void showName() {
		System.out.println("showNameメソッドの実行");
		System.out.println("名前: " + this.name);
	}

	public void printInfo() {
		System.out.println("printInfoメソッドの実行");
		System.out.println("名前: " + this.name);
		System.out.println("年齢: " + this.age);
	}
	// オーバーロード
	public void printInfo(String comment) {
		System.out.println("printInfoメソッドの実行");
		System.out.println("コメント: " + comment);
		System.out.println("名前: " + this.name);
		System.out.println("年齢: " + this.age);
	}

}
