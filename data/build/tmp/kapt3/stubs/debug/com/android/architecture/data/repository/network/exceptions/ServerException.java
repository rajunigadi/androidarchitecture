package com.android.architecture.data.repository.network.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0002 !BE\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001e\u00a2\u0006\u0002\u0010\u001fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\""}, d2 = {"Lcom/android/architecture/data/repository/network/exceptions/ServerException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "url", "response", "Lretrofit2/Response;", "kind", "Lcom/android/architecture/data/repository/network/exceptions/ServerException$Kind;", "exception", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/String;Ljava/lang/String;Lretrofit2/Response;Lcom/android/architecture/data/repository/network/exceptions/ServerException$Kind;Ljava/lang/Throwable;Lretrofit2/Retrofit;)V", "getKind", "()Lcom/android/architecture/data/repository/network/exceptions/ServerException$Kind;", "getResponse", "()Lretrofit2/Response;", "serverError", "Lcom/android/architecture/data/repository/network/AppServerError;", "getServerError", "()Lcom/android/architecture/data/repository/network/AppServerError;", "setServerError", "(Lcom/android/architecture/data/repository/network/AppServerError;)V", "getUrl", "()Ljava/lang/String;", "getErrorBodyAs", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Companion", "Kind", "data_debug"})
public final class ServerException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.Nullable()
    private com.android.architecture.data.repository.network.AppServerError serverError;
    
    /**
     * The request URL which produced the error.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    
    /**
     * Response object containing status code, headers, body, etc.
     */
    @org.jetbrains.annotations.Nullable()
    private final retrofit2.Response<?> response = null;
    
    /**
     * The event kind which triggered this error.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.android.architecture.data.repository.network.exceptions.ServerException.Kind kind = null;
    
    /**
     * The Retrofit this request was executed on.
     */
    private final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.architecture.data.repository.network.exceptions.ServerException.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.architecture.data.repository.network.AppServerError getServerError() {
        return null;
    }
    
    public final void setServerError(@org.jetbrains.annotations.Nullable()
    com.android.architecture.data.repository.network.AppServerError p0) {
    }
    
    /**
     * HTTP response body converted to specified `type`. `null` if there is no
     * response.
     *
     * @throws IOException if unable to convert the body to the specified `type`.
     */
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T getErrorBodyAs(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> type) {
        return null;
    }
    
    /**
     * The request URL which produced the error.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    /**
     * Response object containing status code, headers, body, etc.
     */
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Response<?> getResponse() {
        return null;
    }
    
    /**
     * The event kind which triggered this error.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.architecture.data.repository.network.exceptions.ServerException.Kind getKind() {
        return null;
    }
    
    public ServerException(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    retrofit2.Response<?> response, @org.jetbrains.annotations.NotNull()
    com.android.architecture.data.repository.network.exceptions.ServerException.Kind kind, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable exception, @org.jetbrains.annotations.Nullable()
    retrofit2.Retrofit retrofit) {
        super();
    }
    
    /**
     * Identifies the event kind which triggered a [ServerException].
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/android/architecture/data/repository/network/exceptions/ServerException$Kind;", "", "(Ljava/lang/String;I)V", "NETWORK", "HTTP", "UNEXPECTED", "data_debug"})
    public static enum Kind {
        /*public static final*/ NETWORK /* = new NETWORK() */,
        /*public static final*/ HTTP /* = new HTTP() */,
        /*public static final*/ UNEXPECTED /* = new UNEXPECTED() */;
        
        Kind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/android/architecture/data/repository/network/exceptions/ServerException$Companion;", "", "()V", "httpError", "Lcom/android/architecture/data/repository/network/exceptions/ServerException;", "url", "", "response", "Lretrofit2/Response;", "retrofit", "Lretrofit2/Retrofit;", "networkError", "exception", "Ljava/io/IOException;", "unexpectedError", "", "data_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.architecture.data.repository.network.exceptions.ServerException httpError(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        retrofit2.Response<?> response, @org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.architecture.data.repository.network.exceptions.ServerException networkError(@org.jetbrains.annotations.NotNull()
        java.io.IOException exception) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.architecture.data.repository.network.exceptions.ServerException unexpectedError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}