import android.media.Image
import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize

data class Note(
    var id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var date: String? = null,
    var image: String? = null
) : Parcelable