package com.dinesh.patidar.loginwithgmail;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvName, tvEmail, tvGiven, tvFamily, tvId;
    private ImageView imageView;
    private String name, given, email, family, id;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvName = findViewById(R.id.tv_name);
        tvEmail = findViewById(R.id.tv_email);
        tvGiven = findViewById(R.id.tv_given);
        tvFamily = findViewById(R.id.tv_family);
        tvId = findViewById(R.id.tv_id);

        imageView = findViewById(R.id.iv_profile);


        name = getIntent().getStringExtra("name");
        given = getIntent().getStringExtra("given");
        family = getIntent().getStringExtra("family");
        email = getIntent().getStringExtra("email");
        id = getIntent().getStringExtra("id");
        uri = Uri.parse(getIntent().getStringExtra("profile"));


        tvName.setText(name);
        tvEmail.setText(email);
        tvFamily.setText(family);
        tvGiven.setText(given);
        tvId.setText(id);

        imageView.setImageURI(uri);


    }
}