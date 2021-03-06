package com.ganesh.twitterapp.di.module

import androidx.lifecycle.ViewModel
import com.ganesh.twitterapp.di.ActivityScope
import com.ganesh.twitterapp.view_model.TrendsListViewModel
import com.ganesh.twitterapp.di.ViewModelKey
import com.ganesh.twitterapp.view_model.BaseViewModel


import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap



@Module
abstract class TrendsViewModelModule {

    @ActivityScope
    @Binds
    @IntoMap
    @ViewModelKey(TrendsListViewModel::class)
    abstract fun bindMyViewModel(myViewModel: TrendsListViewModel): ViewModel

    @ActivityScope
    @Binds
    @IntoMap
    @ViewModelKey(BaseViewModel::class)
    abstract fun bindBaseViewmodel(myViewModel: BaseViewModel): ViewModel
}