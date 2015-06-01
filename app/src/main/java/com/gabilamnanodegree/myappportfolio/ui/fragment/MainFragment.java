package com.gabilamnanodegree.myappportfolio.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.gabilamnanodegree.myappportfolio.ui.presenter.PresenterMain;
import com.gabilamnanodegree.myappportfolio.ui.presenter.PresenterMainImp;
import com.gabilamnanodegree.myappportfolio.R;
import com.gabilamnanodegree.myappportfolio.ui.view.ViewMain;

/**
 * Created by gabrielmarcos on 6/1/15.
 *
 * Main Fragment implements the Main View interface
 *
 */
public class MainFragment extends Fragment implements ViewMain, View.OnClickListener {

    /**
     * Reference to the Presenter which will handle the logic
     */
    private PresenterMain mPresenter;

    public static Fragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Gets the Buttons View References
        Button mStartAppOneButton = (Button)rootView.findViewById(R.id.app_1_button);
        Button mStartAppTwoButton = (Button)rootView.findViewById(R.id.app_2_button);
        Button mStartAppThreeButton = (Button)rootView.findViewById(R.id.app_3_button);
        Button mStartAppFourButton = (Button)rootView.findViewById(R.id.app_4_button);
        Button mStartAppFiveButton = (Button)rootView.findViewById(R.id.app_5_button);
        Button mStartAppSixButton = (Button)rootView.findViewById(R.id.app_6_button);

        // Initialize the Buttons click listeners
        mStartAppOneButton.setOnClickListener(this);
        mStartAppTwoButton.setOnClickListener(this);
        mStartAppThreeButton.setOnClickListener(this);
        mStartAppFourButton.setOnClickListener(this);
        mStartAppFiveButton.setOnClickListener(this);
        mStartAppSixButton.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize the Presenter with the view data
        mPresenter = new PresenterMainImp(getActivity());

        mPresenter.onViewCreate();
        mPresenter.setView(this);

    }

    @Override
    public void displayMessage(String message) {

        // The View displays the message sent by the presenter using a Toast
        Toast.makeText(getActivity(),message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {

        // Notifies the presenter about a button clicked event
        // depending on the button id

        switch (view.getId()) {

            case R.id.app_1_button:
                mPresenter.openSpotifyStreamerApp();
                break;

            case R.id.app_2_button:
                mPresenter.openScoresApp();
                break;

            case R.id.app_3_button:
                mPresenter.openLibraryApp();
                break;

            case R.id.app_4_button:
                mPresenter.openBuildItBiggerApp();
                break;

            case R.id.app_5_button:
                mPresenter.openXyzReaderApp();
                break;

            case R.id.app_6_button:
                mPresenter.openCapstoneApp();
                break;
        }
    }
}
