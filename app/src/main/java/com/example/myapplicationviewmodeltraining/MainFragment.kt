package com.example.myapplicationviewmodeltraining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplicationviewmodeltraining.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    // 7
    val viewModel = ViewModel()
    // 11
    var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //2 + 11
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding?.root
      //  return FragmentMainBinding.inflate(inflater).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // 9
        binding?.textView?.text = viewModel.score.toString()
        // 10
        binding?.button?.setOnClickListener {
            viewModel.addOne()
            binding?.textView?.text = viewModel.score.toString()

        }
    }


}
