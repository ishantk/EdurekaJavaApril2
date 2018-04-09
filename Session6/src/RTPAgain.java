class GoogleMap{
	
	GoogleMap(){
		System.out.println("Google Map Constructed..");
	}
	
	void showMap(){
		System.out.println("Showing the Default Google Map View..");
	}
}

class SatelliteGoogleMap extends GoogleMap{
	SatelliteGoogleMap(){
		System.out.println("SatelliteGoogleMap Constructed..");
	}
	
	void showMap(){
		System.out.println("Showing the Satellite Google Map View..");
	}
}

class TerrainGoogleMap extends GoogleMap{
	TerrainGoogleMap(){
		System.out.println("TerrainGoogleMap Constructed..");
	}
	
	void showMap(){
		System.out.println("Showing the Terrain Google Map View..");
	}
}


public class RTPAgain {

	public static void main(String[] args) {
		
		GoogleMap gMap;
		
		gMap = new SatelliteGoogleMap();
		gMap.showMap();
		
		System.out.println("---------------------");
		System.out.println("Changing the View...");
		System.out.println("---------------------");
		
		gMap = new TerrainGoogleMap();
		gMap.showMap();

	}

}
