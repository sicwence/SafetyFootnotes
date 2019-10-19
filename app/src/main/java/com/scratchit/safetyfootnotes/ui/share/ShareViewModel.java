package com.scratchit.safetyfootnotes.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Share your safety learning experiences here!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}