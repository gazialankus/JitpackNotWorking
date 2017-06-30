package domain.company.jitpacknotworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.theartofdev.edmodo.cropper.CropImage;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "using the lib: " + CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE);
    }
}
