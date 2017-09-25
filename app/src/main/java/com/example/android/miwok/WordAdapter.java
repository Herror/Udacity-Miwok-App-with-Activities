package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by enach on 8/7/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    /**
     *  @param context The current context. Used to inflate the layout file.
     * @param word A List of Word objects to display in a list
     */

    public WordAdapter(Activity context, ArrayList<Word> word, int colorResourceId){

        /**
         * Here I initialize the ArrayAdapter's internal storage for the context and the list.
         * The second argument is used when the ArrayAdapter is populating a single TextView.
         * Because this is a custom adapter for two TextViews, the adapter is not going
         * to use the second argument, so it can be any value. Here I used 0.
         */

        super(context, 0, word);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The AdapterView position that is requesting a view
     * @param convertView The recycled view to populate
     * @param parent The parent ViewGroup that is used for inflation
     * @return The View for the position in the AdapterView
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        Word currentWordAdapter = getItem(position);

        // Find the TextView in the list_items.xml layout with the ID version_name
        TextView miwokNameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        //Get the Version Name from the current Word object and set the text on the miwok TextView
        miwokNameTextView.setText(currentWordAdapter.getMiwokTranslation());

        // Find the TextView in the list_items.xml layout with the ID version_name
        TextView defaultNameTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        //Get the Version Name from the current Word object and set the text on the default TextView
        defaultNameTextView.setText(currentWordAdapter.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWordAdapter.hasImage()){
            //Set the ImageView to the image resource specified in the current Word
            imageView.setImageResource(currentWordAdapter.getImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        }else{
            //Else hide the ImageView
            imageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set background color of the text container View
        textContainer.setBackgroundColor(color);

        //Return the whole list item layout (containing 2 TextViews) so that it can be
        //shown in the ListView
        return listItemView;
    }
}
