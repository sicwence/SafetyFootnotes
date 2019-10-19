package com.scratchit.safetyfootnotes.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is where the Job Safety Observation (JSO) Form will Live!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}