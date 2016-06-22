package testapplications.leapfrog.com.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {

    private static TextView displayOne;
    private static TextView displayTwo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        displayOne = (TextView) view.findViewById(R.id.topdisplay);
        displayTwo = (TextView) view.findViewById(R.id.bottomdisplay);
        return view;
    }

    public void setMemeText(String top, String bottom){
        displayOne.setText(top);
        displayTwo.setText(bottom);
    }

}
