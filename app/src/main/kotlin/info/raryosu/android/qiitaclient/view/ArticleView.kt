package info.raryosu.android.qiitaclient.view

import android.content.Context
import android.graphics.Color
import android.media.Image
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import info.raryosu.android.qiitaclient.R
import info.raryosu.android.qiitaclient.bindView
import info.raryosu.android.qiitaclient.model.Article
import org.w3c.dom.Text


class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?,
                attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int,
                defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    val profileImageView: ImageView by bindView<ImageView>(R.id.profile_image_view)

    val titleTextView: TextView by bindView<TextView>(R.id.title_text_view)

    val userNameTextView: TextView by bindView<TextView>(R.id.user_name_text_view)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
    }

    fun setArticle(article: Article) {
        titleTextView.text = article.title
        userNameTextView.text = article.user.name
        Glide.with(context).load(article.user.profileImageUrl).into(profileImageView)
    }
}