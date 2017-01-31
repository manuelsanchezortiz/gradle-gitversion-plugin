package org.unbrokendome.gradle.plugins.gitversion.core;

import org.unbrokendome.gradle.plugins.gitversion.model.GitBranch;
import org.unbrokendome.gradle.plugins.gitversion.model.GitCommit;
import org.unbrokendome.gradle.plugins.gitversion.model.HasObjectId;

import javax.annotation.Nonnull;


public interface BranchPoint extends HasObjectId {

    @Nonnull
    GitCommit getCommit();

    @Nonnull
    GitBranch getOtherBranch();


    @Nonnull
    default String getOtherBranchName() {
        return getOtherBranch().getShortName();
    }


    @Nonnull
    MatcherFacade getMatches();


    @Nonnull
    @Override
    default String getId() {
        return getCommit().getId();
    }
}