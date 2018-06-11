package com.away1994.objectivec.parser;

import com.away1994.constants.TestConstants;
import com.away1994.dist.visitor.ObjectiveCPreprocessor;
import com.away1994.gen.objectivec.ObjectiveCLexer;
import com.away1994.gen.objectivec.ObjectiveCParser;
import com.away1994.gen.objectivec.ObjectiveCPreprocessorLexer;
import com.away1994.gen.objectivec.ObjectiveCPreprocessorParser;
import com.away1994.lang.aggregator.impl.AggregatorImpl;
import com.away1994.lang.parser.Options;
import com.away1994.lang.parser.Parser;
import com.away1994.lang.parser.impl.objectivec.ObjcG4Util;
import com.away1994.lang.parser.impl.objectivec.ObjectiveCLanguageParser;
import com.away1994.lang.symbols.impl.PathImpl;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.junit.Test;

import java.util.logging.Logger;

import static com.away1994.common.constants.CommonConstants.LOGGING_PROPERTIES_PATH;
import static com.away1994.common.utils.log.LogUtils.readLoggerConfigurationFromResourceFromClassClassLoader;
import static com.away1994.constants.TestConstants.TEST_RESOURCES_PATH;

public class ParserFunctionTest {
    private static final transient Logger LOGGER = Logger.getLogger(ParserFunctionTest.class.getName());

    @Test
    public void parserFunctionTest1() throws Exception {

        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);

        ParserRuleContext tree = getMethodTree(TestConstants.WEVIEW_JAVASCRIPT_BRIDGE_SEND_DATA_FUNCTION);

        ObjectiveCLanguageParser languageParser = new ObjectiveCLanguageParser();
        Options options = new Options();
        options.setVerbose(true);
        languageParser.setOptions(options);

        Parser parser = new Parser(new PathImpl(TestConstants.IOS_HELLO_PROJECT_PATH),
                languageParser);


        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();



    }

    private ParserRuleContext getMethodTree(String methodString) {
        CharStream fs = new ANTLRInputStream(methodString);

        ObjectiveCPreprocessorLexer preLexer = new ObjectiveCPreprocessorLexer(fs);

        CommonTokenStream preToken = new CommonTokenStream(preLexer);

        ObjectiveCPreprocessorParser preParser = new ObjectiveCPreprocessorParser(preToken);
        /// remove error log handler
        preParser.removeErrorListeners();

        ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree = preParser.objectiveCDocument();

        ObjectiveCPreprocessor preprocessor = new ObjectiveCPreprocessor(preToken);
        String codeString = preprocessor.visit(preParseTree);

        ANTLRInputStream inputStream = new ANTLRInputStream(codeString);
        ObjectiveCLexer lexer = new ObjectiveCLexer(inputStream);

        CommonTokenStream token = new CommonTokenStream(lexer);

        ObjectiveCParser parser = new ObjectiveCParser(token);
        /// remove error log handler
        parser.removeErrorListeners();

        ParserRuleContext tree = parser.methodDeclaration();
        return tree;
    }
}
