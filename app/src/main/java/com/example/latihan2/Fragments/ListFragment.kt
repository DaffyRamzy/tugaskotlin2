package com.example.latihan2.Fragments

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
import com.example.latihan2.ListObject
import com.example.latihan2.MainAdapter
import com.example.latihan2.R
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private lateinit var adapter: MainAdapter
    private val list = ArrayList<ListObject>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.add(ListObject("Title 1", "Subtitle 1"))
        list.add(ListObject("Title 2", "Subtitle 2"))
        list.add(ListObject("Title 3", "Subtitle 3"))
        list.add(ListObject("Title 4", "Subtitle 4"))
        list.add(ListObject("Title 5", "Subtitle 5"))
        list.add(ListObject("Title 6", "Subtitle 6"))
        list.add(ListObject("Title 7", "Subtitle 6"))
        list.add(ListObject("Title 8", "Subtitle 6"))
        list.add(ListObject("Title 9", "Subtitle 6"))
        list.add(ListObject("Title 10", "Subtitle 10"))
        list.add(ListObject("Title 11", "Subtitle 11"))
        list.add(ListObject("Title 12", "Subtitle 12"))
        list.add(ListObject("Title 13", "Subtitle 13"))
        list.add(ListObject("Title 14", "Subtitle 14"))
        recycler_view.setHasFixedSize(true)
        recycler_view.layoutManager = LinearLayoutManager(activity)
        val adapter = MainAdapter(list)
        recycler_view.adapter = adapter
//        recycler_view.apply {
//            adapter = this@ListFragment.adapter
//            layoutManager = LinearLayoutManager(this@ListFragment.requireActivity())
//            addItemDecoration(DividerItemDecoration(this@ListFragment.requireActivity(), DividerItemDecoration.VERTICAL))
//        }
    }
}