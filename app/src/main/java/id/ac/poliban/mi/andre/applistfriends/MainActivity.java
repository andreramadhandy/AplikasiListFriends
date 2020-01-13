package id.ac.poliban.mi.andre.applistfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> friends = new ArrayList<>();

    {
        friends.add("Ahmad Irfan");
        friends.add("Akhmad Indrawan");
        friends.add("Andri Sudarman");
        friends.add("Diana");
        friends.add("Gina Melati Addini");
        friends.add("Iffa Nafiatunnisa");
        friends.add("Lidya Lusiana");
        friends.add("Melisa Arianie");
        friends.add("M. Ade Setiawan");
        friends.add("Purnama");
        friends.add("Radhika Rahmadani");
        friends.add("Rafi'i Hidayar Nor");
        friends.add("Renaldy Kambayu");
        friends.add("Sarwan");
        friends.add("Thasya Ismyanti Novianda");
        friends.add("Yunita Rahmah");
        friends.add("Rezal Alfansyah");
        friends.add("Agustya Fazriani");
        friends.add("Ratu Hana Yunita");
        friends.add("M Rizky Maulana");
        friends.add("Radiansyah");
        friends.add("Taufan Ryanda Utama");
        friends.add("Magfirah Maulidya");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null)
            setTitle("Aplikasi List Teman");

        ListView listView = findViewById(R.id.listo_view);

        ArrayAdapter adapter = new ArrayAdapter(this,
                R.layout.item_rows_frieds, R.id.tv_item_teman, friends);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Anda mengklik: " + friends.get(position), Toast.LENGTH_SHORT).show();
        });
    }
}
