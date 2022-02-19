package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var mode = Mode.circle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setListener()
    }

    fun setListener(){
        binding.button1.setOnClickListener{
            buttonSelected(1)
        }
        binding.button2.setOnClickListener {
            buttonSelected(2)
        }
        binding.button3.setOnClickListener {
            buttonSelected(3)
        }
        binding.button4.setOnClickListener {
            buttonSelected(4)
        }
        binding.button5.setOnClickListener {
            buttonSelected(5)
        }
        binding.button6.setOnClickListener {
            buttonSelected(6)
        }
        binding.button7.setOnClickListener {
            buttonSelected(7)
        }
        binding.button8.setOnClickListener {
            buttonSelected(9)
        }
        binding.button9.setOnClickListener {
            buttonSelected(9)
        }
        binding.button10.setOnClickListener{
            buttonModeArray = arrayListOf(3,3,3,3,3,3,3,3,3,3)
            binding.button1.text=""
            binding.button2.text=""
            binding.button3.text=""
            binding.button4.text=""
            binding.button5.text=""
            binding.button6.text=""
            binding.button7.text=""
            binding.button8.text=""
            binding.button9.text=""
            binding.textView2.text = "Round O"
            mode = com.example.tictactoe.Mode.circle
        }
    }

    var buttonModeArray : ArrayList<Int> = arrayListOf(3,3,3,3,3,3,3,3,3,3)

    fun isWin(buttonNum : Int) :Boolean{
        var mode = false
         when(buttonNum){
            1 -> {if (buttonModeArray[1] == buttonModeArray[2] && buttonModeArray[2] == buttonModeArray[3]){
                mode = true
            }
            if(buttonModeArray[1] == buttonModeArray[4] && buttonModeArray[1] == buttonModeArray[7]){
                mode = true
            }
            if(buttonModeArray[1] == buttonModeArray[5] && buttonModeArray[1] == buttonModeArray[9]){
                mode = true
            }
            }

             2 ->{if (buttonModeArray[2] == buttonModeArray[1] && buttonModeArray[2] == buttonModeArray[3]){
                 mode = true
             }
                 if(buttonModeArray[2] == buttonModeArray[5] && buttonModeArray[2] == buttonModeArray[8]){
                     mode = true
                 }
             }

             3 ->{if (buttonModeArray[3] == buttonModeArray[2] && buttonModeArray[3] == buttonModeArray[1]){
                 mode = true
             }
                 if(buttonModeArray[3] == buttonModeArray[6] && buttonModeArray[3] == buttonModeArray[9]){
                     mode = true
                 }
                 if(buttonModeArray[3] == buttonModeArray[5] && buttonModeArray[3] == buttonModeArray[7]){
                     mode = true
                 }
             }

             4 ->{
                 if (buttonModeArray[4] == buttonModeArray[1] && buttonModeArray[4] == buttonModeArray[7]){
                     mode = true
                 }
                 if(buttonModeArray[4] == buttonModeArray[5] && buttonModeArray[4] == buttonModeArray[6]){
                     mode = true
                 }
             }
             5 -> {if (buttonModeArray[5] == buttonModeArray[1] && buttonModeArray[5] == buttonModeArray[9]){
                 mode = true
             }
                 if(buttonModeArray[5] == buttonModeArray[2] && buttonModeArray[5] == buttonModeArray[8]){
                     mode = true
                 }
                 if(buttonModeArray[5] == buttonModeArray[3] && buttonModeArray[5] == buttonModeArray[7]){
                     mode = true
                 }
                 if(buttonModeArray[5] == buttonModeArray[4] && buttonModeArray[5] == buttonModeArray[6]){
                     mode = true
                 }
             }

             6 -> {if (buttonModeArray[6] == buttonModeArray[3] && buttonModeArray[6] == buttonModeArray[9]){
                 mode = true
             }
                 if(buttonModeArray[6] == buttonModeArray[4] && buttonModeArray[6] == buttonModeArray[5]){
                     mode = true
                 }
                }
             7 -> {if (buttonModeArray[7] == buttonModeArray[4] && buttonModeArray[7] == buttonModeArray[1]){
                 mode = true
             }
                 if(buttonModeArray[7] == buttonModeArray[8] && buttonModeArray[7] == buttonModeArray[9]){
                     mode = true
                 }
                 if(buttonModeArray[7] == buttonModeArray[5] && buttonModeArray[7] == buttonModeArray[3]){
                     mode = true
                 }
             }

             8 -> {if (buttonModeArray[8] == buttonModeArray[2] && buttonModeArray[8] == buttonModeArray[5]){
                 mode = true
             }
                 if(buttonModeArray[8] == buttonModeArray[7] && buttonModeArray[8] == buttonModeArray[9]){
                     mode = true
                 }
                }
             9 -> {if (buttonModeArray[9] == buttonModeArray[5] && buttonModeArray[9] == buttonModeArray[1]){
                 mode = true
             }
                 if(buttonModeArray[9] == buttonModeArray[6] && buttonModeArray[9] == buttonModeArray[3]){
                     mode = true
                 }
                 if(buttonModeArray[9] == buttonModeArray[8] && buttonModeArray[9] == buttonModeArray[7]){
                     mode = true
                 }}
             else -> mode = false

        }
        if(mode == true){
            buttonModeArray = arrayListOf(0,0,0,0,0,0,0,0,0,0)
        }
        return mode
    }

    fun drawNewButton(bottunNum :Int, mode : Mode){
            if (mode == com.example.tictactoe.Mode.circle) {
                buttonModeArray[bottunNum] = 0
                binding.button9.text = "O"
            } else if (mode == com.example.tictactoe.Mode.cross) {
                buttonModeArray[bottunNum] = 1
                binding.button9.text = "X"
            }
        }

    fun printRound(mode : Mode) : Mode{
        if (mode == com.example.tictactoe.Mode.circle) {
            binding.textView2.text = "Round O"
            return com.example.tictactoe.Mode.cross
        } else if (mode == com.example.tictactoe.Mode.cross) {
            binding.textView2.text = "Round X"
            return com.example.tictactoe.Mode.circle
        }
        return com.example.tictactoe.Mode.cross
    }

    fun printIfPlayerWin(buttonNum: Int, mode: Mode){
            if (mode == com.example.tictactoe.Mode.cross) {
                binding.textView2.text = "O wiiiiin"
            } else if (mode == com.example.tictactoe.Mode.circle) {
                binding.textView2.text = "X wiiiiin"
            }
    }

    fun buttonSelected(num : Int){
        if (buttonModeArray[num] == 3) {
            drawNewButton(num, mode)
            if(!isWin(num)){
                mode = printRound(mode)
            }else{
                printIfPlayerWin(num, mode)
            }
        }
    }
}

enum class Mode{
    cross,
    circle
}