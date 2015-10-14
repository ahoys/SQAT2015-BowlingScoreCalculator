package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//return true whether throw values are in valid range
	public boolean validThrow() {
		if (this.firstThrow < 0 || this.secondThrow < 0) {
			return false;
		}
		if (this.firstThrow > 10 || this.secondThrow > 10) {
			return false;
		}
		return true;
	}
	
	//the score of a single frame
	public int score(){
		//to be implemented
		return this.firstThrow + this.secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if (this.firstThrow >= 10) {
			return true;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		if (this.firstThrow < 10 && this.firstThrow + this.secondThrow == 10) {
			return true;
		}
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
