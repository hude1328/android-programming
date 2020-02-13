package hk.edu.cuhk.ie.iems5722.a1_1155130475;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter {
    private final int layoutId;

    public MyAdapter(Context context, int textViewResourceId, List<Message> messageList){
        super(context, textViewResourceId, messageList);
        layoutId = textViewResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Message message = (Message) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(layoutId, null);
        TextView messageContent = view.findViewById(R.id.message_content);
        TextView timestamp = view.findViewById(R.id.timestamp);
        messageContent.setText(message.getMessage());
        timestamp.setText(message.getTimestamp());
        return view;
    }

}
