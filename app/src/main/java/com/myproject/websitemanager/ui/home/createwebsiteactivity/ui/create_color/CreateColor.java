package com.myproject.websitemanager.ui.home.createwebsiteactivity.ui.create_color;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.myproject.websitemanager.R;
import com.myproject.websitemanager.webpage.WebPage;
public class CreateColor extends Fragment{
   private Button fontStyle;
   private int color;
    Activity createcolor;
    View view;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.create_colors, container, false);
        createcolor = getActivity();
        Button background = view.findViewById(R.id.background_color_id);
        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),WebPage.class);
                startActivity(i);
                Toast.makeText(createcolor,"Select Heading to change color",Toast.LENGTH_LONG).show();
            }
        });
        fontStyle = view.findViewById(R.id.set_fontStyle_color_id);
        fontStyle.setOnClickListener(view -> {
            Intent i = new Intent(getActivity(),WebPage.class);
            startActivity(i);
            Toast.makeText(createcolor,"Select font color to change color",Toast.LENGTH_LONG).show();
        });
        Button sectioncolorbtn = view.findViewById(R.id.section_color_id);
        sectioncolorbtn.setOnClickListener(view -> {
            Intent i = new Intent(getActivity(),WebPage.class);
            startActivity(i);
            Toast.makeText(createcolor,"Select section to change color",Toast.LENGTH_LONG).show();
                }
        );


        return view;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }


}