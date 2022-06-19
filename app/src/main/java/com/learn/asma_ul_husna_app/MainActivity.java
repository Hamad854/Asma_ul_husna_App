package com.learn.asma_ul_husna_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rv);

        GridLayoutManager layoutManager = new GridLayoutManager(this,3);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new Asma_ul_husna_Adapter(getApplicationContext(),AllahNames.asm_eng,AllahNames.asm_urd));



    }
}