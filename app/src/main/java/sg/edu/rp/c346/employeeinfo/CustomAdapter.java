package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17000719 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Employitem> employList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Employitem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        employList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;
        if(row == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout_id, parent, false);
        }
            TextView tvName = row.findViewById(R.id.textViewName);
            TextView tvJob = row.findViewById(R.id.textViewJob);
            TextView tvSalary = row.findViewById(R.id.textViewPay);
            Employitem currentItem = employList.get(position);
            String name = currentItem.getName();
            String job = currentItem.getJob();
            float salary = currentItem.getSalary();
            tvName.setText(name);
            tvJob.setText(job);
            tvSalary.setText(salary + "");
            return row;

    }
}
