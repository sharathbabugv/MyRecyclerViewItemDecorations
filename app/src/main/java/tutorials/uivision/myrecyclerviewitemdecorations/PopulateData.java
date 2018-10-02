package tutorials.uivision.myrecyclerviewitemdecorations;

import java.util.ArrayList;
import java.util.List;

public class PopulateData {
    public static List<RecyclerModal> dataToBePassed() {
        List<RecyclerModal> recyclerModals = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            RecyclerModal recyclerModal = new RecyclerModal();
            // set you text or images here, when you are passing data to recycler view.
            // for example recyclerModal.setImage(images[i]):
            recyclerModals.add(recyclerModal);
        }
        return recyclerModals;

    }
}
