package test;

public class Player {
	private String name;
	private int record;
	
	
	public void setName (String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void srtRecord(int record) {
		this.record=record;
	}
	public int getRecord() {
		return this.record;
	}
	public void showRecord() {
		System.out.println("����: " +name+ "���: " +record);
	}

}
