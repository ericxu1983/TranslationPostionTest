package comericxu1983.github.translationpostiontest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "eric_debug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    private void test() {
        TextView text1 = (TextView)findViewById(R.id.text1);
        final TextView text2 = (TextView)findViewById(R.id.text2);
        Button btn = (Button)findViewById(R.id.button);
        Button btn2 = (Button)findViewById(R.id.button2);
        final View container = findViewById(R.id.container);


        Log.d(TAG, "original:" + text2.getTop() + ", " + text2.getY() + ", " + text2.getTranslationY());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onButtonClicked:" + text2.getTop() + ", " + text2.getY() + ", " + text2.getTranslationY());

                text2.setTranslationY(50);

                Log.d(TAG, "1st moved 50:" + text2.getTop() + ", " + text2.getY() + ", " + text2.getTranslationY());

                text2.setTranslationY(50);

                Log.d(TAG, "2nd moved 50:" + text2.getTop() + ", " + text2.getY() + ", " + text2.getTranslationY());


                container.requestLayout();
                Log.d(TAG, "after requestLayout:" + text2.getTop() + ", " + text2.getY() + ", " + text2.getTranslationY());


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onButton2Clicked:" + text2.getTop() + ", " + text2.getY() + ", " + text2.getTranslationY());

            }
        });

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
}
