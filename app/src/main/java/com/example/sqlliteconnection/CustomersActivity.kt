package com.example.sqlliteconnection

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class CustomersActivity : AppCompatActivity() {

    private lateinit var btnCreateCustomer: Button
    private lateinit var etSearch: EditText
    private lateinit var customerListLayout: LinearLayout

    // Dummy data class
    data class Customer(
        val name: String,
        val dob: String,
        val phone: String,
        val email: String,
        val accountNumber: String
    )

    // Sample dummy data
    private val customerList = listOf(
        Customer(
            "Christian Espinoza",
            "17.07.1964",
            "+81 3 1234 5678",
            "ch.esp@gmail.com",
            "87462354781723"
        ),
        Customer(
            "Ayu Lestari",
            "12.12.1992",
            "+62 812 3456 7890",
            "ayu@gmail.com",
            "12345678901234"
        ),
        Customer(
            "John Doe",
            "01.01.1990",
            "+62 812 0000 0000",
            "john@example.com",
            "98765432109876"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customers)

//    }

    }
}