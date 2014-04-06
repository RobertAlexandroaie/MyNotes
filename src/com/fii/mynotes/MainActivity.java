package com.fii.mynotes;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.fii.mynotes.model.adapter.NoteArrayAdapter;

public class MainActivity extends Activity {

    boolean sortingAB = true;
    NoteArrayAdapter adapter=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	fillNotes();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }

    private void fillNotes() {
	File projectPath = new File(getResources().getString(R.string.project_path));
	for(File file:projectPath.listFiles()) {
	    
	}
    }
}
