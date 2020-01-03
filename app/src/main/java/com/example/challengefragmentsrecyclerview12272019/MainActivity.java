package com.example.challengefragmentsrecyclerview12272019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements personAdapter.ItemClicked  {
    ImageView ivLogoBig, ivLogoSmall;
    TextView tvMakeBig, tvModelSmall, tvName, tvNameBig, tvPhoneBig, tvOwnerInfoCONST;
    Button btnCarInfo, btnOwnerInfo;
    ListFrag listFrag;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvName);
        tvMakeBig = findViewById(R.id.tvMakeBig);
        tvModelSmall = findViewById(R.id.tvMakeSmall);

        tvNameBig = findViewById(R.id.tvNameBig);
        tvPhoneBig = findViewById(R.id.tvPhoneBig);

        ivLogoBig = findViewById(R.id.ivLogoBig);
        ivLogoSmall= findViewById(R.id.ivLogoSmall);

        btnCarInfo= findViewById(R.id.btnCarInfo);
        btnOwnerInfo = findViewById(R.id.btnOwnerInfo);

        tvOwnerInfoCONST = findViewById(R.id.tvOwnerInfoCONST);



        fragmentManager = this.getSupportFragmentManager();
        listFrag = (ListFrag)fragmentManager.findFragmentById(R.id.ListFrag);
        tvNameBig.setVisibility(View.GONE);
        tvPhoneBig.setVisibility(View.GONE);
        tvOwnerInfoCONST.setVisibility(View.GONE);


        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivLogoBig.setVisibility(View.VISIBLE);
                tvMakeBig.setVisibility(View.VISIBLE);

                tvNameBig.setVisibility(View.GONE);
                tvPhoneBig.setVisibility(View.GONE);
                tvOwnerInfoCONST.setVisibility(View.GONE);
            }
        });

        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivLogoBig.setVisibility(View.GONE);
                tvMakeBig.setVisibility(View.GONE);

                tvNameBig.setVisibility(View.VISIBLE);
                tvPhoneBig.setVisibility(View.VISIBLE);
                tvOwnerInfoCONST.setVisibility(View.VISIBLE);
            }
        });

        onItemClicked(0);
    }


    @Override
    public void onItemClicked(int index) {
        tvMakeBig.setText(ApplicationClass.people.get(index).getMake());
        if(ApplicationClass.people.get(index).getModel()=="Nissan"){
           ivLogoBig.setImageResource(R.drawable.nissan);
        }
        else if (ApplicationClass.people.get(index).getModel()=="Mercedez"){
            ivLogoBig.setImageResource(R.drawable.mercedes);
        }
        else {
            ivLogoBig.setImageResource(R.drawable.volkswagen);
        }
        tvNameBig.setText(ApplicationClass.people.get(index).getName());
        tvPhoneBig.setText(ApplicationClass.people.get(index).getPhone());
    }
}
