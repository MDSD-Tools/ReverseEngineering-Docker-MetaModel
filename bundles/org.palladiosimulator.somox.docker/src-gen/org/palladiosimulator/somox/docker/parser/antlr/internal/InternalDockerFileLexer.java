package org.palladiosimulator.somox.docker.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerFileLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_ENV_VALUE_WITH_EQUAL=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ONE_SPACE_AND_WHATEVER=4;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalDockerFileLexer() {;} 
    public InternalDockerFileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDockerFileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDockerFile.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:11:7: ( 'CMD' )
            // InternalDockerFile.g:11:9: 'CMD'
            {
            match("CMD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:12:7: ( 'COPY' )
            // InternalDockerFile.g:12:9: 'COPY'
            {
            match("COPY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:13:7: ( 'ENTRYPOINT' )
            // InternalDockerFile.g:13:9: 'ENTRYPOINT'
            {
            match("ENTRYPOINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:14:7: ( 'VOLUME' )
            // InternalDockerFile.g:14:9: 'VOLUME'
            {
            match("VOLUME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:15:7: ( 'USER' )
            // InternalDockerFile.g:15:9: 'USER'
            {
            match("USER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:16:7: ( 'ONBUILD' )
            // InternalDockerFile.g:16:9: 'ONBUILD'
            {
            match("ONBUILD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:17:7: ( 'FROM' )
            // InternalDockerFile.g:17:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:18:7: ( ':' )
            // InternalDockerFile.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:19:7: ( 'MAINTAINER' )
            // InternalDockerFile.g:19:9: 'MAINTAINER'
            {
            match("MAINTAINER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:20:7: ( 'ENV' )
            // InternalDockerFile.g:20:9: 'ENV'
            {
            match("ENV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:21:7: ( 'EXPOSE' )
            // InternalDockerFile.g:21:9: 'EXPOSE'
            {
            match("EXPOSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:22:7: ( '[' )
            // InternalDockerFile.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:23:7: ( ']' )
            // InternalDockerFile.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:24:7: ( 'WORKDIR' )
            // InternalDockerFile.g:24:9: 'WORKDIR'
            {
            match("WORKDIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:25:7: ( 'ADD' )
            // InternalDockerFile.g:25:9: 'ADD'
            {
            match("ADD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:26:7: ( '.' )
            // InternalDockerFile.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:27:7: ( 'RUN' )
            // InternalDockerFile.g:27:9: 'RUN'
            {
            match("RUN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:28:7: ( ',' )
            // InternalDockerFile.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:29:7: ( '/' )
            // InternalDockerFile.g:29:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:30:7: ( '*' )
            // InternalDockerFile.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:31:7: ( 'http://' )
            // InternalDockerFile.g:31:9: 'http://'
            {
            match("http://"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:32:7: ( '-' )
            // InternalDockerFile.g:32:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:1438:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDockerFile.g:1438:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalDockerFile.g:1438:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDockerFile.g:1438:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDockerFile.g:1438:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDockerFile.g:1438:40: ( '\\r' )? '\\n'
                    {
                    // InternalDockerFile.g:1438:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDockerFile.g:1438:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ONE_SPACE_AND_WHATEVER"
    public final void mRULE_ONE_SPACE_AND_WHATEVER() throws RecognitionException {
        try {
            int _type = RULE_ONE_SPACE_AND_WHATEVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:1440:29: ( ' ' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDockerFile.g:1440:31: ' ' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(' '); 
            // InternalDockerFile.g:1440:35: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDockerFile.g:1440:35: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDockerFile.g:1440:51: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDockerFile.g:1440:52: ( '\\r' )? '\\n'
                    {
                    // InternalDockerFile.g:1440:52: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDockerFile.g:1440:52: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_SPACE_AND_WHATEVER"

    // $ANTLR start "RULE_ENV_VALUE_WITH_EQUAL"
    public final void mRULE_ENV_VALUE_WITH_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_ENV_VALUE_WITH_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:1442:27: ( '=' (~ ( ( '\\n' | '\\r' | ' ' ) ) )* ( ' ' )? )
            // InternalDockerFile.g:1442:29: '=' (~ ( ( '\\n' | '\\r' | ' ' ) ) )* ( ' ' )?
            {
            match('='); 
            // InternalDockerFile.g:1442:33: (~ ( ( '\\n' | '\\r' | ' ' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||(LA7_0>='!' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDockerFile.g:1442:33: ~ ( ( '\\n' | '\\r' | ' ' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDockerFile.g:1442:53: ( ' ' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==' ') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDockerFile.g:1442:53: ' '
                    {
                    match(' '); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENV_VALUE_WITH_EQUAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:1444:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDockerFile.g:1444:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDockerFile.g:1444:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDockerFile.g:1444:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDockerFile.g:1444:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDockerFile.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:1446:10: ( ( '0' .. '9' )+ )
            // InternalDockerFile.g:1446:12: ( '0' .. '9' )+
            {
            // InternalDockerFile.g:1446:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDockerFile.g:1446:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:1448:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDockerFile.g:1448:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDockerFile.g:1448:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDockerFile.g:1448:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDockerFile.g:1448:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDockerFile.g:1448:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerFile.g:1448:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:1448:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDockerFile.g:1448:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDockerFile.g:1448:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDockerFile.g:1448:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:1450:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDockerFile.g:1450:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDockerFile.g:1450:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDockerFile.g:1450:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:1452:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDockerFile.g:1452:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDockerFile.g:1452:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDockerFile.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDockerFile.g:1454:16: ( . )
            // InternalDockerFile.g:1454:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDockerFile.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_SL_COMMENT | RULE_ONE_SPACE_AND_WHATEVER | RULE_ENV_VALUE_WITH_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=31;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalDockerFile.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalDockerFile.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalDockerFile.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalDockerFile.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalDockerFile.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalDockerFile.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalDockerFile.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalDockerFile.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalDockerFile.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalDockerFile.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalDockerFile.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalDockerFile.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalDockerFile.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalDockerFile.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalDockerFile.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalDockerFile.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalDockerFile.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalDockerFile.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalDockerFile.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalDockerFile.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalDockerFile.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalDockerFile.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalDockerFile.g:1:142: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalDockerFile.g:1:158: RULE_ONE_SPACE_AND_WHATEVER
                {
                mRULE_ONE_SPACE_AND_WHATEVER(); 

                }
                break;
            case 25 :
                // InternalDockerFile.g:1:186: RULE_ENV_VALUE_WITH_EQUAL
                {
                mRULE_ENV_VALUE_WITH_EQUAL(); 

                }
                break;
            case 26 :
                // InternalDockerFile.g:1:212: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalDockerFile.g:1:220: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalDockerFile.g:1:229: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalDockerFile.g:1:241: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalDockerFile.g:1:257: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalDockerFile.g:1:265: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\6\40\1\uffff\1\40\2\uffff\2\40\1\uffff\1\40\1\uffff\1\61\1\uffff\1\40\2\uffff\1\71\1\uffff\1\35\2\uffff\2\35\2\uffff\2\40\1\uffff\6\40\1\uffff\1\40\2\uffff\2\40\1\uffff\1\40\4\uffff\1\40\2\uffff\1\71\1\75\1\71\5\uffff\1\114\2\40\1\117\7\40\1\127\1\130\1\40\1\uffff\1\132\1\40\1\uffff\2\40\1\136\1\40\1\140\2\40\2\uffff\1\40\1\uffff\3\40\1\uffff\1\40\1\uffff\2\40\1\uffff\1\40\1\153\1\154\4\40\2\uffff\1\161\1\40\1\163\1\40\1\uffff\1\40\1\uffff\2\40\1\170\1\171\2\uffff";
    static final String DFA17_eofS =
        "\172\uffff";
    static final String DFA17_minS =
        "\1\0\1\115\1\116\1\117\1\123\1\116\1\122\1\uffff\1\101\2\uffff\1\117\1\104\1\uffff\1\125\1\uffff\1\52\1\uffff\1\164\2\uffff\1\11\1\uffff\1\101\2\uffff\2\0\2\uffff\1\104\1\120\1\uffff\1\124\1\120\1\114\1\105\1\102\1\117\1\uffff\1\111\2\uffff\1\122\1\104\1\uffff\1\116\4\uffff\1\164\2\uffff\1\11\1\12\1\11\5\uffff\1\60\1\131\1\122\1\60\1\117\1\125\1\122\1\125\1\115\1\116\1\113\2\60\1\160\1\uffff\1\60\1\131\1\uffff\1\123\1\115\1\60\1\111\1\60\1\124\1\104\2\uffff\1\72\1\uffff\1\120\2\105\1\uffff\1\114\1\uffff\1\101\1\111\1\uffff\1\117\2\60\1\104\1\111\1\122\1\111\2\uffff\1\60\1\116\1\60\1\116\1\uffff\1\105\1\uffff\1\124\1\122\2\60\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\117\1\130\1\117\1\123\1\116\1\122\1\uffff\1\101\2\uffff\1\117\1\104\1\uffff\1\125\1\uffff\1\52\1\uffff\1\164\2\uffff\1\40\1\uffff\1\172\2\uffff\2\uffff\2\uffff\1\104\1\120\1\uffff\1\126\1\120\1\114\1\105\1\102\1\117\1\uffff\1\111\2\uffff\1\122\1\104\1\uffff\1\116\4\uffff\1\164\2\uffff\1\40\1\12\1\40\5\uffff\1\172\1\131\1\122\1\172\1\117\1\125\1\122\1\125\1\115\1\116\1\113\2\172\1\160\1\uffff\1\172\1\131\1\uffff\1\123\1\115\1\172\1\111\1\172\1\124\1\104\2\uffff\1\72\1\uffff\1\120\2\105\1\uffff\1\114\1\uffff\1\101\1\111\1\uffff\1\117\2\172\1\104\1\111\1\122\1\111\2\uffff\1\172\1\116\1\172\1\116\1\uffff\1\105\1\uffff\1\124\1\122\2\172\2\uffff";
    static final String DFA17_acceptS =
        "\7\uffff\1\10\1\uffff\1\14\1\15\2\uffff\1\20\1\uffff\1\22\1\uffff\1\24\1\uffff\1\26\1\27\1\uffff\1\31\1\uffff\1\32\1\33\2\uffff\1\36\1\37\2\uffff\1\32\6\uffff\1\10\1\uffff\1\14\1\15\2\uffff\1\20\1\uffff\1\22\1\35\1\23\1\24\1\uffff\1\26\1\27\3\uffff\1\30\1\31\1\33\1\34\1\36\16\uffff\1\1\2\uffff\1\12\7\uffff\1\17\1\21\1\uffff\1\2\3\uffff\1\5\1\uffff\1\7\2\uffff\1\25\7\uffff\1\13\1\4\4\uffff\1\6\1\uffff\1\16\4\uffff\1\3\1\11";
    static final String DFA17_specialS =
        "\1\0\31\uffff\1\2\1\1\136\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\25\1\35\1\32\1\24\3\35\1\33\2\35\1\21\1\35\1\17\1\23\1\15\1\20\12\31\1\7\2\35\1\26\3\35\1\14\1\30\1\1\1\30\1\2\1\6\6\30\1\10\1\30\1\5\2\30\1\16\2\30\1\4\1\3\1\13\3\30\1\11\1\35\1\12\1\27\1\30\1\35\7\30\1\22\22\30\uff85\35",
            "\1\36\1\uffff\1\37",
            "\1\41\11\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\50",
            "",
            "",
            "\1\53",
            "\1\54",
            "",
            "\1\56",
            "",
            "\1\60",
            "",
            "\1\63",
            "",
            "",
            "\1\66\1\70\2\uffff\1\67\22\uffff\1\66",
            "",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\0\74",
            "\0\74",
            "",
            "",
            "\1\76",
            "\1\77",
            "",
            "\1\100\1\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "",
            "",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "",
            "",
            "",
            "",
            "\1\113",
            "",
            "",
            "\1\66\1\70\2\uffff\1\67\22\uffff\1\66",
            "\1\70",
            "\2\75\2\uffff\1\75\22\uffff\1\75",
            "",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\115",
            "\1\116",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\131",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\137",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\162",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\164",
            "",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_SL_COMMENT | RULE_ONE_SPACE_AND_WHATEVER | RULE_ENV_VALUE_WITH_EQUAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='C') ) {s = 1;}

                        else if ( (LA17_0=='E') ) {s = 2;}

                        else if ( (LA17_0=='V') ) {s = 3;}

                        else if ( (LA17_0=='U') ) {s = 4;}

                        else if ( (LA17_0=='O') ) {s = 5;}

                        else if ( (LA17_0=='F') ) {s = 6;}

                        else if ( (LA17_0==':') ) {s = 7;}

                        else if ( (LA17_0=='M') ) {s = 8;}

                        else if ( (LA17_0=='[') ) {s = 9;}

                        else if ( (LA17_0==']') ) {s = 10;}

                        else if ( (LA17_0=='W') ) {s = 11;}

                        else if ( (LA17_0=='A') ) {s = 12;}

                        else if ( (LA17_0=='.') ) {s = 13;}

                        else if ( (LA17_0=='R') ) {s = 14;}

                        else if ( (LA17_0==',') ) {s = 15;}

                        else if ( (LA17_0=='/') ) {s = 16;}

                        else if ( (LA17_0=='*') ) {s = 17;}

                        else if ( (LA17_0=='h') ) {s = 18;}

                        else if ( (LA17_0=='-') ) {s = 19;}

                        else if ( (LA17_0=='#') ) {s = 20;}

                        else if ( (LA17_0==' ') ) {s = 21;}

                        else if ( (LA17_0=='=') ) {s = 22;}

                        else if ( (LA17_0=='^') ) {s = 23;}

                        else if ( (LA17_0=='B'||LA17_0=='D'||(LA17_0>='G' && LA17_0<='L')||LA17_0=='N'||(LA17_0>='P' && LA17_0<='Q')||(LA17_0>='S' && LA17_0<='T')||(LA17_0>='X' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='g')||(LA17_0>='i' && LA17_0<='z')) ) {s = 24;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 25;}

                        else if ( (LA17_0=='\"') ) {s = 26;}

                        else if ( (LA17_0=='\'') ) {s = 27;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r') ) {s = 28;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='$' && LA17_0<='&')||(LA17_0>='(' && LA17_0<=')')||LA17_0=='+'||(LA17_0>=';' && LA17_0<='<')||(LA17_0>='>' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_27 = input.LA(1);

                        s = -1;
                        if ( ((LA17_27>='\u0000' && LA17_27<='\uFFFF')) ) {s = 60;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( ((LA17_26>='\u0000' && LA17_26<='\uFFFF')) ) {s = 60;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}