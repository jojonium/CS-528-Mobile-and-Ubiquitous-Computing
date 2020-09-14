package org.petitti.project1screen1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val numQuestions = 10;
    private var currentQuestion = 1;
    private var questionNumberDisplay: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.questionNumberDisplay = findViewById<TextView>(R.id.questionNumberDisplay)
        this.showQuestionNumber()
    }

    private fun showQuestionNumber() {
        val qnd = this.questionNumberDisplay
        if (qnd != null) {
            val label1: String = getString(R.string.question_label_1)
            val label2: String = getString(R.string.question_label_2)
            val questionLabel: String = "$label1 $currentQuestion $label2 $numQuestions"
            qnd.text = questionLabel
        }
    }
}