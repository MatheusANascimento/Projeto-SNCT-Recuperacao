package com.example.projsnct;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;
import android.view.View.OnClickListener;


public class Notificar implements OnClickListener{

    @Override
    public void onClick(View v,int cont) {

        Context context = v.getContext();

        int notificationId = 1;

        Intent viewIntent = new Intent(Intent.ACTION_VIEW);


        PendingIntent pendingIntent =
                PendingIntent.getActivity(context, 0, viewIntent, 0);


        Notification notificationBuild = new NotificationCompat.Builder(context)
                .setTicker("Total de Avaliações:")
                .setSmallIcon(R.drawable.book)
                .setContentTitle("Total de Avaliações:")
                .setContentText(cont)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSound(alarmSound)
                .build();

        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(context);


        notificationManager.notify(notificationId, notificationBuild);
    }
}