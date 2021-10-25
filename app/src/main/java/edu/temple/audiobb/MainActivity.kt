package edu.temple.audiobb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var lis : MutableList<Book> = listOf(Book("hi","hello")) as MutableList<Book>
        var newBooks  = BookList(lis)
    }
}