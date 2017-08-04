package test.ghostofart.example.com.showhide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    //TextView textView;
    EditText editText;

    public void show(View view)
    {
        editText.setVisibility(View.VISIBLE);
    }

    public  void hide(View view)
    {
        editText.setVisibility(View.INVISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
    }
}
