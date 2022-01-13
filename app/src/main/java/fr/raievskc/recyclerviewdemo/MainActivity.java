package fr.raievskc.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Fake data
    List<String> uneListe = Arrays.asList("zéro", "un", "deux", "trois", "quatre", "cinq", "six", "etc.");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Retrieve ou RecyclerView from its id
        RecyclerView monRecyclerView = findViewById(R.id.monRecyclerView);

        // Set elements' views in a vertical stack
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        monRecyclerView.setLayoutManager(linearLayoutManager);

        // Set views on a grid
        // GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        // monRecyclerView.setLayoutManager(gridLayoutManager);

        // Link our RecyclerView with a new instance of our custom adapter
        monRecyclerView.setAdapter(new MyAdapter(uneListe));

    }
}