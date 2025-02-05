package com.free.quran.audio.book.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.free.quran.audio.book.R
import com.free.quran.audio.book.databinding.FragmentDuaBinding


class DuaFragment : Fragment() {

    private lateinit var binding: FragmentDuaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentDuaBinding.inflate(inflater, container, false)


        return binding.root
    }

}