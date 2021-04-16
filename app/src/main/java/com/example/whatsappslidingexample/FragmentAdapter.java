package com.example.whatsappslidingexample;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.whatsappslidingexample.Fragments.Calls_Fragment;
import com.example.whatsappslidingexample.Fragments.Chats_Fragment;
import com.example.whatsappslidingexample.Fragments.Status_Fragment;

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new Chats_Fragment();
            case 1: return new Status_Fragment();
            case 2: return new Calls_Fragment();
            default: return new Chats_Fragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0){
            title="Chats";
        }
        else if(position==1){
            title="Status";
        }
        else if(position==2){
            title="Calls";
        }
        return title;
    }
}
