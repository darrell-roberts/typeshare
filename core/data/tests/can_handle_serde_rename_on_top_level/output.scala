/**
 * Generated by typeshare 1.1.0-prerelease02
 */
package com.agilebits

package object onepassword {

type UByte = Byte
type UShort = Short
type UInt = Int
type ULong = Int

}
package onepassword {

class OtherType extends Serializable

// This is a comment.
case class PersonTwo (
	name: String,
	age: UByte,
	extraSpecialFieldOne: Int,
	extraSpecialFieldTwo: Option[Vector[String]] = None,
	nonStandardDataType: OtherType,
	nonStandardDataTypeInArray: Option[Vector[OtherType]] = None
)

}
