package com.example.learneasefrontend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ExplanationActivity extends AppCompatActivity {
    public static final String EXTRA_TOPIC = "topic";
    public static final String EXTRA_EXPLANATION = "explanation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

        String topic = getIntent().getStringExtra(EXTRA_TOPIC);
        String explanation = getIntent().getStringExtra(EXTRA_EXPLANATION);

        TextView label = findViewById(R.id.label_explanation);
        TextView topicView = findViewById(R.id.text_topic);
        TextView explanationView = findViewById(R.id.text_explanation);
        Button backBtn = findViewById(R.id.button_back);

        if (topic != null) {
            topicView.setText(topic);
        }
        if (explanation != null) {
            explanationView.setText(explanation);
        }

        backBtn.setOnClickListener(v -> finish());
    }
}
