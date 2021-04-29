package com.example.recyclerviewv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private ImageView ivMakananPhoto;
    private TextView tvMakananName;
    private TextView tvMakananDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivMakananPhoto = findViewById(R.id.imgMakananN);
        tvMakananName = findViewById(R.id.namaMakananN);
        tvMakananDetail = findViewById(R.id.detailMakananN);

        getSupportActionBar().hide();
    }

    @Override
    protected void onStart() {
        super.onStart();
        RvMainModel makanan = getIntent().getParcelableExtra("MAKANAN_DETAIL");
        System.out.println(makanan.getTitle());
        ivMakananPhoto.setBackgroundResource(makanan.getPhoto());
        tvMakananName.setText(makanan.getTitle());
        tvMakananDetail.setText(makanan.getDescription());
    }

    public void clickBack(View view) {
        finish();
    }
}