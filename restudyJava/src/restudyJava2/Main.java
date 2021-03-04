package restudyJava2;

public class Main {

	public static void main(String[] args) {
		ParentClass parent_none = new ParentClass();
		ParentClass parent = new ParentClass("taro",15);

		System.out.println("----指定なし----");
		parent_none.printInfo();
    
		System.out.println("----指定あり----");
		parent.printInfo();
    
		System.out.println("----継承_指定なし----");
		ChildClass child_none = new ChildClass();
		child_none.printInfo();
		child_none.showName();

		System.out.println("----継承_指定あり----");
		ChildClass child = new ChildClass("hanako",18,"sample2");
		child.printInfo();
		child.showName();

    /*
    System.out.println("----継承 子 = 親 ----");
    サブクラスのデータ型でスーパークラスのインスタンスはキャストしないとできない
    NG
    ChildClass child_parent = new ParentClass();
    OK
    ParentClass pc = new ParentClass();
    ChildClass child_parent = (ChildClass)pc;
    */

    System.out.println("----継承 親 = 子----");
    // スーパークラス型の変数にサブクラスのインスタンスはできる
    ParentClass child_parent = new ChildClass();
    child_parent.printInfo();
    if(child_parent instanceof ParentClass){
      System.out.println("スーパークラス型です");
    }else {
      System.out.println("違う型です");
    }

    // インターフェイス実装済みクラス
    System.out.println("----インターフェイス----");
    ImplementsClass impClass = new ImplementsClass("Saburo",20);
    impClass.interMethod();
    System.out.println("名前 : " + impClass.returnName());
    System.out.println("年齢 : " + impClass.returnAge());
	}

}
