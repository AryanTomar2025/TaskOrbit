package com.aryan.service;

import com.aryan.domain.PlanType;
import com.aryan.model.Subscription;
import com.aryan.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
