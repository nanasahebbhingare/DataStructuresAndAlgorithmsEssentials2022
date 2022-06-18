package arrays.dto;

public class OutputPairSumDTO {
	int numberOutputOne;
	int numberOutputSecond;

	public OutputPairSumDTO(int numberOutputOne, int numberOutputSecond) {
		super();
		this.numberOutputOne = numberOutputOne;
		this.numberOutputSecond = numberOutputSecond;
	}

	public int getNumberOutputOne() {
		return numberOutputOne;
	}

	public void setNumberOutputOne(int numberOutputOne) {
		this.numberOutputOne = numberOutputOne;
	}

	public int getNumberOutputSecond() {
		return numberOutputSecond;
	}

	public void setNumberOutputSecond(int numberOutputSecond) {
		this.numberOutputSecond = numberOutputSecond;
	}

	@Override
	public String toString() {
		return "[" + numberOutputOne + "," + numberOutputSecond + "]";
	}
}
