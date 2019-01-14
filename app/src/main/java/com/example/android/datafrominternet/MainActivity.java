/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.datafrominternet;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import com.example.android.datafrominternet.utilities.NetworkUtils;

import java.io.IOException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

   // EditText mSearchBoxEditText;
   // TextView mUrlDisplayTextView;
    //TextView mSearchResultsTextView;

    // TODO (26) Create an EditText variable called mSearchBoxEditText
    // TODO (27) Create a TextView variable called mUrlDisplayTextView
    // TODO (28) Create a TextView variable called mSearchResultsTextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //   mSearchBoxEditText = (EditText)findViewById(R.id.et_search_box);
        //   mUrlDisplayTextView =(TextView)findViewById(R.id.tv_url_display);
         //  mSearchResultsTextView =(TextView)findViewById(R.id.tv_github_search_results_json);

          // URL url= (URL) NetworkUtils.buildUrl(mSearchBoxEditText.toString());
         //  String responce=(String) NetworkUtils.getResponseFromHttpUrl(url);
        // TODO (29) Use findViewById to get a reference to mSearchBoxEditText
        // TODO (30) Use findViewById to get a reference to mUrlDisplayTextView
        // TODO (31) Use findViewById to get a reference to mSearchResultsTextView


    }

    //https://api.github.com/search/repositories?q=android&sort=stars

    /*
    void makeGithubSearchQuery(){
        String githubQuery= mSearchBoxEditText.getText().toString();
        URL githubSearchUrl=  NetworkUtils.buildUrl(githubQuery);
        mUrlDisplayTextView.setText(githubSearchUrl.toString());

        new GithubQueryTask().execute(githubSearchUrl);

           //githubSearchResults= NetworkUtils.getResponseFromHttpUrl(githubSearchUrl);
           //mSearchResultsTextView.setText(githubSearchResults);
    }
*/
   //-------------------------------------------------------------------------------
/*
    public class GithubQueryTask extends AsyncTask<URL, Void, String> {

        // COMPLETED (2) Override the doInBackground method to perform the query. Return the results. (Hint: You've already written the code to perform the query)
        @Override
        protected String doInBackground(URL... urls) {
            URL searchUrl = urls[0];
            String githubSearchResults = null;
            try {
                githubSearchResults = NetworkUtils.getResponseFromHttpUrl(searchUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return githubSearchResults;
        }
*/
        // COMPLETED (3) Override onPostExecute to display the results in the TextView
   /*
        @Override
        protected void onPostExecute(String githubSearchResults) {
            if (githubSearchResults != null && !githubSearchResults.equals("")) {
                mSearchResultsTextView.setText(githubSearchResults);
            }
        }
    }

*/

    //----------------------------------------------------------------------------------------


    //Within onCreateOptionsMenu, use getMenuInflater().inflate to inflate the menu
    //Return true to display your menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
       // MenuInflater inflater = getMenuInflater();
      //  inflater.inflate(R.menu.main, menu);
       // return true;
       getMenuInflater().inflate(R.menu.main,menu);
       return true;
    }

    //  Override onOptionsItemSelected
    //  Within onOptionsItemSelected, get the ID of the item that was selected
    // If the item's ID is R.id.action_search, show a Toast and return true to tell Android that you've handled this menu click
    // Don't forgot to call .show() on your Toast
    // If you do NOT handle the menu click, return super.onOptionsItemSelected to let Android handle the menu click
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemThatWasSelected=item.getItemId();

        if(menuItemThatWasSelected == R.id.action_meet){
            Intent intent= new Intent(this,MeetActivity.class);
            this.startActivity(intent);
            return true;

        }

        if(menuItemThatWasSelected == R.id.action_search){

           // makeGithubSearchQuery();

           // Context context=MainActivity.this;
           // String message="Search Clicked";
          //  Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
            return true;
        }

        if(menuItemThatWasSelected == R.id.action_contact){
            //Activty navigation when clicked happened
            Intent i = new Intent(this,ContactActivity.class);
            this.startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
