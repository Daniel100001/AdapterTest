package com.example.adaptertest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.adaptertest.databinding.FragmentCarDetailBinding


class CarDetailFragment : Fragment() {

    private lateinit var binding: FragmentCarDetailBinding
    private val args by navArgs<CarDetailFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentCarDetailBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        Glide.with(binding.image).load(args.model.image)
            .into(binding.image)
        binding.name.text = args.model.name
        binding.year.text = args.model.year.toString()
    }

}