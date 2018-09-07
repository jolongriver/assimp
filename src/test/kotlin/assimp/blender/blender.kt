package assimp.blender

import assimp.models
import assimp.obj.*
import io.kotlintest.specs.StringSpec

class blender : StringSpec() {

    val path = models + "/BLEND/"

    init {
        "blender default 250 compressed".config(enabled = false){ blenderDefault_250_compressed(path + "BlenderDefault_250_Compressed.blend") }
        //"spider"{ spider(path + "spider.obj") }
        //"nanosuit" { nanosuit(path + "nanosuit/nanosuit.obj") }
        //"shelter" { shelter(path + "statie B01.obj")}
    }
}