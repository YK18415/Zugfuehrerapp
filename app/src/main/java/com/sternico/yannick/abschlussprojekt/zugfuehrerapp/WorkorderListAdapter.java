package com.sternico.yannick.abschlussprojekt.zugfuehrerapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class WorkorderListAdapter extends RecyclerView.Adapter<WorkorderListAdapter.WorkorderView> {

    class WorkorderView extends RecyclerView.ViewHolder {

        TextView textView_workorder;
        Button btn_start_finish;
        Button btn_moreDetails;

        public WorkorderView(View itemView) {
            super(itemView);
            textView_workorder = itemView.findViewById(R.id.textView_workorder);
            btn_start_finish = itemView.findViewById(R.id.btn_start_finish);
            btn_moreDetails = itemView.findViewById(R.id.btn_moreDetails);
        }
    }


    private final LayoutInflater layoutInflater;


    public WorkorderListAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    /**
     *
     * @param parent: Zu welcher View dieser Teil hier gehört. In diesem Fall:
     * @param i
     * @return
     */
    @NonNull
    @Override
    public WorkorderView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View workorderItem = layoutInflater.inflate(R.layout.workorder_entries, parent, false);
        return new WorkorderView(workorderItem);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkorderListAdapter.WorkorderView workorderView, int i) {

    }

    @Override
    public int getItemCount() {
        return this.getItemCount();
    }
}
