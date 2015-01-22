RoundedUI
=======

Rounded, customizable UI elements for Android.

you can set the round size, border size, border color to any weidget.


 ![image](https://github.com/linfaxin/RoundUI/blob/master/demo/demo.png)


Usage
----
simple use in xml
 ```xml
        <com.linfaxin.roundedui.RoundedFrameLayout
            android:layout_marginTop="12dp"
            app:roundHeight="32dp"
            app:roundWidth="32dp"
            android:background="@color/gray_normal"
            android:orientation="vertical"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content">
            <Button
                android:text="Button"
                android:background="@drawable/gray_bg"
                android:layout_gravity="right"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />
            <TextView
                android:textColor="@android:color/white"
                android:text="TextView"
                android:gravity="center"
                android:padding="10dp"
                android:layout_width="120dp"
                android:layout_height="120dp"/>
        </com.linfaxin.roundedui.RoundedFrameLayout>
 ```


Inspired by [Rounded UI](https://github.com/Provectium/Rounded-UI) by Provectium.
