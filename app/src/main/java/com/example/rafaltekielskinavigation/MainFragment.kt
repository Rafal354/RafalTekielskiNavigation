package com.example.rafaltekielskinavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rafaltekielskinavigation.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.navToSecActivityFromFragmentBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }
        binding.navToThirdActivityFromFragmentBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_thirdFragment)
        }
        binding.navToMainActivityBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondActivity)
        }

    }

}