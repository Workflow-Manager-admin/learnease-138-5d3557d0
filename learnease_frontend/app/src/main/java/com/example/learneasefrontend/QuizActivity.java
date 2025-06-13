package com.example.learneasefrontend;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {
    public static final String EXTRA_TOPIC = "topic";
    public static final String EXTRA_QUIZ = "quiz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        String topic = getIntent().getStringExtra(EXTRA_TOPIC);
        String quiz = getIntent().getStringExtra(EXTRA_QUIZ);

        TextView label = findViewById(R.id.label_quiz);
        TextView topicView = findViewById(R.id.text_topic);
        TextView quizView = findViewById(R.id.text_quiz);
        Button backBtn = findViewById(R.id.button_back);

        if (topic != null) {
            topicView.setText(topic);
        }
        if (quiz != null) {
            quizView.setText(quiz);
        }

        backBtn.setOnClickListener(v -> finish());
    }
}
