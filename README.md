# CountDownChronometer
It's a `Count Down Chronometer` widget of android base on Chronometer.  （Android倒计时控件）

How To
--------------

1. Copy com.vcokey.widget.CountDownChronometer to your own project;
2. Add the widget in your `xml`:
 ```xml
    <com.vcokey.widget.CountDownChronometer
        android:padding="16dp"
        android:layout_below="@id/chronometer"
        android:id="@+id/countdownchronometer"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
 ``` 
3. In your `Activity`, you can set the format of display String, use `CountDownChronometer.setFormat(" %s ", CountDownChronometer.FLAG_TIME_FORMAT_CUSTOM)` to set format like `Chronometer`;
 
4. Use `CountDownChronometer.setTime(int)` to init the view with the int value which means the seconds you want to count down; 
5. You can add a listener to observer the count down event, just use `setOnChronometerTickListener`

LISENCE
--------------

   Copyright 2015 vcokey

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
