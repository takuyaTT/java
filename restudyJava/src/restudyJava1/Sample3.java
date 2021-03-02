package restudyJava1;

public class Sample3 {

	public static void main(String[] args) {
		int intNum = 10;

		// 小　→ 大
		long longNum = intNum;

		// 大　→ 小
		// データ型 変数名 = (データ型)変数名;
		byte byteNum = (byte)intNum;

		System.out.println(longNum); // 10
		System.out.println(byteNum); // 10

		// 小数　→ 整数
		double doubleNum = 3.1416;
		intNum = (int)doubleNum;
		System.out.println(intNum); // 3
	}
}
