package com.noobcoded.uas.fragment;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noobcoded.uas.R;
import com.noobcoded.uas.adapter.FavoriteAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.noobcoded.uas.database.DatabaseContact.CONTENT_URI;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class FavoriteFragment extends Fragment {

    private Context context;
    private Unbinder unbinder;

    @BindView(R.id.rv_favorite)
    RecyclerView rv_favorite;

    private Cursor list;
    private FavoriteAdapter adapter;

    public FavoriteFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        context = view.getContext();

        unbinder = ButterKnife.bind(this, view);

        setupList();
        new loadDataAsync().execute();

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onResume() {
        super.onResume();
        new loadDataAsync().execute();
    }

    private void setupList() {
        adapter = new FavoriteAdapter(list);
        rv_favorite.setLayoutManager(new LinearLayoutManager(context));
        rv_favorite.setAdapter(adapter);
    }

    private class loadDataAsync extends AsyncTask<Void, Void, Cursor> {

        @Override
        protected Cursor doInBackground(Void... voids) {
            return context.getContentResolver().query(
                    CONTENT_URI,
                    null,
                    null,
                    null,
                    null
            );
        }

        @Override
        protected void onPostExecute(Cursor cursor) {
            super.onPostExecute(cursor);

            list = cursor;
            adapter.replaceAll(list);
        }
    }
}
