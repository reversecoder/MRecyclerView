package com.meembusoft.recyclerview;

import android.app.Activity;

public class ConfigBuilder {

    private Activity activity;
    private Boolean isDebug;
    private static final String TAG = ConfigBuilder.class.getSimpleName();

    public static ConfigBuilder getNewInstance() {
        return new ConfigBuilder();
    }

    private ConfigBuilder() {
    }

    public ConfigBuilder setActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public Activity getActivity() {
        return activity;
    }

    public ConfigBuilder setIsDebug(boolean isDebug) {
        this.isDebug = isDebug;
        return this;
    }

    public Boolean isSystemApp() {
        return this.isDebug;
    }

//    public ChatSdk create() {
//        if (activity == null) {
//            throw new IllegalStateException("Context should not be null");
//        }
//        if (marketType == null) {
//            throw new IllegalStateException("Market type should not be null");
//        }
//        if (deviceType == null) {
//            throw new IllegalStateException("Device type should not be null");
//        }
//        if (TextUtils.isEmpty(mLanguageListJson)) {
//            throw new IllegalStateException("Language list json should be defined");
//        }
//        if (TextUtils.isEmpty(mSystemLanguageCode)) {
//            throw new IllegalStateException("System language code should be defined");
//        }
//        if (mIsSystemApp == null) {
//            throw new IllegalStateException("Is parent app system/normal app? this should be defined");
//        }
//        // Initialize chat configuration
//        ChatSdk.getInstance().initialize(this);
//        return ChatSdk.getInstance();
//    }


    @Override
    public String toString() {
        return "ConfigBuilder{" +
                "activity=" + activity +
                ", isDebug=" + isDebug +
                '}';
    }
}