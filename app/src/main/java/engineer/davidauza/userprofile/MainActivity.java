package engineer.davidauza.userprofile;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the profile picture of the user
        ImageView userImageView = findViewById(R.id.profile_picture);
        userImageView.setImageResource(R.drawable.profile_picture);

        // Set the name of the user
        TextView nameTextView = findViewById(R.id.name);
        nameTextView.setText(R.string.main_name);

        // Set the birthday of the user
        TextView birthdayTextView = findViewById(R.id.birthday);
        birthdayTextView.setText(R.string.main_birthday);

        // Set the country of the user
        TextView countryTextView = findViewById(R.id.country);
        countryTextView.setText(R.string.main_country);
    }
}
