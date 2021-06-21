package ch.asinz.testionic;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;

import ch.asinz.capacitornotificationlistener.NotificationListenerPlugin;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerPlugin(NotificationListenerPlugin.class);
    }
}
