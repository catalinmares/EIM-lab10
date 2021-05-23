package ro.pub.cs.systems.eim.lab10.googlemapslocationupdate.general;

public interface Constants {

    String TAG = "[GoogleMapsLocation]";

    boolean DEBUG = true;

    int NORMAL_MAP_TYPE = 0;
    int SATELLITE_MAP_TYPE = 1;
    int TERRAIN_MAP_TYPE = 2;
    int HYBRID_MAP_TYPE = 3;

    int CAMERA_ZOOM = 12;

    long LOCATION_REQUEST_INTERVAL = 10000;
    long LOCATION_REQUEST_FASTEST_INTERVAL = 10000;

    String LOCATION_UPDATES_STATUS = "LocationUpdatesStatus";
    String LAST_LOCATION = "LastLocation";

}
