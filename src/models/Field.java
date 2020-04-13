package models;

public class Field {
	private Coordinates startPoint;
	private Coordinates endPoint;
	private int _page;
	private String _name;
	private int _id;
	
	public Field (int x1, int y1, int x2, int y2, int id, int page, String name) {
		startPoint = new Coordinates(x1, y1);
		endPoint = new Coordinates(x2, y2);
		_page = page;
		_name = name;
		_id = id;
	}

	public Coordinates getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Coordinates startPoint) {
		this.startPoint = startPoint;
	}

	public Coordinates getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Coordinates endpoint) {
		this.endPoint = endpoint;
	}

	public int getId() {
		return _id;
	}

	public int getPage() {
		return _page;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}
}
