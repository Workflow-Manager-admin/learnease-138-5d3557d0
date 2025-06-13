package com.example.learneasefrontend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText topicEditText;
    private Button explanationButton;
    private Button analogyButton;
    private Button quizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topicEditText = findViewById(R.id.editText_topic);

        explanationButton = findViewById(R.id.button_explanation);
        analogyButton = findViewById(R.id.button_analogy);
        quizButton = findViewById(R.id.button_quiz);

        explanationButton.setOnClickListener(v -> openFeature("explanation"));
        analogyButton.setOnClickListener(v -> openFeature("analogy"));
        quizButton.setOnClickListener(v -> openFeature("quiz"));
    }

    // PUBLIC_INTERFACE
    private void openFeature(String feature) {
        String topic = topicEditText.getText().toString().trim();
        if (topic.isEmpty()) {
            Toast.makeText(this, "Please enter a topic.", Toast.LENGTH_SHORT).show();
            return;
        }
        // Simulate AI responses
        String explanation = "A simple explanation about \"" + topic + "\".";
        String analogy = "An analogy for \"" + topic + "\" in real life.";
        String quiz = "Quiz on \"" + topic + "\": What is the core idea behind it?";

        Intent intent;
        switch (feature) {
            case "explanation":
                intent = new Intent(this, ExplanationActivity.class);
                intent.putExtra(ExplanationActivity.EXTRA_TOPIC, topic);
                intent.putExtra(ExplanationActivity.EXTRA_EXPLANATION, explanation);
                break;
            case "analogy":
                intent = new Intent(this, AnalogyActivity.class);
                intent.putExtra(AnalogyActivity.EXTRA_TOPIC, topic);
                intent.putExtra(AnalogyActivity.EXTRA_ANALOGY, analogy);
                break;
            case "quiz":
                intent = new Intent(this, QuizActivity.class);
                intent.putExtra(QuizActivity.EXTRA_TOPIC, topic);
                intent.putExtra(QuizActivity.EXTRA_QUIZ, quiz);
                break;
            default:
                return;
        }
        startActivity(intent);
    }
}
