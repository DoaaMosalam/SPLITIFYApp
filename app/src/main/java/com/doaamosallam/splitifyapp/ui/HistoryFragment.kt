package com.doaamosallam.splitifyapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.doaamosallam.splitifyapp.R
import com.doaamosallam.splitifyapp.adapter.ItemsAdapter
import com.doaamosallam.splitifyapp.databinding.FragmentHistoryBinding
import com.doaamosallam.splitifyapp.model.Items


class HistoryFragment : Fragment() {
    private lateinit var bindingHistory: FragmentHistoryBinding
    private lateinit var itemsAdapter: ItemsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       bindingHistory = DataBindingUtil.inflate(inflater, R.layout.fragment_history, container, false)
        return bindingHistory.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }
    // init recycler view
    private fun initRecyclerView() {
        itemsAdapter = ItemsAdapter(createData())
        bindingHistory.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = itemsAdapter
        }
    }

    private fun createData(): List<Items> {
        return listOf(
            Items("29-4-2023", "item:Onions", "Price: 45", "Paid by:Mike"),
            Items("29-4-2023", "item:Eggs", "Price:42", "Paid by:John"),
            Items("28-4-2023", "item:Sugar", "Price:30", "Paid by:Mike"),
            Items("28-4-2023", "item:Oil bread"," Price:200", "Paid by:Alice"),
            Items("27-4-2023", "item:Milk", "Price:20", "Paid by:John")
        )
    }
}