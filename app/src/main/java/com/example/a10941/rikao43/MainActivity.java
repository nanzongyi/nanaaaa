package com.example.a10941.rikao43;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv1,rv2,rv3;
    MainAdapter adapter;
    List<String> list1=new ArrayList<>();
    List<String> list2=new ArrayList<>();
    List<String> list3=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initdata();
    }



    private void init() {
        rv1=findViewById(R.id.rv1);
        rv2=findViewById(R.id.rv2);
        rv3=findViewById(R.id.rv3);
        adapter=new MainAdapter();
        GridLayoutManager manager1=new GridLayoutManager(this,4);
        manager1.setOrientation(LinearLayoutManager.VERTICAL);
        rv1.setLayoutManager(manager1);
        rv1.setAdapter(adapter);
        GridLayoutManager manager2=new GridLayoutManager(this,4);
        manager2.setOrientation(LinearLayoutManager.VERTICAL);
        rv2.setLayoutManager(manager2);
        rv2.setAdapter(adapter);
        GridLayoutManager manager3=new GridLayoutManager(this,4);
        manager3.setOrientation(LinearLayoutManager.VERTICAL);
        rv3.setLayoutManager(manager3);
        rv3.setAdapter(adapter);
    }
    private void initdata() {
        for (int i=0;i<20;i++){
            list1.add("Item"+i);
        }
        for (int i=0;i<40;i++){
            list1.add("Nan"+i);
        }
        for (int i=0;i<20;i++){
            list1.add("Zong"+i);
        }
        adapter.rh(list1);
    }
}
