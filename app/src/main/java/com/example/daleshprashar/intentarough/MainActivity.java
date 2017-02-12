package com.example.daleshprashar.intentarough;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Intent i = null;
    Intent chooser = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void  selection(View view)
    {
        if (view.getId() ==R.id.button)
        {
            Intent i = new Intent(Intent.ACTION_SEND , Uri.parse("mailto:"));
            //i.setType("text/html");
            i.setType("message /rfc822");
            i.putExtra(Intent.EXTRA_EMAIL ,"PRASHDALE@GMAIL.COM");
            i.putExtra(Intent.EXTRA_EMAIL ,"dalesh.pra@GMAIL.COM");
            i.putExtra(Intent.EXTRA_SUBJECT ,"rough practise mail sent");
            i.putExtra(Intent.EXTRA_TEXT,"EMAIL BODY PART A 2Z");
            chooser = Intent.createChooser(i , "Send Email");
            startActivity(chooser);
            Toast.makeText(this,"its sent",Toast.LENGTH_LONG).show();
        }
        // launch map
        if (view.getId() == R.id.button3)
        {
            Intent i= new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:12,15"));
            Intent chooser =Intent.createChooser(i,"Launch Maps");
            startActivity(chooser);
            Toast.makeText(this,"its sent",Toast.LENGTH_LONG).show();
        }
        // launch market
        if (view.getId() == R.id.button2)
        {
            Intent i= new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("market://details?id=com.Hyatt.hyt&hl=en"));
            Intent chooser = Intent.createChooser(i,"Launch Market");
            startActivity(chooser);
            Toast.makeText(this,"its sent",Toast.LENGTH_LONG).show();

        }
        // send image.
        if (view.getId()== R.id.button6)
        {
           Uri ImageUri= Uri.parse("android.resource://com.example.daleshprashar.intentarough/drawable/"+R.drawable.a);
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("image/*");
            i.putExtra(Intent.EXTRA_STREAM ,ImageUri);
            i.putExtra(Intent.EXTRA_TEXT,"i sent the nice image");
            Intent chooser = Intent.createChooser(i,"Send Image");
            startActivity(chooser);
            Toast.makeText(this,"its sent",Toast.LENGTH_LONG).show();

        }


    }
}
