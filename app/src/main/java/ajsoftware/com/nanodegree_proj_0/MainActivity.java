package ajsoftware.com.nanodegree_proj_0;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.upperText);
        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/DroidSerif-Bold.ttf");
        tv.setTypeface(face);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifyStreamer(View view) {
        String displayedText = "This button will lunch my spotify streamer!";
        writeToast(displayedText);
    }

    public void scoreApp(View view) {
        String displayedText = "This button will lunch my score app site!";
        writeToast(displayedText);
    }

    public void libraryApp(View view) {
        String displayedText = "This button will lunch my library app!";
        writeToast(displayedText);
    }

    public void buildItBigger(View view) {
        String displayedText = "This button will build it bigger!";
        writeToast(displayedText);
    }

    public void xyzReader(View view) {
        String displayedText = "This button will lunch my XYZ Reader!";
        writeToast(displayedText);
    }

    public void capstone(View view) {
        String displayedText = "This button will lunch my Capsoten!";
        writeToast(displayedText);
    }

    private void writeToast(String displayedText) {
        Toast.makeText(getApplicationContext(), displayedText, Toast.LENGTH_SHORT).show();
    }
}
