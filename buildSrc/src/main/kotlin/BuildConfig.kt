import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildConfig: Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.configure(BaseExtension::class.java){
            it.compileSdkVersion(30)
        }
    }


}