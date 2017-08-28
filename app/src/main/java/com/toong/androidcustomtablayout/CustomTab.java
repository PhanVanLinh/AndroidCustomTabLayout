package com.toong.androidcustomtablayout;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;

/**
 * Created by PhanVanLinh on 28/08/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class CustomTab extends TabLayout{

    public CustomTab(Context context) {
        super(context);
    }

    public CustomTab(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        super.setupWithViewPager(viewPager);

        createTabIcons();
    }

    private void createTabIcons() {
        TextView tabOne = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tab, null);
        tabOne.setText("Tab 1");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_launcher, 0, 0);
        this.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Tab 2");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_launcher, 0, 0);
        this.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.custom_tab, null);
        tabThree.setText("Tab 3");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_launcher, 0, 0);
        this.getTabAt(2).setCustomView(tabThree);
    }
}
