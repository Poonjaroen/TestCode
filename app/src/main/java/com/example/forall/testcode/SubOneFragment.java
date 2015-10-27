package com.example.forall.testcode;


import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubOneFragment extends Fragment {

    
    String msg = "No Create";
    
    public SubOneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Sub----->", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setRetainInstance(true);
        Log.e("Sub----->", "onCreate : " + savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("Sub----->", "onCreateView : " + savedInstanceState + "\nParent : " + getParentFragment());
        return inflater.inflate(R.layout.fragment_sub_one, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.e("Sub----->", "onActivityCreated : " + savedInstanceState);
        if(savedInstanceState == null) {
            msg = "Created";
            TextView tv = (TextView) getView().findViewById(R.id.textView);
            tv.setText(msg);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Sub----->", "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Sub----->", "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Sub----->", "onDetach");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("Sub----->", "onSaveInstanceState");
        outState.putString("mParam1", msg);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Sub----->", "onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Sub----->", "onPause");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Sub----->", "onResume");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Sub----->", "onStart");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("Sub----->", "Configuration : " + newConfig.orientation);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("Sub----->", "onViewCreated : " + savedInstanceState);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e("Sub----->","onViewStateRestored : " + savedInstanceState);
    }
}
