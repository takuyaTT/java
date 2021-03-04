package restudyJava2;

public class ChildClass extends ParentClass {
	String extendsType;

	ChildClass(){
		super();
	}

	ChildClass(String name, int age, String extendsType){
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
