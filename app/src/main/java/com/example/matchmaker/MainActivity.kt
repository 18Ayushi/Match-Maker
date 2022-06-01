package com.example.matchmaker

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.matchmaker.R


import java.util.*


class MainActivity : AppCompatActivity() {
    val mname = arrayListOf( "yogita","shibani",
        "saraswati",
        "ayushi",
        "mahak",
        "adya",
        "sucharita",
        "anauska",
        "shruti",
        "simran",
        "amisha",
        "ankita",
        "kasish",
        "alisha")
    val fname = arrayListOf("ashutosh", "prerit(a)", "prerit(j)", "sagar", "swastik","soham","anshu","ashish","jibesh","soumendra"
    )




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val showBtn=findViewById<Button>(R.id.showBtn)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val name = findViewById<EditText>(R.id.editTextPersonName4) as EditText
        val reg = findViewById<EditText>(R.id.editTextPersonName5) as EditText
        reg.setText("")
        name.setText("")

        showBtn.setOnClickListener {
            if (!(TextUtils.isEmpty(name.getText().toString())))
            {val random = Random()
            val randomProgram = random.nextInt(mname.count())

            textView4.text = mname[randomProgram]}

            else{Toast.makeText(getApplicationContext(),"Invalid entry",Toast.LENGTH_SHORT).show();  }

        }



        val button4=findViewById<Button>(R.id.button4)

            button4.setOnClickListener {
                if (!(TextUtils.isEmpty(reg.getText().toString())))
                { val random = Random()
                val randomProgram = random.nextInt(fname.count())

                textView4.text = fname[randomProgram]}

                else{Toast.makeText(getApplicationContext(),"Invalid entry",Toast.LENGTH_SHORT).show();  }
            }



    }
}

