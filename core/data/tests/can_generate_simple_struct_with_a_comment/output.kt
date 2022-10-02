/**
 * Generated by typeshare 1.0.0
 */

@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

@Serializable
class Location

/// This is a comment.
@Serializable
data class Person (
	/// This is another comment
	var name: String,
	var age: UByte,
	var info: String? = null,
	var emails: List<String>,
	var location: Location
)

