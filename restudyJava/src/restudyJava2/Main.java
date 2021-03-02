package restudyJava2;

public class Main {

	public static void main(String[] args) {
		Sample1 samp1_none = new Sample1();
		Sample1 samp1 = new Sample1("taro",15);

		System.out.println("----指定なし----");
		samp1_none.printInfo();
		System.out.println("----指定あり----");
		samp1.printInfo();

		System.out.println("----継承_指定なし----");
		Sample2 sample2_none = new Sample2();
		sample2_none.printInfo();
		sample2_none.showName();

		System.out.println("----継承_指定あり----");
		Sample2 sample2 = new Sample2("hanako",18,"sample2");
		sample2.printInfo();
		sample2.showName();

	}

}
