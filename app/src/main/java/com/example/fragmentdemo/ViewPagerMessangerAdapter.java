package com.example.fragmentdemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessangerAdapter extends FragmentPagerAdapter{


    public ViewPagerMessangerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new chatfragment();
        }else if(position==1){
            return new statusFragment();
        }else{
            return new CallsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;//no. of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
     if (position==0){
         return "Chats";
     }else if(position==1){
         return "Status";
     }else {
         return "Calls";

     }
    }
}
