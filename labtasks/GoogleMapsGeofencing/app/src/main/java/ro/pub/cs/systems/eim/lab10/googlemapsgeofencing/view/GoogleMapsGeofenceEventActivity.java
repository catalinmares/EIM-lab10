package ro.pub.cs.systems.eim.lab10.googlemapsgeofencing.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

import ro.pub.cs.systems.eim.lab10.R;

public class GoogleMapsGeofenceEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps_geofence_event);

        TextView notificationContentTextView = (TextView)findViewById(R.id.notification_content_text_view);

        Button okButton = (Button)findViewById(R.id.ok_button);
        okButton.setOnClickListener(view -> finish());

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            Set<String> keys = bundle.keySet();
            for (String key : keys) {
                String value = bundle.getString(key);
                notificationContentTextView.append(key + ": " + value + "\n");
            }
        }
    }
}
