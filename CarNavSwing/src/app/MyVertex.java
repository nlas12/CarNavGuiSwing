package app;

import interfaces.Map;
import interfaces.Vertex;

public class MyVertex implements Vertex {

	private int[] position = new int[3];
	
	public MyVertex(int x, int y) {
		this(x,y,0);
	}
	
	public MyVertex(int x, int y, int z) {
		this.position[0] = x;
		this.position[1] = y;
		this.position[2] = z;
	}
	
	@Override
	public int[] getPosition() {
		return position;
	}

	@Override
	public int getSpeedLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isDamaged() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasCamera() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConnectedTo(Vertex v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int stepTo(Vertex v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isOnBound(Map m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInCorner(Map m) {
		// TODO Auto-generated method stub
		return false;
	}

}
