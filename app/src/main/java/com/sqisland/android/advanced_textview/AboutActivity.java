package com.sqisland.android.advanced_textview;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class AboutActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_about);

    TextView textView = (TextView) findViewById(R.id.text);
      textView.setMovementMethod(LinkMovementMethod.getInstance());
    String html = getString(R.string.about_text);
    textView.setText(Html.fromHtml(html));


  }
}