/**
 *
 */
package design_pattern.iterator_pattern.interfaces;

/**
 * 集合を表現する
 *
 */
public interface Aggregate {
	/**
	 * 集合体に対応するIteratorを1個返す
	 * @return
	 */
	Iterator iterator();
}
