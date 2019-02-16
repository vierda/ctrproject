package com.ctrack.demo.tracking.user.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/ctrack/demo/tracking/user/data/UserUseCase;", "Lcom/ctrack/demo/tracking/common/util/UseCase;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "repository", "Lcom/ctrack/demo/tracking/user/data/UserRepository;", "loadAllUsers", "", "subscriber", "Lcom/ctrack/demo/tracking/common/util/DefaultSubscriber;", "", "loadSomeUsersFromDb", "start", "end", "", "Lcom/ctrack/demo/tracking/user/data/model/UserEntity;", "app_debug"})
public final class UserUseCase extends com.ctrack.demo.tracking.common.util.UseCase {
    private com.ctrack.demo.tracking.user.data.UserRepository repository;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final void loadAllUsers(@org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.util.DefaultSubscriber<java.lang.Integer> subscriber) {
    }
    
    public final void loadSomeUsersFromDb(int start, int end, @org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.util.DefaultSubscriber<java.util.List<com.ctrack.demo.tracking.user.data.model.UserEntity>> subscriber) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public UserUseCase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}