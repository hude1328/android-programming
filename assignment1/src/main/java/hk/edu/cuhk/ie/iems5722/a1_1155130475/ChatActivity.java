package hk.edu.cuhk.ie.iems5722.a1_1155130475;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ChatActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText messageText;
    private Button messageButton;
    private ListView listView;
    private ArrayList<Message> messageList = new ArrayList<>();
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageList.clear();
                finish();
            }
        });

        listView = findViewById(R.id.messageListView);
        messageText = findViewById(R.id.messageText);
        messageButton = findViewById(R.id.messageButton);
        messageButton.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        String input = messageText.getText().toString();
        String date = new SimpleDateFormat("hh:mm").format(new Date());
        if(!input.equals("")){
            messageList.add(new Message(input, date));
            adapter = new MyAdapter(ChatActivity.this, R.layout.msg_item, messageList);
            listView.setAdapter(adapter);
            messageText.setText("");
        }

    }

}
