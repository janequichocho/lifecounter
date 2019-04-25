package edu.us.ischool.janeq97.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var score1: Int = 20
    var score2: Int = 20
    var score3: Int = 20
    var score4: Int = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var score1View: TextView = findViewById(R.id.score1)
        var minus5on1: Button = findViewById(R.id.minus5on1)
        var minus1on1: Button = findViewById(R.id.minus1on1)
        var plus1on1: Button = findViewById(R.id.plus1on1)
        var plus5on1: Button = findViewById(R.id.plus5on1)

        var result: TextView = findViewById(R.id.result)

        minus5on1.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score1 = score1 - 5
                score1View.setText("$score1")
                if (score1 <= 0) {
                    result.setText("Player 1 LOSES!")
                }
            }
        })

        minus1on1.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score1 = score1 - 1
                score1View.setText("$score1")
                if (score1 <= 0) {
                    result.setText("Player 1 LOSES!")
                }
            }
        })

        plus1on1.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score1 = score1 + 1
                score1View.setText("$score1")
                if (score1 <= 0) {
                    result.setText("Player 1 LOSES!")
                }
            }
        })

        plus5on1.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score1 = score1 + 5
                score1View.setText("$score1")
                if (score1 <= 0) {
                    result.setText("Player 1 LOSES!")
                }
            }
        })

        var score2View: TextView = findViewById(R.id.score2)

        var minus5on2: Button = findViewById(R.id.minus5on2)
        var minus1on2: Button = findViewById(R.id.minus1on2)
        var plus1on2: Button = findViewById(R.id.plus1on2)
        var plus5on2: Button = findViewById(R.id.plus5on2)


        minus5on2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score2 = score2 - 5
                score2View.setText("$score2")
                if (score2 <= 0) {
                    result.setText("Player 2 LOSES!")
                }
            }
        })

        minus1on2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score2 = score2 - 1
                score2View.setText("$score2")
                if (score2 <= 0) {
                    result.setText("Player 2 LOSES!")
                }
            }
        })

        plus1on2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score2 = score2 + 1
                score2View.setText("$score2")
                if (score2 <= 0) {
                    result.setText("Player 2 LOSES!")
                }
            }
        })

        plus5on2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score2 = score2 + 5
                score2View.setText("$score2")
                if (score2 <= 0) {
                    result.setText("Player 2 LOSES!")
                }
            }
        })


        var score3View: TextView = findViewById(R.id.score3)
        var minus5on3: Button = findViewById(R.id.minus5on3)
        var minus1on3: Button = findViewById(R.id.minus1on3)
        var plus1on3: Button = findViewById(R.id.plus1on3)
        var plus5on3: Button = findViewById(R.id.plus5on3)

        minus5on3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score3 = score3 - 5
                score3View.setText("$score3")
                if (score3 <= 0) {
                    result.setText("Player 3 LOSES!")
                }
            }
        })

        minus1on3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score3 = score3 - 1
                score3View.setText("$score3")
                if (score3 <= 0) {
                    result.setText("Player 3 LOSES!")
                }
            }
        })

        plus1on3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score3 = score3 + 1
                score3View.setText("$score3")
                if (score3 <= 0) {
                    result.setText("Player 3 LOSES!")
                }
            }
        })

        plus5on3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score3 = score3 + 5
                score3View.setText("$score3")
                if (score3 <= 0) {
                    result.setText("Player 3 LOSES!")
                }
            }
        })


        var score4View: TextView = findViewById(R.id.score4)
        var minus5on4: Button = findViewById(R.id.minus5on4)
        var minus1on4: Button = findViewById(R.id.minus1on4)
        var plus1on4: Button = findViewById(R.id.plus1on4)
        var plus5on4: Button = findViewById(R.id.plus5on4)


        minus5on4.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score4 = score4 - 5
                score4View.setText("$score4")
                if (score4 <= 0) {
                    result.setText("Player 4 LOSES!")
                }
            }
        })

        minus1on4.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score4 = score4 - 1
                score4View.setText("$score4")
                if (score4 <= 0) {
                    result.setText("Player 4 LOSES!")
                }
            }
        })

        plus1on4.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score4 = score4 + 1
                score4View.setText("$score4")
                if (score4 <= 0) {
                    result.setText("Player 4 LOSES!")
                }
            }
        })

        plus5on4.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                score4 = score4 + 5
                score4View.setText("$score4")
                if (score4 <= 0) {
                    result.setText("Player 4 LOSES!")
                }
            }
        })
    }
}
