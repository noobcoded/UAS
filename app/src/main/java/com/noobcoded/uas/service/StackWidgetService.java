package com.noobcoded.uas.service;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class StackWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StackRemoteViewsFactory(this.getApplicationContext(), intent);
    }
}
