package harish.hibare.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CustomClass> {


    public CustomAdapter(@NonNull Context context, ArrayList<CustomClass> resource) {
        super(context, 0, resource);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_item, parent, false);


        CustomClass item = getItem(position);


        TextView roll_no = convertView.findViewById(R.id.rollno);
        roll_no.setText(item.getRoll_no());


        TextView name = convertView.findViewById(R.id.name);
        name.setText(item.getName());


        TextView marks = convertView.findViewById(R.id.marks);
        marks.setText(item.getMarks());


        return convertView;
    }
}
