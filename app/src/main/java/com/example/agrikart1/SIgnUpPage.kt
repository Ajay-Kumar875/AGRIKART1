package com.example.agrikart1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.agrikart1.databinding.ActivitySignUpPageBinding
import com.google.firebase.auth.FirebaseAuth

class SIgnUpPage : AppCompatActivity() {
    lateinit var signUpBinding : ActivitySignUpPageBinding
    val auth : FirebaseAuth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signUpBinding = ActivitySignUpPageBinding.inflate(layoutInflater)
        val view = signUpBinding.root
        setContentView(view)

        signUpBinding.Register.setOnClickListener {

            val email = signUpBinding.Email.text.toString()
            val password = signUpBinding.Code.text.toString()

            signUpWithFirebase(email,password)
            val intent = Intent(this,HomePage::class.java)
            startActivity(intent)
            finish()


        }

    }

    fun signUpWithFirebase(email : String, password : String){

        signUpBinding.Register.isClickable = false

        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener { task ->

            if(task.isSuccessful){

                Toast.makeText(applicationContext,"Your account has been created",Toast.LENGTH_SHORT).show()
                finish()
                signUpBinding.Register.isClickable = true

            }else{

                Toast.makeText(applicationContext,task.exception?.localizedMessage,Toast.LENGTH_SHORT).show()

            }

        }

    }
}
