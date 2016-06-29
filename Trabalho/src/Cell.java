public class Cell {
	private int line;
	private int column;
	private float info;
	
	private Cell right;
	private Cell below;
	
	public Cell(int line, int column, float info) {
		this.line = line;
		this.column = column;
		this.info = info;
		
		this.below = this;
		this.right = this;
	}
	
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public float getInfo() {
		return info;
	}
	public void setInfo(float info) {
		this.info = info;
	}
	public Cell getRight() {
		return right;
	}
	public void setRight(Cell right) {
		this.right = right;
	}
	public Cell getBelow() {
		return below;
	}
	public void setBelow(Cell below) {
		this.below = below;
	}
}
