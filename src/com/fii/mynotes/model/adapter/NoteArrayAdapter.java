package com.fii.mynotes.model.adapter;

import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.fii.mynotes.model.MyNote;

public class NoteArrayAdapter extends ArrayAdapter<MyNote> {

    private List<MyNote> notes;
    private Context context;
    private int id;

    public NoteArrayAdapter(Context context, int textViewResourceId, List<MyNote> objects) {
	super(context, textViewResourceId, objects);
	notes = objects;
	this.context = context;
	id = textViewResourceId;
    }

    /**
     * @return the notes
     */
    public List<MyNote> getNotes() {
	return notes;
    }

    /**
     * @param notes
     *            the notes to set
     */
    public void setNotes(List<MyNote> notes) {
	this.notes = notes;
    }

    /**
     * @return the context
     */
    public Context getContext() {
	return context;
    }

    /**
     * @param context
     *            the context to set
     */
    public void setContext(Context context) {
	this.context = context;
    }

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
	this.id = id;
    }
  
    public MyNote getNote(int index) {
	return notes.get(index);
    }

}
