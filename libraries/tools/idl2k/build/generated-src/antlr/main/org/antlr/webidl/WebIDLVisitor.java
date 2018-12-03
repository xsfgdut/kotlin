// Generated from org/antlr/webidl/WebIDL.g4 by ANTLR 4.7.1
package org.antlr.webidl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WebIDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WebIDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#webIDL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebIDL(WebIDLParser.WebIDLContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#namespaceScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceScope(WebIDLParser.NamespaceScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#namespaceRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceRest(WebIDLParser.NamespaceRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(WebIDLParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(WebIDLParser.DefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(WebIDLParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(WebIDLParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#callbackOrInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackOrInterface(WebIDLParser.CallbackOrInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#exception_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_(WebIDLParser.Exception_Context ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#callbackRestOrInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackRestOrInterface(WebIDLParser.CallbackRestOrInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#interface_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_(WebIDLParser.Interface_Context ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#partial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial(WebIDLParser.PartialContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#partialDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialDefinition(WebIDLParser.PartialDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#partialInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialInterface(WebIDLParser.PartialInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#interfaceMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMembers(WebIDLParser.InterfaceMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#interfaceMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMember(WebIDLParser.InterfaceMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(WebIDLParser.DictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryMembers(WebIDLParser.DictionaryMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#dictionaryMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryMember(WebIDLParser.DictionaryMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#required}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequired(WebIDLParser.RequiredContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#partialDictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialDictionary(WebIDLParser.PartialDictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#default_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_(WebIDLParser.Default_Context ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(WebIDLParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(WebIDLParser.InheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#enum_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_(WebIDLParser.Enum_Context ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#enumValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueList(WebIDLParser.EnumValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#enumValueListComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueListComma(WebIDLParser.EnumValueListCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#enumValueListString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValueListString(WebIDLParser.EnumValueListStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#callbackRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallbackRest(WebIDLParser.CallbackRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#typedef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(WebIDLParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#implementsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsStatement(WebIDLParser.ImplementsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#const_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_(WebIDLParser.Const_Context ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#constValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstValue(WebIDLParser.ConstValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(WebIDLParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(WebIDLParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializer(WebIDLParser.SerializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializerRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializerRest(WebIDLParser.SerializerRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializationPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializationPattern(WebIDLParser.SerializationPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializationPatternMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializationPatternMap(WebIDLParser.SerializationPatternMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#serializationPatternList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializationPatternList(WebIDLParser.SerializationPatternListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#stringifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringifier(WebIDLParser.StringifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#stringifierRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringifierRest(WebIDLParser.StringifierRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#staticMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticMember(WebIDLParser.StaticMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#staticMemberRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticMemberRest(WebIDLParser.StaticMemberRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#readonlyMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadonlyMember(WebIDLParser.ReadonlyMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#readonlyMemberRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadonlyMemberRest(WebIDLParser.ReadonlyMemberRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#readWriteAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadWriteAttribute(WebIDLParser.ReadWriteAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#attributeRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeRest(WebIDLParser.AttributeRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#attributeAnnotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeAnnotations(WebIDLParser.AttributeAnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#inherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherit(WebIDLParser.InheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#readOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadOnly(WebIDLParser.ReadOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(WebIDLParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#specialOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialOperation(WebIDLParser.SpecialOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#specials}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecials(WebIDLParser.SpecialsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(WebIDLParser.SpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#operationRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationRest(WebIDLParser.OperationRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalIdentifier(WebIDLParser.OptionalIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(WebIDLParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(WebIDLParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(WebIDLParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#optionalOrRequiredArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalOrRequiredArgument(WebIDLParser.OptionalOrRequiredArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#argumentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentName(WebIDLParser.ArgumentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#ellipsis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipsis(WebIDLParser.EllipsisContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterable(WebIDLParser.IterableContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#optionalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalType(WebIDLParser.OptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#readWriteMaplike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadWriteMaplike(WebIDLParser.ReadWriteMaplikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#readWriteSetlike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadWriteSetlike(WebIDLParser.ReadWriteSetlikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#maplikeRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaplikeRest(WebIDLParser.MaplikeRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#setlikeRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetlikeRest(WebIDLParser.SetlikeRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeList(WebIDLParser.ExtendedAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributes(WebIDLParser.ExtendedAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttribute(WebIDLParser.ExtendedAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeNamePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeNamePart(WebIDLParser.ExtendedAttributeNamePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentNameKeyword(WebIDLParser.ArgumentNameKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(WebIDLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#singleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleType(WebIDLParser.SingleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(WebIDLParser.UnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unionMemberType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionMemberType(WebIDLParser.UnionMemberTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionMemberTypes(WebIDLParser.UnionMemberTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#nonAnyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAnyType(WebIDLParser.NonAnyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#constType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstType(WebIDLParser.ConstTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(WebIDLParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unrestrictedFloatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnrestrictedFloatType(WebIDLParser.UnrestrictedFloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#floatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(WebIDLParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedIntegerType(WebIDLParser.UnsignedIntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#integerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(WebIDLParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#sequenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceType(WebIDLParser.SequenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#promiseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPromiseType(WebIDLParser.PromiseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#typeSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSuffix(WebIDLParser.TypeSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSuffixStartingWithArray(WebIDLParser.TypeSuffixStartingWithArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#null_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_(WebIDLParser.Null_Context ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(WebIDLParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(WebIDLParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(WebIDLParser.IdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeNoArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeNoArgs(WebIDLParser.ExtendedAttributeNoArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeArgList(WebIDLParser.ExtendedAttributeArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeIdent(WebIDLParser.ExtendedAttributeIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeIdentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeIdentList(WebIDLParser.ExtendedAttributeIdentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebIDLParser#extendedAttributeNamedArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedAttributeNamedArgList(WebIDLParser.ExtendedAttributeNamedArgListContext ctx);
}