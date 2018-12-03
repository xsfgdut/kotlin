// Generated from org/antlr/webidl/WebIDL.g4 by ANTLR 4.7.1
package org.antlr.webidl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebIDLParser}.
 */
public interface WebIDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#webIDL}.
	 * @param ctx the parse tree
	 */
	void enterWebIDL(WebIDLParser.WebIDLContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#webIDL}.
	 * @param ctx the parse tree
	 */
	void exitWebIDL(WebIDLParser.WebIDLContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#namespaceScope}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceScope(WebIDLParser.NamespaceScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#namespaceScope}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceScope(WebIDLParser.NamespaceScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#namespaceRest}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceRest(WebIDLParser.NamespaceRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#namespaceRest}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceRest(WebIDLParser.NamespaceRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(WebIDLParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(WebIDLParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(WebIDLParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(WebIDLParser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(WebIDLParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(WebIDLParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(WebIDLParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(WebIDLParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#callbackOrInterface}.
	 * @param ctx the parse tree
	 */
	void enterCallbackOrInterface(WebIDLParser.CallbackOrInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#callbackOrInterface}.
	 * @param ctx the parse tree
	 */
	void exitCallbackOrInterface(WebIDLParser.CallbackOrInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#exception_}.
	 * @param ctx the parse tree
	 */
	void enterException_(WebIDLParser.Exception_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#exception_}.
	 * @param ctx the parse tree
	 */
	void exitException_(WebIDLParser.Exception_Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#callbackRestOrInterface}.
	 * @param ctx the parse tree
	 */
	void enterCallbackRestOrInterface(WebIDLParser.CallbackRestOrInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#callbackRestOrInterface}.
	 * @param ctx the parse tree
	 */
	void exitCallbackRestOrInterface(WebIDLParser.CallbackRestOrInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#interface_}.
	 * @param ctx the parse tree
	 */
	void enterInterface_(WebIDLParser.Interface_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#interface_}.
	 * @param ctx the parse tree
	 */
	void exitInterface_(WebIDLParser.Interface_Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#partial}.
	 * @param ctx the parse tree
	 */
	void enterPartial(WebIDLParser.PartialContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#partial}.
	 * @param ctx the parse tree
	 */
	void exitPartial(WebIDLParser.PartialContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#partialDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartialDefinition(WebIDLParser.PartialDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#partialDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartialDefinition(WebIDLParser.PartialDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#partialInterface}.
	 * @param ctx the parse tree
	 */
	void enterPartialInterface(WebIDLParser.PartialInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#partialInterface}.
	 * @param ctx the parse tree
	 */
	void exitPartialInterface(WebIDLParser.PartialInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#interfaceMembers}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMembers(WebIDLParser.InterfaceMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#interfaceMembers}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMembers(WebIDLParser.InterfaceMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMember(WebIDLParser.InterfaceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMember(WebIDLParser.InterfaceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void enterDictionary(WebIDLParser.DictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void exitDictionary(WebIDLParser.DictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryMembers(WebIDLParser.DictionaryMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#dictionaryMembers}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryMembers(WebIDLParser.DictionaryMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#dictionaryMember}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryMember(WebIDLParser.DictionaryMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#dictionaryMember}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryMember(WebIDLParser.DictionaryMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#required}.
	 * @param ctx the parse tree
	 */
	void enterRequired(WebIDLParser.RequiredContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#required}.
	 * @param ctx the parse tree
	 */
	void exitRequired(WebIDLParser.RequiredContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#partialDictionary}.
	 * @param ctx the parse tree
	 */
	void enterPartialDictionary(WebIDLParser.PartialDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#partialDictionary}.
	 * @param ctx the parse tree
	 */
	void exitPartialDictionary(WebIDLParser.PartialDictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#default_}.
	 * @param ctx the parse tree
	 */
	void enterDefault_(WebIDLParser.Default_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#default_}.
	 * @param ctx the parse tree
	 */
	void exitDefault_(WebIDLParser.Default_Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(WebIDLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(WebIDLParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(WebIDLParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(WebIDLParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#enum_}.
	 * @param ctx the parse tree
	 */
	void enterEnum_(WebIDLParser.Enum_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#enum_}.
	 * @param ctx the parse tree
	 */
	void exitEnum_(WebIDLParser.Enum_Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#enumValueList}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueList(WebIDLParser.EnumValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#enumValueList}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueList(WebIDLParser.EnumValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#enumValueListComma}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueListComma(WebIDLParser.EnumValueListCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#enumValueListComma}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueListComma(WebIDLParser.EnumValueListCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#enumValueListString}.
	 * @param ctx the parse tree
	 */
	void enterEnumValueListString(WebIDLParser.EnumValueListStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#enumValueListString}.
	 * @param ctx the parse tree
	 */
	void exitEnumValueListString(WebIDLParser.EnumValueListStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#callbackRest}.
	 * @param ctx the parse tree
	 */
	void enterCallbackRest(WebIDLParser.CallbackRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#callbackRest}.
	 * @param ctx the parse tree
	 */
	void exitCallbackRest(WebIDLParser.CallbackRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(WebIDLParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(WebIDLParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStatement(WebIDLParser.ImplementsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#implementsStatement}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStatement(WebIDLParser.ImplementsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#const_}.
	 * @param ctx the parse tree
	 */
	void enterConst_(WebIDLParser.Const_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#const_}.
	 * @param ctx the parse tree
	 */
	void exitConst_(WebIDLParser.Const_Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#constValue}.
	 * @param ctx the parse tree
	 */
	void enterConstValue(WebIDLParser.ConstValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#constValue}.
	 * @param ctx the parse tree
	 */
	void exitConstValue(WebIDLParser.ConstValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(WebIDLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(WebIDLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(WebIDLParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(WebIDLParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializer}.
	 * @param ctx the parse tree
	 */
	void enterSerializer(WebIDLParser.SerializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializer}.
	 * @param ctx the parse tree
	 */
	void exitSerializer(WebIDLParser.SerializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializerRest}.
	 * @param ctx the parse tree
	 */
	void enterSerializerRest(WebIDLParser.SerializerRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializerRest}.
	 * @param ctx the parse tree
	 */
	void exitSerializerRest(WebIDLParser.SerializerRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializationPattern}.
	 * @param ctx the parse tree
	 */
	void enterSerializationPattern(WebIDLParser.SerializationPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializationPattern}.
	 * @param ctx the parse tree
	 */
	void exitSerializationPattern(WebIDLParser.SerializationPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializationPatternMap}.
	 * @param ctx the parse tree
	 */
	void enterSerializationPatternMap(WebIDLParser.SerializationPatternMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializationPatternMap}.
	 * @param ctx the parse tree
	 */
	void exitSerializationPatternMap(WebIDLParser.SerializationPatternMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#serializationPatternList}.
	 * @param ctx the parse tree
	 */
	void enterSerializationPatternList(WebIDLParser.SerializationPatternListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#serializationPatternList}.
	 * @param ctx the parse tree
	 */
	void exitSerializationPatternList(WebIDLParser.SerializationPatternListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#stringifier}.
	 * @param ctx the parse tree
	 */
	void enterStringifier(WebIDLParser.StringifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#stringifier}.
	 * @param ctx the parse tree
	 */
	void exitStringifier(WebIDLParser.StringifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#stringifierRest}.
	 * @param ctx the parse tree
	 */
	void enterStringifierRest(WebIDLParser.StringifierRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#stringifierRest}.
	 * @param ctx the parse tree
	 */
	void exitStringifierRest(WebIDLParser.StringifierRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#staticMember}.
	 * @param ctx the parse tree
	 */
	void enterStaticMember(WebIDLParser.StaticMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#staticMember}.
	 * @param ctx the parse tree
	 */
	void exitStaticMember(WebIDLParser.StaticMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#staticMemberRest}.
	 * @param ctx the parse tree
	 */
	void enterStaticMemberRest(WebIDLParser.StaticMemberRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#staticMemberRest}.
	 * @param ctx the parse tree
	 */
	void exitStaticMemberRest(WebIDLParser.StaticMemberRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#readonlyMember}.
	 * @param ctx the parse tree
	 */
	void enterReadonlyMember(WebIDLParser.ReadonlyMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#readonlyMember}.
	 * @param ctx the parse tree
	 */
	void exitReadonlyMember(WebIDLParser.ReadonlyMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#readonlyMemberRest}.
	 * @param ctx the parse tree
	 */
	void enterReadonlyMemberRest(WebIDLParser.ReadonlyMemberRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#readonlyMemberRest}.
	 * @param ctx the parse tree
	 */
	void exitReadonlyMemberRest(WebIDLParser.ReadonlyMemberRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#readWriteAttribute}.
	 * @param ctx the parse tree
	 */
	void enterReadWriteAttribute(WebIDLParser.ReadWriteAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#readWriteAttribute}.
	 * @param ctx the parse tree
	 */
	void exitReadWriteAttribute(WebIDLParser.ReadWriteAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#attributeRest}.
	 * @param ctx the parse tree
	 */
	void enterAttributeRest(WebIDLParser.AttributeRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#attributeRest}.
	 * @param ctx the parse tree
	 */
	void exitAttributeRest(WebIDLParser.AttributeRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#attributeAnnotations}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAnnotations(WebIDLParser.AttributeAnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#attributeAnnotations}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAnnotations(WebIDLParser.AttributeAnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#inherit}.
	 * @param ctx the parse tree
	 */
	void enterInherit(WebIDLParser.InheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#inherit}.
	 * @param ctx the parse tree
	 */
	void exitInherit(WebIDLParser.InheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#readOnly}.
	 * @param ctx the parse tree
	 */
	void enterReadOnly(WebIDLParser.ReadOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#readOnly}.
	 * @param ctx the parse tree
	 */
	void exitReadOnly(WebIDLParser.ReadOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(WebIDLParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(WebIDLParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#specialOperation}.
	 * @param ctx the parse tree
	 */
	void enterSpecialOperation(WebIDLParser.SpecialOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#specialOperation}.
	 * @param ctx the parse tree
	 */
	void exitSpecialOperation(WebIDLParser.SpecialOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#specials}.
	 * @param ctx the parse tree
	 */
	void enterSpecials(WebIDLParser.SpecialsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#specials}.
	 * @param ctx the parse tree
	 */
	void exitSpecials(WebIDLParser.SpecialsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(WebIDLParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(WebIDLParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#operationRest}.
	 * @param ctx the parse tree
	 */
	void enterOperationRest(WebIDLParser.OperationRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#operationRest}.
	 * @param ctx the parse tree
	 */
	void exitOperationRest(WebIDLParser.OperationRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOptionalIdentifier(WebIDLParser.OptionalIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#optionalIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOptionalIdentifier(WebIDLParser.OptionalIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(WebIDLParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(WebIDLParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(WebIDLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(WebIDLParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(WebIDLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(WebIDLParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#optionalOrRequiredArgument}.
	 * @param ctx the parse tree
	 */
	void enterOptionalOrRequiredArgument(WebIDLParser.OptionalOrRequiredArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#optionalOrRequiredArgument}.
	 * @param ctx the parse tree
	 */
	void exitOptionalOrRequiredArgument(WebIDLParser.OptionalOrRequiredArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(WebIDLParser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(WebIDLParser.ArgumentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void enterEllipsis(WebIDLParser.EllipsisContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#ellipsis}.
	 * @param ctx the parse tree
	 */
	void exitEllipsis(WebIDLParser.EllipsisContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#iterable}.
	 * @param ctx the parse tree
	 */
	void enterIterable(WebIDLParser.IterableContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#iterable}.
	 * @param ctx the parse tree
	 */
	void exitIterable(WebIDLParser.IterableContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#optionalType}.
	 * @param ctx the parse tree
	 */
	void enterOptionalType(WebIDLParser.OptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#optionalType}.
	 * @param ctx the parse tree
	 */
	void exitOptionalType(WebIDLParser.OptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#readWriteMaplike}.
	 * @param ctx the parse tree
	 */
	void enterReadWriteMaplike(WebIDLParser.ReadWriteMaplikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#readWriteMaplike}.
	 * @param ctx the parse tree
	 */
	void exitReadWriteMaplike(WebIDLParser.ReadWriteMaplikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#readWriteSetlike}.
	 * @param ctx the parse tree
	 */
	void enterReadWriteSetlike(WebIDLParser.ReadWriteSetlikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#readWriteSetlike}.
	 * @param ctx the parse tree
	 */
	void exitReadWriteSetlike(WebIDLParser.ReadWriteSetlikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#maplikeRest}.
	 * @param ctx the parse tree
	 */
	void enterMaplikeRest(WebIDLParser.MaplikeRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#maplikeRest}.
	 * @param ctx the parse tree
	 */
	void exitMaplikeRest(WebIDLParser.MaplikeRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#setlikeRest}.
	 * @param ctx the parse tree
	 */
	void enterSetlikeRest(WebIDLParser.SetlikeRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#setlikeRest}.
	 * @param ctx the parse tree
	 */
	void exitSetlikeRest(WebIDLParser.SetlikeRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeList(WebIDLParser.ExtendedAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeList(WebIDLParser.ExtendedAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributes}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributes(WebIDLParser.ExtendedAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributes}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributes(WebIDLParser.ExtendedAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttribute}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttribute(WebIDLParser.ExtendedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttribute}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttribute(WebIDLParser.ExtendedAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeNamePart}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeNamePart(WebIDLParser.ExtendedAttributeNamePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeNamePart}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeNamePart(WebIDLParser.ExtendedAttributeNamePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNameKeyword(WebIDLParser.ArgumentNameKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#argumentNameKeyword}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNameKeyword(WebIDLParser.ArgumentNameKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WebIDLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WebIDLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#singleType}.
	 * @param ctx the parse tree
	 */
	void enterSingleType(WebIDLParser.SingleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#singleType}.
	 * @param ctx the parse tree
	 */
	void exitSingleType(WebIDLParser.SingleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(WebIDLParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(WebIDLParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unionMemberType}.
	 * @param ctx the parse tree
	 */
	void enterUnionMemberType(WebIDLParser.UnionMemberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unionMemberType}.
	 * @param ctx the parse tree
	 */
	void exitUnionMemberType(WebIDLParser.UnionMemberTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void enterUnionMemberTypes(WebIDLParser.UnionMemberTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unionMemberTypes}.
	 * @param ctx the parse tree
	 */
	void exitUnionMemberTypes(WebIDLParser.UnionMemberTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#nonAnyType}.
	 * @param ctx the parse tree
	 */
	void enterNonAnyType(WebIDLParser.NonAnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#nonAnyType}.
	 * @param ctx the parse tree
	 */
	void exitNonAnyType(WebIDLParser.NonAnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#constType}.
	 * @param ctx the parse tree
	 */
	void enterConstType(WebIDLParser.ConstTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#constType}.
	 * @param ctx the parse tree
	 */
	void exitConstType(WebIDLParser.ConstTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(WebIDLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(WebIDLParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unrestrictedFloatType}.
	 * @param ctx the parse tree
	 */
	void enterUnrestrictedFloatType(WebIDLParser.UnrestrictedFloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unrestrictedFloatType}.
	 * @param ctx the parse tree
	 */
	void exitUnrestrictedFloatType(WebIDLParser.UnrestrictedFloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#floatType}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(WebIDLParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#floatType}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(WebIDLParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedIntegerType(WebIDLParser.UnsignedIntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedIntegerType(WebIDLParser.UnsignedIntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#integerType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(WebIDLParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#integerType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(WebIDLParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#sequenceType}.
	 * @param ctx the parse tree
	 */
	void enterSequenceType(WebIDLParser.SequenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#sequenceType}.
	 * @param ctx the parse tree
	 */
	void exitSequenceType(WebIDLParser.SequenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#promiseType}.
	 * @param ctx the parse tree
	 */
	void enterPromiseType(WebIDLParser.PromiseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#promiseType}.
	 * @param ctx the parse tree
	 */
	void exitPromiseType(WebIDLParser.PromiseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffix(WebIDLParser.TypeSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#typeSuffix}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffix(WebIDLParser.TypeSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeSuffixStartingWithArray(WebIDLParser.TypeSuffixStartingWithArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#typeSuffixStartingWithArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeSuffixStartingWithArray(WebIDLParser.TypeSuffixStartingWithArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#null_}.
	 * @param ctx the parse tree
	 */
	void enterNull_(WebIDLParser.Null_Context ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#null_}.
	 * @param ctx the parse tree
	 */
	void exitNull_(WebIDLParser.Null_Context ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(WebIDLParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(WebIDLParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(WebIDLParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(WebIDLParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(WebIDLParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(WebIDLParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeNoArgs}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeNoArgs(WebIDLParser.ExtendedAttributeNoArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeNoArgs}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeNoArgs(WebIDLParser.ExtendedAttributeNoArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeArgList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeArgList(WebIDLParser.ExtendedAttributeArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeArgList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeArgList(WebIDLParser.ExtendedAttributeArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeIdent}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeIdent(WebIDLParser.ExtendedAttributeIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeIdent}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeIdent(WebIDLParser.ExtendedAttributeIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeIdentList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeIdentList(WebIDLParser.ExtendedAttributeIdentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeIdentList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeIdentList(WebIDLParser.ExtendedAttributeIdentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebIDLParser#extendedAttributeNamedArgList}.
	 * @param ctx the parse tree
	 */
	void enterExtendedAttributeNamedArgList(WebIDLParser.ExtendedAttributeNamedArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebIDLParser#extendedAttributeNamedArgList}.
	 * @param ctx the parse tree
	 */
	void exitExtendedAttributeNamedArgList(WebIDLParser.ExtendedAttributeNamedArgListContext ctx);
}