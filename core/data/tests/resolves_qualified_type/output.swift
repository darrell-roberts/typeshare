/*
 Generated by typeshare 1.0.0
 */

import Foundation

public struct CoreQualifiedTypes: Codable {
	public let unqualified: String
	public let qualified: String
	public let qualified_vec: [String]
	public let qualified_hashmap: [String: String]
	public let qualified_optional: String?
	public let qualfied_optional_hashmap_vec: [String: [String]]?

	public init(unqualified: String, qualified: String, qualified_vec: [String], qualified_hashmap: [String: String], qualified_optional: String?, qualfied_optional_hashmap_vec: [String: [String]]?) {
		self.unqualified = unqualified
		self.qualified = qualified
		self.qualified_vec = qualified_vec
		self.qualified_hashmap = qualified_hashmap
		self.qualified_optional = qualified_optional
		self.qualfied_optional_hashmap_vec = qualfied_optional_hashmap_vec
	}
}
