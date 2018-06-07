package com.away1994.gen.objectivec;// Generated from ObjectiveCParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjectiveCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTORELEASEPOOL=1, CATCH=2, CLASS=3, DYNAMIC=4, ENCODE=5, END=6, FINALLY=7, 
		IMPLEMENTATION=8, INTERFACE=9, IMPORT=10, PACKAGE=11, PROTOCOL=12, OPTIONAL=13, 
		PRIVATE=14, PROPERTY=15, PROTECTED=16, PUBLIC=17, REQUIRED=18, SELECTOR=19, 
		SYNCHRONIZED=20, SYNTHESIZE=21, THROW=22, TRY=23, ABSTRACT=24, AUTO=25, 
		BOOLEAN=26, BREAK=27, BYCOPY=28, BYREF=29, CASE=30, CHAR=31, CONST=32, 
		CONTINUE=33, DEFAULT=34, DO=35, DOUBLE=36, ELSE=37, ENUM=38, EXTERN=39, 
		FLOAT=40, FOR=41, ID=42, IF=43, IN=44, INOUT=45, INSTANCETYPE=46, GOTO=47, 
		INT=48, LONG=49, ONEWAY=50, OUT=51, REGISTER=52, RETURN=53, SHORT=54, 
		SIGNED=55, SIZEOF=56, STATIC=57, STRUCT=58, SWITCH=59, TYPEDEF=60, UNION=61, 
		UNSIGNED=62, VOID=63, VOLATILE=64, WHILE=65, NS_OPTIONS=66, NS_ENUM=67, 
		WWEAK=68, WUNSAFE_UNRETAINED=69, WUNUSED=70, WDEPRECATED=71, WAUTORELEASING=72, 
		TYPEOF=73, TYPEOF__=74, TYPEOF____=75, KINDOF__=76, COVARIANT=77, CONTRAVARIANT=78, 
		ATTRIBUTE=79, NULLABLE=80, NONNULL=81, NS_ASSUME_NONNULL_BEGIN=82, NS_ASSUME_NONNULL_END=83, 
		EXTERN_SUFFIX=84, IOS_SUFFIX=85, MAC_SUFFIX=86, TVOS_PROHIBITED=87, LP=88, 
		RP=89, LBRACE=90, RBRACE=91, LBRACK=92, RBRACK=93, SEMI=94, COMMA=95, 
		DOT=96, STRUCTACCESS=97, AT=98, ASSIGN=99, GT=100, LT=101, BANG=102, TILDE=103, 
		QUESTION=104, COLON=105, EQUAL=106, LE=107, GE=108, NOTEQUAL=109, AND=110, 
		OR=111, INC=112, DEC=113, ADD=114, SUB=115, MUL=116, DIV=117, BITAND=118, 
		BITOR=119, CARET=120, MOD=121, ADD_ASSIGN=122, SUB_ASSIGN=123, MUL_ASSIGN=124, 
		DIV_ASSIGN=125, AND_ASSIGN=126, OR_ASSIGN=127, XOR_ASSIGN=128, MOD_ASSIGN=129, 
		LSHIFT_ASSIGN=130, RSHIFT_ASSIGN=131, ELIPSIS=132, ASSIGNPA=133, GETTER=134, 
		NONATOMIC=135, SETTER=136, STRONG=137, RETAIN=138, READONLY=139, READWRITE=140, 
		WEAK=141, IB_OUTLET=142, IB_OUTLET_COLLECTION=143, IDENTIFIER=144, CHARACTER_LITERAL=145, 
		QUOTE_STRING=146, STRING=147, HEX_LITERAL=148, OCTAL_LITERAL=149, BINARY_LITERAL=150, 
		DECIMAL_LITERAL=151, FLOATING_POINT_LITERAL=152, WS=153, COMMENT=154, 
		LINE_COMMENT=155, BACKSLASH=156;
	public static final int
		RULE_translationUnit = 0, RULE_externalDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_classInterface = 3, RULE_categoryInterface = 4, RULE_classImplementation = 5, 
		RULE_categoryImplementation = 6, RULE_protocolDeclaration = 7, RULE_protocolDeclarationList = 8, 
		RULE_classDeclarationList = 9, RULE_classList = 10, RULE_protocolReferenceList = 11, 
		RULE_protocolList = 12, RULE_propertyDeclaration = 13, RULE_propertyAttributesList = 14, 
		RULE_propertyAttribute = 15, RULE_className = 16, RULE_superclassName = 17, 
		RULE_categoryName = 18, RULE_protocolName = 19, RULE_instanceVariables = 20, 
		RULE_visibilitySpecification = 21, RULE_interfaceDeclarationList = 22, 
		RULE_classMethodDeclaration = 23, RULE_instanceMethodDeclaration = 24, 
		RULE_methodDeclaration = 25, RULE_implementationDefinitionList = 26, RULE_classMethodDefinition = 27, 
		RULE_instanceMethodDefinition = 28, RULE_methodDefinition = 29, RULE_methodSelector = 30, 
		RULE_keywordDeclarator = 31, RULE_selector = 32, RULE_methodType = 33, 
		RULE_methodReturnType = 34, RULE_propertyImplementation = 35, RULE_propertySynthesizeList = 36, 
		RULE_propertySynthesizeItem = 37, RULE_blockType = 38, RULE_genericsSpecifier = 39, 
		RULE_protocolQualifier = 40, RULE_dictionaryExpression = 41, RULE_dictionaryPair = 42, 
		RULE_arrayExpression = 43, RULE_boxExpression = 44, RULE_blockParameters = 45, 
		RULE_blockExpression = 46, RULE_messageExpression = 47, RULE_receiver = 48, 
		RULE_messageSelector = 49, RULE_keywordArgument = 50, RULE_selectorExpression = 51, 
		RULE_selectorName = 52, RULE_protocolExpression = 53, RULE_encodeExpression = 54, 
		RULE_typeVariableDeclarator = 55, RULE_throwStatement = 56, RULE_tryBlock = 57, 
		RULE_catchStatement = 58, RULE_synchronizedStatement = 59, RULE_autoreleaseStatement = 60, 
		RULE_functionDefinition = 61, RULE_attributeSpecifier = 62, RULE_attribute = 63, 
		RULE_attributeName = 64, RULE_attributeParameters = 65, RULE_attributeParameterList = 66, 
		RULE_attributeParameter = 67, RULE_attributeParameterAssignment = 68, 
		RULE_declaration = 69, RULE_functionCallDeclaration = 70, RULE_enumDeclaration = 71, 
		RULE_varDeclaration = 72, RULE_declarationSpecifiers = 73, RULE_ibOutletSpecifier = 74, 
		RULE_initDeclaratorList = 75, RULE_initDeclarator = 76, RULE_structOrUnionSpecifier = 77, 
		RULE_structDeclaration = 78, RULE_specifierQualifierList = 79, RULE_arcBehaviourSpecifier = 80, 
		RULE_nullabilitySpecifier = 81, RULE_storageClassSpecifier = 82, RULE_typeSpecifier = 83, 
		RULE_typeQualifier = 84, RULE_typeofExpression = 85, RULE_classNameGeneric = 86, 
		RULE_structDeclaratorList = 87, RULE_structDeclarator = 88, RULE_enumSpecifier = 89, 
		RULE_enumeratorList = 90, RULE_enumerator = 91, RULE_enumeratorIdentifier = 92, 
		RULE_directDeclarator = 93, RULE_declaratorSuffix = 94, RULE_parameterList = 95, 
		RULE_pointer = 96, RULE_macros = 97, RULE_initializer = 98, RULE_arrayInitializer = 99, 
		RULE_structInitializer = 100, RULE_initializerList = 101, RULE_typeName = 102, 
		RULE_abstractDeclarator = 103, RULE_abstractDeclaratorSuffix = 104, RULE_parameterDeclarationList = 105, 
		RULE_parameterDeclaration = 106, RULE_declarator = 107, RULE_statement = 108, 
		RULE_labeledStatement = 109, RULE_rangeExpression = 110, RULE_compoundStatement = 111, 
		RULE_selectionStatement = 112, RULE_switchStatement = 113, RULE_switchBlock = 114, 
		RULE_switchSection = 115, RULE_switchLabel = 116, RULE_forLoopInitializer = 117, 
		RULE_iterationStatement = 118, RULE_whileStatement = 119, RULE_doStatement = 120, 
		RULE_forStatement = 121, RULE_forInStatement = 122, RULE_jumpStatement = 123, 
		RULE_expression = 124, RULE_assignmentExpression = 125, RULE_conditionalExpression = 126, 
		RULE_binaryExpression = 127, RULE_castExpression = 128, RULE_assignmentOperator = 129, 
		RULE_constantExpression = 130, RULE_unaryExpression = 131, RULE_unaryOperator = 132, 
		RULE_postfixExpression = 133, RULE_argumentExpressionList = 134, RULE_argumentExpression = 135, 
		RULE_primaryExpression = 136, RULE_constant = 137, RULE_stringLiteral = 138, 
		RULE_identifier = 139;
	public static final String[] ruleNames = {
		"translationUnit", "externalDeclaration", "importDeclaration", "classInterface", 
		"categoryInterface", "classImplementation", "categoryImplementation", 
		"protocolDeclaration", "protocolDeclarationList", "classDeclarationList", 
		"classList", "protocolReferenceList", "protocolList", "propertyDeclaration", 
		"propertyAttributesList", "propertyAttribute", "className", "superclassName", 
		"categoryName", "protocolName", "instanceVariables", "visibilitySpecification", 
		"interfaceDeclarationList", "classMethodDeclaration", "instanceMethodDeclaration", 
		"methodDeclaration", "implementationDefinitionList", "classMethodDefinition", 
		"instanceMethodDefinition", "methodDefinition", "methodSelector", "keywordDeclarator", 
		"selector", "methodType", "methodReturnType", "propertyImplementation", 
		"propertySynthesizeList", "propertySynthesizeItem", "blockType", "genericsSpecifier", 
		"protocolQualifier", "dictionaryExpression", "dictionaryPair", "arrayExpression", 
		"boxExpression", "blockParameters", "blockExpression", "messageExpression", 
		"receiver", "messageSelector", "keywordArgument", "selectorExpression", 
		"selectorName", "protocolExpression", "encodeExpression", "typeVariableDeclarator", 
		"throwStatement", "tryBlock", "catchStatement", "synchronizedStatement", 
		"autoreleaseStatement", "functionDefinition", "attributeSpecifier", "attribute", 
		"attributeName", "attributeParameters", "attributeParameterList", "attributeParameter", 
		"attributeParameterAssignment", "declaration", "functionCallDeclaration", 
		"enumDeclaration", "varDeclaration", "declarationSpecifiers", "ibOutletSpecifier", 
		"initDeclaratorList", "initDeclarator", "structOrUnionSpecifier", "structDeclaration", 
		"specifierQualifierList", "arcBehaviourSpecifier", "nullabilitySpecifier", 
		"storageClassSpecifier", "typeSpecifier", "typeQualifier", "typeofExpression", 
		"classNameGeneric", "structDeclaratorList", "structDeclarator", "enumSpecifier", 
		"enumeratorList", "enumerator", "enumeratorIdentifier", "directDeclarator", 
		"declaratorSuffix", "parameterList", "pointer", "macros", "initializer", 
		"arrayInitializer", "structInitializer", "initializerList", "typeName", 
		"abstractDeclarator", "abstractDeclaratorSuffix", "parameterDeclarationList", 
		"parameterDeclaration", "declarator", "statement", "labeledStatement", 
		"rangeExpression", "compoundStatement", "selectionStatement", "switchStatement", 
		"switchBlock", "switchSection", "switchLabel", "forLoopInitializer", "iterationStatement", 
		"whileStatement", "doStatement", "forStatement", "forInStatement", "jumpStatement", 
		"expression", "assignmentExpression", "conditionalExpression", "binaryExpression", 
		"castExpression", "assignmentOperator", "constantExpression", "unaryExpression", 
		"unaryOperator", "postfixExpression", "argumentExpressionList", "argumentExpression", 
		"primaryExpression", "constant", "stringLiteral", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@autoreleasepool'", "'@catch'", "'@class'", "'@dynamic'", "'@encode'", 
		"'@end'", "'@finally'", "'@implementation'", "'@interface'", "'@import'", 
		"'@package'", "'@protocol'", "'@optional'", "'@private'", "'@property'", 
		"'@protected'", "'@public'", "'@required'", "'@selector'", "'@synchronized'", 
		"'@synthesize'", "'@throw'", "'@try'", "'abstract'", "'auto'", "'boolean'", 
		"'break'", "'bycopy'", "'byref'", "'case'", "'char'", "'const'", "'continue'", 
		"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
		"'for'", "'id'", "'if'", "'in'", "'inout'", "'instancetype'", "'goto'", 
		"'int'", "'long'", "'oneway'", "'out'", "'register'", "'return'", "'short'", 
		"'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", 
		"'union'", "'unsigned'", "'void'", "'volatile'", "'while'", "'NS_OPTIONS'", 
		"'NS_ENUM'", "'__weak'", "'__unsafe_unretained'", "'__unused'", "'__deprecated'", 
		"'__autoreleasing'", "'typeof'", "'__typeof'", "'__typeof__'", "'__kindof'", 
		"'__covariant'", "'__contravariant'", "'__attribute__'", "'nullable'", 
		"'nonnull'", null, null, null, null, null, "'__TVOS_PROHIBITED'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'@'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'...'", "'assign'", "'getter'", "'nonatomic'", 
		"'setter'", "'strong'", "'retain'", "'readonly'", "'readwrite'", "'weak'", 
		"'IBOutlet'", "'IBOutletCollection'", null, null, null, null, null, null, 
		null, null, null, null, null, null, "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AUTORELEASEPOOL", "CATCH", "CLASS", "DYNAMIC", "ENCODE", "END", 
		"FINALLY", "IMPLEMENTATION", "INTERFACE", "IMPORT", "PACKAGE", "PROTOCOL", 
		"OPTIONAL", "PRIVATE", "PROPERTY", "PROTECTED", "PUBLIC", "REQUIRED", 
		"SELECTOR", "SYNCHRONIZED", "SYNTHESIZE", "THROW", "TRY", "ABSTRACT", 
		"AUTO", "BOOLEAN", "BREAK", "BYCOPY", "BYREF", "CASE", "CHAR", "CONST", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", 
		"FOR", "ID", "IF", "IN", "INOUT", "INSTANCETYPE", "GOTO", "INT", "LONG", 
		"ONEWAY", "OUT", "REGISTER", "RETURN", "SHORT", "SIGNED", "SIZEOF", "STATIC", 
		"STRUCT", "SWITCH", "TYPEDEF", "UNION", "UNSIGNED", "VOID", "VOLATILE", 
		"WHILE", "NS_OPTIONS", "NS_ENUM", "WWEAK", "WUNSAFE_UNRETAINED", "WUNUSED", 
		"WDEPRECATED", "WAUTORELEASING", "TYPEOF", "TYPEOF__", "TYPEOF____", "KINDOF__", 
		"COVARIANT", "CONTRAVARIANT", "ATTRIBUTE", "NULLABLE", "NONNULL", "NS_ASSUME_NONNULL_BEGIN", 
		"NS_ASSUME_NONNULL_END", "EXTERN_SUFFIX", "IOS_SUFFIX", "MAC_SUFFIX", 
		"TVOS_PROHIBITED", "LP", "RP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "STRUCTACCESS", "AT", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"ELIPSIS", "ASSIGNPA", "GETTER", "NONATOMIC", "SETTER", "STRONG", "RETAIN", 
		"READONLY", "READWRITE", "WEAK", "IB_OUTLET", "IB_OUTLET_COLLECTION", 
		"IDENTIFIER", "CHARACTER_LITERAL", "QUOTE_STRING", "STRING", "HEX_LITERAL", 
		"OCTAL_LITERAL", "BINARY_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", 
		"WS", "COMMENT", "LINE_COMMENT", "BACKSLASH"
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
	public String getGrammarFileName() { return "ObjectiveCParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjectiveCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ObjectiveCParser.EOF, 0); }
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << DYNAMIC) | (1L << IMPLEMENTATION) | (1L << INTERFACE) | (1L << IMPORT) | (1L << PROTOCOL) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				{
				setState(280);
				externalDeclaration();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
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

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ClassInterfaceContext classInterface() {
			return getRuleContext(ClassInterfaceContext.class,0);
		}
		public ClassImplementationContext classImplementation() {
			return getRuleContext(ClassImplementationContext.class,0);
		}
		public CategoryInterfaceContext categoryInterface() {
			return getRuleContext(CategoryInterfaceContext.class,0);
		}
		public CategoryImplementationContext categoryImplementation() {
			return getRuleContext(CategoryImplementationContext.class,0);
		}
		public ProtocolDeclarationContext protocolDeclaration() {
			return getRuleContext(ProtocolDeclarationContext.class,0);
		}
		public ProtocolDeclarationListContext protocolDeclarationList() {
			return getRuleContext(ProtocolDeclarationListContext.class,0);
		}
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_externalDeclaration);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				importDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				classInterface();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				classImplementation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				categoryInterface();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				categoryImplementation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(295);
				protocolDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				protocolDeclarationList();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				classDeclarationList();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(298);
				implementationDefinitionList();
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(IMPORT);
			setState(302);
			identifier();
			setState(303);
			match(SEMI);
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

	public static class ClassInterfaceContext extends ParserRuleContext {
		public ClassNameGenericContext classNameGeneric() {
			return getRuleContext(ClassNameGenericContext.class,0);
		}
		public SuperclassNameContext superclassName() {
			return getRuleContext(SuperclassNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList() {
			return getRuleContext(InterfaceDeclarationListContext.class,0);
		}
		public ClassInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitClassInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInterfaceContext classInterface() throws RecognitionException {
		ClassInterfaceContext _localctx = new ClassInterfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(INTERFACE);
			setState(306);
			classNameGeneric();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(307);
				match(COLON);
				setState(308);
				superclassName();
				}
			}

			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(311);
				protocolReferenceList();
				}
			}

			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(314);
				instanceVariables();
				}
			}

			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(317);
				interfaceDeclarationList();
				}
			}

			setState(320);
			match(END);
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

	public static class CategoryInterfaceContext extends ParserRuleContext {
		public ClassNameGenericContext classNameGeneric() {
			return getRuleContext(ClassNameGenericContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CategoryNameContext categoryName() {
			return getRuleContext(CategoryNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList() {
			return getRuleContext(InterfaceDeclarationListContext.class,0);
		}
		public CategoryInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCategoryInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCategoryInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitCategoryInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CategoryInterfaceContext categoryInterface() throws RecognitionException {
		CategoryInterfaceContext _localctx = new CategoryInterfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_categoryInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(INTERFACE);
			setState(323);
			classNameGeneric();
			setState(324);
			match(LP);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(325);
				categoryName();
				}
			}

			setState(328);
			match(RP);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(329);
				protocolReferenceList();
				}
			}

			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(332);
				instanceVariables();
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(335);
				interfaceDeclarationList();
				}
			}

			setState(338);
			match(END);
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

	public static class ClassImplementationContext extends ParserRuleContext {
		public ClassNameGenericContext classNameGeneric() {
			return getRuleContext(ClassNameGenericContext.class,0);
		}
		public SuperclassNameContext superclassName() {
			return getRuleContext(SuperclassNameContext.class,0);
		}
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public ClassImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitClassImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassImplementationContext classImplementation() throws RecognitionException {
		ClassImplementationContext _localctx = new ClassImplementationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(IMPLEMENTATION);
			setState(341);
			classNameGeneric();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(342);
				match(COLON);
				setState(343);
				superclassName();
				}
			}

			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(346);
				instanceVariables();
				}
			}

			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(349);
				implementationDefinitionList();
				}
			}

			setState(352);
			match(END);
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

	public static class CategoryImplementationContext extends ParserRuleContext {
		public ClassNameGenericContext classNameGeneric() {
			return getRuleContext(ClassNameGenericContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public CategoryNameContext categoryName() {
			return getRuleContext(CategoryNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public CategoryImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCategoryImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCategoryImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitCategoryImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CategoryImplementationContext categoryImplementation() throws RecognitionException {
		CategoryImplementationContext _localctx = new CategoryImplementationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_categoryImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(IMPLEMENTATION);
			setState(355);
			classNameGeneric();
			setState(356);
			match(LP);
			setState(357);
			categoryName();
			setState(358);
			match(RP);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(359);
				implementationDefinitionList();
				}
			}

			setState(362);
			match(END);
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

	public static class ProtocolDeclarationContext extends ParserRuleContext {
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public List<InterfaceDeclarationListContext> interfaceDeclarationList() {
			return getRuleContexts(InterfaceDeclarationListContext.class);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList(int i) {
			return getRuleContext(InterfaceDeclarationListContext.class,i);
		}
		public ProtocolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitProtocolDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolDeclarationContext protocolDeclaration() throws RecognitionException {
		ProtocolDeclarationContext _localctx = new ProtocolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(PROTOCOL);
			setState(365);
			protocolName();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(366);
				protocolReferenceList();
				}
			}

			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONAL) | (1L << PROPERTY) | (1L << REQUIRED) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(372);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REQUIRED:
					{
					setState(369);
					match(REQUIRED);
					}
					break;
				case PROPERTY:
				case AUTO:
				case BYCOPY:
				case BYREF:
				case CHAR:
				case CONST:
				case DOUBLE:
				case ENUM:
				case EXTERN:
				case FLOAT:
				case ID:
				case IN:
				case INOUT:
				case INSTANCETYPE:
				case INT:
				case LONG:
				case ONEWAY:
				case OUT:
				case REGISTER:
				case SHORT:
				case SIGNED:
				case SIZEOF:
				case STATIC:
				case STRUCT:
				case TYPEDEF:
				case UNION:
				case UNSIGNED:
				case VOID:
				case VOLATILE:
				case NS_OPTIONS:
				case NS_ENUM:
				case WWEAK:
				case WUNSAFE_UNRETAINED:
				case WUNUSED:
				case WDEPRECATED:
				case WAUTORELEASING:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case ATTRIBUTE:
				case NULLABLE:
				case ADD:
				case SUB:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IDENTIFIER:
					{
					setState(370);
					interfaceDeclarationList();
					}
					break;
				case OPTIONAL:
					{
					setState(371);
					match(OPTIONAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			match(END);
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

	public static class ProtocolDeclarationListContext extends ParserRuleContext {
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public ProtocolDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitProtocolDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolDeclarationListContext protocolDeclarationList() throws RecognitionException {
		ProtocolDeclarationListContext _localctx = new ProtocolDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_protocolDeclarationList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(PROTOCOL);
			setState(380);
			protocolList();
			setState(381);
			match(SEMI);
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

	public static class ClassDeclarationListContext extends ParserRuleContext {
		public ClassListContext classList() {
			return getRuleContext(ClassListContext.class,0);
		}
		public ClassDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitClassDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationListContext classDeclarationList() throws RecognitionException {
		ClassDeclarationListContext _localctx = new ClassDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclarationList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(CLASS);
			setState(384);
			classList();
			setState(385);
			match(SEMI);
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

	public static class ClassListContext extends ParserRuleContext {
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public ClassListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitClassList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassListContext classList() throws RecognitionException {
		ClassListContext _localctx = new ClassListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			className();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(389);
				className();
				}
				}
				setState(394);
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

	public static class ProtocolReferenceListContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public ProtocolReferenceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolReferenceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolReferenceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolReferenceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitProtocolReferenceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolReferenceListContext protocolReferenceList() throws RecognitionException {
		ProtocolReferenceListContext _localctx = new ProtocolReferenceListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_protocolReferenceList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(LT);
			setState(396);
			protocolList();
			setState(397);
			match(GT);
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

	public static class ProtocolListContext extends ParserRuleContext {
		public List<ProtocolNameContext> protocolName() {
			return getRuleContexts(ProtocolNameContext.class);
		}
		public ProtocolNameContext protocolName(int i) {
			return getRuleContext(ProtocolNameContext.class,i);
		}
		public ProtocolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitProtocolList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolListContext protocolList() throws RecognitionException {
		ProtocolListContext _localctx = new ProtocolListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_protocolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			protocolName();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(400);
				match(COMMA);
				setState(401);
				protocolName();
				}
				}
				setState(406);
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

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public PropertyAttributesListContext propertyAttributesList() {
			return getRuleContext(PropertyAttributesListContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public IbOutletSpecifierContext ibOutletSpecifier() {
			return getRuleContext(IbOutletSpecifierContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(PROPERTY);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(408);
				match(LP);
				setState(409);
				propertyAttributesList();
				setState(410);
				match(RP);
				}
			}

			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IB_OUTLET || _la==IB_OUTLET_COLLECTION) {
				{
				setState(414);
				ibOutletSpecifier();
				}
			}

			setState(417);
			structDeclaration();
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

	public static class PropertyAttributesListContext extends ParserRuleContext {
		public List<PropertyAttributeContext> propertyAttribute() {
			return getRuleContexts(PropertyAttributeContext.class);
		}
		public PropertyAttributeContext propertyAttribute(int i) {
			return getRuleContext(PropertyAttributeContext.class,i);
		}
		public PropertyAttributesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAttributesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyAttributesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyAttributesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPropertyAttributesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAttributesListContext propertyAttributesList() throws RecognitionException {
		PropertyAttributesListContext _localctx = new PropertyAttributesListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_propertyAttributesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			propertyAttribute();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(420);
				match(COMMA);
				setState(421);
				propertyAttribute();
				}
				}
				setState(426);
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

	public static class PropertyAttributeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public PropertyAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPropertyAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAttributeContext propertyAttribute() throws RecognitionException {
		PropertyAttributeContext _localctx = new PropertyAttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_propertyAttribute);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(NONATOMIC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(ASSIGNPA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(WEAK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
				match(STRONG);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(431);
				match(RETAIN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(432);
				match(READONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(433);
				match(READWRITE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(434);
				match(GETTER);
				setState(435);
				match(ASSIGN);
				setState(436);
				identifier();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(437);
				match(SETTER);
				setState(438);
				match(ASSIGN);
				setState(439);
				identifier();
				setState(440);
				match(COLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(442);
				nullabilitySpecifier();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(443);
				identifier();
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

	public static class ClassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			identifier();
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

	public static class SuperclassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SuperclassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSuperclassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSuperclassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSuperclassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassNameContext superclassName() throws RecognitionException {
		SuperclassNameContext _localctx = new SuperclassNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_superclassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			identifier();
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

	public static class CategoryNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CategoryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCategoryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCategoryName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitCategoryName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CategoryNameContext categoryName() throws RecognitionException {
		CategoryNameContext _localctx = new CategoryNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_categoryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			identifier();
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

	public static class ProtocolNameContext extends ParserRuleContext {
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitProtocolName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolNameContext protocolName() throws RecognitionException {
		ProtocolNameContext _localctx = new ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_protocolName);
		int _la;
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				protocolReferenceList();
				}
				break;
			case ID:
			case SIZEOF:
			case WWEAK:
			case WUNUSED:
			case TYPEOF:
			case TYPEOF__:
			case TYPEOF____:
			case KINDOF__:
			case COVARIANT:
			case CONTRAVARIANT:
			case NULLABLE:
			case ASSIGNPA:
			case GETTER:
			case NONATOMIC:
			case SETTER:
			case STRONG:
			case RETAIN:
			case READONLY:
			case READWRITE:
			case WEAK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(453);
					_la = _input.LA(1);
					if ( !(_la==COVARIANT || _la==CONTRAVARIANT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(456);
				identifier();
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

	public static class InstanceVariablesContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public VisibilitySpecificationContext visibilitySpecification() {
			return getRuleContext(VisibilitySpecificationContext.class,0);
		}
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InstanceVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInstanceVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInstanceVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitInstanceVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceVariablesContext instanceVariables() throws RecognitionException {
		InstanceVariablesContext _localctx = new InstanceVariablesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_instanceVariables);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(LBRACE);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					{
					setState(460);
					structDeclaration();
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(LBRACE);
				setState(468);
				visibilitySpecification();
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(469);
					structDeclaration();
					}
					}
					setState(472); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
				setState(474);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(LBRACE);
				setState(478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(477);
					structDeclaration();
					}
					}
					setState(480); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
				setState(482);
				instanceVariables();
				setState(483);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(LBRACE);
				setState(486);
				visibilitySpecification();
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(487);
					structDeclaration();
					}
					}
					setState(490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
				setState(492);
				instanceVariables();
				setState(493);
				match(RBRACE);
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

	public static class VisibilitySpecificationContext extends ParserRuleContext {
		public VisibilitySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilitySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterVisibilitySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitVisibilitySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitVisibilitySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilitySpecificationContext visibilitySpecification() throws RecognitionException {
		VisibilitySpecificationContext _localctx = new VisibilitySpecificationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_visibilitySpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
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

	public static class InterfaceDeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ClassMethodDeclarationContext> classMethodDeclaration() {
			return getRuleContexts(ClassMethodDeclarationContext.class);
		}
		public ClassMethodDeclarationContext classMethodDeclaration(int i) {
			return getRuleContext(ClassMethodDeclarationContext.class,i);
		}
		public List<InstanceMethodDeclarationContext> instanceMethodDeclaration() {
			return getRuleContexts(InstanceMethodDeclarationContext.class);
		}
		public InstanceMethodDeclarationContext instanceMethodDeclaration(int i) {
			return getRuleContext(InstanceMethodDeclarationContext.class,i);
		}
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public InterfaceDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInterfaceDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInterfaceDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitInterfaceDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationListContext interfaceDeclarationList() throws RecognitionException {
		InterfaceDeclarationListContext _localctx = new InterfaceDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(503);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AUTO:
					case BYCOPY:
					case BYREF:
					case CHAR:
					case CONST:
					case DOUBLE:
					case ENUM:
					case EXTERN:
					case FLOAT:
					case ID:
					case IN:
					case INOUT:
					case INSTANCETYPE:
					case INT:
					case LONG:
					case ONEWAY:
					case OUT:
					case REGISTER:
					case SHORT:
					case SIGNED:
					case SIZEOF:
					case STATIC:
					case STRUCT:
					case TYPEDEF:
					case UNION:
					case UNSIGNED:
					case VOID:
					case VOLATILE:
					case NS_OPTIONS:
					case NS_ENUM:
					case WWEAK:
					case WUNSAFE_UNRETAINED:
					case WUNUSED:
					case WDEPRECATED:
					case WAUTORELEASING:
					case TYPEOF:
					case TYPEOF__:
					case TYPEOF____:
					case KINDOF__:
					case COVARIANT:
					case CONTRAVARIANT:
					case ATTRIBUTE:
					case NULLABLE:
					case ASSIGNPA:
					case GETTER:
					case NONATOMIC:
					case SETTER:
					case STRONG:
					case RETAIN:
					case READONLY:
					case READWRITE:
					case WEAK:
					case IB_OUTLET:
					case IB_OUTLET_COLLECTION:
					case IDENTIFIER:
						{
						setState(499);
						declaration();
						}
						break;
					case ADD:
						{
						setState(500);
						classMethodDeclaration();
						}
						break;
					case SUB:
						{
						setState(501);
						instanceMethodDeclaration();
						}
						break;
					case PROPERTY:
						{
						setState(502);
						propertyDeclaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(505); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class ClassMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitClassMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodDeclarationContext classMethodDeclaration() throws RecognitionException {
		ClassMethodDeclarationContext _localctx = new ClassMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(ADD);
			setState(508);
			methodDeclaration();
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

	public static class InstanceMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public InstanceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInstanceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInstanceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitInstanceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceMethodDeclarationContext instanceMethodDeclaration() throws RecognitionException {
		InstanceMethodDeclarationContext _localctx = new InstanceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_instanceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(SUB);
			setState(511);
			methodDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class,0);
		}
		public MacrosContext macros() {
			return getRuleContext(MacrosContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(513);
				methodReturnType();
				}
			}

			setState(516);
			methodSelector();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(517);
				macros();
				}
			}

			setState(520);
			match(SEMI);
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

	public static class ImplementationDefinitionListContext extends ParserRuleContext {
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ClassMethodDefinitionContext> classMethodDefinition() {
			return getRuleContexts(ClassMethodDefinitionContext.class);
		}
		public ClassMethodDefinitionContext classMethodDefinition(int i) {
			return getRuleContext(ClassMethodDefinitionContext.class,i);
		}
		public List<InstanceMethodDefinitionContext> instanceMethodDefinition() {
			return getRuleContexts(InstanceMethodDefinitionContext.class);
		}
		public InstanceMethodDefinitionContext instanceMethodDefinition(int i) {
			return getRuleContext(InstanceMethodDefinitionContext.class,i);
		}
		public List<PropertyImplementationContext> propertyImplementation() {
			return getRuleContexts(PropertyImplementationContext.class);
		}
		public PropertyImplementationContext propertyImplementation(int i) {
			return getRuleContext(PropertyImplementationContext.class,i);
		}
		public ImplementationDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementationDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterImplementationDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitImplementationDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitImplementationDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementationDefinitionListContext implementationDefinitionList() throws RecognitionException {
		ImplementationDefinitionListContext _localctx = new ImplementationDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_implementationDefinitionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(527); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(527);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(522);
						functionDefinition();
						}
						break;
					case 2:
						{
						setState(523);
						declaration();
						}
						break;
					case 3:
						{
						setState(524);
						classMethodDefinition();
						}
						break;
					case 4:
						{
						setState(525);
						instanceMethodDefinition();
						}
						break;
					case 5:
						{
						setState(526);
						propertyImplementation();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(529); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class ClassMethodDefinitionContext extends ParserRuleContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public ClassMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitClassMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodDefinitionContext classMethodDefinition() throws RecognitionException {
		ClassMethodDefinitionContext _localctx = new ClassMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_classMethodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(ADD);
			setState(532);
			methodDefinition();
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

	public static class InstanceMethodDefinitionContext extends ParserRuleContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public InstanceMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInstanceMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInstanceMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitInstanceMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceMethodDefinitionContext instanceMethodDefinition() throws RecognitionException {
		InstanceMethodDefinitionContext _localctx = new InstanceMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_instanceMethodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(SUB);
			setState(535);
			methodDefinition();
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

	public static class MethodDefinitionContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(537);
				methodType();
				}
			}

			setState(540);
			methodSelector();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (LP - 42)))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (MUL - 116)) | (1L << (ASSIGNPA - 116)) | (1L << (GETTER - 116)) | (1L << (NONATOMIC - 116)) | (1L << (SETTER - 116)) | (1L << (STRONG - 116)) | (1L << (RETAIN - 116)) | (1L << (READONLY - 116)) | (1L << (READWRITE - 116)) | (1L << (WEAK - 116)) | (1L << (IDENTIFIER - 116)))) != 0)) {
				{
				setState(541);
				initDeclaratorList();
				}
			}

			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(544);
				match(SEMI);
				}
			}

			setState(547);
			compoundStatement();
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

	public static class MethodSelectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<KeywordDeclaratorContext> keywordDeclarator() {
			return getRuleContexts(KeywordDeclaratorContext.class);
		}
		public KeywordDeclaratorContext keywordDeclarator(int i) {
			return getRuleContext(KeywordDeclaratorContext.class,i);
		}
		public MethodSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMethodSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMethodSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitMethodSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSelectorContext methodSelector() throws RecognitionException {
		MethodSelectorContext _localctx = new MethodSelectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodSelector);
		int _la;
		try {
			int _alt;
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(550);
						keywordDeclarator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(553); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(555);
					match(COMMA);
					setState(556);
					match(ELIPSIS);
					}
				}

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

	public static class KeywordDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<MethodTypeContext> methodType() {
			return getRuleContexts(MethodTypeContext.class);
		}
		public MethodTypeContext methodType(int i) {
			return getRuleContext(MethodTypeContext.class,i);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier() {
			return getRuleContext(ArcBehaviourSpecifierContext.class,0);
		}
		public KeywordDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterKeywordDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitKeywordDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitKeywordDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordDeclaratorContext keywordDeclarator() throws RecognitionException {
		KeywordDeclaratorContext _localctx = new KeywordDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_keywordDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(561);
				selector();
				}
			}

			setState(564);
			match(COLON);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LP) {
				{
				{
				setState(565);
				methodType();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(571);
				arcBehaviourSpecifier();
				}
				break;
			}
			setState(574);
			identifier();
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

	public static class SelectorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selector);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SIZEOF:
			case WWEAK:
			case WUNUSED:
			case TYPEOF:
			case TYPEOF__:
			case TYPEOF____:
			case KINDOF__:
			case COVARIANT:
			case CONTRAVARIANT:
			case NULLABLE:
			case ASSIGNPA:
			case GETTER:
			case NONATOMIC:
			case SETTER:
			case STRONG:
			case RETAIN:
			case READONLY:
			case READWRITE:
			case WEAK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				match(RETURN);
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

	public static class MethodTypeContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMethodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_methodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(LP);
			setState(581);
			typeName();
			setState(582);
			match(RP);
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

	public static class MethodReturnTypeContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public MethodReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMethodReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMethodReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitMethodReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
		MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			methodType();
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

	public static class PropertyImplementationContext extends ParserRuleContext {
		public PropertySynthesizeListContext propertySynthesizeList() {
			return getRuleContext(PropertySynthesizeListContext.class,0);
		}
		public PropertyImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPropertyImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyImplementationContext propertyImplementation() throws RecognitionException {
		PropertyImplementationContext _localctx = new PropertyImplementationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_propertyImplementation);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNTHESIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(SYNTHESIZE);
				setState(587);
				propertySynthesizeList();
				setState(588);
				match(SEMI);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(DYNAMIC);
				setState(591);
				propertySynthesizeList();
				setState(592);
				match(SEMI);
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

	public static class PropertySynthesizeListContext extends ParserRuleContext {
		public List<PropertySynthesizeItemContext> propertySynthesizeItem() {
			return getRuleContexts(PropertySynthesizeItemContext.class);
		}
		public PropertySynthesizeItemContext propertySynthesizeItem(int i) {
			return getRuleContext(PropertySynthesizeItemContext.class,i);
		}
		public PropertySynthesizeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySynthesizeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertySynthesizeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertySynthesizeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPropertySynthesizeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySynthesizeListContext propertySynthesizeList() throws RecognitionException {
		PropertySynthesizeListContext _localctx = new PropertySynthesizeListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_propertySynthesizeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			propertySynthesizeItem();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(597);
				match(COMMA);
				setState(598);
				propertySynthesizeItem();
				}
				}
				setState(603);
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

	public static class PropertySynthesizeItemContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PropertySynthesizeItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySynthesizeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertySynthesizeItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertySynthesizeItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPropertySynthesizeItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySynthesizeItemContext propertySynthesizeItem() throws RecognitionException {
		PropertySynthesizeItemContext _localctx = new PropertySynthesizeItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_propertySynthesizeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			identifier();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(605);
				match(ASSIGN);
				setState(606);
				identifier();
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

	public static class BlockTypeContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBlockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBlockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitBlockType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockTypeContext blockType() throws RecognitionException {
		BlockTypeContext _localctx = new BlockTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_blockType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			typeSpecifier();
			setState(610);
			match(LP);
			setState(611);
			match(CARET);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (CHAR - 31)) | (1L << (DOUBLE - 31)) | (1L << (ENUM - 31)) | (1L << (FLOAT - 31)) | (1L << (ID - 31)) | (1L << (INSTANCETYPE - 31)) | (1L << (INT - 31)) | (1L << (LONG - 31)) | (1L << (SHORT - 31)) | (1L << (SIGNED - 31)) | (1L << (SIZEOF - 31)) | (1L << (STRUCT - 31)) | (1L << (UNION - 31)) | (1L << (UNSIGNED - 31)) | (1L << (VOID - 31)) | (1L << (NS_OPTIONS - 31)) | (1L << (NS_ENUM - 31)) | (1L << (WWEAK - 31)) | (1L << (WUNUSED - 31)) | (1L << (TYPEOF - 31)) | (1L << (TYPEOF__ - 31)) | (1L << (TYPEOF____ - 31)) | (1L << (KINDOF__ - 31)) | (1L << (COVARIANT - 31)) | (1L << (CONTRAVARIANT - 31)) | (1L << (NULLABLE - 31)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(612);
				typeSpecifier();
				}
			}

			setState(615);
			match(RP);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(616);
				blockParameters();
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

	public static class GenericsSpecifierContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public GenericsSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericsSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterGenericsSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitGenericsSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitGenericsSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericsSpecifierContext genericsSpecifier() throws RecognitionException {
		GenericsSpecifierContext _localctx = new GenericsSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_genericsSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(LT);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (CHAR - 31)) | (1L << (DOUBLE - 31)) | (1L << (ENUM - 31)) | (1L << (FLOAT - 31)) | (1L << (ID - 31)) | (1L << (INSTANCETYPE - 31)) | (1L << (INT - 31)) | (1L << (LONG - 31)) | (1L << (SHORT - 31)) | (1L << (SIGNED - 31)) | (1L << (SIZEOF - 31)) | (1L << (STRUCT - 31)) | (1L << (UNION - 31)) | (1L << (UNSIGNED - 31)) | (1L << (VOID - 31)) | (1L << (NS_OPTIONS - 31)) | (1L << (NS_ENUM - 31)) | (1L << (WWEAK - 31)) | (1L << (WUNUSED - 31)) | (1L << (TYPEOF - 31)) | (1L << (TYPEOF__ - 31)) | (1L << (TYPEOF____ - 31)) | (1L << (KINDOF__ - 31)) | (1L << (COVARIANT - 31)) | (1L << (CONTRAVARIANT - 31)) | (1L << (NULLABLE - 31)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(620);
				typeSpecifier();
				}
			}

			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(623);
				match(COMMA);
				setState(624);
				typeSpecifier();
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630);
			match(GT);
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

	public static class ProtocolQualifierContext extends ParserRuleContext {
		public ProtocolQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitProtocolQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolQualifierContext protocolQualifier() throws RecognitionException {
		ProtocolQualifierContext _localctx = new ProtocolQualifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_protocolQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << IN) | (1L << INOUT) | (1L << ONEWAY) | (1L << OUT))) != 0)) ) {
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

	public static class DictionaryExpressionContext extends ParserRuleContext {
		public List<DictionaryPairContext> dictionaryPair() {
			return getRuleContexts(DictionaryPairContext.class);
		}
		public DictionaryPairContext dictionaryPair(int i) {
			return getRuleContext(DictionaryPairContext.class,i);
		}
		public DictionaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDictionaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDictionaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitDictionaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryExpressionContext dictionaryExpression() throws RecognitionException {
		DictionaryExpressionContext _localctx = new DictionaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dictionaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(AT);
			setState(635);
			match(LBRACE);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(636);
				dictionaryPair();
				}
			}

			setState(643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(639);
					match(COMMA);
					setState(640);
					dictionaryPair();
					}
					} 
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(646);
				match(COMMA);
				}
			}

			setState(649);
			match(RBRACE);
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

	public static class DictionaryPairContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public DictionaryPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDictionaryPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDictionaryPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitDictionaryPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionaryPairContext dictionaryPair() throws RecognitionException {
		DictionaryPairContext _localctx = new DictionaryPairContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dictionaryPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			castExpression();
			setState(652);
			match(COLON);
			setState(653);
			conditionalExpression();
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

	public static class ArrayExpressionContext extends ParserRuleContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(AT);
			setState(656);
			match(LBRACK);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(657);
				conditionalExpression();
				}
			}

			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(660);
					match(COMMA);
					setState(661);
					conditionalExpression();
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(667);
				match(COMMA);
				}
			}

			setState(670);
			match(RBRACK);
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

	public static class BoxExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBoxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBoxExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitBoxExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxExpressionContext boxExpression() throws RecognitionException {
		BoxExpressionContext _localctx = new BoxExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_boxExpression);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				match(AT);
				setState(673);
				match(LP);
				setState(674);
				expression();
				setState(675);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(AT);
				setState(680);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case SUB:
				case CHARACTER_LITERAL:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
					{
					setState(678);
					constant();
					}
					break;
				case ID:
				case SIZEOF:
				case WWEAK:
				case WUNUSED:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case NULLABLE:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IDENTIFIER:
					{
					setState(679);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class BlockParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<TypeVariableDeclaratorContext> typeVariableDeclarator() {
			return getRuleContexts(TypeVariableDeclaratorContext.class);
		}
		public TypeVariableDeclaratorContext typeVariableDeclarator(int i) {
			return getRuleContext(TypeVariableDeclaratorContext.class,i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public BlockParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBlockParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBlockParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitBlockParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockParametersContext blockParameters() throws RecognitionException {
		BlockParametersContext _localctx = new BlockParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_blockParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(LP);
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(685);
				typeVariableDeclarator();
				}
				break;
			case 2:
				{
				setState(686);
				typeName();
				}
				break;
			case 3:
				{
				setState(687);
				match(VOID);
				}
				break;
			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(690);
				match(COMMA);
				setState(693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(691);
					typeVariableDeclarator();
					}
					break;
				case 2:
					{
					setState(692);
					typeName();
					}
					break;
				}
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
			match(RP);
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_blockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(CARET);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (CHAR - 31)) | (1L << (DOUBLE - 31)) | (1L << (ENUM - 31)) | (1L << (FLOAT - 31)) | (1L << (ID - 31)) | (1L << (INSTANCETYPE - 31)) | (1L << (INT - 31)) | (1L << (LONG - 31)) | (1L << (SHORT - 31)) | (1L << (SIGNED - 31)) | (1L << (SIZEOF - 31)) | (1L << (STRUCT - 31)) | (1L << (UNION - 31)) | (1L << (UNSIGNED - 31)) | (1L << (VOID - 31)) | (1L << (NS_OPTIONS - 31)) | (1L << (NS_ENUM - 31)) | (1L << (WWEAK - 31)) | (1L << (WUNUSED - 31)) | (1L << (TYPEOF - 31)) | (1L << (TYPEOF__ - 31)) | (1L << (TYPEOF____ - 31)) | (1L << (KINDOF__ - 31)) | (1L << (COVARIANT - 31)) | (1L << (CONTRAVARIANT - 31)) | (1L << (NULLABLE - 31)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(703);
				typeSpecifier();
				}
			}

			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(706);
				blockParameters();
				}
			}

			setState(709);
			compoundStatement();
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

	public static class MessageExpressionContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
		}
		public MessageExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMessageExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMessageExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitMessageExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageExpressionContext messageExpression() throws RecognitionException {
		MessageExpressionContext _localctx = new MessageExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_messageExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(LBRACK);
			setState(712);
			receiver();
			setState(713);
			messageSelector();
			setState(714);
			match(RBRACK);
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

	public static class ReceiverContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_receiver);
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				typeSpecifier();
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

	public static class MessageSelectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<KeywordArgumentContext> keywordArgument() {
			return getRuleContexts(KeywordArgumentContext.class);
		}
		public KeywordArgumentContext keywordArgument(int i) {
			return getRuleContext(KeywordArgumentContext.class,i);
		}
		public MessageSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMessageSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMessageSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitMessageSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageSelectorContext messageSelector() throws RecognitionException {
		MessageSelectorContext _localctx = new MessageSelectorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_messageSelector);
		int _la;
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(721);
					keywordArgument();
					}
					}
					setState(724); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (COLON - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
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

	public static class KeywordArgumentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<InitializerListContext> initializerList() {
			return getRuleContexts(InitializerListContext.class);
		}
		public InitializerListContext initializerList(int i) {
			return getRuleContext(InitializerListContext.class,i);
		}
		public KeywordArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterKeywordArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitKeywordArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitKeywordArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordArgumentContext keywordArgument() throws RecognitionException {
		KeywordArgumentContext _localctx = new KeywordArgumentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_keywordArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(728);
				selector();
				}
			}

			setState(731);
			match(COLON);
			setState(732);
			expression();
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(733);
				match(LBRACE);
				setState(734);
				initializerList();
				setState(735);
				match(RBRACE);
				}
			}

			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(739);
				match(COMMA);
				setState(740);
				expression();
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(741);
					match(LBRACE);
					setState(742);
					initializerList();
					setState(743);
					match(RBRACE);
					}
				}

				}
				}
				setState(751);
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

	public static class SelectorExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public SelectorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSelectorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSelectorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorExpressionContext selectorExpression() throws RecognitionException {
		SelectorExpressionContext _localctx = new SelectorExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(SELECTOR);
			setState(753);
			match(LP);
			setState(754);
			selectorName();
			setState(755);
			match(RP);
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

	public static class SelectorNameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public SelectorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSelectorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSelectorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSelectorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorNameContext selectorName() throws RecognitionException {
		SelectorNameContext _localctx = new SelectorNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selectorName);
		int _la;
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
						{
						setState(758);
						selector();
						}
					}

					setState(761);
					match(COLON);
					}
					}
					setState(764); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (COLON - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
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

	public static class ProtocolExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ProtocolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitProtocolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolExpressionContext protocolExpression() throws RecognitionException {
		ProtocolExpressionContext _localctx = new ProtocolExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_protocolExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(PROTOCOL);
			setState(769);
			match(LP);
			setState(770);
			protocolName();
			setState(771);
			match(RP);
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

	public static class EncodeExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public EncodeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEncodeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEncodeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitEncodeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncodeExpressionContext encodeExpression() throws RecognitionException {
		EncodeExpressionContext _localctx = new EncodeExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_encodeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(ENCODE);
			setState(774);
			match(LP);
			setState(775);
			typeName();
			setState(776);
			match(RP);
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

	public static class TypeVariableDeclaratorContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TypeVariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitTypeVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableDeclaratorContext typeVariableDeclarator() throws RecognitionException {
		TypeVariableDeclaratorContext _localctx = new TypeVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			declarationSpecifiers();
			setState(779);
			declarator();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_throwStatement);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(THROW);
				setState(782);
				match(LP);
				setState(783);
				identifier();
				setState(784);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				match(THROW);
				setState(787);
				expression();
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

	public static class TryBlockContext extends ParserRuleContext {
		public CompoundStatementContext tryStatement;
		public CompoundStatementContext finallyStatement;
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public List<CatchStatementContext> catchStatement() {
			return getRuleContexts(CatchStatementContext.class);
		}
		public CatchStatementContext catchStatement(int i) {
			return getRuleContext(CatchStatementContext.class,i);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(TRY);
			setState(791);
			((TryBlockContext)_localctx).tryStatement = compoundStatement();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(792);
				catchStatement();
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(798);
				match(FINALLY);
				setState(799);
				((TryBlockContext)_localctx).finallyStatement = compoundStatement();
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

	public static class CatchStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public CatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchStatementContext catchStatement() throws RecognitionException {
		CatchStatementContext _localctx = new CatchStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(CATCH);
			setState(803);
			match(LP);
			setState(804);
			typeVariableDeclarator();
			setState(805);
			match(RP);
			setState(806);
			compoundStatement();
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

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(SYNCHRONIZED);
			setState(809);
			match(LP);
			setState(810);
			expression();
			setState(811);
			match(RP);
			setState(812);
			compoundStatement();
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

	public static class AutoreleaseStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public AutoreleaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoreleaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAutoreleaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAutoreleaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAutoreleaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoreleaseStatementContext autoreleaseStatement() throws RecognitionException {
		AutoreleaseStatementContext _localctx = new AutoreleaseStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_autoreleaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(AUTORELEASEPOOL);
			setState(815);
			compoundStatement();
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<DeclarationSpecifiersContext> declarationSpecifiers() {
			return getRuleContexts(DeclarationSpecifiersContext.class);
		}
		public DeclarationSpecifiersContext declarationSpecifiers(int i) {
			return getRuleContext(DeclarationSpecifiersContext.class,i);
		}
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(817);
				declarationSpecifiers();
				}
				break;
			}
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(820);
				attributeSpecifier();
				}
				break;
			}
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(823);
				declarationSpecifiers();
				}
				break;
			}
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(826);
				attributeSpecifier();
				}
			}

			setState(829);
			identifier();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(830);
				match(LP);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (AUTO - 25)) | (1L << (BYCOPY - 25)) | (1L << (BYREF - 25)) | (1L << (CHAR - 25)) | (1L << (CONST - 25)) | (1L << (DOUBLE - 25)) | (1L << (ENUM - 25)) | (1L << (EXTERN - 25)) | (1L << (FLOAT - 25)) | (1L << (ID - 25)) | (1L << (IN - 25)) | (1L << (INOUT - 25)) | (1L << (INSTANCETYPE - 25)) | (1L << (INT - 25)) | (1L << (LONG - 25)) | (1L << (ONEWAY - 25)) | (1L << (OUT - 25)) | (1L << (REGISTER - 25)) | (1L << (SHORT - 25)) | (1L << (SIGNED - 25)) | (1L << (SIZEOF - 25)) | (1L << (STATIC - 25)) | (1L << (STRUCT - 25)) | (1L << (TYPEDEF - 25)) | (1L << (UNION - 25)) | (1L << (UNSIGNED - 25)) | (1L << (VOID - 25)) | (1L << (VOLATILE - 25)) | (1L << (NS_OPTIONS - 25)) | (1L << (NS_ENUM - 25)) | (1L << (WWEAK - 25)) | (1L << (WUNSAFE_UNRETAINED - 25)) | (1L << (WUNUSED - 25)) | (1L << (WDEPRECATED - 25)) | (1L << (WAUTORELEASING - 25)) | (1L << (TYPEOF - 25)) | (1L << (TYPEOF__ - 25)) | (1L << (TYPEOF____ - 25)) | (1L << (KINDOF__ - 25)) | (1L << (COVARIANT - 25)) | (1L << (CONTRAVARIANT - 25)) | (1L << (NULLABLE - 25)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					setState(831);
					parameterList();
					}
				}

				setState(834);
				match(RP);
				}
			}

			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(837);
				attributeSpecifier();
				}
			}

			setState(840);
			compoundStatement();
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

	public static class AttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LP() { return getTokens(ObjectiveCParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(ObjectiveCParser.LP, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(ObjectiveCParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(ObjectiveCParser.RP, i);
		}
		public AttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_attributeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(ATTRIBUTE);
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(843);
				match(LP);
				setState(844);
				match(LP);
				setState(845);
				attribute();
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(846);
					match(COMMA);
					setState(847);
					attribute();
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(853);
				match(RP);
				setState(854);
				match(RP);
				}
				break;
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

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeParametersContext attributeParameters() {
			return getRuleContext(AttributeParametersContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			attributeName();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(859);
				attributeParameters();
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

	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectiveCParser.IDENTIFIER, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_la = _input.LA(1);
			if ( !(_la==CONST || _la==IDENTIFIER) ) {
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

	public static class AttributeParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public AttributeParameterListContext attributeParameterList() {
			return getRuleContext(AttributeParameterListContext.class,0);
		}
		public AttributeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAttributeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParametersContext attributeParameters() throws RecognitionException {
		AttributeParametersContext _localctx = new AttributeParametersContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_attributeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(LP);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (ADD - 114)) | (1L << (SUB - 114)) | (1L << (IDENTIFIER - 114)) | (1L << (CHARACTER_LITERAL - 114)) | (1L << (QUOTE_STRING - 114)) | (1L << (STRING - 114)) | (1L << (HEX_LITERAL - 114)) | (1L << (OCTAL_LITERAL - 114)) | (1L << (BINARY_LITERAL - 114)) | (1L << (DECIMAL_LITERAL - 114)) | (1L << (FLOATING_POINT_LITERAL - 114)))) != 0)) {
				{
				setState(865);
				attributeParameterList();
				}
			}

			setState(868);
			match(RP);
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

	public static class AttributeParameterListContext extends ParserRuleContext {
		public List<AttributeParameterContext> attributeParameter() {
			return getRuleContexts(AttributeParameterContext.class);
		}
		public AttributeParameterContext attributeParameter(int i) {
			return getRuleContext(AttributeParameterContext.class,i);
		}
		public AttributeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAttributeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParameterListContext attributeParameterList() throws RecognitionException {
		AttributeParameterListContext _localctx = new AttributeParameterListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_attributeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			attributeParameter();
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(871);
				match(COMMA);
				setState(872);
				attributeParameter();
				}
				}
				setState(877);
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

	public static class AttributeParameterContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext attributeParameterAssignment() {
			return getRuleContext(AttributeParameterAssignmentContext.class,0);
		}
		public AttributeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAttributeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParameterContext attributeParameter() throws RecognitionException {
		AttributeParameterContext _localctx = new AttributeParameterContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributeParameter);
		try {
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
				attributeParameterAssignment();
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

	public static class AttributeParameterAssignmentContext extends ParserRuleContext {
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeParameterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeParameterAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAttributeParameterAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeParameterAssignmentContext attributeParameterAssignment() throws RecognitionException {
		AttributeParameterAssignmentContext _localctx = new AttributeParameterAssignmentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_attributeParameterAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			attributeName();
			setState(885);
			match(ASSIGN);
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case CHARACTER_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				{
				setState(886);
				constant();
				}
				break;
			case CONST:
			case IDENTIFIER:
				{
				setState(887);
				attributeName();
				}
				break;
			case QUOTE_STRING:
			case STRING:
				{
				setState(888);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionCallDeclarationContext functionCallDeclaration() {
			return getRuleContext(FunctionCallDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declaration);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				functionCallDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
				varDeclaration();
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

	public static class FunctionCallDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public FunctionCallDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterFunctionCallDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitFunctionCallDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitFunctionCallDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallDeclarationContext functionCallDeclaration() throws RecognitionException {
		FunctionCallDeclarationContext _localctx = new FunctionCallDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionCallDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(896);
				attributeSpecifier();
				}
			}

			setState(899);
			className();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(900);
				attributeSpecifier();
				}
			}

			setState(903);
			match(LP);
			setState(904);
			directDeclarator();
			setState(905);
			match(RP);
			setState(906);
			match(SEMI);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(908);
				attributeSpecifier();
				}
			}

			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << EXTERN) | (1L << REGISTER) | (1L << STATIC) | (1L << TYPEDEF))) != 0)) {
				{
				setState(911);
				storageClassSpecifier();
				}
			}

			setState(914);
			enumSpecifier();
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(915);
				className();
				}
			}

			setState(918);
			match(SEMI);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(920);
				attributeSpecifier();
				}
			}

			setState(923);
			declarationSpecifiers();
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(924);
				attributeSpecifier();
				}
			}

			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (LP - 42)))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (MUL - 116)) | (1L << (ASSIGNPA - 116)) | (1L << (GETTER - 116)) | (1L << (NONATOMIC - 116)) | (1L << (SETTER - 116)) | (1L << (STRONG - 116)) | (1L << (RETAIN - 116)) | (1L << (READONLY - 116)) | (1L << (READWRITE - 116)) | (1L << (WEAK - 116)) | (1L << (IDENTIFIER - 116)))) != 0)) {
				{
				setState(927);
				initDeclaratorList();
				}
			}

			setState(930);
			match(SEMI);
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<ArcBehaviourSpecifierContext> arcBehaviourSpecifier() {
			return getRuleContexts(ArcBehaviourSpecifierContext.class);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier(int i) {
			return getRuleContext(ArcBehaviourSpecifierContext.class,i);
		}
		public List<StorageClassSpecifierContext> storageClassSpecifier() {
			return getRuleContexts(StorageClassSpecifierContext.class);
		}
		public StorageClassSpecifierContext storageClassSpecifier(int i) {
			return getRuleContext(StorageClassSpecifierContext.class,i);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public List<IbOutletSpecifierContext> ibOutletSpecifier() {
			return getRuleContexts(IbOutletSpecifierContext.class);
		}
		public IbOutletSpecifierContext ibOutletSpecifier(int i) {
			return getRuleContext(IbOutletSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(937); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(937);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						setState(932);
						arcBehaviourSpecifier();
						}
						break;
					case 2:
						{
						setState(933);
						storageClassSpecifier();
						}
						break;
					case 3:
						{
						setState(934);
						typeSpecifier();
						}
						break;
					case 4:
						{
						setState(935);
						typeQualifier();
						}
						break;
					case 5:
						{
						setState(936);
						ibOutletSpecifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(939); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class IbOutletSpecifierContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public IbOutletSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ibOutletSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIbOutletSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIbOutletSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitIbOutletSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IbOutletSpecifierContext ibOutletSpecifier() throws RecognitionException {
		IbOutletSpecifierContext _localctx = new IbOutletSpecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ibOutletSpecifier);
		try {
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IB_OUTLET_COLLECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(IB_OUTLET_COLLECTION);
				setState(942);
				match(LP);
				setState(943);
				className();
				setState(944);
				match(RP);
				}
				break;
			case IB_OUTLET:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				match(IB_OUTLET);
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			initDeclarator();
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(950);
				match(COMMA);
				setState(951);
				initDeclarator();
				}
				}
				setState(956);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			declarator();
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(958);
				match(ASSIGN);
				setState(959);
				initializer();
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

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructOrUnionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_structOrUnionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(963);
				identifier();
				}
				break;
			case 2:
				{
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					setState(964);
					identifier();
					}
				}

				setState(967);
				match(LBRACE);
				setState(969); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(968);
					structDeclaration();
					}
					}
					setState(971); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
				setState(973);
				match(RBRACE);
				}
				break;
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public MacrosContext macros() {
			return getRuleContext(MacrosContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			specifierQualifierList();
			setState(978);
			structDeclaratorList();
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(979);
				macros();
				}
			}

			setState(982);
			match(SEMI);
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public List<ArcBehaviourSpecifierContext> arcBehaviourSpecifier() {
			return getRuleContexts(ArcBehaviourSpecifierContext.class);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier(int i) {
			return getRuleContext(ArcBehaviourSpecifierContext.class,i);
		}
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_specifierQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(988); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(988);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						setState(984);
						arcBehaviourSpecifier();
						}
						break;
					case 2:
						{
						setState(985);
						nullabilitySpecifier();
						}
						break;
					case 3:
						{
						setState(986);
						typeSpecifier();
						}
						break;
					case 4:
						{
						setState(987);
						typeQualifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(990); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class ArcBehaviourSpecifierContext extends ParserRuleContext {
		public ArcBehaviourSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arcBehaviourSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArcBehaviourSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArcBehaviourSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitArcBehaviourSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArcBehaviourSpecifierContext arcBehaviourSpecifier() throws RecognitionException {
		ArcBehaviourSpecifierContext _localctx = new ArcBehaviourSpecifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_arcBehaviourSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNSAFE_UNRETAINED - 68)) | (1L << (WUNUSED - 68)) | (1L << (WDEPRECATED - 68)) | (1L << (WAUTORELEASING - 68)))) != 0)) ) {
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

	public static class NullabilitySpecifierContext extends ParserRuleContext {
		public NullabilitySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullabilitySpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterNullabilitySpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitNullabilitySpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitNullabilitySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullabilitySpecifierContext nullabilitySpecifier() throws RecognitionException {
		NullabilitySpecifierContext _localctx = new NullabilitySpecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_nullabilitySpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_la = _input.LA(1);
			if ( !(_la==NULLABLE || _la==NONNULL) ) {
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << EXTERN) | (1L << REGISTER) | (1L << STATIC) | (1L << TYPEDEF))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeofExpressionContext typeofExpression() {
			return getRuleContext(TypeofExpressionContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public GenericsSpecifierContext genericsSpecifier() {
			return getRuleContext(GenericsSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_typeSpecifier);
		try {
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
				match(SHORT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1001);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1002);
				match(LONG);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1003);
				match(FLOAT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1004);
				match(DOUBLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1005);
				match(INSTANCETYPE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1006);
				match(SIGNED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1007);
				match(UNSIGNED);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1008);
				typeofExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(1009);
				className();
				setState(1012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1010);
					protocolReferenceList();
					}
					break;
				case 2:
					{
					setState(1011);
					genericsSpecifier();
					}
					break;
				}
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1014);
				structOrUnionSpecifier();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1015);
				enumSpecifier();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1016);
				identifier();
				setState(1018);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1017);
					pointer();
					}
					break;
				}
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public ProtocolQualifierContext protocolQualifier() {
			return getRuleContext(ProtocolQualifierContext.class,0);
		}
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_typeQualifier);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				match(CONST);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				match(VOLATILE);
				}
				break;
			case BYCOPY:
			case BYREF:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1024);
				protocolQualifier();
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

	public static class TypeofExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TypeofExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeofExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeofExpressionContext typeofExpression() throws RecognitionException {
		TypeofExpressionContext _localctx = new TypeofExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_typeofExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (TYPEOF - 73)) | (1L << (TYPEOF__ - 73)) | (1L << (TYPEOF____ - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(1028);
			match(LP);
			setState(1029);
			expression();
			setState(1030);
			match(RP);
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

	public static class ClassNameGenericContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public GenericsSpecifierContext genericsSpecifier() {
			return getRuleContext(GenericsSpecifierContext.class,0);
		}
		public ClassNameGenericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classNameGeneric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassNameGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassNameGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitClassNameGeneric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameGenericContext classNameGeneric() throws RecognitionException {
		ClassNameGenericContext _localctx = new ClassNameGenericContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_classNameGeneric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			className();
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1033);
				protocolReferenceList();
				}
				break;
			case 2:
				{
				setState(1034);
				genericsSpecifier();
				}
				break;
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			structDeclarator();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1038);
				match(COMMA);
				setState(1039);
				structDeclarator();
				}
				}
				setState(1044);
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_structDeclarator);
		int _la;
		try {
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (LP - 42)))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (MUL - 116)) | (1L << (ASSIGNPA - 116)) | (1L << (GETTER - 116)) | (1L << (NONATOMIC - 116)) | (1L << (SETTER - 116)) | (1L << (STRONG - 116)) | (1L << (RETAIN - 116)) | (1L << (READONLY - 116)) | (1L << (READWRITE - 116)) | (1L << (WEAK - 116)) | (1L << (IDENTIFIER - 116)))) != 0)) {
					{
					setState(1046);
					declarator();
					}
				}

				setState(1049);
				match(COLON);
				setState(1050);
				constant();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumSpecifier);
		int _la;
		try {
			setState(1084);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				match(ENUM);
				setState(1059);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1055);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
						{
						setState(1054);
						identifier();
						}
					}

					setState(1057);
					match(COLON);
					setState(1058);
					typeName();
					}
					break;
				}
				setState(1072);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case SIZEOF:
				case WWEAK:
				case WUNUSED:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case NULLABLE:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IDENTIFIER:
					{
					setState(1061);
					identifier();
					setState(1066);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						setState(1062);
						match(LBRACE);
						setState(1063);
						enumeratorList();
						setState(1064);
						match(RBRACE);
						}
						break;
					}
					}
					break;
				case LBRACE:
					{
					setState(1068);
					match(LBRACE);
					setState(1069);
					enumeratorList();
					setState(1070);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NS_OPTIONS:
			case NS_ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				_la = _input.LA(1);
				if ( !(_la==NS_OPTIONS || _la==NS_ENUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1075);
				match(LP);
				setState(1076);
				typeName();
				setState(1077);
				match(COMMA);
				setState(1078);
				identifier();
				setState(1079);
				match(RP);
				setState(1080);
				match(LBRACE);
				setState(1081);
				enumeratorList();
				setState(1082);
				match(RBRACE);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumeratorList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			enumerator();
			setState(1091);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1087);
					match(COMMA);
					setState(1088);
					enumerator();
					}
					} 
				}
				setState(1093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1094);
				match(COMMA);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumeratorIdentifierContext enumeratorIdentifier() {
			return getRuleContext(EnumeratorIdentifierContext.class,0);
		}
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			enumeratorIdentifier();
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1098);
				match(ASSIGN);
				setState(1099);
				binaryExpression(0);
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

	public static class EnumeratorIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumeratorIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumeratorIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumeratorIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitEnumeratorIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorIdentifierContext enumeratorIdentifier() throws RecognitionException {
		EnumeratorIdentifierContext _localctx = new EnumeratorIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_enumeratorIdentifier);
		try {
			setState(1104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SIZEOF:
			case WWEAK:
			case WUNUSED:
			case TYPEOF:
			case TYPEOF__:
			case TYPEOF____:
			case KINDOF__:
			case COVARIANT:
			case CONTRAVARIANT:
			case NULLABLE:
			case ASSIGNPA:
			case GETTER:
			case NONATOMIC:
			case SETTER:
			case STRONG:
			case RETAIN:
			case READONLY:
			case READWRITE:
			case WEAK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				identifier();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				match(DEFAULT);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<DeclaratorSuffixContext> declaratorSuffix() {
			return getRuleContexts(DeclaratorSuffixContext.class);
		}
		public DeclaratorSuffixContext declaratorSuffix(int i) {
			return getRuleContext(DeclaratorSuffixContext.class,i);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_directDeclarator);
		int _la;
		try {
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case SIZEOF:
				case WWEAK:
				case WUNUSED:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case NULLABLE:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IDENTIFIER:
					{
					setState(1106);
					identifier();
					}
					break;
				case LP:
					{
					setState(1107);
					match(LP);
					setState(1108);
					declarator();
					setState(1109);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LP || _la==LBRACK) {
					{
					{
					setState(1113);
					declaratorSuffix();
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				match(LP);
				setState(1120);
				match(CARET);
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					setState(1121);
					identifier();
					}
				}

				setState(1124);
				match(RP);
				setState(1125);
				blockParameters();
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

	public static class DeclaratorSuffixContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public DeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDeclaratorSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDeclaratorSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitDeclaratorSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorSuffixContext declaratorSuffix() throws RecognitionException {
		DeclaratorSuffixContext _localctx = new DeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_declaratorSuffix);
		int _la;
		try {
			setState(1137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				match(LBRACK);
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (ADD - 114)) | (1L << (SUB - 114)) | (1L << (ASSIGNPA - 114)) | (1L << (GETTER - 114)) | (1L << (NONATOMIC - 114)) | (1L << (SETTER - 114)) | (1L << (STRONG - 114)) | (1L << (RETAIN - 114)) | (1L << (READONLY - 114)) | (1L << (READWRITE - 114)) | (1L << (WEAK - 114)) | (1L << (IDENTIFIER - 114)) | (1L << (CHARACTER_LITERAL - 114)) | (1L << (HEX_LITERAL - 114)) | (1L << (OCTAL_LITERAL - 114)) | (1L << (BINARY_LITERAL - 114)) | (1L << (DECIMAL_LITERAL - 114)) | (1L << (FLOATING_POINT_LITERAL - 114)))) != 0)) {
					{
					setState(1129);
					constantExpression();
					}
				}

				setState(1132);
				match(RBRACK);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133);
				match(LP);
				setState(1134);
				parameterList();
				setState(1135);
				match(RP);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			parameterDeclarationList();
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1140);
				match(COMMA);
				setState(1141);
				match(ELIPSIS);
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

	public static class PointerContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(MUL);
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1145);
				declarationSpecifiers();
				}
				break;
			}
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1148);
				pointer();
				}
				break;
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

	public static class MacrosContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public MacrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMacros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMacros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitMacros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacrosContext macros() throws RecognitionException {
		MacrosContext _localctx = new MacrosContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_macros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			identifier();
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(1152);
				match(LP);
				setState(1153);
				primaryExpression();
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1154);
					match(COMMA);
					setState(1155);
					primaryExpression();
					}
					}
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1161);
				match(RP);
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

	public static class InitializerContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public StructInitializerContext structInitializer() {
			return getRuleContext(StructInitializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_initializer);
		try {
			setState(1168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
				arrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1167);
				structInitializer();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(LBRACE);
			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1171);
				conditionalExpression();
				setState(1176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1172);
						match(COMMA);
						setState(1173);
						conditionalExpression();
						}
						} 
					}
					setState(1178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1179);
					match(COMMA);
					}
				}

				}
			}

			setState(1184);
			match(RBRACE);
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

	public static class StructInitializerContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public StructInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitStructInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructInitializerContext structInitializer() throws RecognitionException {
		StructInitializerContext _localctx = new StructInitializerContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_structInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			match(LBRACE);
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1187);
				match(DOT);
				setState(1188);
				assignmentExpression();
				setState(1194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1189);
						match(COMMA);
						setState(1190);
						match(DOT);
						setState(1191);
						assignmentExpression();
						}
						} 
					}
					setState(1196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1197);
					match(COMMA);
					}
				}

				}
			}

			setState(1202);
			match(RBRACE);
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

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			initializer();
			setState(1209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1205);
					match(COMMA);
					setState(1206);
					initializer();
					}
					} 
				}
				setState(1211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1212);
				match(COMMA);
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

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public BlockTypeContext blockType() {
			return getRuleContext(BlockTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_typeName);
		int _la;
		try {
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				specifierQualifierList();
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (LP - 88)) | (1L << (LBRACK - 88)) | (1L << (MUL - 88)))) != 0)) {
					{
					setState(1216);
					abstractDeclarator();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				blockType();
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<AbstractDeclaratorSuffixContext> abstractDeclaratorSuffix() {
			return getRuleContexts(AbstractDeclaratorSuffixContext.class);
		}
		public AbstractDeclaratorSuffixContext abstractDeclaratorSuffix(int i) {
			return getRuleContext(AbstractDeclaratorSuffixContext.class,i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_abstractDeclarator);
		int _la;
		try {
			setState(1245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				pointer();
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (LP - 88)) | (1L << (LBRACK - 88)) | (1L << (MUL - 88)))) != 0)) {
					{
					setState(1223);
					abstractDeclarator();
					}
				}

				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				match(LP);
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (LP - 88)) | (1L << (LBRACK - 88)) | (1L << (MUL - 88)))) != 0)) {
					{
					setState(1227);
					abstractDeclarator();
					}
				}

				setState(1230);
				match(RP);
				setState(1232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1231);
					abstractDeclaratorSuffix();
					}
					}
					setState(1234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LP || _la==LBRACK );
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1236);
					match(LBRACK);
					setState(1238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (ADD - 114)) | (1L << (SUB - 114)) | (1L << (ASSIGNPA - 114)) | (1L << (GETTER - 114)) | (1L << (NONATOMIC - 114)) | (1L << (SETTER - 114)) | (1L << (STRONG - 114)) | (1L << (RETAIN - 114)) | (1L << (READONLY - 114)) | (1L << (READWRITE - 114)) | (1L << (WEAK - 114)) | (1L << (IDENTIFIER - 114)) | (1L << (CHARACTER_LITERAL - 114)) | (1L << (HEX_LITERAL - 114)) | (1L << (OCTAL_LITERAL - 114)) | (1L << (BINARY_LITERAL - 114)) | (1L << (DECIMAL_LITERAL - 114)) | (1L << (FLOATING_POINT_LITERAL - 114)))) != 0)) {
						{
						setState(1237);
						constantExpression();
						}
					}

					setState(1240);
					match(RBRACK);
					}
					}
					setState(1243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
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

	public static class AbstractDeclaratorSuffixContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public AbstractDeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclaratorSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAbstractDeclaratorSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAbstractDeclaratorSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAbstractDeclaratorSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorSuffixContext abstractDeclaratorSuffix() throws RecognitionException {
		AbstractDeclaratorSuffixContext _localctx = new AbstractDeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_abstractDeclaratorSuffix);
		int _la;
		try {
			setState(1257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				match(LBRACK);
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (ADD - 114)) | (1L << (SUB - 114)) | (1L << (ASSIGNPA - 114)) | (1L << (GETTER - 114)) | (1L << (NONATOMIC - 114)) | (1L << (SETTER - 114)) | (1L << (STRONG - 114)) | (1L << (RETAIN - 114)) | (1L << (READONLY - 114)) | (1L << (READWRITE - 114)) | (1L << (WEAK - 114)) | (1L << (IDENTIFIER - 114)) | (1L << (CHARACTER_LITERAL - 114)) | (1L << (HEX_LITERAL - 114)) | (1L << (OCTAL_LITERAL - 114)) | (1L << (BINARY_LITERAL - 114)) | (1L << (DECIMAL_LITERAL - 114)) | (1L << (FLOATING_POINT_LITERAL - 114)))) != 0)) {
					{
					setState(1248);
					constantExpression();
					}
				}

				setState(1251);
				match(RBRACK);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				match(LP);
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (AUTO - 25)) | (1L << (BYCOPY - 25)) | (1L << (BYREF - 25)) | (1L << (CHAR - 25)) | (1L << (CONST - 25)) | (1L << (DOUBLE - 25)) | (1L << (ENUM - 25)) | (1L << (EXTERN - 25)) | (1L << (FLOAT - 25)) | (1L << (ID - 25)) | (1L << (IN - 25)) | (1L << (INOUT - 25)) | (1L << (INSTANCETYPE - 25)) | (1L << (INT - 25)) | (1L << (LONG - 25)) | (1L << (ONEWAY - 25)) | (1L << (OUT - 25)) | (1L << (REGISTER - 25)) | (1L << (SHORT - 25)) | (1L << (SIGNED - 25)) | (1L << (SIZEOF - 25)) | (1L << (STATIC - 25)) | (1L << (STRUCT - 25)) | (1L << (TYPEDEF - 25)) | (1L << (UNION - 25)) | (1L << (UNSIGNED - 25)) | (1L << (VOID - 25)) | (1L << (VOLATILE - 25)) | (1L << (NS_OPTIONS - 25)) | (1L << (NS_ENUM - 25)) | (1L << (WWEAK - 25)) | (1L << (WUNSAFE_UNRETAINED - 25)) | (1L << (WUNUSED - 25)) | (1L << (WDEPRECATED - 25)) | (1L << (WAUTORELEASING - 25)) | (1L << (TYPEOF - 25)) | (1L << (TYPEOF__ - 25)) | (1L << (TYPEOF____ - 25)) | (1L << (KINDOF__ - 25)) | (1L << (COVARIANT - 25)) | (1L << (CONTRAVARIANT - 25)) | (1L << (NULLABLE - 25)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					setState(1253);
					parameterDeclarationList();
					}
				}

				setState(1256);
				match(RP);
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

	public static class ParameterDeclarationListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitParameterDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitParameterDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			parameterDeclaration();
			setState(1264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1260);
					match(COMMA);
					setState(1261);
					parameterDeclaration();
					}
					} 
				}
				setState(1266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_parameterDeclaration);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				declarationSpecifiers();
				setState(1268);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				match(VOID);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(1273);
				pointer();
				}
			}

			setState(1276);
			directDeclarator();
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

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public AutoreleaseStatementContext autoreleaseStatement() {
			return getRuleContext(AutoreleaseStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_statement);
		try {
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				labeledStatement();
				setState(1280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1279);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				compoundStatement();
				setState(1284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1283);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1286);
				selectionStatement();
				setState(1288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1287);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1290);
				iterationStatement();
				setState(1292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1291);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1294);
				jumpStatement();
				setState(1296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1295);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1298);
				synchronizedStatement();
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1299);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1302);
				autoreleaseStatement();
				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1303);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1306);
				throwStatement();
				setState(1308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1307);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1310);
				tryBlock();
				setState(1312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1311);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1314);
				expression();
				setState(1316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1315);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1318);
				match(SEMI);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			identifier();
			setState(1322);
			match(COLON);
			setState(1323);
			statement();
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_rangeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			constantExpression();
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELIPSIS) {
				{
				setState(1326);
				match(ELIPSIS);
				setState(1327);
				constantExpression();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(LBRACE);
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTORELEASEPOOL) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SYNCHRONIZED) | (1L << THROW) | (1L << TRY) | (1L << AUTO) | (1L << BREAK) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FOR) | (1L << ID) | (1L << IF) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << GOTO) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << RETURN) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (LP - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (BITAND - 64)) | (1L << (CARET - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1331);
					declaration();
					}
					break;
				case 2:
					{
					setState(1332);
					statement();
					}
					break;
				}
				}
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1338);
			match(RBRACE);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ObjectiveCParser.IF, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ObjectiveCParser.ELSE, 0); }
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_selectionStatement);
		try {
			setState(1350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				match(IF);
				setState(1341);
				match(LP);
				setState(1342);
				expression();
				setState(1343);
				match(RP);
				setState(1344);
				statement();
				setState(1347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1345);
					match(ELSE);
					setState(1346);
					statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1349);
				switchStatement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(SWITCH);
			setState(1353);
			match(LP);
			setState(1354);
			expression();
			setState(1355);
			match(RP);
			setState(1356);
			switchBlock();
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchSectionContext> switchSection() {
			return getRuleContexts(SwitchSectionContext.class);
		}
		public SwitchSectionContext switchSection(int i) {
			return getRuleContext(SwitchSectionContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(LBRACE);
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1359);
				switchSection();
				}
				}
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1365);
			match(RBRACE);
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

	public static class SwitchSectionContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSwitchSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSwitchSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSwitchSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchSectionContext switchSection() throws RecognitionException {
		SwitchSectionContext _localctx = new SwitchSectionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_switchSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1367);
				switchLabel();
				}
				}
				setState(1370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1373); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1372);
				statement();
				}
				}
				setState(1375); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTORELEASEPOOL) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SYNCHRONIZED) | (1L << THROW) | (1L << TRY) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << ID) | (1L << IF) | (1L << GOTO) | (1L << RETURN) | (1L << SIZEOF) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNUSED - 65)) | (1L << (TYPEOF - 65)) | (1L << (TYPEOF__ - 65)) | (1L << (TYPEOF____ - 65)) | (1L << (KINDOF__ - 65)) | (1L << (COVARIANT - 65)) | (1L << (CONTRAVARIANT - 65)) | (1L << (NULLABLE - 65)) | (1L << (LP - 65)) | (1L << (LBRACE - 65)) | (1L << (LBRACK - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (BITAND - 65)) | (1L << (CARET - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_switchLabel);
		try {
			setState(1389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1377);
				match(CASE);
				setState(1383);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case SIZEOF:
				case WWEAK:
				case WUNUSED:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case NULLABLE:
				case ADD:
				case SUB:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IDENTIFIER:
				case CHARACTER_LITERAL:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
					{
					setState(1378);
					rangeExpression();
					}
					break;
				case LP:
					{
					setState(1379);
					match(LP);
					setState(1380);
					rangeExpression();
					setState(1381);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1385);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1387);
				match(DEFAULT);
				setState(1388);
				match(COLON);
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

	public static class ForLoopInitializerContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForLoopInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterForLoopInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitForLoopInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitForLoopInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopInitializerContext forLoopInitializer() throws RecognitionException {
		ForLoopInitializerContext _localctx = new ForLoopInitializerContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_forLoopInitializer);
		try {
			setState(1395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				declarationSpecifiers();
				setState(1392);
				initDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394);
				expression();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_iterationStatement);
		try {
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				whileStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				doStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1399);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1400);
				forInStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			match(WHILE);
			setState(1404);
			match(LP);
			setState(1405);
			expression();
			setState(1406);
			match(RP);
			setState(1407);
			statement();
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

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(DO);
			setState(1410);
			statement();
			setState(1411);
			match(WHILE);
			setState(1412);
			match(LP);
			setState(1413);
			expression();
			setState(1414);
			match(RP);
			setState(1415);
			match(SEMI);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLoopInitializerContext forLoopInitializer() {
			return getRuleContext(ForLoopInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(FOR);
			setState(1418);
			match(LP);
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (NULLABLE - 64)) | (1L << (LP - 64)) | (1L << (LBRACK - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (BITAND - 64)) | (1L << (CARET - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1419);
				forLoopInitializer();
				}
			}

			setState(1422);
			match(SEMI);
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1423);
				expression();
				}
			}

			setState(1426);
			match(SEMI);
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1427);
				expression();
				}
			}

			setState(1430);
			match(RP);
			setState(1431);
			statement();
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

	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(FOR);
			setState(1434);
			match(LP);
			setState(1435);
			typeVariableDeclarator();
			setState(1436);
			match(IN);
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1437);
				expression();
				}
			}

			setState(1440);
			match(RP);
			setState(1441);
			statement();
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

	public static class JumpStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_jumpStatement);
		int _la;
		try {
			setState(1456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443);
				match(GOTO);
				setState(1444);
				identifier();
				setState(1445);
				match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
				match(CONTINUE);
				setState(1448);
				match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1449);
				match(BREAK);
				setState(1450);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1451);
				match(RETURN);
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
					{
					setState(1452);
					expression();
					}
				}

				setState(1455);
				match(SEMI);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			assignmentExpression();
			setState(1463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1459);
					match(COMMA);
					setState(1460);
					assignmentExpression();
					}
					} 
				}
				setState(1465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_assignmentExpression);
		try {
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				unaryExpression();
				setState(1468);
				assignmentOperator();
				setState(1469);
				assignmentExpression();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_conditionalExpression);
		int _la;
		try {
			setState(1482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				binaryExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				binaryExpression(0);
				setState(1475);
				match(QUESTION);
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
					{
					setState(1476);
					expression();
					}
				}

				setState(1479);
				match(COLON);
				setState(1480);
				conditionalExpression();
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

	public static class BinaryExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public List<BinaryExpressionContext> binaryExpression() {
			return getRuleContexts(BinaryExpressionContext.class);
		}
		public BinaryExpressionContext binaryExpression(int i) {
			return getRuleContext(BinaryExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ObjectiveCParser.DIV, 0); }
		public List<TerminalNode> LT() { return getTokens(ObjectiveCParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ObjectiveCParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ObjectiveCParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ObjectiveCParser.GT, i);
		}
		public TerminalNode LE() { return getToken(ObjectiveCParser.LE, 0); }
		public TerminalNode GE() { return getToken(ObjectiveCParser.GE, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ObjectiveCParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(ObjectiveCParser.EQUAL, 0); }
		public TerminalNode AND() { return getToken(ObjectiveCParser.AND, 0); }
		public TerminalNode OR() { return getToken(ObjectiveCParser.OR, 0); }
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		return binaryExpression(0);
	}

	private BinaryExpressionContext binaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, _parentState);
		BinaryExpressionContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_binaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1485);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1522);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1487);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1488);
						_la = _input.LA(1);
						if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (MUL - 116)) | (1L << (DIV - 116)) | (1L << (MOD - 116)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1489);
						binaryExpression(11);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1490);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1491);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1492);
						binaryExpression(10);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1493);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1498);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1494);
							match(LT);
							setState(1495);
							match(LT);
							}
							break;
						case GT:
							{
							setState(1496);
							match(GT);
							setState(1497);
							match(GT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1500);
						binaryExpression(9);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1501);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1502);
						_la = _input.LA(1);
						if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (GT - 100)) | (1L << (LT - 100)) | (1L << (LE - 100)) | (1L << (GE - 100)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1503);
						binaryExpression(8);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1504);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1505);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1506);
						binaryExpression(7);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1507);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1508);
						match(BITAND);
						setState(1509);
						binaryExpression(6);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1510);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1511);
						match(CARET);
						setState(1512);
						binaryExpression(5);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1513);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1514);
						match(BITOR);
						setState(1515);
						binaryExpression(4);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1516);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1517);
						match(AND);
						setState(1518);
						binaryExpression(3);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1519);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1520);
						match(OR);
						setState(1521);
						binaryExpression(2);
						}
						break;
					}
					} 
				}
				setState(1526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_castExpression);
		try {
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527);
				match(LP);
				setState(1528);
				typeName();
				setState(1529);
				match(RP);
				setState(1532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1530);
					castExpression();
					}
					break;
				case 2:
					{
					setState(1531);
					initializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				unaryExpression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (ASSIGN - 99)) | (1L << (ADD_ASSIGN - 99)) | (1L << (SUB_ASSIGN - 99)) | (1L << (MUL_ASSIGN - 99)) | (1L << (DIV_ASSIGN - 99)) | (1L << (AND_ASSIGN - 99)) | (1L << (OR_ASSIGN - 99)) | (1L << (XOR_ASSIGN - 99)) | (1L << (MOD_ASSIGN - 99)) | (1L << (LSHIFT_ASSIGN - 99)) | (1L << (RSHIFT_ASSIGN - 99)))) != 0)) ) {
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_constantExpression);
		try {
			setState(1541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SIZEOF:
			case WWEAK:
			case WUNUSED:
			case TYPEOF:
			case TYPEOF__:
			case TYPEOF____:
			case KINDOF__:
			case COVARIANT:
			case CONTRAVARIANT:
			case NULLABLE:
			case ASSIGNPA:
			case GETTER:
			case NONATOMIC:
			case SETTER:
			case STRONG:
			case RETAIN:
			case READONLY:
			case READWRITE:
			case WEAK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				identifier();
				}
				break;
			case ADD:
			case SUB:
			case CHARACTER_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
				constant();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_unaryExpression);
		try {
			setState(1551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1543);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1544);
				match(INC);
				setState(1545);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1546);
				match(DEC);
				setState(1547);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1548);
				unaryOperator();
				setState(1549);
				castExpression();
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(ObjectiveCParser.BANG, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (BANG - 102)) | (1L << (TILDE - 102)) | (1L << (ADD - 102)) | (1L << (SUB - 102)) | (1L << (MUL - 102)) | (1L << (BITAND - 102)))) != 0)) ) {
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexerExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexerExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIndexerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIndexerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitIndexerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FunctionCallExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryInPostfixExpressionContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryInPostfixExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPrimaryInPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPrimaryInPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPrimaryInPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertyExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPropertyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncDecExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IncDecExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryInPostfixExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1556);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1574);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						_localctx = new IndexerExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1558);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1559);
						match(LBRACK);
						setState(1560);
						expression();
						setState(1561);
						match(RBRACK);
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1563);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1564);
						match(LP);
						setState(1566);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NS_OPTIONS - 66)) | (1L << (NS_ENUM - 66)) | (1L << (WWEAK - 66)) | (1L << (WUNUSED - 66)) | (1L << (TYPEOF - 66)) | (1L << (TYPEOF__ - 66)) | (1L << (TYPEOF____ - 66)) | (1L << (KINDOF__ - 66)) | (1L << (COVARIANT - 66)) | (1L << (CONTRAVARIANT - 66)) | (1L << (NULLABLE - 66)) | (1L << (LP - 66)) | (1L << (LBRACK - 66)) | (1L << (AT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (BITAND - 66)) | (1L << (CARET - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
							{
							setState(1565);
							argumentExpressionList();
							}
						}

						setState(1568);
						match(RP);
						}
						break;
					case 3:
						{
						_localctx = new PropertyExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1569);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1570);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==STRUCTACCESS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1571);
						identifier();
						}
						break;
					case 4:
						{
						_localctx = new IncDecExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1572);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1573);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(1578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<ArgumentExpressionContext> argumentExpression() {
			return getRuleContexts(ArgumentExpressionContext.class);
		}
		public ArgumentExpressionContext argumentExpression(int i) {
			return getRuleContext(ArgumentExpressionContext.class,i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			argumentExpression();
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1580);
				match(COMMA);
				setState(1581);
				argumentExpression();
				}
				}
				setState(1586);
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

	public static class ArgumentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArgumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArgumentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitArgumentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionContext argumentExpression() throws RecognitionException {
		ArgumentExpressionContext _localctx = new ArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_argumentExpression);
		try {
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1587);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				typeSpecifier();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public MessageExpressionContext messageExpression() {
			return getRuleContext(MessageExpressionContext.class,0);
		}
		public SelectorExpressionContext selectorExpression() {
			return getRuleContext(SelectorExpressionContext.class,0);
		}
		public ProtocolExpressionContext protocolExpression() {
			return getRuleContext(ProtocolExpressionContext.class,0);
		}
		public EncodeExpressionContext encodeExpression() {
			return getRuleContext(EncodeExpressionContext.class,0);
		}
		public DictionaryExpressionContext dictionaryExpression() {
			return getRuleContext(DictionaryExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public BoxExpressionContext boxExpression() {
			return getRuleContext(BoxExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_primaryExpression);
		try {
			setState(1606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1591);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1593);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1594);
				match(LP);
				setState(1595);
				expression();
				setState(1596);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1598);
				messageExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1599);
				selectorExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1600);
				protocolExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1601);
				encodeExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1602);
				dictionaryExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1603);
				arrayExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1604);
				boxExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1605);
				blockExpression();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(ObjectiveCParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ObjectiveCParser.OCTAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ObjectiveCParser.BINARY_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ObjectiveCParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ObjectiveCParser.FLOATING_POINT_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(ObjectiveCParser.CHARACTER_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_constant);
		int _la;
		try {
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				match(HEX_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1610);
				match(BINARY_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(1611);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1614);
				match(DECIMAL_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(1615);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1618);
				match(FLOATING_POINT_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1619);
				match(CHARACTER_LITERAL);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(ObjectiveCParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ObjectiveCParser.STRING, i);
		}
		public List<TerminalNode> QUOTE_STRING() { return getTokens(ObjectiveCParser.QUOTE_STRING); }
		public TerminalNode QUOTE_STRING(int i) {
			return getToken(ObjectiveCParser.QUOTE_STRING, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			setState(1637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1622);
				match(STRING);
				setState(1629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1624);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==BACKSLASH) {
							{
							setState(1623);
							match(BACKSLASH);
							}
						}

						setState(1626);
						match(STRING);
						}
						} 
					}
					setState(1631);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				}
				break;
			case QUOTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1633); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1632);
						match(QUOTE_STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1635); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectiveCParser.IDENTIFIER, 0); }
		public TerminalNode NULLABLE() { return getToken(ObjectiveCParser.NULLABLE, 0); }
		public TerminalNode WWEAK() { return getToken(ObjectiveCParser.WWEAK, 0); }
		public TerminalNode TYPEOF() { return getToken(ObjectiveCParser.TYPEOF, 0); }
		public TerminalNode TYPEOF__() { return getToken(ObjectiveCParser.TYPEOF__, 0); }
		public TerminalNode TYPEOF____() { return getToken(ObjectiveCParser.TYPEOF____, 0); }
		public TerminalNode KINDOF__() { return getToken(ObjectiveCParser.KINDOF__, 0); }
		public TerminalNode SIZEOF() { return getToken(ObjectiveCParser.SIZEOF, 0); }
		public TerminalNode ASSIGNPA() { return getToken(ObjectiveCParser.ASSIGNPA, 0); }
		public TerminalNode GETTER() { return getToken(ObjectiveCParser.GETTER, 0); }
		public TerminalNode NONATOMIC() { return getToken(ObjectiveCParser.NONATOMIC, 0); }
		public TerminalNode SETTER() { return getToken(ObjectiveCParser.SETTER, 0); }
		public TerminalNode STRONG() { return getToken(ObjectiveCParser.STRONG, 0); }
		public TerminalNode RETAIN() { return getToken(ObjectiveCParser.RETAIN, 0); }
		public TerminalNode READONLY() { return getToken(ObjectiveCParser.READONLY, 0); }
		public TerminalNode READWRITE() { return getToken(ObjectiveCParser.READWRITE, 0); }
		public TerminalNode WEAK() { return getToken(ObjectiveCParser.WEAK, 0); }
		public TerminalNode ID() { return getToken(ObjectiveCParser.ID, 0); }
		public TerminalNode COVARIANT() { return getToken(ObjectiveCParser.COVARIANT, 0); }
		public TerminalNode CONTRAVARIANT() { return getToken(ObjectiveCParser.CONTRAVARIANT, 0); }
		public TerminalNode WUNUSED() { return getToken(ObjectiveCParser.WUNUSED, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCParserVisitor ) return ((ObjectiveCParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 127:
			return binaryExpression_sempred((BinaryExpressionContext)_localctx, predIndex);
		case 133:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean binaryExpression_sempred(BinaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009e\u066c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\3\2\7"+
		"\2\u011c\n\2\f\2\16\2\u011f\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\u012e\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0138"+
		"\n\5\3\5\5\5\u013b\n\5\3\5\5\5\u013e\n\5\3\5\5\5\u0141\n\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6\u0149\n\6\3\6\3\6\5\6\u014d\n\6\3\6\5\6\u0150\n\6\3\6"+
		"\5\6\u0153\n\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u015b\n\7\3\7\5\7\u015e\n\7"+
		"\3\7\5\7\u0161\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u016b\n\b\3\b\3"+
		"\b\3\t\3\t\3\t\5\t\u0172\n\t\3\t\3\t\3\t\7\t\u0177\n\t\f\t\16\t\u017a"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0189"+
		"\n\f\f\f\16\f\u018c\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u0195\n\16"+
		"\f\16\16\16\u0198\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u019f\n\17\3\17"+
		"\5\17\u01a2\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u01a9\n\20\f\20\16\20\u01ac"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u01bf\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\5\25\u01c9\n\25\3\25\5\25\u01cc\n\25\3\26\3\26\7\26\u01d0\n\26\f"+
		"\26\16\26\u01d3\13\26\3\26\3\26\3\26\3\26\6\26\u01d9\n\26\r\26\16\26\u01da"+
		"\3\26\3\26\3\26\3\26\6\26\u01e1\n\26\r\26\16\26\u01e2\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\6\26\u01eb\n\26\r\26\16\26\u01ec\3\26\3\26\3\26\5\26\u01f2"+
		"\n\26\3\27\3\27\3\30\3\30\3\30\3\30\6\30\u01fa\n\30\r\30\16\30\u01fb\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\5\33\u0205\n\33\3\33\3\33\5\33\u0209"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\6\34\u0212\n\34\r\34\16\34\u0213"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\5\37\u021d\n\37\3\37\3\37\5\37\u0221"+
		"\n\37\3\37\5\37\u0224\n\37\3\37\3\37\3 \3 \6 \u022a\n \r \16 \u022b\3"+
		" \3 \5 \u0230\n \5 \u0232\n \3!\5!\u0235\n!\3!\3!\7!\u0239\n!\f!\16!\u023c"+
		"\13!\3!\5!\u023f\n!\3!\3!\3\"\3\"\5\"\u0245\n\"\3#\3#\3#\3#\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u0255\n%\3&\3&\3&\7&\u025a\n&\f&\16&\u025d\13&"+
		"\3\'\3\'\3\'\5\'\u0262\n\'\3(\3(\3(\3(\5(\u0268\n(\3(\3(\5(\u026c\n(\3"+
		")\3)\5)\u0270\n)\3)\3)\7)\u0274\n)\f)\16)\u0277\13)\3)\3)\3*\3*\3+\3+"+
		"\3+\5+\u0280\n+\3+\3+\7+\u0284\n+\f+\16+\u0287\13+\3+\5+\u028a\n+\3+\3"+
		"+\3,\3,\3,\3,\3-\3-\3-\5-\u0295\n-\3-\3-\7-\u0299\n-\f-\16-\u029c\13-"+
		"\3-\5-\u029f\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02ab\n.\5.\u02ad\n."+
		"\3/\3/\3/\3/\5/\u02b3\n/\3/\3/\3/\5/\u02b8\n/\7/\u02ba\n/\f/\16/\u02bd"+
		"\13/\3/\3/\3\60\3\60\5\60\u02c3\n\60\3\60\5\60\u02c6\n\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\5\62\u02d1\n\62\3\63\3\63\6\63\u02d5"+
		"\n\63\r\63\16\63\u02d6\5\63\u02d9\n\63\3\64\5\64\u02dc\n\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u02e4\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u02ec\n\64\7\64\u02ee\n\64\f\64\16\64\u02f1\13\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\5\66\u02fa\n\66\3\66\6\66\u02fd\n\66\r\66\16\66\u02fe"+
		"\5\66\u0301\n\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\3:\3"+
		":\3:\3:\3:\3:\3:\5:\u0317\n:\3;\3;\3;\7;\u031c\n;\f;\16;\u031f\13;\3;"+
		"\3;\5;\u0323\n;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3?\5?\u0335"+
		"\n?\3?\5?\u0338\n?\3?\5?\u033b\n?\3?\5?\u033e\n?\3?\3?\3?\5?\u0343\n?"+
		"\3?\5?\u0346\n?\3?\5?\u0349\n?\3?\3?\3@\3@\3@\3@\3@\3@\7@\u0353\n@\f@"+
		"\16@\u0356\13@\3@\3@\3@\5@\u035b\n@\3A\3A\5A\u035f\nA\3B\3B\3C\3C\5C\u0365"+
		"\nC\3C\3C\3D\3D\3D\7D\u036c\nD\fD\16D\u036f\13D\3E\3E\3E\3E\5E\u0375\n"+
		"E\3F\3F\3F\3F\3F\5F\u037c\nF\3G\3G\3G\5G\u0381\nG\3H\5H\u0384\nH\3H\3"+
		"H\5H\u0388\nH\3H\3H\3H\3H\3H\3I\5I\u0390\nI\3I\5I\u0393\nI\3I\3I\5I\u0397"+
		"\nI\3I\3I\3J\5J\u039c\nJ\3J\3J\5J\u03a0\nJ\3J\5J\u03a3\nJ\3J\3J\3K\3K"+
		"\3K\3K\3K\6K\u03ac\nK\rK\16K\u03ad\3L\3L\3L\3L\3L\3L\5L\u03b6\nL\3M\3"+
		"M\3M\7M\u03bb\nM\fM\16M\u03be\13M\3N\3N\3N\5N\u03c3\nN\3O\3O\3O\5O\u03c8"+
		"\nO\3O\3O\6O\u03cc\nO\rO\16O\u03cd\3O\3O\5O\u03d2\nO\3P\3P\3P\5P\u03d7"+
		"\nP\3P\3P\3Q\3Q\3Q\3Q\6Q\u03df\nQ\rQ\16Q\u03e0\3R\3R\3S\3S\3T\3T\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u03f7\nU\3U\3U\3U\3U\5U\u03fd"+
		"\nU\5U\u03ff\nU\3V\3V\3V\5V\u0404\nV\3W\3W\3W\3W\3W\3X\3X\3X\5X\u040e"+
		"\nX\3Y\3Y\3Y\7Y\u0413\nY\fY\16Y\u0416\13Y\3Z\3Z\5Z\u041a\nZ\3Z\3Z\5Z\u041e"+
		"\nZ\3[\3[\5[\u0422\n[\3[\3[\5[\u0426\n[\3[\3[\3[\3[\3[\5[\u042d\n[\3["+
		"\3[\3[\3[\5[\u0433\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u043f\n[\3\\\3"+
		"\\\3\\\7\\\u0444\n\\\f\\\16\\\u0447\13\\\3\\\5\\\u044a\n\\\3]\3]\3]\5"+
		"]\u044f\n]\3^\3^\5^\u0453\n^\3_\3_\3_\3_\3_\5_\u045a\n_\3_\7_\u045d\n"+
		"_\f_\16_\u0460\13_\3_\3_\3_\5_\u0465\n_\3_\3_\5_\u0469\n_\3`\3`\5`\u046d"+
		"\n`\3`\3`\3`\3`\3`\5`\u0474\n`\3a\3a\3a\5a\u0479\na\3b\3b\5b\u047d\nb"+
		"\3b\5b\u0480\nb\3c\3c\3c\3c\3c\7c\u0487\nc\fc\16c\u048a\13c\3c\3c\5c\u048e"+
		"\nc\3d\3d\3d\5d\u0493\nd\3e\3e\3e\3e\7e\u0499\ne\fe\16e\u049c\13e\3e\5"+
		"e\u049f\ne\5e\u04a1\ne\3e\3e\3f\3f\3f\3f\3f\3f\7f\u04ab\nf\ff\16f\u04ae"+
		"\13f\3f\5f\u04b1\nf\5f\u04b3\nf\3f\3f\3g\3g\3g\7g\u04ba\ng\fg\16g\u04bd"+
		"\13g\3g\5g\u04c0\ng\3h\3h\5h\u04c4\nh\3h\5h\u04c7\nh\3i\3i\5i\u04cb\n"+
		"i\3i\3i\5i\u04cf\ni\3i\3i\6i\u04d3\ni\ri\16i\u04d4\3i\3i\5i\u04d9\ni\3"+
		"i\6i\u04dc\ni\ri\16i\u04dd\5i\u04e0\ni\3j\3j\5j\u04e4\nj\3j\3j\3j\5j\u04e9"+
		"\nj\3j\5j\u04ec\nj\3k\3k\3k\7k\u04f1\nk\fk\16k\u04f4\13k\3l\3l\3l\3l\5"+
		"l\u04fa\nl\3m\5m\u04fd\nm\3m\3m\3n\3n\5n\u0503\nn\3n\3n\5n\u0507\nn\3"+
		"n\3n\5n\u050b\nn\3n\3n\5n\u050f\nn\3n\3n\5n\u0513\nn\3n\3n\5n\u0517\n"+
		"n\3n\3n\5n\u051b\nn\3n\3n\5n\u051f\nn\3n\3n\5n\u0523\nn\3n\3n\5n\u0527"+
		"\nn\3n\5n\u052a\nn\3o\3o\3o\3o\3p\3p\3p\5p\u0533\np\3q\3q\3q\7q\u0538"+
		"\nq\fq\16q\u053b\13q\3q\3q\3r\3r\3r\3r\3r\3r\3r\5r\u0546\nr\3r\5r\u0549"+
		"\nr\3s\3s\3s\3s\3s\3s\3t\3t\7t\u0553\nt\ft\16t\u0556\13t\3t\3t\3u\6u\u055b"+
		"\nu\ru\16u\u055c\3u\6u\u0560\nu\ru\16u\u0561\3v\3v\3v\3v\3v\3v\5v\u056a"+
		"\nv\3v\3v\3v\3v\5v\u0570\nv\3w\3w\3w\3w\5w\u0576\nw\3x\3x\3x\3x\5x\u057c"+
		"\nx\3y\3y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z\3z\3{\3{\3{\5{\u058f\n{\3{"+
		"\3{\5{\u0593\n{\3{\3{\5{\u0597\n{\3{\3{\3{\3|\3|\3|\3|\3|\5|\u05a1\n|"+
		"\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u05b0\n}\3}\5}\u05b3\n}\3~"+
		"\3~\3~\7~\u05b8\n~\f~\16~\u05bb\13~\3\177\3\177\3\177\3\177\3\177\5\177"+
		"\u05c2\n\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u05c8\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u05cd\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u05dd\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081"+
		"\u05f5\n\u0081\f\u0081\16\u0081\u05f8\13\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\5\u0082\u05ff\n\u0082\3\u0082\5\u0082\u0602\n\u0082\3"+
		"\u0083\3\u0083\3\u0084\3\u0084\5\u0084\u0608\n\u0084\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0612\n\u0085\3"+
		"\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0621\n\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u0629\n\u0087\f\u0087\16\u0087"+
		"\u062c\13\u0087\3\u0088\3\u0088\3\u0088\7\u0088\u0631\n\u0088\f\u0088"+
		"\16\u0088\u0634\13\u0088\3\u0089\3\u0089\5\u0089\u0638\n\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0649\n\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u064f\n\u008b\3\u008b\3\u008b\5\u008b"+
		"\u0653\n\u008b\3\u008b\3\u008b\5\u008b\u0657\n\u008b\3\u008c\3\u008c\5"+
		"\u008c\u065b\n\u008c\3\u008c\7\u008c\u065e\n\u008c\f\u008c\16\u008c\u0661"+
		"\13\u008c\3\u008c\6\u008c\u0664\n\u008c\r\u008c\16\u008c\u0665\5\u008c"+
		"\u0668\n\u008c\3\u008d\3\u008d\3\u008d\2\4\u0100\u010c\u008e\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\2\25\3\2OP\5\2\r\r\20"+
		"\20\22\23\5\2\36\37./\64\65\4\2\"\"\u0092\u0092\4\2<<??\3\2FJ\3\2RS\7"+
		"\2\33\33))\66\66;;>>\3\2KM\3\2DE\4\2vw{{\3\2tu\4\2fgmn\4\2lloo\4\2ee|"+
		"\u0085\5\2hitvxx\3\2bc\3\2rs\n\2,,::FFHHKPRR\u0087\u008f\u0092\u0092\2"+
		"\u0716\2\u011d\3\2\2\2\4\u012d\3\2\2\2\6\u012f\3\2\2\2\b\u0133\3\2\2\2"+
		"\n\u0144\3\2\2\2\f\u0156\3\2\2\2\16\u0164\3\2\2\2\20\u016e\3\2\2\2\22"+
		"\u017d\3\2\2\2\24\u0181\3\2\2\2\26\u0185\3\2\2\2\30\u018d\3\2\2\2\32\u0191"+
		"\3\2\2\2\34\u0199\3\2\2\2\36\u01a5\3\2\2\2 \u01be\3\2\2\2\"\u01c0\3\2"+
		"\2\2$\u01c2\3\2\2\2&\u01c4\3\2\2\2(\u01cb\3\2\2\2*\u01f1\3\2\2\2,\u01f3"+
		"\3\2\2\2.\u01f9\3\2\2\2\60\u01fd\3\2\2\2\62\u0200\3\2\2\2\64\u0204\3\2"+
		"\2\2\66\u0211\3\2\2\28\u0215\3\2\2\2:\u0218\3\2\2\2<\u021c\3\2\2\2>\u0231"+
		"\3\2\2\2@\u0234\3\2\2\2B\u0244\3\2\2\2D\u0246\3\2\2\2F\u024a\3\2\2\2H"+
		"\u0254\3\2\2\2J\u0256\3\2\2\2L\u025e\3\2\2\2N\u0263\3\2\2\2P\u026d\3\2"+
		"\2\2R\u027a\3\2\2\2T\u027c\3\2\2\2V\u028d\3\2\2\2X\u0291\3\2\2\2Z\u02ac"+
		"\3\2\2\2\\\u02ae\3\2\2\2^\u02c0\3\2\2\2`\u02c9\3\2\2\2b\u02d0\3\2\2\2"+
		"d\u02d8\3\2\2\2f\u02db\3\2\2\2h\u02f2\3\2\2\2j\u0300\3\2\2\2l\u0302\3"+
		"\2\2\2n\u0307\3\2\2\2p\u030c\3\2\2\2r\u0316\3\2\2\2t\u0318\3\2\2\2v\u0324"+
		"\3\2\2\2x\u032a\3\2\2\2z\u0330\3\2\2\2|\u0334\3\2\2\2~\u034c\3\2\2\2\u0080"+
		"\u035c\3\2\2\2\u0082\u0360\3\2\2\2\u0084\u0362\3\2\2\2\u0086\u0368\3\2"+
		"\2\2\u0088\u0374\3\2\2\2\u008a\u0376\3\2\2\2\u008c\u0380\3\2\2\2\u008e"+
		"\u0383\3\2\2\2\u0090\u038f\3\2\2\2\u0092\u039b\3\2\2\2\u0094\u03ab\3\2"+
		"\2\2\u0096\u03b5\3\2\2\2\u0098\u03b7\3\2\2\2\u009a\u03bf\3\2\2\2\u009c"+
		"\u03c4\3\2\2\2\u009e\u03d3\3\2\2\2\u00a0\u03de\3\2\2\2\u00a2\u03e2\3\2"+
		"\2\2\u00a4\u03e4\3\2\2\2\u00a6\u03e6\3\2\2\2\u00a8\u03fe\3\2\2\2\u00aa"+
		"\u0403\3\2\2\2\u00ac\u0405\3\2\2\2\u00ae\u040a\3\2\2\2\u00b0\u040f\3\2"+
		"\2\2\u00b2\u041d\3\2\2\2\u00b4\u043e\3\2\2\2\u00b6\u0440\3\2\2\2\u00b8"+
		"\u044b\3\2\2\2\u00ba\u0452\3\2\2\2\u00bc\u0468\3\2\2\2\u00be\u0473\3\2"+
		"\2\2\u00c0\u0475\3\2\2\2\u00c2\u047a\3\2\2\2\u00c4\u0481\3\2\2\2\u00c6"+
		"\u0492\3\2\2\2\u00c8\u0494\3\2\2\2\u00ca\u04a4\3\2\2\2\u00cc\u04b6\3\2"+
		"\2\2\u00ce\u04c6\3\2\2\2\u00d0\u04df\3\2\2\2\u00d2\u04eb\3\2\2\2\u00d4"+
		"\u04ed\3\2\2\2\u00d6\u04f9\3\2\2\2\u00d8\u04fc\3\2\2\2\u00da\u0529\3\2"+
		"\2\2\u00dc\u052b\3\2\2\2\u00de\u052f\3\2\2\2\u00e0\u0534\3\2\2\2\u00e2"+
		"\u0548\3\2\2\2\u00e4\u054a\3\2\2\2\u00e6\u0550\3\2\2\2\u00e8\u055a\3\2"+
		"\2\2\u00ea\u056f\3\2\2\2\u00ec\u0575\3\2\2\2\u00ee\u057b\3\2\2\2\u00f0"+
		"\u057d\3\2\2\2\u00f2\u0583\3\2\2\2\u00f4\u058b\3\2\2\2\u00f6\u059b\3\2"+
		"\2\2\u00f8\u05b2\3\2\2\2\u00fa\u05b4\3\2\2\2\u00fc\u05c1\3\2\2\2\u00fe"+
		"\u05cc\3\2\2\2\u0100\u05ce\3\2\2\2\u0102\u0601\3\2\2\2\u0104\u0603\3\2"+
		"\2\2\u0106\u0607\3\2\2\2\u0108\u0611\3\2\2\2\u010a\u0613\3\2\2\2\u010c"+
		"\u0615\3\2\2\2\u010e\u062d\3\2\2\2\u0110\u0637\3\2\2\2\u0112\u0648\3\2"+
		"\2\2\u0114\u0656\3\2\2\2\u0116\u0667\3\2\2\2\u0118\u0669\3\2\2\2\u011a"+
		"\u011c\5\4\3\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0121\7\2\2\3\u0121\3\3\2\2\2\u0122\u012e\5\6\4\2\u0123\u012e\5|?\2\u0124"+
		"\u012e\5\u008cG\2\u0125\u012e\5\b\5\2\u0126\u012e\5\f\7\2\u0127\u012e"+
		"\5\n\6\2\u0128\u012e\5\16\b\2\u0129\u012e\5\20\t\2\u012a\u012e\5\22\n"+
		"\2\u012b\u012e\5\24\13\2\u012c\u012e\5\66\34\2\u012d\u0122\3\2\2\2\u012d"+
		"\u0123\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u0126\3\2"+
		"\2\2\u012d\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d"+
		"\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\5\3\2\2\2"+
		"\u012f\u0130\7\f\2\2\u0130\u0131\5\u0118\u008d\2\u0131\u0132\7`\2\2\u0132"+
		"\7\3\2\2\2\u0133\u0134\7\13\2\2\u0134\u0137\5\u00aeX\2\u0135\u0136\7k"+
		"\2\2\u0136\u0138\5$\23\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u013b\5\30\r\2\u013a\u0139\3\2\2\2\u013a\u013b\3"+
		"\2\2\2\u013b\u013d\3\2\2\2\u013c\u013e\5*\26\2\u013d\u013c\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0141\5.\30\2\u0140\u013f\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\b\2\2\u0143"+
		"\t\3\2\2\2\u0144\u0145\7\13\2\2\u0145\u0146\5\u00aeX\2\u0146\u0148\7Z"+
		"\2\2\u0147\u0149\5&\24\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\7[\2\2\u014b\u014d\5\30\r\2\u014c\u014b\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0150\5*\26\2\u014f"+
		"\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0153\5."+
		"\30\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\7\b\2\2\u0155\13\3\2\2\2\u0156\u0157\7\n\2\2\u0157\u015a\5\u00ae"+
		"X\2\u0158\u0159\7k\2\2\u0159\u015b\5$\23\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015e\5*\26\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0161\5\66\34\2\u0160\u015f\3"+
		"\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7\b\2\2\u0163"+
		"\r\3\2\2\2\u0164\u0165\7\n\2\2\u0165\u0166\5\u00aeX\2\u0166\u0167\7Z\2"+
		"\2\u0167\u0168\5&\24\2\u0168\u016a\7[\2\2\u0169\u016b\5\66\34\2\u016a"+
		"\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7\b"+
		"\2\2\u016d\17\3\2\2\2\u016e\u016f\7\16\2\2\u016f\u0171\5(\25\2\u0170\u0172"+
		"\5\30\r\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0178\3\2\2\2"+
		"\u0173\u0177\7\24\2\2\u0174\u0177\5.\30\2\u0175\u0177\7\17\2\2\u0176\u0173"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017b\u017c\7\b\2\2\u017c\21\3\2\2\2\u017d\u017e\7\16\2\2\u017e\u017f"+
		"\5\32\16\2\u017f\u0180\7`\2\2\u0180\23\3\2\2\2\u0181\u0182\7\5\2\2\u0182"+
		"\u0183\5\26\f\2\u0183\u0184\7`\2\2\u0184\25\3\2\2\2\u0185\u018a\5\"\22"+
		"\2\u0186\u0187\7a\2\2\u0187\u0189\5\"\22\2\u0188\u0186\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\27\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018e\7g\2\2\u018e\u018f\5\32\16\2\u018f\u0190\7"+
		"f\2\2\u0190\31\3\2\2\2\u0191\u0196\5(\25\2\u0192\u0193\7a\2\2\u0193\u0195"+
		"\5(\25\2\u0194\u0192\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\33\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019e\7\21\2"+
		"\2\u019a\u019b\7Z\2\2\u019b\u019c\5\36\20\2\u019c\u019d\7[\2\2\u019d\u019f"+
		"\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u01a2\5\u0096L\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a4\5\u009eP\2\u01a4\35\3\2\2\2\u01a5\u01aa\5 \21\2\u01a6"+
		"\u01a7\7a\2\2\u01a7\u01a9\5 \21\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\37\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2\u01ad\u01bf\7\u0089\2\2\u01ae\u01bf\7\u0087\2\2\u01af\u01bf\7"+
		"\u008f\2\2\u01b0\u01bf\7\u008b\2\2\u01b1\u01bf\7\u008c\2\2\u01b2\u01bf"+
		"\7\u008d\2\2\u01b3\u01bf\7\u008e\2\2\u01b4\u01b5\7\u0088\2\2\u01b5\u01b6"+
		"\7e\2\2\u01b6\u01bf\5\u0118\u008d\2\u01b7\u01b8\7\u008a\2\2\u01b8\u01b9"+
		"\7e\2\2\u01b9\u01ba\5\u0118\u008d\2\u01ba\u01bb\7k\2\2\u01bb\u01bf\3\2"+
		"\2\2\u01bc\u01bf\5\u00a4S\2\u01bd\u01bf\5\u0118\u008d\2\u01be\u01ad\3"+
		"\2\2\2\u01be\u01ae\3\2\2\2\u01be\u01af\3\2\2\2\u01be\u01b0\3\2\2\2\u01be"+
		"\u01b1\3\2\2\2\u01be\u01b2\3\2\2\2\u01be\u01b3\3\2\2\2\u01be\u01b4\3\2"+
		"\2\2\u01be\u01b7\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf"+
		"!\3\2\2\2\u01c0\u01c1\5\u0118\u008d\2\u01c1#\3\2\2\2\u01c2\u01c3\5\u0118"+
		"\u008d\2\u01c3%\3\2\2\2\u01c4\u01c5\5\u0118\u008d\2\u01c5\'\3\2\2\2\u01c6"+
		"\u01cc\5\30\r\2\u01c7\u01c9\t\2\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3"+
		"\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\5\u0118\u008d\2\u01cb\u01c6\3\2"+
		"\2\2\u01cb\u01c8\3\2\2\2\u01cc)\3\2\2\2\u01cd\u01d1\7\\\2\2\u01ce\u01d0"+
		"\5\u009eP\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2"+
		"\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01f2"+
		"\7]\2\2\u01d5\u01d6\7\\\2\2\u01d6\u01d8\5,\27\2\u01d7\u01d9\5\u009eP\2"+
		"\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7]\2\2\u01dd\u01f2\3\2\2\2\u01de"+
		"\u01e0\7\\\2\2\u01df\u01e1\5\u009eP\2\u01e0\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\5*\26\2\u01e5\u01e6\7]\2\2\u01e6\u01f2\3\2\2\2\u01e7\u01e8\7\\"+
		"\2\2\u01e8\u01ea\5,\27\2\u01e9\u01eb\5\u009eP\2\u01ea\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01ef\5*\26\2\u01ef\u01f0\7]\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01cd\3\2\2\2\u01f1\u01d5\3\2\2\2\u01f1\u01de\3\2\2\2\u01f1\u01e7\3\2"+
		"\2\2\u01f2+\3\2\2\2\u01f3\u01f4\t\3\2\2\u01f4-\3\2\2\2\u01f5\u01fa\5\u008c"+
		"G\2\u01f6\u01fa\5\60\31\2\u01f7\u01fa\5\62\32\2\u01f8\u01fa\5\34\17\2"+
		"\u01f9\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"/\3\2\2\2\u01fd\u01fe\7t\2\2\u01fe\u01ff\5\64\33\2\u01ff\61\3\2\2\2\u0200"+
		"\u0201\7u\2\2\u0201\u0202\5\64\33\2\u0202\63\3\2\2\2\u0203\u0205\5F$\2"+
		"\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208"+
		"\5> \2\u0207\u0209\5\u00c4c\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2"+
		"\u0209\u020a\3\2\2\2\u020a\u020b\7`\2\2\u020b\65\3\2\2\2\u020c\u0212\5"+
		"|?\2\u020d\u0212\5\u008cG\2\u020e\u0212\58\35\2\u020f\u0212\5:\36\2\u0210"+
		"\u0212\5H%\2\u0211\u020c\3\2\2\2\u0211\u020d\3\2\2\2\u0211\u020e\3\2\2"+
		"\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0211"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\67\3\2\2\2\u0215\u0216\7t\2\2\u0216"+
		"\u0217\5<\37\2\u02179\3\2\2\2\u0218\u0219\7u\2\2\u0219\u021a\5<\37\2\u021a"+
		";\3\2\2\2\u021b\u021d\5D#\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0220\5> \2\u021f\u0221\5\u0098M\2\u0220\u021f\3"+
		"\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0224\7`\2\2\u0223"+
		"\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\5\u00e0"+
		"q\2\u0226=\3\2\2\2\u0227\u0232\5B\"\2\u0228\u022a\5@!\2\u0229\u0228\3"+
		"\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022f\3\2\2\2\u022d\u022e\7a\2\2\u022e\u0230\7\u0086\2\2\u022f\u022d"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u0227\3\2\2\2\u0231"+
		"\u0229\3\2\2\2\u0232?\3\2\2\2\u0233\u0235\5B\"\2\u0234\u0233\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u023a\7k\2\2\u0237\u0239\5D#"+
		"\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b"+
		"\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023f\5\u00a2R"+
		"\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241"+
		"\5\u0118\u008d\2\u0241A\3\2\2\2\u0242\u0245\5\u0118\u008d\2\u0243\u0245"+
		"\7\67\2\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245C\3\2\2\2\u0246"+
		"\u0247\7Z\2\2\u0247\u0248\5\u00ceh\2\u0248\u0249\7[\2\2\u0249E\3\2\2\2"+
		"\u024a\u024b\5D#\2\u024bG\3\2\2\2\u024c\u024d\7\27\2\2\u024d\u024e\5J"+
		"&\2\u024e\u024f\7`\2\2\u024f\u0255\3\2\2\2\u0250\u0251\7\6\2\2\u0251\u0252"+
		"\5J&\2\u0252\u0253\7`\2\2\u0253\u0255\3\2\2\2\u0254\u024c\3\2\2\2\u0254"+
		"\u0250\3\2\2\2\u0255I\3\2\2\2\u0256\u025b\5L\'\2\u0257\u0258\7a\2\2\u0258"+
		"\u025a\5L\'\2\u0259\u0257\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025cK\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0261"+
		"\5\u0118\u008d\2\u025f\u0260\7e\2\2\u0260\u0262\5\u0118\u008d\2\u0261"+
		"\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262M\3\2\2\2\u0263\u0264\5\u00a8"+
		"U\2\u0264\u0265\7Z\2\2\u0265\u0267\7z\2\2\u0266\u0268\5\u00a8U\2\u0267"+
		"\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\7["+
		"\2\2\u026a\u026c\5\\/\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"O\3\2\2\2\u026d\u026f\7g\2\2\u026e\u0270\5\u00a8U\2\u026f\u026e\3\2\2"+
		"\2\u026f\u0270\3\2\2\2\u0270\u0275\3\2\2\2\u0271\u0272\7a\2\2\u0272\u0274"+
		"\5\u00a8U\2\u0273\u0271\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2"+
		"\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279"+
		"\7f\2\2\u0279Q\3\2\2\2\u027a\u027b\t\4\2\2\u027bS\3\2\2\2\u027c\u027d"+
		"\7d\2\2\u027d\u027f\7\\\2\2\u027e\u0280\5V,\2\u027f\u027e\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0285\3\2\2\2\u0281\u0282\7a\2\2\u0282\u0284\5V,"+
		"\2\u0283\u0281\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028a\7a\2\2\u0289"+
		"\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\7]"+
		"\2\2\u028cU\3\2\2\2\u028d\u028e\5\u0102\u0082\2\u028e\u028f\7k\2\2\u028f"+
		"\u0290\5\u00fe\u0080\2\u0290W\3\2\2\2\u0291\u0292\7d\2\2\u0292\u0294\7"+
		"^\2\2\u0293\u0295\5\u00fe\u0080\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u029a\3\2\2\2\u0296\u0297\7a\2\2\u0297\u0299\5\u00fe\u0080"+
		"\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029f\7a\2\2\u029e"+
		"\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7_"+
		"\2\2\u02a1Y\3\2\2\2\u02a2\u02a3\7d\2\2\u02a3\u02a4\7Z\2\2\u02a4\u02a5"+
		"\5\u00fa~\2\u02a5\u02a6\7[\2\2\u02a6\u02ad\3\2\2\2\u02a7\u02aa\7d\2\2"+
		"\u02a8\u02ab\5\u0114\u008b\2\u02a9\u02ab\5\u0118\u008d\2\u02aa\u02a8\3"+
		"\2\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02a2\3\2\2\2\u02ac"+
		"\u02a7\3\2\2\2\u02ad[\3\2\2\2\u02ae\u02b2\7Z\2\2\u02af\u02b3\5p9\2\u02b0"+
		"\u02b3\5\u00ceh\2\u02b1\u02b3\7A\2\2\u02b2\u02af\3\2\2\2\u02b2\u02b0\3"+
		"\2\2\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02bb\3\2\2\2\u02b4"+
		"\u02b7\7a\2\2\u02b5\u02b8\5p9\2\u02b6\u02b8\5\u00ceh\2\u02b7\u02b5\3\2"+
		"\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b4\3\2\2\2\u02ba"+
		"\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7[\2\2\u02bf]\3\2\2\2\u02c0\u02c2"+
		"\7z\2\2\u02c1\u02c3\5\u00a8U\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2"+
		"\u02c3\u02c5\3\2\2\2\u02c4\u02c6\5\\/\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\5\u00e0q\2\u02c8_\3\2\2\2\u02c9"+
		"\u02ca\7^\2\2\u02ca\u02cb\5b\62\2\u02cb\u02cc\5d\63\2\u02cc\u02cd\7_\2"+
		"\2\u02cda\3\2\2\2\u02ce\u02d1\5\u00fa~\2\u02cf\u02d1\5\u00a8U\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1c\3\2\2\2\u02d2\u02d9\5B\"\2\u02d3"+
		"\u02d5\5f\64\2\u02d4\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d4\3\2"+
		"\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02d2\3\2\2\2\u02d8"+
		"\u02d4\3\2\2\2\u02d9e\3\2\2\2\u02da\u02dc\5B\"\2\u02db\u02da\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\7k\2\2\u02de\u02e3\5\u00fa"+
		"~\2\u02df\u02e0\7\\\2\2\u02e0\u02e1\5\u00ccg\2\u02e1\u02e2\7]\2\2\u02e2"+
		"\u02e4\3\2\2\2\u02e3\u02df\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02ef\3\2"+
		"\2\2\u02e5\u02e6\7a\2\2\u02e6\u02eb\5\u00fa~\2\u02e7\u02e8\7\\\2\2\u02e8"+
		"\u02e9\5\u00ccg\2\u02e9\u02ea\7]\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e7\3"+
		"\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02e5\3\2\2\2\u02ee"+
		"\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0g\3\2\2\2"+
		"\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7\25\2\2\u02f3\u02f4\7Z\2\2\u02f4\u02f5"+
		"\5j\66\2\u02f5\u02f6\7[\2\2\u02f6i\3\2\2\2\u02f7\u0301\5B\"\2\u02f8\u02fa"+
		"\5B\"\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u02fd\7k\2\2\u02fc\u02f9\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02fc\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02f7\3\2\2\2\u0300"+
		"\u02fc\3\2\2\2\u0301k\3\2\2\2\u0302\u0303\7\16\2\2\u0303\u0304\7Z\2\2"+
		"\u0304\u0305\5(\25\2\u0305\u0306\7[\2\2\u0306m\3\2\2\2\u0307\u0308\7\7"+
		"\2\2\u0308\u0309\7Z\2\2\u0309\u030a\5\u00ceh\2\u030a\u030b\7[\2\2\u030b"+
		"o\3\2\2\2\u030c\u030d\5\u0094K\2\u030d\u030e\5\u00d8m\2\u030eq\3\2\2\2"+
		"\u030f\u0310\7\30\2\2\u0310\u0311\7Z\2\2\u0311\u0312\5\u0118\u008d\2\u0312"+
		"\u0313\7[\2\2\u0313\u0317\3\2\2\2\u0314\u0315\7\30\2\2\u0315\u0317\5\u00fa"+
		"~\2\u0316\u030f\3\2\2\2\u0316\u0314\3\2\2\2\u0317s\3\2\2\2\u0318\u0319"+
		"\7\31\2\2\u0319\u031d\5\u00e0q\2\u031a\u031c\5v<\2\u031b\u031a\3\2\2\2"+
		"\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0322"+
		"\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0321\7\t\2\2\u0321\u0323\5\u00e0q"+
		"\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323u\3\2\2\2\u0324\u0325"+
		"\7\4\2\2\u0325\u0326\7Z\2\2\u0326\u0327\5p9\2\u0327\u0328\7[\2\2\u0328"+
		"\u0329\5\u00e0q\2\u0329w\3\2\2\2\u032a\u032b\7\26\2\2\u032b\u032c\7Z\2"+
		"\2\u032c\u032d\5\u00fa~\2\u032d\u032e\7[\2\2\u032e\u032f\5\u00e0q\2\u032f"+
		"y\3\2\2\2\u0330\u0331\7\3\2\2\u0331\u0332\5\u00e0q\2\u0332{\3\2\2\2\u0333"+
		"\u0335\5\u0094K\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337"+
		"\3\2\2\2\u0336\u0338\5~@\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u033a\3\2\2\2\u0339\u033b\5\u0094K\2\u033a\u0339\3\2\2\2\u033a\u033b"+
		"\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033e\5~@\2\u033d\u033c\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0345\5\u0118\u008d\2\u0340\u0342"+
		"\7Z\2\2\u0341\u0343\5\u00c0a\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2"+
		"\u0343\u0344\3\2\2\2\u0344\u0346\7[\2\2\u0345\u0340\3\2\2\2\u0345\u0346"+
		"\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0349\5~@\2\u0348\u0347\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\5\u00e0q\2\u034b}\3\2\2"+
		"\2\u034c\u035a\7Q\2\2\u034d\u034e\7Z\2\2\u034e\u034f\7Z\2\2\u034f\u0354"+
		"\5\u0080A\2\u0350\u0351\7a\2\2\u0351\u0353\5\u0080A\2\u0352\u0350\3\2"+
		"\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0357\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0358\7[\2\2\u0358\u0359\7[\2"+
		"\2\u0359\u035b\3\2\2\2\u035a\u034d\3\2\2\2\u035a\u035b\3\2\2\2\u035b\177"+
		"\3\2\2\2\u035c\u035e\5\u0082B\2\u035d\u035f\5\u0084C\2\u035e\u035d\3\2"+
		"\2\2\u035e\u035f\3\2\2\2\u035f\u0081\3\2\2\2\u0360\u0361\t\5\2\2\u0361"+
		"\u0083\3\2\2\2\u0362\u0364\7Z\2\2\u0363\u0365\5\u0086D\2\u0364\u0363\3"+
		"\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\7[\2\2\u0367"+
		"\u0085\3\2\2\2\u0368\u036d\5\u0088E\2\u0369\u036a\7a\2\2\u036a\u036c\5"+
		"\u0088E\2\u036b\u0369\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2"+
		"\u036d\u036e\3\2\2\2\u036e\u0087\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0375"+
		"\5\u0080A\2\u0371\u0375\5\u0114\u008b\2\u0372\u0375\5\u0116\u008c\2\u0373"+
		"\u0375\5\u008aF\2\u0374\u0370\3\2\2\2\u0374\u0371\3\2\2\2\u0374\u0372"+
		"\3\2\2\2\u0374\u0373\3\2\2\2\u0375\u0089\3\2\2\2\u0376\u0377\5\u0082B"+
		"\2\u0377\u037b\7e\2\2\u0378\u037c\5\u0114\u008b\2\u0379\u037c\5\u0082"+
		"B\2\u037a\u037c\5\u0116\u008c\2\u037b\u0378\3\2\2\2\u037b\u0379\3\2\2"+
		"\2\u037b\u037a\3\2\2\2\u037c\u008b\3\2\2\2\u037d\u0381\5\u008eH\2\u037e"+
		"\u0381\5\u0090I\2\u037f\u0381\5\u0092J\2\u0380\u037d\3\2\2\2\u0380\u037e"+
		"\3\2\2\2\u0380\u037f\3\2\2\2\u0381\u008d\3\2\2\2\u0382\u0384\5~@\2\u0383"+
		"\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\5\""+
		"\22\2\u0386\u0388\5~@\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\u038a\7Z\2\2\u038a\u038b\5\u00bc_\2\u038b\u038c\7"+
		"[\2\2\u038c\u038d\7`\2\2\u038d\u008f\3\2\2\2\u038e\u0390\5~@\2\u038f\u038e"+
		"\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391\u0393\5\u00a6T"+
		"\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0396"+
		"\5\u00b4[\2\u0395\u0397\5\"\22\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2"+
		"\2\u0397\u0398\3\2\2\2\u0398\u0399\7`\2\2\u0399\u0091\3\2\2\2\u039a\u039c"+
		"\5~@\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"\u039f\5\u0094K\2\u039e\u03a0\5~@\2\u039f\u039e\3\2\2\2\u039f\u03a0\3"+
		"\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u03a3\5\u0098M\2\u03a2\u03a1\3\2\2\2"+
		"\u03a2\u03a3\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\7`\2\2\u03a5\u0093"+
		"\3\2\2\2\u03a6\u03ac\5\u00a2R\2\u03a7\u03ac\5\u00a6T\2\u03a8\u03ac\5\u00a8"+
		"U\2\u03a9\u03ac\5\u00aaV\2\u03aa\u03ac\5\u0096L\2\u03ab\u03a6\3\2\2\2"+
		"\u03ab\u03a7\3\2\2\2\u03ab\u03a8\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03aa"+
		"\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u0095\3\2\2\2\u03af\u03b0\7\u0091\2\2\u03b0\u03b1\7Z\2\2\u03b1\u03b2"+
		"\5\"\22\2\u03b2\u03b3\7[\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b6\7\u0090\2"+
		"\2\u03b5\u03af\3\2\2\2\u03b5\u03b4\3\2\2\2\u03b6\u0097\3\2\2\2\u03b7\u03bc"+
		"\5\u009aN\2\u03b8\u03b9\7a\2\2\u03b9\u03bb\5\u009aN\2\u03ba\u03b8\3\2"+
		"\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u0099\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c2\5\u00d8m\2\u03c0\u03c1"+
		"\7e\2\2\u03c1\u03c3\5\u00c6d\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2"+
		"\u03c3\u009b\3\2\2\2\u03c4\u03d1\t\6\2\2\u03c5\u03d2\5\u0118\u008d\2\u03c6"+
		"\u03c8\5\u0118\u008d\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9"+
		"\3\2\2\2\u03c9\u03cb\7\\\2\2\u03ca\u03cc\5\u009eP\2\u03cb\u03ca\3\2\2"+
		"\2\u03cc\u03cd\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf"+
		"\3\2\2\2\u03cf\u03d0\7]\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03c5\3\2\2\2\u03d1"+
		"\u03c7\3\2\2\2\u03d2\u009d\3\2\2\2\u03d3\u03d4\5\u00a0Q\2\u03d4\u03d6"+
		"\5\u00b0Y\2\u03d5\u03d7\5\u00c4c\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2"+
		"\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\7`\2\2\u03d9\u009f\3\2\2\2\u03da"+
		"\u03df\5\u00a2R\2\u03db\u03df\5\u00a4S\2\u03dc\u03df\5\u00a8U\2\u03dd"+
		"\u03df\5\u00aaV\2\u03de\u03da\3\2\2\2\u03de\u03db\3\2\2\2\u03de\u03dc"+
		"\3\2\2\2\u03de\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u00a1\3\2\2\2\u03e2\u03e3\t\7\2\2\u03e3\u00a3\3\2"+
		"\2\2\u03e4\u03e5\t\b\2\2\u03e5\u00a5\3\2\2\2\u03e6\u03e7\t\t\2\2\u03e7"+
		"\u00a7\3\2\2\2\u03e8\u03ff\7A\2\2\u03e9\u03ff\7!\2\2\u03ea\u03ff\78\2"+
		"\2\u03eb\u03ff\7\62\2\2\u03ec\u03ff\7\63\2\2\u03ed\u03ff\7*\2\2\u03ee"+
		"\u03ff\7&\2\2\u03ef\u03ff\7\60\2\2\u03f0\u03ff\79\2\2\u03f1\u03ff\7@\2"+
		"\2\u03f2\u03ff\5\u00acW\2\u03f3\u03f6\5\"\22\2\u03f4\u03f7\5\30\r\2\u03f5"+
		"\u03f7\5P)\2\u03f6\u03f4\3\2\2\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2"+
		"\2\u03f7\u03ff\3\2\2\2\u03f8\u03ff\5\u009cO\2\u03f9\u03ff\5\u00b4[\2\u03fa"+
		"\u03fc\5\u0118\u008d\2\u03fb\u03fd\5\u00c2b\2\u03fc\u03fb\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe\u03e8\3\2\2\2\u03fe\u03e9\3\2"+
		"\2\2\u03fe\u03ea\3\2\2\2\u03fe\u03eb\3\2\2\2\u03fe\u03ec\3\2\2\2\u03fe"+
		"\u03ed\3\2\2\2\u03fe\u03ee\3\2\2\2\u03fe\u03ef\3\2\2\2\u03fe\u03f0\3\2"+
		"\2\2\u03fe\u03f1\3\2\2\2\u03fe\u03f2\3\2\2\2\u03fe\u03f3\3\2\2\2\u03fe"+
		"\u03f8\3\2\2\2\u03fe\u03f9\3\2\2\2\u03fe\u03fa\3\2\2\2\u03ff\u00a9\3\2"+
		"\2\2\u0400\u0404\7\"\2\2\u0401\u0404\7B\2\2\u0402\u0404\5R*\2\u0403\u0400"+
		"\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0402\3\2\2\2\u0404\u00ab\3\2\2\2\u0405"+
		"\u0406\t\n\2\2\u0406\u0407\7Z\2\2\u0407\u0408\5\u00fa~\2\u0408\u0409\7"+
		"[\2\2\u0409\u00ad\3\2\2\2\u040a\u040d\5\"\22\2\u040b\u040e\5\30\r\2\u040c"+
		"\u040e\5P)\2\u040d\u040b\3\2\2\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2"+
		"\2\u040e\u00af\3\2\2\2\u040f\u0414\5\u00b2Z\2\u0410\u0411\7a\2\2\u0411"+
		"\u0413\5\u00b2Z\2\u0412\u0410\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412"+
		"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u00b1\3\2\2\2\u0416\u0414\3\2\2\2\u0417"+
		"\u041e\5\u00d8m\2\u0418\u041a\5\u00d8m\2\u0419\u0418\3\2\2\2\u0419\u041a"+
		"\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\7k\2\2\u041c\u041e\5\u0114\u008b"+
		"\2\u041d\u0417\3\2\2\2\u041d\u0419\3\2\2\2\u041e\u00b3\3\2\2\2\u041f\u0425"+
		"\7(\2\2\u0420\u0422\5\u0118\u008d\2\u0421\u0420\3\2\2\2\u0421\u0422\3"+
		"\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\7k\2\2\u0424\u0426\5\u00ceh\2\u0425"+
		"\u0421\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0432\3\2\2\2\u0427\u042c\5\u0118"+
		"\u008d\2\u0428\u0429\7\\\2\2\u0429\u042a\5\u00b6\\\2\u042a\u042b\7]\2"+
		"\2\u042b\u042d\3\2\2\2\u042c\u0428\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0433"+
		"\3\2\2\2\u042e\u042f\7\\\2\2\u042f\u0430\5\u00b6\\\2\u0430\u0431\7]\2"+
		"\2\u0431\u0433\3\2\2\2\u0432\u0427\3\2\2\2\u0432\u042e\3\2\2\2\u0433\u043f"+
		"\3\2\2\2\u0434\u0435\t\13\2\2\u0435\u0436\7Z\2\2\u0436\u0437\5\u00ceh"+
		"\2\u0437\u0438\7a\2\2\u0438\u0439\5\u0118\u008d\2\u0439\u043a\7[\2\2\u043a"+
		"\u043b\7\\\2\2\u043b\u043c\5\u00b6\\\2\u043c\u043d\7]\2\2\u043d\u043f"+
		"\3\2\2\2\u043e\u041f\3\2\2\2\u043e\u0434\3\2\2\2\u043f\u00b5\3\2\2\2\u0440"+
		"\u0445\5\u00b8]\2\u0441\u0442\7a\2\2\u0442\u0444\5\u00b8]\2\u0443\u0441"+
		"\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446"+
		"\u0449\3\2\2\2\u0447\u0445\3\2\2\2\u0448\u044a\7a\2\2\u0449\u0448\3\2"+
		"\2\2\u0449\u044a\3\2\2\2\u044a\u00b7\3\2\2\2\u044b\u044e\5\u00ba^\2\u044c"+
		"\u044d\7e\2\2\u044d\u044f\5\u0100\u0081\2\u044e\u044c\3\2\2\2\u044e\u044f"+
		"\3\2\2\2\u044f\u00b9\3\2\2\2\u0450\u0453\5\u0118\u008d\2\u0451\u0453\7"+
		"$\2\2\u0452\u0450\3\2\2\2\u0452\u0451\3\2\2\2\u0453\u00bb\3\2\2\2\u0454"+
		"\u045a\5\u0118\u008d\2\u0455\u0456\7Z\2\2\u0456\u0457\5\u00d8m\2\u0457"+
		"\u0458\7[\2\2\u0458\u045a\3\2\2\2\u0459\u0454\3\2\2\2\u0459\u0455\3\2"+
		"\2\2\u045a\u045e\3\2\2\2\u045b\u045d\5\u00be`\2\u045c\u045b\3\2\2\2\u045d"+
		"\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0469\3\2"+
		"\2\2\u0460\u045e\3\2\2\2\u0461\u0462\7Z\2\2\u0462\u0464\7z\2\2\u0463\u0465"+
		"\5\u0118\u008d\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3"+
		"\2\2\2\u0466\u0467\7[\2\2\u0467\u0469\5\\/\2\u0468\u0459\3\2\2\2\u0468"+
		"\u0461\3\2\2\2\u0469\u00bd\3\2\2\2\u046a\u046c\7^\2\2\u046b\u046d\5\u0106"+
		"\u0084\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u0474\7_\2\2\u046f\u0470\7Z\2\2\u0470\u0471\5\u00c0a\2\u0471\u0472\7"+
		"[\2\2\u0472\u0474\3\2\2\2\u0473\u046a\3\2\2\2\u0473\u046f\3\2\2\2\u0474"+
		"\u00bf\3\2\2\2\u0475\u0478\5\u00d4k\2\u0476\u0477\7a\2\2\u0477\u0479\7"+
		"\u0086\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u00c1\3\2\2\2"+
		"\u047a\u047c\7v\2\2\u047b\u047d\5\u0094K\2\u047c\u047b\3\2\2\2\u047c\u047d"+
		"\3\2\2\2\u047d\u047f\3\2\2\2\u047e\u0480\5\u00c2b\2\u047f\u047e\3\2\2"+
		"\2\u047f\u0480\3\2\2\2\u0480\u00c3\3\2\2\2\u0481\u048d\5\u0118\u008d\2"+
		"\u0482\u0483\7Z\2\2\u0483\u0488\5\u0112\u008a\2\u0484\u0485\7a\2\2\u0485"+
		"\u0487\5\u0112\u008a\2\u0486\u0484\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u0486"+
		"\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2\2\u048a\u0488\3\2\2\2\u048b"+
		"\u048c\7[\2\2\u048c\u048e\3\2\2\2\u048d\u0482\3\2\2\2\u048d\u048e\3\2"+
		"\2\2\u048e\u00c5\3\2\2\2\u048f\u0493\5\u00fe\u0080\2\u0490\u0493\5\u00c8"+
		"e\2\u0491\u0493\5\u00caf\2\u0492\u048f\3\2\2\2\u0492\u0490\3\2\2\2\u0492"+
		"\u0491\3\2\2\2\u0493\u00c7\3\2\2\2\u0494\u04a0\7\\\2\2\u0495\u049a\5\u00fe"+
		"\u0080\2\u0496\u0497\7a\2\2\u0497\u0499\5\u00fe\u0080\2\u0498\u0496\3"+
		"\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049d\u049f\7a\2\2\u049e\u049d\3\2"+
		"\2\2\u049e\u049f\3\2\2\2\u049f\u04a1\3\2\2\2\u04a0\u0495\3\2\2\2\u04a0"+
		"\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\7]\2\2\u04a3\u00c9\3\2"+
		"\2\2\u04a4\u04b2\7\\\2\2\u04a5\u04a6\7b\2\2\u04a6\u04ac\5\u00fc\177\2"+
		"\u04a7\u04a8\7a\2\2\u04a8\u04a9\7b\2\2\u04a9\u04ab\5\u00fc\177\2\u04aa"+
		"\u04a7\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2"+
		"\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b1\7a\2\2\u04b0"+
		"\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04a5\3\2"+
		"\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\7]\2\2\u04b5"+
		"\u00cb\3\2\2\2\u04b6\u04bb\5\u00c6d\2\u04b7\u04b8\7a\2\2\u04b8\u04ba\5"+
		"\u00c6d\2\u04b9\u04b7\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2\2\2"+
		"\u04bb\u04bc\3\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be\u04c0"+
		"\7a\2\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u00cd\3\2\2\2\u04c1"+
		"\u04c3\5\u00a0Q\2\u04c2\u04c4\5\u00d0i\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4"+
		"\3\2\2\2\u04c4\u04c7\3\2\2\2\u04c5\u04c7\5N(\2\u04c6\u04c1\3\2\2\2\u04c6"+
		"\u04c5\3\2\2\2\u04c7\u00cf\3\2\2\2\u04c8\u04ca\5\u00c2b\2\u04c9\u04cb"+
		"\5\u00d0i\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04e0\3\2\2"+
		"\2\u04cc\u04ce\7Z\2\2\u04cd\u04cf\5\u00d0i\2\u04ce\u04cd\3\2\2\2\u04ce"+
		"\u04cf\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\7[\2\2\u04d1\u04d3\5\u00d2"+
		"j\2\u04d2\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d4"+
		"\u04d5\3\2\2\2\u04d5\u04e0\3\2\2\2\u04d6\u04d8\7^\2\2\u04d7\u04d9\5\u0106"+
		"\u0084\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\u04dc\7_\2\2\u04db\u04d6\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04db\3\2"+
		"\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04c8\3\2\2\2\u04df"+
		"\u04cc\3\2\2\2\u04df\u04db\3\2\2\2\u04e0\u00d1\3\2\2\2\u04e1\u04e3\7^"+
		"\2\2\u04e2\u04e4\5\u0106\u0084\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2"+
		"\2\u04e4\u04e5\3\2\2\2\u04e5\u04ec\7_\2\2\u04e6\u04e8\7Z\2\2\u04e7\u04e9"+
		"\5\u00d4k\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\3\2\2"+
		"\2\u04ea\u04ec\7[\2\2\u04eb\u04e1\3\2\2\2\u04eb\u04e6\3\2\2\2\u04ec\u00d3"+
		"\3\2\2\2\u04ed\u04f2\5\u00d6l\2\u04ee\u04ef\7a\2\2\u04ef\u04f1\5\u00d6"+
		"l\2\u04f0\u04ee\3\2\2\2\u04f1\u04f4\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2"+
		"\u04f3\3\2\2\2\u04f3\u00d5\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04f6\5\u0094"+
		"K\2\u04f6\u04f7\5\u00d8m\2\u04f7\u04fa\3\2\2\2\u04f8\u04fa\7A\2\2\u04f9"+
		"\u04f5\3\2\2\2\u04f9\u04f8\3\2\2\2\u04fa\u00d7\3\2\2\2\u04fb\u04fd\5\u00c2"+
		"b\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u04ff\5\u00bc_\2\u04ff\u00d9\3\2\2\2\u0500\u0502\5\u00dco\2\u0501\u0503"+
		"\7`\2\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u052a\3\2\2\2\u0504"+
		"\u0506\5\u00e0q\2\u0505\u0507\7`\2\2\u0506\u0505\3\2\2\2\u0506\u0507\3"+
		"\2\2\2\u0507\u052a\3\2\2\2\u0508\u050a\5\u00e2r\2\u0509\u050b\7`\2\2\u050a"+
		"\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u052a\3\2\2\2\u050c\u050e\5\u00ee"+
		"x\2\u050d\u050f\7`\2\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u052a"+
		"\3\2\2\2\u0510\u0512\5\u00f8}\2\u0511\u0513\7`\2\2\u0512\u0511\3\2\2\2"+
		"\u0512\u0513\3\2\2\2\u0513\u052a\3\2\2\2\u0514\u0516\5x=\2\u0515\u0517"+
		"\7`\2\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u052a\3\2\2\2\u0518"+
		"\u051a\5z>\2\u0519\u051b\7`\2\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2\2"+
		"\2\u051b\u052a\3\2\2\2\u051c\u051e\5r:\2\u051d\u051f\7`\2\2\u051e\u051d"+
		"\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u052a\3\2\2\2\u0520\u0522\5t;\2\u0521"+
		"\u0523\7`\2\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u052a\3\2"+
		"\2\2\u0524\u0526\5\u00fa~\2\u0525\u0527\7`\2\2\u0526\u0525\3\2\2\2\u0526"+
		"\u0527\3\2\2\2\u0527\u052a\3\2\2\2\u0528\u052a\7`\2\2\u0529\u0500\3\2"+
		"\2\2\u0529\u0504\3\2\2\2\u0529\u0508\3\2\2\2\u0529\u050c\3\2\2\2\u0529"+
		"\u0510\3\2\2\2\u0529\u0514\3\2\2\2\u0529\u0518\3\2\2\2\u0529\u051c\3\2"+
		"\2\2\u0529\u0520\3\2\2\2\u0529\u0524\3\2\2\2\u0529\u0528\3\2\2\2\u052a"+
		"\u00db\3\2\2\2\u052b\u052c\5\u0118\u008d\2\u052c\u052d\7k\2\2\u052d\u052e"+
		"\5\u00dan\2\u052e\u00dd\3\2\2\2\u052f\u0532\5\u0106\u0084\2\u0530\u0531"+
		"\7\u0086\2\2\u0531\u0533\5\u0106\u0084\2\u0532\u0530\3\2\2\2\u0532\u0533"+
		"\3\2\2\2\u0533\u00df\3\2\2\2\u0534\u0539\7\\\2\2\u0535\u0538\5\u008cG"+
		"\2\u0536\u0538\5\u00dan\2\u0537\u0535\3\2\2\2\u0537\u0536\3\2\2\2\u0538"+
		"\u053b\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c\3\2"+
		"\2\2\u053b\u0539\3\2\2\2\u053c\u053d\7]\2\2\u053d\u00e1\3\2\2\2\u053e"+
		"\u053f\7-\2\2\u053f\u0540\7Z\2\2\u0540\u0541\5\u00fa~\2\u0541\u0542\7"+
		"[\2\2\u0542\u0545\5\u00dan\2\u0543\u0544\7\'\2\2\u0544\u0546\5\u00dan"+
		"\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0549\3\2\2\2\u0547\u0549"+
		"\5\u00e4s\2\u0548\u053e\3\2\2\2\u0548\u0547\3\2\2\2\u0549\u00e3\3\2\2"+
		"\2\u054a\u054b\7=\2\2\u054b\u054c\7Z\2\2\u054c\u054d\5\u00fa~\2\u054d"+
		"\u054e\7[\2\2\u054e\u054f\5\u00e6t\2\u054f\u00e5\3\2\2\2\u0550\u0554\7"+
		"\\\2\2\u0551\u0553\5\u00e8u\2\u0552\u0551\3\2\2\2\u0553\u0556\3\2\2\2"+
		"\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0557\3\2\2\2\u0556\u0554"+
		"\3\2\2\2\u0557\u0558\7]\2\2\u0558\u00e7\3\2\2\2\u0559\u055b\5\u00eav\2"+
		"\u055a\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055a\3\2\2\2\u055c\u055d"+
		"\3\2\2\2\u055d\u055f\3\2\2\2\u055e\u0560\5\u00dan\2\u055f\u055e\3\2\2"+
		"\2\u0560\u0561\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u00e9"+
		"\3\2\2\2\u0563\u0569\7 \2\2\u0564\u056a\5\u00dep\2\u0565\u0566\7Z\2\2"+
		"\u0566\u0567\5\u00dep\2\u0567\u0568\7[\2\2\u0568\u056a\3\2\2\2\u0569\u0564"+
		"\3\2\2\2\u0569\u0565\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\7k\2\2\u056c"+
		"\u0570\3\2\2\2\u056d\u056e\7$\2\2\u056e\u0570\7k\2\2\u056f\u0563\3\2\2"+
		"\2\u056f\u056d\3\2\2\2\u0570\u00eb\3\2\2\2\u0571\u0572\5\u0094K\2\u0572"+
		"\u0573\5\u0098M\2\u0573\u0576\3\2\2\2\u0574\u0576\5\u00fa~\2\u0575\u0571"+
		"\3\2\2\2\u0575\u0574\3\2\2\2\u0576\u00ed\3\2\2\2\u0577\u057c\5\u00f0y"+
		"\2\u0578\u057c\5\u00f2z\2\u0579\u057c\5\u00f4{\2\u057a\u057c\5\u00f6|"+
		"\2\u057b\u0577\3\2\2\2\u057b\u0578\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057a"+
		"\3\2\2\2\u057c\u00ef\3\2\2\2\u057d\u057e\7C\2\2\u057e\u057f\7Z\2\2\u057f"+
		"\u0580\5\u00fa~\2\u0580\u0581\7[\2\2\u0581\u0582\5\u00dan\2\u0582\u00f1"+
		"\3\2\2\2\u0583\u0584\7%\2\2\u0584\u0585\5\u00dan\2\u0585\u0586\7C\2\2"+
		"\u0586\u0587\7Z\2\2\u0587\u0588\5\u00fa~\2\u0588\u0589\7[\2\2\u0589\u058a"+
		"\7`\2\2\u058a\u00f3\3\2\2\2\u058b\u058c\7+\2\2\u058c\u058e\7Z\2\2\u058d"+
		"\u058f\5\u00ecw\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590"+
		"\3\2\2\2\u0590\u0592\7`\2\2\u0591\u0593\5\u00fa~\2\u0592\u0591\3\2\2\2"+
		"\u0592\u0593\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\7`\2\2\u0595\u0597"+
		"\5\u00fa~\2\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2"+
		"\2\u0598\u0599\7[\2\2\u0599\u059a\5\u00dan\2\u059a\u00f5\3\2\2\2\u059b"+
		"\u059c\7+\2\2\u059c\u059d\7Z\2\2\u059d\u059e\5p9\2\u059e\u05a0\7.\2\2"+
		"\u059f\u05a1\5\u00fa~\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1"+
		"\u05a2\3\2\2\2\u05a2\u05a3\7[\2\2\u05a3\u05a4\5\u00dan\2\u05a4\u00f7\3"+
		"\2\2\2\u05a5\u05a6\7\61\2\2\u05a6\u05a7\5\u0118\u008d\2\u05a7\u05a8\7"+
		"`\2\2\u05a8\u05b3\3\2\2\2\u05a9\u05aa\7#\2\2\u05aa\u05b3\7`\2\2\u05ab"+
		"\u05ac\7\35\2\2\u05ac\u05b3\7`\2\2\u05ad\u05af\7\67\2\2\u05ae\u05b0\5"+
		"\u00fa~\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\3\2\2\2"+
		"\u05b1\u05b3\7`\2\2\u05b2\u05a5\3\2\2\2\u05b2\u05a9\3\2\2\2\u05b2\u05ab"+
		"\3\2\2\2\u05b2\u05ad\3\2\2\2\u05b3\u00f9\3\2\2\2\u05b4\u05b9\5\u00fc\177"+
		"\2\u05b5\u05b6\7a\2\2\u05b6\u05b8\5\u00fc\177\2\u05b7\u05b5\3\2\2\2\u05b8"+
		"\u05bb\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u00fb\3\2"+
		"\2\2\u05bb\u05b9\3\2\2\2\u05bc\u05c2\5\u00fe\u0080\2\u05bd\u05be\5\u0108"+
		"\u0085\2\u05be\u05bf\5\u0104\u0083\2\u05bf\u05c0\5\u00fc\177\2\u05c0\u05c2"+
		"\3\2\2\2\u05c1\u05bc\3\2\2\2\u05c1\u05bd\3\2\2\2\u05c2\u00fd\3\2\2\2\u05c3"+
		"\u05cd\5\u0100\u0081\2\u05c4\u05c5\5\u0100\u0081\2\u05c5\u05c7\7j\2\2"+
		"\u05c6\u05c8\5\u00fa~\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8"+
		"\u05c9\3\2\2\2\u05c9\u05ca\7k\2\2\u05ca\u05cb\5\u00fe\u0080\2\u05cb\u05cd"+
		"\3\2\2\2\u05cc\u05c3\3\2\2\2\u05cc\u05c4\3\2\2\2\u05cd\u00ff\3\2\2\2\u05ce"+
		"\u05cf\b\u0081\1\2\u05cf\u05d0\5\u0102\u0082\2\u05d0\u05f6\3\2\2\2\u05d1"+
		"\u05d2\f\f\2\2\u05d2\u05d3\t\f\2\2\u05d3\u05f5\5\u0100\u0081\r\u05d4\u05d5"+
		"\f\13\2\2\u05d5\u05d6\t\r\2\2\u05d6\u05f5\5\u0100\u0081\f\u05d7\u05dc"+
		"\f\n\2\2\u05d8\u05d9\7g\2\2\u05d9\u05dd\7g\2\2\u05da\u05db\7f\2\2\u05db"+
		"\u05dd\7f\2\2\u05dc\u05d8\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd\u05de\3\2"+
		"\2\2\u05de\u05f5\5\u0100\u0081\13\u05df\u05e0\f\t\2\2\u05e0\u05e1\t\16"+
		"\2\2\u05e1\u05f5\5\u0100\u0081\n\u05e2\u05e3\f\b\2\2\u05e3\u05e4\t\17"+
		"\2\2\u05e4\u05f5\5\u0100\u0081\t\u05e5\u05e6\f\7\2\2\u05e6\u05e7\7x\2"+
		"\2\u05e7\u05f5\5\u0100\u0081\b\u05e8\u05e9\f\6\2\2\u05e9\u05ea\7z\2\2"+
		"\u05ea\u05f5\5\u0100\u0081\7\u05eb\u05ec\f\5\2\2\u05ec\u05ed\7y\2\2\u05ed"+
		"\u05f5\5\u0100\u0081\6\u05ee\u05ef\f\4\2\2\u05ef\u05f0\7p\2\2\u05f0\u05f5"+
		"\5\u0100\u0081\5\u05f1\u05f2\f\3\2\2\u05f2\u05f3\7q\2\2\u05f3\u05f5\5"+
		"\u0100\u0081\4\u05f4\u05d1\3\2\2\2\u05f4\u05d4\3\2\2\2\u05f4\u05d7\3\2"+
		"\2\2\u05f4\u05df\3\2\2\2\u05f4\u05e2\3\2\2\2\u05f4\u05e5\3\2\2\2\u05f4"+
		"\u05e8\3\2\2\2\u05f4\u05eb\3\2\2\2\u05f4\u05ee\3\2\2\2\u05f4\u05f1\3\2"+
		"\2\2\u05f5\u05f8\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u0101\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9\u05fa\7Z\2\2\u05fa\u05fb\5\u00ce"+
		"h\2\u05fb\u05fe\7[\2\2\u05fc\u05ff\5\u0102\u0082\2\u05fd\u05ff\5\u00c6"+
		"d\2\u05fe\u05fc\3\2\2\2\u05fe\u05fd\3\2\2\2\u05ff\u0602\3\2\2\2\u0600"+
		"\u0602\5\u0108\u0085\2\u0601\u05f9\3\2\2\2\u0601\u0600\3\2\2\2\u0602\u0103"+
		"\3\2\2\2\u0603\u0604\t\20\2\2\u0604\u0105\3\2\2\2\u0605\u0608\5\u0118"+
		"\u008d\2\u0606\u0608\5\u0114\u008b\2\u0607\u0605\3\2\2\2\u0607\u0606\3"+
		"\2\2\2\u0608\u0107\3\2\2\2\u0609\u0612\5\u010c\u0087\2\u060a\u060b\7r"+
		"\2\2\u060b\u0612\5\u0108\u0085\2\u060c\u060d\7s\2\2\u060d\u0612\5\u0108"+
		"\u0085\2\u060e\u060f\5\u010a\u0086\2\u060f\u0610\5\u0102\u0082\2\u0610"+
		"\u0612\3\2\2\2\u0611\u0609\3\2\2\2\u0611\u060a\3\2\2\2\u0611\u060c\3\2"+
		"\2\2\u0611\u060e\3\2\2\2\u0612\u0109\3\2\2\2\u0613\u0614\t\21\2\2\u0614"+
		"\u010b\3\2\2\2\u0615\u0616\b\u0087\1\2\u0616\u0617\5\u0112\u008a\2\u0617"+
		"\u062a\3\2\2\2\u0618\u0619\f\6\2\2\u0619\u061a\7^\2\2\u061a\u061b\5\u00fa"+
		"~\2\u061b\u061c\7_\2\2\u061c\u0629\3\2\2\2\u061d\u061e\f\5\2\2\u061e\u0620"+
		"\7Z\2\2\u061f\u0621\5\u010e\u0088\2\u0620\u061f\3\2\2\2\u0620\u0621\3"+
		"\2\2\2\u0621\u0622\3\2\2\2\u0622\u0629\7[\2\2\u0623\u0624\f\4\2\2\u0624"+
		"\u0625\t\22\2\2\u0625\u0629\5\u0118\u008d\2\u0626\u0627\f\3\2\2\u0627"+
		"\u0629\t\23\2\2\u0628\u0618\3\2\2\2\u0628\u061d\3\2\2\2\u0628\u0623\3"+
		"\2\2\2\u0628\u0626\3\2\2\2\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a"+
		"\u062b\3\2\2\2\u062b\u010d\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u0632\5\u0110"+
		"\u0089\2\u062e\u062f\7a\2\2\u062f\u0631\5\u0110\u0089\2\u0630\u062e\3"+
		"\2\2\2\u0631\u0634\3\2\2\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633"+
		"\u010f\3\2\2\2\u0634\u0632\3\2\2\2\u0635\u0638\5\u00fc\177\2\u0636\u0638"+
		"\5\u00a8U\2\u0637\u0635\3\2\2\2\u0637\u0636\3\2\2\2\u0638\u0111\3\2\2"+
		"\2\u0639\u0649\5\u0118\u008d\2\u063a\u0649\5\u0114\u008b\2\u063b\u0649"+
		"\5\u0116\u008c\2\u063c\u063d\7Z\2\2\u063d\u063e\5\u00fa~\2\u063e\u063f"+
		"\7[\2\2\u063f\u0649\3\2\2\2\u0640\u0649\5`\61\2\u0641\u0649\5h\65\2\u0642"+
		"\u0649\5l\67\2\u0643\u0649\5n8\2\u0644\u0649\5T+\2\u0645\u0649\5X-\2\u0646"+
		"\u0649\5Z.\2\u0647\u0649\5^\60\2\u0648\u0639\3\2\2\2\u0648\u063a\3\2\2"+
		"\2\u0648\u063b\3\2\2\2\u0648\u063c\3\2\2\2\u0648\u0640\3\2\2\2\u0648\u0641"+
		"\3\2\2\2\u0648\u0642\3\2\2\2\u0648\u0643\3\2\2\2\u0648\u0644\3\2\2\2\u0648"+
		"\u0645\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0647\3\2\2\2\u0649\u0113\3\2"+
		"\2\2\u064a\u0657\7\u0096\2\2\u064b\u0657\7\u0097\2\2\u064c\u0657\7\u0098"+
		"\2\2\u064d\u064f\t\r\2\2\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f"+
		"\u0650\3\2\2\2\u0650\u0657\7\u0099\2\2\u0651\u0653\t\r\2\2\u0652\u0651"+
		"\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0657\7\u009a\2"+
		"\2\u0655\u0657\7\u0093\2\2\u0656\u064a\3\2\2\2\u0656\u064b\3\2\2\2\u0656"+
		"\u064c\3\2\2\2\u0656\u064e\3\2\2\2\u0656\u0652\3\2\2\2\u0656\u0655\3\2"+
		"\2\2\u0657\u0115\3\2\2\2\u0658\u065f\7\u0095\2\2\u0659\u065b\7\u009e\2"+
		"\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065e"+
		"\7\u0095\2\2\u065d\u065a\3\2\2\2\u065e\u0661\3\2\2\2\u065f\u065d\3\2\2"+
		"\2\u065f\u0660\3\2\2\2\u0660\u0668\3\2\2\2\u0661\u065f\3\2\2\2\u0662\u0664"+
		"\7\u0094\2\2\u0663\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0663\3\2\2"+
		"\2\u0665\u0666\3\2\2\2\u0666\u0668\3\2\2\2\u0667\u0658\3\2\2\2\u0667\u0663"+
		"\3\2\2\2\u0668\u0117\3\2\2\2\u0669\u066a\t\24\2\2\u066a\u0119\3\2\2\2"+
		"\u00db\u011d\u012d\u0137\u013a\u013d\u0140\u0148\u014c\u014f\u0152\u015a"+
		"\u015d\u0160\u016a\u0171\u0176\u0178\u018a\u0196\u019e\u01a1\u01aa\u01be"+
		"\u01c8\u01cb\u01d1\u01da\u01e2\u01ec\u01f1\u01f9\u01fb\u0204\u0208\u0211"+
		"\u0213\u021c\u0220\u0223\u022b\u022f\u0231\u0234\u023a\u023e\u0244\u0254"+
		"\u025b\u0261\u0267\u026b\u026f\u0275\u027f\u0285\u0289\u0294\u029a\u029e"+
		"\u02aa\u02ac\u02b2\u02b7\u02bb\u02c2\u02c5\u02d0\u02d6\u02d8\u02db\u02e3"+
		"\u02eb\u02ef\u02f9\u02fe\u0300\u0316\u031d\u0322\u0334\u0337\u033a\u033d"+
		"\u0342\u0345\u0348\u0354\u035a\u035e\u0364\u036d\u0374\u037b\u0380\u0383"+
		"\u0387\u038f\u0392\u0396\u039b\u039f\u03a2\u03ab\u03ad\u03b5\u03bc\u03c2"+
		"\u03c7\u03cd\u03d1\u03d6\u03de\u03e0\u03f6\u03fc\u03fe\u0403\u040d\u0414"+
		"\u0419\u041d\u0421\u0425\u042c\u0432\u043e\u0445\u0449\u044e\u0452\u0459"+
		"\u045e\u0464\u0468\u046c\u0473\u0478\u047c\u047f\u0488\u048d\u0492\u049a"+
		"\u049e\u04a0\u04ac\u04b0\u04b2\u04bb\u04bf\u04c3\u04c6\u04ca\u04ce\u04d4"+
		"\u04d8\u04dd\u04df\u04e3\u04e8\u04eb\u04f2\u04f9\u04fc\u0502\u0506\u050a"+
		"\u050e\u0512\u0516\u051a\u051e\u0522\u0526\u0529\u0532\u0537\u0539\u0545"+
		"\u0548\u0554\u055c\u0561\u0569\u056f\u0575\u057b\u058e\u0592\u0596\u05a0"+
		"\u05af\u05b2\u05b9\u05c1\u05c7\u05cc\u05dc\u05f4\u05f6\u05fe\u0601\u0607"+
		"\u0611\u0620\u0628\u062a\u0632\u0637\u0648\u064e\u0652\u0656\u065a\u065f"+
		"\u0665\u0667";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}