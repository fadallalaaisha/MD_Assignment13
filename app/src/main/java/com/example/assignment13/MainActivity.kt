package com.example.assignment13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rvNumbers=findViewById<RecyclerView>(R.id.rvNumbers)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        var numberAdapter=NumbersRVAdapter(sequence(100))
        rvNumbers.adapter=numberAdapter

    }
    fun sequence(number:Int):List<BigInteger>{
        var numberList= MutableList<BigInteger>(number,{BigInteger.ZERO })
        var number1=BigInteger.ZERO
        var number2=BigInteger.ONE
        numberList[0]=number1
        numberList[1]=number2
        for (x in 1..number){
           var sum=number1+number2
            number1=number2
            number2=sum
            numberList[x-1]=number1
    }
    return numberList
}}
