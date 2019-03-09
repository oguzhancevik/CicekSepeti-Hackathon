package com.ciceksepeti.hackathon.helper;

import es.blackleg.java.geocalc.Coordinate;
import es.blackleg.java.geocalc.DegreeCoordinate;
import es.blackleg.java.geocalc.EarthCalc;
import es.blackleg.java.geocalc.Point;

public class DistanceHelper {

	public double calculateDistance(double latitude1, double longitude1, double latitude2, double longitude2) {
		Coordinate coordinate1 = new DegreeCoordinate(latitude1);
		Coordinate coordinate2 = new DegreeCoordinate(longitude1);
		Point point1 = new Point(coordinate1, coordinate2);

		coordinate1 = new DegreeCoordinate(latitude2);
		coordinate2 = new DegreeCoordinate(longitude2);
		Point point2 = new Point(coordinate1, coordinate2);

		double distanceKM = EarthCalc.getDistance(point2, point1) / 1000;
		return distanceKM;
	}

}
