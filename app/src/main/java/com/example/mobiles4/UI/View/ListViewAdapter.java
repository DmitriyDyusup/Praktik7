package com.example.mobiles4.UI.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobiles4.Data.Models.Task;
import com.example.mobiles4.R;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Task> {
    private LayoutInflater inflater;
    private int layout;
    private List<Task> viewModelList;
    public ListViewAdapter(Context context, int resource, List<Task> viewModelList) {
        super(context, resource, viewModelList);
        this.viewModelList = viewModelList;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);
        TextView textView = view.findViewById(R.id.textView);
        ImageView imageView = view.findViewById(R.id.imageView);
        Task task = viewModelList.get(position);
        imageView.setImageResource(task.getImage());
        textView.setText(task.getText());
        return view;
    }
}
