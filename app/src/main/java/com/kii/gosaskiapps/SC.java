package com.kii.gosaskiapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SC extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListSC = new String[]{"SMK Muhammadiyah 1 Pekanbaru", "SMK Muhammadiyah 2 Pekanbaru", "SMK Muhammadiyah 3 Pekanbaru",
                "SMA Muhammadiyah 1 Pekanbaru", "SMK Multi Mekanik Masmur Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListSC));
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
            if (pilihan.equals("SMK Muhammadiyah 1 Pekanbaru"))
            {
                a = new Intent(this, SCMutu.class);
                startActivity(a);
            } else if (pilihan.equals("SMK Muhammadiyah 2 Pekanbaru"))
            {
                a = new Intent(this, SCMuda.class);
                startActivity(a);
            } else if (pilihan.equals("SMK Muhammadiyah 3 Pekanbaru"))
            {
                a = new Intent(this, SCMuti.class);
                startActivity(a);
            } else if (pilihan.equals("SMA Muhammadiyah 1 Pekanbaru"))
            {
                a = new Intent(this, SCMMutu.class);
                startActivity(a);
            } else if (pilihan.equals("SMK Multi Mekanik Masmur Pekanbaru"))
            {
                a = new Intent(this, SCMasmur.class);
                startActivity(a);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}