package com.tetris.tetris;

/**
 * Created by Petri on 14.7.2016.
 */
public class Profile {
    private static Profile instance = null;
    private static String mName;
    private static String mId;
    private static int mLastDifficult;
    public static final int DEFAULT_DIFFICULT = 4;//Default difficult of the game
    private void Profile() {
        this.mName = "Petri";
        this.mId = "1";
        mLastDifficult = DEFAULT_DIFFICULT;
    }
    public Profile getInstance() {
        if(instance == null) {
            instance = new Profile();
        };
        return instance;
    }
}
