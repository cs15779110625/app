package swu.cs.myapplication

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginButton.setOnClickListener{
            ObjectAnimator.ofFloat(imageView3,"rotation",0f,360f).also{
                it.duration = 100
                it.repeatCount = 30
                it.start()
                it.addListener(object : Animator.AnimatorListener{
                    override fun onAnimationRepeat(p0: Animator?) {
                    }

                    override fun onAnimationEnd(p0: Animator?) {
                        startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                    }

                    override fun onAnimationCancel(p0: Animator?) {
                    }

                    override fun onAnimationStart(p0: Animator?) {
                    }

                })
            }
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}