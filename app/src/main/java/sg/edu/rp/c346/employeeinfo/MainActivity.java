package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmploy;

    ArrayList<Employitem> alEmployList;
    CustomAdapter caEmploy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmploy = findViewById(R.id.ListViewEmploy);

        alEmployList = new ArrayList<>();

        Employitem employ1 = new Employitem("John","Software Technical Leader", 3400f);
        Employitem employ2 = new Employitem("May","Programmer", 2200f);
        Employitem employ3 = new Employitem("May","Programmer", 2200f);
        Employitem employ4 = new Employitem("May","Programmer", 2200f);
        Employitem employ5 = new Employitem("May","Programmer", 2200f);
        Employitem employ6 = new Employitem("May","Programmer", 2200f);
        Employitem employ7 = new Employitem("May","Programmer", 2200f);
        Employitem employ8 = new Employitem("May","Programmer", 2200f);
        Employitem employ9 = new Employitem("May","Programmer", 2200f);
        Employitem employ10 = new Employitem("May","Programmer", 2200f);
        Employitem employ11 = new Employitem("May","Programmer", 2200f);
        Employitem employ12 = new Employitem("May","Programmer", 2200f);
        Employitem employ13 = new Employitem("May","Programmer", 2200f);
        Employitem employ14 = new Employitem("May","Programmer", 2200f);
        Employitem employ15 = new Employitem("May","Programmer", 2200f);
        Employitem employ16 = new Employitem("May","Programmer", 2200f);
        Employitem employ17 = new Employitem("May","Programmer", 2200f);
        Employitem employ18 = new Employitem("May","Programmer", 2200f);
        Employitem employ19 = new Employitem("May","Programmer", 2200f);
        Employitem employ20 = new Employitem("May","Programmer", 2200f);
        alEmployList.add(employ1);
        alEmployList.add(employ2);
        alEmployList.add(employ3);
        alEmployList.add(employ4);
        alEmployList.add(employ5);
        alEmployList.add(employ6);
        alEmployList.add(employ7);
        alEmployList.add(employ8);
        alEmployList.add(employ9);
        alEmployList.add(employ10);
        alEmployList.add(employ11);
        alEmployList.add(employ12);
        alEmployList.add(employ13);
        alEmployList.add(employ14);
        alEmployList.add(employ15);
        alEmployList.add(employ16);
        alEmployList.add(employ17);
        alEmployList.add(employ18);
        alEmployList.add(employ19);
        alEmployList.add(employ20);

        caEmploy = new CustomAdapter(this, R.layout.employ_item, alEmployList);

        lvEmploy.setAdapter(caEmploy);
    }
}
