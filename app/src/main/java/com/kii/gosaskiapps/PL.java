package com.kii.gosaskiapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PL  extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListPL = new String[]{"Polsek Sukajadi", "Polsek Tenayan Raya", "Polsek Tampan",
                "Polsek Lima Puluh", "Polsek Payung Sekaki"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListPL));
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
            if (pilihan.equals("Polsek Sukajadi"))
            {
                a = new Intent(this, Sukajadi.class);
                startActivity(a);
            } else if (pilihan.equals("Polsek Tenayan Raya"))
            {
                a = new Intent(this, TenayanRaya.class);
                startActivity(a);
            } else if (pilihan.equals("Polsek Tampan"))
            {
                a = new Intent(this, Tampan.class);
                startActivity(a);
            } else if (pilihan.equals("Polsek Lima Puluh"))
            {
                a = new Intent(this, LimaPuluh.class);
                startActivity(a);
            } else if (pilihan.equals("Polsek Payung Sekaki"))
            {
                a = new Intent(this, PayungSekaki.class);
                startActivity(a);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}