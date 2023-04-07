package com.example.home_work_six

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        words()

    }
    private fun words() {
        val words = arrayOf ("переменная", "функция"," метод", "аргумент" ,"параметр",
            "привязка", "длина", "высота", "размер")
        val vowels = mutableListOf<Char>()
        for (word in words){
            for (char in word.toLowerCase()) {
                if (char in "аиоыу") {
                    if (!vowels.contains(char)) {
                        vowels.add(char)
                    }
                    println("гласные буквы: ${vowels.joinToString()}")
                }
            }
        }
    }
}