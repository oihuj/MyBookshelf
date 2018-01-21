//Copyright (c) 2017. 章钦豪. All rights reserved.
package com.monke.monkeybook.presenter.impl;

import com.monke.basemvplib.impl.IPresenter;

public interface IMainPresenter extends IPresenter{
    void queryBookShelf(Boolean needRefresh);

    void backupBookShelf();

    void restoreBookShelf();

    void addBookUrl(String bookUrl);
}
