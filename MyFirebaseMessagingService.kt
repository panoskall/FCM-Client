package com.notify.v01

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

 class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String){

        Log.d("TAG",  "The token refreshed: $token")
        sendRegistrationToServer(token)
    }

}
private fun sendRegistrationToServer(token: String?) {
    // TODO: Implement this method to send token to your app server.
}
