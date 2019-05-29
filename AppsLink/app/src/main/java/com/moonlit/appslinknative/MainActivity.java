package com.moonlit.appslinknative;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to handle app links.
        /*Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();*/
        handleIntent(getIntent());
        // ATTENTION: This was auto-generated to handle app links.

    }

    private void handleIntent(Intent intent) {
        String appLinkAction = intent.getAction();
        Uri appLinkData = intent.getData();
        /*if (Intent.ACTION_VIEW.equals(appLinkAction) && appLinkData != null) {
            String recipeId = appLinkData.getLastPathSegment();
            //Uri appData = Uri.parse("content://com.recipe_app/recipe/").buildUpon().appendPath(recipeId).build();
            //showRecipe(appData);
        }*/
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent(intent);
    }
}
