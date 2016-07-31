package nsbabra.awesomelauncher;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends SingleFragmentBaseActivity {

    @Override
    protected Fragment getFragment() {
        return AwesomeLauncherFragment.getInstance();
    }
}
