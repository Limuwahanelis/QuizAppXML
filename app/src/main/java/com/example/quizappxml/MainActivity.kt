package com.example.quizappxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start:Button = findViewById(R.id.btn_start);
        val name_filed:EditText = findViewById(R.id.name_field);

        btn_start.setOnClickListener {
            if(name_filed.text.isEmpty())
            {
                Toast.makeText(this,"Enter name",Toast.LENGTH_SHORT).show()

            }
            else
            {
                val intent:Intent = Intent(this,QuizQuestionsActivity::class.java);
                startActivity(intent);
                finish(); // closes current activity
            }
        }
    }
}