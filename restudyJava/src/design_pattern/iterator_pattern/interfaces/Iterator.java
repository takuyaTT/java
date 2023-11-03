package design_pattern.iterator_pattern.interfaces;
/**
 * 要素の数え上げを表現する
 *
 */
public interface Iterator {
	/**
	 * 次の要素が存在するか確認
	 * @return
	 */
	boolean hasNext();

	/**
	 * 次の要素を取得
	 * @return
	 */
	Object next();
}
