package com.scratchit.safetyfootnotes.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToolsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ToolsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is where the Hazard ID Form will Live!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}