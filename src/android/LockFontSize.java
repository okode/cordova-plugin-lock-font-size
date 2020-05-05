package org.apache.cordova.lockfontsize;

import android.webkit.WebView;

import java.util.Arrays;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;

public class LockFontSize extends CordovaPlugin {

    private static final String[] actions = {"init"};
    private static final String TAG = "LockFontSize";
    private static final int NORMAL_TEXT_ZOOM = 100;
    private WebView webView;

    @Override
    public void initialize(final CordovaInterface cordova, CordovaWebView webView) {
        this.webView = (WebView) webView;
        super.initialize(cordova, webView);
    }

    public boolean execute(final String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("init")) {
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    webView.getSettings().setTextZoom(NORMAL_TEXT_ZOOM);
                    callbackContext.success();
                }
            });
        }

        return Arrays.asList(actions).contains(action);
    }

}
