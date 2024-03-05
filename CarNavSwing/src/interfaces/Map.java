package interfaces;

import java.util.List;

public interface Map {
	
	Vertex[][] getMyMapArray();

    boolean isStreetConnected();

    boolean isStreetConnected(Vertex vertex1, Vertex vertex2);

    boolean isBuildingConnected();

    boolean isBuildingConnected(Vertex vertex1, Vertex vertex2);

    boolean isValidMap();

    void transformMap(List<Vertex>[][] mapArray);

    boolean isFlatWorld();

    void putBuildingSites(List<Vertex> buildingSites);

    boolean validBuildingSites();

    void disconnectingSites();

    boolean isPath(List<Vertex> path);

    boolean isShortestPath(List<Vertex> path);

    boolean isUniquePath(List<Vertex> path);

    boolean isTour(List<Vertex> tour);

    boolean hasTour(Map m);

    boolean isDeadEnd(Vertex vertex);

    int countBuildings();

    int countStreets();

    int countGreens();

    int computeTimeShortestPath(Vertex vertex1, Vertex vertex2);

    void putCameras();

    void putCameras(int maxSight);

    List<Vertex> findHamiltonPath(List<Vertex> vertices);

    List<Vertex> findHamiltonTour(List<Vertex> vertices);
}
