package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var countinue = true
        var mode = mode.circle
        binding.button1.setOnClickListener{
            if(buttonModeArray[1] == 3) {
                if (mode == com.example.tictactoe.mode.circle) {
                    buttonModeArray[1] = 0
                    binding.button1.text = "O"
                    mode = com.example.tictactoe.mode.cross
                } else if (mode == com.example.tictactoe.mode.cross) {
                    buttonModeArray[1] = 1
                    binding.button1.text = "X"
                    mode = com.example.tictactoe.mode.circle
                }
                countinue = !isWin(1)

                if (countinue) {
                    if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "Round O"
                    } else if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "Round X"
                    }
                } else {
                    if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "O wiiiiin"
                    } else if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "X wiiiiin"
                    }

                }

            }

        }

        binding.button2.setOnClickListener {
            if (buttonModeArray[2] == 3) {
                if (mode == com.example.tictactoe.mode.circle) {
                    buttonModeArray[2] = 0
                    binding.button2.text = "O"
                    mode = com.example.tictactoe.mode.cross
                } else if (mode == com.example.tictactoe.mode.cross) {
                    buttonModeArray[2] = 1
                    binding.button2.text = "X"
                    mode = com.example.tictactoe.mode.circle
                }
                countinue = !isWin(2)

                if (countinue) {
                    if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "Round O"
                    } else if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "Round X"
                    }
                } else {
                    if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "O wiiiiin"
                    } else if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "X wiiiiin"
                    }
                }
            }
        }

        binding.button3.setOnClickListener {
            if (buttonModeArray[3] == 3) {
                if (mode == com.example.tictactoe.mode.circle) {
                    buttonModeArray[3] = 0
                    binding.button3.text = "O"
                    mode = com.example.tictactoe.mode.cross
                } else if (mode == com.example.tictactoe.mode.cross) {
                    buttonModeArray[3] = 1
                    binding.button3.text = "X"
                    mode = com.example.tictactoe.mode.circle
                }
                countinue = !isWin(3)

                if (countinue) {
                    if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "Round O"
                    } else if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "Round X"
                    }
                } else {
                    if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "O wiiiiin"
                    } else if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "X wiiiiin"
                    }
                }
            }
        }

        binding.button4.setOnClickListener {
            if (buttonModeArray[4] == 3) {
                if (mode == com.example.tictactoe.mode.circle) {
                    buttonModeArray[4] = 0
                    binding.button4.text = "O"
                    mode = com.example.tictactoe.mode.cross
                } else if (mode == com.example.tictactoe.mode.cross) {
                    buttonModeArray[4] = 1
                    binding.button4.text = "X"
                    mode = com.example.tictactoe.mode.circle

                }
                countinue = !isWin(4)

                if (countinue) {
                    if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "Round O"
                    } else if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "Round X"
                    }
                } else {
                    if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "O wiiiiin"
                    } else if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "X wiiiiin"
                    }
                }
            }
        }

        binding.button5.setOnClickListener {
            if (buttonModeArray[5] == 3) {

                if (mode == com.example.tictactoe.mode.circle) {
                    buttonModeArray[5] = 0
                    binding.button5.text = "O"
                    mode = com.example.tictactoe.mode.cross

                } else if (mode == com.example.tictactoe.mode.cross) {
                    buttonModeArray[5] = 1
                    binding.button5.text = "X"
                    mode = com.example.tictactoe.mode.circle

                }
                countinue = !isWin(5)

                if (countinue) {
                    if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "Round O"
                    } else if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "Round X"
                    }
                } else {
                    if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "O wiiiiin"
                    } else if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "X wiiiiin"
                    }
                }
            }
        }

        binding.button6.setOnClickListener {
            if (buttonModeArray[6] == 3) {
                if (mode == com.example.tictactoe.mode.circle) {
                    buttonModeArray[6] = 0
                    binding.button6.text = "O"
                    mode = com.example.tictactoe.mode.cross

                } else if (mode == com.example.tictactoe.mode.cross) {
                    buttonModeArray[6] = 1
                    binding.button6.text = "X"
                    mode = com.example.tictactoe.mode.circle

                }
                countinue = !isWin(6)

                if (countinue) {
                    if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "Round O"
                    } else if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "Round X"
                    }
                } else {
                    if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "O wiiiiin"
                    } else if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "X wiiiiin"
                    }
                }
            }
        }

        binding.button7.setOnClickListener {
            if (buttonModeArray[7] == 3) {
                if (mode == com.example.tictactoe.mode.circle) {
                    buttonModeArray[7] = 0
                    binding.button7.text = "O"
                    mode = com.example.tictactoe.mode.cross

                } else if (mode == com.example.tictactoe.mode.cross) {
                    buttonModeArray[7] = 1
                    binding.button7.text = "X"
                    mode = com.example.tictactoe.mode.circle

                }
                countinue = !isWin(7)

                if (countinue) {
                    if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "Round O"
                    } else if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "Round X"
                    }
                } else {
                    if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "O wiiiiin"
                    } else if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "X wiiiiin"
                    }
                }
            }
        }

        binding.button8.setOnClickListener {
            if (buttonModeArray[8] == 3) {
                if (mode == com.example.tictactoe.mode.circle) {
                    buttonModeArray[8] = 0
                    binding.button8.text = "O"
                    mode = com.example.tictactoe.mode.cross

                } else if (mode == com.example.tictactoe.mode.cross) {
                    buttonModeArray[8] = 1
                    binding.button8.text = "X"
                    mode = com.example.tictactoe.mode.circle

                }
                countinue = !isWin(8)

                if (countinue) {
                    if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "Round O"
                    } else if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "Round X"
                    }
                } else {
                    if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "O wiiiiin"
                    } else if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "X wiiiiin"
                    }
                }
            }
        }

        binding.button9.setOnClickListener {
            if (buttonModeArray[9] == 3) {
                if (mode == com.example.tictactoe.mode.circle) {
                    buttonModeArray[9] = 0
                    binding.button9.text = "O"
                    mode = com.example.tictactoe.mode.cross

                } else if (mode == com.example.tictactoe.mode.cross) {
                    buttonModeArray[9] = 1
                    binding.button9.text = "X"
                    mode = com.example.tictactoe.mode.circle

                }
                countinue = !isWin(9)

                if (countinue) {
                    if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "Round O"
                    } else if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "Round X"
                    }
                } else {
                    if (mode == com.example.tictactoe.mode.cross) {
                        binding.textView2.text = "O wiiiiin"
                    } else if (mode == com.example.tictactoe.mode.circle) {
                        binding.textView2.text = "X wiiiiin"
                    }
                }
            }
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
            mode = com.example.tictactoe.mode.circle
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





}

enum class mode{
    cross,
    circle
}