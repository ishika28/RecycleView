package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    ImageView imgView;
    TextView tvFullName, tvPhoneNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgView=findViewById(R.id.imageView);
        tvFullName=findViewById(R.id.textView);
        tvPhoneNo=findViewById(R.id.textView2);

        Bundle bundle =getIntent().getExtras();
        if (bundle !=null){
            imgView.setImageResource(bundle.getInt("image"));
            tvFullName.setText(bundle.getString("name"));
            tvPhoneNo.setText(bundle.getString("phone"));
        }
    }
}
