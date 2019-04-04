package com.skottie.jetpackapp;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;

public abstract class NetworkBoundResource<ResultType, RequestType> {
    @WorkerThread
    protected abstract void saveCallResult(@NonNull RequestType item);

    @MainThread
    protected abstract boolean shouldFetch(@Nullable ResultType data);

    @NonNull @MainThread
    protected abstract LiveData<ResultType> loadFromDb();

    @NonNull @MainThread
    protected abstract LiveData<ApiResponse<RequestType>> createCall();

    @MainThread
    protected void onFetchFailed();

    public final LiveData<Resource<ResultType>> getAsLiveData();
}
