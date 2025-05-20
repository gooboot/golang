<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fillViewport="true"
    android:background="@color/light_gray">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="24dp">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:background="@drawable/rounded_white_bg"
            android:elevation="4dp"
            android:padding="32dp">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="欢迎登录"
                android:textSize="24sp"
                android:textColor="@color/dark_text"
                android:layout_gravity="center_horizontal"
                android:layout_marginBottom="24dp"/>

            <com.google.android.material.textfield.TextInputLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginBottom="16dp"
                style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">

                <com.google.android.material.textfield.TextInputEditText
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:hint="用户名或邮箱"
                    android:inputType="textEmailAddress"/>
            </com.google.android.material.textfield.TextInputLayout>

            <com.google.android.material.textfield.TextInputLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginBottom="16dp"
                style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
                app:endIconMode="password_toggle">

                <com.google.android.material.textfield.TextInputEditText
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:hint="密码"
                    android:inputType="textPassword"/>
            </com.google.android.material.textfield.TextInputLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:layout_marginBottom="16dp">

                <com.google.android.material.textfield.TextInputLayout
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">

                    <com.google.android.material.textfield.TextInputEditText
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:hint="验证码"/>
                </com.google.android.material.textfield.TextInputLayout>

                <TextView
                    android:layout_width="100dp"
                    android:layout_height="48dp"
                    android:text="ABCD12"
                    android:gravity="center"
                    android:background="@drawable/border_gray"
                    android:layout_marginLeft="8dp"
                    android:textColor="@color/dark_text"/>
            </LinearLayout>

            <CheckBox
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="记住登录状态"
                android:layout_marginBottom="16dp"/>

            <com.google.android.material.button.MaterialButton
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="登录"
                android:textColor="@color/white"
                style="@style/Widget.MaterialComponents.Button"/>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:justifyContent="space-between"
                android:layout_marginTop="16dp">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="忘记密码?"
                    android:textColor="@color/primary_color"/>

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="需要帮助?"
                    android:textColor="@color/primary_color"/>
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:gravity="center_vertical"
                android:layout_marginVertical="24dp">

                <View
                    android:layout_width="0dp"
                    android:layout_height="1dp"
                    android:layout_weight="1"
                    android:background="@color/gray_divider"/>

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="或"
                    android:layout_marginHorizontal="16dp"
                    android:textColor="@color/secondary_text"/>

                <View
                    android:layout_width="0dp"
                    android:layout_height="1dp"
                    android:layout_weight="1"
                    android:background="@color/gray_divider"/>
            </LinearLayout>

            <com.google.android.material.button.MaterialButton
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="使用 Google 登录"
                android:textColor="@color/dark_text"
                android:icon="@drawable/ic_google"
                style="@style/Widget.MaterialComponents.Button.OutlinedButton"
                android:layout_marginBottom="8dp"/>

            <com.google.android.material.button.MaterialButton
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="使用 Facebook 登录"
                android:textColor="@color/dark_text"
                android:icon="@drawable/ic_facebook"
                style="@style/Widget.MaterialComponents.Button.OutlinedButton"/>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="新用户? 立即注册"
                android:layout_gravity="center_horizontal"
                android:layout_marginTop="24dp">

                <androidx.text.SpannableStringBuilder>
                    <androidx.text.SpannableString
                        android:text="新用户? "/>
                    <androidx.text.SpannableString
                        android:text="立即注册"
                        android:textColor="@color/primary_color"/>
                </androidx.text.SpannableStringBuilder>
            </TextView>
        </LinearLayout>
    </LinearLayout>
</ScrollView>