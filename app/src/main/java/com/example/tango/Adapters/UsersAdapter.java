package com.example.tango.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tango.Models.User;
import com.example.tango.R;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {

    Context context;
    List<User> users;
    ItemClickListener itemClickListener;

    public interface ItemClickListener {

        void onUserClick(User user);

    }


    public UsersAdapter(Context context, List<User> users, ItemClickListener listener) {
        this.context = context;
        this.users = users;
        itemClickListener = listener;
    }


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(context).inflate(R.layout.chat_list_item, viewGroup, false);
        return new UserViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {

        User user = users.get(i);
        userViewHolder.userImageView.setImageResource(R.drawable.user_image);
        userViewHolder.onlineImageView.setImageResource(R.drawable.online);
        userViewHolder.usernameTv.setText(user.getUsername());
        userViewHolder.messageTv.setText(user.getMessage());
        userViewHolder.messageTimeTv.setText(user.getTime());
        userViewHolder.unreadMessagesTv.setText(String.valueOf(user.getUnreadMessages()));

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {


        private TextView usernameTv, messageTv, messageTimeTv, unreadMessagesTv;
        private ImageView userImageView, onlineImageView;


        public UserViewHolder(@NonNull View itemView) {

            super(itemView);
            userImageView = itemView.findViewById(R.id.userImageView);
            onlineImageView = itemView.findViewById(R.id.onlineImageView);
            usernameTv = itemView.findViewById(R.id.usernameTv);
            messageTv = itemView.findViewById(R.id.messageTv);
            messageTimeTv = itemView.findViewById(R.id.messageTimeTv);
            unreadMessagesTv = itemView.findViewById(R.id.unreadMessagesTv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    itemClickListener.onUserClick(users.get(getAdapterPosition()));


                }
            });

        }
    }
}
