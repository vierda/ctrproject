package com.ctrack.demo.tracking.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0012\u001a\u0004\u0018\u00010\u000b\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0017H\u0004J4\u0010\u0012\u001a\u0004\u0018\u00010\u000b\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0004J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003J(\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0000\u0012\u00020 0\u0017H\u0007J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0012\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u001aH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/ctrack/demo/tracking/common/util/UseCase;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "postExecutionThread", "Lcom/ctrack/demo/tracking/common/util/PostExecutionThread;", "subscription", "", "Lio/reactivex/disposables/Disposable;", "getSubscription", "()Ljava/util/List;", "threadExecutor", "Lio/reactivex/Scheduler;", "timerSubscriptions", "Landroid/util/SparseArray;", "execute", "T", "observable", "Lio/reactivex/Observable;", "ucSubscriber", "Lcom/ctrack/demo/tracking/common/util/DefaultSubscriber;", "subscriber", "autoUnsubscribe", "", "getTimerSubscription", "id", "", "startTimer", "duration", "", "stopTimer", "unsubscribe", "", "async", "app_debug"})
public abstract class UseCase {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.reactivex.disposables.Disposable> subscription = null;
    private android.util.SparseArray<io.reactivex.disposables.Disposable> timerSubscriptions;
    private io.reactivex.Scheduler threadExecutor;
    private com.ctrack.demo.tracking.common.util.PostExecutionThread postExecutionThread;
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<io.reactivex.disposables.Disposable> getSubscription() {
        return null;
    }
    
    /**
     * * Execute (subscribe) an observable to a subscriber and enable auto un-subscribe
     *     *
     *     * @param observable   Observable object
     *     * @param ucSubscriber Subscriber object
     */
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>io.reactivex.disposables.Disposable execute(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> observable, @org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.util.DefaultSubscriber<T> ucSubscriber) {
        return null;
    }
    
    /**
     * * Execute (subscribe) an observable to a subscriber
     *     *
     *     * @param observable      Observable object
     *     * @param subscriber      Subscriber object
     *     * @param autoUnsubscribe Flag to enable/disable auto un-subscribe
     */
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>io.reactivex.disposables.Disposable execute(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> observable, @org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.util.DefaultSubscriber<T> subscriber, boolean autoUnsubscribe) {
        return null;
    }
    
    /**
     * * Un-subscribe from current @[Disposable]
     *     *
     *     * @param async True for asynchronous and false for synchronous mode
     */
    public final void unsubscribe(boolean async) {
    }
    
    /**
     * * Un-subscribe from current @[Disposable]
     *     *
     *     * @param async True for asynchronous and false for synchronous mode
     */
    public final void unsubscribe() {
    }
    
    /**
     * * Start a timer
     *     *
     *     * @param id         Timer ID
     *     * @param duration   Timeout duration (milliseconds)
     *     * @param subscriber Subscriber
     *     * @return true if success otherwise false
     */
    public final synchronized boolean startTimer(int id, long duration, @org.jetbrains.annotations.NotNull()
    com.ctrack.demo.tracking.common.util.DefaultSubscriber<? super java.lang.Long> subscriber) {
        return false;
    }
    
    /**
     * * Stop a timer
     *     *
     *     * @param id Timer ID
     *     * @return true if success otherwise false
     */
    public final synchronized boolean stopTimer(int id) {
        return false;
    }
    
    private final synchronized io.reactivex.disposables.Disposable getTimerSubscription(int id) {
        return null;
    }
    
    public UseCase() {
        super();
    }
}