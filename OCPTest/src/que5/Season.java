package que5;

public enum Season {
	WINTER{public void printLevel(){
		System.out.println("medium");};},
	SUMMER{public void printLevel(){
		System.out.println("medium");};},
	SPRING{public void printLevel(){
		System.out.println("medium");};},
	FALL{public void printLevel(){
		System.out.println("medium");};};
	
	private String level;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
//	private Season(String level){
//		this.level=level;
//	}
	public abstract void printLevel();
}

