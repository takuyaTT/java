package design_pattern.iterator_pattern;

import design_pattern.iterator_pattern.interfaces.Aggregate;
import design_pattern.iterator_pattern.interfaces.Iterator;

/**
 * 本棚を表現するクラス
 *
 */
public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;

	/**
	 * コンストラクタ
	 * @param maxSize
	 */
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}

	/**
	 * 本棚から指定されたインデックスに存在する本を返す
	 * @param index
	 * @return
	 */
	public Book getBookAt(int index) {
		return books[index];
	}

	/**
	 * 本を本棚に追加する
	 * @param book
	 */
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}

	/**
	 * 本棚用のイテレーターを返す
	 */
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

	public int getLength() {
		return last;
	}
}
