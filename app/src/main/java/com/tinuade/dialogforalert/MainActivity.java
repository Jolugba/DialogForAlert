package com.tinuade.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder= new AlertDialog.Builder(this);
        // Set the dialog title and message.
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Click OK to continue, or Cancel to stop:");
        // Add the dialog buttons.
        myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            /**
             * This method will be invoked when a button in the dialog is clicked.
             *
             * @param dialog the dialog that received the click
             * @param which  the button that was clicked (ex.
             *               {@link DialogInterface#BUTTON_POSITIVE}) or the position
             */
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // User clicked OK button.
                Toast.makeText(getApplicationContext(), "Pressed OK",
                        Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // User cancelled the dialog.
                Toast.makeText(getApplicationContext(), "Pressed Cancel",
                        Toast.LENGTH_SHORT).show();

            }
        });
        // Create and show the AlertDialog.
        myAlertBuilder.show();

    }
}
