package com.ctrack.demo.tracking.login.presentation.view

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.ctrack.demo.tracking.R
import com.ctrack.demo.tracking.login.presentation.viewmodel.LoginViewModel
import com.ctrack.demo.tracking.user.presentation.view.UserActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    private lateinit var username: String
    private lateinit var password: String
    private lateinit var loginLiveData: LiveData<Boolean>

    private val countryList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var loginViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        loginLiveData = loginViewModel.getLoginLiveData()

        loginViewModel.populateData()

        startAnimation()

        email_sign_in_button.setOnClickListener(View.OnClickListener {
            username = id_username.text.toString()
            password = id_password.text.toString()

            login_progress.visibility = View.VISIBLE
            loginViewModel.getAuthenticatedUser(username, password)
            observe()
        })
    }

    private fun observe() {
        loginLiveData.observe(this, Observer<Boolean> { isAuthenticated ->

            Handler().postDelayed(Runnable {
                if (isAuthenticated != null && isAuthenticated) {
                    val myIntent = Intent(baseContext, UserActivity::class.java)
                    startActivity(myIntent)
                } else {
                    val message = getString(R.string.error_invalid_login)
                    toast(message)

                }

                login_progress.visibility = View.GONE

            }, 500)

        })
    }

    private fun Context.toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun startAnimation() {
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        login_container.visibility = View.VISIBLE
        login_container.startAnimation(fadeInAnimation)

    }
}
