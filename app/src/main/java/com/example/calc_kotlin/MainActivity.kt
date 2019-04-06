package com.example.calc_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var onZeroAction: View.OnClickListener
    private lateinit var onOneAction: View.OnClickListener
    private lateinit var onTwoAction: View.OnClickListener
    private lateinit var onThreeAction: View.OnClickListener
    private lateinit var onFourAction: View.OnClickListener
    private lateinit var onFiveAction: View.OnClickListener
    private lateinit var onSixAction: View.OnClickListener
    private lateinit var onSevenAction: View.OnClickListener
    private lateinit var onEightAction: View.OnClickListener
    private lateinit var onNineAction: View.OnClickListener
    private lateinit var onDotAction: View.OnClickListener
    private lateinit var onPlusAction: View.OnClickListener
    private lateinit var onMinusAction: View.OnClickListener
    private lateinit var onMultiplyAction: View.OnClickListener
    private lateinit var onDivisionAction: View.OnClickListener
    private lateinit var onClearAction: View.OnClickListener
    private lateinit var onEqualAction: View.OnClickListener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
        bindListener()
    }

    private fun initListeners() {
        onZeroAction = View.OnClickListener { makeToast("onZeroAction " + it.id) }
        onOneAction = View.OnClickListener { makeToast("onOneAction " + it.id) }
        onTwoAction = View.OnClickListener { makeToast("onTwoAction " + it.id) }
        onThreeAction = View.OnClickListener { makeToast("onThreeAction " + it.id) }
        onFourAction = View.OnClickListener { makeToast("onFourAction " + it.id) }
        onFiveAction = View.OnClickListener { makeToast("onFiveAction " + it.id) }
        onSixAction = View.OnClickListener { makeToast("onSixAction " + it.id) }
        onSevenAction = View.OnClickListener { makeToast("onSevenAction " + it.id) }
        onEightAction = View.OnClickListener { makeToast("onEightAction " + it.id) }
        onNineAction = View.OnClickListener { makeToast("onNineAction " + it.id) }
        onDotAction = View.OnClickListener { makeToast("onDotAction " + it.id) }
        onPlusAction = View.OnClickListener { makeToast("onPlusAction " + it.id) }
        onMinusAction = View.OnClickListener { makeToast("onMinusAction " + it.id) }
        onMultiplyAction = View.OnClickListener { makeToast("onMultiplyAction " + it.id) }
        onDivisionAction = View.OnClickListener { makeToast("onDivisionAction " + it.id) }
        onClearAction = View.OnClickListener { makeToast("onClearAction " + it.id) }
        onEqualAction = View.OnClickListener { makeToast("onEqualAction " + it.id) }
    }

    private fun bindListener() {
        btnMainZero.setOnClickListener(onZeroAction)
        btnMainOne.setOnClickListener(onOneAction)
        btnMainTwo.setOnClickListener(onTwoAction)
        btnMainThree.setOnClickListener(onThreeAction)
        btnMainFour.setOnClickListener(onFourAction)
        btnMainFive.setOnClickListener(onFiveAction)
        btnMainSix.setOnClickListener(onSixAction)
        btnMainSeven.setOnClickListener(onSevenAction)
        btnMainEight.setOnClickListener(onEightAction)
        btnMainNine.setOnClickListener(onNineAction)
        btnMainDot.setOnClickListener(onDotAction)
        btnMainPlus.setOnClickListener(onPlusAction)
        btnMainMinus.setOnClickListener(onMinusAction)
        btnMainMultiply.setOnClickListener(onMultiplyAction)
        btnMainDivision.setOnClickListener(onDivisionAction)
        btnMainClear.setOnClickListener(onClearAction)
        btnMainEqual.setOnClickListener(onEqualAction)
    }

    private fun makeToast(msg: String) {
        Toast.makeText(this, "click " + msg, Toast.LENGTH_LONG).show()
    }
}
