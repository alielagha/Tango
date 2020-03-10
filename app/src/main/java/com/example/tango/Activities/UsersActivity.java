package com.example.tango.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tango.Adapters.UsersAdapter;
import com.example.tango.Models.User;
import com.example.tango.R;

import java.util.ArrayList;
import java.util.List;

public class UsersActivity extends AppCompatActivity {

    private RecyclerView usersRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        usersRecyclerView = findViewById(R.id.usersRecyclerView);

        // Recyclerview Setup
        // ini data

        List<User> users = new ArrayList<>();
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));
        users.add(new User("Ali Elagha", "Hi , How Are you", "7:10 PM", 2));

        UsersAdapter usersAdapter = new UsersAdapter(this, users, new UsersAdapter.ItemClickListener() {
            @Override
            public void onUserClick(User user) {
                Intent intent = new Intent(getApplicationContext(), ScrollingActivity.class);
                startActivity(intent);
            }
        });
        usersRecyclerView.setAdapter(usersAdapter);
        usersRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

}
