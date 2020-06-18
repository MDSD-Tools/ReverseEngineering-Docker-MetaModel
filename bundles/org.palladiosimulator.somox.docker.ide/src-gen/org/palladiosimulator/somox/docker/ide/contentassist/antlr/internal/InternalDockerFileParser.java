package org.palladiosimulator.somox.docker.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.palladiosimulator.somox.docker.services.DockerFileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerFileParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ONE_SPACE_AND_WHATEVER", "RULE_ENV_VALUE_WITH_EQUAL", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'/'", "'-'", "'CMD'", "'COPY'", "'ENTRYPOINT'", "'VOLUME'", "'USER'", "'ONBUILD'", "'FROM'", "':'", "'MAINTAINER'", "'ENV'", "'EXPOSE'", "'['", "']'", "'WORKDIR'", "'ADD'", "'RUN'", "','", "'*'", "'http://'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_ENV_VALUE_WITH_EQUAL=8;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ONE_SPACE_AND_WHATEVER=7;
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

    	public void setGrammarAccess(DockerFileGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDockerfile"
    // InternalDockerFile.g:53:1: entryRuleDockerfile : ruleDockerfile EOF ;
    public final void entryRuleDockerfile() throws RecognitionException {
        try {
            // InternalDockerFile.g:54:1: ( ruleDockerfile EOF )
            // InternalDockerFile.g:55:1: ruleDockerfile EOF
            {
             before(grammarAccess.getDockerfileRule()); 
            pushFollow(FOLLOW_1);
            ruleDockerfile();

            state._fsp--;

             after(grammarAccess.getDockerfileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDockerfile"


    // $ANTLR start "ruleDockerfile"
    // InternalDockerFile.g:62:1: ruleDockerfile : ( ( ( rule__Dockerfile__InstructionsAssignment ) ) ( ( rule__Dockerfile__InstructionsAssignment )* ) ) ;
    public final void ruleDockerfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:66:2: ( ( ( ( rule__Dockerfile__InstructionsAssignment ) ) ( ( rule__Dockerfile__InstructionsAssignment )* ) ) )
            // InternalDockerFile.g:67:2: ( ( ( rule__Dockerfile__InstructionsAssignment ) ) ( ( rule__Dockerfile__InstructionsAssignment )* ) )
            {
            // InternalDockerFile.g:67:2: ( ( ( rule__Dockerfile__InstructionsAssignment ) ) ( ( rule__Dockerfile__InstructionsAssignment )* ) )
            // InternalDockerFile.g:68:3: ( ( rule__Dockerfile__InstructionsAssignment ) ) ( ( rule__Dockerfile__InstructionsAssignment )* )
            {
            // InternalDockerFile.g:68:3: ( ( rule__Dockerfile__InstructionsAssignment ) )
            // InternalDockerFile.g:69:4: ( rule__Dockerfile__InstructionsAssignment )
            {
             before(grammarAccess.getDockerfileAccess().getInstructionsAssignment()); 
            // InternalDockerFile.g:70:4: ( rule__Dockerfile__InstructionsAssignment )
            // InternalDockerFile.g:70:5: rule__Dockerfile__InstructionsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Dockerfile__InstructionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDockerfileAccess().getInstructionsAssignment()); 

            }

            // InternalDockerFile.g:73:3: ( ( rule__Dockerfile__InstructionsAssignment )* )
            // InternalDockerFile.g:74:4: ( rule__Dockerfile__InstructionsAssignment )*
            {
             before(grammarAccess.getDockerfileAccess().getInstructionsAssignment()); 
            // InternalDockerFile.g:75:4: ( rule__Dockerfile__InstructionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=22)||(LA1_0>=24 && LA1_0<=27)||(LA1_0>=29 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDockerFile.g:75:5: rule__Dockerfile__InstructionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Dockerfile__InstructionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDockerfileAccess().getInstructionsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDockerfile"


    // $ANTLR start "entryRuleInstruction"
    // InternalDockerFile.g:85:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalDockerFile.g:86:1: ( ruleInstruction EOF )
            // InternalDockerFile.g:87:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalDockerFile.g:94:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:98:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalDockerFile.g:99:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalDockerFile.g:99:2: ( ( rule__Instruction__Alternatives ) )
            // InternalDockerFile.g:100:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalDockerFile.g:101:3: ( rule__Instruction__Alternatives )
            // InternalDockerFile.g:101:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCmd"
    // InternalDockerFile.g:110:1: entryRuleCmd : ruleCmd EOF ;
    public final void entryRuleCmd() throws RecognitionException {
        try {
            // InternalDockerFile.g:111:1: ( ruleCmd EOF )
            // InternalDockerFile.g:112:1: ruleCmd EOF
            {
             before(grammarAccess.getCmdRule()); 
            pushFollow(FOLLOW_1);
            ruleCmd();

            state._fsp--;

             after(grammarAccess.getCmdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCmd"


    // $ANTLR start "ruleCmd"
    // InternalDockerFile.g:119:1: ruleCmd : ( ( rule__Cmd__Group__0 ) ) ;
    public final void ruleCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:123:2: ( ( ( rule__Cmd__Group__0 ) ) )
            // InternalDockerFile.g:124:2: ( ( rule__Cmd__Group__0 ) )
            {
            // InternalDockerFile.g:124:2: ( ( rule__Cmd__Group__0 ) )
            // InternalDockerFile.g:125:3: ( rule__Cmd__Group__0 )
            {
             before(grammarAccess.getCmdAccess().getGroup()); 
            // InternalDockerFile.g:126:3: ( rule__Cmd__Group__0 )
            // InternalDockerFile.g:126:4: rule__Cmd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmd"


    // $ANTLR start "entryRuleCopy"
    // InternalDockerFile.g:135:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // InternalDockerFile.g:136:1: ( ruleCopy EOF )
            // InternalDockerFile.g:137:1: ruleCopy EOF
            {
             before(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            ruleCopy();

            state._fsp--;

             after(grammarAccess.getCopyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalDockerFile.g:144:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:148:2: ( ( ( rule__Copy__Group__0 ) ) )
            // InternalDockerFile.g:149:2: ( ( rule__Copy__Group__0 ) )
            {
            // InternalDockerFile.g:149:2: ( ( rule__Copy__Group__0 ) )
            // InternalDockerFile.g:150:3: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // InternalDockerFile.g:151:3: ( rule__Copy__Group__0 )
            // InternalDockerFile.g:151:4: rule__Copy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleEntrypoint"
    // InternalDockerFile.g:160:1: entryRuleEntrypoint : ruleEntrypoint EOF ;
    public final void entryRuleEntrypoint() throws RecognitionException {
        try {
            // InternalDockerFile.g:161:1: ( ruleEntrypoint EOF )
            // InternalDockerFile.g:162:1: ruleEntrypoint EOF
            {
             before(grammarAccess.getEntrypointRule()); 
            pushFollow(FOLLOW_1);
            ruleEntrypoint();

            state._fsp--;

             after(grammarAccess.getEntrypointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntrypoint"


    // $ANTLR start "ruleEntrypoint"
    // InternalDockerFile.g:169:1: ruleEntrypoint : ( ( rule__Entrypoint__Group__0 ) ) ;
    public final void ruleEntrypoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:173:2: ( ( ( rule__Entrypoint__Group__0 ) ) )
            // InternalDockerFile.g:174:2: ( ( rule__Entrypoint__Group__0 ) )
            {
            // InternalDockerFile.g:174:2: ( ( rule__Entrypoint__Group__0 ) )
            // InternalDockerFile.g:175:3: ( rule__Entrypoint__Group__0 )
            {
             before(grammarAccess.getEntrypointAccess().getGroup()); 
            // InternalDockerFile.g:176:3: ( rule__Entrypoint__Group__0 )
            // InternalDockerFile.g:176:4: rule__Entrypoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntrypointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntrypoint"


    // $ANTLR start "entryRuleVolume"
    // InternalDockerFile.g:185:1: entryRuleVolume : ruleVolume EOF ;
    public final void entryRuleVolume() throws RecognitionException {
        try {
            // InternalDockerFile.g:186:1: ( ruleVolume EOF )
            // InternalDockerFile.g:187:1: ruleVolume EOF
            {
             before(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getVolumeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalDockerFile.g:194:1: ruleVolume : ( ( rule__Volume__Group__0 ) ) ;
    public final void ruleVolume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:198:2: ( ( ( rule__Volume__Group__0 ) ) )
            // InternalDockerFile.g:199:2: ( ( rule__Volume__Group__0 ) )
            {
            // InternalDockerFile.g:199:2: ( ( rule__Volume__Group__0 ) )
            // InternalDockerFile.g:200:3: ( rule__Volume__Group__0 )
            {
             before(grammarAccess.getVolumeAccess().getGroup()); 
            // InternalDockerFile.g:201:3: ( rule__Volume__Group__0 )
            // InternalDockerFile.g:201:4: rule__Volume__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleUser"
    // InternalDockerFile.g:210:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalDockerFile.g:211:1: ( ruleUser EOF )
            // InternalDockerFile.g:212:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalDockerFile.g:219:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:223:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalDockerFile.g:224:2: ( ( rule__User__Group__0 ) )
            {
            // InternalDockerFile.g:224:2: ( ( rule__User__Group__0 ) )
            // InternalDockerFile.g:225:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalDockerFile.g:226:3: ( rule__User__Group__0 )
            // InternalDockerFile.g:226:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleOnbuild"
    // InternalDockerFile.g:235:1: entryRuleOnbuild : ruleOnbuild EOF ;
    public final void entryRuleOnbuild() throws RecognitionException {
        try {
            // InternalDockerFile.g:236:1: ( ruleOnbuild EOF )
            // InternalDockerFile.g:237:1: ruleOnbuild EOF
            {
             before(grammarAccess.getOnbuildRule()); 
            pushFollow(FOLLOW_1);
            ruleOnbuild();

            state._fsp--;

             after(grammarAccess.getOnbuildRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnbuild"


    // $ANTLR start "ruleOnbuild"
    // InternalDockerFile.g:244:1: ruleOnbuild : ( ( rule__Onbuild__Group__0 ) ) ;
    public final void ruleOnbuild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:248:2: ( ( ( rule__Onbuild__Group__0 ) ) )
            // InternalDockerFile.g:249:2: ( ( rule__Onbuild__Group__0 ) )
            {
            // InternalDockerFile.g:249:2: ( ( rule__Onbuild__Group__0 ) )
            // InternalDockerFile.g:250:3: ( rule__Onbuild__Group__0 )
            {
             before(grammarAccess.getOnbuildAccess().getGroup()); 
            // InternalDockerFile.g:251:3: ( rule__Onbuild__Group__0 )
            // InternalDockerFile.g:251:4: rule__Onbuild__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnbuildAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnbuild"


    // $ANTLR start "entryRuleFrom"
    // InternalDockerFile.g:260:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // InternalDockerFile.g:261:1: ( ruleFrom EOF )
            // InternalDockerFile.g:262:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_1);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getFromRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalDockerFile.g:269:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:273:2: ( ( ( rule__From__Group__0 ) ) )
            // InternalDockerFile.g:274:2: ( ( rule__From__Group__0 ) )
            {
            // InternalDockerFile.g:274:2: ( ( rule__From__Group__0 ) )
            // InternalDockerFile.g:275:3: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // InternalDockerFile.g:276:3: ( rule__From__Group__0 )
            // InternalDockerFile.g:276:4: rule__From__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleMaintainer"
    // InternalDockerFile.g:285:1: entryRuleMaintainer : ruleMaintainer EOF ;
    public final void entryRuleMaintainer() throws RecognitionException {
        try {
            // InternalDockerFile.g:286:1: ( ruleMaintainer EOF )
            // InternalDockerFile.g:287:1: ruleMaintainer EOF
            {
             before(grammarAccess.getMaintainerRule()); 
            pushFollow(FOLLOW_1);
            ruleMaintainer();

            state._fsp--;

             after(grammarAccess.getMaintainerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaintainer"


    // $ANTLR start "ruleMaintainer"
    // InternalDockerFile.g:294:1: ruleMaintainer : ( ( rule__Maintainer__Group__0 ) ) ;
    public final void ruleMaintainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:298:2: ( ( ( rule__Maintainer__Group__0 ) ) )
            // InternalDockerFile.g:299:2: ( ( rule__Maintainer__Group__0 ) )
            {
            // InternalDockerFile.g:299:2: ( ( rule__Maintainer__Group__0 ) )
            // InternalDockerFile.g:300:3: ( rule__Maintainer__Group__0 )
            {
             before(grammarAccess.getMaintainerAccess().getGroup()); 
            // InternalDockerFile.g:301:3: ( rule__Maintainer__Group__0 )
            // InternalDockerFile.g:301:4: rule__Maintainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaintainer"


    // $ANTLR start "entryRuleEnv"
    // InternalDockerFile.g:310:1: entryRuleEnv : ruleEnv EOF ;
    public final void entryRuleEnv() throws RecognitionException {
        try {
            // InternalDockerFile.g:311:1: ( ruleEnv EOF )
            // InternalDockerFile.g:312:1: ruleEnv EOF
            {
             before(grammarAccess.getEnvRule()); 
            pushFollow(FOLLOW_1);
            ruleEnv();

            state._fsp--;

             after(grammarAccess.getEnvRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnv"


    // $ANTLR start "ruleEnv"
    // InternalDockerFile.g:319:1: ruleEnv : ( ( rule__Env__Group__0 ) ) ;
    public final void ruleEnv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:323:2: ( ( ( rule__Env__Group__0 ) ) )
            // InternalDockerFile.g:324:2: ( ( rule__Env__Group__0 ) )
            {
            // InternalDockerFile.g:324:2: ( ( rule__Env__Group__0 ) )
            // InternalDockerFile.g:325:3: ( rule__Env__Group__0 )
            {
             before(grammarAccess.getEnvAccess().getGroup()); 
            // InternalDockerFile.g:326:3: ( rule__Env__Group__0 )
            // InternalDockerFile.g:326:4: rule__Env__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Env__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnv"


    // $ANTLR start "entryRuleExpose"
    // InternalDockerFile.g:335:1: entryRuleExpose : ruleExpose EOF ;
    public final void entryRuleExpose() throws RecognitionException {
        try {
            // InternalDockerFile.g:336:1: ( ruleExpose EOF )
            // InternalDockerFile.g:337:1: ruleExpose EOF
            {
             before(grammarAccess.getExposeRule()); 
            pushFollow(FOLLOW_1);
            ruleExpose();

            state._fsp--;

             after(grammarAccess.getExposeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpose"


    // $ANTLR start "ruleExpose"
    // InternalDockerFile.g:344:1: ruleExpose : ( ( rule__Expose__Group__0 ) ) ;
    public final void ruleExpose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:348:2: ( ( ( rule__Expose__Group__0 ) ) )
            // InternalDockerFile.g:349:2: ( ( rule__Expose__Group__0 ) )
            {
            // InternalDockerFile.g:349:2: ( ( rule__Expose__Group__0 ) )
            // InternalDockerFile.g:350:3: ( rule__Expose__Group__0 )
            {
             before(grammarAccess.getExposeAccess().getGroup()); 
            // InternalDockerFile.g:351:3: ( rule__Expose__Group__0 )
            // InternalDockerFile.g:351:4: rule__Expose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExposeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpose"


    // $ANTLR start "entryRuleJSON_ARRAY"
    // InternalDockerFile.g:360:1: entryRuleJSON_ARRAY : ruleJSON_ARRAY EOF ;
    public final void entryRuleJSON_ARRAY() throws RecognitionException {
        try {
            // InternalDockerFile.g:361:1: ( ruleJSON_ARRAY EOF )
            // InternalDockerFile.g:362:1: ruleJSON_ARRAY EOF
            {
             before(grammarAccess.getJSON_ARRAYRule()); 
            pushFollow(FOLLOW_1);
            ruleJSON_ARRAY();

            state._fsp--;

             after(grammarAccess.getJSON_ARRAYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSON_ARRAY"


    // $ANTLR start "ruleJSON_ARRAY"
    // InternalDockerFile.g:369:1: ruleJSON_ARRAY : ( ( rule__JSON_ARRAY__Group__0 ) ) ;
    public final void ruleJSON_ARRAY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:373:2: ( ( ( rule__JSON_ARRAY__Group__0 ) ) )
            // InternalDockerFile.g:374:2: ( ( rule__JSON_ARRAY__Group__0 ) )
            {
            // InternalDockerFile.g:374:2: ( ( rule__JSON_ARRAY__Group__0 ) )
            // InternalDockerFile.g:375:3: ( rule__JSON_ARRAY__Group__0 )
            {
             before(grammarAccess.getJSON_ARRAYAccess().getGroup()); 
            // InternalDockerFile.g:376:3: ( rule__JSON_ARRAY__Group__0 )
            // InternalDockerFile.g:376:4: rule__JSON_ARRAY__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSON_ARRAY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ARRAYAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSON_ARRAY"


    // $ANTLR start "entryRuleEnvWithSpace"
    // InternalDockerFile.g:385:1: entryRuleEnvWithSpace : ruleEnvWithSpace EOF ;
    public final void entryRuleEnvWithSpace() throws RecognitionException {
        try {
            // InternalDockerFile.g:386:1: ( ruleEnvWithSpace EOF )
            // InternalDockerFile.g:387:1: ruleEnvWithSpace EOF
            {
             before(grammarAccess.getEnvWithSpaceRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvWithSpace();

            state._fsp--;

             after(grammarAccess.getEnvWithSpaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnvWithSpace"


    // $ANTLR start "ruleEnvWithSpace"
    // InternalDockerFile.g:394:1: ruleEnvWithSpace : ( ( rule__EnvWithSpace__Group__0 ) ) ;
    public final void ruleEnvWithSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:398:2: ( ( ( rule__EnvWithSpace__Group__0 ) ) )
            // InternalDockerFile.g:399:2: ( ( rule__EnvWithSpace__Group__0 ) )
            {
            // InternalDockerFile.g:399:2: ( ( rule__EnvWithSpace__Group__0 ) )
            // InternalDockerFile.g:400:3: ( rule__EnvWithSpace__Group__0 )
            {
             before(grammarAccess.getEnvWithSpaceAccess().getGroup()); 
            // InternalDockerFile.g:401:3: ( rule__EnvWithSpace__Group__0 )
            // InternalDockerFile.g:401:4: rule__EnvWithSpace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvWithSpace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvWithSpaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvWithSpace"


    // $ANTLR start "entryRuleEnvWithEqual"
    // InternalDockerFile.g:410:1: entryRuleEnvWithEqual : ruleEnvWithEqual EOF ;
    public final void entryRuleEnvWithEqual() throws RecognitionException {
        try {
            // InternalDockerFile.g:411:1: ( ruleEnvWithEqual EOF )
            // InternalDockerFile.g:412:1: ruleEnvWithEqual EOF
            {
             before(grammarAccess.getEnvWithEqualRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvWithEqual();

            state._fsp--;

             after(grammarAccess.getEnvWithEqualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnvWithEqual"


    // $ANTLR start "ruleEnvWithEqual"
    // InternalDockerFile.g:419:1: ruleEnvWithEqual : ( ( ( rule__EnvWithEqual__Group__0 ) ) ( ( rule__EnvWithEqual__Group__0 )* ) ) ;
    public final void ruleEnvWithEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:423:2: ( ( ( ( rule__EnvWithEqual__Group__0 ) ) ( ( rule__EnvWithEqual__Group__0 )* ) ) )
            // InternalDockerFile.g:424:2: ( ( ( rule__EnvWithEqual__Group__0 ) ) ( ( rule__EnvWithEqual__Group__0 )* ) )
            {
            // InternalDockerFile.g:424:2: ( ( ( rule__EnvWithEqual__Group__0 ) ) ( ( rule__EnvWithEqual__Group__0 )* ) )
            // InternalDockerFile.g:425:3: ( ( rule__EnvWithEqual__Group__0 ) ) ( ( rule__EnvWithEqual__Group__0 )* )
            {
            // InternalDockerFile.g:425:3: ( ( rule__EnvWithEqual__Group__0 ) )
            // InternalDockerFile.g:426:4: ( rule__EnvWithEqual__Group__0 )
            {
             before(grammarAccess.getEnvWithEqualAccess().getGroup()); 
            // InternalDockerFile.g:427:4: ( rule__EnvWithEqual__Group__0 )
            // InternalDockerFile.g:427:5: rule__EnvWithEqual__Group__0
            {
            pushFollow(FOLLOW_4);
            rule__EnvWithEqual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvWithEqualAccess().getGroup()); 

            }

            // InternalDockerFile.g:430:3: ( ( rule__EnvWithEqual__Group__0 )* )
            // InternalDockerFile.g:431:4: ( rule__EnvWithEqual__Group__0 )*
            {
             before(grammarAccess.getEnvWithEqualAccess().getGroup()); 
            // InternalDockerFile.g:432:4: ( rule__EnvWithEqual__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDockerFile.g:432:5: rule__EnvWithEqual__Group__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EnvWithEqual__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEnvWithEqualAccess().getGroup()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvWithEqual"


    // $ANTLR start "entryRuleWorkdir"
    // InternalDockerFile.g:442:1: entryRuleWorkdir : ruleWorkdir EOF ;
    public final void entryRuleWorkdir() throws RecognitionException {
        try {
            // InternalDockerFile.g:443:1: ( ruleWorkdir EOF )
            // InternalDockerFile.g:444:1: ruleWorkdir EOF
            {
             before(grammarAccess.getWorkdirRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkdir();

            state._fsp--;

             after(grammarAccess.getWorkdirRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkdir"


    // $ANTLR start "ruleWorkdir"
    // InternalDockerFile.g:451:1: ruleWorkdir : ( ( rule__Workdir__Group__0 ) ) ;
    public final void ruleWorkdir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:455:2: ( ( ( rule__Workdir__Group__0 ) ) )
            // InternalDockerFile.g:456:2: ( ( rule__Workdir__Group__0 ) )
            {
            // InternalDockerFile.g:456:2: ( ( rule__Workdir__Group__0 ) )
            // InternalDockerFile.g:457:3: ( rule__Workdir__Group__0 )
            {
             before(grammarAccess.getWorkdirAccess().getGroup()); 
            // InternalDockerFile.g:458:3: ( rule__Workdir__Group__0 )
            // InternalDockerFile.g:458:4: rule__Workdir__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkdirAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkdir"


    // $ANTLR start "entryRuleAdd"
    // InternalDockerFile.g:467:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalDockerFile.g:468:1: ( ruleAdd EOF )
            // InternalDockerFile.g:469:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalDockerFile.g:476:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:480:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalDockerFile.g:481:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalDockerFile.g:481:2: ( ( rule__Add__Group__0 ) )
            // InternalDockerFile.g:482:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalDockerFile.g:483:3: ( rule__Add__Group__0 )
            // InternalDockerFile.g:483:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleAddSource"
    // InternalDockerFile.g:492:1: entryRuleAddSource : ruleAddSource EOF ;
    public final void entryRuleAddSource() throws RecognitionException {
        try {
            // InternalDockerFile.g:493:1: ( ruleAddSource EOF )
            // InternalDockerFile.g:494:1: ruleAddSource EOF
            {
             before(grammarAccess.getAddSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleAddSource();

            state._fsp--;

             after(grammarAccess.getAddSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddSource"


    // $ANTLR start "ruleAddSource"
    // InternalDockerFile.g:501:1: ruleAddSource : ( ( rule__AddSource__Alternatives ) ) ;
    public final void ruleAddSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:505:2: ( ( ( rule__AddSource__Alternatives ) ) )
            // InternalDockerFile.g:506:2: ( ( rule__AddSource__Alternatives ) )
            {
            // InternalDockerFile.g:506:2: ( ( rule__AddSource__Alternatives ) )
            // InternalDockerFile.g:507:3: ( rule__AddSource__Alternatives )
            {
             before(grammarAccess.getAddSourceAccess().getAlternatives()); 
            // InternalDockerFile.g:508:3: ( rule__AddSource__Alternatives )
            // InternalDockerFile.g:508:4: rule__AddSource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AddSource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddSourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddSource"


    // $ANTLR start "entryRuleRun"
    // InternalDockerFile.g:517:1: entryRuleRun : ruleRun EOF ;
    public final void entryRuleRun() throws RecognitionException {
        try {
            // InternalDockerFile.g:518:1: ( ruleRun EOF )
            // InternalDockerFile.g:519:1: ruleRun EOF
            {
             before(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            ruleRun();

            state._fsp--;

             after(grammarAccess.getRunRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalDockerFile.g:526:1: ruleRun : ( ( rule__Run__Alternatives ) ) ;
    public final void ruleRun() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:530:2: ( ( ( rule__Run__Alternatives ) ) )
            // InternalDockerFile.g:531:2: ( ( rule__Run__Alternatives ) )
            {
            // InternalDockerFile.g:531:2: ( ( rule__Run__Alternatives ) )
            // InternalDockerFile.g:532:3: ( rule__Run__Alternatives )
            {
             before(grammarAccess.getRunAccess().getAlternatives()); 
            // InternalDockerFile.g:533:3: ( rule__Run__Alternatives )
            // InternalDockerFile.g:533:4: rule__Run__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Run__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRunAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleRunWithShell"
    // InternalDockerFile.g:542:1: entryRuleRunWithShell : ruleRunWithShell EOF ;
    public final void entryRuleRunWithShell() throws RecognitionException {
        try {
            // InternalDockerFile.g:543:1: ( ruleRunWithShell EOF )
            // InternalDockerFile.g:544:1: ruleRunWithShell EOF
            {
             before(grammarAccess.getRunWithShellRule()); 
            pushFollow(FOLLOW_1);
            ruleRunWithShell();

            state._fsp--;

             after(grammarAccess.getRunWithShellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRunWithShell"


    // $ANTLR start "ruleRunWithShell"
    // InternalDockerFile.g:551:1: ruleRunWithShell : ( ( rule__RunWithShell__CommandAssignment ) ) ;
    public final void ruleRunWithShell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:555:2: ( ( ( rule__RunWithShell__CommandAssignment ) ) )
            // InternalDockerFile.g:556:2: ( ( rule__RunWithShell__CommandAssignment ) )
            {
            // InternalDockerFile.g:556:2: ( ( rule__RunWithShell__CommandAssignment ) )
            // InternalDockerFile.g:557:3: ( rule__RunWithShell__CommandAssignment )
            {
             before(grammarAccess.getRunWithShellAccess().getCommandAssignment()); 
            // InternalDockerFile.g:558:3: ( rule__RunWithShell__CommandAssignment )
            // InternalDockerFile.g:558:4: rule__RunWithShell__CommandAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RunWithShell__CommandAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRunWithShellAccess().getCommandAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRunWithShell"


    // $ANTLR start "entryRuleRunWithNoShell"
    // InternalDockerFile.g:567:1: entryRuleRunWithNoShell : ruleRunWithNoShell EOF ;
    public final void entryRuleRunWithNoShell() throws RecognitionException {
        try {
            // InternalDockerFile.g:568:1: ( ruleRunWithNoShell EOF )
            // InternalDockerFile.g:569:1: ruleRunWithNoShell EOF
            {
             before(grammarAccess.getRunWithNoShellRule()); 
            pushFollow(FOLLOW_1);
            ruleRunWithNoShell();

            state._fsp--;

             after(grammarAccess.getRunWithNoShellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRunWithNoShell"


    // $ANTLR start "ruleRunWithNoShell"
    // InternalDockerFile.g:576:1: ruleRunWithNoShell : ( ( rule__RunWithNoShell__Group__0 ) ) ;
    public final void ruleRunWithNoShell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:580:2: ( ( ( rule__RunWithNoShell__Group__0 ) ) )
            // InternalDockerFile.g:581:2: ( ( rule__RunWithNoShell__Group__0 ) )
            {
            // InternalDockerFile.g:581:2: ( ( rule__RunWithNoShell__Group__0 ) )
            // InternalDockerFile.g:582:3: ( rule__RunWithNoShell__Group__0 )
            {
             before(grammarAccess.getRunWithNoShellAccess().getGroup()); 
            // InternalDockerFile.g:583:3: ( rule__RunWithNoShell__Group__0 )
            // InternalDockerFile.g:583:4: rule__RunWithNoShell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RunWithNoShell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRunWithNoShellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRunWithNoShell"


    // $ANTLR start "entryRuleSTRING_PREFIXED_WITH_COMMA"
    // InternalDockerFile.g:592:1: entryRuleSTRING_PREFIXED_WITH_COMMA : ruleSTRING_PREFIXED_WITH_COMMA EOF ;
    public final void entryRuleSTRING_PREFIXED_WITH_COMMA() throws RecognitionException {
        try {
            // InternalDockerFile.g:593:1: ( ruleSTRING_PREFIXED_WITH_COMMA EOF )
            // InternalDockerFile.g:594:1: ruleSTRING_PREFIXED_WITH_COMMA EOF
            {
             before(grammarAccess.getSTRING_PREFIXED_WITH_COMMARule()); 
            pushFollow(FOLLOW_1);
            ruleSTRING_PREFIXED_WITH_COMMA();

            state._fsp--;

             after(grammarAccess.getSTRING_PREFIXED_WITH_COMMARule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSTRING_PREFIXED_WITH_COMMA"


    // $ANTLR start "ruleSTRING_PREFIXED_WITH_COMMA"
    // InternalDockerFile.g:601:1: ruleSTRING_PREFIXED_WITH_COMMA : ( ( rule__STRING_PREFIXED_WITH_COMMA__Group__0 ) ) ;
    public final void ruleSTRING_PREFIXED_WITH_COMMA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:605:2: ( ( ( rule__STRING_PREFIXED_WITH_COMMA__Group__0 ) ) )
            // InternalDockerFile.g:606:2: ( ( rule__STRING_PREFIXED_WITH_COMMA__Group__0 ) )
            {
            // InternalDockerFile.g:606:2: ( ( rule__STRING_PREFIXED_WITH_COMMA__Group__0 ) )
            // InternalDockerFile.g:607:3: ( rule__STRING_PREFIXED_WITH_COMMA__Group__0 )
            {
             before(grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getGroup()); 
            // InternalDockerFile.g:608:3: ( rule__STRING_PREFIXED_WITH_COMMA__Group__0 )
            // InternalDockerFile.g:608:4: rule__STRING_PREFIXED_WITH_COMMA__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__STRING_PREFIXED_WITH_COMMA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSTRING_PREFIXED_WITH_COMMA"


    // $ANTLR start "entryRuleVALID_RELATIVE_PATH"
    // InternalDockerFile.g:617:1: entryRuleVALID_RELATIVE_PATH : ruleVALID_RELATIVE_PATH EOF ;
    public final void entryRuleVALID_RELATIVE_PATH() throws RecognitionException {
        try {
            // InternalDockerFile.g:618:1: ( ruleVALID_RELATIVE_PATH EOF )
            // InternalDockerFile.g:619:1: ruleVALID_RELATIVE_PATH EOF
            {
             before(grammarAccess.getVALID_RELATIVE_PATHRule()); 
            pushFollow(FOLLOW_1);
            ruleVALID_RELATIVE_PATH();

            state._fsp--;

             after(grammarAccess.getVALID_RELATIVE_PATHRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVALID_RELATIVE_PATH"


    // $ANTLR start "ruleVALID_RELATIVE_PATH"
    // InternalDockerFile.g:626:1: ruleVALID_RELATIVE_PATH : ( ( rule__VALID_RELATIVE_PATH__Group__0 ) ) ;
    public final void ruleVALID_RELATIVE_PATH() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:630:2: ( ( ( rule__VALID_RELATIVE_PATH__Group__0 ) ) )
            // InternalDockerFile.g:631:2: ( ( rule__VALID_RELATIVE_PATH__Group__0 ) )
            {
            // InternalDockerFile.g:631:2: ( ( rule__VALID_RELATIVE_PATH__Group__0 ) )
            // InternalDockerFile.g:632:3: ( rule__VALID_RELATIVE_PATH__Group__0 )
            {
             before(grammarAccess.getVALID_RELATIVE_PATHAccess().getGroup()); 
            // InternalDockerFile.g:633:3: ( rule__VALID_RELATIVE_PATH__Group__0 )
            // InternalDockerFile.g:633:4: rule__VALID_RELATIVE_PATH__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VALID_RELATIVE_PATH__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVALID_RELATIVE_PATHAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALID_RELATIVE_PATH"


    // $ANTLR start "entryRuleVALID_URL"
    // InternalDockerFile.g:642:1: entryRuleVALID_URL : ruleVALID_URL EOF ;
    public final void entryRuleVALID_URL() throws RecognitionException {
        try {
            // InternalDockerFile.g:643:1: ( ruleVALID_URL EOF )
            // InternalDockerFile.g:644:1: ruleVALID_URL EOF
            {
             before(grammarAccess.getVALID_URLRule()); 
            pushFollow(FOLLOW_1);
            ruleVALID_URL();

            state._fsp--;

             after(grammarAccess.getVALID_URLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVALID_URL"


    // $ANTLR start "ruleVALID_URL"
    // InternalDockerFile.g:651:1: ruleVALID_URL : ( ( rule__VALID_URL__Group__0 ) ) ;
    public final void ruleVALID_URL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:655:2: ( ( ( rule__VALID_URL__Group__0 ) ) )
            // InternalDockerFile.g:656:2: ( ( rule__VALID_URL__Group__0 ) )
            {
            // InternalDockerFile.g:656:2: ( ( rule__VALID_URL__Group__0 ) )
            // InternalDockerFile.g:657:3: ( rule__VALID_URL__Group__0 )
            {
             before(grammarAccess.getVALID_URLAccess().getGroup()); 
            // InternalDockerFile.g:658:3: ( rule__VALID_URL__Group__0 )
            // InternalDockerFile.g:658:4: rule__VALID_URL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VALID_URL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVALID_URLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALID_URL"


    // $ANTLR start "entryRuleVALID_IMAGE_NAME"
    // InternalDockerFile.g:667:1: entryRuleVALID_IMAGE_NAME : ruleVALID_IMAGE_NAME EOF ;
    public final void entryRuleVALID_IMAGE_NAME() throws RecognitionException {
        try {
            // InternalDockerFile.g:668:1: ( ruleVALID_IMAGE_NAME EOF )
            // InternalDockerFile.g:669:1: ruleVALID_IMAGE_NAME EOF
            {
             before(grammarAccess.getVALID_IMAGE_NAMERule()); 
            pushFollow(FOLLOW_1);
            ruleVALID_IMAGE_NAME();

            state._fsp--;

             after(grammarAccess.getVALID_IMAGE_NAMERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVALID_IMAGE_NAME"


    // $ANTLR start "ruleVALID_IMAGE_NAME"
    // InternalDockerFile.g:676:1: ruleVALID_IMAGE_NAME : ( ( rule__VALID_IMAGE_NAME__Group__0 ) ) ;
    public final void ruleVALID_IMAGE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:680:2: ( ( ( rule__VALID_IMAGE_NAME__Group__0 ) ) )
            // InternalDockerFile.g:681:2: ( ( rule__VALID_IMAGE_NAME__Group__0 ) )
            {
            // InternalDockerFile.g:681:2: ( ( rule__VALID_IMAGE_NAME__Group__0 ) )
            // InternalDockerFile.g:682:3: ( rule__VALID_IMAGE_NAME__Group__0 )
            {
             before(grammarAccess.getVALID_IMAGE_NAMEAccess().getGroup()); 
            // InternalDockerFile.g:683:3: ( rule__VALID_IMAGE_NAME__Group__0 )
            // InternalDockerFile.g:683:4: rule__VALID_IMAGE_NAME__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VALID_IMAGE_NAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVALID_IMAGE_NAMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALID_IMAGE_NAME"


    // $ANTLR start "entryRuleVALID_IMAGE_TAG"
    // InternalDockerFile.g:692:1: entryRuleVALID_IMAGE_TAG : ruleVALID_IMAGE_TAG EOF ;
    public final void entryRuleVALID_IMAGE_TAG() throws RecognitionException {
        try {
            // InternalDockerFile.g:693:1: ( ruleVALID_IMAGE_TAG EOF )
            // InternalDockerFile.g:694:1: ruleVALID_IMAGE_TAG EOF
            {
             before(grammarAccess.getVALID_IMAGE_TAGRule()); 
            pushFollow(FOLLOW_1);
            ruleVALID_IMAGE_TAG();

            state._fsp--;

             after(grammarAccess.getVALID_IMAGE_TAGRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVALID_IMAGE_TAG"


    // $ANTLR start "ruleVALID_IMAGE_TAG"
    // InternalDockerFile.g:701:1: ruleVALID_IMAGE_TAG : ( ( rule__VALID_IMAGE_TAG__Group__0 ) ) ;
    public final void ruleVALID_IMAGE_TAG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:705:2: ( ( ( rule__VALID_IMAGE_TAG__Group__0 ) ) )
            // InternalDockerFile.g:706:2: ( ( rule__VALID_IMAGE_TAG__Group__0 ) )
            {
            // InternalDockerFile.g:706:2: ( ( rule__VALID_IMAGE_TAG__Group__0 ) )
            // InternalDockerFile.g:707:3: ( rule__VALID_IMAGE_TAG__Group__0 )
            {
             before(grammarAccess.getVALID_IMAGE_TAGAccess().getGroup()); 
            // InternalDockerFile.g:708:3: ( rule__VALID_IMAGE_TAG__Group__0 )
            // InternalDockerFile.g:708:4: rule__VALID_IMAGE_TAG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VALID_IMAGE_TAG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVALID_IMAGE_TAGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALID_IMAGE_TAG"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalDockerFile.g:716:1: rule__Instruction__Alternatives : ( ( ruleAdd ) | ( ruleCmd ) | ( ruleCopy ) | ( ruleEntrypoint ) | ( ruleExpose ) | ( ruleEnv ) | ( ruleFrom ) | ( ruleMaintainer ) | ( ruleOnbuild ) | ( ruleRun ) | ( ruleUser ) | ( ruleVolume ) | ( ruleWorkdir ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:720:1: ( ( ruleAdd ) | ( ruleCmd ) | ( ruleCopy ) | ( ruleEntrypoint ) | ( ruleExpose ) | ( ruleEnv ) | ( ruleFrom ) | ( ruleMaintainer ) | ( ruleOnbuild ) | ( ruleRun ) | ( ruleUser ) | ( ruleVolume ) | ( ruleWorkdir ) )
            int alt3=13;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            case 22:
                {
                alt3=7;
                }
                break;
            case 24:
                {
                alt3=8;
                }
                break;
            case 21:
                {
                alt3=9;
                }
                break;
            case 27:
            case 31:
                {
                alt3=10;
                }
                break;
            case 20:
                {
                alt3=11;
                }
                break;
            case 19:
                {
                alt3=12;
                }
                break;
            case 29:
                {
                alt3=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDockerFile.g:721:2: ( ruleAdd )
                    {
                    // InternalDockerFile.g:721:2: ( ruleAdd )
                    // InternalDockerFile.g:722:3: ruleAdd
                    {
                     before(grammarAccess.getInstructionAccess().getAddParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAddParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:727:2: ( ruleCmd )
                    {
                    // InternalDockerFile.g:727:2: ( ruleCmd )
                    // InternalDockerFile.g:728:3: ruleCmd
                    {
                     before(grammarAccess.getInstructionAccess().getCmdParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCmd();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCmdParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerFile.g:733:2: ( ruleCopy )
                    {
                    // InternalDockerFile.g:733:2: ( ruleCopy )
                    // InternalDockerFile.g:734:3: ruleCopy
                    {
                     before(grammarAccess.getInstructionAccess().getCopyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCopyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerFile.g:739:2: ( ruleEntrypoint )
                    {
                    // InternalDockerFile.g:739:2: ( ruleEntrypoint )
                    // InternalDockerFile.g:740:3: ruleEntrypoint
                    {
                     before(grammarAccess.getInstructionAccess().getEntrypointParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEntrypoint();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getEntrypointParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDockerFile.g:745:2: ( ruleExpose )
                    {
                    // InternalDockerFile.g:745:2: ( ruleExpose )
                    // InternalDockerFile.g:746:3: ruleExpose
                    {
                     before(grammarAccess.getInstructionAccess().getExposeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpose();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getExposeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDockerFile.g:751:2: ( ruleEnv )
                    {
                    // InternalDockerFile.g:751:2: ( ruleEnv )
                    // InternalDockerFile.g:752:3: ruleEnv
                    {
                     before(grammarAccess.getInstructionAccess().getEnvParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEnv();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getEnvParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDockerFile.g:757:2: ( ruleFrom )
                    {
                    // InternalDockerFile.g:757:2: ( ruleFrom )
                    // InternalDockerFile.g:758:3: ruleFrom
                    {
                     before(grammarAccess.getInstructionAccess().getFromParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleFrom();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getFromParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDockerFile.g:763:2: ( ruleMaintainer )
                    {
                    // InternalDockerFile.g:763:2: ( ruleMaintainer )
                    // InternalDockerFile.g:764:3: ruleMaintainer
                    {
                     before(grammarAccess.getInstructionAccess().getMaintainerParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleMaintainer();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getMaintainerParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDockerFile.g:769:2: ( ruleOnbuild )
                    {
                    // InternalDockerFile.g:769:2: ( ruleOnbuild )
                    // InternalDockerFile.g:770:3: ruleOnbuild
                    {
                     before(grammarAccess.getInstructionAccess().getOnbuildParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleOnbuild();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getOnbuildParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDockerFile.g:775:2: ( ruleRun )
                    {
                    // InternalDockerFile.g:775:2: ( ruleRun )
                    // InternalDockerFile.g:776:3: ruleRun
                    {
                     before(grammarAccess.getInstructionAccess().getRunParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleRun();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getRunParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDockerFile.g:781:2: ( ruleUser )
                    {
                    // InternalDockerFile.g:781:2: ( ruleUser )
                    // InternalDockerFile.g:782:3: ruleUser
                    {
                     before(grammarAccess.getInstructionAccess().getUserParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getUserParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDockerFile.g:787:2: ( ruleVolume )
                    {
                    // InternalDockerFile.g:787:2: ( ruleVolume )
                    // InternalDockerFile.g:788:3: ruleVolume
                    {
                     before(grammarAccess.getInstructionAccess().getVolumeParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleVolume();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getVolumeParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDockerFile.g:793:2: ( ruleWorkdir )
                    {
                    // InternalDockerFile.g:793:2: ( ruleWorkdir )
                    // InternalDockerFile.g:794:3: ruleWorkdir
                    {
                     before(grammarAccess.getInstructionAccess().getWorkdirParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkdir();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getWorkdirParserRuleCall_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Cmd__Alternatives_1"
    // InternalDockerFile.g:803:1: rule__Cmd__Alternatives_1 : ( ( ruleJSON_ARRAY ) | ( ( rule__Cmd__Group_1_1__0 ) ) );
    public final void rule__Cmd__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:807:1: ( ( ruleJSON_ARRAY ) | ( ( rule__Cmd__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ONE_SPACE_AND_WHATEVER) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDockerFile.g:808:2: ( ruleJSON_ARRAY )
                    {
                    // InternalDockerFile.g:808:2: ( ruleJSON_ARRAY )
                    // InternalDockerFile.g:809:3: ruleJSON_ARRAY
                    {
                     before(grammarAccess.getCmdAccess().getJSON_ARRAYParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJSON_ARRAY();

                    state._fsp--;

                     after(grammarAccess.getCmdAccess().getJSON_ARRAYParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:814:2: ( ( rule__Cmd__Group_1_1__0 ) )
                    {
                    // InternalDockerFile.g:814:2: ( ( rule__Cmd__Group_1_1__0 ) )
                    // InternalDockerFile.g:815:3: ( rule__Cmd__Group_1_1__0 )
                    {
                     before(grammarAccess.getCmdAccess().getGroup_1_1()); 
                    // InternalDockerFile.g:816:3: ( rule__Cmd__Group_1_1__0 )
                    // InternalDockerFile.g:816:4: rule__Cmd__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cmd__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCmdAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Alternatives_1"


    // $ANTLR start "rule__Copy__Alternatives_1"
    // InternalDockerFile.g:824:1: rule__Copy__Alternatives_1 : ( ( ruleJSON_ARRAY ) | ( ( rule__Copy__Group_1_1__0 ) ) );
    public final void rule__Copy__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:828:1: ( ( ruleJSON_ARRAY ) | ( ( rule__Copy__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==13||LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDockerFile.g:829:2: ( ruleJSON_ARRAY )
                    {
                    // InternalDockerFile.g:829:2: ( ruleJSON_ARRAY )
                    // InternalDockerFile.g:830:3: ruleJSON_ARRAY
                    {
                     before(grammarAccess.getCopyAccess().getJSON_ARRAYParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJSON_ARRAY();

                    state._fsp--;

                     after(grammarAccess.getCopyAccess().getJSON_ARRAYParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:835:2: ( ( rule__Copy__Group_1_1__0 ) )
                    {
                    // InternalDockerFile.g:835:2: ( ( rule__Copy__Group_1_1__0 ) )
                    // InternalDockerFile.g:836:3: ( rule__Copy__Group_1_1__0 )
                    {
                     before(grammarAccess.getCopyAccess().getGroup_1_1()); 
                    // InternalDockerFile.g:837:3: ( rule__Copy__Group_1_1__0 )
                    // InternalDockerFile.g:837:4: rule__Copy__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Copy__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCopyAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Alternatives_1"


    // $ANTLR start "rule__Entrypoint__Alternatives_1"
    // InternalDockerFile.g:845:1: rule__Entrypoint__Alternatives_1 : ( ( ruleJSON_ARRAY ) | ( ( rule__Entrypoint__Group_1_1__0 ) ) );
    public final void rule__Entrypoint__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:849:1: ( ( ruleJSON_ARRAY ) | ( ( rule__Entrypoint__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
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
                    // InternalDockerFile.g:850:2: ( ruleJSON_ARRAY )
                    {
                    // InternalDockerFile.g:850:2: ( ruleJSON_ARRAY )
                    // InternalDockerFile.g:851:3: ruleJSON_ARRAY
                    {
                     before(grammarAccess.getEntrypointAccess().getJSON_ARRAYParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJSON_ARRAY();

                    state._fsp--;

                     after(grammarAccess.getEntrypointAccess().getJSON_ARRAYParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:856:2: ( ( rule__Entrypoint__Group_1_1__0 ) )
                    {
                    // InternalDockerFile.g:856:2: ( ( rule__Entrypoint__Group_1_1__0 ) )
                    // InternalDockerFile.g:857:3: ( rule__Entrypoint__Group_1_1__0 )
                    {
                     before(grammarAccess.getEntrypointAccess().getGroup_1_1()); 
                    // InternalDockerFile.g:858:3: ( rule__Entrypoint__Group_1_1__0 )
                    // InternalDockerFile.g:858:4: rule__Entrypoint__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entrypoint__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntrypointAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Alternatives_1"


    // $ANTLR start "rule__Volume__Alternatives_1"
    // InternalDockerFile.g:866:1: rule__Volume__Alternatives_1 : ( ( ruleJSON_ARRAY ) | ( ( rule__Volume__Group_1_1__0 ) ) );
    public final void rule__Volume__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:870:1: ( ( ruleJSON_ARRAY ) | ( ( rule__Volume__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ONE_SPACE_AND_WHATEVER) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDockerFile.g:871:2: ( ruleJSON_ARRAY )
                    {
                    // InternalDockerFile.g:871:2: ( ruleJSON_ARRAY )
                    // InternalDockerFile.g:872:3: ruleJSON_ARRAY
                    {
                     before(grammarAccess.getVolumeAccess().getJSON_ARRAYParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJSON_ARRAY();

                    state._fsp--;

                     after(grammarAccess.getVolumeAccess().getJSON_ARRAYParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:877:2: ( ( rule__Volume__Group_1_1__0 ) )
                    {
                    // InternalDockerFile.g:877:2: ( ( rule__Volume__Group_1_1__0 ) )
                    // InternalDockerFile.g:878:3: ( rule__Volume__Group_1_1__0 )
                    {
                     before(grammarAccess.getVolumeAccess().getGroup_1_1()); 
                    // InternalDockerFile.g:879:3: ( rule__Volume__Group_1_1__0 )
                    // InternalDockerFile.g:879:4: rule__Volume__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Volume__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVolumeAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Alternatives_1"


    // $ANTLR start "rule__Env__Alternatives_1"
    // InternalDockerFile.g:887:1: rule__Env__Alternatives_1 : ( ( ruleEnvWithSpace ) | ( ruleEnvWithEqual ) );
    public final void rule__Env__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:891:1: ( ( ruleEnvWithSpace ) | ( ruleEnvWithEqual ) )
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
                    // InternalDockerFile.g:892:2: ( ruleEnvWithSpace )
                    {
                    // InternalDockerFile.g:892:2: ( ruleEnvWithSpace )
                    // InternalDockerFile.g:893:3: ruleEnvWithSpace
                    {
                     before(grammarAccess.getEnvAccess().getEnvWithSpaceParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnvWithSpace();

                    state._fsp--;

                     after(grammarAccess.getEnvAccess().getEnvWithSpaceParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:898:2: ( ruleEnvWithEqual )
                    {
                    // InternalDockerFile.g:898:2: ( ruleEnvWithEqual )
                    // InternalDockerFile.g:899:3: ruleEnvWithEqual
                    {
                     before(grammarAccess.getEnvAccess().getEnvWithEqualParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnvWithEqual();

                    state._fsp--;

                     after(grammarAccess.getEnvAccess().getEnvWithEqualParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__Alternatives_1"


    // $ANTLR start "rule__AddSource__Alternatives"
    // InternalDockerFile.g:908:1: rule__AddSource__Alternatives : ( ( ruleVALID_RELATIVE_PATH ) | ( ruleVALID_URL ) | ( '.' ) );
    public final void rule__AddSource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:912:1: ( ( ruleVALID_RELATIVE_PATH ) | ( ruleVALID_URL ) | ( '.' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 13:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDockerFile.g:913:2: ( ruleVALID_RELATIVE_PATH )
                    {
                    // InternalDockerFile.g:913:2: ( ruleVALID_RELATIVE_PATH )
                    // InternalDockerFile.g:914:3: ruleVALID_RELATIVE_PATH
                    {
                     before(grammarAccess.getAddSourceAccess().getVALID_RELATIVE_PATHParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVALID_RELATIVE_PATH();

                    state._fsp--;

                     after(grammarAccess.getAddSourceAccess().getVALID_RELATIVE_PATHParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:919:2: ( ruleVALID_URL )
                    {
                    // InternalDockerFile.g:919:2: ( ruleVALID_URL )
                    // InternalDockerFile.g:920:3: ruleVALID_URL
                    {
                     before(grammarAccess.getAddSourceAccess().getVALID_URLParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVALID_URL();

                    state._fsp--;

                     after(grammarAccess.getAddSourceAccess().getVALID_URLParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerFile.g:925:2: ( '.' )
                    {
                    // InternalDockerFile.g:925:2: ( '.' )
                    // InternalDockerFile.g:926:3: '.'
                    {
                     before(grammarAccess.getAddSourceAccess().getFullStopKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAddSourceAccess().getFullStopKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddSource__Alternatives"


    // $ANTLR start "rule__Run__Alternatives"
    // InternalDockerFile.g:935:1: rule__Run__Alternatives : ( ( ( rule__Run__Group_0__0 ) ) | ( ruleRunWithNoShell ) );
    public final void rule__Run__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:939:1: ( ( ( rule__Run__Group_0__0 ) ) | ( ruleRunWithNoShell ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDockerFile.g:940:2: ( ( rule__Run__Group_0__0 ) )
                    {
                    // InternalDockerFile.g:940:2: ( ( rule__Run__Group_0__0 ) )
                    // InternalDockerFile.g:941:3: ( rule__Run__Group_0__0 )
                    {
                     before(grammarAccess.getRunAccess().getGroup_0()); 
                    // InternalDockerFile.g:942:3: ( rule__Run__Group_0__0 )
                    // InternalDockerFile.g:942:4: rule__Run__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Run__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRunAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:946:2: ( ruleRunWithNoShell )
                    {
                    // InternalDockerFile.g:946:2: ( ruleRunWithNoShell )
                    // InternalDockerFile.g:947:3: ruleRunWithNoShell
                    {
                     before(grammarAccess.getRunAccess().getRunWithNoShellParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRunWithNoShell();

                    state._fsp--;

                     after(grammarAccess.getRunAccess().getRunWithNoShellParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Alternatives"


    // $ANTLR start "rule__VALID_URL__Alternatives_2_0"
    // InternalDockerFile.g:956:1: rule__VALID_URL__Alternatives_2_0 : ( ( '/' ) | ( '.' ) );
    public final void rule__VALID_URL__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:960:1: ( ( '/' ) | ( '.' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==13) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDockerFile.g:961:2: ( '/' )
                    {
                    // InternalDockerFile.g:961:2: ( '/' )
                    // InternalDockerFile.g:962:3: '/'
                    {
                     before(grammarAccess.getVALID_URLAccess().getSolidusKeyword_2_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVALID_URLAccess().getSolidusKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:967:2: ( '.' )
                    {
                    // InternalDockerFile.g:967:2: ( '.' )
                    // InternalDockerFile.g:968:3: '.'
                    {
                     before(grammarAccess.getVALID_URLAccess().getFullStopKeyword_2_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVALID_URLAccess().getFullStopKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Alternatives_2_0"


    // $ANTLR start "rule__VALID_IMAGE_TAG__Alternatives_0"
    // InternalDockerFile.g:977:1: rule__VALID_IMAGE_TAG__Alternatives_0 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__VALID_IMAGE_TAG__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:981:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDockerFile.g:982:2: ( RULE_ID )
                    {
                    // InternalDockerFile.g:982:2: ( RULE_ID )
                    // InternalDockerFile.g:983:3: RULE_ID
                    {
                     before(grammarAccess.getVALID_IMAGE_TAGAccess().getIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getVALID_IMAGE_TAGAccess().getIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:988:2: ( RULE_INT )
                    {
                    // InternalDockerFile.g:988:2: ( RULE_INT )
                    // InternalDockerFile.g:989:3: RULE_INT
                    {
                     before(grammarAccess.getVALID_IMAGE_TAGAccess().getINTTerminalRuleCall_0_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getVALID_IMAGE_TAGAccess().getINTTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerFile.g:994:2: ( RULE_STRING )
                    {
                    // InternalDockerFile.g:994:2: ( RULE_STRING )
                    // InternalDockerFile.g:995:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_IMAGE_TAGAccess().getSTRINGTerminalRuleCall_0_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_IMAGE_TAGAccess().getSTRINGTerminalRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_TAG__Alternatives_0"


    // $ANTLR start "rule__VALID_IMAGE_TAG__Alternatives_1"
    // InternalDockerFile.g:1004:1: rule__VALID_IMAGE_TAG__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__VALID_IMAGE_TAG__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1008:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            case 15:
                {
                alt13=4;
                }
                break;
            case 13:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDockerFile.g:1009:2: ( RULE_ID )
                    {
                    // InternalDockerFile.g:1009:2: ( RULE_ID )
                    // InternalDockerFile.g:1010:3: RULE_ID
                    {
                     before(grammarAccess.getVALID_IMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getVALID_IMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerFile.g:1015:2: ( RULE_INT )
                    {
                    // InternalDockerFile.g:1015:2: ( RULE_INT )
                    // InternalDockerFile.g:1016:3: RULE_INT
                    {
                     before(grammarAccess.getVALID_IMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getVALID_IMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDockerFile.g:1021:2: ( RULE_STRING )
                    {
                    // InternalDockerFile.g:1021:2: ( RULE_STRING )
                    // InternalDockerFile.g:1022:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_IMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_IMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDockerFile.g:1027:2: ( '-' )
                    {
                    // InternalDockerFile.g:1027:2: ( '-' )
                    // InternalDockerFile.g:1028:3: '-'
                    {
                     before(grammarAccess.getVALID_IMAGE_TAGAccess().getHyphenMinusKeyword_1_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVALID_IMAGE_TAGAccess().getHyphenMinusKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDockerFile.g:1033:2: ( '.' )
                    {
                    // InternalDockerFile.g:1033:2: ( '.' )
                    // InternalDockerFile.g:1034:3: '.'
                    {
                     before(grammarAccess.getVALID_IMAGE_TAGAccess().getFullStopKeyword_1_4()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVALID_IMAGE_TAGAccess().getFullStopKeyword_1_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_TAG__Alternatives_1"


    // $ANTLR start "rule__Cmd__Group__0"
    // InternalDockerFile.g:1043:1: rule__Cmd__Group__0 : rule__Cmd__Group__0__Impl rule__Cmd__Group__1 ;
    public final void rule__Cmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1047:1: ( rule__Cmd__Group__0__Impl rule__Cmd__Group__1 )
            // InternalDockerFile.g:1048:2: rule__Cmd__Group__0__Impl rule__Cmd__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Cmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__0"


    // $ANTLR start "rule__Cmd__Group__0__Impl"
    // InternalDockerFile.g:1055:1: rule__Cmd__Group__0__Impl : ( 'CMD' ) ;
    public final void rule__Cmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1059:1: ( ( 'CMD' ) )
            // InternalDockerFile.g:1060:1: ( 'CMD' )
            {
            // InternalDockerFile.g:1060:1: ( 'CMD' )
            // InternalDockerFile.g:1061:2: 'CMD'
            {
             before(grammarAccess.getCmdAccess().getCMDKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCmdAccess().getCMDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__0__Impl"


    // $ANTLR start "rule__Cmd__Group__1"
    // InternalDockerFile.g:1070:1: rule__Cmd__Group__1 : rule__Cmd__Group__1__Impl ;
    public final void rule__Cmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1074:1: ( rule__Cmd__Group__1__Impl )
            // InternalDockerFile.g:1075:2: rule__Cmd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__1"


    // $ANTLR start "rule__Cmd__Group__1__Impl"
    // InternalDockerFile.g:1081:1: rule__Cmd__Group__1__Impl : ( ( rule__Cmd__Alternatives_1 ) ) ;
    public final void rule__Cmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1085:1: ( ( ( rule__Cmd__Alternatives_1 ) ) )
            // InternalDockerFile.g:1086:1: ( ( rule__Cmd__Alternatives_1 ) )
            {
            // InternalDockerFile.g:1086:1: ( ( rule__Cmd__Alternatives_1 ) )
            // InternalDockerFile.g:1087:2: ( rule__Cmd__Alternatives_1 )
            {
             before(grammarAccess.getCmdAccess().getAlternatives_1()); 
            // InternalDockerFile.g:1088:2: ( rule__Cmd__Alternatives_1 )
            // InternalDockerFile.g:1088:3: rule__Cmd__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__1__Impl"


    // $ANTLR start "rule__Cmd__Group_1_1__0"
    // InternalDockerFile.g:1097:1: rule__Cmd__Group_1_1__0 : rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1 ;
    public final void rule__Cmd__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1101:1: ( rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1 )
            // InternalDockerFile.g:1102:2: rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Cmd__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cmd__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_1_1__0"


    // $ANTLR start "rule__Cmd__Group_1_1__0__Impl"
    // InternalDockerFile.g:1109:1: rule__Cmd__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Cmd__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1113:1: ( ( () ) )
            // InternalDockerFile.g:1114:1: ( () )
            {
            // InternalDockerFile.g:1114:1: ( () )
            // InternalDockerFile.g:1115:2: ()
            {
             before(grammarAccess.getCmdAccess().getCmdAction_1_1_0()); 
            // InternalDockerFile.g:1116:2: ()
            // InternalDockerFile.g:1116:3: 
            {
            }

             after(grammarAccess.getCmdAccess().getCmdAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_1_1__0__Impl"


    // $ANTLR start "rule__Cmd__Group_1_1__1"
    // InternalDockerFile.g:1124:1: rule__Cmd__Group_1_1__1 : rule__Cmd__Group_1_1__1__Impl ;
    public final void rule__Cmd__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1128:1: ( rule__Cmd__Group_1_1__1__Impl )
            // InternalDockerFile.g:1129:2: rule__Cmd__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_1_1__1"


    // $ANTLR start "rule__Cmd__Group_1_1__1__Impl"
    // InternalDockerFile.g:1135:1: rule__Cmd__Group_1_1__1__Impl : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__Cmd__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1139:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:1140:1: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:1140:1: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:1141:2: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getCmdAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getCmdAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_1_1__1__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // InternalDockerFile.g:1151:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1155:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalDockerFile.g:1156:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0"


    // $ANTLR start "rule__Copy__Group__0__Impl"
    // InternalDockerFile.g:1163:1: rule__Copy__Group__0__Impl : ( 'COPY' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1167:1: ( ( 'COPY' ) )
            // InternalDockerFile.g:1168:1: ( 'COPY' )
            {
            // InternalDockerFile.g:1168:1: ( 'COPY' )
            // InternalDockerFile.g:1169:2: 'COPY'
            {
             before(grammarAccess.getCopyAccess().getCOPYKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCOPYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0__Impl"


    // $ANTLR start "rule__Copy__Group__1"
    // InternalDockerFile.g:1178:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1182:1: ( rule__Copy__Group__1__Impl )
            // InternalDockerFile.g:1183:2: rule__Copy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1"


    // $ANTLR start "rule__Copy__Group__1__Impl"
    // InternalDockerFile.g:1189:1: rule__Copy__Group__1__Impl : ( ( rule__Copy__Alternatives_1 ) ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1193:1: ( ( ( rule__Copy__Alternatives_1 ) ) )
            // InternalDockerFile.g:1194:1: ( ( rule__Copy__Alternatives_1 ) )
            {
            // InternalDockerFile.g:1194:1: ( ( rule__Copy__Alternatives_1 ) )
            // InternalDockerFile.g:1195:2: ( rule__Copy__Alternatives_1 )
            {
             before(grammarAccess.getCopyAccess().getAlternatives_1()); 
            // InternalDockerFile.g:1196:2: ( rule__Copy__Alternatives_1 )
            // InternalDockerFile.g:1196:3: rule__Copy__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1__Impl"


    // $ANTLR start "rule__Copy__Group_1_1__0"
    // InternalDockerFile.g:1205:1: rule__Copy__Group_1_1__0 : rule__Copy__Group_1_1__0__Impl rule__Copy__Group_1_1__1 ;
    public final void rule__Copy__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1209:1: ( rule__Copy__Group_1_1__0__Impl rule__Copy__Group_1_1__1 )
            // InternalDockerFile.g:1210:2: rule__Copy__Group_1_1__0__Impl rule__Copy__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Copy__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_1_1__0"


    // $ANTLR start "rule__Copy__Group_1_1__0__Impl"
    // InternalDockerFile.g:1217:1: rule__Copy__Group_1_1__0__Impl : ( ( rule__Copy__Source_leftAssignment_1_1_0 ) ) ;
    public final void rule__Copy__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1221:1: ( ( ( rule__Copy__Source_leftAssignment_1_1_0 ) ) )
            // InternalDockerFile.g:1222:1: ( ( rule__Copy__Source_leftAssignment_1_1_0 ) )
            {
            // InternalDockerFile.g:1222:1: ( ( rule__Copy__Source_leftAssignment_1_1_0 ) )
            // InternalDockerFile.g:1223:2: ( rule__Copy__Source_leftAssignment_1_1_0 )
            {
             before(grammarAccess.getCopyAccess().getSource_leftAssignment_1_1_0()); 
            // InternalDockerFile.g:1224:2: ( rule__Copy__Source_leftAssignment_1_1_0 )
            // InternalDockerFile.g:1224:3: rule__Copy__Source_leftAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Source_leftAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getSource_leftAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_1_1__0__Impl"


    // $ANTLR start "rule__Copy__Group_1_1__1"
    // InternalDockerFile.g:1232:1: rule__Copy__Group_1_1__1 : rule__Copy__Group_1_1__1__Impl ;
    public final void rule__Copy__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1236:1: ( rule__Copy__Group_1_1__1__Impl )
            // InternalDockerFile.g:1237:2: rule__Copy__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_1_1__1"


    // $ANTLR start "rule__Copy__Group_1_1__1__Impl"
    // InternalDockerFile.g:1243:1: rule__Copy__Group_1_1__1__Impl : ( ( rule__Copy__DestAssignment_1_1_1 ) ) ;
    public final void rule__Copy__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1247:1: ( ( ( rule__Copy__DestAssignment_1_1_1 ) ) )
            // InternalDockerFile.g:1248:1: ( ( rule__Copy__DestAssignment_1_1_1 ) )
            {
            // InternalDockerFile.g:1248:1: ( ( rule__Copy__DestAssignment_1_1_1 ) )
            // InternalDockerFile.g:1249:2: ( rule__Copy__DestAssignment_1_1_1 )
            {
             before(grammarAccess.getCopyAccess().getDestAssignment_1_1_1()); 
            // InternalDockerFile.g:1250:2: ( rule__Copy__DestAssignment_1_1_1 )
            // InternalDockerFile.g:1250:3: rule__Copy__DestAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Copy__DestAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getDestAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_1_1__1__Impl"


    // $ANTLR start "rule__Entrypoint__Group__0"
    // InternalDockerFile.g:1259:1: rule__Entrypoint__Group__0 : rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 ;
    public final void rule__Entrypoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1263:1: ( rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 )
            // InternalDockerFile.g:1264:2: rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Entrypoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group__0"


    // $ANTLR start "rule__Entrypoint__Group__0__Impl"
    // InternalDockerFile.g:1271:1: rule__Entrypoint__Group__0__Impl : ( 'ENTRYPOINT' ) ;
    public final void rule__Entrypoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1275:1: ( ( 'ENTRYPOINT' ) )
            // InternalDockerFile.g:1276:1: ( 'ENTRYPOINT' )
            {
            // InternalDockerFile.g:1276:1: ( 'ENTRYPOINT' )
            // InternalDockerFile.g:1277:2: 'ENTRYPOINT'
            {
             before(grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group__0__Impl"


    // $ANTLR start "rule__Entrypoint__Group__1"
    // InternalDockerFile.g:1286:1: rule__Entrypoint__Group__1 : rule__Entrypoint__Group__1__Impl ;
    public final void rule__Entrypoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1290:1: ( rule__Entrypoint__Group__1__Impl )
            // InternalDockerFile.g:1291:2: rule__Entrypoint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group__1"


    // $ANTLR start "rule__Entrypoint__Group__1__Impl"
    // InternalDockerFile.g:1297:1: rule__Entrypoint__Group__1__Impl : ( ( rule__Entrypoint__Alternatives_1 ) ) ;
    public final void rule__Entrypoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1301:1: ( ( ( rule__Entrypoint__Alternatives_1 ) ) )
            // InternalDockerFile.g:1302:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            {
            // InternalDockerFile.g:1302:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            // InternalDockerFile.g:1303:2: ( rule__Entrypoint__Alternatives_1 )
            {
             before(grammarAccess.getEntrypointAccess().getAlternatives_1()); 
            // InternalDockerFile.g:1304:2: ( rule__Entrypoint__Alternatives_1 )
            // InternalDockerFile.g:1304:3: rule__Entrypoint__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEntrypointAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group__1__Impl"


    // $ANTLR start "rule__Entrypoint__Group_1_1__0"
    // InternalDockerFile.g:1313:1: rule__Entrypoint__Group_1_1__0 : rule__Entrypoint__Group_1_1__0__Impl rule__Entrypoint__Group_1_1__1 ;
    public final void rule__Entrypoint__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1317:1: ( rule__Entrypoint__Group_1_1__0__Impl rule__Entrypoint__Group_1_1__1 )
            // InternalDockerFile.g:1318:2: rule__Entrypoint__Group_1_1__0__Impl rule__Entrypoint__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Entrypoint__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group_1_1__0"


    // $ANTLR start "rule__Entrypoint__Group_1_1__0__Impl"
    // InternalDockerFile.g:1325:1: rule__Entrypoint__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Entrypoint__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1329:1: ( ( () ) )
            // InternalDockerFile.g:1330:1: ( () )
            {
            // InternalDockerFile.g:1330:1: ( () )
            // InternalDockerFile.g:1331:2: ()
            {
             before(grammarAccess.getEntrypointAccess().getCmdAction_1_1_0()); 
            // InternalDockerFile.g:1332:2: ()
            // InternalDockerFile.g:1332:3: 
            {
            }

             after(grammarAccess.getEntrypointAccess().getCmdAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group_1_1__0__Impl"


    // $ANTLR start "rule__Entrypoint__Group_1_1__1"
    // InternalDockerFile.g:1340:1: rule__Entrypoint__Group_1_1__1 : rule__Entrypoint__Group_1_1__1__Impl ;
    public final void rule__Entrypoint__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1344:1: ( rule__Entrypoint__Group_1_1__1__Impl )
            // InternalDockerFile.g:1345:2: rule__Entrypoint__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group_1_1__1"


    // $ANTLR start "rule__Entrypoint__Group_1_1__1__Impl"
    // InternalDockerFile.g:1351:1: rule__Entrypoint__Group_1_1__1__Impl : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__Entrypoint__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1355:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:1356:1: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:1356:1: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:1357:2: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getEntrypointAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getEntrypointAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group_1_1__1__Impl"


    // $ANTLR start "rule__Volume__Group__0"
    // InternalDockerFile.g:1367:1: rule__Volume__Group__0 : rule__Volume__Group__0__Impl rule__Volume__Group__1 ;
    public final void rule__Volume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1371:1: ( rule__Volume__Group__0__Impl rule__Volume__Group__1 )
            // InternalDockerFile.g:1372:2: rule__Volume__Group__0__Impl rule__Volume__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Volume__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__0"


    // $ANTLR start "rule__Volume__Group__0__Impl"
    // InternalDockerFile.g:1379:1: rule__Volume__Group__0__Impl : ( 'VOLUME' ) ;
    public final void rule__Volume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1383:1: ( ( 'VOLUME' ) )
            // InternalDockerFile.g:1384:1: ( 'VOLUME' )
            {
            // InternalDockerFile.g:1384:1: ( 'VOLUME' )
            // InternalDockerFile.g:1385:2: 'VOLUME'
            {
             before(grammarAccess.getVolumeAccess().getVOLUMEKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getVOLUMEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__0__Impl"


    // $ANTLR start "rule__Volume__Group__1"
    // InternalDockerFile.g:1394:1: rule__Volume__Group__1 : rule__Volume__Group__1__Impl ;
    public final void rule__Volume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1398:1: ( rule__Volume__Group__1__Impl )
            // InternalDockerFile.g:1399:2: rule__Volume__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__1"


    // $ANTLR start "rule__Volume__Group__1__Impl"
    // InternalDockerFile.g:1405:1: rule__Volume__Group__1__Impl : ( ( rule__Volume__Alternatives_1 ) ) ;
    public final void rule__Volume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1409:1: ( ( ( rule__Volume__Alternatives_1 ) ) )
            // InternalDockerFile.g:1410:1: ( ( rule__Volume__Alternatives_1 ) )
            {
            // InternalDockerFile.g:1410:1: ( ( rule__Volume__Alternatives_1 ) )
            // InternalDockerFile.g:1411:2: ( rule__Volume__Alternatives_1 )
            {
             before(grammarAccess.getVolumeAccess().getAlternatives_1()); 
            // InternalDockerFile.g:1412:2: ( rule__Volume__Alternatives_1 )
            // InternalDockerFile.g:1412:3: rule__Volume__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__1__Impl"


    // $ANTLR start "rule__Volume__Group_1_1__0"
    // InternalDockerFile.g:1421:1: rule__Volume__Group_1_1__0 : rule__Volume__Group_1_1__0__Impl rule__Volume__Group_1_1__1 ;
    public final void rule__Volume__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1425:1: ( rule__Volume__Group_1_1__0__Impl rule__Volume__Group_1_1__1 )
            // InternalDockerFile.g:1426:2: rule__Volume__Group_1_1__0__Impl rule__Volume__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Volume__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group_1_1__0"


    // $ANTLR start "rule__Volume__Group_1_1__0__Impl"
    // InternalDockerFile.g:1433:1: rule__Volume__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Volume__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1437:1: ( ( () ) )
            // InternalDockerFile.g:1438:1: ( () )
            {
            // InternalDockerFile.g:1438:1: ( () )
            // InternalDockerFile.g:1439:2: ()
            {
             before(grammarAccess.getVolumeAccess().getVolumeAction_1_1_0()); 
            // InternalDockerFile.g:1440:2: ()
            // InternalDockerFile.g:1440:3: 
            {
            }

             after(grammarAccess.getVolumeAccess().getVolumeAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group_1_1__0__Impl"


    // $ANTLR start "rule__Volume__Group_1_1__1"
    // InternalDockerFile.g:1448:1: rule__Volume__Group_1_1__1 : rule__Volume__Group_1_1__1__Impl ;
    public final void rule__Volume__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1452:1: ( rule__Volume__Group_1_1__1__Impl )
            // InternalDockerFile.g:1453:2: rule__Volume__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group_1_1__1"


    // $ANTLR start "rule__Volume__Group_1_1__1__Impl"
    // InternalDockerFile.g:1459:1: rule__Volume__Group_1_1__1__Impl : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__Volume__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1463:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:1464:1: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:1464:1: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:1465:2: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getVolumeAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group_1_1__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalDockerFile.g:1475:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1479:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalDockerFile.g:1480:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalDockerFile.g:1487:1: rule__User__Group__0__Impl : ( 'USER' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1491:1: ( ( 'USER' ) )
            // InternalDockerFile.g:1492:1: ( 'USER' )
            {
            // InternalDockerFile.g:1492:1: ( 'USER' )
            // InternalDockerFile.g:1493:2: 'USER'
            {
             before(grammarAccess.getUserAccess().getUSERKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUSERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalDockerFile.g:1502:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1506:1: ( rule__User__Group__1__Impl )
            // InternalDockerFile.g:1507:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalDockerFile.g:1513:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1517:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // InternalDockerFile.g:1518:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // InternalDockerFile.g:1518:1: ( ( rule__User__NameAssignment_1 ) )
            // InternalDockerFile.g:1519:2: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // InternalDockerFile.g:1520:2: ( rule__User__NameAssignment_1 )
            // InternalDockerFile.g:1520:3: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__Onbuild__Group__0"
    // InternalDockerFile.g:1529:1: rule__Onbuild__Group__0 : rule__Onbuild__Group__0__Impl rule__Onbuild__Group__1 ;
    public final void rule__Onbuild__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1533:1: ( rule__Onbuild__Group__0__Impl rule__Onbuild__Group__1 )
            // InternalDockerFile.g:1534:2: rule__Onbuild__Group__0__Impl rule__Onbuild__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Onbuild__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Onbuild__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__Group__0"


    // $ANTLR start "rule__Onbuild__Group__0__Impl"
    // InternalDockerFile.g:1541:1: rule__Onbuild__Group__0__Impl : ( 'ONBUILD' ) ;
    public final void rule__Onbuild__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1545:1: ( ( 'ONBUILD' ) )
            // InternalDockerFile.g:1546:1: ( 'ONBUILD' )
            {
            // InternalDockerFile.g:1546:1: ( 'ONBUILD' )
            // InternalDockerFile.g:1547:2: 'ONBUILD'
            {
             before(grammarAccess.getOnbuildAccess().getONBUILDKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOnbuildAccess().getONBUILDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__Group__0__Impl"


    // $ANTLR start "rule__Onbuild__Group__1"
    // InternalDockerFile.g:1556:1: rule__Onbuild__Group__1 : rule__Onbuild__Group__1__Impl ;
    public final void rule__Onbuild__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1560:1: ( rule__Onbuild__Group__1__Impl )
            // InternalDockerFile.g:1561:2: rule__Onbuild__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__Group__1"


    // $ANTLR start "rule__Onbuild__Group__1__Impl"
    // InternalDockerFile.g:1567:1: rule__Onbuild__Group__1__Impl : ( ( rule__Onbuild__InstructionAssignment_1 ) ) ;
    public final void rule__Onbuild__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1571:1: ( ( ( rule__Onbuild__InstructionAssignment_1 ) ) )
            // InternalDockerFile.g:1572:1: ( ( rule__Onbuild__InstructionAssignment_1 ) )
            {
            // InternalDockerFile.g:1572:1: ( ( rule__Onbuild__InstructionAssignment_1 ) )
            // InternalDockerFile.g:1573:2: ( rule__Onbuild__InstructionAssignment_1 )
            {
             before(grammarAccess.getOnbuildAccess().getInstructionAssignment_1()); 
            // InternalDockerFile.g:1574:2: ( rule__Onbuild__InstructionAssignment_1 )
            // InternalDockerFile.g:1574:3: rule__Onbuild__InstructionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__InstructionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnbuildAccess().getInstructionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__Group__1__Impl"


    // $ANTLR start "rule__From__Group__0"
    // InternalDockerFile.g:1583:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1587:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalDockerFile.g:1588:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__From__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0"


    // $ANTLR start "rule__From__Group__0__Impl"
    // InternalDockerFile.g:1595:1: rule__From__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1599:1: ( ( 'FROM' ) )
            // InternalDockerFile.g:1600:1: ( 'FROM' )
            {
            // InternalDockerFile.g:1600:1: ( 'FROM' )
            // InternalDockerFile.g:1601:2: 'FROM'
            {
             before(grammarAccess.getFromAccess().getFROMKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getFROMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0__Impl"


    // $ANTLR start "rule__From__Group__1"
    // InternalDockerFile.g:1610:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1614:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalDockerFile.g:1615:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__From__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1"


    // $ANTLR start "rule__From__Group__1__Impl"
    // InternalDockerFile.g:1622:1: rule__From__Group__1__Impl : ( ( rule__From__NameAssignment_1 ) ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1626:1: ( ( ( rule__From__NameAssignment_1 ) ) )
            // InternalDockerFile.g:1627:1: ( ( rule__From__NameAssignment_1 ) )
            {
            // InternalDockerFile.g:1627:1: ( ( rule__From__NameAssignment_1 ) )
            // InternalDockerFile.g:1628:2: ( rule__From__NameAssignment_1 )
            {
             before(grammarAccess.getFromAccess().getNameAssignment_1()); 
            // InternalDockerFile.g:1629:2: ( rule__From__NameAssignment_1 )
            // InternalDockerFile.g:1629:3: rule__From__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__From__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1__Impl"


    // $ANTLR start "rule__From__Group__2"
    // InternalDockerFile.g:1637:1: rule__From__Group__2 : rule__From__Group__2__Impl ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1641:1: ( rule__From__Group__2__Impl )
            // InternalDockerFile.g:1642:2: rule__From__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__2"


    // $ANTLR start "rule__From__Group__2__Impl"
    // InternalDockerFile.g:1648:1: rule__From__Group__2__Impl : ( ( rule__From__Group_2__0 )? ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1652:1: ( ( ( rule__From__Group_2__0 )? ) )
            // InternalDockerFile.g:1653:1: ( ( rule__From__Group_2__0 )? )
            {
            // InternalDockerFile.g:1653:1: ( ( rule__From__Group_2__0 )? )
            // InternalDockerFile.g:1654:2: ( rule__From__Group_2__0 )?
            {
             before(grammarAccess.getFromAccess().getGroup_2()); 
            // InternalDockerFile.g:1655:2: ( rule__From__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDockerFile.g:1655:3: rule__From__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__From__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFromAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__2__Impl"


    // $ANTLR start "rule__From__Group_2__0"
    // InternalDockerFile.g:1664:1: rule__From__Group_2__0 : rule__From__Group_2__0__Impl rule__From__Group_2__1 ;
    public final void rule__From__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1668:1: ( rule__From__Group_2__0__Impl rule__From__Group_2__1 )
            // InternalDockerFile.g:1669:2: rule__From__Group_2__0__Impl rule__From__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__From__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_2__0"


    // $ANTLR start "rule__From__Group_2__0__Impl"
    // InternalDockerFile.g:1676:1: rule__From__Group_2__0__Impl : ( ':' ) ;
    public final void rule__From__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1680:1: ( ( ':' ) )
            // InternalDockerFile.g:1681:1: ( ':' )
            {
            // InternalDockerFile.g:1681:1: ( ':' )
            // InternalDockerFile.g:1682:2: ':'
            {
             before(grammarAccess.getFromAccess().getColonKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_2__0__Impl"


    // $ANTLR start "rule__From__Group_2__1"
    // InternalDockerFile.g:1691:1: rule__From__Group_2__1 : rule__From__Group_2__1__Impl ;
    public final void rule__From__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1695:1: ( rule__From__Group_2__1__Impl )
            // InternalDockerFile.g:1696:2: rule__From__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__From__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_2__1"


    // $ANTLR start "rule__From__Group_2__1__Impl"
    // InternalDockerFile.g:1702:1: rule__From__Group_2__1__Impl : ( ( rule__From__TagAssignment_2_1 ) ) ;
    public final void rule__From__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1706:1: ( ( ( rule__From__TagAssignment_2_1 ) ) )
            // InternalDockerFile.g:1707:1: ( ( rule__From__TagAssignment_2_1 ) )
            {
            // InternalDockerFile.g:1707:1: ( ( rule__From__TagAssignment_2_1 ) )
            // InternalDockerFile.g:1708:2: ( rule__From__TagAssignment_2_1 )
            {
             before(grammarAccess.getFromAccess().getTagAssignment_2_1()); 
            // InternalDockerFile.g:1709:2: ( rule__From__TagAssignment_2_1 )
            // InternalDockerFile.g:1709:3: rule__From__TagAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__From__TagAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getTagAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group_2__1__Impl"


    // $ANTLR start "rule__Maintainer__Group__0"
    // InternalDockerFile.g:1718:1: rule__Maintainer__Group__0 : rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 ;
    public final void rule__Maintainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1722:1: ( rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 )
            // InternalDockerFile.g:1723:2: rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Maintainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maintainer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__Group__0"


    // $ANTLR start "rule__Maintainer__Group__0__Impl"
    // InternalDockerFile.g:1730:1: rule__Maintainer__Group__0__Impl : ( 'MAINTAINER' ) ;
    public final void rule__Maintainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1734:1: ( ( 'MAINTAINER' ) )
            // InternalDockerFile.g:1735:1: ( 'MAINTAINER' )
            {
            // InternalDockerFile.g:1735:1: ( 'MAINTAINER' )
            // InternalDockerFile.g:1736:2: 'MAINTAINER'
            {
             before(grammarAccess.getMaintainerAccess().getMAINTAINERKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMaintainerAccess().getMAINTAINERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__Group__0__Impl"


    // $ANTLR start "rule__Maintainer__Group__1"
    // InternalDockerFile.g:1745:1: rule__Maintainer__Group__1 : rule__Maintainer__Group__1__Impl ;
    public final void rule__Maintainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1749:1: ( rule__Maintainer__Group__1__Impl )
            // InternalDockerFile.g:1750:2: rule__Maintainer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__Group__1"


    // $ANTLR start "rule__Maintainer__Group__1__Impl"
    // InternalDockerFile.g:1756:1: rule__Maintainer__Group__1__Impl : ( ( rule__Maintainer__NameAssignment_1 ) ) ;
    public final void rule__Maintainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1760:1: ( ( ( rule__Maintainer__NameAssignment_1 ) ) )
            // InternalDockerFile.g:1761:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            {
            // InternalDockerFile.g:1761:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            // InternalDockerFile.g:1762:2: ( rule__Maintainer__NameAssignment_1 )
            {
             before(grammarAccess.getMaintainerAccess().getNameAssignment_1()); 
            // InternalDockerFile.g:1763:2: ( rule__Maintainer__NameAssignment_1 )
            // InternalDockerFile.g:1763:3: rule__Maintainer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__Group__1__Impl"


    // $ANTLR start "rule__Env__Group__0"
    // InternalDockerFile.g:1772:1: rule__Env__Group__0 : rule__Env__Group__0__Impl rule__Env__Group__1 ;
    public final void rule__Env__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1776:1: ( rule__Env__Group__0__Impl rule__Env__Group__1 )
            // InternalDockerFile.g:1777:2: rule__Env__Group__0__Impl rule__Env__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Env__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Env__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__Group__0"


    // $ANTLR start "rule__Env__Group__0__Impl"
    // InternalDockerFile.g:1784:1: rule__Env__Group__0__Impl : ( 'ENV' ) ;
    public final void rule__Env__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1788:1: ( ( 'ENV' ) )
            // InternalDockerFile.g:1789:1: ( 'ENV' )
            {
            // InternalDockerFile.g:1789:1: ( 'ENV' )
            // InternalDockerFile.g:1790:2: 'ENV'
            {
             before(grammarAccess.getEnvAccess().getENVKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnvAccess().getENVKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__Group__0__Impl"


    // $ANTLR start "rule__Env__Group__1"
    // InternalDockerFile.g:1799:1: rule__Env__Group__1 : rule__Env__Group__1__Impl ;
    public final void rule__Env__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1803:1: ( rule__Env__Group__1__Impl )
            // InternalDockerFile.g:1804:2: rule__Env__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Env__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__Group__1"


    // $ANTLR start "rule__Env__Group__1__Impl"
    // InternalDockerFile.g:1810:1: rule__Env__Group__1__Impl : ( ( rule__Env__Alternatives_1 ) ) ;
    public final void rule__Env__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1814:1: ( ( ( rule__Env__Alternatives_1 ) ) )
            // InternalDockerFile.g:1815:1: ( ( rule__Env__Alternatives_1 ) )
            {
            // InternalDockerFile.g:1815:1: ( ( rule__Env__Alternatives_1 ) )
            // InternalDockerFile.g:1816:2: ( rule__Env__Alternatives_1 )
            {
             before(grammarAccess.getEnvAccess().getAlternatives_1()); 
            // InternalDockerFile.g:1817:2: ( rule__Env__Alternatives_1 )
            // InternalDockerFile.g:1817:3: rule__Env__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Env__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__Group__1__Impl"


    // $ANTLR start "rule__Expose__Group__0"
    // InternalDockerFile.g:1826:1: rule__Expose__Group__0 : rule__Expose__Group__0__Impl rule__Expose__Group__1 ;
    public final void rule__Expose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1830:1: ( rule__Expose__Group__0__Impl rule__Expose__Group__1 )
            // InternalDockerFile.g:1831:2: rule__Expose__Group__0__Impl rule__Expose__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Expose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expose__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__Group__0"


    // $ANTLR start "rule__Expose__Group__0__Impl"
    // InternalDockerFile.g:1838:1: rule__Expose__Group__0__Impl : ( 'EXPOSE' ) ;
    public final void rule__Expose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1842:1: ( ( 'EXPOSE' ) )
            // InternalDockerFile.g:1843:1: ( 'EXPOSE' )
            {
            // InternalDockerFile.g:1843:1: ( 'EXPOSE' )
            // InternalDockerFile.g:1844:2: 'EXPOSE'
            {
             before(grammarAccess.getExposeAccess().getEXPOSEKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExposeAccess().getEXPOSEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__Group__0__Impl"


    // $ANTLR start "rule__Expose__Group__1"
    // InternalDockerFile.g:1853:1: rule__Expose__Group__1 : rule__Expose__Group__1__Impl ;
    public final void rule__Expose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1857:1: ( rule__Expose__Group__1__Impl )
            // InternalDockerFile.g:1858:2: rule__Expose__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expose__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__Group__1"


    // $ANTLR start "rule__Expose__Group__1__Impl"
    // InternalDockerFile.g:1864:1: rule__Expose__Group__1__Impl : ( ( rule__Expose__PortsAssignment_1 ) ) ;
    public final void rule__Expose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1868:1: ( ( ( rule__Expose__PortsAssignment_1 ) ) )
            // InternalDockerFile.g:1869:1: ( ( rule__Expose__PortsAssignment_1 ) )
            {
            // InternalDockerFile.g:1869:1: ( ( rule__Expose__PortsAssignment_1 ) )
            // InternalDockerFile.g:1870:2: ( rule__Expose__PortsAssignment_1 )
            {
             before(grammarAccess.getExposeAccess().getPortsAssignment_1()); 
            // InternalDockerFile.g:1871:2: ( rule__Expose__PortsAssignment_1 )
            // InternalDockerFile.g:1871:3: rule__Expose__PortsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expose__PortsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExposeAccess().getPortsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__Group__1__Impl"


    // $ANTLR start "rule__JSON_ARRAY__Group__0"
    // InternalDockerFile.g:1880:1: rule__JSON_ARRAY__Group__0 : rule__JSON_ARRAY__Group__0__Impl rule__JSON_ARRAY__Group__1 ;
    public final void rule__JSON_ARRAY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1884:1: ( rule__JSON_ARRAY__Group__0__Impl rule__JSON_ARRAY__Group__1 )
            // InternalDockerFile.g:1885:2: rule__JSON_ARRAY__Group__0__Impl rule__JSON_ARRAY__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__JSON_ARRAY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_ARRAY__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__Group__0"


    // $ANTLR start "rule__JSON_ARRAY__Group__0__Impl"
    // InternalDockerFile.g:1892:1: rule__JSON_ARRAY__Group__0__Impl : ( '[' ) ;
    public final void rule__JSON_ARRAY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1896:1: ( ( '[' ) )
            // InternalDockerFile.g:1897:1: ( '[' )
            {
            // InternalDockerFile.g:1897:1: ( '[' )
            // InternalDockerFile.g:1898:2: '['
            {
             before(grammarAccess.getJSON_ARRAYAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJSON_ARRAYAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__Group__0__Impl"


    // $ANTLR start "rule__JSON_ARRAY__Group__1"
    // InternalDockerFile.g:1907:1: rule__JSON_ARRAY__Group__1 : rule__JSON_ARRAY__Group__1__Impl rule__JSON_ARRAY__Group__2 ;
    public final void rule__JSON_ARRAY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1911:1: ( rule__JSON_ARRAY__Group__1__Impl rule__JSON_ARRAY__Group__2 )
            // InternalDockerFile.g:1912:2: rule__JSON_ARRAY__Group__1__Impl rule__JSON_ARRAY__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__JSON_ARRAY__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_ARRAY__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__Group__1"


    // $ANTLR start "rule__JSON_ARRAY__Group__1__Impl"
    // InternalDockerFile.g:1919:1: rule__JSON_ARRAY__Group__1__Impl : ( ( rule__JSON_ARRAY__HeadAssignment_1 ) ) ;
    public final void rule__JSON_ARRAY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1923:1: ( ( ( rule__JSON_ARRAY__HeadAssignment_1 ) ) )
            // InternalDockerFile.g:1924:1: ( ( rule__JSON_ARRAY__HeadAssignment_1 ) )
            {
            // InternalDockerFile.g:1924:1: ( ( rule__JSON_ARRAY__HeadAssignment_1 ) )
            // InternalDockerFile.g:1925:2: ( rule__JSON_ARRAY__HeadAssignment_1 )
            {
             before(grammarAccess.getJSON_ARRAYAccess().getHeadAssignment_1()); 
            // InternalDockerFile.g:1926:2: ( rule__JSON_ARRAY__HeadAssignment_1 )
            // InternalDockerFile.g:1926:3: rule__JSON_ARRAY__HeadAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JSON_ARRAY__HeadAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ARRAYAccess().getHeadAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__Group__1__Impl"


    // $ANTLR start "rule__JSON_ARRAY__Group__2"
    // InternalDockerFile.g:1934:1: rule__JSON_ARRAY__Group__2 : rule__JSON_ARRAY__Group__2__Impl rule__JSON_ARRAY__Group__3 ;
    public final void rule__JSON_ARRAY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1938:1: ( rule__JSON_ARRAY__Group__2__Impl rule__JSON_ARRAY__Group__3 )
            // InternalDockerFile.g:1939:2: rule__JSON_ARRAY__Group__2__Impl rule__JSON_ARRAY__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__JSON_ARRAY__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_ARRAY__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__Group__2"


    // $ANTLR start "rule__JSON_ARRAY__Group__2__Impl"
    // InternalDockerFile.g:1946:1: rule__JSON_ARRAY__Group__2__Impl : ( ( rule__JSON_ARRAY__TailAssignment_2 )* ) ;
    public final void rule__JSON_ARRAY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1950:1: ( ( ( rule__JSON_ARRAY__TailAssignment_2 )* ) )
            // InternalDockerFile.g:1951:1: ( ( rule__JSON_ARRAY__TailAssignment_2 )* )
            {
            // InternalDockerFile.g:1951:1: ( ( rule__JSON_ARRAY__TailAssignment_2 )* )
            // InternalDockerFile.g:1952:2: ( rule__JSON_ARRAY__TailAssignment_2 )*
            {
             before(grammarAccess.getJSON_ARRAYAccess().getTailAssignment_2()); 
            // InternalDockerFile.g:1953:2: ( rule__JSON_ARRAY__TailAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDockerFile.g:1953:3: rule__JSON_ARRAY__TailAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__JSON_ARRAY__TailAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getJSON_ARRAYAccess().getTailAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__Group__2__Impl"


    // $ANTLR start "rule__JSON_ARRAY__Group__3"
    // InternalDockerFile.g:1961:1: rule__JSON_ARRAY__Group__3 : rule__JSON_ARRAY__Group__3__Impl ;
    public final void rule__JSON_ARRAY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1965:1: ( rule__JSON_ARRAY__Group__3__Impl )
            // InternalDockerFile.g:1966:2: rule__JSON_ARRAY__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSON_ARRAY__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__Group__3"


    // $ANTLR start "rule__JSON_ARRAY__Group__3__Impl"
    // InternalDockerFile.g:1972:1: rule__JSON_ARRAY__Group__3__Impl : ( ']' ) ;
    public final void rule__JSON_ARRAY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1976:1: ( ( ']' ) )
            // InternalDockerFile.g:1977:1: ( ']' )
            {
            // InternalDockerFile.g:1977:1: ( ']' )
            // InternalDockerFile.g:1978:2: ']'
            {
             before(grammarAccess.getJSON_ARRAYAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getJSON_ARRAYAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__Group__3__Impl"


    // $ANTLR start "rule__EnvWithSpace__Group__0"
    // InternalDockerFile.g:1988:1: rule__EnvWithSpace__Group__0 : rule__EnvWithSpace__Group__0__Impl rule__EnvWithSpace__Group__1 ;
    public final void rule__EnvWithSpace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:1992:1: ( rule__EnvWithSpace__Group__0__Impl rule__EnvWithSpace__Group__1 )
            // InternalDockerFile.g:1993:2: rule__EnvWithSpace__Group__0__Impl rule__EnvWithSpace__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EnvWithSpace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvWithSpace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithSpace__Group__0"


    // $ANTLR start "rule__EnvWithSpace__Group__0__Impl"
    // InternalDockerFile.g:2000:1: rule__EnvWithSpace__Group__0__Impl : ( ( rule__EnvWithSpace__KeyAssignment_0 ) ) ;
    public final void rule__EnvWithSpace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2004:1: ( ( ( rule__EnvWithSpace__KeyAssignment_0 ) ) )
            // InternalDockerFile.g:2005:1: ( ( rule__EnvWithSpace__KeyAssignment_0 ) )
            {
            // InternalDockerFile.g:2005:1: ( ( rule__EnvWithSpace__KeyAssignment_0 ) )
            // InternalDockerFile.g:2006:2: ( rule__EnvWithSpace__KeyAssignment_0 )
            {
             before(grammarAccess.getEnvWithSpaceAccess().getKeyAssignment_0()); 
            // InternalDockerFile.g:2007:2: ( rule__EnvWithSpace__KeyAssignment_0 )
            // InternalDockerFile.g:2007:3: rule__EnvWithSpace__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnvWithSpace__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnvWithSpaceAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithSpace__Group__0__Impl"


    // $ANTLR start "rule__EnvWithSpace__Group__1"
    // InternalDockerFile.g:2015:1: rule__EnvWithSpace__Group__1 : rule__EnvWithSpace__Group__1__Impl ;
    public final void rule__EnvWithSpace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2019:1: ( rule__EnvWithSpace__Group__1__Impl )
            // InternalDockerFile.g:2020:2: rule__EnvWithSpace__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvWithSpace__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithSpace__Group__1"


    // $ANTLR start "rule__EnvWithSpace__Group__1__Impl"
    // InternalDockerFile.g:2026:1: rule__EnvWithSpace__Group__1__Impl : ( ( rule__EnvWithSpace__ValueAssignment_1 ) ) ;
    public final void rule__EnvWithSpace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2030:1: ( ( ( rule__EnvWithSpace__ValueAssignment_1 ) ) )
            // InternalDockerFile.g:2031:1: ( ( rule__EnvWithSpace__ValueAssignment_1 ) )
            {
            // InternalDockerFile.g:2031:1: ( ( rule__EnvWithSpace__ValueAssignment_1 ) )
            // InternalDockerFile.g:2032:2: ( rule__EnvWithSpace__ValueAssignment_1 )
            {
             before(grammarAccess.getEnvWithSpaceAccess().getValueAssignment_1()); 
            // InternalDockerFile.g:2033:2: ( rule__EnvWithSpace__ValueAssignment_1 )
            // InternalDockerFile.g:2033:3: rule__EnvWithSpace__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvWithSpace__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvWithSpaceAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithSpace__Group__1__Impl"


    // $ANTLR start "rule__EnvWithEqual__Group__0"
    // InternalDockerFile.g:2042:1: rule__EnvWithEqual__Group__0 : rule__EnvWithEqual__Group__0__Impl rule__EnvWithEqual__Group__1 ;
    public final void rule__EnvWithEqual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2046:1: ( rule__EnvWithEqual__Group__0__Impl rule__EnvWithEqual__Group__1 )
            // InternalDockerFile.g:2047:2: rule__EnvWithEqual__Group__0__Impl rule__EnvWithEqual__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EnvWithEqual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvWithEqual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithEqual__Group__0"


    // $ANTLR start "rule__EnvWithEqual__Group__0__Impl"
    // InternalDockerFile.g:2054:1: rule__EnvWithEqual__Group__0__Impl : ( ( rule__EnvWithEqual__KeyAssignment_0 ) ) ;
    public final void rule__EnvWithEqual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2058:1: ( ( ( rule__EnvWithEqual__KeyAssignment_0 ) ) )
            // InternalDockerFile.g:2059:1: ( ( rule__EnvWithEqual__KeyAssignment_0 ) )
            {
            // InternalDockerFile.g:2059:1: ( ( rule__EnvWithEqual__KeyAssignment_0 ) )
            // InternalDockerFile.g:2060:2: ( rule__EnvWithEqual__KeyAssignment_0 )
            {
             before(grammarAccess.getEnvWithEqualAccess().getKeyAssignment_0()); 
            // InternalDockerFile.g:2061:2: ( rule__EnvWithEqual__KeyAssignment_0 )
            // InternalDockerFile.g:2061:3: rule__EnvWithEqual__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnvWithEqual__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnvWithEqualAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithEqual__Group__0__Impl"


    // $ANTLR start "rule__EnvWithEqual__Group__1"
    // InternalDockerFile.g:2069:1: rule__EnvWithEqual__Group__1 : rule__EnvWithEqual__Group__1__Impl ;
    public final void rule__EnvWithEqual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2073:1: ( rule__EnvWithEqual__Group__1__Impl )
            // InternalDockerFile.g:2074:2: rule__EnvWithEqual__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvWithEqual__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithEqual__Group__1"


    // $ANTLR start "rule__EnvWithEqual__Group__1__Impl"
    // InternalDockerFile.g:2080:1: rule__EnvWithEqual__Group__1__Impl : ( ( rule__EnvWithEqual__ValueAssignment_1 ) ) ;
    public final void rule__EnvWithEqual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2084:1: ( ( ( rule__EnvWithEqual__ValueAssignment_1 ) ) )
            // InternalDockerFile.g:2085:1: ( ( rule__EnvWithEqual__ValueAssignment_1 ) )
            {
            // InternalDockerFile.g:2085:1: ( ( rule__EnvWithEqual__ValueAssignment_1 ) )
            // InternalDockerFile.g:2086:2: ( rule__EnvWithEqual__ValueAssignment_1 )
            {
             before(grammarAccess.getEnvWithEqualAccess().getValueAssignment_1()); 
            // InternalDockerFile.g:2087:2: ( rule__EnvWithEqual__ValueAssignment_1 )
            // InternalDockerFile.g:2087:3: rule__EnvWithEqual__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvWithEqual__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvWithEqualAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithEqual__Group__1__Impl"


    // $ANTLR start "rule__Workdir__Group__0"
    // InternalDockerFile.g:2096:1: rule__Workdir__Group__0 : rule__Workdir__Group__0__Impl rule__Workdir__Group__1 ;
    public final void rule__Workdir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2100:1: ( rule__Workdir__Group__0__Impl rule__Workdir__Group__1 )
            // InternalDockerFile.g:2101:2: rule__Workdir__Group__0__Impl rule__Workdir__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Workdir__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workdir__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__Group__0"


    // $ANTLR start "rule__Workdir__Group__0__Impl"
    // InternalDockerFile.g:2108:1: rule__Workdir__Group__0__Impl : ( 'WORKDIR' ) ;
    public final void rule__Workdir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2112:1: ( ( 'WORKDIR' ) )
            // InternalDockerFile.g:2113:1: ( 'WORKDIR' )
            {
            // InternalDockerFile.g:2113:1: ( 'WORKDIR' )
            // InternalDockerFile.g:2114:2: 'WORKDIR'
            {
             before(grammarAccess.getWorkdirAccess().getWORKDIRKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWorkdirAccess().getWORKDIRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__Group__0__Impl"


    // $ANTLR start "rule__Workdir__Group__1"
    // InternalDockerFile.g:2123:1: rule__Workdir__Group__1 : rule__Workdir__Group__1__Impl ;
    public final void rule__Workdir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2127:1: ( rule__Workdir__Group__1__Impl )
            // InternalDockerFile.g:2128:2: rule__Workdir__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__Group__1"


    // $ANTLR start "rule__Workdir__Group__1__Impl"
    // InternalDockerFile.g:2134:1: rule__Workdir__Group__1__Impl : ( ( rule__Workdir__PathAssignment_1 ) ) ;
    public final void rule__Workdir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2138:1: ( ( ( rule__Workdir__PathAssignment_1 ) ) )
            // InternalDockerFile.g:2139:1: ( ( rule__Workdir__PathAssignment_1 ) )
            {
            // InternalDockerFile.g:2139:1: ( ( rule__Workdir__PathAssignment_1 ) )
            // InternalDockerFile.g:2140:2: ( rule__Workdir__PathAssignment_1 )
            {
             before(grammarAccess.getWorkdirAccess().getPathAssignment_1()); 
            // InternalDockerFile.g:2141:2: ( rule__Workdir__PathAssignment_1 )
            // InternalDockerFile.g:2141:3: rule__Workdir__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkdirAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__Group__1__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // InternalDockerFile.g:2150:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2154:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalDockerFile.g:2155:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalDockerFile.g:2162:1: rule__Add__Group__0__Impl : ( 'ADD' ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2166:1: ( ( 'ADD' ) )
            // InternalDockerFile.g:2167:1: ( 'ADD' )
            {
            // InternalDockerFile.g:2167:1: ( 'ADD' )
            // InternalDockerFile.g:2168:2: 'ADD'
            {
             before(grammarAccess.getAddAccess().getADDKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getADDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalDockerFile.g:2177:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2181:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalDockerFile.g:2182:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Add__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalDockerFile.g:2189:1: rule__Add__Group__1__Impl : ( ( rule__Add__Source_leftAssignment_1 ) ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2193:1: ( ( ( rule__Add__Source_leftAssignment_1 ) ) )
            // InternalDockerFile.g:2194:1: ( ( rule__Add__Source_leftAssignment_1 ) )
            {
            // InternalDockerFile.g:2194:1: ( ( rule__Add__Source_leftAssignment_1 ) )
            // InternalDockerFile.g:2195:2: ( rule__Add__Source_leftAssignment_1 )
            {
             before(grammarAccess.getAddAccess().getSource_leftAssignment_1()); 
            // InternalDockerFile.g:2196:2: ( rule__Add__Source_leftAssignment_1 )
            // InternalDockerFile.g:2196:3: rule__Add__Source_leftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__Source_leftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getSource_leftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Add__Group__2"
    // InternalDockerFile.g:2204:1: rule__Add__Group__2 : rule__Add__Group__2__Impl ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2208:1: ( rule__Add__Group__2__Impl )
            // InternalDockerFile.g:2209:2: rule__Add__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__2"


    // $ANTLR start "rule__Add__Group__2__Impl"
    // InternalDockerFile.g:2215:1: rule__Add__Group__2__Impl : ( ( rule__Add__DestAssignment_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2219:1: ( ( ( rule__Add__DestAssignment_2 ) ) )
            // InternalDockerFile.g:2220:1: ( ( rule__Add__DestAssignment_2 ) )
            {
            // InternalDockerFile.g:2220:1: ( ( rule__Add__DestAssignment_2 ) )
            // InternalDockerFile.g:2221:2: ( rule__Add__DestAssignment_2 )
            {
             before(grammarAccess.getAddAccess().getDestAssignment_2()); 
            // InternalDockerFile.g:2222:2: ( rule__Add__DestAssignment_2 )
            // InternalDockerFile.g:2222:3: rule__Add__DestAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Add__DestAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getDestAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__2__Impl"


    // $ANTLR start "rule__Run__Group_0__0"
    // InternalDockerFile.g:2231:1: rule__Run__Group_0__0 : rule__Run__Group_0__0__Impl rule__Run__Group_0__1 ;
    public final void rule__Run__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2235:1: ( rule__Run__Group_0__0__Impl rule__Run__Group_0__1 )
            // InternalDockerFile.g:2236:2: rule__Run__Group_0__0__Impl rule__Run__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Run__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Run__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Group_0__0"


    // $ANTLR start "rule__Run__Group_0__0__Impl"
    // InternalDockerFile.g:2243:1: rule__Run__Group_0__0__Impl : ( 'RUN' ) ;
    public final void rule__Run__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2247:1: ( ( 'RUN' ) )
            // InternalDockerFile.g:2248:1: ( 'RUN' )
            {
            // InternalDockerFile.g:2248:1: ( 'RUN' )
            // InternalDockerFile.g:2249:2: 'RUN'
            {
             before(grammarAccess.getRunAccess().getRUNKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRunAccess().getRUNKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Group_0__0__Impl"


    // $ANTLR start "rule__Run__Group_0__1"
    // InternalDockerFile.g:2258:1: rule__Run__Group_0__1 : rule__Run__Group_0__1__Impl ;
    public final void rule__Run__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2262:1: ( rule__Run__Group_0__1__Impl )
            // InternalDockerFile.g:2263:2: rule__Run__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Run__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Group_0__1"


    // $ANTLR start "rule__Run__Group_0__1__Impl"
    // InternalDockerFile.g:2269:1: rule__Run__Group_0__1__Impl : ( ruleRunWithShell ) ;
    public final void rule__Run__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2273:1: ( ( ruleRunWithShell ) )
            // InternalDockerFile.g:2274:1: ( ruleRunWithShell )
            {
            // InternalDockerFile.g:2274:1: ( ruleRunWithShell )
            // InternalDockerFile.g:2275:2: ruleRunWithShell
            {
             before(grammarAccess.getRunAccess().getRunWithShellParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleRunWithShell();

            state._fsp--;

             after(grammarAccess.getRunAccess().getRunWithShellParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Group_0__1__Impl"


    // $ANTLR start "rule__RunWithNoShell__Group__0"
    // InternalDockerFile.g:2285:1: rule__RunWithNoShell__Group__0 : rule__RunWithNoShell__Group__0__Impl rule__RunWithNoShell__Group__1 ;
    public final void rule__RunWithNoShell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2289:1: ( rule__RunWithNoShell__Group__0__Impl rule__RunWithNoShell__Group__1 )
            // InternalDockerFile.g:2290:2: rule__RunWithNoShell__Group__0__Impl rule__RunWithNoShell__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RunWithNoShell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunWithNoShell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__Group__0"


    // $ANTLR start "rule__RunWithNoShell__Group__0__Impl"
    // InternalDockerFile.g:2297:1: rule__RunWithNoShell__Group__0__Impl : ( '[' ) ;
    public final void rule__RunWithNoShell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2301:1: ( ( '[' ) )
            // InternalDockerFile.g:2302:1: ( '[' )
            {
            // InternalDockerFile.g:2302:1: ( '[' )
            // InternalDockerFile.g:2303:2: '['
            {
             before(grammarAccess.getRunWithNoShellAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRunWithNoShellAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__Group__0__Impl"


    // $ANTLR start "rule__RunWithNoShell__Group__1"
    // InternalDockerFile.g:2312:1: rule__RunWithNoShell__Group__1 : rule__RunWithNoShell__Group__1__Impl rule__RunWithNoShell__Group__2 ;
    public final void rule__RunWithNoShell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2316:1: ( rule__RunWithNoShell__Group__1__Impl rule__RunWithNoShell__Group__2 )
            // InternalDockerFile.g:2317:2: rule__RunWithNoShell__Group__1__Impl rule__RunWithNoShell__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RunWithNoShell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunWithNoShell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__Group__1"


    // $ANTLR start "rule__RunWithNoShell__Group__1__Impl"
    // InternalDockerFile.g:2324:1: rule__RunWithNoShell__Group__1__Impl : ( ( rule__RunWithNoShell__ExecutableAssignment_1 ) ) ;
    public final void rule__RunWithNoShell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2328:1: ( ( ( rule__RunWithNoShell__ExecutableAssignment_1 ) ) )
            // InternalDockerFile.g:2329:1: ( ( rule__RunWithNoShell__ExecutableAssignment_1 ) )
            {
            // InternalDockerFile.g:2329:1: ( ( rule__RunWithNoShell__ExecutableAssignment_1 ) )
            // InternalDockerFile.g:2330:2: ( rule__RunWithNoShell__ExecutableAssignment_1 )
            {
             before(grammarAccess.getRunWithNoShellAccess().getExecutableAssignment_1()); 
            // InternalDockerFile.g:2331:2: ( rule__RunWithNoShell__ExecutableAssignment_1 )
            // InternalDockerFile.g:2331:3: rule__RunWithNoShell__ExecutableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RunWithNoShell__ExecutableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRunWithNoShellAccess().getExecutableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__Group__1__Impl"


    // $ANTLR start "rule__RunWithNoShell__Group__2"
    // InternalDockerFile.g:2339:1: rule__RunWithNoShell__Group__2 : rule__RunWithNoShell__Group__2__Impl rule__RunWithNoShell__Group__3 ;
    public final void rule__RunWithNoShell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2343:1: ( rule__RunWithNoShell__Group__2__Impl rule__RunWithNoShell__Group__3 )
            // InternalDockerFile.g:2344:2: rule__RunWithNoShell__Group__2__Impl rule__RunWithNoShell__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RunWithNoShell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunWithNoShell__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__Group__2"


    // $ANTLR start "rule__RunWithNoShell__Group__2__Impl"
    // InternalDockerFile.g:2351:1: rule__RunWithNoShell__Group__2__Impl : ( ( rule__RunWithNoShell__ParamsAssignment_2 )* ) ;
    public final void rule__RunWithNoShell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2355:1: ( ( ( rule__RunWithNoShell__ParamsAssignment_2 )* ) )
            // InternalDockerFile.g:2356:1: ( ( rule__RunWithNoShell__ParamsAssignment_2 )* )
            {
            // InternalDockerFile.g:2356:1: ( ( rule__RunWithNoShell__ParamsAssignment_2 )* )
            // InternalDockerFile.g:2357:2: ( rule__RunWithNoShell__ParamsAssignment_2 )*
            {
             before(grammarAccess.getRunWithNoShellAccess().getParamsAssignment_2()); 
            // InternalDockerFile.g:2358:2: ( rule__RunWithNoShell__ParamsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDockerFile.g:2358:3: rule__RunWithNoShell__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__RunWithNoShell__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRunWithNoShellAccess().getParamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__Group__2__Impl"


    // $ANTLR start "rule__RunWithNoShell__Group__3"
    // InternalDockerFile.g:2366:1: rule__RunWithNoShell__Group__3 : rule__RunWithNoShell__Group__3__Impl ;
    public final void rule__RunWithNoShell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2370:1: ( rule__RunWithNoShell__Group__3__Impl )
            // InternalDockerFile.g:2371:2: rule__RunWithNoShell__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RunWithNoShell__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__Group__3"


    // $ANTLR start "rule__RunWithNoShell__Group__3__Impl"
    // InternalDockerFile.g:2377:1: rule__RunWithNoShell__Group__3__Impl : ( ']' ) ;
    public final void rule__RunWithNoShell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2381:1: ( ( ']' ) )
            // InternalDockerFile.g:2382:1: ( ']' )
            {
            // InternalDockerFile.g:2382:1: ( ']' )
            // InternalDockerFile.g:2383:2: ']'
            {
             before(grammarAccess.getRunWithNoShellAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRunWithNoShellAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__Group__3__Impl"


    // $ANTLR start "rule__STRING_PREFIXED_WITH_COMMA__Group__0"
    // InternalDockerFile.g:2393:1: rule__STRING_PREFIXED_WITH_COMMA__Group__0 : rule__STRING_PREFIXED_WITH_COMMA__Group__0__Impl rule__STRING_PREFIXED_WITH_COMMA__Group__1 ;
    public final void rule__STRING_PREFIXED_WITH_COMMA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2397:1: ( rule__STRING_PREFIXED_WITH_COMMA__Group__0__Impl rule__STRING_PREFIXED_WITH_COMMA__Group__1 )
            // InternalDockerFile.g:2398:2: rule__STRING_PREFIXED_WITH_COMMA__Group__0__Impl rule__STRING_PREFIXED_WITH_COMMA__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__STRING_PREFIXED_WITH_COMMA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STRING_PREFIXED_WITH_COMMA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STRING_PREFIXED_WITH_COMMA__Group__0"


    // $ANTLR start "rule__STRING_PREFIXED_WITH_COMMA__Group__0__Impl"
    // InternalDockerFile.g:2405:1: rule__STRING_PREFIXED_WITH_COMMA__Group__0__Impl : ( ',' ) ;
    public final void rule__STRING_PREFIXED_WITH_COMMA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2409:1: ( ( ',' ) )
            // InternalDockerFile.g:2410:1: ( ',' )
            {
            // InternalDockerFile.g:2410:1: ( ',' )
            // InternalDockerFile.g:2411:2: ','
            {
             before(grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getCommaKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STRING_PREFIXED_WITH_COMMA__Group__0__Impl"


    // $ANTLR start "rule__STRING_PREFIXED_WITH_COMMA__Group__1"
    // InternalDockerFile.g:2420:1: rule__STRING_PREFIXED_WITH_COMMA__Group__1 : rule__STRING_PREFIXED_WITH_COMMA__Group__1__Impl ;
    public final void rule__STRING_PREFIXED_WITH_COMMA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2424:1: ( rule__STRING_PREFIXED_WITH_COMMA__Group__1__Impl )
            // InternalDockerFile.g:2425:2: rule__STRING_PREFIXED_WITH_COMMA__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__STRING_PREFIXED_WITH_COMMA__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STRING_PREFIXED_WITH_COMMA__Group__1"


    // $ANTLR start "rule__STRING_PREFIXED_WITH_COMMA__Group__1__Impl"
    // InternalDockerFile.g:2431:1: rule__STRING_PREFIXED_WITH_COMMA__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__STRING_PREFIXED_WITH_COMMA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2435:1: ( ( RULE_STRING ) )
            // InternalDockerFile.g:2436:1: ( RULE_STRING )
            {
            // InternalDockerFile.g:2436:1: ( RULE_STRING )
            // InternalDockerFile.g:2437:2: RULE_STRING
            {
             before(grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STRING_PREFIXED_WITH_COMMA__Group__1__Impl"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group__0"
    // InternalDockerFile.g:2447:1: rule__VALID_RELATIVE_PATH__Group__0 : rule__VALID_RELATIVE_PATH__Group__0__Impl rule__VALID_RELATIVE_PATH__Group__1 ;
    public final void rule__VALID_RELATIVE_PATH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2451:1: ( rule__VALID_RELATIVE_PATH__Group__0__Impl rule__VALID_RELATIVE_PATH__Group__1 )
            // InternalDockerFile.g:2452:2: rule__VALID_RELATIVE_PATH__Group__0__Impl rule__VALID_RELATIVE_PATH__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__VALID_RELATIVE_PATH__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VALID_RELATIVE_PATH__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group__0"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group__0__Impl"
    // InternalDockerFile.g:2459:1: rule__VALID_RELATIVE_PATH__Group__0__Impl : ( ( rule__VALID_RELATIVE_PATH__Group_0__0 ) ) ;
    public final void rule__VALID_RELATIVE_PATH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2463:1: ( ( ( rule__VALID_RELATIVE_PATH__Group_0__0 ) ) )
            // InternalDockerFile.g:2464:1: ( ( rule__VALID_RELATIVE_PATH__Group_0__0 ) )
            {
            // InternalDockerFile.g:2464:1: ( ( rule__VALID_RELATIVE_PATH__Group_0__0 ) )
            // InternalDockerFile.g:2465:2: ( rule__VALID_RELATIVE_PATH__Group_0__0 )
            {
             before(grammarAccess.getVALID_RELATIVE_PATHAccess().getGroup_0()); 
            // InternalDockerFile.g:2466:2: ( rule__VALID_RELATIVE_PATH__Group_0__0 )
            // InternalDockerFile.g:2466:3: rule__VALID_RELATIVE_PATH__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__VALID_RELATIVE_PATH__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getVALID_RELATIVE_PATHAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group__0__Impl"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group__1"
    // InternalDockerFile.g:2474:1: rule__VALID_RELATIVE_PATH__Group__1 : rule__VALID_RELATIVE_PATH__Group__1__Impl ;
    public final void rule__VALID_RELATIVE_PATH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2478:1: ( rule__VALID_RELATIVE_PATH__Group__1__Impl )
            // InternalDockerFile.g:2479:2: rule__VALID_RELATIVE_PATH__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALID_RELATIVE_PATH__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group__1"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group__1__Impl"
    // InternalDockerFile.g:2485:1: rule__VALID_RELATIVE_PATH__Group__1__Impl : ( ( '*' )? ) ;
    public final void rule__VALID_RELATIVE_PATH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2489:1: ( ( ( '*' )? ) )
            // InternalDockerFile.g:2490:1: ( ( '*' )? )
            {
            // InternalDockerFile.g:2490:1: ( ( '*' )? )
            // InternalDockerFile.g:2491:2: ( '*' )?
            {
             before(grammarAccess.getVALID_RELATIVE_PATHAccess().getAsteriskKeyword_1()); 
            // InternalDockerFile.g:2492:2: ( '*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDockerFile.g:2492:3: '*'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVALID_RELATIVE_PATHAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group__1__Impl"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group_0__0"
    // InternalDockerFile.g:2501:1: rule__VALID_RELATIVE_PATH__Group_0__0 : rule__VALID_RELATIVE_PATH__Group_0__0__Impl rule__VALID_RELATIVE_PATH__Group_0__1 ;
    public final void rule__VALID_RELATIVE_PATH__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2505:1: ( rule__VALID_RELATIVE_PATH__Group_0__0__Impl rule__VALID_RELATIVE_PATH__Group_0__1 )
            // InternalDockerFile.g:2506:2: rule__VALID_RELATIVE_PATH__Group_0__0__Impl rule__VALID_RELATIVE_PATH__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__VALID_RELATIVE_PATH__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VALID_RELATIVE_PATH__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group_0__0"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group_0__0__Impl"
    // InternalDockerFile.g:2513:1: rule__VALID_RELATIVE_PATH__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__VALID_RELATIVE_PATH__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2517:1: ( ( RULE_ID ) )
            // InternalDockerFile.g:2518:1: ( RULE_ID )
            {
            // InternalDockerFile.g:2518:1: ( RULE_ID )
            // InternalDockerFile.g:2519:2: RULE_ID
            {
             before(grammarAccess.getVALID_RELATIVE_PATHAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVALID_RELATIVE_PATHAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group_0__0__Impl"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group_0__1"
    // InternalDockerFile.g:2528:1: rule__VALID_RELATIVE_PATH__Group_0__1 : rule__VALID_RELATIVE_PATH__Group_0__1__Impl ;
    public final void rule__VALID_RELATIVE_PATH__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2532:1: ( rule__VALID_RELATIVE_PATH__Group_0__1__Impl )
            // InternalDockerFile.g:2533:2: rule__VALID_RELATIVE_PATH__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALID_RELATIVE_PATH__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group_0__1"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group_0__1__Impl"
    // InternalDockerFile.g:2539:1: rule__VALID_RELATIVE_PATH__Group_0__1__Impl : ( ( rule__VALID_RELATIVE_PATH__Group_0_1__0 )* ) ;
    public final void rule__VALID_RELATIVE_PATH__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2543:1: ( ( ( rule__VALID_RELATIVE_PATH__Group_0_1__0 )* ) )
            // InternalDockerFile.g:2544:1: ( ( rule__VALID_RELATIVE_PATH__Group_0_1__0 )* )
            {
            // InternalDockerFile.g:2544:1: ( ( rule__VALID_RELATIVE_PATH__Group_0_1__0 )* )
            // InternalDockerFile.g:2545:2: ( rule__VALID_RELATIVE_PATH__Group_0_1__0 )*
            {
             before(grammarAccess.getVALID_RELATIVE_PATHAccess().getGroup_0_1()); 
            // InternalDockerFile.g:2546:2: ( rule__VALID_RELATIVE_PATH__Group_0_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDockerFile.g:2546:3: rule__VALID_RELATIVE_PATH__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__VALID_RELATIVE_PATH__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getVALID_RELATIVE_PATHAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group_0__1__Impl"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group_0_1__0"
    // InternalDockerFile.g:2555:1: rule__VALID_RELATIVE_PATH__Group_0_1__0 : rule__VALID_RELATIVE_PATH__Group_0_1__0__Impl rule__VALID_RELATIVE_PATH__Group_0_1__1 ;
    public final void rule__VALID_RELATIVE_PATH__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2559:1: ( rule__VALID_RELATIVE_PATH__Group_0_1__0__Impl rule__VALID_RELATIVE_PATH__Group_0_1__1 )
            // InternalDockerFile.g:2560:2: rule__VALID_RELATIVE_PATH__Group_0_1__0__Impl rule__VALID_RELATIVE_PATH__Group_0_1__1
            {
            pushFollow(FOLLOW_8);
            rule__VALID_RELATIVE_PATH__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VALID_RELATIVE_PATH__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group_0_1__0"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group_0_1__0__Impl"
    // InternalDockerFile.g:2567:1: rule__VALID_RELATIVE_PATH__Group_0_1__0__Impl : ( '/' ) ;
    public final void rule__VALID_RELATIVE_PATH__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2571:1: ( ( '/' ) )
            // InternalDockerFile.g:2572:1: ( '/' )
            {
            // InternalDockerFile.g:2572:1: ( '/' )
            // InternalDockerFile.g:2573:2: '/'
            {
             before(grammarAccess.getVALID_RELATIVE_PATHAccess().getSolidusKeyword_0_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVALID_RELATIVE_PATHAccess().getSolidusKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group_0_1__0__Impl"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group_0_1__1"
    // InternalDockerFile.g:2582:1: rule__VALID_RELATIVE_PATH__Group_0_1__1 : rule__VALID_RELATIVE_PATH__Group_0_1__1__Impl ;
    public final void rule__VALID_RELATIVE_PATH__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2586:1: ( rule__VALID_RELATIVE_PATH__Group_0_1__1__Impl )
            // InternalDockerFile.g:2587:2: rule__VALID_RELATIVE_PATH__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALID_RELATIVE_PATH__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group_0_1__1"


    // $ANTLR start "rule__VALID_RELATIVE_PATH__Group_0_1__1__Impl"
    // InternalDockerFile.g:2593:1: rule__VALID_RELATIVE_PATH__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__VALID_RELATIVE_PATH__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2597:1: ( ( RULE_ID ) )
            // InternalDockerFile.g:2598:1: ( RULE_ID )
            {
            // InternalDockerFile.g:2598:1: ( RULE_ID )
            // InternalDockerFile.g:2599:2: RULE_ID
            {
             before(grammarAccess.getVALID_RELATIVE_PATHAccess().getIDTerminalRuleCall_0_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVALID_RELATIVE_PATHAccess().getIDTerminalRuleCall_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_RELATIVE_PATH__Group_0_1__1__Impl"


    // $ANTLR start "rule__VALID_URL__Group__0"
    // InternalDockerFile.g:2609:1: rule__VALID_URL__Group__0 : rule__VALID_URL__Group__0__Impl rule__VALID_URL__Group__1 ;
    public final void rule__VALID_URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2613:1: ( rule__VALID_URL__Group__0__Impl rule__VALID_URL__Group__1 )
            // InternalDockerFile.g:2614:2: rule__VALID_URL__Group__0__Impl rule__VALID_URL__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VALID_URL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VALID_URL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group__0"


    // $ANTLR start "rule__VALID_URL__Group__0__Impl"
    // InternalDockerFile.g:2621:1: rule__VALID_URL__Group__0__Impl : ( 'http://' ) ;
    public final void rule__VALID_URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2625:1: ( ( 'http://' ) )
            // InternalDockerFile.g:2626:1: ( 'http://' )
            {
            // InternalDockerFile.g:2626:1: ( 'http://' )
            // InternalDockerFile.g:2627:2: 'http://'
            {
             before(grammarAccess.getVALID_URLAccess().getHttpKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVALID_URLAccess().getHttpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group__0__Impl"


    // $ANTLR start "rule__VALID_URL__Group__1"
    // InternalDockerFile.g:2636:1: rule__VALID_URL__Group__1 : rule__VALID_URL__Group__1__Impl rule__VALID_URL__Group__2 ;
    public final void rule__VALID_URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2640:1: ( rule__VALID_URL__Group__1__Impl rule__VALID_URL__Group__2 )
            // InternalDockerFile.g:2641:2: rule__VALID_URL__Group__1__Impl rule__VALID_URL__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__VALID_URL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VALID_URL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group__1"


    // $ANTLR start "rule__VALID_URL__Group__1__Impl"
    // InternalDockerFile.g:2648:1: rule__VALID_URL__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VALID_URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2652:1: ( ( RULE_ID ) )
            // InternalDockerFile.g:2653:1: ( RULE_ID )
            {
            // InternalDockerFile.g:2653:1: ( RULE_ID )
            // InternalDockerFile.g:2654:2: RULE_ID
            {
             before(grammarAccess.getVALID_URLAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVALID_URLAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group__1__Impl"


    // $ANTLR start "rule__VALID_URL__Group__2"
    // InternalDockerFile.g:2663:1: rule__VALID_URL__Group__2 : rule__VALID_URL__Group__2__Impl ;
    public final void rule__VALID_URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2667:1: ( rule__VALID_URL__Group__2__Impl )
            // InternalDockerFile.g:2668:2: rule__VALID_URL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALID_URL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group__2"


    // $ANTLR start "rule__VALID_URL__Group__2__Impl"
    // InternalDockerFile.g:2674:1: rule__VALID_URL__Group__2__Impl : ( ( rule__VALID_URL__Group_2__0 )* ) ;
    public final void rule__VALID_URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2678:1: ( ( ( rule__VALID_URL__Group_2__0 )* ) )
            // InternalDockerFile.g:2679:1: ( ( rule__VALID_URL__Group_2__0 )* )
            {
            // InternalDockerFile.g:2679:1: ( ( rule__VALID_URL__Group_2__0 )* )
            // InternalDockerFile.g:2680:2: ( rule__VALID_URL__Group_2__0 )*
            {
             before(grammarAccess.getVALID_URLAccess().getGroup_2()); 
            // InternalDockerFile.g:2681:2: ( rule__VALID_URL__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=13 && LA19_0<=14)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDockerFile.g:2681:3: rule__VALID_URL__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__VALID_URL__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getVALID_URLAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group__2__Impl"


    // $ANTLR start "rule__VALID_URL__Group_2__0"
    // InternalDockerFile.g:2690:1: rule__VALID_URL__Group_2__0 : rule__VALID_URL__Group_2__0__Impl rule__VALID_URL__Group_2__1 ;
    public final void rule__VALID_URL__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2694:1: ( rule__VALID_URL__Group_2__0__Impl rule__VALID_URL__Group_2__1 )
            // InternalDockerFile.g:2695:2: rule__VALID_URL__Group_2__0__Impl rule__VALID_URL__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__VALID_URL__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VALID_URL__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group_2__0"


    // $ANTLR start "rule__VALID_URL__Group_2__0__Impl"
    // InternalDockerFile.g:2702:1: rule__VALID_URL__Group_2__0__Impl : ( ( rule__VALID_URL__Alternatives_2_0 ) ) ;
    public final void rule__VALID_URL__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2706:1: ( ( ( rule__VALID_URL__Alternatives_2_0 ) ) )
            // InternalDockerFile.g:2707:1: ( ( rule__VALID_URL__Alternatives_2_0 ) )
            {
            // InternalDockerFile.g:2707:1: ( ( rule__VALID_URL__Alternatives_2_0 ) )
            // InternalDockerFile.g:2708:2: ( rule__VALID_URL__Alternatives_2_0 )
            {
             before(grammarAccess.getVALID_URLAccess().getAlternatives_2_0()); 
            // InternalDockerFile.g:2709:2: ( rule__VALID_URL__Alternatives_2_0 )
            // InternalDockerFile.g:2709:3: rule__VALID_URL__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__VALID_URL__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getVALID_URLAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group_2__0__Impl"


    // $ANTLR start "rule__VALID_URL__Group_2__1"
    // InternalDockerFile.g:2717:1: rule__VALID_URL__Group_2__1 : rule__VALID_URL__Group_2__1__Impl ;
    public final void rule__VALID_URL__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2721:1: ( rule__VALID_URL__Group_2__1__Impl )
            // InternalDockerFile.g:2722:2: rule__VALID_URL__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALID_URL__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group_2__1"


    // $ANTLR start "rule__VALID_URL__Group_2__1__Impl"
    // InternalDockerFile.g:2728:1: rule__VALID_URL__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VALID_URL__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2732:1: ( ( RULE_ID ) )
            // InternalDockerFile.g:2733:1: ( RULE_ID )
            {
            // InternalDockerFile.g:2733:1: ( RULE_ID )
            // InternalDockerFile.g:2734:2: RULE_ID
            {
             before(grammarAccess.getVALID_URLAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVALID_URLAccess().getIDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_URL__Group_2__1__Impl"


    // $ANTLR start "rule__VALID_IMAGE_NAME__Group__0"
    // InternalDockerFile.g:2744:1: rule__VALID_IMAGE_NAME__Group__0 : rule__VALID_IMAGE_NAME__Group__0__Impl rule__VALID_IMAGE_NAME__Group__1 ;
    public final void rule__VALID_IMAGE_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2748:1: ( rule__VALID_IMAGE_NAME__Group__0__Impl rule__VALID_IMAGE_NAME__Group__1 )
            // InternalDockerFile.g:2749:2: rule__VALID_IMAGE_NAME__Group__0__Impl rule__VALID_IMAGE_NAME__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__VALID_IMAGE_NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VALID_IMAGE_NAME__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_NAME__Group__0"


    // $ANTLR start "rule__VALID_IMAGE_NAME__Group__0__Impl"
    // InternalDockerFile.g:2756:1: rule__VALID_IMAGE_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__VALID_IMAGE_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2760:1: ( ( RULE_ID ) )
            // InternalDockerFile.g:2761:1: ( RULE_ID )
            {
            // InternalDockerFile.g:2761:1: ( RULE_ID )
            // InternalDockerFile.g:2762:2: RULE_ID
            {
             before(grammarAccess.getVALID_IMAGE_NAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVALID_IMAGE_NAMEAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_NAME__Group__0__Impl"


    // $ANTLR start "rule__VALID_IMAGE_NAME__Group__1"
    // InternalDockerFile.g:2771:1: rule__VALID_IMAGE_NAME__Group__1 : rule__VALID_IMAGE_NAME__Group__1__Impl ;
    public final void rule__VALID_IMAGE_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2775:1: ( rule__VALID_IMAGE_NAME__Group__1__Impl )
            // InternalDockerFile.g:2776:2: rule__VALID_IMAGE_NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALID_IMAGE_NAME__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_NAME__Group__1"


    // $ANTLR start "rule__VALID_IMAGE_NAME__Group__1__Impl"
    // InternalDockerFile.g:2782:1: rule__VALID_IMAGE_NAME__Group__1__Impl : ( ( rule__VALID_IMAGE_NAME__Group_1__0 )* ) ;
    public final void rule__VALID_IMAGE_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2786:1: ( ( ( rule__VALID_IMAGE_NAME__Group_1__0 )* ) )
            // InternalDockerFile.g:2787:1: ( ( rule__VALID_IMAGE_NAME__Group_1__0 )* )
            {
            // InternalDockerFile.g:2787:1: ( ( rule__VALID_IMAGE_NAME__Group_1__0 )* )
            // InternalDockerFile.g:2788:2: ( rule__VALID_IMAGE_NAME__Group_1__0 )*
            {
             before(grammarAccess.getVALID_IMAGE_NAMEAccess().getGroup_1()); 
            // InternalDockerFile.g:2789:2: ( rule__VALID_IMAGE_NAME__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDockerFile.g:2789:3: rule__VALID_IMAGE_NAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__VALID_IMAGE_NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getVALID_IMAGE_NAMEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_NAME__Group__1__Impl"


    // $ANTLR start "rule__VALID_IMAGE_NAME__Group_1__0"
    // InternalDockerFile.g:2798:1: rule__VALID_IMAGE_NAME__Group_1__0 : rule__VALID_IMAGE_NAME__Group_1__0__Impl rule__VALID_IMAGE_NAME__Group_1__1 ;
    public final void rule__VALID_IMAGE_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2802:1: ( rule__VALID_IMAGE_NAME__Group_1__0__Impl rule__VALID_IMAGE_NAME__Group_1__1 )
            // InternalDockerFile.g:2803:2: rule__VALID_IMAGE_NAME__Group_1__0__Impl rule__VALID_IMAGE_NAME__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__VALID_IMAGE_NAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VALID_IMAGE_NAME__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_NAME__Group_1__0"


    // $ANTLR start "rule__VALID_IMAGE_NAME__Group_1__0__Impl"
    // InternalDockerFile.g:2810:1: rule__VALID_IMAGE_NAME__Group_1__0__Impl : ( '/' ) ;
    public final void rule__VALID_IMAGE_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2814:1: ( ( '/' ) )
            // InternalDockerFile.g:2815:1: ( '/' )
            {
            // InternalDockerFile.g:2815:1: ( '/' )
            // InternalDockerFile.g:2816:2: '/'
            {
             before(grammarAccess.getVALID_IMAGE_NAMEAccess().getSolidusKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVALID_IMAGE_NAMEAccess().getSolidusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_NAME__Group_1__0__Impl"


    // $ANTLR start "rule__VALID_IMAGE_NAME__Group_1__1"
    // InternalDockerFile.g:2825:1: rule__VALID_IMAGE_NAME__Group_1__1 : rule__VALID_IMAGE_NAME__Group_1__1__Impl ;
    public final void rule__VALID_IMAGE_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2829:1: ( rule__VALID_IMAGE_NAME__Group_1__1__Impl )
            // InternalDockerFile.g:2830:2: rule__VALID_IMAGE_NAME__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALID_IMAGE_NAME__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_NAME__Group_1__1"


    // $ANTLR start "rule__VALID_IMAGE_NAME__Group_1__1__Impl"
    // InternalDockerFile.g:2836:1: rule__VALID_IMAGE_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__VALID_IMAGE_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2840:1: ( ( RULE_ID ) )
            // InternalDockerFile.g:2841:1: ( RULE_ID )
            {
            // InternalDockerFile.g:2841:1: ( RULE_ID )
            // InternalDockerFile.g:2842:2: RULE_ID
            {
             before(grammarAccess.getVALID_IMAGE_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVALID_IMAGE_NAMEAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_NAME__Group_1__1__Impl"


    // $ANTLR start "rule__VALID_IMAGE_TAG__Group__0"
    // InternalDockerFile.g:2852:1: rule__VALID_IMAGE_TAG__Group__0 : rule__VALID_IMAGE_TAG__Group__0__Impl rule__VALID_IMAGE_TAG__Group__1 ;
    public final void rule__VALID_IMAGE_TAG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2856:1: ( rule__VALID_IMAGE_TAG__Group__0__Impl rule__VALID_IMAGE_TAG__Group__1 )
            // InternalDockerFile.g:2857:2: rule__VALID_IMAGE_TAG__Group__0__Impl rule__VALID_IMAGE_TAG__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__VALID_IMAGE_TAG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VALID_IMAGE_TAG__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_TAG__Group__0"


    // $ANTLR start "rule__VALID_IMAGE_TAG__Group__0__Impl"
    // InternalDockerFile.g:2864:1: rule__VALID_IMAGE_TAG__Group__0__Impl : ( ( rule__VALID_IMAGE_TAG__Alternatives_0 ) ) ;
    public final void rule__VALID_IMAGE_TAG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2868:1: ( ( ( rule__VALID_IMAGE_TAG__Alternatives_0 ) ) )
            // InternalDockerFile.g:2869:1: ( ( rule__VALID_IMAGE_TAG__Alternatives_0 ) )
            {
            // InternalDockerFile.g:2869:1: ( ( rule__VALID_IMAGE_TAG__Alternatives_0 ) )
            // InternalDockerFile.g:2870:2: ( rule__VALID_IMAGE_TAG__Alternatives_0 )
            {
             before(grammarAccess.getVALID_IMAGE_TAGAccess().getAlternatives_0()); 
            // InternalDockerFile.g:2871:2: ( rule__VALID_IMAGE_TAG__Alternatives_0 )
            // InternalDockerFile.g:2871:3: rule__VALID_IMAGE_TAG__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__VALID_IMAGE_TAG__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVALID_IMAGE_TAGAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_TAG__Group__0__Impl"


    // $ANTLR start "rule__VALID_IMAGE_TAG__Group__1"
    // InternalDockerFile.g:2879:1: rule__VALID_IMAGE_TAG__Group__1 : rule__VALID_IMAGE_TAG__Group__1__Impl ;
    public final void rule__VALID_IMAGE_TAG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2883:1: ( rule__VALID_IMAGE_TAG__Group__1__Impl )
            // InternalDockerFile.g:2884:2: rule__VALID_IMAGE_TAG__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALID_IMAGE_TAG__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_TAG__Group__1"


    // $ANTLR start "rule__VALID_IMAGE_TAG__Group__1__Impl"
    // InternalDockerFile.g:2890:1: rule__VALID_IMAGE_TAG__Group__1__Impl : ( ( rule__VALID_IMAGE_TAG__Alternatives_1 )* ) ;
    public final void rule__VALID_IMAGE_TAG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2894:1: ( ( ( rule__VALID_IMAGE_TAG__Alternatives_1 )* ) )
            // InternalDockerFile.g:2895:1: ( ( rule__VALID_IMAGE_TAG__Alternatives_1 )* )
            {
            // InternalDockerFile.g:2895:1: ( ( rule__VALID_IMAGE_TAG__Alternatives_1 )* )
            // InternalDockerFile.g:2896:2: ( rule__VALID_IMAGE_TAG__Alternatives_1 )*
            {
             before(grammarAccess.getVALID_IMAGE_TAGAccess().getAlternatives_1()); 
            // InternalDockerFile.g:2897:2: ( rule__VALID_IMAGE_TAG__Alternatives_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||LA21_0==13||LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDockerFile.g:2897:3: rule__VALID_IMAGE_TAG__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__VALID_IMAGE_TAG__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getVALID_IMAGE_TAGAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_IMAGE_TAG__Group__1__Impl"


    // $ANTLR start "rule__Dockerfile__InstructionsAssignment"
    // InternalDockerFile.g:2906:1: rule__Dockerfile__InstructionsAssignment : ( ruleInstruction ) ;
    public final void rule__Dockerfile__InstructionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2910:1: ( ( ruleInstruction ) )
            // InternalDockerFile.g:2911:2: ( ruleInstruction )
            {
            // InternalDockerFile.g:2911:2: ( ruleInstruction )
            // InternalDockerFile.g:2912:3: ruleInstruction
            {
             before(grammarAccess.getDockerfileAccess().getInstructionsInstructionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getDockerfileAccess().getInstructionsInstructionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dockerfile__InstructionsAssignment"


    // $ANTLR start "rule__Copy__Source_leftAssignment_1_1_0"
    // InternalDockerFile.g:2921:1: rule__Copy__Source_leftAssignment_1_1_0 : ( ruleAddSource ) ;
    public final void rule__Copy__Source_leftAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2925:1: ( ( ruleAddSource ) )
            // InternalDockerFile.g:2926:2: ( ruleAddSource )
            {
            // InternalDockerFile.g:2926:2: ( ruleAddSource )
            // InternalDockerFile.g:2927:3: ruleAddSource
            {
             before(grammarAccess.getCopyAccess().getSource_leftAddSourceParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAddSource();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getSource_leftAddSourceParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Source_leftAssignment_1_1_0"


    // $ANTLR start "rule__Copy__DestAssignment_1_1_1"
    // InternalDockerFile.g:2936:1: rule__Copy__DestAssignment_1_1_1 : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__Copy__DestAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2940:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:2941:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:2941:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:2942:3: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getCopyAccess().getDestONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getDestONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__DestAssignment_1_1_1"


    // $ANTLR start "rule__User__NameAssignment_1"
    // InternalDockerFile.g:2951:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2955:1: ( ( RULE_ID ) )
            // InternalDockerFile.g:2956:2: ( RULE_ID )
            {
            // InternalDockerFile.g:2956:2: ( RULE_ID )
            // InternalDockerFile.g:2957:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_1"


    // $ANTLR start "rule__Onbuild__InstructionAssignment_1"
    // InternalDockerFile.g:2966:1: rule__Onbuild__InstructionAssignment_1 : ( ruleInstruction ) ;
    public final void rule__Onbuild__InstructionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2970:1: ( ( ruleInstruction ) )
            // InternalDockerFile.g:2971:2: ( ruleInstruction )
            {
            // InternalDockerFile.g:2971:2: ( ruleInstruction )
            // InternalDockerFile.g:2972:3: ruleInstruction
            {
             before(grammarAccess.getOnbuildAccess().getInstructionInstructionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getOnbuildAccess().getInstructionInstructionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__InstructionAssignment_1"


    // $ANTLR start "rule__From__NameAssignment_1"
    // InternalDockerFile.g:2981:1: rule__From__NameAssignment_1 : ( ruleVALID_IMAGE_NAME ) ;
    public final void rule__From__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:2985:1: ( ( ruleVALID_IMAGE_NAME ) )
            // InternalDockerFile.g:2986:2: ( ruleVALID_IMAGE_NAME )
            {
            // InternalDockerFile.g:2986:2: ( ruleVALID_IMAGE_NAME )
            // InternalDockerFile.g:2987:3: ruleVALID_IMAGE_NAME
            {
             before(grammarAccess.getFromAccess().getNameVALID_IMAGE_NAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVALID_IMAGE_NAME();

            state._fsp--;

             after(grammarAccess.getFromAccess().getNameVALID_IMAGE_NAMEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__NameAssignment_1"


    // $ANTLR start "rule__From__TagAssignment_2_1"
    // InternalDockerFile.g:2996:1: rule__From__TagAssignment_2_1 : ( ruleVALID_IMAGE_TAG ) ;
    public final void rule__From__TagAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3000:1: ( ( ruleVALID_IMAGE_TAG ) )
            // InternalDockerFile.g:3001:2: ( ruleVALID_IMAGE_TAG )
            {
            // InternalDockerFile.g:3001:2: ( ruleVALID_IMAGE_TAG )
            // InternalDockerFile.g:3002:3: ruleVALID_IMAGE_TAG
            {
             before(grammarAccess.getFromAccess().getTagVALID_IMAGE_TAGParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVALID_IMAGE_TAG();

            state._fsp--;

             after(grammarAccess.getFromAccess().getTagVALID_IMAGE_TAGParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__TagAssignment_2_1"


    // $ANTLR start "rule__Maintainer__NameAssignment_1"
    // InternalDockerFile.g:3011:1: rule__Maintainer__NameAssignment_1 : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__Maintainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3015:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:3016:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:3016:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:3017:3: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getMaintainerAccess().getNameONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getMaintainerAccess().getNameONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__NameAssignment_1"


    // $ANTLR start "rule__Expose__PortsAssignment_1"
    // InternalDockerFile.g:3026:1: rule__Expose__PortsAssignment_1 : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__Expose__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3030:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:3031:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:3031:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:3032:3: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getExposeAccess().getPortsONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getExposeAccess().getPortsONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__PortsAssignment_1"


    // $ANTLR start "rule__JSON_ARRAY__HeadAssignment_1"
    // InternalDockerFile.g:3041:1: rule__JSON_ARRAY__HeadAssignment_1 : ( RULE_STRING ) ;
    public final void rule__JSON_ARRAY__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3045:1: ( ( RULE_STRING ) )
            // InternalDockerFile.g:3046:2: ( RULE_STRING )
            {
            // InternalDockerFile.g:3046:2: ( RULE_STRING )
            // InternalDockerFile.g:3047:3: RULE_STRING
            {
             before(grammarAccess.getJSON_ARRAYAccess().getHeadSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJSON_ARRAYAccess().getHeadSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__HeadAssignment_1"


    // $ANTLR start "rule__JSON_ARRAY__TailAssignment_2"
    // InternalDockerFile.g:3056:1: rule__JSON_ARRAY__TailAssignment_2 : ( ruleSTRING_PREFIXED_WITH_COMMA ) ;
    public final void rule__JSON_ARRAY__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3060:1: ( ( ruleSTRING_PREFIXED_WITH_COMMA ) )
            // InternalDockerFile.g:3061:2: ( ruleSTRING_PREFIXED_WITH_COMMA )
            {
            // InternalDockerFile.g:3061:2: ( ruleSTRING_PREFIXED_WITH_COMMA )
            // InternalDockerFile.g:3062:3: ruleSTRING_PREFIXED_WITH_COMMA
            {
             before(grammarAccess.getJSON_ARRAYAccess().getTailSTRING_PREFIXED_WITH_COMMAParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSTRING_PREFIXED_WITH_COMMA();

            state._fsp--;

             after(grammarAccess.getJSON_ARRAYAccess().getTailSTRING_PREFIXED_WITH_COMMAParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_ARRAY__TailAssignment_2"


    // $ANTLR start "rule__EnvWithSpace__KeyAssignment_0"
    // InternalDockerFile.g:3071:1: rule__EnvWithSpace__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnvWithSpace__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3075:1: ( ( RULE_ID ) )
            // InternalDockerFile.g:3076:2: ( RULE_ID )
            {
            // InternalDockerFile.g:3076:2: ( RULE_ID )
            // InternalDockerFile.g:3077:3: RULE_ID
            {
             before(grammarAccess.getEnvWithSpaceAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnvWithSpaceAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithSpace__KeyAssignment_0"


    // $ANTLR start "rule__EnvWithSpace__ValueAssignment_1"
    // InternalDockerFile.g:3086:1: rule__EnvWithSpace__ValueAssignment_1 : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__EnvWithSpace__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3090:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:3091:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:3091:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:3092:3: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getEnvWithSpaceAccess().getValueONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getEnvWithSpaceAccess().getValueONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithSpace__ValueAssignment_1"


    // $ANTLR start "rule__EnvWithEqual__KeyAssignment_0"
    // InternalDockerFile.g:3101:1: rule__EnvWithEqual__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnvWithEqual__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3105:1: ( ( RULE_ID ) )
            // InternalDockerFile.g:3106:2: ( RULE_ID )
            {
            // InternalDockerFile.g:3106:2: ( RULE_ID )
            // InternalDockerFile.g:3107:3: RULE_ID
            {
             before(grammarAccess.getEnvWithEqualAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnvWithEqualAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithEqual__KeyAssignment_0"


    // $ANTLR start "rule__EnvWithEqual__ValueAssignment_1"
    // InternalDockerFile.g:3116:1: rule__EnvWithEqual__ValueAssignment_1 : ( RULE_ENV_VALUE_WITH_EQUAL ) ;
    public final void rule__EnvWithEqual__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3120:1: ( ( RULE_ENV_VALUE_WITH_EQUAL ) )
            // InternalDockerFile.g:3121:2: ( RULE_ENV_VALUE_WITH_EQUAL )
            {
            // InternalDockerFile.g:3121:2: ( RULE_ENV_VALUE_WITH_EQUAL )
            // InternalDockerFile.g:3122:3: RULE_ENV_VALUE_WITH_EQUAL
            {
             before(grammarAccess.getEnvWithEqualAccess().getValueENV_VALUE_WITH_EQUALTerminalRuleCall_1_0()); 
            match(input,RULE_ENV_VALUE_WITH_EQUAL,FOLLOW_2); 
             after(grammarAccess.getEnvWithEqualAccess().getValueENV_VALUE_WITH_EQUALTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvWithEqual__ValueAssignment_1"


    // $ANTLR start "rule__Workdir__PathAssignment_1"
    // InternalDockerFile.g:3131:1: rule__Workdir__PathAssignment_1 : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__Workdir__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3135:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:3136:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:3136:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:3137:3: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getWorkdirAccess().getPathONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getWorkdirAccess().getPathONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__PathAssignment_1"


    // $ANTLR start "rule__Add__Source_leftAssignment_1"
    // InternalDockerFile.g:3146:1: rule__Add__Source_leftAssignment_1 : ( ruleAddSource ) ;
    public final void rule__Add__Source_leftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3150:1: ( ( ruleAddSource ) )
            // InternalDockerFile.g:3151:2: ( ruleAddSource )
            {
            // InternalDockerFile.g:3151:2: ( ruleAddSource )
            // InternalDockerFile.g:3152:3: ruleAddSource
            {
             before(grammarAccess.getAddAccess().getSource_leftAddSourceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddSource();

            state._fsp--;

             after(grammarAccess.getAddAccess().getSource_leftAddSourceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Source_leftAssignment_1"


    // $ANTLR start "rule__Add__DestAssignment_2"
    // InternalDockerFile.g:3161:1: rule__Add__DestAssignment_2 : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__Add__DestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3165:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:3166:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:3166:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:3167:3: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getAddAccess().getDestONE_SPACE_AND_WHATEVERTerminalRuleCall_2_0()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getDestONE_SPACE_AND_WHATEVERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__DestAssignment_2"


    // $ANTLR start "rule__RunWithShell__CommandAssignment"
    // InternalDockerFile.g:3176:1: rule__RunWithShell__CommandAssignment : ( RULE_ONE_SPACE_AND_WHATEVER ) ;
    public final void rule__RunWithShell__CommandAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3180:1: ( ( RULE_ONE_SPACE_AND_WHATEVER ) )
            // InternalDockerFile.g:3181:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            {
            // InternalDockerFile.g:3181:2: ( RULE_ONE_SPACE_AND_WHATEVER )
            // InternalDockerFile.g:3182:3: RULE_ONE_SPACE_AND_WHATEVER
            {
             before(grammarAccess.getRunWithShellAccess().getCommandONE_SPACE_AND_WHATEVERTerminalRuleCall_0()); 
            match(input,RULE_ONE_SPACE_AND_WHATEVER,FOLLOW_2); 
             after(grammarAccess.getRunWithShellAccess().getCommandONE_SPACE_AND_WHATEVERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithShell__CommandAssignment"


    // $ANTLR start "rule__RunWithNoShell__ExecutableAssignment_1"
    // InternalDockerFile.g:3191:1: rule__RunWithNoShell__ExecutableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RunWithNoShell__ExecutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3195:1: ( ( RULE_STRING ) )
            // InternalDockerFile.g:3196:2: ( RULE_STRING )
            {
            // InternalDockerFile.g:3196:2: ( RULE_STRING )
            // InternalDockerFile.g:3197:3: RULE_STRING
            {
             before(grammarAccess.getRunWithNoShellAccess().getExecutableSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRunWithNoShellAccess().getExecutableSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__ExecutableAssignment_1"


    // $ANTLR start "rule__RunWithNoShell__ParamsAssignment_2"
    // InternalDockerFile.g:3206:1: rule__RunWithNoShell__ParamsAssignment_2 : ( ruleSTRING_PREFIXED_WITH_COMMA ) ;
    public final void rule__RunWithNoShell__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerFile.g:3210:1: ( ( ruleSTRING_PREFIXED_WITH_COMMA ) )
            // InternalDockerFile.g:3211:2: ( ruleSTRING_PREFIXED_WITH_COMMA )
            {
            // InternalDockerFile.g:3211:2: ( ruleSTRING_PREFIXED_WITH_COMMA )
            // InternalDockerFile.g:3212:3: ruleSTRING_PREFIXED_WITH_COMMA
            {
             before(grammarAccess.getRunWithNoShellAccess().getParamsSTRING_PREFIXED_WITH_COMMAParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSTRING_PREFIXED_WITH_COMMA();

            state._fsp--;

             after(grammarAccess.getRunWithNoShellAccess().getParamsSTRING_PREFIXED_WITH_COMMAParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunWithNoShell__ParamsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000EF7F0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000408002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000EF7F0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000A070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000A072L});

}