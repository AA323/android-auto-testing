package com.aa323.automessage;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.libraries.car.app.CarAppService;
import com.google.android.libraries.car.app.Screen;

public class AutoAppService extends CarAppService {
    @Override
    @NonNull
    public Screen onCreateScreen(@Nullable Intent intent) {
        return new AutoAppScreen(getCarContext());
    }
}
