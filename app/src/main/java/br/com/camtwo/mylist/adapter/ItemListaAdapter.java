package br.com.camtwo.mylist.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.camtwo.mylist.R;
import br.com.camtwo.mylist.model.Item;

/**
 * Created by vitor on 06/07/15.
 */
public class ItemListaAdapter extends ArrayAdapter<Item> {

    public ItemListaAdapter(Context context, List<Item> objects) {
        super(context, R.layout.item_lista_compra, objects);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Get the data item for this position
        Item item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_lista_compra, parent, false);
        }
        // Lookup view for data population
        ((TextView) view.findViewById(R.id.descItem)).setText(item.getDescricao());
        ((TextView) view.findViewById(R.id.qtdItem)).setText(item.getQuantidade());

        if (item.isMarcado()) {
            view.setBackgroundColor(Color.GRAY);
        }
        // Return the completed view to render on screen
        return view;
    }

}
