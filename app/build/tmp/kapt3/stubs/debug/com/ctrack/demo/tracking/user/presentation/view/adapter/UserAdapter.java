package com.ctrack.demo.tracking.user.presentation.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u001e\u0010\u0016\u001a\u00020\u000f2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/ctrack/demo/tracking/user/presentation/view/adapter/UserAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ctrack/demo/tracking/user/presentation/view/viewholder/UserViewHolder;", "dataView", "Lcom/ctrack/demo/tracking/user/presentation/view/UserDataView;", "(Lcom/ctrack/demo/tracking/user/presentation/view/UserDataView;)V", "getDataView", "()Lcom/ctrack/demo/tracking/user/presentation/view/UserDataView;", "listUser", "Ljava/util/ArrayList;", "Lcom/ctrack/demo/tracking/user/data/model/UserEntity;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListUser", "list", "app_debug"})
public final class UserAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.ctrack.demo.tracking.user.presentation.view.viewholder.UserViewHolder> {
    private java.util.ArrayList<com.ctrack.demo.tracking.user.data.model.UserEntity> listUser;
    @org.jetbrains.annotations.NotNull()
    private final com.ctrack.demo.tracking.user.presentation.view.UserDataView dataView = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ctrack.demo.tracking.user.presentation.view.viewholder.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.user.presentation.view.viewholder.UserViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setListUser(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ctrack.demo.tracking.user.data.model.UserEntity> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ctrack.demo.tracking.user.presentation.view.UserDataView getDataView() {
        return null;
    }
    
    public UserAdapter(@org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.user.presentation.view.UserDataView dataView) {
        super();
    }
}