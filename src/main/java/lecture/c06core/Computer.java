package lecture.c06core;

import lombok.Setter;

@Setter
public class Computer {
	private Memory memory;
	
	public void calc() {
		memory.read();
	}
}
