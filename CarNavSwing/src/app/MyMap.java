package app;

import java.util.List;

import interfaces.Map;
import interfaces.Vertex;

public class MyMap implements Map{

	private Vertex[][] myMapArray;
	
	public MyMap(Vertex[][] map) {
		this.myMapArray = map;
	}
	
	@Override
	public Vertex[][] getMyMapArray() {
		return myMapArray;
	}

	@Override
	public boolean isStreetConnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStreetConnected(Vertex vertex1, Vertex vertex2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBuildingConnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBuildingConnected(Vertex vertex1, Vertex vertex2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValidMap() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void transformMap(List<Vertex>[][] mapArray) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isFlatWorld() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void putBuildingSites(List<Vertex> buildingSites) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validBuildingSites() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void disconnectingSites() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPath(List<Vertex> path) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isShortestPath(List<Vertex> path) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUniquePath(List<Vertex> path) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTour(List<Vertex> tour) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTour(Map m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDeadEnd(Vertex vertex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countBuildings() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countStreets() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countGreens() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int computeTimeShortestPath(Vertex vertex1, Vertex vertex2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void putCameras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putCameras(int maxSight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vertex> findHamiltonPath(List<Vertex> vertices) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vertex> findHamiltonTour(List<Vertex> vertices) {
		// TODO Auto-generated method stub
		return null;
	}
}
