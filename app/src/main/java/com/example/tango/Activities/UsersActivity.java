package com.example.tango.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tango.Adapters.UsersListAdapter;
import com.example.tango.Models.User;
import com.example.tango.R;

import java.util.ArrayList;
import java.util.List;

public class UsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        RecyclerView usersRecyclerView = findViewById(R.id.usersRecyclerView);

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

        UsersListAdapter usersListAdapter = new UsersListAdapter(this, users, new UsersListAdapter.ItemClickListener() {
            @Override
            public void onUserClick(User user) {
                Intent intent = new Intent(getApplicationContext(), UserDetailsActivity.class);
                startActivity(intent);
            }
        });
        usersRecyclerView.setAdapter(usersListAdapter);
        usersRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

}
