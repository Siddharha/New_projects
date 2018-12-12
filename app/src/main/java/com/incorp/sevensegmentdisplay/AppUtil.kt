package com.incorp.sevensegmentdisplay

import android.util.Log
import android.view.View
import android.widget.LinearLayout

class AppUtil {
    companion object {
       fun showDisplayWithNumber(i:Int,v:LinearLayout) {
           when (i){
               1 -> print_1(v)
               2 -> print_2(v)
               3 -> print_3(v)
               4 -> print_4(v)
               5 -> print_5(v)
               6 -> print_6(v)
               7 -> print_7(v)
               8 -> print_8(v)
               9 -> print_9(v)
               0 -> print_0(v)
               else -> { // Note the block
                   print("Beyond range!")
               }

           }
       }
        fun getDisplayNumber(v:LinearLayout):Int{

            val numberPattern  =  Array(3) {BooleanArray(3)}
            makenumberPaternArrayToDefault(numberPattern)

            if((v.getChildAt(0) as LinearLayout).getChildAt(0).visibility == View.VISIBLE){
                numberPattern[0][0] = true

            }
            if((v.getChildAt(1) as LinearLayout).getChildAt(0).visibility == View.VISIBLE){
                numberPattern[1][0] = true
            }

            if((v.getChildAt(2) as LinearLayout).getChildAt(0).visibility == View.VISIBLE){
                numberPattern[2][0] = true
            }

            if((v.getChildAt(0) as LinearLayout).getChildAt(1).visibility == View.VISIBLE){
                numberPattern[0][1] = true
            }
            if((v.getChildAt(1) as LinearLayout).getChildAt(2).visibility == View.VISIBLE){
                numberPattern[1][1] = true
            }

            if((v.getChildAt(2) as LinearLayout).getChildAt(1).visibility == View.VISIBLE){
                numberPattern[2][1] = true
            }

            if((v.getChildAt(1) as LinearLayout).getChildAt(4).visibility == View.VISIBLE){
                numberPattern[1][2] = true
            }


            for(i in 0 until 3){
                for(j in 0 until 3){
                    
                }
            }

            return 0
        }

        private fun makenumberPaternArrayToDefault(numberPattern: Array<BooleanArray>) {
            for (i in 0 until 3) {
                for (j in 0 until 3) {
                    numberPattern[i][j] = false
                }
            }
        }

        private fun print_0(llView: LinearLayout) {
            resetDisplay(llView)
            (llView.getChildAt(1) as LinearLayout).getChildAt(2).visibility = View.INVISIBLE
        }
        private fun print_1(llView: LinearLayout) {
            resetDisplay(llView)
            (llView.getChildAt(0) as LinearLayout).getChildAt(0).visibility = View.INVISIBLE
            (llView.getChildAt(0) as LinearLayout).getChildAt(1).visibility = View.INVISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(0).visibility = View.INVISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(2).visibility = View.INVISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(4).visibility = View.INVISIBLE
        }
        private fun print_2(llView: LinearLayout) {
            resetDisplay(llView)
            (llView.getChildAt(0) as LinearLayout).getChildAt(0).visibility = View.INVISIBLE
            (llView.getChildAt(2) as LinearLayout).getChildAt(1).visibility = View.INVISIBLE
        }
        private fun print_3(llView: LinearLayout) {
            resetDisplay(llView)
            (llView.getChildAt(0) as LinearLayout).getChildAt(0).visibility = View.INVISIBLE
            (llView.getChildAt(0) as LinearLayout).getChildAt(1).visibility = View.INVISIBLE
        }
        private fun print_4(llView: LinearLayout) {
            resetDisplay(llView)
            (llView.getChildAt(0) as LinearLayout).getChildAt(1).visibility = View.INVISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(0).visibility = View.INVISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(4).visibility = View.INVISIBLE
        }
        private fun print_5(llView: LinearLayout) {
            resetDisplay(llView)
            (llView.getChildAt(2) as LinearLayout).getChildAt(0).visibility = View.INVISIBLE
            (llView.getChildAt(0) as LinearLayout).getChildAt(1).visibility = View.INVISIBLE
        }
        private fun print_6(llView: LinearLayout) {
            resetDisplay(llView)
            (llView.getChildAt(2) as LinearLayout).getChildAt(0).visibility = View.INVISIBLE
        }
        private fun print_7(llView: LinearLayout) {
            resetDisplay(llView)
            (llView.getChildAt(0) as LinearLayout).getChildAt(0).visibility = View.INVISIBLE
            (llView.getChildAt(0) as LinearLayout).getChildAt(1).visibility = View.INVISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(2).visibility = View.INVISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(4).visibility = View.INVISIBLE
        }
        private fun print_8(llView: LinearLayout) {
            resetDisplay(llView)
        }
        private fun print_9(llView: LinearLayout) {
            resetDisplay(llView)
            (llView.getChildAt(0) as LinearLayout).getChildAt(1).visibility = View.INVISIBLE
        }

        private fun resetDisplay(llView: LinearLayout) {
            (llView.getChildAt(0) as LinearLayout).getChildAt(0).visibility = View.VISIBLE
            (llView.getChildAt(0) as LinearLayout).getChildAt(1).visibility = View.VISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(0).visibility = View.VISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(2).visibility = View.VISIBLE
            (llView.getChildAt(1) as LinearLayout).getChildAt(4).visibility = View.VISIBLE
            (llView.getChildAt(2) as LinearLayout).getChildAt(0).visibility = View.VISIBLE
            (llView.getChildAt(2) as LinearLayout).getChildAt(1).visibility = View.VISIBLE
        }
    }
}