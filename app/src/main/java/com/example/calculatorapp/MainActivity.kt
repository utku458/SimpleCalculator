package com.example.calculatorapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    var inputtext:String=""
    var outputext:String=""
    var secim:String=""


     var sayi1:Int? = null
     var sayi2:Int? = null
     var sonuc:Int? = null
    private lateinit var sayilar:ArrayList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        sonuc=0
        sayilar= ArrayList()






      // binding.button9.setBackgroundColor(Color.rgb(255, 165, 0))

    }

    fun button1clicked(view: View){
            inputtext+="1"
            outputext+="1"
            binding.inputText.setText(inputtext)
    }

    fun btn0clicked(view: View){
        inputtext+="0"
        outputext+="0"
        binding.inputText.setText(inputtext)
    }
    fun button2clicked(view: View){

        inputtext+="2"
        outputext+="2"
        binding.inputText.setText(inputtext)

    }
    fun button3clicked(view: View){
        inputtext+="3"
        outputext+="3"
        binding.inputText.setText(inputtext)

    }
    fun button4clicked(view: View){

        inputtext+="4"
        outputext+="4"
        binding.inputText.setText(inputtext)
    }
    fun button5clicked(view: View){
        inputtext+="5"
        outputext+="5"
        binding.inputText.setText(inputtext)

    }
    fun button6clicked(view: View){
        inputtext+="6"
        outputext+="6"
        binding.inputText.setText(inputtext)

    }
    fun button7clicked(view: View){
        inputtext+="7"
        outputext+="7"
        binding.inputText.setText(inputtext)

    }
    fun button8clicked(view: View){
        inputtext+="8"
        outputext+="8"
        binding.inputText.setText(inputtext)

    }
    fun button9clicked(view: View){
        inputtext+="9"
        outputext+="9"
        binding.inputText.setText(inputtext)

    }
    fun btntopla(view: View){

        if (outputext.equals("")){
            binding.uyarimsj.setText("Once sayi giriniz")
        }
        else{

        //sayi1= outputext.toInt()
            inputtext+="+"
         sayilar.add(outputext.toInt())
        outputext=""
        secim="topla"

        binding.inputText.setText(inputtext)
        }



    }
    fun onclickcikar(view: View){
        if (outputext.equals("")){
            binding.uyarimsj.setText("Once sayi giriniz")
        }
        else{
        //sayi1= outputext.toInt()
            sayilar.add(outputext.toInt())
            outputext=""
            secim="cikar"
            inputtext+="-"
            binding.inputText.setText(inputtext)
        }
    }
    fun onclickcarp(view: View){
        if (outputext.equals("")){
            binding.uyarimsj.setText("Once sayi giriniz")
        }
        else{
            //sayi1= outputext.toInt()
            sayilar.add(outputext.toInt())
            outputext=""
            inputtext+="x"
            secim="carp"
            binding.inputText.setText(inputtext)
        }

    }
    fun onclickbol(view: View){
        if (outputext.equals("")){
            binding.uyarimsj.setText("Once sayi giriniz")
        }
        else{
           // sayi1= outputext.toInt()
            sayilar.add(outputext.toInt())
            outputext=""
            inputtext+="/"
            secim="bol"
            binding.inputText.setText(inputtext)
        }

    }

    fun btnesittir(view: View){
        //sayi2=outputext.toInt()
        //sonuc=sayi1!!+sayi2!!



        if (outputext.equals("")||inputtext.equals("")){
            binding.uyarimsj.setText("Once sayi giriniz")
        }else{
            sayilar.add(outputext.toInt())
        }
        if (secim=="topla"){
            for (sayi in sayilar){
                sonuc= sonuc!!+sayi
            }

            binding.outputText.setText(sonuc.toString())
            sayilar.clear()

        }
        else if (secim=="cikar"){
            sonuc=sayilar.get(0)


            for (i in 1..sayilar.size-1){
                sonuc= sonuc!! -sayilar.get(i)

            }

            binding.outputText.setText(sonuc.toString())
            sayilar.clear()
        }
        else if (secim=="carp"){
            sonuc=1
            for (sayi in sayilar){
                sonuc= sonuc!!*sayi
            }

            binding.outputText.setText(sonuc.toString())
            sayilar.clear()
        }
        else if (secim=="bol"){
            sonuc=sayilar.get(0)


            for (i in 1..sayilar.size-1){
                sonuc= sonuc!! /sayilar.get(i)

            }

            binding.outputText.setText(sonuc.toString())
            sayilar.clear()
        }

    }

    fun btnsil(view: View){


        sayi1=0
        sayi2=0
        sayilar.clear()
        inputtext=""
        outputext=""
        binding.inputText.setText("")
        binding.outputText.setText("")
        sonuc=0

    }
}