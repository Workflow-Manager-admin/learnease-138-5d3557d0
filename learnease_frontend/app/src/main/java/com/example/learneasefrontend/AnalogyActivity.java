package com.example.learneasefrontend;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AnalogyActivity extends AppCompatActivity {
    public static final String EXTRA_TOPIC = "topic";
    public static final String EXTRA_ANALOGY = "analogy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analogy);

        String topic = getIntent().getStringExtra(EXTRA_TOPIC);
        String analogy = getIntent().getStringExtra(EXTRA_ANALOGY);

        TextView label = findViewById(R.id.label_analogy);
        TextView topicView = findViewById(R.id.text_topic);
        TextView analogyView = findViewById(R.id.text_analogy);
        Button backBtn = findViewById(R.id.button_back);

        if (topic != null) {
            topicView.setText(topic);
        }
        if (analogy != null) {
            analogyView.setText(analogy);
        }

        backBtn.setOnClickListener(v -> finish());
    }
}
