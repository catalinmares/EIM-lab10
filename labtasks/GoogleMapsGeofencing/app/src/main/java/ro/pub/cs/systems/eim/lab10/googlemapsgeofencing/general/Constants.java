package ro.pub.cs.systems.eim.lab10.googlemapsgeofencing.general;

public interface Constants {

    String TAG = "[GoogleMapsGeofencing]";

    boolean DEBUG = true;

    int CAMERA_ZOOM = 12;

    long LOCATION_REQUEST_INTERVAL = 10000;
    long LOCATION_REQUEST_FASTEST_INTERVAL = 5000;

    String LAST_LOCATION = "LastLocation";
    String LAST_LOCATION_ERROR_MESSAGE = "Last Location is empty";
    String GEOFENCE_STATUS = "GeofenceStatus";
    String GEOFENCE_LATITUDE = "GeofenceLatitude";
    String GEOFENCE_LATITUDE_ERROR_MESSAGE = "Geofence Latitude is empty";
    String GEOFENCE_LONGITUDE = "GeofenceLongitude";
    String GEOFENCE_LONGITUDE_ERROR_MESSAGE = "Geofence Longitude is empty";
    String GEOFENCE_RADIUS = "GeofenceRadius";
    String GEOFENCE_RADIUS_ERROR_MESSAGE = "Geofence Radius is empty";
    String APPLICATION_VERSION_PROPERTY = "ApplicationVersion";

    char FIRST_LETTER = 'a';
    int ALPHABET_LENGTH = 26;
    int GEOFENCE_IDENTIFIER_LENGTH = 5;

    long GEOFENCE_EXPIRATION_IN_HOURS = 1;
    long GEOFENCE_EXPIRATION_IN_MILLISECONDS = GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;

    String GEOFENCE_TRANSITION_ENTER = "The user has entered the geofence area";
    String GEOFENCE_TRANSITION_EXIT = "The user has exited the geofence area";
    String GEOFENCE_TRANSITION_UNKNOWN = "Unknown geofence transition";

    String GEOFENCE_NOT_AVAILABLE_ERROR = "Geofence not available";
    String GEOFENCE_TOO_MANY_GEOFENCES_ERROR = "There are too many geofences";
    String GEOFENCE_TOO_MANY_PENDING_INTENTS_ERROR = "There are too many pending intents";
    String GEOFENCE_UNKNOWN_ERROR = "Unknown geofence error";

    String GEOFENCE_TRANSITION_EVENT = "Geofence Transition Event";

    String NOTIFICATION_DETAILS = "Notification Details";
    String APPLICATION_VERSION_ERROR_MESSAGE = "The application version was changed.";

}
