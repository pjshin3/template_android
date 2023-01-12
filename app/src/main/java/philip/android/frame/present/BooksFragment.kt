package philip.android.frame.present

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import philip.android.frame.R
import philip.android.frame.databinding.FragmentBooksBinding

class BooksFragment: BaseFragment<FragmentBooksBinding>(
    layoutId = R.layout.fragment_books
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}