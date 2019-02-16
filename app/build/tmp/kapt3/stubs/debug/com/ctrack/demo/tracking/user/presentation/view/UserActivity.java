package com.ctrack.demo.tracking.user.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/ctrack/demo/tracking/user/presentation/view/UserActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/ctrack/demo/tracking/user/presentation/view/UserDataView;", "()V", "adapter", "Lcom/ctrack/demo/tracking/user/presentation/view/adapter/UserAdapter;", "end", "", "listUser", "Ljava/util/ArrayList;", "Lcom/ctrack/demo/tracking/user/data/model/UserEntity;", "Lkotlin/collections/ArrayList;", "loadAllUsersLiveData", "Landroid/arch/lifecycle/LiveData;", "loadSomeUsersLiveData", "", "start", "totalRecords", "userViewModel", "Lcom/ctrack/demo/tracking/user/presentation/viewmodel/UserViewModel;", "observeLoadAllData", "", "observeSomeData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onUserClick", "id", "app_debug"})
public final class UserActivity extends android.support.v7.app.AppCompatActivity implements com.ctrack.demo.tracking.user.presentation.view.UserDataView {
    private com.ctrack.demo.tracking.user.presentation.view.adapter.UserAdapter adapter;
    private int totalRecords;
    private int start;
    private int end;
    private java.util.ArrayList<com.ctrack.demo.tracking.user.data.model.UserEntity> listUser;
    private com.ctrack.demo.tracking.user.presentation.viewmodel.UserViewModel userViewModel;
    private android.arch.lifecycle.LiveData<java.lang.Integer> loadAllUsersLiveData;
    private android.arch.lifecycle.LiveData<java.util.List<com.ctrack.demo.tracking.user.data.model.UserEntity>> loadSomeUsersLiveData;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeLoadAllData() {
    }
    
    private final void observeSomeData() {
    }
    
    @java.lang.Override()
    public void onUserClick(int id) {
    }
    
    public UserActivity() {
        super();
    }
}