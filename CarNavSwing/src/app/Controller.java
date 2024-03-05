package app;

import gui.MyFrame;
import interfaces.Vertex;

public class Controller {

	static Vertex[][] mapArray = {
			{new Street(0,0), new Street(1,0), new Street(2,0), new Street(3,0)},
			{new MyVertex(0,1), new MyVertex(1,1), new Street(2,1), new Street(3,1)},
			{new MyVertex(0,2), new MyVertex(1,2), new Street(2,2), new Street(3,2)},
			{new MyVertex(0,3), new MyVertex(1,3), new MyVertex(2,3), new MyVertex(3,3)}

	};
	static MyMap map = new MyMap(mapArray);

	public Controller() {
		
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame(map);
		frame.setVisible(true);
	}
}
