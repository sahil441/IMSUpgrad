package com.ims.service;

import com.ims.actor.SystemUser;

public interface INotificationService {

    public void notify(Integer fromUserId, Integer toUserId, String message);

    void notify(SystemUser fromUser, SystemUser toUser, String message);
}
