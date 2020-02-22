package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Water_level_result extends AppCompatActivity {
    List<result> resultList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_level_result);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        resultList= new ArrayList<>();
        
        resultList.add(
                new result(
                        "13.3 m",
                        "In 1 hour : "
                ));
        resultList.add(
                new result(
                        "10.0 m",
                        "In 2 hours : "
                ));
        resultList.add(
                new result(
                        "11.8 m",
                        "In 3 hours : "
                ));
        resultList.add(
                new result(
                        "8.2 m",
                        "In 4 hours : "
                )
        );
        resultList.add(
                new result(
                        "13.3 m",
                        "In 5 hours : "
                ));
        resultList.add(
                new result(
                        "10.0 m",
                        "In 6 hours : "
                ));
        resultList.add(
                new result(
                        "11.8 m",
                        "In 7 hours : "
                ));
        resultList.add(
                new result(
                        "8.2 m",
                        "In 8 hours : "
                )
        );
        resultList.add(
                new result(
                        "13.3 m",
                        "In 9 hours : "
                ));
        resultList.add(
                new result(
                        "10.0 m",
                        "In 10 hours : "
                ));
        resultList.add(
                new result(
                        "11.8 m",
                        "In 11 hours : "
                ));
        resultList.add(
                new result(
                        "8.2 m",
                        "In 12 hours : "
                )
        );

        ResultAdaptor resultAdaptor= new ResultAdaptor(resultList,this);
        recyclerView.setAdapter(resultAdaptor);
    }
}
