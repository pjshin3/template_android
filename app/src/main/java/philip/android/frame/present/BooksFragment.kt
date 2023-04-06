package philip.android.frame.present

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import philip.android.frame.R
import philip.android.frame.databinding.FragmentBooksBinding
import philip.android.frame.present.viewmodel.BookViewModel

class BooksFragment: BaseFragment<FragmentBooksBinding>(
    layoutId = R.layout.fragment_books
) {

    private val booksDataVIewModel by viewModels<BookViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launchWhenCreated {
//            booksDataVIewModel.getBookList()
//                .collect {
//                    Log.e("philip","philip 테스트 입니다 ${it.isSuccess}")
//                }
        }
    }
}