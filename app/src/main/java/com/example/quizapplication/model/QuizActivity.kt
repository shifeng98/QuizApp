package com.example.quizapplication.model

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.viewbinding.library.activity.viewBinding
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quizapplication.R
import com.example.quizapplication.databinding.ActivityQuizBinding


class QuizActivity : AppCompatActivity(), View.OnClickListener {

    private val binding : ActivityQuizBinding by viewBinding()
    private var mCurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        mQuestionsList = QuestionRepo().getQuestions()

        setQuestion()

        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btnSub.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question= mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            binding.btnSub.text = "FINISH"
        }else{
            binding.btnSub.text = "SUBMIT"
        }

        binding.progressBar.progress = mCurrentPosition
        binding.txt1.text = question!!.question
        binding.imageView.setImageResource(question.image)
        binding.btn1.text = question.optionOne
        binding.btn2.text = question.optionTwo
        binding.btn3.text = question.optionThree
        binding.btn4.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, binding.btn1)
        options.add(1, binding.btn2)
        options.add(2, binding.btn3)
        options.add(3, binding.btn4)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_1 ->{
                selectedOptionView(binding.btn1, selectedOptionNum = 1)
            }
            R.id.btn_2 ->{
                selectedOptionView(binding.btn2, selectedOptionNum = 1)
            }
            R.id.btn_3 ->{
                selectedOptionView(binding.btn3, selectedOptionNum = 1)
            }
            R.id.btn_4 ->{
                selectedOptionView(binding.btn4, selectedOptionNum = 1)
            }
            R.id.btn_sub ->{
                if (mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                            Toast.makeText(this,
                                "You have succesfully completed the Quiz",
                                Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    val question = mQuestionsList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionsList!!.size){
                        binding.btnSub.text = "FINISH"
                    }else{
                        binding.btnSub.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }

    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                binding.btn1.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 ->{
                binding.btn2.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 ->{
                binding.btn3.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            4 ->{
                binding.btn4.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

}