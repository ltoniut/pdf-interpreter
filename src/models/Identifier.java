package models;

public class Identifier extends Field {
	private String _content;
	
	public String getContent() {
		return _content;
	}

	public Identifier(int x1, int y1, int x2, int y2, int id, int page, String name, String content) {
		super(x1, y1, x2, y2, id, page, name);
		_content = content;
	}

}
