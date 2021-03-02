package restudyJava2;

public class Sample2 extends Sample1 {
	String extendsType;

	Sample2(){
		super();
	}

	Sample2(String name, int age, String extendsType){
		this.name = name;
		this.age = age;
		this.extendsType = extendsType;
	}

	// オーバーライド
	public void printInfo() {
		System.out.println("printInfoメソッドの実行");
		System.out.println("名前: " + this.name);
		System.out.println("年齢: " + this.age);
		System.out.println("継承元: " + this.extendsType);
	}
}
