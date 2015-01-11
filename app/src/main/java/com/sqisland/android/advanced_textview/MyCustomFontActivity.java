package com.sqisland.android.advanced_textview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 *  直接设置TypeFace的方法自定义字体
 */
public class MyCustomFontActivity extends Activity {

  private Typeface typeface;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    typeface = Typeface.createFromAsset(getAssets(), "ruachlet.ttf");


    setContentView(R.layout.activity_custom_myfont);

      TextView mfont= (TextView)findViewById(R.id.text);

      mfont.setTypeface(typeface);
  }


  @Override
  public View onCreateView(String name, Context context, AttributeSet attrs) {
    //this would apply to all textviews in the app
    if (name.equals("TextView")) {
      TextView view = new TextView(this, attrs);
      view.setTypeface(typeface);
      return view;
    }

    return super.onCreateView(name, context, attrs);
  }

}
