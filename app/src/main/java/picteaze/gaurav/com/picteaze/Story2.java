package picteaze.gaurav.com.picteaze;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Story2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Story2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Story2 extends Fragment {
    public Story2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_story2, container, false);
    }
}
