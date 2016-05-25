package course.coursera.activityhop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ritesh on 5/24/16.
 */
public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);

        final TextView textView = (TextView)findViewById(R.id.textView);

        float rate = getIntent().getExtras().getFloat("Rate");

        textView.setText("You have rated it as:"+rate);
    }
}
