package prueba.html;

import org.apache.cordova.DroidGap;

import org.apache.cordova.*;
import android.os.Bundle;

public class PruebahtmlActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}