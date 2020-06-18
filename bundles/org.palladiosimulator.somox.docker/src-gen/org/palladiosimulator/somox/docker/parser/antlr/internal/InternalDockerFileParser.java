package org.palladiosimulator.somox.docker.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.palladiosimulator.somox.docker.services.DockerFileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerFileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ONE_SPACE_AND_WHATEVER", "RULE_ID", "RULE_STRING", "RULE_ENV_VALUE_WITH_EQUAL", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CMD'", "'COPY'", "'ENTRYPOINT'", "'VOLUME'", "'USER'", "'ONBUILD'", "'FROM'", "':'", "'MAINTAINER'", "'ENV'", "'EXPOSE'", "'['", "']'", "'WORKDIR'", "'ADD'", "'.'", "'RUN'", "','", "'/'", "'*'", "'http://'", "'-'"
    };
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


        public InternalDockerFileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDockerFileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDockerFileParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDockerFile.g"; }



     	private DockerFileGrammarAccess grammarAccess;

        public InternalDockerFileParser(TokenStream input, DockerFileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Dockerfile";
       	}

       	@Override
       	protected DockerFileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDockerfile"
    // InternalDockerFile.g:64:1: entryRuleDockerfile returns [EObject current=null] : iv_ruleDockerfile= ruleDockerfile EOF ;
    public final EObject entryRuleDockerfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerfile = null;


        try {
            // InternalDockerFile.g:64:51: (iv_ruleDockerfile= ruleDockerfile EOF )
            // InternalDockerFile.g:65:2: iv_ruleDockerfile= ruleDockerfile EOF
            {
             newCompositeNode(grammarAccess.getDockerfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerfile=ruleDockerfile();

            state._fsp--;

             current =iv_ruleDockerfile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDockerfile"


    // $ANTLR start "ruleDockerfile"
    // InternalDockerFile.g:71:1: ruleDockerfile returns [EObject current=null] : ( (lv_instructions_0_0= ruleInstruction ) )+ ;
    public final EObject ruleDockerfile() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:77:2: ( ( (lv_instructions_0_0= ruleInstruction ) )+ )
            // InternalDockerFile.g:78:2: ( (lv_instructions_0_0= ruleInstruction ) )+
            {
            // InternalDockerFile.g:78:2: ( (lv_instructions_0_0= ruleInstruction ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=19)||(LA1_0>=21 && LA1_0<=24)||(LA1_0>=26 && LA1_0<=27)||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDockerFile.g:79:3: (lv_instructions_0_0= ruleInstruction )
            	    {
            	    // InternalDockerFile.g:79:3: (lv_instructions_0_0= ruleInstruction )
            	    // InternalDockerFile.g:80:4: lv_instructions_0_0= ruleInstruction
            	    {

            	    				newCompositeNode(grammarAccess.getDockerfileAccess().getInstructionsInstructionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_0_0=ruleInstruction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDockerfileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instructions",
            	    					lv_instructions_0_0,
            	    					"org.palladiosimulator.somox.docker.DockerFile.Instruction");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDockerfile"


    // $ANTLR start "entryRuleInstruction"
    // InternalDockerFile.g:100:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalDockerFile.g:100:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalDockerFile.g:101:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalDockerFile.g:107:1: ruleInstruction returns [EObject current=null] : (this_Add_0= ruleAdd | this_Cmd_1= ruleCmd | this_Copy_2= ruleCopy | this_Entrypoint_3= ruleEntrypoint | this_Expose_4= ruleExpose | this_Env_5= ruleEnv | this_From_6= ruleFrom | this_Maintainer_7= ruleMaintainer | this_Onbuild_8= ruleOnbuild | this_Run_9= ruleRun | this_User_10= ruleUser | this_Volume_11= ruleVolume | this_Workdir_12= ruleWorkdir ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Cmd_1 = null;

        EObject this_Copy_2 = null;

        EObject this_Entrypoint_3 = null;

        EObject this_Expose_4 = null;

        EObject this_Env_5 = null;

        EObject this_From_6 = null;

        EObject this_Maintainer_7 = null;

        EObject this_Onbuild_8 = null;

        EObject this_Run_9 = null;

        EObject this_User_10 = null;

        EObject this_Volume_11 = null;

        EObject this_Workdir_12 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:113:2: ( (this_Add_0= ruleAdd | this_Cmd_1= ruleCmd | this_Copy_2= ruleCopy | this_Entrypoint_3= ruleEntrypoint | this_Expose_4= ruleExpose | this_Env_5= ruleEnv | this_From_6= ruleFrom | this_Maintainer_7= ruleMaintainer | this_Onbuild_8= ruleOnbuild | this_Run_9= ruleRun | this_User_10= ruleUser | this_Volume_11= ruleVolume | this_Workdir_12= ruleWorkdir ) )
            // InternalDockerFile.g:114:2: (this_Add_0= ruleAdd | this_Cmd_1= ruleCmd | this_Copy_2= ruleCopy | this_Entrypoint_3= ruleEntrypoint | this_Expose_4= ruleExpose | this_Env_5= ruleEnv | this_From_6= ruleFrom | this_Maintainer_7= ruleMaintainer | this_Onbuild_8= ruleOnbuild | this_Run_9= ruleRun | this_User_10= ruleUser | this_Volume_11= ruleVolume | this_Workdir_12= ruleWorkdir )
            {
            // InternalDockerFile.g:114:2: (this_Add_0= ruleAdd | this_Cmd_1= ruleCmd | this_Copy_2= ruleCopy | this_Entrypoint_3= ruleEntrypoint | this_Expose_4= ruleExpose | this_Env_5= ruleEnv | this_From_6= ruleFrom | this_Maintainer_7= ruleMaintainer | this_Onbuild_8= ruleOnbuild | this_Run_9= ruleRun | this_User_10= ruleUser | this_Volume_11= ruleVolume | this_Workdir_12= ruleWorkdir )
            int alt2=13;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            case 19:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            case 18:
                {
                alt2=9;
                }
                break;
            case 24:
            case 29:
                {
                alt2=10;
                }
                break;
            case 17:
                {
                alt2=11;
                }
                break;
            case 16:
                {
                alt2=12;
                }
                break;
            case 26:
                {
                alt2=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDockerFile.g:115:3: this_Add_0= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAddParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_0=ruleAdd();

                    state._fsp--;


                    			current = this_Add_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:124:3: this_Cmd_1= ruleCmd
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCmdParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cmd_1=ruleCmd();

                    state._fsp--;


                    			current = this_Cmd_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDockerFile.g:133:3: this_Copy_2= ruleCopy
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCopyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Copy_2=ruleCopy();

                    state._fsp--;


                    			current = this_Copy_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDockerFile.g:142:3: this_Entrypoint_3= ruleEntrypoint
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getEntrypointParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entrypoint_3=ruleEntrypoint();

                    state._fsp--;


                    			current = this_Entrypoint_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDockerFile.g:151:3: this_Expose_4= ruleExpose
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getExposeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expose_4=ruleExpose();

                    state._fsp--;


                    			current = this_Expose_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDockerFile.g:160:3: this_Env_5= ruleEnv
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getEnvParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Env_5=ruleEnv();

                    state._fsp--;


                    			current = this_Env_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDockerFile.g:169:3: this_From_6= ruleFrom
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getFromParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_From_6=ruleFrom();

                    state._fsp--;


                    			current = this_From_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDockerFile.g:178:3: this_Maintainer_7= ruleMaintainer
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMaintainerParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Maintainer_7=ruleMaintainer();

                    state._fsp--;


                    			current = this_Maintainer_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDockerFile.g:187:3: this_Onbuild_8= ruleOnbuild
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getOnbuildParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Onbuild_8=ruleOnbuild();

                    state._fsp--;


                    			current = this_Onbuild_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDockerFile.g:196:3: this_Run_9= ruleRun
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getRunParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Run_9=ruleRun();

                    state._fsp--;


                    			current = this_Run_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDockerFile.g:205:3: this_User_10= ruleUser
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getUserParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_User_10=ruleUser();

                    state._fsp--;


                    			current = this_User_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDockerFile.g:214:3: this_Volume_11= ruleVolume
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getVolumeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Volume_11=ruleVolume();

                    state._fsp--;


                    			current = this_Volume_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDockerFile.g:223:3: this_Workdir_12= ruleWorkdir
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getWorkdirParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Workdir_12=ruleWorkdir();

                    state._fsp--;


                    			current = this_Workdir_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCmd"
    // InternalDockerFile.g:235:1: entryRuleCmd returns [EObject current=null] : iv_ruleCmd= ruleCmd EOF ;
    public final EObject entryRuleCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmd = null;


        try {
            // InternalDockerFile.g:235:44: (iv_ruleCmd= ruleCmd EOF )
            // InternalDockerFile.g:236:2: iv_ruleCmd= ruleCmd EOF
            {
             newCompositeNode(grammarAccess.getCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmd=ruleCmd();

            state._fsp--;

             current =iv_ruleCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmd"


    // $ANTLR start "ruleCmd"
    // InternalDockerFile.g:242:1: ruleCmd returns [EObject current=null] : (otherlv_0= 'CMD' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ;
    public final EObject ruleCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ONE_SPACE_AND_WHATEVER_3=null;
        EObject this_JSON_ARRAY_1 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:248:2: ( (otherlv_0= 'CMD' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            // InternalDockerFile.g:249:2: (otherlv_0= 'CMD' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            {
            // InternalDockerFile.g:249:2: (otherlv_0= 'CMD' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            // InternalDockerFile.g:250:3: otherlv_0= 'CMD' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCmdAccess().getCMDKeyword_0());
            		
            // InternalDockerFile.g:254:3: (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ONE_SPACE_AND_WHATEVER) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDockerFile.g:255:4: this_JSON_ARRAY_1= ruleJSON_ARRAY
                    {

                    				newCompositeNode(grammarAccess.getCmdAccess().getJSON_ARRAYParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_JSON_ARRAY_1=ruleJSON_ARRAY();

                    state._fsp--;


                    				current = this_JSON_ARRAY_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:264:4: ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER )
                    {
                    // InternalDockerFile.g:264:4: ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER )
                    // InternalDockerFile.g:265:5: () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER
                    {
                    // InternalDockerFile.g:265:5: ()
                    // InternalDockerFile.g:266:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getCmdAccess().getCmdAction_1_1_0(),
                    							current);
                    					

                    }

                    this_ONE_SPACE_AND_WHATEVER_3=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

                    					newLeafNode(this_ONE_SPACE_AND_WHATEVER_3, grammarAccess.getCmdAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmd"


    // $ANTLR start "entryRuleCopy"
    // InternalDockerFile.g:282:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalDockerFile.g:282:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalDockerFile.g:283:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalDockerFile.g:289:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'COPY' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( ( (lv_source_left_2_0= ruleAddSource ) ) ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ) ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dest_3_0=null;
        EObject this_JSON_ARRAY_1 = null;

        AntlrDatatypeRuleToken lv_source_left_2_0 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:295:2: ( (otherlv_0= 'COPY' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( ( (lv_source_left_2_0= ruleAddSource ) ) ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ) ) )
            // InternalDockerFile.g:296:2: (otherlv_0= 'COPY' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( ( (lv_source_left_2_0= ruleAddSource ) ) ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ) )
            {
            // InternalDockerFile.g:296:2: (otherlv_0= 'COPY' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( ( (lv_source_left_2_0= ruleAddSource ) ) ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ) )
            // InternalDockerFile.g:297:3: otherlv_0= 'COPY' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( ( (lv_source_left_2_0= ruleAddSource ) ) ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCOPYKeyword_0());
            		
            // InternalDockerFile.g:301:3: (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( ( (lv_source_left_2_0= ruleAddSource ) ) ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==28||LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDockerFile.g:302:4: this_JSON_ARRAY_1= ruleJSON_ARRAY
                    {

                    				newCompositeNode(grammarAccess.getCopyAccess().getJSON_ARRAYParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_JSON_ARRAY_1=ruleJSON_ARRAY();

                    state._fsp--;


                    				current = this_JSON_ARRAY_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:311:4: ( ( (lv_source_left_2_0= ruleAddSource ) ) ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
                    {
                    // InternalDockerFile.g:311:4: ( ( (lv_source_left_2_0= ruleAddSource ) ) ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
                    // InternalDockerFile.g:312:5: ( (lv_source_left_2_0= ruleAddSource ) ) ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) )
                    {
                    // InternalDockerFile.g:312:5: ( (lv_source_left_2_0= ruleAddSource ) )
                    // InternalDockerFile.g:313:6: (lv_source_left_2_0= ruleAddSource )
                    {
                    // InternalDockerFile.g:313:6: (lv_source_left_2_0= ruleAddSource )
                    // InternalDockerFile.g:314:7: lv_source_left_2_0= ruleAddSource
                    {

                    							newCompositeNode(grammarAccess.getCopyAccess().getSource_leftAddSourceParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_source_left_2_0=ruleAddSource();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCopyRule());
                    							}
                    							set(
                    								current,
                    								"source_left",
                    								lv_source_left_2_0,
                    								"org.palladiosimulator.somox.docker.DockerFile.AddSource");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDockerFile.g:331:5: ( (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER ) )
                    // InternalDockerFile.g:332:6: (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER )
                    {
                    // InternalDockerFile.g:332:6: (lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER )
                    // InternalDockerFile.g:333:7: lv_dest_3_0= RULE_ONE_SPACE_AND_WHATEVER
                    {
                    lv_dest_3_0=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

                    							newLeafNode(lv_dest_3_0, grammarAccess.getCopyAccess().getDestONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCopyRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"dest",
                    								lv_dest_3_0,
                    								"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleEntrypoint"
    // InternalDockerFile.g:355:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // InternalDockerFile.g:355:51: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // InternalDockerFile.g:356:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
             newCompositeNode(grammarAccess.getEntrypointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;

             current =iv_ruleEntrypoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntrypoint"


    // $ANTLR start "ruleEntrypoint"
    // InternalDockerFile.g:362:1: ruleEntrypoint returns [EObject current=null] : (otherlv_0= 'ENTRYPOINT' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ONE_SPACE_AND_WHATEVER_3=null;
        EObject this_JSON_ARRAY_1 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:368:2: ( (otherlv_0= 'ENTRYPOINT' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            // InternalDockerFile.g:369:2: (otherlv_0= 'ENTRYPOINT' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            {
            // InternalDockerFile.g:369:2: (otherlv_0= 'ENTRYPOINT' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            // InternalDockerFile.g:370:3: otherlv_0= 'ENTRYPOINT' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0());
            		
            // InternalDockerFile.g:374:3: (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ONE_SPACE_AND_WHATEVER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDockerFile.g:375:4: this_JSON_ARRAY_1= ruleJSON_ARRAY
                    {

                    				newCompositeNode(grammarAccess.getEntrypointAccess().getJSON_ARRAYParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_JSON_ARRAY_1=ruleJSON_ARRAY();

                    state._fsp--;


                    				current = this_JSON_ARRAY_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:384:4: ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER )
                    {
                    // InternalDockerFile.g:384:4: ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER )
                    // InternalDockerFile.g:385:5: () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER
                    {
                    // InternalDockerFile.g:385:5: ()
                    // InternalDockerFile.g:386:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getEntrypointAccess().getCmdAction_1_1_0(),
                    							current);
                    					

                    }

                    this_ONE_SPACE_AND_WHATEVER_3=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

                    					newLeafNode(this_ONE_SPACE_AND_WHATEVER_3, grammarAccess.getEntrypointAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntrypoint"


    // $ANTLR start "entryRuleVolume"
    // InternalDockerFile.g:402:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalDockerFile.g:402:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalDockerFile.g:403:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalDockerFile.g:409:1: ruleVolume returns [EObject current=null] : (otherlv_0= 'VOLUME' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ONE_SPACE_AND_WHATEVER_3=null;
        EObject this_JSON_ARRAY_1 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:415:2: ( (otherlv_0= 'VOLUME' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            // InternalDockerFile.g:416:2: (otherlv_0= 'VOLUME' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            {
            // InternalDockerFile.g:416:2: (otherlv_0= 'VOLUME' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            // InternalDockerFile.g:417:3: otherlv_0= 'VOLUME' (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVolumeAccess().getVOLUMEKeyword_0());
            		
            // InternalDockerFile.g:421:3: (this_JSON_ARRAY_1= ruleJSON_ARRAY | ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ONE_SPACE_AND_WHATEVER) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDockerFile.g:422:4: this_JSON_ARRAY_1= ruleJSON_ARRAY
                    {

                    				newCompositeNode(grammarAccess.getVolumeAccess().getJSON_ARRAYParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_JSON_ARRAY_1=ruleJSON_ARRAY();

                    state._fsp--;


                    				current = this_JSON_ARRAY_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:431:4: ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER )
                    {
                    // InternalDockerFile.g:431:4: ( () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER )
                    // InternalDockerFile.g:432:5: () this_ONE_SPACE_AND_WHATEVER_3= RULE_ONE_SPACE_AND_WHATEVER
                    {
                    // InternalDockerFile.g:432:5: ()
                    // InternalDockerFile.g:433:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getVolumeAccess().getVolumeAction_1_1_0(),
                    							current);
                    					

                    }

                    this_ONE_SPACE_AND_WHATEVER_3=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

                    					newLeafNode(this_ONE_SPACE_AND_WHATEVER_3, grammarAccess.getVolumeAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleUser"
    // InternalDockerFile.g:449:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalDockerFile.g:449:45: (iv_ruleUser= ruleUser EOF )
            // InternalDockerFile.g:450:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalDockerFile.g:456:1: ruleUser returns [EObject current=null] : (otherlv_0= 'USER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDockerFile.g:462:2: ( (otherlv_0= 'USER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDockerFile.g:463:2: (otherlv_0= 'USER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDockerFile.g:463:2: (otherlv_0= 'USER' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDockerFile.g:464:3: otherlv_0= 'USER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUSERKeyword_0());
            		
            // InternalDockerFile.g:468:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDockerFile.g:469:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDockerFile.g:469:4: (lv_name_1_0= RULE_ID )
            // InternalDockerFile.g:470:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleOnbuild"
    // InternalDockerFile.g:490:1: entryRuleOnbuild returns [EObject current=null] : iv_ruleOnbuild= ruleOnbuild EOF ;
    public final EObject entryRuleOnbuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnbuild = null;


        try {
            // InternalDockerFile.g:490:48: (iv_ruleOnbuild= ruleOnbuild EOF )
            // InternalDockerFile.g:491:2: iv_ruleOnbuild= ruleOnbuild EOF
            {
             newCompositeNode(grammarAccess.getOnbuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnbuild=ruleOnbuild();

            state._fsp--;

             current =iv_ruleOnbuild; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnbuild"


    // $ANTLR start "ruleOnbuild"
    // InternalDockerFile.g:497:1: ruleOnbuild returns [EObject current=null] : (otherlv_0= 'ONBUILD' ( (lv_instruction_1_0= ruleInstruction ) ) ) ;
    public final EObject ruleOnbuild() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_instruction_1_0 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:503:2: ( (otherlv_0= 'ONBUILD' ( (lv_instruction_1_0= ruleInstruction ) ) ) )
            // InternalDockerFile.g:504:2: (otherlv_0= 'ONBUILD' ( (lv_instruction_1_0= ruleInstruction ) ) )
            {
            // InternalDockerFile.g:504:2: (otherlv_0= 'ONBUILD' ( (lv_instruction_1_0= ruleInstruction ) ) )
            // InternalDockerFile.g:505:3: otherlv_0= 'ONBUILD' ( (lv_instruction_1_0= ruleInstruction ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getOnbuildAccess().getONBUILDKeyword_0());
            		
            // InternalDockerFile.g:509:3: ( (lv_instruction_1_0= ruleInstruction ) )
            // InternalDockerFile.g:510:4: (lv_instruction_1_0= ruleInstruction )
            {
            // InternalDockerFile.g:510:4: (lv_instruction_1_0= ruleInstruction )
            // InternalDockerFile.g:511:5: lv_instruction_1_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getOnbuildAccess().getInstructionInstructionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_instruction_1_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnbuildRule());
            					}
            					set(
            						current,
            						"instruction",
            						lv_instruction_1_0,
            						"org.palladiosimulator.somox.docker.DockerFile.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnbuild"


    // $ANTLR start "entryRuleFrom"
    // InternalDockerFile.g:532:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // InternalDockerFile.g:532:45: (iv_ruleFrom= ruleFrom EOF )
            // InternalDockerFile.g:533:2: iv_ruleFrom= ruleFrom EOF
            {
             newCompositeNode(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrom=ruleFrom();

            state._fsp--;

             current =iv_ruleFrom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalDockerFile.g:539:1: ruleFrom returns [EObject current=null] : (otherlv_0= 'FROM' ( (lv_name_1_0= ruleVALID_IMAGE_NAME ) ) (otherlv_2= ':' ( (lv_tag_3_0= ruleVALID_IMAGE_TAG ) ) )? ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_tag_3_0 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:545:2: ( (otherlv_0= 'FROM' ( (lv_name_1_0= ruleVALID_IMAGE_NAME ) ) (otherlv_2= ':' ( (lv_tag_3_0= ruleVALID_IMAGE_TAG ) ) )? ) )
            // InternalDockerFile.g:546:2: (otherlv_0= 'FROM' ( (lv_name_1_0= ruleVALID_IMAGE_NAME ) ) (otherlv_2= ':' ( (lv_tag_3_0= ruleVALID_IMAGE_TAG ) ) )? )
            {
            // InternalDockerFile.g:546:2: (otherlv_0= 'FROM' ( (lv_name_1_0= ruleVALID_IMAGE_NAME ) ) (otherlv_2= ':' ( (lv_tag_3_0= ruleVALID_IMAGE_TAG ) ) )? )
            // InternalDockerFile.g:547:3: otherlv_0= 'FROM' ( (lv_name_1_0= ruleVALID_IMAGE_NAME ) ) (otherlv_2= ':' ( (lv_tag_3_0= ruleVALID_IMAGE_TAG ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFROMKeyword_0());
            		
            // InternalDockerFile.g:551:3: ( (lv_name_1_0= ruleVALID_IMAGE_NAME ) )
            // InternalDockerFile.g:552:4: (lv_name_1_0= ruleVALID_IMAGE_NAME )
            {
            // InternalDockerFile.g:552:4: (lv_name_1_0= ruleVALID_IMAGE_NAME )
            // InternalDockerFile.g:553:5: lv_name_1_0= ruleVALID_IMAGE_NAME
            {

            					newCompositeNode(grammarAccess.getFromAccess().getNameVALID_IMAGE_NAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleVALID_IMAGE_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFromRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.palladiosimulator.somox.docker.DockerFile.VALID_IMAGE_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDockerFile.g:570:3: (otherlv_2= ':' ( (lv_tag_3_0= ruleVALID_IMAGE_TAG ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDockerFile.g:571:4: otherlv_2= ':' ( (lv_tag_3_0= ruleVALID_IMAGE_TAG ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getFromAccess().getColonKeyword_2_0());
                    			
                    // InternalDockerFile.g:575:4: ( (lv_tag_3_0= ruleVALID_IMAGE_TAG ) )
                    // InternalDockerFile.g:576:5: (lv_tag_3_0= ruleVALID_IMAGE_TAG )
                    {
                    // InternalDockerFile.g:576:5: (lv_tag_3_0= ruleVALID_IMAGE_TAG )
                    // InternalDockerFile.g:577:6: lv_tag_3_0= ruleVALID_IMAGE_TAG
                    {

                    						newCompositeNode(grammarAccess.getFromAccess().getTagVALID_IMAGE_TAGParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tag_3_0=ruleVALID_IMAGE_TAG();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFromRule());
                    						}
                    						set(
                    							current,
                    							"tag",
                    							lv_tag_3_0,
                    							"org.palladiosimulator.somox.docker.DockerFile.VALID_IMAGE_TAG");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleMaintainer"
    // InternalDockerFile.g:599:1: entryRuleMaintainer returns [EObject current=null] : iv_ruleMaintainer= ruleMaintainer EOF ;
    public final EObject entryRuleMaintainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaintainer = null;


        try {
            // InternalDockerFile.g:599:51: (iv_ruleMaintainer= ruleMaintainer EOF )
            // InternalDockerFile.g:600:2: iv_ruleMaintainer= ruleMaintainer EOF
            {
             newCompositeNode(grammarAccess.getMaintainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaintainer=ruleMaintainer();

            state._fsp--;

             current =iv_ruleMaintainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaintainer"


    // $ANTLR start "ruleMaintainer"
    // InternalDockerFile.g:606:1: ruleMaintainer returns [EObject current=null] : (otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ;
    public final EObject ruleMaintainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDockerFile.g:612:2: ( (otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            // InternalDockerFile.g:613:2: (otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            {
            // InternalDockerFile.g:613:2: (otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            // InternalDockerFile.g:614:3: otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMaintainerAccess().getMAINTAINERKeyword_0());
            		
            // InternalDockerFile.g:618:3: ( (lv_name_1_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:619:4: (lv_name_1_0= RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:619:4: (lv_name_1_0= RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:620:5: lv_name_1_0= RULE_ONE_SPACE_AND_WHATEVER
            {
            lv_name_1_0=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMaintainerAccess().getNameONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaintainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaintainer"


    // $ANTLR start "entryRuleEnv"
    // InternalDockerFile.g:640:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalDockerFile.g:640:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalDockerFile.g:641:2: iv_ruleEnv= ruleEnv EOF
            {
             newCompositeNode(grammarAccess.getEnvRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnv=ruleEnv();

            state._fsp--;

             current =iv_ruleEnv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnv"


    // $ANTLR start "ruleEnv"
    // InternalDockerFile.g:647:1: ruleEnv returns [EObject current=null] : (otherlv_0= 'ENV' (this_EnvWithSpace_1= ruleEnvWithSpace | this_EnvWithEqual_2= ruleEnvWithEqual ) ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_EnvWithSpace_1 = null;

        EObject this_EnvWithEqual_2 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:653:2: ( (otherlv_0= 'ENV' (this_EnvWithSpace_1= ruleEnvWithSpace | this_EnvWithEqual_2= ruleEnvWithEqual ) ) )
            // InternalDockerFile.g:654:2: (otherlv_0= 'ENV' (this_EnvWithSpace_1= ruleEnvWithSpace | this_EnvWithEqual_2= ruleEnvWithEqual ) )
            {
            // InternalDockerFile.g:654:2: (otherlv_0= 'ENV' (this_EnvWithSpace_1= ruleEnvWithSpace | this_EnvWithEqual_2= ruleEnvWithEqual ) )
            // InternalDockerFile.g:655:3: otherlv_0= 'ENV' (this_EnvWithSpace_1= ruleEnvWithSpace | this_EnvWithEqual_2= ruleEnvWithEqual )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvAccess().getENVKeyword_0());
            		
            // InternalDockerFile.g:659:3: (this_EnvWithSpace_1= ruleEnvWithSpace | this_EnvWithEqual_2= ruleEnvWithEqual )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ENV_VALUE_WITH_EQUAL) ) {
                    alt8=2;
                }
                else if ( (LA8_1==RULE_ONE_SPACE_AND_WHATEVER) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDockerFile.g:660:4: this_EnvWithSpace_1= ruleEnvWithSpace
                    {

                    				newCompositeNode(grammarAccess.getEnvAccess().getEnvWithSpaceParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_EnvWithSpace_1=ruleEnvWithSpace();

                    state._fsp--;


                    				current = this_EnvWithSpace_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:669:4: this_EnvWithEqual_2= ruleEnvWithEqual
                    {

                    				newCompositeNode(grammarAccess.getEnvAccess().getEnvWithEqualParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_EnvWithEqual_2=ruleEnvWithEqual();

                    state._fsp--;


                    				current = this_EnvWithEqual_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnv"


    // $ANTLR start "entryRuleExpose"
    // InternalDockerFile.g:682:1: entryRuleExpose returns [EObject current=null] : iv_ruleExpose= ruleExpose EOF ;
    public final EObject entryRuleExpose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpose = null;


        try {
            // InternalDockerFile.g:682:47: (iv_ruleExpose= ruleExpose EOF )
            // InternalDockerFile.g:683:2: iv_ruleExpose= ruleExpose EOF
            {
             newCompositeNode(grammarAccess.getExposeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpose=ruleExpose();

            state._fsp--;

             current =iv_ruleExpose; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpose"


    // $ANTLR start "ruleExpose"
    // InternalDockerFile.g:689:1: ruleExpose returns [EObject current=null] : (otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ;
    public final EObject ruleExpose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ports_1_0=null;


        	enterRule();

        try {
            // InternalDockerFile.g:695:2: ( (otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            // InternalDockerFile.g:696:2: (otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            {
            // InternalDockerFile.g:696:2: (otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            // InternalDockerFile.g:697:3: otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExposeAccess().getEXPOSEKeyword_0());
            		
            // InternalDockerFile.g:701:3: ( (lv_ports_1_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:702:4: (lv_ports_1_0= RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:702:4: (lv_ports_1_0= RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:703:5: lv_ports_1_0= RULE_ONE_SPACE_AND_WHATEVER
            {
            lv_ports_1_0=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

            					newLeafNode(lv_ports_1_0, grammarAccess.getExposeAccess().getPortsONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExposeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ports",
            						lv_ports_1_0,
            						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpose"


    // $ANTLR start "entryRuleJSON_ARRAY"
    // InternalDockerFile.g:723:1: entryRuleJSON_ARRAY returns [EObject current=null] : iv_ruleJSON_ARRAY= ruleJSON_ARRAY EOF ;
    public final EObject entryRuleJSON_ARRAY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON_ARRAY = null;


        try {
            // InternalDockerFile.g:723:51: (iv_ruleJSON_ARRAY= ruleJSON_ARRAY EOF )
            // InternalDockerFile.g:724:2: iv_ruleJSON_ARRAY= ruleJSON_ARRAY EOF
            {
             newCompositeNode(grammarAccess.getJSON_ARRAYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON_ARRAY=ruleJSON_ARRAY();

            state._fsp--;

             current =iv_ruleJSON_ARRAY; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSON_ARRAY"


    // $ANTLR start "ruleJSON_ARRAY"
    // InternalDockerFile.g:730:1: ruleJSON_ARRAY returns [EObject current=null] : (otherlv_0= '[' ( (lv_head_1_0= RULE_STRING ) ) ( (lv_tail_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']' ) ;
    public final EObject ruleJSON_ARRAY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_head_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tail_2_0 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:736:2: ( (otherlv_0= '[' ( (lv_head_1_0= RULE_STRING ) ) ( (lv_tail_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']' ) )
            // InternalDockerFile.g:737:2: (otherlv_0= '[' ( (lv_head_1_0= RULE_STRING ) ) ( (lv_tail_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']' )
            {
            // InternalDockerFile.g:737:2: (otherlv_0= '[' ( (lv_head_1_0= RULE_STRING ) ) ( (lv_tail_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']' )
            // InternalDockerFile.g:738:3: otherlv_0= '[' ( (lv_head_1_0= RULE_STRING ) ) ( (lv_tail_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJSON_ARRAYAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDockerFile.g:742:3: ( (lv_head_1_0= RULE_STRING ) )
            // InternalDockerFile.g:743:4: (lv_head_1_0= RULE_STRING )
            {
            // InternalDockerFile.g:743:4: (lv_head_1_0= RULE_STRING )
            // InternalDockerFile.g:744:5: lv_head_1_0= RULE_STRING
            {
            lv_head_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_head_1_0, grammarAccess.getJSON_ARRAYAccess().getHeadSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJSON_ARRAYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"head",
            						lv_head_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDockerFile.g:760:3: ( (lv_tail_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDockerFile.g:761:4: (lv_tail_2_0= ruleSTRING_PREFIXED_WITH_COMMA )
            	    {
            	    // InternalDockerFile.g:761:4: (lv_tail_2_0= ruleSTRING_PREFIXED_WITH_COMMA )
            	    // InternalDockerFile.g:762:5: lv_tail_2_0= ruleSTRING_PREFIXED_WITH_COMMA
            	    {

            	    					newCompositeNode(grammarAccess.getJSON_ARRAYAccess().getTailSTRING_PREFIXED_WITH_COMMAParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_tail_2_0=ruleSTRING_PREFIXED_WITH_COMMA();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJSON_ARRAYRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tail",
            	    						lv_tail_2_0,
            	    						"org.palladiosimulator.somox.docker.DockerFile.STRING_PREFIXED_WITH_COMMA");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getJSON_ARRAYAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSON_ARRAY"


    // $ANTLR start "entryRuleEnvWithSpace"
    // InternalDockerFile.g:787:1: entryRuleEnvWithSpace returns [EObject current=null] : iv_ruleEnvWithSpace= ruleEnvWithSpace EOF ;
    public final EObject entryRuleEnvWithSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvWithSpace = null;


        try {
            // InternalDockerFile.g:787:53: (iv_ruleEnvWithSpace= ruleEnvWithSpace EOF )
            // InternalDockerFile.g:788:2: iv_ruleEnvWithSpace= ruleEnvWithSpace EOF
            {
             newCompositeNode(grammarAccess.getEnvWithSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvWithSpace=ruleEnvWithSpace();

            state._fsp--;

             current =iv_ruleEnvWithSpace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvWithSpace"


    // $ANTLR start "ruleEnvWithSpace"
    // InternalDockerFile.g:794:1: ruleEnvWithSpace returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ;
    public final EObject ruleEnvWithSpace() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDockerFile.g:800:2: ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            // InternalDockerFile.g:801:2: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            {
            // InternalDockerFile.g:801:2: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            // InternalDockerFile.g:802:3: ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            {
            // InternalDockerFile.g:802:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalDockerFile.g:803:4: (lv_key_0_0= RULE_ID )
            {
            // InternalDockerFile.g:803:4: (lv_key_0_0= RULE_ID )
            // InternalDockerFile.g:804:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getEnvWithSpaceAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvWithSpaceRule());
            					}
            					addWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDockerFile.g:820:3: ( (lv_value_1_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:821:4: (lv_value_1_0= RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:821:4: (lv_value_1_0= RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:822:5: lv_value_1_0= RULE_ONE_SPACE_AND_WHATEVER
            {
            lv_value_1_0=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getEnvWithSpaceAccess().getValueONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvWithSpaceRule());
            					}
            					addWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvWithSpace"


    // $ANTLR start "entryRuleEnvWithEqual"
    // InternalDockerFile.g:842:1: entryRuleEnvWithEqual returns [EObject current=null] : iv_ruleEnvWithEqual= ruleEnvWithEqual EOF ;
    public final EObject entryRuleEnvWithEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvWithEqual = null;


        try {
            // InternalDockerFile.g:842:53: (iv_ruleEnvWithEqual= ruleEnvWithEqual EOF )
            // InternalDockerFile.g:843:2: iv_ruleEnvWithEqual= ruleEnvWithEqual EOF
            {
             newCompositeNode(grammarAccess.getEnvWithEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvWithEqual=ruleEnvWithEqual();

            state._fsp--;

             current =iv_ruleEnvWithEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvWithEqual"


    // $ANTLR start "ruleEnvWithEqual"
    // InternalDockerFile.g:849:1: ruleEnvWithEqual returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ENV_VALUE_WITH_EQUAL ) ) )+ ;
    public final EObject ruleEnvWithEqual() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDockerFile.g:855:2: ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ENV_VALUE_WITH_EQUAL ) ) )+ )
            // InternalDockerFile.g:856:2: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ENV_VALUE_WITH_EQUAL ) ) )+
            {
            // InternalDockerFile.g:856:2: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ENV_VALUE_WITH_EQUAL ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDockerFile.g:857:3: ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ENV_VALUE_WITH_EQUAL ) )
            	    {
            	    // InternalDockerFile.g:857:3: ( (lv_key_0_0= RULE_ID ) )
            	    // InternalDockerFile.g:858:4: (lv_key_0_0= RULE_ID )
            	    {
            	    // InternalDockerFile.g:858:4: (lv_key_0_0= RULE_ID )
            	    // InternalDockerFile.g:859:5: lv_key_0_0= RULE_ID
            	    {
            	    lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    					newLeafNode(lv_key_0_0, grammarAccess.getEnvWithEqualAccess().getKeyIDTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEnvWithEqualRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"key",
            	    						lv_key_0_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }

            	    // InternalDockerFile.g:875:3: ( (lv_value_1_0= RULE_ENV_VALUE_WITH_EQUAL ) )
            	    // InternalDockerFile.g:876:4: (lv_value_1_0= RULE_ENV_VALUE_WITH_EQUAL )
            	    {
            	    // InternalDockerFile.g:876:4: (lv_value_1_0= RULE_ENV_VALUE_WITH_EQUAL )
            	    // InternalDockerFile.g:877:5: lv_value_1_0= RULE_ENV_VALUE_WITH_EQUAL
            	    {
            	    lv_value_1_0=(Token)match(input,RULE_ENV_VALUE_WITH_EQUAL,FOLLOW_14); 

            	    					newLeafNode(lv_value_1_0, grammarAccess.getEnvWithEqualAccess().getValueENV_VALUE_WITH_EQUALTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEnvWithEqualRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"value",
            	    						lv_value_1_0,
            	    						"org.palladiosimulator.somox.docker.DockerFile.ENV_VALUE_WITH_EQUAL");
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvWithEqual"


    // $ANTLR start "entryRuleWorkdir"
    // InternalDockerFile.g:897:1: entryRuleWorkdir returns [EObject current=null] : iv_ruleWorkdir= ruleWorkdir EOF ;
    public final EObject entryRuleWorkdir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkdir = null;


        try {
            // InternalDockerFile.g:897:48: (iv_ruleWorkdir= ruleWorkdir EOF )
            // InternalDockerFile.g:898:2: iv_ruleWorkdir= ruleWorkdir EOF
            {
             newCompositeNode(grammarAccess.getWorkdirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkdir=ruleWorkdir();

            state._fsp--;

             current =iv_ruleWorkdir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkdir"


    // $ANTLR start "ruleWorkdir"
    // InternalDockerFile.g:904:1: ruleWorkdir returns [EObject current=null] : (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ;
    public final EObject ruleWorkdir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalDockerFile.g:910:2: ( (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            // InternalDockerFile.g:911:2: (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            {
            // InternalDockerFile.g:911:2: (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            // InternalDockerFile.g:912:3: otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkdirAccess().getWORKDIRKeyword_0());
            		
            // InternalDockerFile.g:916:3: ( (lv_path_1_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:917:4: (lv_path_1_0= RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:917:4: (lv_path_1_0= RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:918:5: lv_path_1_0= RULE_ONE_SPACE_AND_WHATEVER
            {
            lv_path_1_0=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

            					newLeafNode(lv_path_1_0, grammarAccess.getWorkdirAccess().getPathONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkdirRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkdir"


    // $ANTLR start "entryRuleAdd"
    // InternalDockerFile.g:938:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalDockerFile.g:938:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalDockerFile.g:939:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalDockerFile.g:945:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'ADD' ( (lv_source_left_1_0= ruleAddSource ) ) ( (lv_dest_2_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dest_2_0=null;
        AntlrDatatypeRuleToken lv_source_left_1_0 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:951:2: ( (otherlv_0= 'ADD' ( (lv_source_left_1_0= ruleAddSource ) ) ( (lv_dest_2_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ) )
            // InternalDockerFile.g:952:2: (otherlv_0= 'ADD' ( (lv_source_left_1_0= ruleAddSource ) ) ( (lv_dest_2_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            {
            // InternalDockerFile.g:952:2: (otherlv_0= 'ADD' ( (lv_source_left_1_0= ruleAddSource ) ) ( (lv_dest_2_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            // InternalDockerFile.g:953:3: otherlv_0= 'ADD' ( (lv_source_left_1_0= ruleAddSource ) ) ( (lv_dest_2_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getADDKeyword_0());
            		
            // InternalDockerFile.g:957:3: ( (lv_source_left_1_0= ruleAddSource ) )
            // InternalDockerFile.g:958:4: (lv_source_left_1_0= ruleAddSource )
            {
            // InternalDockerFile.g:958:4: (lv_source_left_1_0= ruleAddSource )
            // InternalDockerFile.g:959:5: lv_source_left_1_0= ruleAddSource
            {

            					newCompositeNode(grammarAccess.getAddAccess().getSource_leftAddSourceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_source_left_1_0=ruleAddSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"source_left",
            						lv_source_left_1_0,
            						"org.palladiosimulator.somox.docker.DockerFile.AddSource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDockerFile.g:976:3: ( (lv_dest_2_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:977:4: (lv_dest_2_0= RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:977:4: (lv_dest_2_0= RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:978:5: lv_dest_2_0= RULE_ONE_SPACE_AND_WHATEVER
            {
            lv_dest_2_0=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

            					newLeafNode(lv_dest_2_0, grammarAccess.getAddAccess().getDestONE_SPACE_AND_WHATEVERTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dest",
            						lv_dest_2_0,
            						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleAddSource"
    // InternalDockerFile.g:998:1: entryRuleAddSource returns [String current=null] : iv_ruleAddSource= ruleAddSource EOF ;
    public final String entryRuleAddSource() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddSource = null;


        try {
            // InternalDockerFile.g:998:49: (iv_ruleAddSource= ruleAddSource EOF )
            // InternalDockerFile.g:999:2: iv_ruleAddSource= ruleAddSource EOF
            {
             newCompositeNode(grammarAccess.getAddSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddSource=ruleAddSource();

            state._fsp--;

             current =iv_ruleAddSource.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddSource"


    // $ANTLR start "ruleAddSource"
    // InternalDockerFile.g:1005:1: ruleAddSource returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VALID_RELATIVE_PATH_0= ruleVALID_RELATIVE_PATH | this_VALID_URL_1= ruleVALID_URL | kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleAddSource() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_VALID_RELATIVE_PATH_0 = null;

        AntlrDatatypeRuleToken this_VALID_URL_1 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:1011:2: ( (this_VALID_RELATIVE_PATH_0= ruleVALID_RELATIVE_PATH | this_VALID_URL_1= ruleVALID_URL | kw= '.' ) )
            // InternalDockerFile.g:1012:2: (this_VALID_RELATIVE_PATH_0= ruleVALID_RELATIVE_PATH | this_VALID_URL_1= ruleVALID_URL | kw= '.' )
            {
            // InternalDockerFile.g:1012:2: (this_VALID_RELATIVE_PATH_0= ruleVALID_RELATIVE_PATH | this_VALID_URL_1= ruleVALID_URL | kw= '.' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDockerFile.g:1013:3: this_VALID_RELATIVE_PATH_0= ruleVALID_RELATIVE_PATH
                    {

                    			newCompositeNode(grammarAccess.getAddSourceAccess().getVALID_RELATIVE_PATHParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VALID_RELATIVE_PATH_0=ruleVALID_RELATIVE_PATH();

                    state._fsp--;


                    			current.merge(this_VALID_RELATIVE_PATH_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:1024:3: this_VALID_URL_1= ruleVALID_URL
                    {

                    			newCompositeNode(grammarAccess.getAddSourceAccess().getVALID_URLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VALID_URL_1=ruleVALID_URL();

                    state._fsp--;


                    			current.merge(this_VALID_URL_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDockerFile.g:1035:3: kw= '.'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAddSourceAccess().getFullStopKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddSource"


    // $ANTLR start "entryRuleRun"
    // InternalDockerFile.g:1044:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalDockerFile.g:1044:44: (iv_ruleRun= ruleRun EOF )
            // InternalDockerFile.g:1045:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalDockerFile.g:1051:1: ruleRun returns [EObject current=null] : ( (otherlv_0= 'RUN' this_RunWithShell_1= ruleRunWithShell ) | this_RunWithNoShell_2= ruleRunWithNoShell ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_RunWithShell_1 = null;

        EObject this_RunWithNoShell_2 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:1057:2: ( ( (otherlv_0= 'RUN' this_RunWithShell_1= ruleRunWithShell ) | this_RunWithNoShell_2= ruleRunWithNoShell ) )
            // InternalDockerFile.g:1058:2: ( (otherlv_0= 'RUN' this_RunWithShell_1= ruleRunWithShell ) | this_RunWithNoShell_2= ruleRunWithNoShell )
            {
            // InternalDockerFile.g:1058:2: ( (otherlv_0= 'RUN' this_RunWithShell_1= ruleRunWithShell ) | this_RunWithNoShell_2= ruleRunWithNoShell )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDockerFile.g:1059:3: (otherlv_0= 'RUN' this_RunWithShell_1= ruleRunWithShell )
                    {
                    // InternalDockerFile.g:1059:3: (otherlv_0= 'RUN' this_RunWithShell_1= ruleRunWithShell )
                    // InternalDockerFile.g:1060:4: otherlv_0= 'RUN' this_RunWithShell_1= ruleRunWithShell
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRUNKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getRunAccess().getRunWithShellParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_RunWithShell_1=ruleRunWithShell();

                    state._fsp--;


                    				current = this_RunWithShell_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:1074:3: this_RunWithNoShell_2= ruleRunWithNoShell
                    {

                    			newCompositeNode(grammarAccess.getRunAccess().getRunWithNoShellParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RunWithNoShell_2=ruleRunWithNoShell();

                    state._fsp--;


                    			current = this_RunWithNoShell_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleRunWithShell"
    // InternalDockerFile.g:1086:1: entryRuleRunWithShell returns [EObject current=null] : iv_ruleRunWithShell= ruleRunWithShell EOF ;
    public final EObject entryRuleRunWithShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunWithShell = null;


        try {
            // InternalDockerFile.g:1086:53: (iv_ruleRunWithShell= ruleRunWithShell EOF )
            // InternalDockerFile.g:1087:2: iv_ruleRunWithShell= ruleRunWithShell EOF
            {
             newCompositeNode(grammarAccess.getRunWithShellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunWithShell=ruleRunWithShell();

            state._fsp--;

             current =iv_ruleRunWithShell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRunWithShell"


    // $ANTLR start "ruleRunWithShell"
    // InternalDockerFile.g:1093:1: ruleRunWithShell returns [EObject current=null] : ( (lv_command_0_0= RULE_ONE_SPACE_AND_WHATEVER ) ) ;
    public final EObject ruleRunWithShell() throws RecognitionException {
        EObject current = null;

        Token lv_command_0_0=null;


        	enterRule();

        try {
            // InternalDockerFile.g:1099:2: ( ( (lv_command_0_0= RULE_ONE_SPACE_AND_WHATEVER ) ) )
            // InternalDockerFile.g:1100:2: ( (lv_command_0_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            {
            // InternalDockerFile.g:1100:2: ( (lv_command_0_0= RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:1101:3: (lv_command_0_0= RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:1101:3: (lv_command_0_0= RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:1102:4: lv_command_0_0= RULE_ONE_SPACE_AND_WHATEVER
            {
            lv_command_0_0=(Token)match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 

            				newLeafNode(lv_command_0_0, grammarAccess.getRunWithShellAccess().getCommandONE_SPACE_AND_WHATEVERTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRunWithShellRule());
            				}
            				setWithLastConsumed(
            					current,
            					"command",
            					lv_command_0_0,
            					"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRunWithShell"


    // $ANTLR start "entryRuleRunWithNoShell"
    // InternalDockerFile.g:1121:1: entryRuleRunWithNoShell returns [EObject current=null] : iv_ruleRunWithNoShell= ruleRunWithNoShell EOF ;
    public final EObject entryRuleRunWithNoShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunWithNoShell = null;


        try {
            // InternalDockerFile.g:1121:55: (iv_ruleRunWithNoShell= ruleRunWithNoShell EOF )
            // InternalDockerFile.g:1122:2: iv_ruleRunWithNoShell= ruleRunWithNoShell EOF
            {
             newCompositeNode(grammarAccess.getRunWithNoShellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunWithNoShell=ruleRunWithNoShell();

            state._fsp--;

             current =iv_ruleRunWithNoShell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRunWithNoShell"


    // $ANTLR start "ruleRunWithNoShell"
    // InternalDockerFile.g:1128:1: ruleRunWithNoShell returns [EObject current=null] : (otherlv_0= '[' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_params_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']' ) ;
    public final EObject ruleRunWithNoShell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_executable_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalDockerFile.g:1134:2: ( (otherlv_0= '[' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_params_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']' ) )
            // InternalDockerFile.g:1135:2: (otherlv_0= '[' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_params_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']' )
            {
            // InternalDockerFile.g:1135:2: (otherlv_0= '[' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_params_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']' )
            // InternalDockerFile.g:1136:3: otherlv_0= '[' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_params_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )* otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRunWithNoShellAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalDockerFile.g:1140:3: ( (lv_executable_1_0= RULE_STRING ) )
            // InternalDockerFile.g:1141:4: (lv_executable_1_0= RULE_STRING )
            {
            // InternalDockerFile.g:1141:4: (lv_executable_1_0= RULE_STRING )
            // InternalDockerFile.g:1142:5: lv_executable_1_0= RULE_STRING
            {
            lv_executable_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_executable_1_0, grammarAccess.getRunWithNoShellAccess().getExecutableSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunWithNoShellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"executable",
            						lv_executable_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDockerFile.g:1158:3: ( (lv_params_2_0= ruleSTRING_PREFIXED_WITH_COMMA ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDockerFile.g:1159:4: (lv_params_2_0= ruleSTRING_PREFIXED_WITH_COMMA )
            	    {
            	    // InternalDockerFile.g:1159:4: (lv_params_2_0= ruleSTRING_PREFIXED_WITH_COMMA )
            	    // InternalDockerFile.g:1160:5: lv_params_2_0= ruleSTRING_PREFIXED_WITH_COMMA
            	    {

            	    					newCompositeNode(grammarAccess.getRunWithNoShellAccess().getParamsSTRING_PREFIXED_WITH_COMMAParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_params_2_0=ruleSTRING_PREFIXED_WITH_COMMA();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRunWithNoShellRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_2_0,
            	    						"org.palladiosimulator.somox.docker.DockerFile.STRING_PREFIXED_WITH_COMMA");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRunWithNoShellAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRunWithNoShell"


    // $ANTLR start "entryRuleSTRING_PREFIXED_WITH_COMMA"
    // InternalDockerFile.g:1185:1: entryRuleSTRING_PREFIXED_WITH_COMMA returns [String current=null] : iv_ruleSTRING_PREFIXED_WITH_COMMA= ruleSTRING_PREFIXED_WITH_COMMA EOF ;
    public final String entryRuleSTRING_PREFIXED_WITH_COMMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTRING_PREFIXED_WITH_COMMA = null;


        try {
            // InternalDockerFile.g:1185:66: (iv_ruleSTRING_PREFIXED_WITH_COMMA= ruleSTRING_PREFIXED_WITH_COMMA EOF )
            // InternalDockerFile.g:1186:2: iv_ruleSTRING_PREFIXED_WITH_COMMA= ruleSTRING_PREFIXED_WITH_COMMA EOF
            {
             newCompositeNode(grammarAccess.getSTRING_PREFIXED_WITH_COMMARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTRING_PREFIXED_WITH_COMMA=ruleSTRING_PREFIXED_WITH_COMMA();

            state._fsp--;

             current =iv_ruleSTRING_PREFIXED_WITH_COMMA.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTRING_PREFIXED_WITH_COMMA"


    // $ANTLR start "ruleSTRING_PREFIXED_WITH_COMMA"
    // InternalDockerFile.g:1192:1: ruleSTRING_PREFIXED_WITH_COMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleSTRING_PREFIXED_WITH_COMMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalDockerFile.g:1198:2: ( (kw= ',' this_STRING_1= RULE_STRING ) )
            // InternalDockerFile.g:1199:2: (kw= ',' this_STRING_1= RULE_STRING )
            {
            // InternalDockerFile.g:1199:2: (kw= ',' this_STRING_1= RULE_STRING )
            // InternalDockerFile.g:1200:3: kw= ',' this_STRING_1= RULE_STRING
            {
            kw=(Token)match(input,30,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getCommaKeyword_0());
            		
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_1);
            		

            			newLeafNode(this_STRING_1, grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getSTRINGTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTRING_PREFIXED_WITH_COMMA"


    // $ANTLR start "entryRuleVALID_RELATIVE_PATH"
    // InternalDockerFile.g:1216:1: entryRuleVALID_RELATIVE_PATH returns [String current=null] : iv_ruleVALID_RELATIVE_PATH= ruleVALID_RELATIVE_PATH EOF ;
    public final String entryRuleVALID_RELATIVE_PATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_RELATIVE_PATH = null;


        try {
            // InternalDockerFile.g:1216:59: (iv_ruleVALID_RELATIVE_PATH= ruleVALID_RELATIVE_PATH EOF )
            // InternalDockerFile.g:1217:2: iv_ruleVALID_RELATIVE_PATH= ruleVALID_RELATIVE_PATH EOF
            {
             newCompositeNode(grammarAccess.getVALID_RELATIVE_PATHRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALID_RELATIVE_PATH=ruleVALID_RELATIVE_PATH();

            state._fsp--;

             current =iv_ruleVALID_RELATIVE_PATH.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVALID_RELATIVE_PATH"


    // $ANTLR start "ruleVALID_RELATIVE_PATH"
    // InternalDockerFile.g:1223:1: ruleVALID_RELATIVE_PATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) (kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleVALID_RELATIVE_PATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDockerFile.g:1229:2: ( ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) (kw= '*' )? ) )
            // InternalDockerFile.g:1230:2: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) (kw= '*' )? )
            {
            // InternalDockerFile.g:1230:2: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) (kw= '*' )? )
            // InternalDockerFile.g:1231:3: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) (kw= '*' )?
            {
            // InternalDockerFile.g:1231:3: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // InternalDockerFile.g:1232:4: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            				current.merge(this_ID_0);
            			

            				newLeafNode(this_ID_0, grammarAccess.getVALID_RELATIVE_PATHAccess().getIDTerminalRuleCall_0_0());
            			
            // InternalDockerFile.g:1239:4: (kw= '/' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDockerFile.g:1240:5: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_7); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getVALID_RELATIVE_PATHAccess().getSolidusKeyword_0_1_0());
            	    				
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    					current.merge(this_ID_2);
            	    				

            	    					newLeafNode(this_ID_2, grammarAccess.getVALID_RELATIVE_PATHAccess().getIDTerminalRuleCall_0_1_1());
            	    				

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            // InternalDockerFile.g:1254:3: (kw= '*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDockerFile.g:1255:4: kw= '*'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVALID_RELATIVE_PATHAccess().getAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVALID_RELATIVE_PATH"


    // $ANTLR start "entryRuleVALID_URL"
    // InternalDockerFile.g:1265:1: entryRuleVALID_URL returns [String current=null] : iv_ruleVALID_URL= ruleVALID_URL EOF ;
    public final String entryRuleVALID_URL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_URL = null;


        try {
            // InternalDockerFile.g:1265:49: (iv_ruleVALID_URL= ruleVALID_URL EOF )
            // InternalDockerFile.g:1266:2: iv_ruleVALID_URL= ruleVALID_URL EOF
            {
             newCompositeNode(grammarAccess.getVALID_URLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALID_URL=ruleVALID_URL();

            state._fsp--;

             current =iv_ruleVALID_URL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVALID_URL"


    // $ANTLR start "ruleVALID_URL"
    // InternalDockerFile.g:1272:1: ruleVALID_URL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'http://' this_ID_1= RULE_ID ( (kw= '/' | kw= '.' ) this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVALID_URL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalDockerFile.g:1278:2: ( (kw= 'http://' this_ID_1= RULE_ID ( (kw= '/' | kw= '.' ) this_ID_4= RULE_ID )* ) )
            // InternalDockerFile.g:1279:2: (kw= 'http://' this_ID_1= RULE_ID ( (kw= '/' | kw= '.' ) this_ID_4= RULE_ID )* )
            {
            // InternalDockerFile.g:1279:2: (kw= 'http://' this_ID_1= RULE_ID ( (kw= '/' | kw= '.' ) this_ID_4= RULE_ID )* )
            // InternalDockerFile.g:1280:3: kw= 'http://' this_ID_1= RULE_ID ( (kw= '/' | kw= '.' ) this_ID_4= RULE_ID )*
            {
            kw=(Token)match(input,33,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVALID_URLAccess().getHttpKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getVALID_URLAccess().getIDTerminalRuleCall_1());
            		
            // InternalDockerFile.g:1292:3: ( (kw= '/' | kw= '.' ) this_ID_4= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28||LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDockerFile.g:1293:4: (kw= '/' | kw= '.' ) this_ID_4= RULE_ID
            	    {
            	    // InternalDockerFile.g:1293:4: (kw= '/' | kw= '.' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==31) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==28) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalDockerFile.g:1294:5: kw= '/'
            	            {
            	            kw=(Token)match(input,31,FOLLOW_7); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getVALID_URLAccess().getSolidusKeyword_2_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDockerFile.g:1300:5: kw= '.'
            	            {
            	            kw=(Token)match(input,28,FOLLOW_7); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getVALID_URLAccess().getFullStopKeyword_2_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getVALID_URLAccess().getIDTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVALID_URL"


    // $ANTLR start "entryRuleVALID_IMAGE_NAME"
    // InternalDockerFile.g:1318:1: entryRuleVALID_IMAGE_NAME returns [String current=null] : iv_ruleVALID_IMAGE_NAME= ruleVALID_IMAGE_NAME EOF ;
    public final String entryRuleVALID_IMAGE_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_IMAGE_NAME = null;


        try {
            // InternalDockerFile.g:1318:56: (iv_ruleVALID_IMAGE_NAME= ruleVALID_IMAGE_NAME EOF )
            // InternalDockerFile.g:1319:2: iv_ruleVALID_IMAGE_NAME= ruleVALID_IMAGE_NAME EOF
            {
             newCompositeNode(grammarAccess.getVALID_IMAGE_NAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALID_IMAGE_NAME=ruleVALID_IMAGE_NAME();

            state._fsp--;

             current =iv_ruleVALID_IMAGE_NAME.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVALID_IMAGE_NAME"


    // $ANTLR start "ruleVALID_IMAGE_NAME"
    // InternalDockerFile.g:1325:1: ruleVALID_IMAGE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVALID_IMAGE_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDockerFile.g:1331:2: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // InternalDockerFile.g:1332:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // InternalDockerFile.g:1332:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // InternalDockerFile.g:1333:3: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getVALID_IMAGE_NAMEAccess().getIDTerminalRuleCall_0());
            		
            // InternalDockerFile.g:1340:3: (kw= '/' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDockerFile.g:1341:4: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getVALID_IMAGE_NAMEAccess().getSolidusKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getVALID_IMAGE_NAMEAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVALID_IMAGE_NAME"


    // $ANTLR start "entryRuleVALID_IMAGE_TAG"
    // InternalDockerFile.g:1358:1: entryRuleVALID_IMAGE_TAG returns [String current=null] : iv_ruleVALID_IMAGE_TAG= ruleVALID_IMAGE_TAG EOF ;
    public final String entryRuleVALID_IMAGE_TAG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_IMAGE_TAG = null;


        try {
            // InternalDockerFile.g:1358:55: (iv_ruleVALID_IMAGE_TAG= ruleVALID_IMAGE_TAG EOF )
            // InternalDockerFile.g:1359:2: iv_ruleVALID_IMAGE_TAG= ruleVALID_IMAGE_TAG EOF
            {
             newCompositeNode(grammarAccess.getVALID_IMAGE_TAGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALID_IMAGE_TAG=ruleVALID_IMAGE_TAG();

            state._fsp--;

             current =iv_ruleVALID_IMAGE_TAG.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVALID_IMAGE_TAG"


    // $ANTLR start "ruleVALID_IMAGE_TAG"
    // InternalDockerFile.g:1365:1: ruleVALID_IMAGE_TAG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) (this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_STRING_5= RULE_STRING | kw= '-' | kw= '.' )* ) ;
    public final AntlrDatatypeRuleToken ruleVALID_IMAGE_TAG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_ID_3=null;
        Token this_INT_4=null;
        Token this_STRING_5=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDockerFile.g:1371:2: ( ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) (this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_STRING_5= RULE_STRING | kw= '-' | kw= '.' )* ) )
            // InternalDockerFile.g:1372:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) (this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_STRING_5= RULE_STRING | kw= '-' | kw= '.' )* )
            {
            // InternalDockerFile.g:1372:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) (this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_STRING_5= RULE_STRING | kw= '-' | kw= '.' )* )
            // InternalDockerFile.g:1373:3: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) (this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_STRING_5= RULE_STRING | kw= '-' | kw= '.' )*
            {
            // InternalDockerFile.g:1373:3: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDockerFile.g:1374:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getVALID_IMAGE_TAGAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:1382:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_18); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getVALID_IMAGE_TAGAccess().getINTTerminalRuleCall_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDockerFile.g:1390:4: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    				current.merge(this_STRING_2);
                    			

                    				newLeafNode(this_STRING_2, grammarAccess.getVALID_IMAGE_TAGAccess().getSTRINGTerminalRuleCall_0_2());
                    			

                    }
                    break;

            }

            // InternalDockerFile.g:1398:3: (this_ID_3= RULE_ID | this_INT_4= RULE_INT | this_STRING_5= RULE_STRING | kw= '-' | kw= '.' )*
            loop20:
            do {
                int alt20=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt20=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt20=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt20=3;
                    }
                    break;
                case 34:
                    {
                    alt20=4;
                    }
                    break;
                case 28:
                    {
                    alt20=5;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalDockerFile.g:1399:4: this_ID_3= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    				current.merge(this_ID_3);
            	    			

            	    				newLeafNode(this_ID_3, grammarAccess.getVALID_IMAGE_TAGAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalDockerFile.g:1407:4: this_INT_4= RULE_INT
            	    {
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    				current.merge(this_INT_4);
            	    			

            	    				newLeafNode(this_INT_4, grammarAccess.getVALID_IMAGE_TAGAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalDockerFile.g:1415:4: this_STRING_5= RULE_STRING
            	    {
            	    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    				current.merge(this_STRING_5);
            	    			

            	    				newLeafNode(this_STRING_5, grammarAccess.getVALID_IMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalDockerFile.g:1423:4: kw= '-'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_18); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getVALID_IMAGE_TAGAccess().getHyphenMinusKeyword_1_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalDockerFile.g:1429:4: kw= '.'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_18); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getVALID_IMAGE_TAGAccess().getFullStopKeyword_1_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVALID_IMAGE_TAG"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000002DEFE002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000211000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000002DEFE000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000410000162L});

}