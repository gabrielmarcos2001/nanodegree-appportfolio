package com.gabilamnanodegree.myappportfolio.ui.presenter;

import android.content.Context;

import com.gabilamnanodegree.myappportfolio.R;
import com.gabilamnanodegree.myappportfolio.ui.view.ViewMain;

/**
 * Created by gabrielmarcos on 6/1/15.
 */
public class PresenterMainImp extends PresenterBase implements PresenterMain {

    /**
     * Reference to the Main View interface
     */
    private ViewMain mView;

    /**
     * Default Constructor
     * @param mContext
     */
    public PresenterMainImp(Context mContext) {
        super(mContext);
    }

    @Override
    public void setView(ViewMain view) {
        this.mView = view;
    }

    @Override
    public void openSpotifyStreamerApp() {
        mView.displayMessage(mContext.getString(R.string.app_1_message));
    }

    @Override
    public void openScoresApp() {
        mView.displayMessage(mContext.getString(R.string.app_2_message));
    }

    @Override
    public void openLibraryApp() {
        mView.displayMessage(mContext.getString(R.string.app_3_message));
    }

    @Override
    public void openBuildItBiggerApp() {
        mView.displayMessage(mContext.getString(R.string.app_4_message));
    }

    @Override
    public void openXyzReaderApp() {
        mView.displayMessage(mContext.getString(R.string.app_5_message));
    }

    @Override
    public void openCapstoneApp() {
        mView.displayMessage(mContext.getString(R.string.app_6_message));
    }

    @Override
    public void initialize() {

    }

    @Override
    public void onViewCreate() {

    }

    @Override
    public void onViewResume() {

    }

    @Override
    public void onViewDestroy() {

    }
}
