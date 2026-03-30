package com.example.socialsparkassignment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.MonthDay

class MainActivity : AppCompatActivity() {
    lateinit var txtTimeOfDay: EditText
    lateinit var tvSuggestionDisplay: TextView
    lateinit var btnReset: Button
    lateinit var btnSubmit: Button
    lateinit var btnSuggest: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //var ep = findViewById<Button>(R.id.eButton)
        //This is basically another way of doing it.
        txtTimeOfDay = findViewById(R.id.txtTimeOfDay)
        tvSuggestionDisplay = findViewById(R.id.tvSuggestionDisplay)
        btnReset = findViewById(R.id.btnReset)
        btnSubmit = findViewById(R.id.btnSubmit)
        btnSuggest = findViewById(R.id.btnSuggest)


            //Clear button
            btnReset.setOnClickListener {
                txtTimeOfDay.text.clear()
                tvSuggestionDisplay.text = "your suggestion will appear here"

            //submit button
                btnSubmit.setOnClickListener {


                    // 1. Get the actual text, convert to string, remove space and lowercase it
                    val input = txtTimeOfDay.text.toString()

                    // Use if functions for different times of the day
                    if (input.isEmpty()){
                   tvSuggestionDisplay.text = "Error"
                    }
                    if (input == "morning") {
                        tvSuggestionDisplay.text = "Send a 'Good morning' text to a family member."
                    } else if (input == "mid-morning") {
                        tvSuggestionDisplay.text =
                            "Reach out to a colleague with a quick 'Thank you'."
                    } else if (input == "afternoon") {
                        tvSuggestionDisplay.text =
                            "Share a funny meme or interesting link with a friend."
                    } else if (input == "snack time") {
                        tvSuggestionDisplay.text = "Send a 'I am thinking of you' message."
                    } else if (input == "dinner") {
                        tvSuggestionDisplay.text =
                            "Call a friend or relative for a 5-minute catch-up."
                    } else if (input == "after dinner") {
                        tvSuggestionDisplay.text = "Leave a thoughtful comment on a friend's post."
                    } else {
                        tvSuggestionDisplay.text =
                            "Please enter Morning, Mid-morning, Afternoon, Snack Time, or After dinner."
                    }
                }
                }
            }
            }


