package tutorials.uivision.myrecyclerviewitemdecorations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new MyAdapter(PopulateData.dataToBePassed());
        recyclerView.setAdapter(adapter);

        int sidePadding = getResources().getDimensionPixelSize(R.dimen.sidePadding);
        int topPadding = getResources().getDimensionPixelSize(R.dimen.topPadding);
        recyclerView.addItemDecoration(new RecyclerDecoration(sidePadding, topPadding));

    }
}
