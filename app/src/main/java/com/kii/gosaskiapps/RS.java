package com.kii.gosaskiapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListRS = new String[]{"Rumah Sakit Awal Bros", "Rumah Sakit Eka Hospital", "Rumah Sakit Syafira",
                "Rumah Sakit Ibnu Sina", "Rumah Sakit Eria Bunda"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListRS));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);

    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bros"))
            {
                a = new Intent(this, RSAwalBros.class);
                startActivity(a);
            } else if (pilihan.equals("Rumah Sakit Eka Hospital"))
            {
                a = new Intent(this, RSEkaHospital.class);
                startActivity(a);
            } else if (pilihan.equals("Rumah Sakit Syafira"))
            {
                a = new Intent(this, RSSyafira.class);
                startActivity(a);
            } else if (pilihan.equals("Rumah Sakit Ibnu Sina"))
            {
                a = new Intent(this, RSIbnuSina.class);
                startActivity(a);
            } else if (pilihan.equals("Rumah Sakit Eria Bunda"))
            {
                a = new Intent(this, RSEriaBunda.class);
                startActivity(a);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
