package philip.android.frame.present

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.java.KoinJavaComponent.inject
import philip.android.frame.R
import philip.android.frame.present.viewmodel.BookViewModel

class MainActivity : AppCompatActivity() {

    private val booksDataVIewModel by viewModel<BookViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){

                booksDataVIewModel
                    .getBookList()
                    .collect{
                        it.getOrNull()?.forEach {
                            Log.e("philip","philip 테스트 입니다만 ${it.id}")
                        }
                    }
            }


        }
    }
}