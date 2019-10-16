package com.example.mydialyproject;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Dialy {
    @PrimaryKey
    public int id ;
    public String Title;
    public String Content;

   public Dialy(String Title, String Content){
      this.Title = Title;
       this.Content = Content;
   }

    public void setTitle(String title) {
        Title = title;
    }

    public void setContent(String content) {
        Content = content;
    }
}


