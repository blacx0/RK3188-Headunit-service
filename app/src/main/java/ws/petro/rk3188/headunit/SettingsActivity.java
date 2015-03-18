package ws.petro.rk3188.headunit;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.util.Log;

public class SettingsActivity extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.pref);
	}

	@Override
	protected void onPause() {
		Log.d("CFG", "Settings closed, apply new");
		// Restart service and re-create the settings
		Settings.destroy();
		super.onPause();
	}
}
