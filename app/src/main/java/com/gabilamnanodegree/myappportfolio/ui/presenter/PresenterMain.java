package com.gabilamnanodegree.myappportfolio.ui.presenter;

import com.gabilamnanodegree.myappportfolio.ui.view.ViewMain;

/**
 * Created by gabrielmarcos on 6/1/15.
 *
 * This Presenter interface is used for interacting between
 * the Main Presenter and the Main View
 *
 */
public interface PresenterMain extends Presenter<ViewMain>{

    /**
     * Open the Spotify Streamer app
     */
    void openSpotifyStreamerApp();

    /**
     * Open the Score App
     */
    void openScoresApp();

    /**
     * Open the Library App
     */
    void openLibraryApp();

    /**
     * Open the Build It Bigger App
     */
    void openBuildItBiggerApp();

    /**
     * Opens the XYX Reader App
     */
    void openXyzReaderApp();

    /**
     * Open the Capstone App
     */
    void openCapstoneApp();

}

