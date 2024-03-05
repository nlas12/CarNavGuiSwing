package interfaces;

public interface Vertex {
	 
	int[] getPosition();
	 	
	int getSpeedLimit();
	    
	boolean isDamaged();
	
	boolean hasCamera();
	
	boolean isConnectedTo(Vertex v);
	
	int stepTo(Vertex v);

	boolean isOnBound(Map m);
	
	boolean isInCorner(Map m);
}
