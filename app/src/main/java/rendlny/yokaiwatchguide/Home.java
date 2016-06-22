package rendlny.yokaiwatchguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void yokai_list(View view){
        Intent intent = new Intent(this, Yokai_List.class);
        startActivity(intent);
    }

    public void food_list(View view){
        Intent intent = new Intent(this, Food_List.class);
        startActivity(intent);
    }
}
