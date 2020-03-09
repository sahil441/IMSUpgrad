package com.ims.service;

import com.ims.actor.InventoryManager;
import com.ims.actor.SystemUser;
import com.ims.data.SystemUserHolder;
import com.ims.entity.Notification;

public class NotificationServiceImpl implements INotificationService {

    @Override
    public void notify(Integer fromUserId, Integer toUserId, String message) {
        SystemUser from =  SystemUserHolder.fetchById(toUserId);
        SystemUser to =  SystemUserHolder.fetchById(toUserId);
        Notification notification = new Notification(fromUserId,toUserId,message);
        to.notify(notification);
        System.out.println("Notification sent to systemUser -> "+ to.getName());
    }

    @Override
    public void notify(SystemUser fromUser, SystemUser toUser, String message) {
        Notification notification = new Notification(fromUser.getId(),toUser.getId(),message);
        toUser.notify(notification);
    }

}
