package com.ims.service;

public class Notifier {

    private static INotificationService service = new NotificationServiceImpl();

    public static void notify(Integer fromUserId, Integer toUserId, String message) {
        service.notify(fromUserId,toUserId,message);
    }
}
