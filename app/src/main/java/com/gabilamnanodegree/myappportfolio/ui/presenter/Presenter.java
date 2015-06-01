package com.gabilamnanodegree.myappportfolio.ui.presenter;

import com.gabilamnanodegree.myappportfolio.ui.view.ViewBase;

/**
 * Created by gabrielmarcos on 6/1/15.
 */
public interface Presenter<T extends ViewBase> {

    void initialize();

    void onViewCreate();

    void onViewResume();

    void onViewDestroy();

    void setView(T view);
}
