package com.aa323.automessage;

import androidx.annotation.NonNull;
import com.google.android.libraries.car.app.CarContext;
import com.google.android.libraries.car.app.Screen;
import com.google.android.libraries.car.app.model.Action;
import com.google.android.libraries.car.app.model.Pane;
import com.google.android.libraries.car.app.model.PaneTemplate;
import com.google.android.libraries.car.app.model.Row;
import com.google.android.libraries.car.app.model.Template;

public class AutoAppScreen extends Screen {

    public AutoAppScreen(CarContext carContext) {
        super(carContext);
    }

    @NonNull
    @Override
    public Template getTemplate() {
        return PaneTemplate.builder(
                Pane.builder().addRow(Row.builder().setTitle("Example Message!").build()).build())
                .setHeaderAction(Action.APP_ICON)
                .build();
    }
}
