package design_pattern.iterator_pattern;

/**
 * 本を表現するクラス
 *
 */
public class Book {
	/** 本の名前 */
	private String name;

	/**
	 * コンストラクタ
	 */
	public Book(String name) {
		this.name = name;
	}

	/**
	 * 本の名前を取得
	 * @return
	 */
	public String getName() {
		return name;
	}
}
