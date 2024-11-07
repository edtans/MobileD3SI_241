package com.example.belajarandroid;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BelajarPalette extends AppCompatActivity {

    //Deklarasi Variabel
    private Switch swWifi_code;
    private RatingBar Rating_star;
    private TextView txtHasil_respon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_belajar_palette);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Konfigurasi
        swWifi_code=(Switch) findViewById(R.id.swWifi);
        Rating_star=(RatingBar) findViewById(R.id.Rating);
        txtHasil_respon=(TextView) findViewById(R.id.txtHasil);

        //ketika switch diklik
        swWifi_code.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //jika switch is true
                if(isChecked == true)
                {
                    Toast.makeText(getApplicationContext(),"Wifi ON", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wifi Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Ketika rating diklik
        Rating_star.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating == 1)
                {
                    txtHasil_respon.setText("kurang");
                }
                else if(rating == 2){
                    txtHasil_respon.setText("Cukup");
                }
                else if(rating == 3){
                    txtHasil_respon.setText("Baik");
                }
                else{
                    txtHasil_respon.setText("Tidak ada nilai");
                }
            }
        });
    }
}