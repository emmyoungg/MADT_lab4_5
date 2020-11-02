package com.example.madt_lab4_5;

import android.content.Context;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class Note implements Serializable {

    private long createdAt;
    private String noteTitle;
    private String noteContent;


    public Note(long dateInMillis, String title, String content) {
        createdAt = dateInMillis;
        noteTitle = title;
        noteContent = content;
    }

    public void setDateTime(long dateTime) {
        createdAt = dateTime;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public void setContent(String content) {
        noteContent = content;
    }

    public long getDateTime() {
        return createdAt;
    }

    public String getDateTimeFormatted(Context context) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"
                , context.getResources().getConfiguration().locale);
        formatter.setTimeZone(TimeZone.getDefault());
        return formatter.format(new Date(createdAt));
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public String getContent() {
        return noteContent;
    }
}