package com.example.mydialyproject;


import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface DialyDao {

    @Insert
    void insert(Dialy Dialy);

}
