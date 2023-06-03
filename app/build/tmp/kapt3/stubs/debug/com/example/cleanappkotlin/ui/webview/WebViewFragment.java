package com.example.cleanappkotlin.ui.webview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/example/cleanappkotlin/ui/webview/WebViewFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/cleanappkotlin/databinding/FragmentWebViewBinding;", "getBinding", "()Lcom/example/cleanappkotlin/databinding/FragmentWebViewBinding;", "setBinding", "(Lcom/example/cleanappkotlin/databinding/FragmentWebViewBinding;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setUpOnclick", "showWebView", "url", "", "WebViewClient", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class WebViewFragment extends androidx.fragment.app.Fragment {
    public com.example.cleanappkotlin.databinding.FragmentWebViewBinding binding;
    
    public WebViewFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.cleanappkotlin.databinding.FragmentWebViewBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.example.cleanappkotlin.databinding.FragmentWebViewBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showWebView(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    public final void setUpOnclick() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/example/cleanappkotlin/ui/webview/WebViewFragment$WebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/example/cleanappkotlin/ui/webview/WebViewFragment;)V", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "shouldOverrideUrlLoading", "", "app_debug"})
    public final class WebViewClient extends android.webkit.WebViewClient {
        
        public WebViewClient() {
            super();
        }
        
        @java.lang.Override
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        java.lang.String url) {
            return false;
        }
        
        @java.lang.Override
        public void onPageFinished(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        java.lang.String url) {
        }
    }
}