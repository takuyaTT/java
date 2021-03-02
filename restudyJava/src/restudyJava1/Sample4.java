package restudyJava1;

public class Sample4 {

	public static void main(String[] args) {
		int num = 1;
		// 条件分岐(if)
		if(num == 1) {
			System.out.println("numは1");
		}else if(num == 2 ) {
			System.out.println("numは2");
		}else {
			System.out.println("numは2より大きい");
		}
		// 条件分岐(switch)
		switch(num) {
		case 1:
			System.out.println("numは1");
			break;
		case 2:
			System.out.println("numは2");
			break;
		default:
			System.out.println("numは2より大きい");
		}

		// 繰り返し処理(for)
		for(int i = 1; i < 5; i++) {
			System.out.print(i + "回目,");
		}
		System.out.println();
		// 繰り返し処理+条件分岐(for)
		for(int i = 1; i < 5; i++) {
			if(i < 4) {
				System.out.print(i + "回目,");
			}else {
				System.out.println(i + "回目");
			}
		}

		// 繰り返し処理(拡張for)+条件分岐(switch)
		String[] progs = {"Java","PHP","Ruby","JavaScript","fugafuga"};
		String url;
		for(String prog: progs) {
			switch(prog) {
			case "Java":
				url= "https://www.java.com/ja/";
				break;
			case "PHP":
				url= "https://www.php.net";
				break;
			case "Ruby":
				url= "https://www.ruby-lang.org/ja/";
				break;
			case "JavaScript":
				url= "https://developer.mozilla.org/ja/docs/Web/JavaScript";
				break;
			default:
				url= "???";
			}
			System.out.println("["+ prog + "] " + url);
		}

		// while文
		int count = 0;
		while(count < 3) {
			System.out.print(count);
			count++;
		}
		// do~while文
		do {
			System.out.print(count);
		}while(count < 3);
	}
}
