/*
 Generated by typeshare 1.1.0-prerelease02
*/

export type AnonymousStructWithRename = 
	| { type: "list", content: {
	list: string[];
}}
	| { type: "longFieldNames", content: {
	some_long_field_name: string;
	and: boolean;
	but_one_more: string[];
}}
	| { type: "kebabCase", content: {
	"another-list": string[];
	camelCaseStringField: string;
	"something-else": boolean;
}};

