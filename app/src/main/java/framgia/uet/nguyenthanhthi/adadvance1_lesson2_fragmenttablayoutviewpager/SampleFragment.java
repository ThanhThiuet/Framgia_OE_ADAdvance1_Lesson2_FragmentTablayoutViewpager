package framgia.uet.nguyenthanhthi.adadvance1_lesson2_fragmenttablayoutviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SampleFragment extends Fragment {

    private String[] mTitles = {"Android", "iOS", "PHP", "Java", "Ruby", "Python",
            "C", "C++", "C#", "NodeJS", ".Net", "Go", "Java Script", "Ruby on Rails",
            "Swift", "Kotlin", "Scala", "Pascal"};

    public SampleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sample, container, false);
        RecyclerView recycler_sample = view.findViewById(R.id.recycler_sample);
        recycler_sample.setLayoutManager(new LinearLayoutManager(getContext()));
        SampleAdapter adapter = new SampleAdapter(mTitles);
        recycler_sample.setAdapter(adapter);
        return view;
    }

}
