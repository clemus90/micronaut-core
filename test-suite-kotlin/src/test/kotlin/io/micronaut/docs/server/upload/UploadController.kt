/*
 * Copyright 2017-2019 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.docs.server.upload

// tag::imports[]

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.multipart.CompletedFileUpload
import io.micronaut.http.multipart.StreamingFileUpload
import io.reactivex.Single
import org.reactivestreams.Publisher

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

// end::imports[]
// tag::completedImports[]
// end::completedImports[]

/**
 * @author Graeme Rocher
 * @since 1.0
 */
// tag::class[]
@Controller("/upload")
class UploadController {
    // end::class[]

//    // tag::upload[]
//    @Post(value = "/", consumes = [MediaType.MULTIPART_FORM_DATA]) // <1>
//    @Throws(IOException::class)
////    fun upload(file: StreamingFileUpload): Single<HttpResponse<String>> { // <2>
////        val tempFile = File.createTempFile(file.filename, "temp")
////        val uploadPublisher = file.transferTo(tempFile) // <3>
////        return Single.fromPublisher(uploadPublisher)  // <4>
////                .map { success ->
////                    if (success) {
////                        return@Single.fromPublisher(uploadPublisher)  // <4>
////                                .map HttpResponse . ok < String >("Uploaded")
////                    } else {
////                        return@Single.fromPublisher(uploadPublisher)  // <4>
////                                .map HttpResponse . status < String >(HttpStatus.CONFLICT)
////                                .body("Upload Failed")
////                    }
////                }
////    }
//    // end::upload[]
//
//    // tag::completedUpload[]
//    @Post(value = "/completed", consumes = [MediaType.MULTIPART_FORM_DATA]) // <1>
//    fun uploadCompleted(file: CompletedFileUpload): HttpResponse<String> { // <2>
//        try {
//            val tempFile = File.createTempFile(file.filename, "temp") //<3>
//            val path = Paths.get(tempFile.absolutePath)
//            Files.write(path, file.bytes) //<3>
//            return HttpResponse.ok("Uploaded")
//        } catch (exception: IOException) {
//            return HttpResponse.badRequest("Upload Failed")
//        }
//
//    }
//    // end::completedUpload[]
//
//    // tag::bytesUpload[]
//    @Post(value = "/bytes", consumes = [MediaType.MULTIPART_FORM_DATA]) // <1>
//    fun uploadBytes(file: ByteArray, fileName: String): HttpResponse<String> { // <2>
//        try {
//            val tempFile = File.createTempFile(fileName, "temp")
//            val path = Paths.get(tempFile.absolutePath)
//            Files.write(path, file) // <3>
//            return HttpResponse.ok("Uploaded")
//        } catch (exception: IOException) {
//            return HttpResponse.badRequest("Upload Failed")
//        }
//
//    }
//    // end::bytesUpload[]

}