package harish.hibare.demodatabase;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

import static harish.hibare.demodatabase.MainActivity.cursor;

public class ListV extends AppCompatActivity {
    SearchView searchView;
    String string;
    ListView listView;
    ArrayAdapter<String> adapter;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_v);
        searchView = (SearchView) findViewById(R.id.search);
        listView = (ListView) findViewById(R.id.list_views);


        ArrayList<CustomClass> items = new ArrayList<>();
        while (cursor.moveToNext()){
            items.add(new CustomClass("Rollno : "+cursor.getString(0),"Name   : "+cursor.getString(1),"Marks  : "+cursor.getString(2)));
        }
        


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        CustomAdapter customAdapter = new CustomAdapter(ListV.this,items);

        ListView listView = findViewById(R.id.list_views);
        listView.setAdapter(customAdapter);
        listView.setDividerHeight(20);
    }
}