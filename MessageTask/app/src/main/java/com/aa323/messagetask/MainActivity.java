package com.aa323.messagetask;

import androidx.appcompat.app.AppCompatActivity;
import android.speech.tts.TextToSpeech;

import android.os.Bundle;
import android.util.Log;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

                String text =  getString(R.string.txt_quote);
                if (status == TextToSpeech.SUCCESS) {
                    int lang = textToSpeech.setLanguage(Locale.UK);
                    textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });
    }
}