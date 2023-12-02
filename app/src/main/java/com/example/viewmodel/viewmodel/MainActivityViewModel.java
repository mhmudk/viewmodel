package com.example.viewmodel.viewmodel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int number = 0;

    public void addOne() {
        number++;
    }
    public int getNumber(){
        return number;
    }
}
