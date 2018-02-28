package cn.com.yunshan66.www.tianditu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tianditu.android.maps.GeoPoint;
import com.tianditu.android.maps.MapController;
import com.tianditu.android.maps.MapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapView mMapView = (MapView) findViewById(R.id.main_map);
        mMapView.setBuiltInZoomControls(true);
        MapController mMapController = mMapView.getController();
        GeoPoint point = new GeoPoint((int)(39.915 * 1E6),(int)(116.404 * 1E6));
        mMapController.setCenter(point);
        mMapController.setZoom(12);
    }
}
