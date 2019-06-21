import com.amazonaws.auth.profile.ProfileCredentialsProvider
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.credentials.AwsCredentials
import org.gradle.kotlin.dsl.maven

fun RepositoryHandler.s3(bucketName: String = "orion-maven-releases", profileName: String = "default") {
    val awsCredentials = ProfileCredentialsProvider(profileName).credentials

    maven("s3://$bucketName/release") {
        credentials(AwsCredentials::class.java) {
            accessKey = awsCredentials.awsAccessKeyId
            secretKey = awsCredentials.awsSecretKey
        }
    }
}

