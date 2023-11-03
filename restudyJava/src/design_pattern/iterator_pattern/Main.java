package design_pattern.iterator_pattern;

import design_pattern.iterator_pattern.interfaces.Iterator;

public class Main {

	public static void main(String[] args) {
		// 本棚のインスタンスを生成
		BookShelf bookShelf = new BookShelf(3);
		// 本棚に本を追加
		bookShelf.appendBook(new Book("Java"));
		bookShelf.appendBook(new Book("Ruby"));
		bookShelf.appendBook(new Book("Python"));

		// 本棚用のイテレーターを取得
		Iterator it = bookShelf.iterator();

		// 本棚にある本数分ループ
		while(it.hasNext()) {
			// 本棚から本を取得
			Book book = (Book)it.next();
			// 本の名前を表示
			System.out.println(book.getName());
		}
	}

}
