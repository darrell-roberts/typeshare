/**
 * Generated by typeshare 1.1.0-prerelease02
 */
package com.agilebits

package onepassword {

// This is a comment.
sealed trait Colors {
	def serialName: String
}
object Colors {
	case object Red extends Colors {
		val serialName: String = "red"
	}
	case object Blue extends Colors {
		val serialName: String = "blue-ish"
	}
	case object Green extends Colors {
		val serialName: String = "Green"
	}
}

}
