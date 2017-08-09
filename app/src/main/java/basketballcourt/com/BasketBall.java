package basketballcourt.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by King - JayCee on 6/13/2017.
 */

public class BasketBall extends AppCompatActivity {

    Button btnProceed;
    EditText edtHome, edtAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bball_intro);

        edtHome = (EditText) findViewById(R.id.edtHome);
        edtAway = (EditText) findViewById(R.id.edtAway);

        btnProceed = (Button) findViewById(R.id.btnProceed);
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                Intent i = new Intent(BasketBall.this, BasketBallLive.class);
                bundle.putString("value1", edtHome.getText().toString());
                bundle.putString("value2", edtAway.getText().toString());
                i.putExtras(bundle);
                startActivity(i);

            }
        });
    }

}
