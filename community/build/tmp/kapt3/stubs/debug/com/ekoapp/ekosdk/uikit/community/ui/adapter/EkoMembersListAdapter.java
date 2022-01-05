package com.ekoapp.ekosdk.uikit.community.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u0017J.\u0010\u0018\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/ekoapp/ekosdk/uikit/community/ui/adapter/EkoMembersListAdapter;", "Lcom/ekoapp/ekosdk/uikit/base/EkoBaseRecyclerViewPagedAdapter;", "Lcom/ekoapp/ekosdk/user/EkoUser;", "listener", "Lcom/ekoapp/ekosdk/uikit/community/ui/clickListener/EkoSelectMemberListener;", "viewModel", "Lcom/ekoapp/ekosdk/uikit/community/ui/viewModel/EkoSelectMembersViewModel;", "(Lcom/ekoapp/ekosdk/uikit/community/ui/clickListener/EkoSelectMemberListener;Lcom/ekoapp/ekosdk/uikit/community/ui/viewModel/EkoSelectMembersViewModel;)V", "selectedMemberSet", "Ljava/util/HashSet;", "", "getLayoutId", "", "position", "user", "getViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "viewType", "notifyChange", "", "memberSet", "Lkotlin/collections/HashSet;", "submitPagedList", "pagedList", "Landroidx/paging/PagedList;", "Companion", "community_debug"})
public final class EkoMembersListAdapter extends com.ekoapp.ekosdk.uikit.base.EkoBaseRecyclerViewPagedAdapter<com.ekoapp.ekosdk.user.EkoUser> {
    private final java.util.HashSet<java.lang.String> selectedMemberSet = null;
    private final com.ekoapp.ekosdk.uikit.community.ui.clickListener.EkoSelectMemberListener listener = null;
    private final com.ekoapp.ekosdk.uikit.community.ui.viewModel.EkoSelectMembersViewModel viewModel = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ekoapp.ekosdk.user.EkoUser> diffCallback = null;
    public static final com.ekoapp.ekosdk.uikit.community.ui.adapter.EkoMembersListAdapter.Companion Companion = null;
    
    @java.lang.Override()
    protected int getLayoutId(int position, @org.jetbrains.annotations.Nullable()
    com.ekoapp.ekosdk.user.EkoUser user) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view, int viewType) {
        return null;
    }
    
    public final void submitPagedList(@org.jetbrains.annotations.Nullable()
    androidx.paging.PagedList<com.ekoapp.ekosdk.user.EkoUser> pagedList, @org.jetbrains.annotations.NotNull()
    java.util.HashSet<java.lang.String> memberSet) {
    }
    
    public final void notifyChange(int position, @org.jetbrains.annotations.NotNull()
    java.util.HashSet<java.lang.String> memberSet) {
    }
    
    public EkoMembersListAdapter(@org.jetbrains.annotations.NotNull()
    com.ekoapp.ekosdk.uikit.community.ui.clickListener.EkoSelectMemberListener listener, @org.jetbrains.annotations.NotNull()
    com.ekoapp.ekosdk.uikit.community.ui.viewModel.EkoSelectMembersViewModel viewModel) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ekoapp/ekosdk/uikit/community/ui/adapter/EkoMembersListAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ekoapp/ekosdk/user/EkoUser;", "community_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}