package com.amity.socialcloud.uikit.common.base

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class AmityFragmentStateAdapter(fm: FragmentManager, lifeCycle: Lifecycle) :
    FragmentStateAdapter(fm, lifeCycle) {

    private val fragmentList: ArrayList<AmityPagerModel> = arrayListOf()

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment {
        Log.d("PAGE_CHANGED", "Page 2 changed -- $position")
        return fragmentList[position].fragment
    }

    fun setFragmentList(list: List<AmityPagerModel>) {
        fragmentList.clear()
        fragmentList.addAll(list)
        notifyDataSetChanged()
    }

    fun getTitle(position: Int): String = fragmentList[position].title

    data class AmityPagerModel(
        val title: String,
        val fragment: Fragment
    )
}