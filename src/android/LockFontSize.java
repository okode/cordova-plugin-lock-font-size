package org.apache.cordova.smartlock;

import java.util.Arrays;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

public class LockFontSize extends CordovaPlugin {

    private static final String[] actions = {"init"};
    private static final String TAG = "LockFontSize";
    private static final int NORMAL_TEXT_ZOOM = 100;

    public boolean execute(final String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("init")) {
            boolean isWebViewConfigAvailable = getBridge() != null && getBridge().getWebView() != null
                && getBridge().getWebView().getSettings() != null;
            if (isWebViewConfigAvailable) {
                getBridge().getWebView().getSettings().setTextZoom(NORMAL_TEXT_ZOOM);
            }
            callbackContext.success();
        }

        return Arrays.asList(actions).contains(action);
    }

}
