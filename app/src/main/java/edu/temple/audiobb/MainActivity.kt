package edu.temple.audiobb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bContainer : MutableList<Book> = listOf(Book("Book1","Author1"),Book("Book2","Author2")
            ,Book("Book3","Author3"),Book("Book4","Author4"),Book("Book5","Author5")
            ,Book("Book6","Author6"),Book("Book7","Author7"),Book("Book8","Author8")
            ,Book("Book9","Author9"),Book("Book10","Author10")) as MutableList<Book>
        var newBooks  = BookList(bContainer)
    }
}