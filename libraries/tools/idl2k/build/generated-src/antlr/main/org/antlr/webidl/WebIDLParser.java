// Generated from org/antlr/webidl/WebIDL.g4 by ANTLR 4.7.1
package org.antlr.webidl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WebIDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, INTEGER_WEBIDL=82, FLOAT_WEBIDL=83, IDENTIFIER_WEBIDL=84, STRING_WEBIDL=85, 
		WHITESPACE_WEBIDL=86, COMMENT_WEBIDL=87, OTHER_WEBIDL=88;
	public static final int
		RULE_webIDL = 0, RULE_namespaceScope = 1, RULE_namespaceRest = 2, RULE_namespace = 3, 
		RULE_definitions = 4, RULE_definition = 5, RULE_module = 6, RULE_callbackOrInterface = 7, 
		RULE_exception_ = 8, RULE_callbackRestOrInterface = 9, RULE_interface_ = 10, 
		RULE_partial = 11, RULE_partialDefinition = 12, RULE_partialInterface = 13, 
		RULE_interfaceMembers = 14, RULE_interfaceMember = 15, RULE_dictionary = 16, 
		RULE_dictionaryMembers = 17, RULE_dictionaryMember = 18, RULE_required = 19, 
		RULE_partialDictionary = 20, RULE_default_ = 21, RULE_defaultValue = 22, 
		RULE_inheritance = 23, RULE_enum_ = 24, RULE_enumValueList = 25, RULE_enumValueListComma = 26, 
		RULE_enumValueListString = 27, RULE_callbackRest = 28, RULE_typedef = 29, 
		RULE_implementsStatement = 30, RULE_const_ = 31, RULE_constValue = 32, 
		RULE_booleanLiteral = 33, RULE_floatLiteral = 34, RULE_serializer = 35, 
		RULE_serializerRest = 36, RULE_serializationPattern = 37, RULE_serializationPatternMap = 38, 
		RULE_serializationPatternList = 39, RULE_stringifier = 40, RULE_stringifierRest = 41, 
		RULE_staticMember = 42, RULE_staticMemberRest = 43, RULE_readonlyMember = 44, 
		RULE_readonlyMemberRest = 45, RULE_readWriteAttribute = 46, RULE_attributeRest = 47, 
		RULE_attributeAnnotations = 48, RULE_inherit = 49, RULE_readOnly = 50, 
		RULE_operation = 51, RULE_specialOperation = 52, RULE_specials = 53, RULE_special = 54, 
		RULE_operationRest = 55, RULE_optionalIdentifier = 56, RULE_argumentList = 57, 
		RULE_arguments = 58, RULE_argument = 59, RULE_optionalOrRequiredArgument = 60, 
		RULE_argumentName = 61, RULE_ellipsis = 62, RULE_iterable = 63, RULE_optionalType = 64, 
		RULE_readWriteMaplike = 65, RULE_readWriteSetlike = 66, RULE_maplikeRest = 67, 
		RULE_setlikeRest = 68, RULE_extendedAttributeList = 69, RULE_extendedAttributes = 70, 
		RULE_extendedAttribute = 71, RULE_extendedAttributeNamePart = 72, RULE_argumentNameKeyword = 73, 
		RULE_type = 74, RULE_singleType = 75, RULE_unionType = 76, RULE_unionMemberType = 77, 
		RULE_unionMemberTypes = 78, RULE_nonAnyType = 79, RULE_constType = 80, 
		RULE_primitiveType = 81, RULE_unrestrictedFloatType = 82, RULE_floatType = 83, 
		RULE_unsignedIntegerType = 84, RULE_integerType = 85, RULE_sequenceType = 86, 
		RULE_promiseType = 87, RULE_typeSuffix = 88, RULE_typeSuffixStartingWithArray = 89, 
		RULE_null_ = 90, RULE_returnType = 91, RULE_identifierList = 92, RULE_identifiers = 93, 
		RULE_extendedAttributeNoArgs = 94, RULE_extendedAttributeArgList = 95, 
		RULE_extendedAttributeIdent = 96, RULE_extendedAttributeIdentList = 97, 
		RULE_extendedAttributeNamedArgList = 98;
	public static final String[] ruleNames = {
		"webIDL", "namespaceScope", "namespaceRest", "namespace", "definitions", 
		"definition", "module", "callbackOrInterface", "exception_", "callbackRestOrInterface", 
		"interface_", "partial", "partialDefinition", "partialInterface", "interfaceMembers", 
		"interfaceMember", "dictionary", "dictionaryMembers", "dictionaryMember", 
		"required", "partialDictionary", "default_", "defaultValue", "inheritance", 
		"enum_", "enumValueList", "enumValueListComma", "enumValueListString", 
		"callbackRest", "typedef", "implementsStatement", "const_", "constValue", 
		"booleanLiteral", "floatLiteral", "serializer", "serializerRest", "serializationPattern", 
		"serializationPatternMap", "serializationPatternList", "stringifier", 
		"stringifierRest", "staticMember", "staticMemberRest", "readonlyMember", 
		"readonlyMemberRest", "readWriteAttribute", "attributeRest", "attributeAnnotations", 
		"inherit", "readOnly", "operation", "specialOperation", "specials", "special", 
		"operationRest", "optionalIdentifier", "argumentList", "arguments", "argument", 
		"optionalOrRequiredArgument", "argumentName", "ellipsis", "iterable", 
		"optionalType", "readWriteMaplike", "readWriteSetlike", "maplikeRest", 
		"setlikeRest", "extendedAttributeList", "extendedAttributes", "extendedAttribute", 
		"extendedAttributeNamePart", "argumentNameKeyword", "type", "singleType", 
		"unionType", "unionMemberType", "unionMemberTypes", "nonAnyType", "constType", 
		"primitiveType", "unrestrictedFloatType", "floatType", "unsignedIntegerType", 
		"integerType", "sequenceType", "promiseType", "typeSuffix", "typeSuffixStartingWithArray", 
		"null_", "returnType", "identifierList", "identifiers", "extendedAttributeNoArgs", 
		"extendedAttributeArgList", "extendedAttributeIdent", "extendedAttributeIdentList", 
		"extendedAttributeNamedArgList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'cpp'", "'java'", "'py'", "'perl'", "'rb'", "'cocoa'", "'csharp'", 
		"'.'", "'namespace'", "';'", "'module'", "'{'", "'}'", "'callback'", "'exception'", 
		"'interface'", "'partial'", "'dictionary'", "'required'", "'='", "'['", 
		"']'", "':'", "','", "'enum'", "'('", "')'", "'typedef'", "'implements'", 
		"'const'", "'null'", "'true'", "'false'", "'-Infinity'", "'Infinity'", 
		"'NaN'", "'serializer'", "'getter'", "'inherit'", "'stringifier'", "'static'", 
		"'readonly'", "'attribute'", "'setter'", "'creator'", "'deleter'", "'legacycaller'", 
		"'optional'", "'in'", "'out'", "'...'", "'iterable'", "'<'", "'>'", "'legacyiterable'", 
		"'maplike'", "'setlike'", "'unrestricted'", "'any'", "'or'", "'ByteString'", 
		"'DOMString'", "'USVString'", "'object'", "'Date'", "'RegExp'", "'DOMException'", 
		"'boolean'", "'byte'", "'octet'", "'float'", "'double'", "'unsigned'", 
		"'short'", "'long'", "'sequence'", "'FrozenArray'", "'Promise'", "'?'", 
		"'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "INTEGER_WEBIDL", 
		"FLOAT_WEBIDL", "IDENTIFIER_WEBIDL", "STRING_WEBIDL", "WHITESPACE_WEBIDL", 
		"COMMENT_WEBIDL", "OTHER_WEBIDL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WebIDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WebIDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WebIDLContext extends ParserRuleContext {
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WebIDLParser.EOF, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public WebIDLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webIDL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterWebIDL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitWebIDL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitWebIDL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebIDLContext webIDL() throws RecognitionException {
		WebIDLContext _localctx = new WebIDLContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_webIDL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(198);
				namespace();
				}
			}

			setState(201);
			definitions();
			setState(202);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceScopeContext extends ParserRuleContext {
		public NamespaceScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterNamespaceScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitNamespaceScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitNamespaceScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceScopeContext namespaceScope() throws RecognitionException {
		NamespaceScopeContext _localctx = new NamespaceScopeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespaceScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceRestContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public NamespaceRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterNamespaceRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitNamespaceRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitNamespaceRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceRestContext namespaceRest() throws RecognitionException {
		NamespaceRestContext _localctx = new NamespaceRestContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespaceRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IDENTIFIER_WEBIDL);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(207);
				match(T__8);
				setState(208);
				match(IDENTIFIER_WEBIDL);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public NamespaceRestContext namespaceRest() {
			return getRuleContext(NamespaceRestContext.class,0);
		}
		public NamespaceScopeContext namespaceScope() {
			return getRuleContext(NamespaceScopeContext.class,0);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__9);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(215);
				namespaceScope();
				}
			}

			setState(218);
			namespaceRest();
			setState(219);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionsContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definitions);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__25:
			case T__28:
			case T__30:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				extendedAttributeList();
				setState(222);
				definition();
				setState(223);
				definitions();
				}
				break;
			case EOF:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public CallbackOrInterfaceContext callbackOrInterface() {
			return getRuleContext(CallbackOrInterfaceContext.class,0);
		}
		public PartialContext partial() {
			return getRuleContext(PartialContext.class,0);
		}
		public DictionaryContext dictionary() {
			return getRuleContext(DictionaryContext.class,0);
		}
		public Enum_Context enum_() {
			return getRuleContext(Enum_Context.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Exception_Context exception_() {
			return getRuleContext(Exception_Context.class,0);
		}
		public Const_Context const_() {
			return getRuleContext(Const_Context.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public ImplementsStatementContext implementsStatement() {
			return getRuleContext(ImplementsStatementContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				callbackOrInterface();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				partial();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				dictionary();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				enum_();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				typedef();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				exception_();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				const_();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				module();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				implementsStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__11);
			setState(240);
			match(IDENTIFIER_WEBIDL);
			setState(241);
			match(T__12);
			setState(242);
			definitions();
			setState(243);
			match(T__13);
			setState(244);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallbackOrInterfaceContext extends ParserRuleContext {
		public CallbackRestOrInterfaceContext callbackRestOrInterface() {
			return getRuleContext(CallbackRestOrInterfaceContext.class,0);
		}
		public Interface_Context interface_() {
			return getRuleContext(Interface_Context.class,0);
		}
		public CallbackOrInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackOrInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterCallbackOrInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitCallbackOrInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitCallbackOrInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallbackOrInterfaceContext callbackOrInterface() throws RecognitionException {
		CallbackOrInterfaceContext _localctx = new CallbackOrInterfaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callbackOrInterface);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__14);
				setState(247);
				callbackRestOrInterface();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				interface_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public Exception_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterException_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitException_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitException_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_Context exception_() throws RecognitionException {
		Exception_Context _localctx = new Exception_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_exception_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__15);
			setState(252);
			match(IDENTIFIER_WEBIDL);
			setState(253);
			inheritance();
			setState(254);
			match(T__12);
			setState(255);
			dictionaryMembers();
			setState(256);
			match(T__13);
			setState(257);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallbackRestOrInterfaceContext extends ParserRuleContext {
		public CallbackRestContext callbackRest() {
			return getRuleContext(CallbackRestContext.class,0);
		}
		public Interface_Context interface_() {
			return getRuleContext(Interface_Context.class,0);
		}
		public CallbackRestOrInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackRestOrInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterCallbackRestOrInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitCallbackRestOrInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitCallbackRestOrInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallbackRestOrInterfaceContext callbackRestOrInterface() throws RecognitionException {
		CallbackRestOrInterfaceContext _localctx = new CallbackRestOrInterfaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callbackRestOrInterface);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				callbackRest();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				interface_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public Interface_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInterface_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInterface_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInterface_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_Context interface_() throws RecognitionException {
		Interface_Context _localctx = new Interface_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_interface_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__16);
			setState(264);
			match(IDENTIFIER_WEBIDL);
			setState(265);
			inheritance();
			setState(266);
			match(T__12);
			setState(267);
			interfaceMembers();
			setState(268);
			match(T__13);
			setState(269);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialContext extends ParserRuleContext {
		public PartialDefinitionContext partialDefinition() {
			return getRuleContext(PartialDefinitionContext.class,0);
		}
		public PartialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPartial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialContext partial() throws RecognitionException {
		PartialContext _localctx = new PartialContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_partial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__17);
			setState(272);
			partialDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialDefinitionContext extends ParserRuleContext {
		public PartialInterfaceContext partialInterface() {
			return getRuleContext(PartialInterfaceContext.class,0);
		}
		public PartialDictionaryContext partialDictionary() {
			return getRuleContext(PartialDictionaryContext.class,0);
		}
		public PartialDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartialDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartialDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPartialDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialDefinitionContext partialDefinition() throws RecognitionException {
		PartialDefinitionContext _localctx = new PartialDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_partialDefinition);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				partialInterface();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				partialDictionary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialInterfaceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public PartialInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartialInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartialInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPartialInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialInterfaceContext partialInterface() throws RecognitionException {
		PartialInterfaceContext _localctx = new PartialInterfaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_partialInterface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__16);
			setState(279);
			match(IDENTIFIER_WEBIDL);
			setState(280);
			match(T__12);
			setState(281);
			interfaceMembers();
			setState(282);
			match(T__13);
			setState(283);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMembersContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public InterfaceMemberContext interfaceMember() {
			return getRuleContext(InterfaceMemberContext.class,0);
		}
		public InterfaceMembersContext interfaceMembers() {
			return getRuleContext(InterfaceMembersContext.class,0);
		}
		public InterfaceMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInterfaceMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInterfaceMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInterfaceMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMembersContext interfaceMembers() throws RecognitionException {
		InterfaceMembersContext _localctx = new InterfaceMembersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfaceMembers);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__26:
			case T__28:
			case T__30:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__52:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				extendedAttributeList();
				setState(286);
				interfaceMember();
				setState(287);
				interfaceMembers();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberContext extends ParserRuleContext {
		public Const_Context const_() {
			return getRuleContext(Const_Context.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public SerializerContext serializer() {
			return getRuleContext(SerializerContext.class,0);
		}
		public StringifierContext stringifier() {
			return getRuleContext(StringifierContext.class,0);
		}
		public StaticMemberContext staticMember() {
			return getRuleContext(StaticMemberContext.class,0);
		}
		public IterableContext iterable() {
			return getRuleContext(IterableContext.class,0);
		}
		public ReadonlyMemberContext readonlyMember() {
			return getRuleContext(ReadonlyMemberContext.class,0);
		}
		public ReadWriteAttributeContext readWriteAttribute() {
			return getRuleContext(ReadWriteAttributeContext.class,0);
		}
		public ReadWriteMaplikeContext readWriteMaplike() {
			return getRuleContext(ReadWriteMaplikeContext.class,0);
		}
		public ReadWriteSetlikeContext readWriteSetlike() {
			return getRuleContext(ReadWriteSetlikeContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInterfaceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInterfaceMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInterfaceMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceMember);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				const_();
				}
				break;
			case T__26:
			case T__38:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				operation();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				serializer();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				stringifier();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				staticMember();
				}
				break;
			case T__52:
			case T__55:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				iterable();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 7);
				{
				setState(298);
				readonlyMember();
				}
				break;
			case T__39:
			case T__43:
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				readWriteAttribute();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 9);
				{
				setState(300);
				readWriteMaplike();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 10);
				{
				setState(301);
				readWriteSetlike();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 11);
				{
				setState(302);
				typedef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public DictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDictionary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDictionary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryContext dictionary() throws RecognitionException {
		DictionaryContext _localctx = new DictionaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__18);
			setState(306);
			match(IDENTIFIER_WEBIDL);
			setState(307);
			inheritance();
			setState(308);
			match(T__12);
			setState(309);
			dictionaryMembers();
			setState(310);
			match(T__13);
			setState(311);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryMembersContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public DictionaryMemberContext dictionaryMember() {
			return getRuleContext(DictionaryMemberContext.class,0);
		}
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public DictionaryMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDictionaryMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDictionaryMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDictionaryMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryMembersContext dictionaryMembers() throws RecognitionException {
		DictionaryMembersContext _localctx = new DictionaryMembersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dictionaryMembers);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__21:
			case T__26:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				extendedAttributeList();
				setState(314);
				dictionaryMember();
				setState(315);
				dictionaryMembers();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryMemberContext extends ParserRuleContext {
		public RequiredContext required() {
			return getRuleContext(RequiredContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public Default_Context default_() {
			return getRuleContext(Default_Context.class,0);
		}
		public DictionaryMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDictionaryMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDictionaryMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDictionaryMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryMemberContext dictionaryMember() throws RecognitionException {
		DictionaryMemberContext _localctx = new DictionaryMemberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dictionaryMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			required();
			setState(321);
			type();
			setState(322);
			match(IDENTIFIER_WEBIDL);
			setState(323);
			default_();
			setState(324);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredContext extends ParserRuleContext {
		public RequiredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterRequired(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitRequired(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitRequired(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequiredContext required() throws RecognitionException {
		RequiredContext _localctx = new RequiredContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_required);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(T__19);
				}
				break;
			case T__26:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialDictionaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public DictionaryMembersContext dictionaryMembers() {
			return getRuleContext(DictionaryMembersContext.class,0);
		}
		public PartialDictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialDictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPartialDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPartialDictionary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPartialDictionary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialDictionaryContext partialDictionary() throws RecognitionException {
		PartialDictionaryContext _localctx = new PartialDictionaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partialDictionary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__18);
			setState(331);
			match(IDENTIFIER_WEBIDL);
			setState(332);
			match(T__12);
			setState(333);
			dictionaryMembers();
			setState(334);
			match(T__13);
			setState(335);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_Context extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public Default_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefault_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefault_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDefault_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_Context default_() throws RecognitionException {
		Default_Context _localctx = new Default_Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_default_);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(T__20);
				setState(338);
				defaultValue();
				}
				break;
			case T__10:
			case T__24:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defaultValue);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case INTEGER_WEBIDL:
			case FLOAT_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				constValue();
				}
				break;
			case STRING_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(STRING_WEBIDL);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(T__21);
				setState(345);
				match(T__22);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInheritance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inheritance);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(T__23);
				setState(349);
				match(IDENTIFIER_WEBIDL);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(350);
					match(T__24);
					setState(351);
					match(IDENTIFIER_WEBIDL);
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public EnumValueListContext enumValueList() {
			return getRuleContext(EnumValueListContext.class,0);
		}
		public Enum_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnum_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnum_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEnum_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_Context enum_() throws RecognitionException {
		Enum_Context _localctx = new Enum_Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_enum_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__25);
			setState(361);
			match(IDENTIFIER_WEBIDL);
			setState(362);
			match(T__12);
			setState(363);
			enumValueList();
			setState(364);
			match(T__13);
			setState(365);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueListContext extends ParserRuleContext {
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public EnumValueListCommaContext enumValueListComma() {
			return getRuleContext(EnumValueListCommaContext.class,0);
		}
		public EnumValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnumValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnumValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEnumValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueListContext enumValueList() throws RecognitionException {
		EnumValueListContext _localctx = new EnumValueListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumValueList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(STRING_WEBIDL);
			setState(368);
			enumValueListComma();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueListCommaContext extends ParserRuleContext {
		public EnumValueListStringContext enumValueListString() {
			return getRuleContext(EnumValueListStringContext.class,0);
		}
		public EnumValueListCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueListComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnumValueListComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnumValueListComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEnumValueListComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueListCommaContext enumValueListComma() throws RecognitionException {
		EnumValueListCommaContext _localctx = new EnumValueListCommaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumValueListComma);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(T__24);
				setState(371);
				enumValueListString();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueListStringContext extends ParserRuleContext {
		public TerminalNode STRING_WEBIDL() { return getToken(WebIDLParser.STRING_WEBIDL, 0); }
		public EnumValueListCommaContext enumValueListComma() {
			return getRuleContext(EnumValueListCommaContext.class,0);
		}
		public EnumValueListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValueListString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEnumValueListString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEnumValueListString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEnumValueListString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueListStringContext enumValueListString() throws RecognitionException {
		EnumValueListStringContext _localctx = new EnumValueListStringContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumValueListString);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(STRING_WEBIDL);
				setState(376);
				enumValueListComma();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallbackRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallbackRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callbackRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterCallbackRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitCallbackRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitCallbackRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallbackRestContext callbackRest() throws RecognitionException {
		CallbackRestContext _localctx = new CallbackRestContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_callbackRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(IDENTIFIER_WEBIDL);
			setState(381);
			match(T__20);
			setState(382);
			returnType();
			setState(383);
			match(T__26);
			setState(384);
			argumentList();
			setState(385);
			match(T__27);
			setState(386);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitTypedef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitTypedef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(T__28);
			setState(389);
			type();
			setState(390);
			match(IDENTIFIER_WEBIDL);
			setState(391);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsStatementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public ImplementsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterImplementsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitImplementsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitImplementsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsStatementContext implementsStatement() throws RecognitionException {
		ImplementsStatementContext _localctx = new ImplementsStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_implementsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(IDENTIFIER_WEBIDL);
			setState(394);
			match(T__29);
			setState(395);
			match(IDENTIFIER_WEBIDL);
			setState(396);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_Context extends ParserRuleContext {
		public ConstTypeContext constType() {
			return getRuleContext(ConstTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public Const_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterConst_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitConst_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitConst_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_Context const_() throws RecognitionException {
		Const_Context _localctx = new Const_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_const_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__30);
			setState(399);
			constType();
			setState(400);
			match(IDENTIFIER_WEBIDL);
			setState(401);
			match(T__20);
			setState(402);
			constValue();
			setState(403);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstValueContext extends ParserRuleContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode INTEGER_WEBIDL() { return getToken(WebIDLParser.INTEGER_WEBIDL, 0); }
		public ConstValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterConstValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitConstValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitConstValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstValueContext constValue() throws RecognitionException {
		ConstValueContext _localctx = new ConstValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constValue);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				booleanLiteral();
				}
				break;
			case T__34:
			case T__35:
			case T__36:
			case FLOAT_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				floatLiteral();
				}
				break;
			case INTEGER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(INTEGER_WEBIDL);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(T__31);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__33) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_WEBIDL() { return getToken(WebIDLParser.FLOAT_WEBIDL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (T__34 - 35)) | (1L << (T__35 - 35)) | (1L << (T__36 - 35)) | (1L << (FLOAT_WEBIDL - 35)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerializerContext extends ParserRuleContext {
		public SerializerRestContext serializerRest() {
			return getRuleContext(SerializerRestContext.class,0);
		}
		public SerializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializerContext serializer() throws RecognitionException {
		SerializerContext _localctx = new SerializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_serializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__37);
			setState(416);
			serializerRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerializerRestContext extends ParserRuleContext {
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public SerializationPatternContext serializationPattern() {
			return getRuleContext(SerializationPatternContext.class,0);
		}
		public SerializerRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializerRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializerRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializerRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializerRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializerRestContext serializerRest() throws RecognitionException {
		SerializerRestContext _localctx = new SerializerRestContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_serializerRest);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				operationRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(T__20);
				setState(420);
				serializationPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerializationPatternContext extends ParserRuleContext {
		public SerializationPatternMapContext serializationPatternMap() {
			return getRuleContext(SerializationPatternMapContext.class,0);
		}
		public SerializationPatternListContext serializationPatternList() {
			return getRuleContext(SerializationPatternListContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public SerializationPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializationPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializationPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializationPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializationPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializationPatternContext serializationPattern() throws RecognitionException {
		SerializationPatternContext _localctx = new SerializationPatternContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_serializationPattern);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(T__12);
				setState(425);
				serializationPatternMap();
				setState(426);
				match(T__13);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(T__21);
				setState(429);
				serializationPatternList();
				setState(430);
				match(T__22);
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(IDENTIFIER_WEBIDL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerializationPatternMapContext extends ParserRuleContext {
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public SerializationPatternMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializationPatternMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializationPatternMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializationPatternMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializationPatternMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializationPatternMapContext serializationPatternMap() throws RecognitionException {
		SerializationPatternMapContext _localctx = new SerializationPatternMapContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_serializationPatternMap);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(T__39);
				setState(437);
				identifiers();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(IDENTIFIER_WEBIDL);
				setState(439);
				identifiers();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerializationPatternListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public SerializationPatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializationPatternList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSerializationPatternList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSerializationPatternList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSerializationPatternList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializationPatternListContext serializationPatternList() throws RecognitionException {
		SerializationPatternListContext _localctx = new SerializationPatternListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_serializationPatternList);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(T__38);
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(IDENTIFIER_WEBIDL);
				setState(445);
				identifiers();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringifierContext extends ParserRuleContext {
		public StringifierRestContext stringifierRest() {
			return getRuleContext(StringifierRestContext.class,0);
		}
		public StringifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStringifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStringifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitStringifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringifierContext stringifier() throws RecognitionException {
		StringifierContext _localctx = new StringifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_stringifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__40);
			setState(450);
			stringifierRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringifierRestContext extends ParserRuleContext {
		public ReadOnlyContext readOnly() {
			return getRuleContext(ReadOnlyContext.class,0);
		}
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public StringifierRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringifierRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStringifierRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStringifierRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitStringifierRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringifierRestContext stringifierRest() throws RecognitionException {
		StringifierRestContext _localctx = new StringifierRestContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_stringifierRest);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				readOnly();
				setState(453);
				attributeRest();
				}
				break;
			case T__26:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				returnType();
				setState(456);
				operationRest();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticMemberContext extends ParserRuleContext {
		public StaticMemberRestContext staticMemberRest() {
			return getRuleContext(StaticMemberRestContext.class,0);
		}
		public StaticMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStaticMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStaticMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitStaticMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticMemberContext staticMember() throws RecognitionException {
		StaticMemberContext _localctx = new StaticMemberContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_staticMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__41);
			setState(462);
			staticMemberRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticMemberRestContext extends ParserRuleContext {
		public ReadOnlyContext readOnly() {
			return getRuleContext(ReadOnlyContext.class,0);
		}
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public StaticMemberRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMemberRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterStaticMemberRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitStaticMemberRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitStaticMemberRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticMemberRestContext staticMemberRest() throws RecognitionException {
		StaticMemberRestContext _localctx = new StaticMemberRestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_staticMemberRest);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				readOnly();
				setState(465);
				attributeRest();
				}
				break;
			case T__26:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				returnType();
				setState(468);
				operationRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadonlyMemberContext extends ParserRuleContext {
		public ReadonlyMemberRestContext readonlyMemberRest() {
			return getRuleContext(ReadonlyMemberRestContext.class,0);
		}
		public ReadonlyMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonlyMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadonlyMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadonlyMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitReadonlyMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadonlyMemberContext readonlyMember() throws RecognitionException {
		ReadonlyMemberContext _localctx = new ReadonlyMemberContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_readonlyMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__42);
			setState(473);
			readonlyMemberRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadonlyMemberRestContext extends ParserRuleContext {
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public MaplikeRestContext maplikeRest() {
			return getRuleContext(MaplikeRestContext.class,0);
		}
		public SetlikeRestContext setlikeRest() {
			return getRuleContext(SetlikeRestContext.class,0);
		}
		public ReadonlyMemberRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonlyMemberRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadonlyMemberRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadonlyMemberRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitReadonlyMemberRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadonlyMemberRestContext readonlyMemberRest() throws RecognitionException {
		ReadonlyMemberRestContext _localctx = new ReadonlyMemberRestContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_readonlyMemberRest);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				attributeRest();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				maplikeRest();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				setlikeRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadWriteAttributeContext extends ParserRuleContext {
		public ReadOnlyContext readOnly() {
			return getRuleContext(ReadOnlyContext.class,0);
		}
		public AttributeRestContext attributeRest() {
			return getRuleContext(AttributeRestContext.class,0);
		}
		public ReadWriteAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readWriteAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadWriteAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadWriteAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitReadWriteAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadWriteAttributeContext readWriteAttribute() throws RecognitionException {
		ReadWriteAttributeContext _localctx = new ReadWriteAttributeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_readWriteAttribute);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(T__39);
				setState(481);
				readOnly();
				setState(482);
				attributeRest();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				attributeRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public List<AttributeAnnotationsContext> attributeAnnotations() {
			return getRuleContexts(AttributeAnnotationsContext.class);
		}
		public AttributeAnnotationsContext attributeAnnotations(int i) {
			return getRuleContext(AttributeAnnotationsContext.class,i);
		}
		public AttributeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterAttributeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitAttributeRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitAttributeRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeRestContext attributeRest() throws RecognitionException {
		AttributeRestContext _localctx = new AttributeRestContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_attributeRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__43);
			setState(488);
			type();
			setState(489);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==IDENTIFIER_WEBIDL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER_WEBIDL) {
				{
				{
				setState(490);
				attributeAnnotations();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeAnnotationsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public AttributeAnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeAnnotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterAttributeAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitAttributeAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitAttributeAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeAnnotationsContext attributeAnnotations() throws RecognitionException {
		AttributeAnnotationsContext _localctx = new AttributeAnnotationsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_attributeAnnotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(IDENTIFIER_WEBIDL);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(499);
				match(T__26);
				setState(500);
				type();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(501);
					match(T__24);
					setState(502);
					type();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(508);
				match(T__27);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritContext extends ParserRuleContext {
		public InheritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterInherit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitInherit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitInherit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritContext inherit() throws RecognitionException {
		InheritContext _localctx = new InheritContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_inherit);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(T__39);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadOnlyContext extends ParserRuleContext {
		public ReadOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readOnly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitReadOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadOnlyContext readOnly() throws RecognitionException {
		ReadOnlyContext _localctx = new ReadOnlyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_readOnly);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public SpecialOperationContext specialOperation() {
			return getRuleContext(SpecialOperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operation);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				returnType();
				setState(521);
				operationRest();
				}
				break;
			case T__38:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				specialOperation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialOperationContext extends ParserRuleContext {
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public SpecialsContext specials() {
			return getRuleContext(SpecialsContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public OperationRestContext operationRest() {
			return getRuleContext(OperationRestContext.class,0);
		}
		public SpecialOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSpecialOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSpecialOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSpecialOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialOperationContext specialOperation() throws RecognitionException {
		SpecialOperationContext _localctx = new SpecialOperationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_specialOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			special();
			setState(527);
			specials();
			setState(528);
			returnType();
			setState(529);
			operationRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialsContext extends ParserRuleContext {
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public SpecialsContext specials() {
			return getRuleContext(SpecialsContext.class,0);
		}
		public SpecialsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specials; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSpecials(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSpecials(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSpecials(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialsContext specials() throws RecognitionException {
		SpecialsContext _localctx = new SpecialsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_specials);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				special();
				setState(532);
				specials();
				}
				break;
			case T__26:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialContext extends ParserRuleContext {
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationRestContext extends ParserRuleContext {
		public OptionalIdentifierContext optionalIdentifier() {
			return getRuleContext(OptionalIdentifierContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<AttributeAnnotationsContext> attributeAnnotations() {
			return getRuleContexts(AttributeAnnotationsContext.class);
		}
		public AttributeAnnotationsContext attributeAnnotations(int i) {
			return getRuleContext(AttributeAnnotationsContext.class,i);
		}
		public OperationRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOperationRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOperationRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOperationRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationRestContext operationRest() throws RecognitionException {
		OperationRestContext _localctx = new OperationRestContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operationRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			optionalIdentifier();
			setState(540);
			match(T__26);
			setState(541);
			argumentList();
			setState(542);
			match(T__27);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER_WEBIDL) {
				{
				{
				setState(543);
				attributeAnnotations();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public OptionalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOptionalIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalIdentifierContext optionalIdentifier() throws RecognitionException {
		OptionalIdentifierContext _localctx = new OptionalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_optionalIdentifier);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(IDENTIFIER_WEBIDL);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_argumentList);
		try {
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__26:
			case T__48:
			case T__49:
			case T__50:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				argument();
				setState(556);
				arguments();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arguments);
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				match(T__24);
				setState(562);
				argument();
				setState(563);
				arguments();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExtendedAttributeListContext extendedAttributeList() {
			return getRuleContext(ExtendedAttributeListContext.class,0);
		}
		public OptionalOrRequiredArgumentContext optionalOrRequiredArgument() {
			return getRuleContext(OptionalOrRequiredArgumentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			extendedAttributeList();
			setState(569);
			optionalOrRequiredArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalOrRequiredArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EllipsisContext ellipsis() {
			return getRuleContext(EllipsisContext.class,0);
		}
		public ArgumentNameContext argumentName() {
			return getRuleContext(ArgumentNameContext.class,0);
		}
		public Default_Context default_() {
			return getRuleContext(Default_Context.class,0);
		}
		public OptionalOrRequiredArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalOrRequiredArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalOrRequiredArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalOrRequiredArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOptionalOrRequiredArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalOrRequiredArgumentContext optionalOrRequiredArgument() throws RecognitionException {
		OptionalOrRequiredArgumentContext _localctx = new OptionalOrRequiredArgumentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_optionalOrRequiredArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(571);
				match(T__48);
				}
			}

			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49 || _la==T__50) {
				{
				setState(574);
				_la = _input.LA(1);
				if ( !(_la==T__49 || _la==T__50) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(577);
			type();
			setState(578);
			ellipsis();
			setState(579);
			argumentName();
			setState(580);
			default_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentNameContext extends ParserRuleContext {
		public ArgumentNameKeywordContext argumentNameKeyword() {
			return getRuleContext(ArgumentNameKeywordContext.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgumentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArgumentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_argumentName);
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__14:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__25:
			case T__28:
			case T__29:
			case T__30:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__52:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				argumentNameKeyword();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(IDENTIFIER_WEBIDL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EllipsisContext extends ParserRuleContext {
		public EllipsisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipsis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterEllipsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitEllipsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitEllipsis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EllipsisContext ellipsis() throws RecognitionException {
		EllipsisContext _localctx = new EllipsisContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ellipsis);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(T__51);
				}
				break;
			case T__9:
			case T__14:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__25:
			case T__28:
			case T__29:
			case T__30:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__52:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OptionalTypeContext optionalType() {
			return getRuleContext(OptionalTypeContext.class,0);
		}
		public IterableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIterable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIterable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitIterable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterableContext iterable() throws RecognitionException {
		IterableContext _localctx = new IterableContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_iterable);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(T__52);
				setState(591);
				match(T__53);
				setState(592);
				type();
				setState(593);
				optionalType();
				setState(594);
				match(T__54);
				setState(595);
				match(T__10);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(T__55);
				setState(598);
				match(T__53);
				setState(599);
				type();
				setState(600);
				match(T__54);
				setState(601);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitOptionalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitOptionalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalTypeContext optionalType() throws RecognitionException {
		OptionalTypeContext _localctx = new OptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_optionalType);
		try {
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(T__24);
				setState(606);
				type();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadWriteMaplikeContext extends ParserRuleContext {
		public MaplikeRestContext maplikeRest() {
			return getRuleContext(MaplikeRestContext.class,0);
		}
		public ReadWriteMaplikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readWriteMaplike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadWriteMaplike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadWriteMaplike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitReadWriteMaplike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadWriteMaplikeContext readWriteMaplike() throws RecognitionException {
		ReadWriteMaplikeContext _localctx = new ReadWriteMaplikeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_readWriteMaplike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			maplikeRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadWriteSetlikeContext extends ParserRuleContext {
		public SetlikeRestContext setlikeRest() {
			return getRuleContext(SetlikeRestContext.class,0);
		}
		public ReadWriteSetlikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readWriteSetlike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReadWriteSetlike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReadWriteSetlike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitReadWriteSetlike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadWriteSetlikeContext readWriteSetlike() throws RecognitionException {
		ReadWriteSetlikeContext _localctx = new ReadWriteSetlikeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_readWriteSetlike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			setlikeRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaplikeRestContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public MaplikeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maplikeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterMaplikeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitMaplikeRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitMaplikeRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaplikeRestContext maplikeRest() throws RecognitionException {
		MaplikeRestContext _localctx = new MaplikeRestContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_maplikeRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(T__56);
			setState(615);
			match(T__53);
			setState(616);
			type();
			setState(617);
			match(T__24);
			setState(618);
			type();
			setState(619);
			match(T__54);
			setState(620);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetlikeRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SetlikeRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setlikeRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSetlikeRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSetlikeRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSetlikeRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetlikeRestContext setlikeRest() throws RecognitionException {
		SetlikeRestContext _localctx = new SetlikeRestContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_setlikeRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(T__57);
			setState(623);
			match(T__53);
			setState(624);
			type();
			setState(625);
			match(T__54);
			setState(626);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeListContext extends ParserRuleContext {
		public ExtendedAttributeContext extendedAttribute() {
			return getRuleContext(ExtendedAttributeContext.class,0);
		}
		public ExtendedAttributesContext extendedAttributes() {
			return getRuleContext(ExtendedAttributesContext.class,0);
		}
		public ExtendedAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeListContext extendedAttributeList() throws RecognitionException {
		ExtendedAttributeListContext _localctx = new ExtendedAttributeListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_extendedAttributeList);
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(T__21);
				setState(629);
				extendedAttribute();
				setState(630);
				extendedAttributes();
				setState(631);
				match(T__22);
				}
				break;
			case T__11:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__25:
			case T__26:
			case T__28:
			case T__30:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__52:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__80:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributesContext extends ParserRuleContext {
		public ExtendedAttributeContext extendedAttribute() {
			return getRuleContext(ExtendedAttributeContext.class,0);
		}
		public ExtendedAttributesContext extendedAttributes() {
			return getRuleContext(ExtendedAttributesContext.class,0);
		}
		public ExtendedAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributesContext extendedAttributes() throws RecognitionException {
		ExtendedAttributesContext _localctx = new ExtendedAttributesContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_extendedAttributes);
		try {
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(T__24);
				setState(637);
				extendedAttribute();
				setState(638);
				extendedAttributes();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExtendedAttributeNamePartContext extendedAttributeNamePart() {
			return getRuleContext(ExtendedAttributeNamePartContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExtendedAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeContext extendedAttribute() throws RecognitionException {
		ExtendedAttributeContext _localctx = new ExtendedAttributeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_extendedAttribute);
		int _la;
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(643);
					extendedAttributeNamePart();
					}
					break;
				}
				setState(646);
				match(IDENTIFIER_WEBIDL);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(647);
					match(T__26);
					setState(648);
					argumentList();
					setState(649);
					match(T__27);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(653);
					extendedAttributeNamePart();
					}
					break;
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_WEBIDL) {
					{
					setState(656);
					match(IDENTIFIER_WEBIDL);
					}
				}

				setState(659);
				match(T__26);
				setState(660);
				argumentList();
				setState(661);
				match(T__27);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(663);
					extendedAttributeNamePart();
					}
					break;
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_WEBIDL) {
					{
					setState(666);
					match(IDENTIFIER_WEBIDL);
					}
				}

				setState(669);
				match(T__26);
				setState(670);
				identifierList();
				setState(671);
				match(T__27);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeNamePartContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExtendedAttributeNamePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeNamePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeNamePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeNamePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeNamePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeNamePartContext extendedAttributeNamePart() throws RecognitionException {
		ExtendedAttributeNamePartContext _localctx = new ExtendedAttributeNamePartContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_extendedAttributeNamePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(IDENTIFIER_WEBIDL);
			setState(677);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentNameKeywordContext extends ParserRuleContext {
		public ArgumentNameKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentNameKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterArgumentNameKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitArgumentNameKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitArgumentNameKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentNameKeywordContext argumentNameKeyword() throws RecognitionException {
		ArgumentNameKeywordContext _localctx = new ArgumentNameKeywordContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_argumentNameKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__52) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_type);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				singleType();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				unionType();
				setState(683);
				typeSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeContext extends ParserRuleContext {
		public NonAnyTypeContext nonAnyType() {
			return getRuleContext(NonAnyTypeContext.class,0);
		}
		public TypeSuffixStartingWithArrayContext typeSuffixStartingWithArray() {
			return getRuleContext(TypeSuffixStartingWithArrayContext.class,0);
		}
		public SingleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSingleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSingleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSingleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeContext singleType() throws RecognitionException {
		SingleTypeContext _localctx = new SingleTypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_singleType);
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				nonAnyType();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				match(T__59);
				setState(689);
				typeSuffixStartingWithArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTypeContext extends ParserRuleContext {
		public List<UnionMemberTypeContext> unionMemberType() {
			return getRuleContexts(UnionMemberTypeContext.class);
		}
		public UnionMemberTypeContext unionMemberType(int i) {
			return getRuleContext(UnionMemberTypeContext.class,i);
		}
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_unionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T__26);
			setState(693);
			unionMemberType();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(694);
				match(T__60);
				setState(695);
				unionMemberType();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionMemberTypeContext extends ParserRuleContext {
		public NonAnyTypeContext nonAnyType() {
			return getRuleContext(NonAnyTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public UnionMemberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMemberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnionMemberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnionMemberType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnionMemberType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionMemberTypeContext unionMemberType() throws RecognitionException {
		UnionMemberTypeContext _localctx = new UnionMemberTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_unionMemberType);
		try {
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				nonAnyType();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				unionType();
				setState(705);
				typeSuffix();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				match(T__59);
				setState(708);
				match(T__21);
				setState(709);
				match(T__22);
				setState(710);
				typeSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionMemberTypesContext extends ParserRuleContext {
		public UnionMemberTypeContext unionMemberType() {
			return getRuleContext(UnionMemberTypeContext.class,0);
		}
		public UnionMemberTypesContext unionMemberTypes() {
			return getRuleContext(UnionMemberTypesContext.class,0);
		}
		public UnionMemberTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMemberTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnionMemberTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnionMemberTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnionMemberTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionMemberTypesContext unionMemberTypes() throws RecognitionException {
		UnionMemberTypesContext _localctx = new UnionMemberTypesContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_unionMemberTypes);
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(T__60);
				setState(714);
				unionMemberType();
				setState(715);
				unionMemberTypes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonAnyTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public PromiseTypeContext promiseType() {
			return getRuleContext(PromiseTypeContext.class,0);
		}
		public Null_Context null_() {
			return getRuleContext(Null_Context.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonAnyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonAnyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterNonAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitNonAnyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitNonAnyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonAnyTypeContext nonAnyType() throws RecognitionException {
		NonAnyTypeContext _localctx = new NonAnyTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_nonAnyType);
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				primitiveType();
				setState(721);
				typeSuffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				promiseType();
				setState(724);
				null_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				match(T__61);
				setState(727);
				typeSuffix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
				match(T__62);
				setState(729);
				typeSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
				match(T__63);
				setState(731);
				typeSuffix();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(732);
				match(IDENTIFIER_WEBIDL);
				setState(733);
				typeSuffix();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(734);
				sequenceType();
				setState(735);
				null_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(737);
				match(T__64);
				setState(738);
				typeSuffix();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(739);
				match(T__65);
				setState(740);
				typeSuffix();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(741);
				match(T__66);
				setState(742);
				typeSuffix();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(743);
				match(T__67);
				setState(744);
				typeSuffix();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(745);
				match(IDENTIFIER_WEBIDL);
				setState(746);
				match(T__53);
				setState(747);
				type();
				setState(748);
				match(T__54);
				setState(749);
				null_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public Null_Context null_() {
			return getRuleContext(Null_Context.class,0);
		}
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ConstTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterConstType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitConstType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitConstType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstTypeContext constType() throws RecognitionException {
		ConstTypeContext _localctx = new ConstTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_constType);
		try {
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				primitiveType();
				setState(754);
				null_();
				}
				break;
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(IDENTIFIER_WEBIDL);
				setState(757);
				null_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public UnsignedIntegerTypeContext unsignedIntegerType() {
			return getRuleContext(UnsignedIntegerTypeContext.class,0);
		}
		public UnrestrictedFloatTypeContext unrestrictedFloatType() {
			return getRuleContext(UnrestrictedFloatTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_primitiveType);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__73:
			case T__74:
			case T__75:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				unsignedIntegerType();
				}
				break;
			case T__58:
			case T__71:
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				unrestrictedFloatType();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 3);
				{
				setState(762);
				match(T__68);
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 4);
				{
				setState(763);
				match(T__69);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 5);
				{
				setState(764);
				match(T__70);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnrestrictedFloatTypeContext extends ParserRuleContext {
		public FloatTypeContext floatType() {
			return getRuleContext(FloatTypeContext.class,0);
		}
		public UnrestrictedFloatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unrestrictedFloatType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnrestrictedFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnrestrictedFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnrestrictedFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnrestrictedFloatTypeContext unrestrictedFloatType() throws RecognitionException {
		UnrestrictedFloatTypeContext _localctx = new UnrestrictedFloatTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_unrestrictedFloatType);
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(T__58);
				setState(768);
				floatType();
				}
				break;
			case T__71:
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				floatType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatTypeContext extends ParserRuleContext {
		public FloatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatTypeContext floatType() throws RecognitionException {
		FloatTypeContext _localctx = new FloatTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_floatType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_la = _input.LA(1);
			if ( !(_la==T__71 || _la==T__72) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedIntegerTypeContext extends ParserRuleContext {
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public UnsignedIntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedIntegerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterUnsignedIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitUnsignedIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitUnsignedIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerTypeContext unsignedIntegerType() throws RecognitionException {
		UnsignedIntegerTypeContext _localctx = new UnsignedIntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_unsignedIntegerType);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__73:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				match(T__73);
				setState(775);
				integerType();
				}
				break;
			case T__74:
			case T__75:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				integerType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerTypeContext extends ParserRuleContext {
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_integerType);
		int _la;
		try {
			setState(785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__74:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(T__74);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 2);
				{
				setState(781); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(780);
					match(T__75);
					}
					}
					setState(783); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__75 );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SequenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterSequenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitSequenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitSequenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceTypeContext sequenceType() throws RecognitionException {
		SequenceTypeContext _localctx = new SequenceTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_sequenceType);
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__76:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				match(T__76);
				setState(788);
				match(T__53);
				setState(789);
				type();
				setState(790);
				match(T__54);
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(T__77);
				setState(793);
				match(T__53);
				setState(794);
				type();
				setState(795);
				match(T__54);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PromiseTypeContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public PromiseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promiseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterPromiseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitPromiseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitPromiseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PromiseTypeContext promiseType() throws RecognitionException {
		PromiseTypeContext _localctx = new PromiseTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_promiseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(T__78);
			setState(800);
			match(T__53);
			setState(801);
			returnType();
			setState(802);
			match(T__54);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSuffixContext extends ParserRuleContext {
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TypeSuffixStartingWithArrayContext typeSuffixStartingWithArray() {
			return getRuleContext(TypeSuffixStartingWithArrayContext.class,0);
		}
		public TypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterTypeSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitTypeSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitTypeSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSuffixContext typeSuffix() throws RecognitionException {
		TypeSuffixContext _localctx = new TypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_typeSuffix);
		try {
			setState(810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(T__21);
				setState(805);
				match(T__22);
				setState(806);
				typeSuffix();
				}
				break;
			case T__79:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				match(T__79);
				setState(808);
				typeSuffixStartingWithArray();
				}
				break;
			case T__9:
			case T__14:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSuffixStartingWithArrayContext extends ParserRuleContext {
		public TypeSuffixContext typeSuffix() {
			return getRuleContext(TypeSuffixContext.class,0);
		}
		public TypeSuffixStartingWithArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSuffixStartingWithArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterTypeSuffixStartingWithArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitTypeSuffixStartingWithArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitTypeSuffixStartingWithArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSuffixStartingWithArrayContext typeSuffixStartingWithArray() throws RecognitionException {
		TypeSuffixStartingWithArrayContext _localctx = new TypeSuffixStartingWithArrayContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_typeSuffixStartingWithArray);
		try {
			setState(816);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(T__21);
				setState(813);
				match(T__22);
				setState(814);
				typeSuffix();
				}
				break;
			case T__9:
			case T__14:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_Context extends ParserRuleContext {
		public Null_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterNull_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitNull_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitNull_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_Context null_() throws RecognitionException {
		Null_Context _localctx = new Null_Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_null_);
		try {
			setState(820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__79:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(T__79);
				}
				break;
			case T__9:
			case T__14:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__51:
			case T__52:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__60:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_returnType);
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__58:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case IDENTIFIER_WEBIDL:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				type();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(T__80);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(IDENTIFIER_WEBIDL);
			setState(827);
			identifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiersContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_identifiers);
		try {
			setState(833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				match(T__24);
				setState(830);
				match(IDENTIFIER_WEBIDL);
				setState(831);
				identifiers();
				}
				break;
			case T__13:
			case T__22:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeNoArgsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ExtendedAttributeNoArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeNoArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeNoArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeNoArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeNoArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeNoArgsContext extendedAttributeNoArgs() throws RecognitionException {
		ExtendedAttributeNoArgsContext _localctx = new ExtendedAttributeNoArgsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_extendedAttributeNoArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(IDENTIFIER_WEBIDL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeArgListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExtendedAttributeArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeArgListContext extendedAttributeArgList() throws RecognitionException {
		ExtendedAttributeArgListContext _localctx = new ExtendedAttributeArgListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_extendedAttributeArgList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(IDENTIFIER_WEBIDL);
			setState(838);
			match(T__26);
			setState(839);
			argumentList();
			setState(840);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public ExtendedAttributeIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeIdentContext extendedAttributeIdent() throws RecognitionException {
		ExtendedAttributeIdentContext _localctx = new ExtendedAttributeIdentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_extendedAttributeIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(IDENTIFIER_WEBIDL);
			setState(843);
			match(T__20);
			setState(844);
			match(IDENTIFIER_WEBIDL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeIdentListContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_WEBIDL() { return getToken(WebIDLParser.IDENTIFIER_WEBIDL, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExtendedAttributeIdentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeIdentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeIdentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeIdentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeIdentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeIdentListContext extendedAttributeIdentList() throws RecognitionException {
		ExtendedAttributeIdentListContext _localctx = new ExtendedAttributeIdentListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_extendedAttributeIdentList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(IDENTIFIER_WEBIDL);
			setState(847);
			match(T__20);
			setState(848);
			match(T__26);
			setState(849);
			identifierList();
			setState(850);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedAttributeNamedArgListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_WEBIDL() { return getTokens(WebIDLParser.IDENTIFIER_WEBIDL); }
		public TerminalNode IDENTIFIER_WEBIDL(int i) {
			return getToken(WebIDLParser.IDENTIFIER_WEBIDL, i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExtendedAttributeNamedArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedAttributeNamedArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).enterExtendedAttributeNamedArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebIDLListener ) ((WebIDLListener)listener).exitExtendedAttributeNamedArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebIDLVisitor ) return ((WebIDLVisitor<? extends T>)visitor).visitExtendedAttributeNamedArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedAttributeNamedArgListContext extendedAttributeNamedArgList() throws RecognitionException {
		ExtendedAttributeNamedArgListContext _localctx = new ExtendedAttributeNamedArgListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_extendedAttributeNamedArgList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(IDENTIFIER_WEBIDL);
			setState(853);
			match(T__20);
			setState(854);
			match(IDENTIFIER_WEBIDL);
			setState(855);
			match(T__26);
			setState(856);
			argumentList();
			setState(857);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u035e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\5\2\u00ca\n\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\7\4\u00d4\n\4\f\4\16\4\u00d7\13\4\3\5\3\5\5\5\u00db\n\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u00e5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00f0\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00fc"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0108\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u0117\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0125\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0132\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0141\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u014b\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0157\n\27\3\30"+
		"\3\30\3\30\3\30\5\30\u015d\n\30\3\31\3\31\3\31\3\31\7\31\u0163\n\31\f"+
		"\31\16\31\u0166\13\31\3\31\5\31\u0169\n\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0178\n\34\3\35\3\35\3\35"+
		"\5\35\u017d\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u019c"+
		"\n\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3&\5&\u01a9\n&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u01b4\n\'\3(\3(\3(\3(\3(\3(\5(\u01bc\n(\3)\3)\3)"+
		"\3)\5)\u01c2\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u01ce\n+\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3-\5-\u01d9\n-\3.\3.\3.\3/\3/\3/\5/\u01e1\n/\3\60\3\60\3"+
		"\60\3\60\3\60\5\60\u01e8\n\60\3\61\3\61\3\61\3\61\7\61\u01ee\n\61\f\61"+
		"\16\61\u01f1\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\7\62\u01fa\n\62"+
		"\f\62\16\62\u01fd\13\62\3\62\3\62\5\62\u0201\n\62\3\63\3\63\5\63\u0205"+
		"\n\63\3\64\3\64\5\64\u0209\n\64\3\65\3\65\3\65\3\65\5\65\u020f\n\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u021a\n\67\38\38\39\3"+
		"9\39\39\39\79\u0223\n9\f9\169\u0226\139\39\39\3:\3:\5:\u022c\n:\3;\3;"+
		"\3;\3;\5;\u0232\n;\3<\3<\3<\3<\3<\5<\u0239\n<\3=\3=\3=\3>\5>\u023f\n>"+
		"\3>\5>\u0242\n>\3>\3>\3>\3>\3>\3?\3?\5?\u024b\n?\3@\3@\5@\u024f\n@\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u025e\nA\3B\3B\3B\5B\u0263\nB"+
		"\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G"+
		"\3G\5G\u027d\nG\3H\3H\3H\3H\3H\5H\u0284\nH\3I\5I\u0287\nI\3I\3I\3I\3I"+
		"\3I\5I\u028e\nI\3I\5I\u0291\nI\3I\5I\u0294\nI\3I\3I\3I\3I\3I\5I\u029b"+
		"\nI\3I\5I\u029e\nI\3I\3I\3I\3I\3I\5I\u02a5\nI\3J\3J\3J\3K\3K\3L\3L\3L"+
		"\3L\5L\u02b0\nL\3M\3M\3M\5M\u02b5\nM\3N\3N\3N\3N\7N\u02bb\nN\fN\16N\u02be"+
		"\13N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\5O\u02ca\nO\3P\3P\3P\3P\3P\5P\u02d1"+
		"\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u02f2\nQ\3R\3R\3R\3R\3R\5R\u02f9\nR\3S"+
		"\3S\3S\3S\3S\5S\u0300\nS\3T\3T\3T\5T\u0305\nT\3U\3U\3V\3V\3V\5V\u030c"+
		"\nV\3W\3W\6W\u0310\nW\rW\16W\u0311\5W\u0314\nW\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\5X\u0320\nX\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u032d\nZ\3[\3"+
		"[\3[\3[\5[\u0333\n[\3\\\3\\\5\\\u0337\n\\\3]\3]\5]\u033b\n]\3^\3^\3^\3"+
		"_\3_\3_\3_\5_\u0344\n_\3`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3b\3c\3c\3c\3c\3"+
		"c\3c\3d\3d\3d\3d\3d\3d\3d\3d\2\2e\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\2\n\3\2\3"+
		"\n\3\2#$\4\2%\'UU\4\2\26\26VV\4\2))/\62\3\2\64\65\13\2\f\f\21\21\23\26"+
		"\34\34\37!(,.\62\67\67:=\3\2JK\2\u036c\2\u00c9\3\2\2\2\4\u00ce\3\2\2\2"+
		"\6\u00d0\3\2\2\2\b\u00d8\3\2\2\2\n\u00e4\3\2\2\2\f\u00ef\3\2\2\2\16\u00f1"+
		"\3\2\2\2\20\u00fb\3\2\2\2\22\u00fd\3\2\2\2\24\u0107\3\2\2\2\26\u0109\3"+
		"\2\2\2\30\u0111\3\2\2\2\32\u0116\3\2\2\2\34\u0118\3\2\2\2\36\u0124\3\2"+
		"\2\2 \u0131\3\2\2\2\"\u0133\3\2\2\2$\u0140\3\2\2\2&\u0142\3\2\2\2(\u014a"+
		"\3\2\2\2*\u014c\3\2\2\2,\u0156\3\2\2\2.\u015c\3\2\2\2\60\u0168\3\2\2\2"+
		"\62\u016a\3\2\2\2\64\u0171\3\2\2\2\66\u0177\3\2\2\28\u017c\3\2\2\2:\u017e"+
		"\3\2\2\2<\u0186\3\2\2\2>\u018b\3\2\2\2@\u0190\3\2\2\2B\u019b\3\2\2\2D"+
		"\u019d\3\2\2\2F\u019f\3\2\2\2H\u01a1\3\2\2\2J\u01a8\3\2\2\2L\u01b3\3\2"+
		"\2\2N\u01bb\3\2\2\2P\u01c1\3\2\2\2R\u01c3\3\2\2\2T\u01cd\3\2\2\2V\u01cf"+
		"\3\2\2\2X\u01d8\3\2\2\2Z\u01da\3\2\2\2\\\u01e0\3\2\2\2^\u01e7\3\2\2\2"+
		"`\u01e9\3\2\2\2b\u01f4\3\2\2\2d\u0204\3\2\2\2f\u0208\3\2\2\2h\u020e\3"+
		"\2\2\2j\u0210\3\2\2\2l\u0219\3\2\2\2n\u021b\3\2\2\2p\u021d\3\2\2\2r\u022b"+
		"\3\2\2\2t\u0231\3\2\2\2v\u0238\3\2\2\2x\u023a\3\2\2\2z\u023e\3\2\2\2|"+
		"\u024a\3\2\2\2~\u024e\3\2\2\2\u0080\u025d\3\2\2\2\u0082\u0262\3\2\2\2"+
		"\u0084\u0264\3\2\2\2\u0086\u0266\3\2\2\2\u0088\u0268\3\2\2\2\u008a\u0270"+
		"\3\2\2\2\u008c\u027c\3\2\2\2\u008e\u0283\3\2\2\2\u0090\u02a4\3\2\2\2\u0092"+
		"\u02a6\3\2\2\2\u0094\u02a9\3\2\2\2\u0096\u02af\3\2\2\2\u0098\u02b4\3\2"+
		"\2\2\u009a\u02b6\3\2\2\2\u009c\u02c9\3\2\2\2\u009e\u02d0\3\2\2\2\u00a0"+
		"\u02f1\3\2\2\2\u00a2\u02f8\3\2\2\2\u00a4\u02ff\3\2\2\2\u00a6\u0304\3\2"+
		"\2\2\u00a8\u0306\3\2\2\2\u00aa\u030b\3\2\2\2\u00ac\u0313\3\2\2\2\u00ae"+
		"\u031f\3\2\2\2\u00b0\u0321\3\2\2\2\u00b2\u032c\3\2\2\2\u00b4\u0332\3\2"+
		"\2\2\u00b6\u0336\3\2\2\2\u00b8\u033a\3\2\2\2\u00ba\u033c\3\2\2\2\u00bc"+
		"\u0343\3\2\2\2\u00be\u0345\3\2\2\2\u00c0\u0347\3\2\2\2\u00c2\u034c\3\2"+
		"\2\2\u00c4\u0350\3\2\2\2\u00c6\u0356\3\2\2\2\u00c8\u00ca\5\b\5\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\5\n"+
		"\6\2\u00cc\u00cd\7\2\2\3\u00cd\3\3\2\2\2\u00ce\u00cf\t\2\2\2\u00cf\5\3"+
		"\2\2\2\u00d0\u00d5\7V\2\2\u00d1\u00d2\7\13\2\2\u00d2\u00d4\7V\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\7\f\2\2\u00d9\u00db"+
		"\5\4\3\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\5\6\4\2\u00dd\u00de\7\r\2\2\u00de\t\3\2\2\2\u00df\u00e0\5\u008c"+
		"G\2\u00e0\u00e1\5\f\7\2\u00e1\u00e2\5\n\6\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\13\3\2\2"+
		"\2\u00e6\u00f0\5\20\t\2\u00e7\u00f0\5\30\r\2\u00e8\u00f0\5\"\22\2\u00e9"+
		"\u00f0\5\62\32\2\u00ea\u00f0\5<\37\2\u00eb\u00f0\5\22\n\2\u00ec\u00f0"+
		"\5@!\2\u00ed\u00f0\5\16\b\2\u00ee\u00f0\5> \2\u00ef\u00e6\3\2\2\2\u00ef"+
		"\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2"+
		"\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\r\3\2\2\2\u00f1\u00f2\7\16\2\2\u00f2\u00f3\7V\2\2"+
		"\u00f3\u00f4\7\17\2\2\u00f4\u00f5\5\n\6\2\u00f5\u00f6\7\20\2\2\u00f6\u00f7"+
		"\7\r\2\2\u00f7\17\3\2\2\2\u00f8\u00f9\7\21\2\2\u00f9\u00fc\5\24\13\2\u00fa"+
		"\u00fc\5\26\f\2\u00fb\u00f8\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\21\3\2\2"+
		"\2\u00fd\u00fe\7\22\2\2\u00fe\u00ff\7V\2\2\u00ff\u0100\5\60\31\2\u0100"+
		"\u0101\7\17\2\2\u0101\u0102\5$\23\2\u0102\u0103\7\20\2\2\u0103\u0104\7"+
		"\r\2\2\u0104\23\3\2\2\2\u0105\u0108\5:\36\2\u0106\u0108\5\26\f\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\25\3\2\2\2\u0109\u010a\7\23\2"+
		"\2\u010a\u010b\7V\2\2\u010b\u010c\5\60\31\2\u010c\u010d\7\17\2\2\u010d"+
		"\u010e\5\36\20\2\u010e\u010f\7\20\2\2\u010f\u0110\7\r\2\2\u0110\27\3\2"+
		"\2\2\u0111\u0112\7\24\2\2\u0112\u0113\5\32\16\2\u0113\31\3\2\2\2\u0114"+
		"\u0117\5\34\17\2\u0115\u0117\5*\26\2\u0116\u0114\3\2\2\2\u0116\u0115\3"+
		"\2\2\2\u0117\33\3\2\2\2\u0118\u0119\7\23\2\2\u0119\u011a\7V\2\2\u011a"+
		"\u011b\7\17\2\2\u011b\u011c\5\36\20\2\u011c\u011d\7\20\2\2\u011d\u011e"+
		"\7\r\2\2\u011e\35\3\2\2\2\u011f\u0120\5\u008cG\2\u0120\u0121\5 \21\2\u0121"+
		"\u0122\5\36\20\2\u0122\u0125\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u011f\3"+
		"\2\2\2\u0124\u0123\3\2\2\2\u0125\37\3\2\2\2\u0126\u0132\5@!\2\u0127\u0132"+
		"\5h\65\2\u0128\u0132\5H%\2\u0129\u0132\5R*\2\u012a\u0132\5V,\2\u012b\u0132"+
		"\5\u0080A\2\u012c\u0132\5Z.\2\u012d\u0132\5^\60\2\u012e\u0132\5\u0084"+
		"C\2\u012f\u0132\5\u0086D\2\u0130\u0132\5<\37\2\u0131\u0126\3\2\2\2\u0131"+
		"\u0127\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012a\3\2"+
		"\2\2\u0131\u012b\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u012d\3\2\2\2\u0131"+
		"\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132!\3\2\2\2"+
		"\u0133\u0134\7\25\2\2\u0134\u0135\7V\2\2\u0135\u0136\5\60\31\2\u0136\u0137"+
		"\7\17\2\2\u0137\u0138\5$\23\2\u0138\u0139\7\20\2\2\u0139\u013a\7\r\2\2"+
		"\u013a#\3\2\2\2\u013b\u013c\5\u008cG\2\u013c\u013d\5&\24\2\u013d\u013e"+
		"\5$\23\2\u013e\u0141\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013b\3\2\2\2\u0140"+
		"\u013f\3\2\2\2\u0141%\3\2\2\2\u0142\u0143\5(\25\2\u0143\u0144\5\u0096"+
		"L\2\u0144\u0145\7V\2\2\u0145\u0146\5,\27\2\u0146\u0147\7\r\2\2\u0147\'"+
		"\3\2\2\2\u0148\u014b\7\26\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\u014a\u0149\3\2\2\2\u014b)\3\2\2\2\u014c\u014d\7\25\2\2\u014d\u014e\7"+
		"V\2\2\u014e\u014f\7\17\2\2\u014f\u0150\5$\23\2\u0150\u0151\7\20\2\2\u0151"+
		"\u0152\7\r\2\2\u0152+\3\2\2\2\u0153\u0154\7\27\2\2\u0154\u0157\5.\30\2"+
		"\u0155\u0157\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0155\3\2\2\2\u0157-\3"+
		"\2\2\2\u0158\u015d\5B\"\2\u0159\u015d\7W\2\2\u015a\u015b\7\30\2\2\u015b"+
		"\u015d\7\31\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a\3"+
		"\2\2\2\u015d/\3\2\2\2\u015e\u015f\7\32\2\2\u015f\u0164\7V\2\2\u0160\u0161"+
		"\7\33\2\2\u0161\u0163\7V\2\2\u0162\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0169\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0167\u0169\3\2\2\2\u0168\u015e\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"\61\3\2\2\2\u016a\u016b\7\34\2\2\u016b\u016c\7V\2\2\u016c\u016d\7\17\2"+
		"\2\u016d\u016e\5\64\33\2\u016e\u016f\7\20\2\2\u016f\u0170\7\r\2\2\u0170"+
		"\63\3\2\2\2\u0171\u0172\7W\2\2\u0172\u0173\5\66\34\2\u0173\65\3\2\2\2"+
		"\u0174\u0175\7\33\2\2\u0175\u0178\58\35\2\u0176\u0178\3\2\2\2\u0177\u0174"+
		"\3\2\2\2\u0177\u0176\3\2\2\2\u0178\67\3\2\2\2\u0179\u017a\7W\2\2\u017a"+
		"\u017d\5\66\34\2\u017b\u017d\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017b\3"+
		"\2\2\2\u017d9\3\2\2\2\u017e\u017f\7V\2\2\u017f\u0180\7\27\2\2\u0180\u0181"+
		"\5\u00b8]\2\u0181\u0182\7\35\2\2\u0182\u0183\5t;\2\u0183\u0184\7\36\2"+
		"\2\u0184\u0185\7\r\2\2\u0185;\3\2\2\2\u0186\u0187\7\37\2\2\u0187\u0188"+
		"\5\u0096L\2\u0188\u0189\7V\2\2\u0189\u018a\7\r\2\2\u018a=\3\2\2\2\u018b"+
		"\u018c\7V\2\2\u018c\u018d\7 \2\2\u018d\u018e\7V\2\2\u018e\u018f\7\r\2"+
		"\2\u018f?\3\2\2\2\u0190\u0191\7!\2\2\u0191\u0192\5\u00a2R\2\u0192\u0193"+
		"\7V\2\2\u0193\u0194\7\27\2\2\u0194\u0195\5B\"\2\u0195\u0196\7\r\2\2\u0196"+
		"A\3\2\2\2\u0197\u019c\5D#\2\u0198\u019c\5F$\2\u0199\u019c\7T\2\2\u019a"+
		"\u019c\7\"\2\2\u019b\u0197\3\2\2\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019b\u019a\3\2\2\2\u019cC\3\2\2\2\u019d\u019e\t\3\2\2\u019eE\3\2"+
		"\2\2\u019f\u01a0\t\4\2\2\u01a0G\3\2\2\2\u01a1\u01a2\7(\2\2\u01a2\u01a3"+
		"\5J&\2\u01a3I\3\2\2\2\u01a4\u01a9\5p9\2\u01a5\u01a6\7\27\2\2\u01a6\u01a9"+
		"\5L\'\2\u01a7\u01a9\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9K\3\2\2\2\u01aa\u01ab\7\17\2\2\u01ab\u01ac\5N(\2\u01ac"+
		"\u01ad\7\20\2\2\u01ad\u01b4\3\2\2\2\u01ae\u01af\7\30\2\2\u01af\u01b0\5"+
		"P)\2\u01b0\u01b1\7\31\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b4\7V\2\2\u01b3"+
		"\u01aa\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4M\3\2\2\2"+
		"\u01b5\u01bc\7)\2\2\u01b6\u01b7\7*\2\2\u01b7\u01bc\5\u00bc_\2\u01b8\u01b9"+
		"\7V\2\2\u01b9\u01bc\5\u00bc_\2\u01ba\u01bc\3\2\2\2\u01bb\u01b5\3\2\2\2"+
		"\u01bb\u01b6\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bcO\3"+
		"\2\2\2\u01bd\u01c2\7)\2\2\u01be\u01bf\7V\2\2\u01bf\u01c2\5\u00bc_\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01c0\3\2"+
		"\2\2\u01c2Q\3\2\2\2\u01c3\u01c4\7+\2\2\u01c4\u01c5\5T+\2\u01c5S\3\2\2"+
		"\2\u01c6\u01c7\5f\64\2\u01c7\u01c8\5`\61\2\u01c8\u01ce\3\2\2\2\u01c9\u01ca"+
		"\5\u00b8]\2\u01ca\u01cb\5p9\2\u01cb\u01ce\3\2\2\2\u01cc\u01ce\7\r\2\2"+
		"\u01cd\u01c6\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ceU\3"+
		"\2\2\2\u01cf\u01d0\7,\2\2\u01d0\u01d1\5X-\2\u01d1W\3\2\2\2\u01d2\u01d3"+
		"\5f\64\2\u01d3\u01d4\5`\61\2\u01d4\u01d9\3\2\2\2\u01d5\u01d6\5\u00b8]"+
		"\2\u01d6\u01d7\5p9\2\u01d7\u01d9\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d8\u01d5"+
		"\3\2\2\2\u01d9Y\3\2\2\2\u01da\u01db\7-\2\2\u01db\u01dc\5\\/\2\u01dc[\3"+
		"\2\2\2\u01dd\u01e1\5`\61\2\u01de\u01e1\5\u0088E\2\u01df\u01e1\5\u008a"+
		"F\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1"+
		"]\3\2\2\2\u01e2\u01e3\7*\2\2\u01e3\u01e4\5f\64\2\u01e4\u01e5\5`\61\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e8\5`\61\2\u01e7\u01e2\3\2\2\2\u01e7\u01e6\3\2"+
		"\2\2\u01e8_\3\2\2\2\u01e9\u01ea\7.\2\2\u01ea\u01eb\5\u0096L\2\u01eb\u01ef"+
		"\t\5\2\2\u01ec\u01ee\5b\62\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f2\u01f3\7\r\2\2\u01f3a\3\2\2\2\u01f4\u0200\7V\2\2\u01f5\u01f6"+
		"\7\35\2\2\u01f6\u01fb\5\u0096L\2\u01f7\u01f8\7\33\2\2\u01f8\u01fa\5\u0096"+
		"L\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7\36"+
		"\2\2\u01ff\u0201\3\2\2\2\u0200\u01f5\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"c\3\2\2\2\u0202\u0205\7*\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0203\3\2\2\2\u0205e\3\2\2\2\u0206\u0209\7-\2\2\u0207\u0209\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209g\3\2\2\2\u020a\u020b\5\u00b8"+
		"]\2\u020b\u020c\5p9\2\u020c\u020f\3\2\2\2\u020d\u020f\5j\66\2\u020e\u020a"+
		"\3\2\2\2\u020e\u020d\3\2\2\2\u020fi\3\2\2\2\u0210\u0211\5n8\2\u0211\u0212"+
		"\5l\67\2\u0212\u0213\5\u00b8]\2\u0213\u0214\5p9\2\u0214k\3\2\2\2\u0215"+
		"\u0216\5n8\2\u0216\u0217\5l\67\2\u0217\u021a\3\2\2\2\u0218\u021a\3\2\2"+
		"\2\u0219\u0215\3\2\2\2\u0219\u0218\3\2\2\2\u021am\3\2\2\2\u021b\u021c"+
		"\t\6\2\2\u021co\3\2\2\2\u021d\u021e\5r:\2\u021e\u021f\7\35\2\2\u021f\u0220"+
		"\5t;\2\u0220\u0224\7\36\2\2\u0221\u0223\5b\62\2\u0222\u0221\3\2\2\2\u0223"+
		"\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2"+
		"\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7\r\2\2\u0228q\3\2\2\2\u0229\u022c"+
		"\7V\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c"+
		"s\3\2\2\2\u022d\u022e\5x=\2\u022e\u022f\5v<\2\u022f\u0232\3\2\2\2\u0230"+
		"\u0232\3\2\2\2\u0231\u022d\3\2\2\2\u0231\u0230\3\2\2\2\u0232u\3\2\2\2"+
		"\u0233\u0234\7\33\2\2\u0234\u0235\5x=\2\u0235\u0236\5v<\2\u0236\u0239"+
		"\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0233\3\2\2\2\u0238\u0237\3\2\2\2\u0239"+
		"w\3\2\2\2\u023a\u023b\5\u008cG\2\u023b\u023c\5z>\2\u023cy\3\2\2\2\u023d"+
		"\u023f\7\63\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3"+
		"\2\2\2\u0240\u0242\t\7\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0244\5\u0096L\2\u0244\u0245\5~@\2\u0245\u0246\5"+
		"|?\2\u0246\u0247\5,\27\2\u0247{\3\2\2\2\u0248\u024b\5\u0094K\2\u0249\u024b"+
		"\7V\2\2\u024a\u0248\3\2\2\2\u024a\u0249\3\2\2\2\u024b}\3\2\2\2\u024c\u024f"+
		"\7\66\2\2\u024d\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2"+
		"\u024f\177\3\2\2\2\u0250\u0251\7\67\2\2\u0251\u0252\78\2\2\u0252\u0253"+
		"\5\u0096L\2\u0253\u0254\5\u0082B\2\u0254\u0255\79\2\2\u0255\u0256\7\r"+
		"\2\2\u0256\u025e\3\2\2\2\u0257\u0258\7:\2\2\u0258\u0259\78\2\2\u0259\u025a"+
		"\5\u0096L\2\u025a\u025b\79\2\2\u025b\u025c\7\r\2\2\u025c\u025e\3\2\2\2"+
		"\u025d\u0250\3\2\2\2\u025d\u0257\3\2\2\2\u025e\u0081\3\2\2\2\u025f\u0260"+
		"\7\33\2\2\u0260\u0263\5\u0096L\2\u0261\u0263\3\2\2\2\u0262\u025f\3\2\2"+
		"\2\u0262\u0261\3\2\2\2\u0263\u0083\3\2\2\2\u0264\u0265\5\u0088E\2\u0265"+
		"\u0085\3\2\2\2\u0266\u0267\5\u008aF\2\u0267\u0087\3\2\2\2\u0268\u0269"+
		"\7;\2\2\u0269\u026a\78\2\2\u026a\u026b\5\u0096L\2\u026b\u026c\7\33\2\2"+
		"\u026c\u026d\5\u0096L\2\u026d\u026e\79\2\2\u026e\u026f\7\r\2\2\u026f\u0089"+
		"\3\2\2\2\u0270\u0271\7<\2\2\u0271\u0272\78\2\2\u0272\u0273\5\u0096L\2"+
		"\u0273\u0274\79\2\2\u0274\u0275\7\r\2\2\u0275\u008b\3\2\2\2\u0276\u0277"+
		"\7\30\2\2\u0277\u0278\5\u0090I\2\u0278\u0279\5\u008eH\2\u0279\u027a\7"+
		"\31\2\2\u027a\u027d\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u0276\3\2\2\2\u027c"+
		"\u027b\3\2\2\2\u027d\u008d\3\2\2\2\u027e\u027f\7\33\2\2\u027f\u0280\5"+
		"\u0090I\2\u0280\u0281\5\u008eH\2\u0281\u0284\3\2\2\2\u0282\u0284\3\2\2"+
		"\2\u0283\u027e\3\2\2\2\u0283\u0282\3\2\2\2\u0284\u008f\3\2\2\2\u0285\u0287"+
		"\5\u0092J\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2"+
		"\2\u0288\u028d\7V\2\2\u0289\u028a\7\35\2\2\u028a\u028b\5t;\2\u028b\u028c"+
		"\7\36\2\2\u028c\u028e\3\2\2\2\u028d\u0289\3\2\2\2\u028d\u028e\3\2\2\2"+
		"\u028e\u02a5\3\2\2\2\u028f\u0291\5\u0092J\2\u0290\u028f\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0294\7V\2\2\u0293\u0292\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7\35\2\2\u0296"+
		"\u0297\5t;\2\u0297\u0298\7\36\2\2\u0298\u02a5\3\2\2\2\u0299\u029b\5\u0092"+
		"J\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c"+
		"\u029e\7V\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02a0\7\35\2\2\u02a0\u02a1\5\u00ba^\2\u02a1\u02a2\7\36\2\2"+
		"\u02a2\u02a5\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u0286\3\2\2\2\u02a4\u0290"+
		"\3\2\2\2\u02a4\u029a\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u0091\3\2\2\2\u02a6"+
		"\u02a7\7V\2\2\u02a7\u02a8\7\27\2\2\u02a8\u0093\3\2\2\2\u02a9\u02aa\t\b"+
		"\2\2\u02aa\u0095\3\2\2\2\u02ab\u02b0\5\u0098M\2\u02ac\u02ad\5\u009aN\2"+
		"\u02ad\u02ae\5\u00b2Z\2\u02ae\u02b0\3\2\2\2\u02af\u02ab\3\2\2\2\u02af"+
		"\u02ac\3\2\2\2\u02b0\u0097\3\2\2\2\u02b1\u02b5\5\u00a0Q\2\u02b2\u02b3"+
		"\7>\2\2\u02b3\u02b5\5\u00b4[\2\u02b4\u02b1\3\2\2\2\u02b4\u02b2\3\2\2\2"+
		"\u02b5\u0099\3\2\2\2\u02b6\u02b7\7\35\2\2\u02b7\u02bc\5\u009cO\2\u02b8"+
		"\u02b9\7?\2\2\u02b9\u02bb\5\u009cO\2\u02ba\u02b8\3\2\2\2\u02bb\u02be\3"+
		"\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be"+
		"\u02bc\3\2\2\2\u02bf\u02c0\7\36\2\2\u02c0\u009b\3\2\2\2\u02c1\u02ca\5"+
		"\u00a0Q\2\u02c2\u02c3\5\u009aN\2\u02c3\u02c4\5\u00b2Z\2\u02c4\u02ca\3"+
		"\2\2\2\u02c5\u02c6\7>\2\2\u02c6\u02c7\7\30\2\2\u02c7\u02c8\7\31\2\2\u02c8"+
		"\u02ca\5\u00b2Z\2\u02c9\u02c1\3\2\2\2\u02c9\u02c2\3\2\2\2\u02c9\u02c5"+
		"\3\2\2\2\u02ca\u009d\3\2\2\2\u02cb\u02cc\7?\2\2\u02cc\u02cd\5\u009cO\2"+
		"\u02cd\u02ce\5\u009eP\2\u02ce\u02d1\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02cb\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1\u009f\3\2\2\2\u02d2\u02d3\5\u00a4"+
		"S\2\u02d3\u02d4\5\u00b2Z\2\u02d4\u02f2\3\2\2\2\u02d5\u02d6\5\u00b0Y\2"+
		"\u02d6\u02d7\5\u00b6\\\2\u02d7\u02f2\3\2\2\2\u02d8\u02d9\7@\2\2\u02d9"+
		"\u02f2\5\u00b2Z\2\u02da\u02db\7A\2\2\u02db\u02f2\5\u00b2Z\2\u02dc\u02dd"+
		"\7B\2\2\u02dd\u02f2\5\u00b2Z\2\u02de\u02df\7V\2\2\u02df\u02f2\5\u00b2"+
		"Z\2\u02e0\u02e1\5\u00aeX\2\u02e1\u02e2\5\u00b6\\\2\u02e2\u02f2\3\2\2\2"+
		"\u02e3\u02e4\7C\2\2\u02e4\u02f2\5\u00b2Z\2\u02e5\u02e6\7D\2\2\u02e6\u02f2"+
		"\5\u00b2Z\2\u02e7\u02e8\7E\2\2\u02e8\u02f2\5\u00b2Z\2\u02e9\u02ea\7F\2"+
		"\2\u02ea\u02f2\5\u00b2Z\2\u02eb\u02ec\7V\2\2\u02ec\u02ed\78\2\2\u02ed"+
		"\u02ee\5\u0096L\2\u02ee\u02ef\79\2\2\u02ef\u02f0\5\u00b6\\\2\u02f0\u02f2"+
		"\3\2\2\2\u02f1\u02d2\3\2\2\2\u02f1\u02d5\3\2\2\2\u02f1\u02d8\3\2\2\2\u02f1"+
		"\u02da\3\2\2\2\u02f1\u02dc\3\2\2\2\u02f1\u02de\3\2\2\2\u02f1\u02e0\3\2"+
		"\2\2\u02f1\u02e3\3\2\2\2\u02f1\u02e5\3\2\2\2\u02f1\u02e7\3\2\2\2\u02f1"+
		"\u02e9\3\2\2\2\u02f1\u02eb\3\2\2\2\u02f2\u00a1\3\2\2\2\u02f3\u02f4\5\u00a4"+
		"S\2\u02f4\u02f5\5\u00b6\\\2\u02f5\u02f9\3\2\2\2\u02f6\u02f7\7V\2\2\u02f7"+
		"\u02f9\5\u00b6\\\2\u02f8\u02f3\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u00a3"+
		"\3\2\2\2\u02fa\u0300\5\u00aaV\2\u02fb\u0300\5\u00a6T\2\u02fc\u0300\7G"+
		"\2\2\u02fd\u0300\7H\2\2\u02fe\u0300\7I\2\2\u02ff\u02fa\3\2\2\2\u02ff\u02fb"+
		"\3\2\2\2\u02ff\u02fc\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300"+
		"\u00a5\3\2\2\2\u0301\u0302\7=\2\2\u0302\u0305\5\u00a8U\2\u0303\u0305\5"+
		"\u00a8U\2\u0304\u0301\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u00a7\3\2\2\2"+
		"\u0306\u0307\t\t\2\2\u0307\u00a9\3\2\2\2\u0308\u0309\7L\2\2\u0309\u030c"+
		"\5\u00acW\2\u030a\u030c\5\u00acW\2\u030b\u0308\3\2\2\2\u030b\u030a\3\2"+
		"\2\2\u030c\u00ab\3\2\2\2\u030d\u0314\7M\2\2\u030e\u0310\7N\2\2\u030f\u030e"+
		"\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0314\3\2\2\2\u0313\u030d\3\2\2\2\u0313\u030f\3\2\2\2\u0314\u00ad\3\2"+
		"\2\2\u0315\u0316\7O\2\2\u0316\u0317\78\2\2\u0317\u0318\5\u0096L\2\u0318"+
		"\u0319\79\2\2\u0319\u0320\3\2\2\2\u031a\u031b\7P\2\2\u031b\u031c\78\2"+
		"\2\u031c\u031d\5\u0096L\2\u031d\u031e\79\2\2\u031e\u0320\3\2\2\2\u031f"+
		"\u0315\3\2\2\2\u031f\u031a\3\2\2\2\u0320\u00af\3\2\2\2\u0321\u0322\7Q"+
		"\2\2\u0322\u0323\78\2\2\u0323\u0324\5\u00b8]\2\u0324\u0325\79\2\2\u0325"+
		"\u00b1\3\2\2\2\u0326\u0327\7\30\2\2\u0327\u0328\7\31\2\2\u0328\u032d\5"+
		"\u00b2Z\2\u0329\u032a\7R\2\2\u032a\u032d\5\u00b4[\2\u032b\u032d\3\2\2"+
		"\2\u032c\u0326\3\2\2\2\u032c\u0329\3\2\2\2\u032c\u032b\3\2\2\2\u032d\u00b3"+
		"\3\2\2\2\u032e\u032f\7\30\2\2\u032f\u0330\7\31\2\2\u0330\u0333\5\u00b2"+
		"Z\2\u0331\u0333\3\2\2\2\u0332\u032e\3\2\2\2\u0332\u0331\3\2\2\2\u0333"+
		"\u00b5\3\2\2\2\u0334\u0337\7R\2\2\u0335\u0337\3\2\2\2\u0336\u0334\3\2"+
		"\2\2\u0336\u0335\3\2\2\2\u0337\u00b7\3\2\2\2\u0338\u033b\5\u0096L\2\u0339"+
		"\u033b\7S\2\2\u033a\u0338\3\2\2\2\u033a\u0339\3\2\2\2\u033b\u00b9\3\2"+
		"\2\2\u033c\u033d\7V\2\2\u033d\u033e\5\u00bc_\2\u033e\u00bb\3\2\2\2\u033f"+
		"\u0340\7\33\2\2\u0340\u0341\7V\2\2\u0341\u0344\5\u00bc_\2\u0342\u0344"+
		"\3\2\2\2\u0343\u033f\3\2\2\2\u0343\u0342\3\2\2\2\u0344\u00bd\3\2\2\2\u0345"+
		"\u0346\7V\2\2\u0346\u00bf\3\2\2\2\u0347\u0348\7V\2\2\u0348\u0349\7\35"+
		"\2\2\u0349\u034a\5t;\2\u034a\u034b\7\36\2\2\u034b\u00c1\3\2\2\2\u034c"+
		"\u034d\7V\2\2\u034d\u034e\7\27\2\2\u034e\u034f\7V\2\2\u034f\u00c3\3\2"+
		"\2\2\u0350\u0351\7V\2\2\u0351\u0352\7\27\2\2\u0352\u0353\7\35\2\2\u0353"+
		"\u0354\5\u00ba^\2\u0354\u0355\7\36\2\2\u0355\u00c5\3\2\2\2\u0356\u0357"+
		"\7V\2\2\u0357\u0358\7\27\2\2\u0358\u0359\7V\2\2\u0359\u035a\7\35\2\2\u035a"+
		"\u035b\5t;\2\u035b\u035c\7\36\2\2\u035c\u00c7\3\2\2\2I\u00c9\u00d5\u00da"+
		"\u00e4\u00ef\u00fb\u0107\u0116\u0124\u0131\u0140\u014a\u0156\u015c\u0164"+
		"\u0168\u0177\u017c\u019b\u01a8\u01b3\u01bb\u01c1\u01cd\u01d8\u01e0\u01e7"+
		"\u01ef\u01fb\u0200\u0204\u0208\u020e\u0219\u0224\u022b\u0231\u0238\u023e"+
		"\u0241\u024a\u024e\u025d\u0262\u027c\u0283\u0286\u028d\u0290\u0293\u029a"+
		"\u029d\u02a4\u02af\u02b4\u02bc\u02c9\u02d0\u02f1\u02f8\u02ff\u0304\u030b"+
		"\u0311\u0313\u031f\u032c\u0332\u0336\u033a\u0343";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}