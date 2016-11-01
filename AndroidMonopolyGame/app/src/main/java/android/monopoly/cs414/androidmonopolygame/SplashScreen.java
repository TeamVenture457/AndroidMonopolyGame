package android.monopoly.cs414.androidmonopolygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    public void prepPlayers(View view){
        Intent intent = new Intent(this, PlayerSelect.class);
        startActivity(intent);
        finish();
    }
}
