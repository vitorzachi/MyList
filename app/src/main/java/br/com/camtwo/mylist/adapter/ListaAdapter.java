package br.com.camtwo.mylist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.camtwo.mylist.R;
import br.com.camtwo.mylist.model.Lista;

/**
 * Created by vitor on 06/07/15.
 */
public class ListaAdapter extends ArrayAdapter<Lista> {

    public ListaAdapter(Context context, List<Lista> objects) {
        super(context, R.layout.lista_compra, objects);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Get the data item for this position
        Lista item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.lista_compra, parent, false);
        }
        // Lookup view for data population
        ((TextView) view.findViewById(R.id.descLista)).setText(item.getDescricao());
        ((TextView) view.findViewById(R.id.qtdLista)).setText(getContext().getString(R.string.qtdItens, item.getItens().size()));


        // Return the completed view to render on screen
        return view;
    }

}
