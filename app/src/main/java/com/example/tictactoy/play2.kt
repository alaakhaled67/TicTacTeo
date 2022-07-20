package com.example.tictactoy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.*

class play2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play2)
    }
    fun btSelect(view: View) {
        val btselected = view as Button
        var cellID = 0

        when (btselected.id) {
            R.id.bt1 -> cellID = 1
            R.id.bt2 -> cellID = 2
            R.id.bt3 -> cellID = 3
            R.id.bt4 -> cellID = 4
            R.id.bt5 -> cellID = 5
            R.id.bt6 -> cellID = 6
            R.id.bt7 -> cellID = 7
            R.id.bt8 -> cellID = 8
            R.id.bt9 -> cellID = 9
        }
        Log.d("cellID", cellID.toString())
        Playingby1(cellID, btselected)
    }
    var player1= ArrayList<Int>()
    var player2= ArrayList<Int>()
    var activeplayer=1
    fun Playingby1(cellID:Int,btselected: Button){
        if(activeplayer==1){
            btselected.text="X"
            btselected.setBackgroundColor(0xFFB32121.toInt())
            player1.add(cellID)
            activeplayer=2
        }else{
            btselected.text="O"
            btselected.setBackgroundColor(0xFF6200EE.toInt())
            player2.add(cellID)
            activeplayer=1
        }
        btselected.isEnabled=false
        winner()
    }
    fun winner()
    {
        var winner=-1
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            winner=1
        }
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            winner=2
        }
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winner=1
        }
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winner=2
        }
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winner=1
        }
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winner=2
        }
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winner=1
        }
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winner=2
        }
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winner=1
        }
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            winner=2
        }
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winner=1
        }
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            winner=2
        }
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            winner=1
        }
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            winner=2
        }
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7)){
            winner=1
        }
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            winner=2
        }
        if(winner!=-1){
            Toast.makeText(this, "the winner is player$winner", Toast.LENGTH_SHORT).show()
            finish()
        }
        else
        {
            if((player1.size+player2.size)==9) {
                Toast.makeText(this, "no one winns", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }

}