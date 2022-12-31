package com.example.matchmaker

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


import java.util.*


class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    val mname = arrayListOf( "yogita","shibani","saraswati","ayushi","mahak","adya","sucharita","anauska","shruti","simran","ankita","kasish","alisha")

    val fname = arrayListOf("ashutosh", "prerit(a)", "prerit(j)", "sagar", "swastik","soham","anshu","ashish","jibesh","soumendra")

    var option = arrayOf<String?>("friend","enemy","partner","best friend","sibling")



    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView4 = findViewById<TextView>(R.id.textView4)
        val name = findViewById<EditText>(R.id.editTextPersonName4) as EditText
        val reg = findViewById<EditText>(R.id.editTextPersonName5) as EditText

        reg.setText("")
        name.setText("")


        //val malebtn=findViewById<Button>(R.id.showBtn)
        val malebtn=findViewById<ImageButton>(R.id.imageButton)
        malebtn.setOnClickListener {
            if (!(TextUtils.isEmpty(name.getText().toString())) && !(TextUtils.isEmpty(reg.getText().toString()))  ) {
                val random = Random()
                val randomProgram = random.nextInt(mname.count())

                textView4.text = mname[randomProgram]

                val st = findViewById<TextView>(R.id.textView2)

                st.visibility=View.VISIBLE

                val tv = findViewById<TextView>(R.id.textView5)
                tv.visibility = View.VISIBLE
            }
            else {
                Toast.makeText(getApplicationContext(), "Invalid entry", Toast.LENGTH_SHORT)
                    .show(); }

        }

        val femalebtn=findViewById<ImageButton>(R.id.imageButton2)

            femalebtn.setOnClickListener {
                if (!(TextUtils.isEmpty(reg.getText().toString())) && !(TextUtils.isEmpty(name.getText().toString())))
                { val random = Random()
                val randomProgram = random.nextInt(fname.count())

                textView4.text = fname[randomProgram]

                    val st = findViewById<TextView>(R.id.textView2)

                    st.visibility=View.VISIBLE

                    val tv = findViewById<TextView>(R.id.textView5)
                    tv.visibility = View.VISIBLE
                }

                else{Toast.makeText(getApplicationContext(),"Invalid entry",Toast.LENGTH_SHORT).show();  }
            }

        val spin = findViewById<Spinner>(R.id.spinner1)
        spin.onItemSelectedListener = this

        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(this, R.layout.spinnerlayout,option)

        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spin.adapter = ad


    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        val name = (findViewById<EditText>(R.id.editTextPersonName4) as EditText).getText().toString()
        val textview = findViewById<TextView>(R.id.textView2)

        val tv = findViewById<TextView>(R.id.textView5)
        tv.text =  name
            textview.text =   "  your " + option[position] + " is"

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}

