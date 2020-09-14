package co.paulfran.mvvmnewsapp.db

import androidx.room.TypeConverter
import co.paulfran.mvvmnewsapp.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }
    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }

}