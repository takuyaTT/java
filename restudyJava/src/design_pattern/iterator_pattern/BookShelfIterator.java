package design_pattern.iterator_pattern;

import design_pattern.iterator_pattern.interfaces.Iterator;

/**
 * 本棚用イテレーター
 *
 */
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;

	/**
	 * コンストラクタ
	 * @param bookShelf
	 */
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	/**
	 * 次の要素があるか確認
	 */
	@Override
	public boolean hasNext() {
		return index < bookShelf.getLength() ? true : false;
	}

	/**
	 * 要素を取得しカウンタを1加算
	 */
	@Override
	public Object next() {
		Book book =  bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
