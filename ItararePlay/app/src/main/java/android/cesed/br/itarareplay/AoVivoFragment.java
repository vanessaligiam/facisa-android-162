package android.cesed.br.itarareplay;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Igor on 02/10/2016.
 */
public class AoVivoFragment extends Fragment {

    View minhaView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        minhaView = inflater.inflate(R.layout.aovivo_layout, container, false);
        return minhaView;
    }
}
