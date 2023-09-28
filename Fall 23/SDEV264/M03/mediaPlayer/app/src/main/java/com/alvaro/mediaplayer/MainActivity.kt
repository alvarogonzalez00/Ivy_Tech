package com.alvaro.mediaplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.SeekBar
import com.alvaro.mediaplayer.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var mp: MediaPlayer? = null
    private var currentSong = mutableListOf(R.raw.solitude)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        controlSound(currentSong[0])
    }

    private fun controlSound(id: Int) {
        binding.fabPlay.setOnClickListener {

            if (mp == null) {
                mp = MediaPlayer.create(this, id)
                Log.d("MainActivity", "ID: ${mp!!.audioSessionId}")

                initalizeSeekBar()
            }

            mp?.start()
            Log.d("MainActivity", "Duration: ${mp!!.duration / 1000} seconds")
        }

        binding.fabPause.setOnClickListener {
            if (mp !== null) mp?.pause()
            Log.d("MainActivity", "Paused at: ${mp!!.currentPosition / 1000} seconds")
        }

        binding.fabStop.setOnClickListener {
            if (mp !== null) {
                mp?.stop()
                mp?.reset()
                mp?.release()
                mp = null

            }
        }

        binding.seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) mp?.seekTo(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })
    }

    private fun initalizeSeekBar() {
        binding.seekbar.max = mp!!.duration
        val handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                try {
                    binding.seekbar.progress = mp!!.currentPosition
                    handler.postDelayed(this, 1000)
                } catch (e: Exception) {
                    binding.seekbar.progress = 0
                }
            }

        }, 0)
    }
}
