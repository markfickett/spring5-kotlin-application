package app.web.routes

import org.mockito.Mockito
import java.time.LocalDateTime
import kotlin.reflect.KClass

/**
 *
 * @author nsoushi
 */
class km {
    companion object {
        fun <T> any(): T {
            return Mockito.any()
                    ?: null as T
        }

        fun <T : Any>  any(type: KClass<T>): T {
            return Mockito.any(type.java)
        }

        fun <T> eq(value: T): T {
            return if (value != null)
                Mockito.eq(value)
            else
                null
                        ?: null as T
        }
    }
}
