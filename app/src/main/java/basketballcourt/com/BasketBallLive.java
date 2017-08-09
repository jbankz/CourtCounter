package basketballcourt.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by King - JayCee on 6/13/2017.
 */

public class BasketBallLive extends AppCompatActivity {

    /**
     * Declerations of variables
     **/
    TextView txtTeamA, txtTeamB, txtDislpayTeamAscore, txtDislpayTeamBscore;
    Button btnAddTwoA, btnAddThreeA, btnFreeThrowA, btnAddTwoB,
            btnAddThreeB, btnFreeThrowB, btnReset;
    int pointA, pointB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket_ball_live);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        /**Making reference of the variables**/

        txtTeamA = (TextView) findViewById(R.id.txtTeamA);
        txtTeamB = (TextView) findViewById(R.id.txtTeamB);
        txtDislpayTeamAscore = (TextView) findViewById(R.id.txtDisplayTeamAScore);
        txtDislpayTeamBscore = (TextView) findViewById(R.id.txtDisplayTeamBScore);

        btnAddTwoA = (Button) findViewById(R.id.btnPlusTwoA);
        btnAddThreeA = (Button) findViewById(R.id.btnPlusThreeA);
        btnFreeThrowA = (Button) findViewById(R.id.btnFreeThrowA);

        btnAddTwoB = (Button) findViewById(R.id.btnPlusTwoB);
        btnAddThreeB = (Button) findViewById(R.id.btnPlusThreeB);
        btnFreeThrowB = (Button) findViewById(R.id.btnFreeThrowB);

        btnReset = (Button) findViewById(R.id.btnReset);

        Bundle bundle = getIntent().getExtras();
        txtTeamA.setText(bundle.getString("value1"));
        txtTeamB.setText(bundle.getString("value2"));

        /**This part of the methods are the team A members to call on the points method**/

        btnAddTwoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointTwoA();
            }
        });

        btnAddThreeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointThreeA();
            }
        });

        btnFreeThrowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePointA();
            }
        });

        /**This part of the methods are the team B members to call on the points Methods**/

        btnAddTwoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointTwoB();
            }
        });

        btnAddThreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointThreeB();
            }
        });

        btnFreeThrowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freePointB();
            }
        });

        /**This part of the method is used to call on the reset method**/

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointA = 0;
                pointB = 0;
                txtDislpayTeamAscore.setText("" + pointA);
                txtDislpayTeamBscore.setText("" + pointB);
            }
        });
    }

    /**
     * Adds two to Team A
     **/

    private void pointTwoA() {
        pointA += 2;
        txtDislpayTeamAscore.setText("" + pointA);
    }

    /**
     * Adds three to Team A
     **/

    private void pointThreeA() {
        pointA += 3;
        txtDislpayTeamAscore.setText("" + pointA);
    }

    /**
     * Adds one to Team A
     **/

    private void freePointA() {
        pointA += 1;
        txtDislpayTeamAscore.setText("" + pointA);
    }

    /**
     * Adds two to Team B
     **/

    private void pointTwoB() {
        pointB += 2;
        txtDislpayTeamBscore.setText("" + pointB);
    }

    /**
     * Adds three to Team B
     **/

    private void pointThreeB() {
        pointB += 3;
        txtDislpayTeamBscore.setText("" + pointB);
    }

    /**
     * Adds one to Team B
     **/

    private void freePointB() {
        pointB += 1;
        txtDislpayTeamBscore.setText("" + pointB);
    }

}
