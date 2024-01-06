package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.homework6.Automobile.*;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView output = findViewById(R.id.output);

        Car car = new Car();
        Truck truck = new Truck();
        Microbus microbus = new Microbus();
        //Print in logs
        printCarInfo(car);
        printCarInfo(truck);
        printCarInfo(microbus);

        //Print on screen
        output.setText("Passengers Capacity: " + car.getPassengerCapacity() +
                "\nMax Speed: " + car.getMaxSpeed() +
                "\nWeight: " + car.getWeight());

        output.setText(output.getText() + "\n\nPassengers Capacity: " + truck.getPassengerCapacity() +
                "\nMax Speed: " + truck.getMaxSpeed() +
                "\nWeight: " + truck.getWeight());

        output.setText(output.getText() + "\n\nPassengers Capacity: " + microbus.getPassengerCapacity() +
                "\nMax Speed: " + microbus.getMaxSpeed() +
                "\nWeight: " + microbus.getWeight());
    }

    private void printCarInfo(Automobile car) {
        Log.d("CarInfo", "Passengers Capacity: " + car.getPassengerCapacity());
        Log.d("CarInfo", "Max Speed: " + car.getMaxSpeed());
        Log.d("CarInfo", "Weight: " + car.getWeight());
    }
}