package org.palladiosimulator.somox.docker.compose.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.palladiosimulator.somox.docker.compose.services.ComposeFileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComposeFileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Max_failure_ratio", "Stop_grace_period", "Credential_spec", "Rollback_config", "Container_name", "External_links", "Failure_action", "Restart_policy", "Cgroup_parent", "Endpoint_mode", "Update_config", "Max_attempts", "Network_mode", "Security_opt", "Start_period", "Consistency", "Constraints", "Driver_opts", "Enable_ipv6", "Environment", "Extra_hosts", "Healthcheck", "Mac_address", "Parallelism", "Preferences", "Propagation", "Stop_signal", "Userns_mode", "Working_dir", "Attachable", "Cache_from", "Depends_on", "Dns_search", "Dockerfile", "Domainname", "Entrypoint", "Privileged", "Stdin_open", "Condition", "Isolation", "Placement", "Published", "Read_only", "Resources", "Cap_drop", "Env_file", "External", "Hostname", "Internal", "Interval", "Networks", "Protocol", "Registry", "Replicas", "Services", "Shm_size", "Cap_add", "Command", "Configs", "Context", "Devices", "Disable", "Image", "Logging", "Monitor", "Network", "Options", "Restart", "Retries", "Secrets", "Sysctls", "Timeout", "Ulimits", "Version", "Volumes", "Config", "Deploy", "Driver", "Expose", "Labels", "Nocopy", "Source", "Target", "Volume", "Window", "Build", "Delay", "Links", "Order", "Ports", "Tmpfs", "Args", "Bind", "File", "Hard", "Init", "Ipam", "Mode", "Name", "Size", "Soft", "Test", "Type", "User", "Dns", "Gid", "Ipc", "Pid", "Tty", "Uid", "HyphenMinusSpace", "Colon", "EqualsSign", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Networks=54;
    public static final int Secrets=73;
    public static final int Size=103;
    public static final int Internal=52;
    public static final int Dns=108;
    public static final int Image=66;
    public static final int Init=99;
    public static final int Network=69;
    public static final int HyphenMinusSpace=114;
    public static final int Ulimits=76;
    public static final int Extra_hosts=24;
    public static final int Disable=65;
    public static final int RULE_ID=119;
    public static final int Stop_signal=30;
    public static final int Hard=98;
    public static final int Labels=83;
    public static final int Uid=113;
    public static final int Volume=87;
    public static final int RULE_INT=120;
    public static final int RULE_ML_COMMENT=122;
    public static final int Enable_ipv6=22;
    public static final int Resources=47;
    public static final int Interval=53;
    public static final int Bind=96;
    public static final int Propagation=29;
    public static final int Sysctls=74;
    public static final int Restart=71;
    public static final int Target=86;
    public static final int Userns_mode=31;
    public static final int Protocol=55;
    public static final int Context=63;
    public static final int Window=88;
    public static final int Expose=82;
    public static final int Ports=93;
    public static final int Pid=111;
    public static final int Soft=104;
    public static final int Services=58;
    public static final int Type=106;
    public static final int Cgroup_parent=12;
    public static final int Published=45;
    public static final int Working_dir=32;
    public static final int RULE_BEGIN=117;
    public static final int Consistency=19;
    public static final int Read_only=46;
    public static final int Failure_action=10;
    public static final int Cap_add=60;
    public static final int Devices=64;
    public static final int Delay=90;
    public static final int Name=102;
    public static final int Ipam=100;
    public static final int Rollback_config=7;
    public static final int Volumes=78;
    public static final int Placement=44;
    public static final int Version=77;
    public static final int Test=105;
    public static final int Retries=72;
    public static final int Build=89;
    public static final int Stdin_open=41;
    public static final int Stop_grace_period=5;
    public static final int Max_failure_ratio=4;
    public static final int Endpoint_mode=13;
    public static final int Logging=67;
    public static final int Order=92;
    public static final int Max_attempts=15;
    public static final int Gid=109;
    public static final int Timeout=75;
    public static final int Hostname=51;
    public static final int Security_opt=17;
    public static final int Network_mode=16;
    public static final int Driver_opts=21;
    public static final int Healthcheck=25;
    public static final int Shm_size=59;
    public static final int Nocopy=84;
    public static final int Update_config=14;
    public static final int Constraints=20;
    public static final int External=50;
    public static final int Configs=62;
    public static final int Environment=23;
    public static final int Parallelism=27;
    public static final int Start_period=18;
    public static final int File=97;
    public static final int Options=70;
    public static final int RULE_END=118;
    public static final int User=107;
    public static final int Privileged=40;
    public static final int Config=79;
    public static final int Driver=81;
    public static final int Deploy=80;
    public static final int RULE_STRING=121;
    public static final int Env_file=49;
    public static final int Source=85;
    public static final int RULE_SL_COMMENT=123;
    public static final int EqualsSign=116;
    public static final int Monitor=68;
    public static final int Domainname=38;
    public static final int Tmpfs=94;
    public static final int Tty=112;
    public static final int Colon=115;
    public static final int Preferences=28;
    public static final int EOF=-1;
    public static final int External_links=9;
    public static final int Restart_policy=11;
    public static final int Mac_address=26;
    public static final int Cache_from=34;
    public static final int Condition=42;
    public static final int Args=95;
    public static final int Entrypoint=39;
    public static final int Credential_spec=6;
    public static final int Dns_search=36;
    public static final int RULE_WS=124;
    public static final int Mode=101;
    public static final int Registry=56;
    public static final int RULE_ANY_OTHER=125;
    public static final int Replicas=57;
    public static final int Container_name=8;
    public static final int Cap_drop=48;
    public static final int Depends_on=35;
    public static final int Dockerfile=37;
    public static final int Command=61;
    public static final int Isolation=43;
    public static final int Links=91;
    public static final int Attachable=33;
    public static final int Ipc=110;

    // delegates
    // delegators


        public InternalComposeFileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComposeFileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComposeFileParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComposeFileParser.g"; }



     	private ComposeFileGrammarAccess grammarAccess;

        public InternalComposeFileParser(TokenStream input, ComposeFileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DockerCompose";
       	}

       	@Override
       	protected ComposeFileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDockerCompose"
    // InternalComposeFileParser.g:57:1: entryRuleDockerCompose returns [EObject current=null] : iv_ruleDockerCompose= ruleDockerCompose EOF ;
    public final EObject entryRuleDockerCompose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerCompose = null;


        try {
            // InternalComposeFileParser.g:57:54: (iv_ruleDockerCompose= ruleDockerCompose EOF )
            // InternalComposeFileParser.g:58:2: iv_ruleDockerCompose= ruleDockerCompose EOF
            {
             newCompositeNode(grammarAccess.getDockerComposeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerCompose=ruleDockerCompose();

            state._fsp--;

             current =iv_ruleDockerCompose; 
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
    // $ANTLR end "entryRuleDockerCompose"


    // $ANTLR start "ruleDockerCompose"
    // InternalComposeFileParser.g:64:1: ruleDockerCompose returns [EObject current=null] : ( () otherlv_1= Version otherlv_2= Colon ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= Services otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_services_7_0= ruleService ) )* this_END_8= RULE_END )? (otherlv_9= Volumes otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_volumes_12_0= ruleVolumes ) )* this_END_13= RULE_END )? (otherlv_14= Networks otherlv_15= Colon this_BEGIN_16= RULE_BEGIN ( (lv_networks_17_0= ruleNetworks ) )* this_END_18= RULE_END )? (otherlv_19= Configs otherlv_20= Colon this_BEGIN_21= RULE_BEGIN ( (lv_configs_22_0= ruleConfigs ) )* this_END_23= RULE_END )? (otherlv_24= Secrets otherlv_25= Colon this_BEGIN_26= RULE_BEGIN ( (lv_secrets_27_0= ruleSecrets ) )* this_END_28= RULE_END )? ) ;
    public final EObject ruleDockerCompose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token this_BEGIN_16=null;
        Token this_END_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token this_BEGIN_21=null;
        Token this_END_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token this_BEGIN_26=null;
        Token this_END_28=null;
        EObject lv_services_7_0 = null;

        EObject lv_volumes_12_0 = null;

        EObject lv_networks_17_0 = null;

        EObject lv_configs_22_0 = null;

        EObject lv_secrets_27_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:70:2: ( ( () otherlv_1= Version otherlv_2= Colon ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= Services otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_services_7_0= ruleService ) )* this_END_8= RULE_END )? (otherlv_9= Volumes otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_volumes_12_0= ruleVolumes ) )* this_END_13= RULE_END )? (otherlv_14= Networks otherlv_15= Colon this_BEGIN_16= RULE_BEGIN ( (lv_networks_17_0= ruleNetworks ) )* this_END_18= RULE_END )? (otherlv_19= Configs otherlv_20= Colon this_BEGIN_21= RULE_BEGIN ( (lv_configs_22_0= ruleConfigs ) )* this_END_23= RULE_END )? (otherlv_24= Secrets otherlv_25= Colon this_BEGIN_26= RULE_BEGIN ( (lv_secrets_27_0= ruleSecrets ) )* this_END_28= RULE_END )? ) )
            // InternalComposeFileParser.g:71:2: ( () otherlv_1= Version otherlv_2= Colon ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= Services otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_services_7_0= ruleService ) )* this_END_8= RULE_END )? (otherlv_9= Volumes otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_volumes_12_0= ruleVolumes ) )* this_END_13= RULE_END )? (otherlv_14= Networks otherlv_15= Colon this_BEGIN_16= RULE_BEGIN ( (lv_networks_17_0= ruleNetworks ) )* this_END_18= RULE_END )? (otherlv_19= Configs otherlv_20= Colon this_BEGIN_21= RULE_BEGIN ( (lv_configs_22_0= ruleConfigs ) )* this_END_23= RULE_END )? (otherlv_24= Secrets otherlv_25= Colon this_BEGIN_26= RULE_BEGIN ( (lv_secrets_27_0= ruleSecrets ) )* this_END_28= RULE_END )? )
            {
            // InternalComposeFileParser.g:71:2: ( () otherlv_1= Version otherlv_2= Colon ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= Services otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_services_7_0= ruleService ) )* this_END_8= RULE_END )? (otherlv_9= Volumes otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_volumes_12_0= ruleVolumes ) )* this_END_13= RULE_END )? (otherlv_14= Networks otherlv_15= Colon this_BEGIN_16= RULE_BEGIN ( (lv_networks_17_0= ruleNetworks ) )* this_END_18= RULE_END )? (otherlv_19= Configs otherlv_20= Colon this_BEGIN_21= RULE_BEGIN ( (lv_configs_22_0= ruleConfigs ) )* this_END_23= RULE_END )? (otherlv_24= Secrets otherlv_25= Colon this_BEGIN_26= RULE_BEGIN ( (lv_secrets_27_0= ruleSecrets ) )* this_END_28= RULE_END )? )
            // InternalComposeFileParser.g:72:3: () otherlv_1= Version otherlv_2= Colon ( (lv_version_3_0= RULE_STRING ) ) (otherlv_4= Services otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_services_7_0= ruleService ) )* this_END_8= RULE_END )? (otherlv_9= Volumes otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_volumes_12_0= ruleVolumes ) )* this_END_13= RULE_END )? (otherlv_14= Networks otherlv_15= Colon this_BEGIN_16= RULE_BEGIN ( (lv_networks_17_0= ruleNetworks ) )* this_END_18= RULE_END )? (otherlv_19= Configs otherlv_20= Colon this_BEGIN_21= RULE_BEGIN ( (lv_configs_22_0= ruleConfigs ) )* this_END_23= RULE_END )? (otherlv_24= Secrets otherlv_25= Colon this_BEGIN_26= RULE_BEGIN ( (lv_secrets_27_0= ruleSecrets ) )* this_END_28= RULE_END )?
            {
            // InternalComposeFileParser.g:72:3: ()
            // InternalComposeFileParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDockerComposeAccess().getDockerComposeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Version,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDockerComposeAccess().getVersionKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDockerComposeAccess().getColonKeyword_2());
            		
            // InternalComposeFileParser.g:87:3: ( (lv_version_3_0= RULE_STRING ) )
            // InternalComposeFileParser.g:88:4: (lv_version_3_0= RULE_STRING )
            {
            // InternalComposeFileParser.g:88:4: (lv_version_3_0= RULE_STRING )
            // InternalComposeFileParser.g:89:5: lv_version_3_0= RULE_STRING
            {
            lv_version_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_version_3_0, grammarAccess.getDockerComposeAccess().getVersionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDockerComposeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalComposeFileParser.g:105:3: (otherlv_4= Services otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_services_7_0= ruleService ) )* this_END_8= RULE_END )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Services) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComposeFileParser.g:106:4: otherlv_4= Services otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_services_7_0= ruleService ) )* this_END_8= RULE_END
                    {
                    otherlv_4=(Token)match(input,Services,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDockerComposeAccess().getServicesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,Colon,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getDockerComposeAccess().getColonKeyword_4_1());
                    			
                    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

                    				newLeafNode(this_BEGIN_6, grammarAccess.getDockerComposeAccess().getBEGINTerminalRuleCall_4_2());
                    			
                    // InternalComposeFileParser.g:118:4: ( (lv_services_7_0= ruleService ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalComposeFileParser.g:119:5: (lv_services_7_0= ruleService )
                    	    {
                    	    // InternalComposeFileParser.g:119:5: (lv_services_7_0= ruleService )
                    	    // InternalComposeFileParser.g:120:6: lv_services_7_0= ruleService
                    	    {

                    	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getServicesServiceParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_services_7_0=ruleService();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"services",
                    	    							lv_services_7_0,
                    	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Service");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    this_END_8=(Token)match(input,RULE_END,FOLLOW_8); 

                    				newLeafNode(this_END_8, grammarAccess.getDockerComposeAccess().getENDTerminalRuleCall_4_4());
                    			

                    }
                    break;

            }

            // InternalComposeFileParser.g:142:3: (otherlv_9= Volumes otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_volumes_12_0= ruleVolumes ) )* this_END_13= RULE_END )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Volumes) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComposeFileParser.g:143:4: otherlv_9= Volumes otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_volumes_12_0= ruleVolumes ) )* this_END_13= RULE_END
                    {
                    otherlv_9=(Token)match(input,Volumes,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getDockerComposeAccess().getVolumesKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,Colon,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getDockerComposeAccess().getColonKeyword_5_1());
                    			
                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

                    				newLeafNode(this_BEGIN_11, grammarAccess.getDockerComposeAccess().getBEGINTerminalRuleCall_5_2());
                    			
                    // InternalComposeFileParser.g:155:4: ( (lv_volumes_12_0= ruleVolumes ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalComposeFileParser.g:156:5: (lv_volumes_12_0= ruleVolumes )
                    	    {
                    	    // InternalComposeFileParser.g:156:5: (lv_volumes_12_0= ruleVolumes )
                    	    // InternalComposeFileParser.g:157:6: lv_volumes_12_0= ruleVolumes
                    	    {

                    	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getVolumesVolumesParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_volumes_12_0=ruleVolumes();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"volumes",
                    	    							lv_volumes_12_0,
                    	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Volumes");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_9); 

                    				newLeafNode(this_END_13, grammarAccess.getDockerComposeAccess().getENDTerminalRuleCall_5_4());
                    			

                    }
                    break;

            }

            // InternalComposeFileParser.g:179:3: (otherlv_14= Networks otherlv_15= Colon this_BEGIN_16= RULE_BEGIN ( (lv_networks_17_0= ruleNetworks ) )* this_END_18= RULE_END )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Networks) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComposeFileParser.g:180:4: otherlv_14= Networks otherlv_15= Colon this_BEGIN_16= RULE_BEGIN ( (lv_networks_17_0= ruleNetworks ) )* this_END_18= RULE_END
                    {
                    otherlv_14=(Token)match(input,Networks,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getDockerComposeAccess().getNetworksKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,Colon,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getDockerComposeAccess().getColonKeyword_6_1());
                    			
                    this_BEGIN_16=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

                    				newLeafNode(this_BEGIN_16, grammarAccess.getDockerComposeAccess().getBEGINTerminalRuleCall_6_2());
                    			
                    // InternalComposeFileParser.g:192:4: ( (lv_networks_17_0= ruleNetworks ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalComposeFileParser.g:193:5: (lv_networks_17_0= ruleNetworks )
                    	    {
                    	    // InternalComposeFileParser.g:193:5: (lv_networks_17_0= ruleNetworks )
                    	    // InternalComposeFileParser.g:194:6: lv_networks_17_0= ruleNetworks
                    	    {

                    	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getNetworksNetworksParserRuleCall_6_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_networks_17_0=ruleNetworks();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"networks",
                    	    							lv_networks_17_0,
                    	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Networks");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    this_END_18=(Token)match(input,RULE_END,FOLLOW_10); 

                    				newLeafNode(this_END_18, grammarAccess.getDockerComposeAccess().getENDTerminalRuleCall_6_4());
                    			

                    }
                    break;

            }

            // InternalComposeFileParser.g:216:3: (otherlv_19= Configs otherlv_20= Colon this_BEGIN_21= RULE_BEGIN ( (lv_configs_22_0= ruleConfigs ) )* this_END_23= RULE_END )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Configs) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComposeFileParser.g:217:4: otherlv_19= Configs otherlv_20= Colon this_BEGIN_21= RULE_BEGIN ( (lv_configs_22_0= ruleConfigs ) )* this_END_23= RULE_END
                    {
                    otherlv_19=(Token)match(input,Configs,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getDockerComposeAccess().getConfigsKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,Colon,FOLLOW_6); 

                    				newLeafNode(otherlv_20, grammarAccess.getDockerComposeAccess().getColonKeyword_7_1());
                    			
                    this_BEGIN_21=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

                    				newLeafNode(this_BEGIN_21, grammarAccess.getDockerComposeAccess().getBEGINTerminalRuleCall_7_2());
                    			
                    // InternalComposeFileParser.g:229:4: ( (lv_configs_22_0= ruleConfigs ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalComposeFileParser.g:230:5: (lv_configs_22_0= ruleConfigs )
                    	    {
                    	    // InternalComposeFileParser.g:230:5: (lv_configs_22_0= ruleConfigs )
                    	    // InternalComposeFileParser.g:231:6: lv_configs_22_0= ruleConfigs
                    	    {

                    	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getConfigsConfigsParserRuleCall_7_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_configs_22_0=ruleConfigs();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"configs",
                    	    							lv_configs_22_0,
                    	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Configs");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    this_END_23=(Token)match(input,RULE_END,FOLLOW_11); 

                    				newLeafNode(this_END_23, grammarAccess.getDockerComposeAccess().getENDTerminalRuleCall_7_4());
                    			

                    }
                    break;

            }

            // InternalComposeFileParser.g:253:3: (otherlv_24= Secrets otherlv_25= Colon this_BEGIN_26= RULE_BEGIN ( (lv_secrets_27_0= ruleSecrets ) )* this_END_28= RULE_END )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Secrets) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComposeFileParser.g:254:4: otherlv_24= Secrets otherlv_25= Colon this_BEGIN_26= RULE_BEGIN ( (lv_secrets_27_0= ruleSecrets ) )* this_END_28= RULE_END
                    {
                    otherlv_24=(Token)match(input,Secrets,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getDockerComposeAccess().getSecretsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,Colon,FOLLOW_6); 

                    				newLeafNode(otherlv_25, grammarAccess.getDockerComposeAccess().getColonKeyword_8_1());
                    			
                    this_BEGIN_26=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

                    				newLeafNode(this_BEGIN_26, grammarAccess.getDockerComposeAccess().getBEGINTerminalRuleCall_8_2());
                    			
                    // InternalComposeFileParser.g:266:4: ( (lv_secrets_27_0= ruleSecrets ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalComposeFileParser.g:267:5: (lv_secrets_27_0= ruleSecrets )
                    	    {
                    	    // InternalComposeFileParser.g:267:5: (lv_secrets_27_0= ruleSecrets )
                    	    // InternalComposeFileParser.g:268:6: lv_secrets_27_0= ruleSecrets
                    	    {

                    	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getSecretsSecretsParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_secrets_27_0=ruleSecrets();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"secrets",
                    	    							lv_secrets_27_0,
                    	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Secrets");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    this_END_28=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_28, grammarAccess.getDockerComposeAccess().getENDTerminalRuleCall_8_4());
                    			

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
    // $ANTLR end "ruleDockerCompose"


    // $ANTLR start "entryRuleService"
    // InternalComposeFileParser.g:294:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalComposeFileParser.g:294:48: (iv_ruleService= ruleService EOF )
            // InternalComposeFileParser.g:295:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalComposeFileParser.g:301:1: ruleService returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Build otherlv_5= Colon ( (lv_build_6_0= ruleBuild ) ) ) | (otherlv_7= Cap_add otherlv_8= Colon ( (lv_cap_add_9_0= ruleList ) ) ) | (otherlv_10= Cap_drop otherlv_11= Colon ( (lv_cap_drop_12_0= ruleList ) ) ) | (otherlv_13= Cgroup_parent otherlv_14= Colon ( (lv_cgroup_parent_15_0= ruleValue ) ) ) | (otherlv_16= Command otherlv_17= Colon ( (lv_command_18_0= ruleValue ) ) ) | (otherlv_19= Configs otherlv_20= Colon ( (lv_command_21_0= ruleValue ) ) ) | (otherlv_22= Container_name otherlv_23= Colon ( (lv_container_name_24_0= ruleValue ) ) ) | (otherlv_25= Credential_spec otherlv_26= Colon ( (lv_credential_spec_27_0= ruleCredentialSpec ) ) ) | (otherlv_28= Depends_on otherlv_29= Colon ( (lv_depends_on_30_0= ruleList ) ) ) | (otherlv_31= Deploy otherlv_32= Colon ( (lv_deploy_33_0= ruleDeploy ) ) ) | (otherlv_34= Devices otherlv_35= Colon ( (lv_devices_36_0= ruleList ) ) ) | (otherlv_37= Dns otherlv_38= Colon ( (lv_dns_39_0= ruleList ) ) ) | (otherlv_40= Dns_search otherlv_41= Colon ( (lv_dns_42_0= ruleList ) ) ) | (otherlv_43= Domainname otherlv_44= Colon ( (lv_domainname_45_0= ruleValue ) ) ) | (otherlv_46= Entrypoint otherlv_47= Colon ( (lv_entrypoint_48_0= ruleValueOrList ) ) ) | (otherlv_49= Env_file otherlv_50= Colon ( (lv_env_file_51_0= ruleValueOrList ) ) ) | (otherlv_52= Environment otherlv_53= Colon ( (lv_environment_54_0= ruleMapping ) ) ) | (otherlv_55= Expose otherlv_56= Colon ( (lv_expose_57_0= ruleList ) ) ) | (otherlv_58= External_links otherlv_59= Colon ( (lv_external_links_60_0= ruleList ) ) ) | (otherlv_61= Extra_hosts otherlv_62= Colon ( (lv_external_links_63_0= ruleListOrMapping ) ) ) | (otherlv_64= Healthcheck otherlv_65= Colon ( (lv_healthcheck_66_0= ruleHealthcheck ) ) ) | (otherlv_67= Hostname otherlv_68= Colon ( (lv_hostname_69_0= ruleValue ) ) ) | (otherlv_70= Image ( (lv_image_71_0= ruleValue ) ) ) | (otherlv_72= Init otherlv_73= Colon ( (lv_init_74_0= ruleValue ) ) ) | (otherlv_75= Ipc otherlv_76= Colon ( (lv_ipc_77_0= ruleValue ) ) ) | (otherlv_78= Isolation otherlv_79= Colon ( (lv_isolation_80_0= ruleValue ) ) ) | (otherlv_81= Labels otherlv_82= Colon ( (lv_labels_83_0= ruleListOrMapping ) ) ) | (otherlv_84= Links otherlv_85= Colon ( (lv_links_86_0= ruleListOrMapping ) ) ) | (otherlv_87= Logging otherlv_88= Colon ( (lv_logging_89_0= ruleLogging ) ) ) | (otherlv_90= Mac_address otherlv_91= Colon ( (lv_mac_address_92_0= ruleValue ) ) ) | (otherlv_93= Network_mode otherlv_94= Colon ( (lv_network_mode_95_0= ruleValue ) ) ) | (otherlv_96= Networks otherlv_97= Colon ( (lv_networks_98_0= ruleList ) ) ) | (otherlv_99= Pid otherlv_100= Colon ( (lv_pid_101_0= ruleValue ) ) ) | (otherlv_102= Ports otherlv_103= Colon ( (lv_ports_104_0= rulePorts ) ) ) | (otherlv_105= Privileged otherlv_106= Colon ( (lv_privileged_107_0= ruleValue ) ) ) | (otherlv_108= Read_only otherlv_109= Colon ( (lv_read_only_110_0= ruleValue ) ) ) | (otherlv_111= Restart otherlv_112= Colon ( (lv_restart_113_0= ruleValue ) ) ) | (otherlv_114= Secrets otherlv_115= Colon ( (lv_secrets_116_0= ruleServiceSecrets ) ) ) | (otherlv_117= Security_opt otherlv_118= Colon ( (lv_security_opt_119_0= ruleList ) ) ) | (otherlv_120= Shm_size otherlv_121= Colon ( (lv_shm_size_122_0= ruleValue ) ) ) | (otherlv_123= Stdin_open otherlv_124= Colon ( (lv_stdin_open_125_0= ruleValue ) ) ) | (otherlv_126= Stop_grace_period otherlv_127= Colon ( (lv_stop_grace_period_128_0= ruleValue ) ) ) | (otherlv_129= Stop_signal otherlv_130= Colon ( (lv_stop_signal_131_0= ruleValue ) ) ) | (otherlv_132= Sysctls otherlv_133= Colon ( (lv_sysctls_134_0= ruleListOrMapping ) ) ) | (otherlv_135= Tmpfs otherlv_136= Colon ( (lv_sysctls_137_0= ruleValueOrList ) ) ) | (otherlv_138= Tty otherlv_139= Colon ( (lv_tty_140_0= ruleValue ) ) ) | (otherlv_141= Ulimits otherlv_142= Colon ( (lv_ulimits_143_0= ruleUlimits ) ) ) | (otherlv_144= User otherlv_145= Colon ( (lv_user_146_0= ruleValue ) ) ) | (otherlv_147= Userns_mode otherlv_148= Colon ( (lv_userns_mode_149_0= ruleValue ) ) ) | (otherlv_150= Volumes otherlv_151= Colon ( (lv_volumes_152_0= ruleServiceVolumes ) ) ) | (otherlv_153= Working_dir otherlv_154= Colon ( (lv_working_dir_155_0= ruleValue ) ) ) )+ this_END_156= RULE_END ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_70=null;
        Token otherlv_72=null;
        Token otherlv_73=null;
        Token otherlv_75=null;
        Token otherlv_76=null;
        Token otherlv_78=null;
        Token otherlv_79=null;
        Token otherlv_81=null;
        Token otherlv_82=null;
        Token otherlv_84=null;
        Token otherlv_85=null;
        Token otherlv_87=null;
        Token otherlv_88=null;
        Token otherlv_90=null;
        Token otherlv_91=null;
        Token otherlv_93=null;
        Token otherlv_94=null;
        Token otherlv_96=null;
        Token otherlv_97=null;
        Token otherlv_99=null;
        Token otherlv_100=null;
        Token otherlv_102=null;
        Token otherlv_103=null;
        Token otherlv_105=null;
        Token otherlv_106=null;
        Token otherlv_108=null;
        Token otherlv_109=null;
        Token otherlv_111=null;
        Token otherlv_112=null;
        Token otherlv_114=null;
        Token otherlv_115=null;
        Token otherlv_117=null;
        Token otherlv_118=null;
        Token otherlv_120=null;
        Token otherlv_121=null;
        Token otherlv_123=null;
        Token otherlv_124=null;
        Token otherlv_126=null;
        Token otherlv_127=null;
        Token otherlv_129=null;
        Token otherlv_130=null;
        Token otherlv_132=null;
        Token otherlv_133=null;
        Token otherlv_135=null;
        Token otherlv_136=null;
        Token otherlv_138=null;
        Token otherlv_139=null;
        Token otherlv_141=null;
        Token otherlv_142=null;
        Token otherlv_144=null;
        Token otherlv_145=null;
        Token otherlv_147=null;
        Token otherlv_148=null;
        Token otherlv_150=null;
        Token otherlv_151=null;
        Token otherlv_153=null;
        Token otherlv_154=null;
        Token this_END_156=null;
        EObject lv_build_6_0 = null;

        EObject lv_cap_add_9_0 = null;

        EObject lv_cap_drop_12_0 = null;

        AntlrDatatypeRuleToken lv_cgroup_parent_15_0 = null;

        AntlrDatatypeRuleToken lv_command_18_0 = null;

        AntlrDatatypeRuleToken lv_command_21_0 = null;

        AntlrDatatypeRuleToken lv_container_name_24_0 = null;

        EObject lv_credential_spec_27_0 = null;

        EObject lv_depends_on_30_0 = null;

        EObject lv_deploy_33_0 = null;

        EObject lv_devices_36_0 = null;

        EObject lv_dns_39_0 = null;

        EObject lv_dns_42_0 = null;

        AntlrDatatypeRuleToken lv_domainname_45_0 = null;

        EObject lv_entrypoint_48_0 = null;

        EObject lv_env_file_51_0 = null;

        EObject lv_environment_54_0 = null;

        EObject lv_expose_57_0 = null;

        EObject lv_external_links_60_0 = null;

        EObject lv_external_links_63_0 = null;

        EObject lv_healthcheck_66_0 = null;

        AntlrDatatypeRuleToken lv_hostname_69_0 = null;

        AntlrDatatypeRuleToken lv_image_71_0 = null;

        AntlrDatatypeRuleToken lv_init_74_0 = null;

        AntlrDatatypeRuleToken lv_ipc_77_0 = null;

        AntlrDatatypeRuleToken lv_isolation_80_0 = null;

        EObject lv_labels_83_0 = null;

        EObject lv_links_86_0 = null;

        EObject lv_logging_89_0 = null;

        AntlrDatatypeRuleToken lv_mac_address_92_0 = null;

        AntlrDatatypeRuleToken lv_network_mode_95_0 = null;

        EObject lv_networks_98_0 = null;

        AntlrDatatypeRuleToken lv_pid_101_0 = null;

        EObject lv_ports_104_0 = null;

        AntlrDatatypeRuleToken lv_privileged_107_0 = null;

        AntlrDatatypeRuleToken lv_read_only_110_0 = null;

        AntlrDatatypeRuleToken lv_restart_113_0 = null;

        EObject lv_secrets_116_0 = null;

        EObject lv_security_opt_119_0 = null;

        AntlrDatatypeRuleToken lv_shm_size_122_0 = null;

        AntlrDatatypeRuleToken lv_stdin_open_125_0 = null;

        AntlrDatatypeRuleToken lv_stop_grace_period_128_0 = null;

        AntlrDatatypeRuleToken lv_stop_signal_131_0 = null;

        EObject lv_sysctls_134_0 = null;

        EObject lv_sysctls_137_0 = null;

        AntlrDatatypeRuleToken lv_tty_140_0 = null;

        EObject lv_ulimits_143_0 = null;

        AntlrDatatypeRuleToken lv_user_146_0 = null;

        AntlrDatatypeRuleToken lv_userns_mode_149_0 = null;

        EObject lv_volumes_152_0 = null;

        AntlrDatatypeRuleToken lv_working_dir_155_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:307:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Build otherlv_5= Colon ( (lv_build_6_0= ruleBuild ) ) ) | (otherlv_7= Cap_add otherlv_8= Colon ( (lv_cap_add_9_0= ruleList ) ) ) | (otherlv_10= Cap_drop otherlv_11= Colon ( (lv_cap_drop_12_0= ruleList ) ) ) | (otherlv_13= Cgroup_parent otherlv_14= Colon ( (lv_cgroup_parent_15_0= ruleValue ) ) ) | (otherlv_16= Command otherlv_17= Colon ( (lv_command_18_0= ruleValue ) ) ) | (otherlv_19= Configs otherlv_20= Colon ( (lv_command_21_0= ruleValue ) ) ) | (otherlv_22= Container_name otherlv_23= Colon ( (lv_container_name_24_0= ruleValue ) ) ) | (otherlv_25= Credential_spec otherlv_26= Colon ( (lv_credential_spec_27_0= ruleCredentialSpec ) ) ) | (otherlv_28= Depends_on otherlv_29= Colon ( (lv_depends_on_30_0= ruleList ) ) ) | (otherlv_31= Deploy otherlv_32= Colon ( (lv_deploy_33_0= ruleDeploy ) ) ) | (otherlv_34= Devices otherlv_35= Colon ( (lv_devices_36_0= ruleList ) ) ) | (otherlv_37= Dns otherlv_38= Colon ( (lv_dns_39_0= ruleList ) ) ) | (otherlv_40= Dns_search otherlv_41= Colon ( (lv_dns_42_0= ruleList ) ) ) | (otherlv_43= Domainname otherlv_44= Colon ( (lv_domainname_45_0= ruleValue ) ) ) | (otherlv_46= Entrypoint otherlv_47= Colon ( (lv_entrypoint_48_0= ruleValueOrList ) ) ) | (otherlv_49= Env_file otherlv_50= Colon ( (lv_env_file_51_0= ruleValueOrList ) ) ) | (otherlv_52= Environment otherlv_53= Colon ( (lv_environment_54_0= ruleMapping ) ) ) | (otherlv_55= Expose otherlv_56= Colon ( (lv_expose_57_0= ruleList ) ) ) | (otherlv_58= External_links otherlv_59= Colon ( (lv_external_links_60_0= ruleList ) ) ) | (otherlv_61= Extra_hosts otherlv_62= Colon ( (lv_external_links_63_0= ruleListOrMapping ) ) ) | (otherlv_64= Healthcheck otherlv_65= Colon ( (lv_healthcheck_66_0= ruleHealthcheck ) ) ) | (otherlv_67= Hostname otherlv_68= Colon ( (lv_hostname_69_0= ruleValue ) ) ) | (otherlv_70= Image ( (lv_image_71_0= ruleValue ) ) ) | (otherlv_72= Init otherlv_73= Colon ( (lv_init_74_0= ruleValue ) ) ) | (otherlv_75= Ipc otherlv_76= Colon ( (lv_ipc_77_0= ruleValue ) ) ) | (otherlv_78= Isolation otherlv_79= Colon ( (lv_isolation_80_0= ruleValue ) ) ) | (otherlv_81= Labels otherlv_82= Colon ( (lv_labels_83_0= ruleListOrMapping ) ) ) | (otherlv_84= Links otherlv_85= Colon ( (lv_links_86_0= ruleListOrMapping ) ) ) | (otherlv_87= Logging otherlv_88= Colon ( (lv_logging_89_0= ruleLogging ) ) ) | (otherlv_90= Mac_address otherlv_91= Colon ( (lv_mac_address_92_0= ruleValue ) ) ) | (otherlv_93= Network_mode otherlv_94= Colon ( (lv_network_mode_95_0= ruleValue ) ) ) | (otherlv_96= Networks otherlv_97= Colon ( (lv_networks_98_0= ruleList ) ) ) | (otherlv_99= Pid otherlv_100= Colon ( (lv_pid_101_0= ruleValue ) ) ) | (otherlv_102= Ports otherlv_103= Colon ( (lv_ports_104_0= rulePorts ) ) ) | (otherlv_105= Privileged otherlv_106= Colon ( (lv_privileged_107_0= ruleValue ) ) ) | (otherlv_108= Read_only otherlv_109= Colon ( (lv_read_only_110_0= ruleValue ) ) ) | (otherlv_111= Restart otherlv_112= Colon ( (lv_restart_113_0= ruleValue ) ) ) | (otherlv_114= Secrets otherlv_115= Colon ( (lv_secrets_116_0= ruleServiceSecrets ) ) ) | (otherlv_117= Security_opt otherlv_118= Colon ( (lv_security_opt_119_0= ruleList ) ) ) | (otherlv_120= Shm_size otherlv_121= Colon ( (lv_shm_size_122_0= ruleValue ) ) ) | (otherlv_123= Stdin_open otherlv_124= Colon ( (lv_stdin_open_125_0= ruleValue ) ) ) | (otherlv_126= Stop_grace_period otherlv_127= Colon ( (lv_stop_grace_period_128_0= ruleValue ) ) ) | (otherlv_129= Stop_signal otherlv_130= Colon ( (lv_stop_signal_131_0= ruleValue ) ) ) | (otherlv_132= Sysctls otherlv_133= Colon ( (lv_sysctls_134_0= ruleListOrMapping ) ) ) | (otherlv_135= Tmpfs otherlv_136= Colon ( (lv_sysctls_137_0= ruleValueOrList ) ) ) | (otherlv_138= Tty otherlv_139= Colon ( (lv_tty_140_0= ruleValue ) ) ) | (otherlv_141= Ulimits otherlv_142= Colon ( (lv_ulimits_143_0= ruleUlimits ) ) ) | (otherlv_144= User otherlv_145= Colon ( (lv_user_146_0= ruleValue ) ) ) | (otherlv_147= Userns_mode otherlv_148= Colon ( (lv_userns_mode_149_0= ruleValue ) ) ) | (otherlv_150= Volumes otherlv_151= Colon ( (lv_volumes_152_0= ruleServiceVolumes ) ) ) | (otherlv_153= Working_dir otherlv_154= Colon ( (lv_working_dir_155_0= ruleValue ) ) ) )+ this_END_156= RULE_END ) )
            // InternalComposeFileParser.g:308:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Build otherlv_5= Colon ( (lv_build_6_0= ruleBuild ) ) ) | (otherlv_7= Cap_add otherlv_8= Colon ( (lv_cap_add_9_0= ruleList ) ) ) | (otherlv_10= Cap_drop otherlv_11= Colon ( (lv_cap_drop_12_0= ruleList ) ) ) | (otherlv_13= Cgroup_parent otherlv_14= Colon ( (lv_cgroup_parent_15_0= ruleValue ) ) ) | (otherlv_16= Command otherlv_17= Colon ( (lv_command_18_0= ruleValue ) ) ) | (otherlv_19= Configs otherlv_20= Colon ( (lv_command_21_0= ruleValue ) ) ) | (otherlv_22= Container_name otherlv_23= Colon ( (lv_container_name_24_0= ruleValue ) ) ) | (otherlv_25= Credential_spec otherlv_26= Colon ( (lv_credential_spec_27_0= ruleCredentialSpec ) ) ) | (otherlv_28= Depends_on otherlv_29= Colon ( (lv_depends_on_30_0= ruleList ) ) ) | (otherlv_31= Deploy otherlv_32= Colon ( (lv_deploy_33_0= ruleDeploy ) ) ) | (otherlv_34= Devices otherlv_35= Colon ( (lv_devices_36_0= ruleList ) ) ) | (otherlv_37= Dns otherlv_38= Colon ( (lv_dns_39_0= ruleList ) ) ) | (otherlv_40= Dns_search otherlv_41= Colon ( (lv_dns_42_0= ruleList ) ) ) | (otherlv_43= Domainname otherlv_44= Colon ( (lv_domainname_45_0= ruleValue ) ) ) | (otherlv_46= Entrypoint otherlv_47= Colon ( (lv_entrypoint_48_0= ruleValueOrList ) ) ) | (otherlv_49= Env_file otherlv_50= Colon ( (lv_env_file_51_0= ruleValueOrList ) ) ) | (otherlv_52= Environment otherlv_53= Colon ( (lv_environment_54_0= ruleMapping ) ) ) | (otherlv_55= Expose otherlv_56= Colon ( (lv_expose_57_0= ruleList ) ) ) | (otherlv_58= External_links otherlv_59= Colon ( (lv_external_links_60_0= ruleList ) ) ) | (otherlv_61= Extra_hosts otherlv_62= Colon ( (lv_external_links_63_0= ruleListOrMapping ) ) ) | (otherlv_64= Healthcheck otherlv_65= Colon ( (lv_healthcheck_66_0= ruleHealthcheck ) ) ) | (otherlv_67= Hostname otherlv_68= Colon ( (lv_hostname_69_0= ruleValue ) ) ) | (otherlv_70= Image ( (lv_image_71_0= ruleValue ) ) ) | (otherlv_72= Init otherlv_73= Colon ( (lv_init_74_0= ruleValue ) ) ) | (otherlv_75= Ipc otherlv_76= Colon ( (lv_ipc_77_0= ruleValue ) ) ) | (otherlv_78= Isolation otherlv_79= Colon ( (lv_isolation_80_0= ruleValue ) ) ) | (otherlv_81= Labels otherlv_82= Colon ( (lv_labels_83_0= ruleListOrMapping ) ) ) | (otherlv_84= Links otherlv_85= Colon ( (lv_links_86_0= ruleListOrMapping ) ) ) | (otherlv_87= Logging otherlv_88= Colon ( (lv_logging_89_0= ruleLogging ) ) ) | (otherlv_90= Mac_address otherlv_91= Colon ( (lv_mac_address_92_0= ruleValue ) ) ) | (otherlv_93= Network_mode otherlv_94= Colon ( (lv_network_mode_95_0= ruleValue ) ) ) | (otherlv_96= Networks otherlv_97= Colon ( (lv_networks_98_0= ruleList ) ) ) | (otherlv_99= Pid otherlv_100= Colon ( (lv_pid_101_0= ruleValue ) ) ) | (otherlv_102= Ports otherlv_103= Colon ( (lv_ports_104_0= rulePorts ) ) ) | (otherlv_105= Privileged otherlv_106= Colon ( (lv_privileged_107_0= ruleValue ) ) ) | (otherlv_108= Read_only otherlv_109= Colon ( (lv_read_only_110_0= ruleValue ) ) ) | (otherlv_111= Restart otherlv_112= Colon ( (lv_restart_113_0= ruleValue ) ) ) | (otherlv_114= Secrets otherlv_115= Colon ( (lv_secrets_116_0= ruleServiceSecrets ) ) ) | (otherlv_117= Security_opt otherlv_118= Colon ( (lv_security_opt_119_0= ruleList ) ) ) | (otherlv_120= Shm_size otherlv_121= Colon ( (lv_shm_size_122_0= ruleValue ) ) ) | (otherlv_123= Stdin_open otherlv_124= Colon ( (lv_stdin_open_125_0= ruleValue ) ) ) | (otherlv_126= Stop_grace_period otherlv_127= Colon ( (lv_stop_grace_period_128_0= ruleValue ) ) ) | (otherlv_129= Stop_signal otherlv_130= Colon ( (lv_stop_signal_131_0= ruleValue ) ) ) | (otherlv_132= Sysctls otherlv_133= Colon ( (lv_sysctls_134_0= ruleListOrMapping ) ) ) | (otherlv_135= Tmpfs otherlv_136= Colon ( (lv_sysctls_137_0= ruleValueOrList ) ) ) | (otherlv_138= Tty otherlv_139= Colon ( (lv_tty_140_0= ruleValue ) ) ) | (otherlv_141= Ulimits otherlv_142= Colon ( (lv_ulimits_143_0= ruleUlimits ) ) ) | (otherlv_144= User otherlv_145= Colon ( (lv_user_146_0= ruleValue ) ) ) | (otherlv_147= Userns_mode otherlv_148= Colon ( (lv_userns_mode_149_0= ruleValue ) ) ) | (otherlv_150= Volumes otherlv_151= Colon ( (lv_volumes_152_0= ruleServiceVolumes ) ) ) | (otherlv_153= Working_dir otherlv_154= Colon ( (lv_working_dir_155_0= ruleValue ) ) ) )+ this_END_156= RULE_END )
            {
            // InternalComposeFileParser.g:308:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Build otherlv_5= Colon ( (lv_build_6_0= ruleBuild ) ) ) | (otherlv_7= Cap_add otherlv_8= Colon ( (lv_cap_add_9_0= ruleList ) ) ) | (otherlv_10= Cap_drop otherlv_11= Colon ( (lv_cap_drop_12_0= ruleList ) ) ) | (otherlv_13= Cgroup_parent otherlv_14= Colon ( (lv_cgroup_parent_15_0= ruleValue ) ) ) | (otherlv_16= Command otherlv_17= Colon ( (lv_command_18_0= ruleValue ) ) ) | (otherlv_19= Configs otherlv_20= Colon ( (lv_command_21_0= ruleValue ) ) ) | (otherlv_22= Container_name otherlv_23= Colon ( (lv_container_name_24_0= ruleValue ) ) ) | (otherlv_25= Credential_spec otherlv_26= Colon ( (lv_credential_spec_27_0= ruleCredentialSpec ) ) ) | (otherlv_28= Depends_on otherlv_29= Colon ( (lv_depends_on_30_0= ruleList ) ) ) | (otherlv_31= Deploy otherlv_32= Colon ( (lv_deploy_33_0= ruleDeploy ) ) ) | (otherlv_34= Devices otherlv_35= Colon ( (lv_devices_36_0= ruleList ) ) ) | (otherlv_37= Dns otherlv_38= Colon ( (lv_dns_39_0= ruleList ) ) ) | (otherlv_40= Dns_search otherlv_41= Colon ( (lv_dns_42_0= ruleList ) ) ) | (otherlv_43= Domainname otherlv_44= Colon ( (lv_domainname_45_0= ruleValue ) ) ) | (otherlv_46= Entrypoint otherlv_47= Colon ( (lv_entrypoint_48_0= ruleValueOrList ) ) ) | (otherlv_49= Env_file otherlv_50= Colon ( (lv_env_file_51_0= ruleValueOrList ) ) ) | (otherlv_52= Environment otherlv_53= Colon ( (lv_environment_54_0= ruleMapping ) ) ) | (otherlv_55= Expose otherlv_56= Colon ( (lv_expose_57_0= ruleList ) ) ) | (otherlv_58= External_links otherlv_59= Colon ( (lv_external_links_60_0= ruleList ) ) ) | (otherlv_61= Extra_hosts otherlv_62= Colon ( (lv_external_links_63_0= ruleListOrMapping ) ) ) | (otherlv_64= Healthcheck otherlv_65= Colon ( (lv_healthcheck_66_0= ruleHealthcheck ) ) ) | (otherlv_67= Hostname otherlv_68= Colon ( (lv_hostname_69_0= ruleValue ) ) ) | (otherlv_70= Image ( (lv_image_71_0= ruleValue ) ) ) | (otherlv_72= Init otherlv_73= Colon ( (lv_init_74_0= ruleValue ) ) ) | (otherlv_75= Ipc otherlv_76= Colon ( (lv_ipc_77_0= ruleValue ) ) ) | (otherlv_78= Isolation otherlv_79= Colon ( (lv_isolation_80_0= ruleValue ) ) ) | (otherlv_81= Labels otherlv_82= Colon ( (lv_labels_83_0= ruleListOrMapping ) ) ) | (otherlv_84= Links otherlv_85= Colon ( (lv_links_86_0= ruleListOrMapping ) ) ) | (otherlv_87= Logging otherlv_88= Colon ( (lv_logging_89_0= ruleLogging ) ) ) | (otherlv_90= Mac_address otherlv_91= Colon ( (lv_mac_address_92_0= ruleValue ) ) ) | (otherlv_93= Network_mode otherlv_94= Colon ( (lv_network_mode_95_0= ruleValue ) ) ) | (otherlv_96= Networks otherlv_97= Colon ( (lv_networks_98_0= ruleList ) ) ) | (otherlv_99= Pid otherlv_100= Colon ( (lv_pid_101_0= ruleValue ) ) ) | (otherlv_102= Ports otherlv_103= Colon ( (lv_ports_104_0= rulePorts ) ) ) | (otherlv_105= Privileged otherlv_106= Colon ( (lv_privileged_107_0= ruleValue ) ) ) | (otherlv_108= Read_only otherlv_109= Colon ( (lv_read_only_110_0= ruleValue ) ) ) | (otherlv_111= Restart otherlv_112= Colon ( (lv_restart_113_0= ruleValue ) ) ) | (otherlv_114= Secrets otherlv_115= Colon ( (lv_secrets_116_0= ruleServiceSecrets ) ) ) | (otherlv_117= Security_opt otherlv_118= Colon ( (lv_security_opt_119_0= ruleList ) ) ) | (otherlv_120= Shm_size otherlv_121= Colon ( (lv_shm_size_122_0= ruleValue ) ) ) | (otherlv_123= Stdin_open otherlv_124= Colon ( (lv_stdin_open_125_0= ruleValue ) ) ) | (otherlv_126= Stop_grace_period otherlv_127= Colon ( (lv_stop_grace_period_128_0= ruleValue ) ) ) | (otherlv_129= Stop_signal otherlv_130= Colon ( (lv_stop_signal_131_0= ruleValue ) ) ) | (otherlv_132= Sysctls otherlv_133= Colon ( (lv_sysctls_134_0= ruleListOrMapping ) ) ) | (otherlv_135= Tmpfs otherlv_136= Colon ( (lv_sysctls_137_0= ruleValueOrList ) ) ) | (otherlv_138= Tty otherlv_139= Colon ( (lv_tty_140_0= ruleValue ) ) ) | (otherlv_141= Ulimits otherlv_142= Colon ( (lv_ulimits_143_0= ruleUlimits ) ) ) | (otherlv_144= User otherlv_145= Colon ( (lv_user_146_0= ruleValue ) ) ) | (otherlv_147= Userns_mode otherlv_148= Colon ( (lv_userns_mode_149_0= ruleValue ) ) ) | (otherlv_150= Volumes otherlv_151= Colon ( (lv_volumes_152_0= ruleServiceVolumes ) ) ) | (otherlv_153= Working_dir otherlv_154= Colon ( (lv_working_dir_155_0= ruleValue ) ) ) )+ this_END_156= RULE_END )
            // InternalComposeFileParser.g:309:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Build otherlv_5= Colon ( (lv_build_6_0= ruleBuild ) ) ) | (otherlv_7= Cap_add otherlv_8= Colon ( (lv_cap_add_9_0= ruleList ) ) ) | (otherlv_10= Cap_drop otherlv_11= Colon ( (lv_cap_drop_12_0= ruleList ) ) ) | (otherlv_13= Cgroup_parent otherlv_14= Colon ( (lv_cgroup_parent_15_0= ruleValue ) ) ) | (otherlv_16= Command otherlv_17= Colon ( (lv_command_18_0= ruleValue ) ) ) | (otherlv_19= Configs otherlv_20= Colon ( (lv_command_21_0= ruleValue ) ) ) | (otherlv_22= Container_name otherlv_23= Colon ( (lv_container_name_24_0= ruleValue ) ) ) | (otherlv_25= Credential_spec otherlv_26= Colon ( (lv_credential_spec_27_0= ruleCredentialSpec ) ) ) | (otherlv_28= Depends_on otherlv_29= Colon ( (lv_depends_on_30_0= ruleList ) ) ) | (otherlv_31= Deploy otherlv_32= Colon ( (lv_deploy_33_0= ruleDeploy ) ) ) | (otherlv_34= Devices otherlv_35= Colon ( (lv_devices_36_0= ruleList ) ) ) | (otherlv_37= Dns otherlv_38= Colon ( (lv_dns_39_0= ruleList ) ) ) | (otherlv_40= Dns_search otherlv_41= Colon ( (lv_dns_42_0= ruleList ) ) ) | (otherlv_43= Domainname otherlv_44= Colon ( (lv_domainname_45_0= ruleValue ) ) ) | (otherlv_46= Entrypoint otherlv_47= Colon ( (lv_entrypoint_48_0= ruleValueOrList ) ) ) | (otherlv_49= Env_file otherlv_50= Colon ( (lv_env_file_51_0= ruleValueOrList ) ) ) | (otherlv_52= Environment otherlv_53= Colon ( (lv_environment_54_0= ruleMapping ) ) ) | (otherlv_55= Expose otherlv_56= Colon ( (lv_expose_57_0= ruleList ) ) ) | (otherlv_58= External_links otherlv_59= Colon ( (lv_external_links_60_0= ruleList ) ) ) | (otherlv_61= Extra_hosts otherlv_62= Colon ( (lv_external_links_63_0= ruleListOrMapping ) ) ) | (otherlv_64= Healthcheck otherlv_65= Colon ( (lv_healthcheck_66_0= ruleHealthcheck ) ) ) | (otherlv_67= Hostname otherlv_68= Colon ( (lv_hostname_69_0= ruleValue ) ) ) | (otherlv_70= Image ( (lv_image_71_0= ruleValue ) ) ) | (otherlv_72= Init otherlv_73= Colon ( (lv_init_74_0= ruleValue ) ) ) | (otherlv_75= Ipc otherlv_76= Colon ( (lv_ipc_77_0= ruleValue ) ) ) | (otherlv_78= Isolation otherlv_79= Colon ( (lv_isolation_80_0= ruleValue ) ) ) | (otherlv_81= Labels otherlv_82= Colon ( (lv_labels_83_0= ruleListOrMapping ) ) ) | (otherlv_84= Links otherlv_85= Colon ( (lv_links_86_0= ruleListOrMapping ) ) ) | (otherlv_87= Logging otherlv_88= Colon ( (lv_logging_89_0= ruleLogging ) ) ) | (otherlv_90= Mac_address otherlv_91= Colon ( (lv_mac_address_92_0= ruleValue ) ) ) | (otherlv_93= Network_mode otherlv_94= Colon ( (lv_network_mode_95_0= ruleValue ) ) ) | (otherlv_96= Networks otherlv_97= Colon ( (lv_networks_98_0= ruleList ) ) ) | (otherlv_99= Pid otherlv_100= Colon ( (lv_pid_101_0= ruleValue ) ) ) | (otherlv_102= Ports otherlv_103= Colon ( (lv_ports_104_0= rulePorts ) ) ) | (otherlv_105= Privileged otherlv_106= Colon ( (lv_privileged_107_0= ruleValue ) ) ) | (otherlv_108= Read_only otherlv_109= Colon ( (lv_read_only_110_0= ruleValue ) ) ) | (otherlv_111= Restart otherlv_112= Colon ( (lv_restart_113_0= ruleValue ) ) ) | (otherlv_114= Secrets otherlv_115= Colon ( (lv_secrets_116_0= ruleServiceSecrets ) ) ) | (otherlv_117= Security_opt otherlv_118= Colon ( (lv_security_opt_119_0= ruleList ) ) ) | (otherlv_120= Shm_size otherlv_121= Colon ( (lv_shm_size_122_0= ruleValue ) ) ) | (otherlv_123= Stdin_open otherlv_124= Colon ( (lv_stdin_open_125_0= ruleValue ) ) ) | (otherlv_126= Stop_grace_period otherlv_127= Colon ( (lv_stop_grace_period_128_0= ruleValue ) ) ) | (otherlv_129= Stop_signal otherlv_130= Colon ( (lv_stop_signal_131_0= ruleValue ) ) ) | (otherlv_132= Sysctls otherlv_133= Colon ( (lv_sysctls_134_0= ruleListOrMapping ) ) ) | (otherlv_135= Tmpfs otherlv_136= Colon ( (lv_sysctls_137_0= ruleValueOrList ) ) ) | (otherlv_138= Tty otherlv_139= Colon ( (lv_tty_140_0= ruleValue ) ) ) | (otherlv_141= Ulimits otherlv_142= Colon ( (lv_ulimits_143_0= ruleUlimits ) ) ) | (otherlv_144= User otherlv_145= Colon ( (lv_user_146_0= ruleValue ) ) ) | (otherlv_147= Userns_mode otherlv_148= Colon ( (lv_userns_mode_149_0= ruleValue ) ) ) | (otherlv_150= Volumes otherlv_151= Colon ( (lv_volumes_152_0= ruleServiceVolumes ) ) ) | (otherlv_153= Working_dir otherlv_154= Colon ( (lv_working_dir_155_0= ruleValue ) ) ) )+ this_END_156= RULE_END
            {
            // InternalComposeFileParser.g:309:3: ()
            // InternalComposeFileParser.g:310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceAccess().getServiceAction_0(),
            					current);
            			

            }

            // InternalComposeFileParser.g:316:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComposeFileParser.g:317:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComposeFileParser.g:317:4: (lv_name_1_0= RULE_ID )
            // InternalComposeFileParser.g:318:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_12); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getServiceAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalComposeFileParser.g:342:3: ( (otherlv_4= Build otherlv_5= Colon ( (lv_build_6_0= ruleBuild ) ) ) | (otherlv_7= Cap_add otherlv_8= Colon ( (lv_cap_add_9_0= ruleList ) ) ) | (otherlv_10= Cap_drop otherlv_11= Colon ( (lv_cap_drop_12_0= ruleList ) ) ) | (otherlv_13= Cgroup_parent otherlv_14= Colon ( (lv_cgroup_parent_15_0= ruleValue ) ) ) | (otherlv_16= Command otherlv_17= Colon ( (lv_command_18_0= ruleValue ) ) ) | (otherlv_19= Configs otherlv_20= Colon ( (lv_command_21_0= ruleValue ) ) ) | (otherlv_22= Container_name otherlv_23= Colon ( (lv_container_name_24_0= ruleValue ) ) ) | (otherlv_25= Credential_spec otherlv_26= Colon ( (lv_credential_spec_27_0= ruleCredentialSpec ) ) ) | (otherlv_28= Depends_on otherlv_29= Colon ( (lv_depends_on_30_0= ruleList ) ) ) | (otherlv_31= Deploy otherlv_32= Colon ( (lv_deploy_33_0= ruleDeploy ) ) ) | (otherlv_34= Devices otherlv_35= Colon ( (lv_devices_36_0= ruleList ) ) ) | (otherlv_37= Dns otherlv_38= Colon ( (lv_dns_39_0= ruleList ) ) ) | (otherlv_40= Dns_search otherlv_41= Colon ( (lv_dns_42_0= ruleList ) ) ) | (otherlv_43= Domainname otherlv_44= Colon ( (lv_domainname_45_0= ruleValue ) ) ) | (otherlv_46= Entrypoint otherlv_47= Colon ( (lv_entrypoint_48_0= ruleValueOrList ) ) ) | (otherlv_49= Env_file otherlv_50= Colon ( (lv_env_file_51_0= ruleValueOrList ) ) ) | (otherlv_52= Environment otherlv_53= Colon ( (lv_environment_54_0= ruleMapping ) ) ) | (otherlv_55= Expose otherlv_56= Colon ( (lv_expose_57_0= ruleList ) ) ) | (otherlv_58= External_links otherlv_59= Colon ( (lv_external_links_60_0= ruleList ) ) ) | (otherlv_61= Extra_hosts otherlv_62= Colon ( (lv_external_links_63_0= ruleListOrMapping ) ) ) | (otherlv_64= Healthcheck otherlv_65= Colon ( (lv_healthcheck_66_0= ruleHealthcheck ) ) ) | (otherlv_67= Hostname otherlv_68= Colon ( (lv_hostname_69_0= ruleValue ) ) ) | (otherlv_70= Image ( (lv_image_71_0= ruleValue ) ) ) | (otherlv_72= Init otherlv_73= Colon ( (lv_init_74_0= ruleValue ) ) ) | (otherlv_75= Ipc otherlv_76= Colon ( (lv_ipc_77_0= ruleValue ) ) ) | (otherlv_78= Isolation otherlv_79= Colon ( (lv_isolation_80_0= ruleValue ) ) ) | (otherlv_81= Labels otherlv_82= Colon ( (lv_labels_83_0= ruleListOrMapping ) ) ) | (otherlv_84= Links otherlv_85= Colon ( (lv_links_86_0= ruleListOrMapping ) ) ) | (otherlv_87= Logging otherlv_88= Colon ( (lv_logging_89_0= ruleLogging ) ) ) | (otherlv_90= Mac_address otherlv_91= Colon ( (lv_mac_address_92_0= ruleValue ) ) ) | (otherlv_93= Network_mode otherlv_94= Colon ( (lv_network_mode_95_0= ruleValue ) ) ) | (otherlv_96= Networks otherlv_97= Colon ( (lv_networks_98_0= ruleList ) ) ) | (otherlv_99= Pid otherlv_100= Colon ( (lv_pid_101_0= ruleValue ) ) ) | (otherlv_102= Ports otherlv_103= Colon ( (lv_ports_104_0= rulePorts ) ) ) | (otherlv_105= Privileged otherlv_106= Colon ( (lv_privileged_107_0= ruleValue ) ) ) | (otherlv_108= Read_only otherlv_109= Colon ( (lv_read_only_110_0= ruleValue ) ) ) | (otherlv_111= Restart otherlv_112= Colon ( (lv_restart_113_0= ruleValue ) ) ) | (otherlv_114= Secrets otherlv_115= Colon ( (lv_secrets_116_0= ruleServiceSecrets ) ) ) | (otherlv_117= Security_opt otherlv_118= Colon ( (lv_security_opt_119_0= ruleList ) ) ) | (otherlv_120= Shm_size otherlv_121= Colon ( (lv_shm_size_122_0= ruleValue ) ) ) | (otherlv_123= Stdin_open otherlv_124= Colon ( (lv_stdin_open_125_0= ruleValue ) ) ) | (otherlv_126= Stop_grace_period otherlv_127= Colon ( (lv_stop_grace_period_128_0= ruleValue ) ) ) | (otherlv_129= Stop_signal otherlv_130= Colon ( (lv_stop_signal_131_0= ruleValue ) ) ) | (otherlv_132= Sysctls otherlv_133= Colon ( (lv_sysctls_134_0= ruleListOrMapping ) ) ) | (otherlv_135= Tmpfs otherlv_136= Colon ( (lv_sysctls_137_0= ruleValueOrList ) ) ) | (otherlv_138= Tty otherlv_139= Colon ( (lv_tty_140_0= ruleValue ) ) ) | (otherlv_141= Ulimits otherlv_142= Colon ( (lv_ulimits_143_0= ruleUlimits ) ) ) | (otherlv_144= User otherlv_145= Colon ( (lv_user_146_0= ruleValue ) ) ) | (otherlv_147= Userns_mode otherlv_148= Colon ( (lv_userns_mode_149_0= ruleValue ) ) ) | (otherlv_150= Volumes otherlv_151= Colon ( (lv_volumes_152_0= ruleServiceVolumes ) ) ) | (otherlv_153= Working_dir otherlv_154= Colon ( (lv_working_dir_155_0= ruleValue ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=52;
                switch ( input.LA(1) ) {
                case Build:
                    {
                    alt11=1;
                    }
                    break;
                case Cap_add:
                    {
                    alt11=2;
                    }
                    break;
                case Cap_drop:
                    {
                    alt11=3;
                    }
                    break;
                case Cgroup_parent:
                    {
                    alt11=4;
                    }
                    break;
                case Command:
                    {
                    alt11=5;
                    }
                    break;
                case Configs:
                    {
                    alt11=6;
                    }
                    break;
                case Container_name:
                    {
                    alt11=7;
                    }
                    break;
                case Credential_spec:
                    {
                    alt11=8;
                    }
                    break;
                case Depends_on:
                    {
                    alt11=9;
                    }
                    break;
                case Deploy:
                    {
                    alt11=10;
                    }
                    break;
                case Devices:
                    {
                    alt11=11;
                    }
                    break;
                case Dns:
                    {
                    alt11=12;
                    }
                    break;
                case Dns_search:
                    {
                    alt11=13;
                    }
                    break;
                case Domainname:
                    {
                    alt11=14;
                    }
                    break;
                case Entrypoint:
                    {
                    alt11=15;
                    }
                    break;
                case Env_file:
                    {
                    alt11=16;
                    }
                    break;
                case Environment:
                    {
                    alt11=17;
                    }
                    break;
                case Expose:
                    {
                    alt11=18;
                    }
                    break;
                case External_links:
                    {
                    alt11=19;
                    }
                    break;
                case Extra_hosts:
                    {
                    alt11=20;
                    }
                    break;
                case Healthcheck:
                    {
                    alt11=21;
                    }
                    break;
                case Hostname:
                    {
                    alt11=22;
                    }
                    break;
                case Image:
                    {
                    alt11=23;
                    }
                    break;
                case Init:
                    {
                    alt11=24;
                    }
                    break;
                case Ipc:
                    {
                    alt11=25;
                    }
                    break;
                case Isolation:
                    {
                    alt11=26;
                    }
                    break;
                case Labels:
                    {
                    alt11=27;
                    }
                    break;
                case Links:
                    {
                    alt11=28;
                    }
                    break;
                case Logging:
                    {
                    alt11=29;
                    }
                    break;
                case Mac_address:
                    {
                    alt11=30;
                    }
                    break;
                case Network_mode:
                    {
                    alt11=31;
                    }
                    break;
                case Networks:
                    {
                    alt11=32;
                    }
                    break;
                case Pid:
                    {
                    alt11=33;
                    }
                    break;
                case Ports:
                    {
                    alt11=34;
                    }
                    break;
                case Privileged:
                    {
                    alt11=35;
                    }
                    break;
                case Read_only:
                    {
                    alt11=36;
                    }
                    break;
                case Restart:
                    {
                    alt11=37;
                    }
                    break;
                case Secrets:
                    {
                    alt11=38;
                    }
                    break;
                case Security_opt:
                    {
                    alt11=39;
                    }
                    break;
                case Shm_size:
                    {
                    alt11=40;
                    }
                    break;
                case Stdin_open:
                    {
                    alt11=41;
                    }
                    break;
                case Stop_grace_period:
                    {
                    alt11=42;
                    }
                    break;
                case Stop_signal:
                    {
                    alt11=43;
                    }
                    break;
                case Sysctls:
                    {
                    alt11=44;
                    }
                    break;
                case Tmpfs:
                    {
                    alt11=45;
                    }
                    break;
                case Tty:
                    {
                    alt11=46;
                    }
                    break;
                case Ulimits:
                    {
                    alt11=47;
                    }
                    break;
                case User:
                    {
                    alt11=48;
                    }
                    break;
                case Userns_mode:
                    {
                    alt11=49;
                    }
                    break;
                case Volumes:
                    {
                    alt11=50;
                    }
                    break;
                case Working_dir:
                    {
                    alt11=51;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalComposeFileParser.g:343:4: (otherlv_4= Build otherlv_5= Colon ( (lv_build_6_0= ruleBuild ) ) )
            	    {
            	    // InternalComposeFileParser.g:343:4: (otherlv_4= Build otherlv_5= Colon ( (lv_build_6_0= ruleBuild ) ) )
            	    // InternalComposeFileParser.g:344:5: otherlv_4= Build otherlv_5= Colon ( (lv_build_6_0= ruleBuild ) )
            	    {
            	    otherlv_4=(Token)match(input,Build,FOLLOW_3); 

            	    					newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getBuildKeyword_4_0_0());
            	    				
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_13); 

            	    					newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getColonKeyword_4_0_1());
            	    				
            	    // InternalComposeFileParser.g:352:5: ( (lv_build_6_0= ruleBuild ) )
            	    // InternalComposeFileParser.g:353:6: (lv_build_6_0= ruleBuild )
            	    {
            	    // InternalComposeFileParser.g:353:6: (lv_build_6_0= ruleBuild )
            	    // InternalComposeFileParser.g:354:7: lv_build_6_0= ruleBuild
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getBuildBuildParserRuleCall_4_0_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_build_6_0=ruleBuild();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"build",
            	    								lv_build_6_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Build");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:373:4: (otherlv_7= Cap_add otherlv_8= Colon ( (lv_cap_add_9_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:373:4: (otherlv_7= Cap_add otherlv_8= Colon ( (lv_cap_add_9_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:374:5: otherlv_7= Cap_add otherlv_8= Colon ( (lv_cap_add_9_0= ruleList ) )
            	    {
            	    otherlv_7=(Token)match(input,Cap_add,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getCap_addKeyword_4_1_0());
            	    				
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getColonKeyword_4_1_1());
            	    				
            	    // InternalComposeFileParser.g:382:5: ( (lv_cap_add_9_0= ruleList ) )
            	    // InternalComposeFileParser.g:383:6: (lv_cap_add_9_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:383:6: (lv_cap_add_9_0= ruleList )
            	    // InternalComposeFileParser.g:384:7: lv_cap_add_9_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getCap_addListParserRuleCall_4_1_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_cap_add_9_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"cap_add",
            	    								lv_cap_add_9_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:403:4: (otherlv_10= Cap_drop otherlv_11= Colon ( (lv_cap_drop_12_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:403:4: (otherlv_10= Cap_drop otherlv_11= Colon ( (lv_cap_drop_12_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:404:5: otherlv_10= Cap_drop otherlv_11= Colon ( (lv_cap_drop_12_0= ruleList ) )
            	    {
            	    otherlv_10=(Token)match(input,Cap_drop,FOLLOW_3); 

            	    					newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getCap_dropKeyword_4_2_0());
            	    				
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getColonKeyword_4_2_1());
            	    				
            	    // InternalComposeFileParser.g:412:5: ( (lv_cap_drop_12_0= ruleList ) )
            	    // InternalComposeFileParser.g:413:6: (lv_cap_drop_12_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:413:6: (lv_cap_drop_12_0= ruleList )
            	    // InternalComposeFileParser.g:414:7: lv_cap_drop_12_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getCap_dropListParserRuleCall_4_2_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_cap_drop_12_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"cap_drop",
            	    								lv_cap_drop_12_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComposeFileParser.g:433:4: (otherlv_13= Cgroup_parent otherlv_14= Colon ( (lv_cgroup_parent_15_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:433:4: (otherlv_13= Cgroup_parent otherlv_14= Colon ( (lv_cgroup_parent_15_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:434:5: otherlv_13= Cgroup_parent otherlv_14= Colon ( (lv_cgroup_parent_15_0= ruleValue ) )
            	    {
            	    otherlv_13=(Token)match(input,Cgroup_parent,FOLLOW_3); 

            	    					newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getCgroup_parentKeyword_4_3_0());
            	    				
            	    otherlv_14=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getColonKeyword_4_3_1());
            	    				
            	    // InternalComposeFileParser.g:442:5: ( (lv_cgroup_parent_15_0= ruleValue ) )
            	    // InternalComposeFileParser.g:443:6: (lv_cgroup_parent_15_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:443:6: (lv_cgroup_parent_15_0= ruleValue )
            	    // InternalComposeFileParser.g:444:7: lv_cgroup_parent_15_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getCgroup_parentValueParserRuleCall_4_3_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_cgroup_parent_15_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"cgroup_parent",
            	    								lv_cgroup_parent_15_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComposeFileParser.g:463:4: (otherlv_16= Command otherlv_17= Colon ( (lv_command_18_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:463:4: (otherlv_16= Command otherlv_17= Colon ( (lv_command_18_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:464:5: otherlv_16= Command otherlv_17= Colon ( (lv_command_18_0= ruleValue ) )
            	    {
            	    otherlv_16=(Token)match(input,Command,FOLLOW_3); 

            	    					newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getCommandKeyword_4_4_0());
            	    				
            	    otherlv_17=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_17, grammarAccess.getServiceAccess().getColonKeyword_4_4_1());
            	    				
            	    // InternalComposeFileParser.g:472:5: ( (lv_command_18_0= ruleValue ) )
            	    // InternalComposeFileParser.g:473:6: (lv_command_18_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:473:6: (lv_command_18_0= ruleValue )
            	    // InternalComposeFileParser.g:474:7: lv_command_18_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getCommandValueParserRuleCall_4_4_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_command_18_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"command",
            	    								lv_command_18_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalComposeFileParser.g:493:4: (otherlv_19= Configs otherlv_20= Colon ( (lv_command_21_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:493:4: (otherlv_19= Configs otherlv_20= Colon ( (lv_command_21_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:494:5: otherlv_19= Configs otherlv_20= Colon ( (lv_command_21_0= ruleValue ) )
            	    {
            	    otherlv_19=(Token)match(input,Configs,FOLLOW_3); 

            	    					newLeafNode(otherlv_19, grammarAccess.getServiceAccess().getConfigsKeyword_4_5_0());
            	    				
            	    otherlv_20=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_20, grammarAccess.getServiceAccess().getColonKeyword_4_5_1());
            	    				
            	    // InternalComposeFileParser.g:502:5: ( (lv_command_21_0= ruleValue ) )
            	    // InternalComposeFileParser.g:503:6: (lv_command_21_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:503:6: (lv_command_21_0= ruleValue )
            	    // InternalComposeFileParser.g:504:7: lv_command_21_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getCommandValueParserRuleCall_4_5_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_command_21_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"command",
            	    								lv_command_21_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalComposeFileParser.g:523:4: (otherlv_22= Container_name otherlv_23= Colon ( (lv_container_name_24_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:523:4: (otherlv_22= Container_name otherlv_23= Colon ( (lv_container_name_24_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:524:5: otherlv_22= Container_name otherlv_23= Colon ( (lv_container_name_24_0= ruleValue ) )
            	    {
            	    otherlv_22=(Token)match(input,Container_name,FOLLOW_3); 

            	    					newLeafNode(otherlv_22, grammarAccess.getServiceAccess().getContainer_nameKeyword_4_6_0());
            	    				
            	    otherlv_23=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_23, grammarAccess.getServiceAccess().getColonKeyword_4_6_1());
            	    				
            	    // InternalComposeFileParser.g:532:5: ( (lv_container_name_24_0= ruleValue ) )
            	    // InternalComposeFileParser.g:533:6: (lv_container_name_24_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:533:6: (lv_container_name_24_0= ruleValue )
            	    // InternalComposeFileParser.g:534:7: lv_container_name_24_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getContainer_nameValueParserRuleCall_4_6_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_container_name_24_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"container_name",
            	    								lv_container_name_24_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalComposeFileParser.g:553:4: (otherlv_25= Credential_spec otherlv_26= Colon ( (lv_credential_spec_27_0= ruleCredentialSpec ) ) )
            	    {
            	    // InternalComposeFileParser.g:553:4: (otherlv_25= Credential_spec otherlv_26= Colon ( (lv_credential_spec_27_0= ruleCredentialSpec ) ) )
            	    // InternalComposeFileParser.g:554:5: otherlv_25= Credential_spec otherlv_26= Colon ( (lv_credential_spec_27_0= ruleCredentialSpec ) )
            	    {
            	    otherlv_25=(Token)match(input,Credential_spec,FOLLOW_3); 

            	    					newLeafNode(otherlv_25, grammarAccess.getServiceAccess().getCredential_specKeyword_4_7_0());
            	    				
            	    otherlv_26=(Token)match(input,Colon,FOLLOW_16); 

            	    					newLeafNode(otherlv_26, grammarAccess.getServiceAccess().getColonKeyword_4_7_1());
            	    				
            	    // InternalComposeFileParser.g:562:5: ( (lv_credential_spec_27_0= ruleCredentialSpec ) )
            	    // InternalComposeFileParser.g:563:6: (lv_credential_spec_27_0= ruleCredentialSpec )
            	    {
            	    // InternalComposeFileParser.g:563:6: (lv_credential_spec_27_0= ruleCredentialSpec )
            	    // InternalComposeFileParser.g:564:7: lv_credential_spec_27_0= ruleCredentialSpec
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getCredential_specCredentialSpecParserRuleCall_4_7_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_credential_spec_27_0=ruleCredentialSpec();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"credential_spec",
            	    								lv_credential_spec_27_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.CredentialSpec");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalComposeFileParser.g:583:4: (otherlv_28= Depends_on otherlv_29= Colon ( (lv_depends_on_30_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:583:4: (otherlv_28= Depends_on otherlv_29= Colon ( (lv_depends_on_30_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:584:5: otherlv_28= Depends_on otherlv_29= Colon ( (lv_depends_on_30_0= ruleList ) )
            	    {
            	    otherlv_28=(Token)match(input,Depends_on,FOLLOW_3); 

            	    					newLeafNode(otherlv_28, grammarAccess.getServiceAccess().getDepends_onKeyword_4_8_0());
            	    				
            	    otherlv_29=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_29, grammarAccess.getServiceAccess().getColonKeyword_4_8_1());
            	    				
            	    // InternalComposeFileParser.g:592:5: ( (lv_depends_on_30_0= ruleList ) )
            	    // InternalComposeFileParser.g:593:6: (lv_depends_on_30_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:593:6: (lv_depends_on_30_0= ruleList )
            	    // InternalComposeFileParser.g:594:7: lv_depends_on_30_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getDepends_onListParserRuleCall_4_8_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_depends_on_30_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"depends_on",
            	    								lv_depends_on_30_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalComposeFileParser.g:613:4: (otherlv_31= Deploy otherlv_32= Colon ( (lv_deploy_33_0= ruleDeploy ) ) )
            	    {
            	    // InternalComposeFileParser.g:613:4: (otherlv_31= Deploy otherlv_32= Colon ( (lv_deploy_33_0= ruleDeploy ) ) )
            	    // InternalComposeFileParser.g:614:5: otherlv_31= Deploy otherlv_32= Colon ( (lv_deploy_33_0= ruleDeploy ) )
            	    {
            	    otherlv_31=(Token)match(input,Deploy,FOLLOW_3); 

            	    					newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getDeployKeyword_4_9_0());
            	    				
            	    otherlv_32=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_32, grammarAccess.getServiceAccess().getColonKeyword_4_9_1());
            	    				
            	    // InternalComposeFileParser.g:622:5: ( (lv_deploy_33_0= ruleDeploy ) )
            	    // InternalComposeFileParser.g:623:6: (lv_deploy_33_0= ruleDeploy )
            	    {
            	    // InternalComposeFileParser.g:623:6: (lv_deploy_33_0= ruleDeploy )
            	    // InternalComposeFileParser.g:624:7: lv_deploy_33_0= ruleDeploy
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getDeployDeployParserRuleCall_4_9_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_deploy_33_0=ruleDeploy();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"deploy",
            	    								lv_deploy_33_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Deploy");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalComposeFileParser.g:643:4: (otherlv_34= Devices otherlv_35= Colon ( (lv_devices_36_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:643:4: (otherlv_34= Devices otherlv_35= Colon ( (lv_devices_36_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:644:5: otherlv_34= Devices otherlv_35= Colon ( (lv_devices_36_0= ruleList ) )
            	    {
            	    otherlv_34=(Token)match(input,Devices,FOLLOW_3); 

            	    					newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getDevicesKeyword_4_10_0());
            	    				
            	    otherlv_35=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_35, grammarAccess.getServiceAccess().getColonKeyword_4_10_1());
            	    				
            	    // InternalComposeFileParser.g:652:5: ( (lv_devices_36_0= ruleList ) )
            	    // InternalComposeFileParser.g:653:6: (lv_devices_36_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:653:6: (lv_devices_36_0= ruleList )
            	    // InternalComposeFileParser.g:654:7: lv_devices_36_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getDevicesListParserRuleCall_4_10_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_devices_36_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"devices",
            	    								lv_devices_36_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalComposeFileParser.g:673:4: (otherlv_37= Dns otherlv_38= Colon ( (lv_dns_39_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:673:4: (otherlv_37= Dns otherlv_38= Colon ( (lv_dns_39_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:674:5: otherlv_37= Dns otherlv_38= Colon ( (lv_dns_39_0= ruleList ) )
            	    {
            	    otherlv_37=(Token)match(input,Dns,FOLLOW_3); 

            	    					newLeafNode(otherlv_37, grammarAccess.getServiceAccess().getDnsKeyword_4_11_0());
            	    				
            	    otherlv_38=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_38, grammarAccess.getServiceAccess().getColonKeyword_4_11_1());
            	    				
            	    // InternalComposeFileParser.g:682:5: ( (lv_dns_39_0= ruleList ) )
            	    // InternalComposeFileParser.g:683:6: (lv_dns_39_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:683:6: (lv_dns_39_0= ruleList )
            	    // InternalComposeFileParser.g:684:7: lv_dns_39_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getDnsListParserRuleCall_4_11_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_dns_39_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"dns",
            	    								lv_dns_39_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalComposeFileParser.g:703:4: (otherlv_40= Dns_search otherlv_41= Colon ( (lv_dns_42_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:703:4: (otherlv_40= Dns_search otherlv_41= Colon ( (lv_dns_42_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:704:5: otherlv_40= Dns_search otherlv_41= Colon ( (lv_dns_42_0= ruleList ) )
            	    {
            	    otherlv_40=(Token)match(input,Dns_search,FOLLOW_3); 

            	    					newLeafNode(otherlv_40, grammarAccess.getServiceAccess().getDns_searchKeyword_4_12_0());
            	    				
            	    otherlv_41=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_41, grammarAccess.getServiceAccess().getColonKeyword_4_12_1());
            	    				
            	    // InternalComposeFileParser.g:712:5: ( (lv_dns_42_0= ruleList ) )
            	    // InternalComposeFileParser.g:713:6: (lv_dns_42_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:713:6: (lv_dns_42_0= ruleList )
            	    // InternalComposeFileParser.g:714:7: lv_dns_42_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getDnsListParserRuleCall_4_12_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_dns_42_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"dns",
            	    								lv_dns_42_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalComposeFileParser.g:733:4: (otherlv_43= Domainname otherlv_44= Colon ( (lv_domainname_45_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:733:4: (otherlv_43= Domainname otherlv_44= Colon ( (lv_domainname_45_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:734:5: otherlv_43= Domainname otherlv_44= Colon ( (lv_domainname_45_0= ruleValue ) )
            	    {
            	    otherlv_43=(Token)match(input,Domainname,FOLLOW_3); 

            	    					newLeafNode(otherlv_43, grammarAccess.getServiceAccess().getDomainnameKeyword_4_13_0());
            	    				
            	    otherlv_44=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_44, grammarAccess.getServiceAccess().getColonKeyword_4_13_1());
            	    				
            	    // InternalComposeFileParser.g:742:5: ( (lv_domainname_45_0= ruleValue ) )
            	    // InternalComposeFileParser.g:743:6: (lv_domainname_45_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:743:6: (lv_domainname_45_0= ruleValue )
            	    // InternalComposeFileParser.g:744:7: lv_domainname_45_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getDomainnameValueParserRuleCall_4_13_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_domainname_45_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"domainname",
            	    								lv_domainname_45_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalComposeFileParser.g:763:4: (otherlv_46= Entrypoint otherlv_47= Colon ( (lv_entrypoint_48_0= ruleValueOrList ) ) )
            	    {
            	    // InternalComposeFileParser.g:763:4: (otherlv_46= Entrypoint otherlv_47= Colon ( (lv_entrypoint_48_0= ruleValueOrList ) ) )
            	    // InternalComposeFileParser.g:764:5: otherlv_46= Entrypoint otherlv_47= Colon ( (lv_entrypoint_48_0= ruleValueOrList ) )
            	    {
            	    otherlv_46=(Token)match(input,Entrypoint,FOLLOW_3); 

            	    					newLeafNode(otherlv_46, grammarAccess.getServiceAccess().getEntrypointKeyword_4_14_0());
            	    				
            	    otherlv_47=(Token)match(input,Colon,FOLLOW_13); 

            	    					newLeafNode(otherlv_47, grammarAccess.getServiceAccess().getColonKeyword_4_14_1());
            	    				
            	    // InternalComposeFileParser.g:772:5: ( (lv_entrypoint_48_0= ruleValueOrList ) )
            	    // InternalComposeFileParser.g:773:6: (lv_entrypoint_48_0= ruleValueOrList )
            	    {
            	    // InternalComposeFileParser.g:773:6: (lv_entrypoint_48_0= ruleValueOrList )
            	    // InternalComposeFileParser.g:774:7: lv_entrypoint_48_0= ruleValueOrList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getEntrypointValueOrListParserRuleCall_4_14_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_entrypoint_48_0=ruleValueOrList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"entrypoint",
            	    								lv_entrypoint_48_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ValueOrList");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalComposeFileParser.g:793:4: (otherlv_49= Env_file otherlv_50= Colon ( (lv_env_file_51_0= ruleValueOrList ) ) )
            	    {
            	    // InternalComposeFileParser.g:793:4: (otherlv_49= Env_file otherlv_50= Colon ( (lv_env_file_51_0= ruleValueOrList ) ) )
            	    // InternalComposeFileParser.g:794:5: otherlv_49= Env_file otherlv_50= Colon ( (lv_env_file_51_0= ruleValueOrList ) )
            	    {
            	    otherlv_49=(Token)match(input,Env_file,FOLLOW_3); 

            	    					newLeafNode(otherlv_49, grammarAccess.getServiceAccess().getEnv_fileKeyword_4_15_0());
            	    				
            	    otherlv_50=(Token)match(input,Colon,FOLLOW_13); 

            	    					newLeafNode(otherlv_50, grammarAccess.getServiceAccess().getColonKeyword_4_15_1());
            	    				
            	    // InternalComposeFileParser.g:802:5: ( (lv_env_file_51_0= ruleValueOrList ) )
            	    // InternalComposeFileParser.g:803:6: (lv_env_file_51_0= ruleValueOrList )
            	    {
            	    // InternalComposeFileParser.g:803:6: (lv_env_file_51_0= ruleValueOrList )
            	    // InternalComposeFileParser.g:804:7: lv_env_file_51_0= ruleValueOrList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getEnv_fileValueOrListParserRuleCall_4_15_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_env_file_51_0=ruleValueOrList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"env_file",
            	    								lv_env_file_51_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ValueOrList");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalComposeFileParser.g:823:4: (otherlv_52= Environment otherlv_53= Colon ( (lv_environment_54_0= ruleMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:823:4: (otherlv_52= Environment otherlv_53= Colon ( (lv_environment_54_0= ruleMapping ) ) )
            	    // InternalComposeFileParser.g:824:5: otherlv_52= Environment otherlv_53= Colon ( (lv_environment_54_0= ruleMapping ) )
            	    {
            	    otherlv_52=(Token)match(input,Environment,FOLLOW_3); 

            	    					newLeafNode(otherlv_52, grammarAccess.getServiceAccess().getEnvironmentKeyword_4_16_0());
            	    				
            	    otherlv_53=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_53, grammarAccess.getServiceAccess().getColonKeyword_4_16_1());
            	    				
            	    // InternalComposeFileParser.g:832:5: ( (lv_environment_54_0= ruleMapping ) )
            	    // InternalComposeFileParser.g:833:6: (lv_environment_54_0= ruleMapping )
            	    {
            	    // InternalComposeFileParser.g:833:6: (lv_environment_54_0= ruleMapping )
            	    // InternalComposeFileParser.g:834:7: lv_environment_54_0= ruleMapping
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentMappingParserRuleCall_4_16_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_environment_54_0=ruleMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"environment",
            	    								lv_environment_54_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Mapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalComposeFileParser.g:853:4: (otherlv_55= Expose otherlv_56= Colon ( (lv_expose_57_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:853:4: (otherlv_55= Expose otherlv_56= Colon ( (lv_expose_57_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:854:5: otherlv_55= Expose otherlv_56= Colon ( (lv_expose_57_0= ruleList ) )
            	    {
            	    otherlv_55=(Token)match(input,Expose,FOLLOW_3); 

            	    					newLeafNode(otherlv_55, grammarAccess.getServiceAccess().getExposeKeyword_4_17_0());
            	    				
            	    otherlv_56=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_56, grammarAccess.getServiceAccess().getColonKeyword_4_17_1());
            	    				
            	    // InternalComposeFileParser.g:862:5: ( (lv_expose_57_0= ruleList ) )
            	    // InternalComposeFileParser.g:863:6: (lv_expose_57_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:863:6: (lv_expose_57_0= ruleList )
            	    // InternalComposeFileParser.g:864:7: lv_expose_57_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getExposeListParserRuleCall_4_17_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_expose_57_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"expose",
            	    								lv_expose_57_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalComposeFileParser.g:883:4: (otherlv_58= External_links otherlv_59= Colon ( (lv_external_links_60_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:883:4: (otherlv_58= External_links otherlv_59= Colon ( (lv_external_links_60_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:884:5: otherlv_58= External_links otherlv_59= Colon ( (lv_external_links_60_0= ruleList ) )
            	    {
            	    otherlv_58=(Token)match(input,External_links,FOLLOW_3); 

            	    					newLeafNode(otherlv_58, grammarAccess.getServiceAccess().getExternal_linksKeyword_4_18_0());
            	    				
            	    otherlv_59=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_59, grammarAccess.getServiceAccess().getColonKeyword_4_18_1());
            	    				
            	    // InternalComposeFileParser.g:892:5: ( (lv_external_links_60_0= ruleList ) )
            	    // InternalComposeFileParser.g:893:6: (lv_external_links_60_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:893:6: (lv_external_links_60_0= ruleList )
            	    // InternalComposeFileParser.g:894:7: lv_external_links_60_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getExternal_linksListParserRuleCall_4_18_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_external_links_60_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"external_links",
            	    								lv_external_links_60_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalComposeFileParser.g:913:4: (otherlv_61= Extra_hosts otherlv_62= Colon ( (lv_external_links_63_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:913:4: (otherlv_61= Extra_hosts otherlv_62= Colon ( (lv_external_links_63_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:914:5: otherlv_61= Extra_hosts otherlv_62= Colon ( (lv_external_links_63_0= ruleListOrMapping ) )
            	    {
            	    otherlv_61=(Token)match(input,Extra_hosts,FOLLOW_3); 

            	    					newLeafNode(otherlv_61, grammarAccess.getServiceAccess().getExtra_hostsKeyword_4_19_0());
            	    				
            	    otherlv_62=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_62, grammarAccess.getServiceAccess().getColonKeyword_4_19_1());
            	    				
            	    // InternalComposeFileParser.g:922:5: ( (lv_external_links_63_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:923:6: (lv_external_links_63_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:923:6: (lv_external_links_63_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:924:7: lv_external_links_63_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getExternal_linksListOrMappingParserRuleCall_4_19_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_external_links_63_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"external_links",
            	    								lv_external_links_63_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // InternalComposeFileParser.g:943:4: (otherlv_64= Healthcheck otherlv_65= Colon ( (lv_healthcheck_66_0= ruleHealthcheck ) ) )
            	    {
            	    // InternalComposeFileParser.g:943:4: (otherlv_64= Healthcheck otherlv_65= Colon ( (lv_healthcheck_66_0= ruleHealthcheck ) ) )
            	    // InternalComposeFileParser.g:944:5: otherlv_64= Healthcheck otherlv_65= Colon ( (lv_healthcheck_66_0= ruleHealthcheck ) )
            	    {
            	    otherlv_64=(Token)match(input,Healthcheck,FOLLOW_3); 

            	    					newLeafNode(otherlv_64, grammarAccess.getServiceAccess().getHealthcheckKeyword_4_20_0());
            	    				
            	    otherlv_65=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_65, grammarAccess.getServiceAccess().getColonKeyword_4_20_1());
            	    				
            	    // InternalComposeFileParser.g:952:5: ( (lv_healthcheck_66_0= ruleHealthcheck ) )
            	    // InternalComposeFileParser.g:953:6: (lv_healthcheck_66_0= ruleHealthcheck )
            	    {
            	    // InternalComposeFileParser.g:953:6: (lv_healthcheck_66_0= ruleHealthcheck )
            	    // InternalComposeFileParser.g:954:7: lv_healthcheck_66_0= ruleHealthcheck
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getHealthcheckHealthcheckParserRuleCall_4_20_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_healthcheck_66_0=ruleHealthcheck();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"healthcheck",
            	    								lv_healthcheck_66_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Healthcheck");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // InternalComposeFileParser.g:973:4: (otherlv_67= Hostname otherlv_68= Colon ( (lv_hostname_69_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:973:4: (otherlv_67= Hostname otherlv_68= Colon ( (lv_hostname_69_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:974:5: otherlv_67= Hostname otherlv_68= Colon ( (lv_hostname_69_0= ruleValue ) )
            	    {
            	    otherlv_67=(Token)match(input,Hostname,FOLLOW_3); 

            	    					newLeafNode(otherlv_67, grammarAccess.getServiceAccess().getHostnameKeyword_4_21_0());
            	    				
            	    otherlv_68=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_68, grammarAccess.getServiceAccess().getColonKeyword_4_21_1());
            	    				
            	    // InternalComposeFileParser.g:982:5: ( (lv_hostname_69_0= ruleValue ) )
            	    // InternalComposeFileParser.g:983:6: (lv_hostname_69_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:983:6: (lv_hostname_69_0= ruleValue )
            	    // InternalComposeFileParser.g:984:7: lv_hostname_69_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getHostnameValueParserRuleCall_4_21_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_hostname_69_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"hostname",
            	    								lv_hostname_69_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 23 :
            	    // InternalComposeFileParser.g:1003:4: (otherlv_70= Image ( (lv_image_71_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1003:4: (otherlv_70= Image ( (lv_image_71_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1004:5: otherlv_70= Image ( (lv_image_71_0= ruleValue ) )
            	    {
            	    otherlv_70=(Token)match(input,Image,FOLLOW_15); 

            	    					newLeafNode(otherlv_70, grammarAccess.getServiceAccess().getImageKeyword_4_22_0());
            	    				
            	    // InternalComposeFileParser.g:1008:5: ( (lv_image_71_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1009:6: (lv_image_71_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1009:6: (lv_image_71_0= ruleValue )
            	    // InternalComposeFileParser.g:1010:7: lv_image_71_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getImageValueParserRuleCall_4_22_1_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_image_71_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"image",
            	    								lv_image_71_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // InternalComposeFileParser.g:1029:4: (otherlv_72= Init otherlv_73= Colon ( (lv_init_74_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1029:4: (otherlv_72= Init otherlv_73= Colon ( (lv_init_74_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1030:5: otherlv_72= Init otherlv_73= Colon ( (lv_init_74_0= ruleValue ) )
            	    {
            	    otherlv_72=(Token)match(input,Init,FOLLOW_3); 

            	    					newLeafNode(otherlv_72, grammarAccess.getServiceAccess().getInitKeyword_4_23_0());
            	    				
            	    otherlv_73=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_73, grammarAccess.getServiceAccess().getColonKeyword_4_23_1());
            	    				
            	    // InternalComposeFileParser.g:1038:5: ( (lv_init_74_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1039:6: (lv_init_74_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1039:6: (lv_init_74_0= ruleValue )
            	    // InternalComposeFileParser.g:1040:7: lv_init_74_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getInitValueParserRuleCall_4_23_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_init_74_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"init",
            	    								lv_init_74_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 25 :
            	    // InternalComposeFileParser.g:1059:4: (otherlv_75= Ipc otherlv_76= Colon ( (lv_ipc_77_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1059:4: (otherlv_75= Ipc otherlv_76= Colon ( (lv_ipc_77_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1060:5: otherlv_75= Ipc otherlv_76= Colon ( (lv_ipc_77_0= ruleValue ) )
            	    {
            	    otherlv_75=(Token)match(input,Ipc,FOLLOW_3); 

            	    					newLeafNode(otherlv_75, grammarAccess.getServiceAccess().getIpcKeyword_4_24_0());
            	    				
            	    otherlv_76=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_76, grammarAccess.getServiceAccess().getColonKeyword_4_24_1());
            	    				
            	    // InternalComposeFileParser.g:1068:5: ( (lv_ipc_77_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1069:6: (lv_ipc_77_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1069:6: (lv_ipc_77_0= ruleValue )
            	    // InternalComposeFileParser.g:1070:7: lv_ipc_77_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getIpcValueParserRuleCall_4_24_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_ipc_77_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"ipc",
            	    								lv_ipc_77_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 26 :
            	    // InternalComposeFileParser.g:1089:4: (otherlv_78= Isolation otherlv_79= Colon ( (lv_isolation_80_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1089:4: (otherlv_78= Isolation otherlv_79= Colon ( (lv_isolation_80_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1090:5: otherlv_78= Isolation otherlv_79= Colon ( (lv_isolation_80_0= ruleValue ) )
            	    {
            	    otherlv_78=(Token)match(input,Isolation,FOLLOW_3); 

            	    					newLeafNode(otherlv_78, grammarAccess.getServiceAccess().getIsolationKeyword_4_25_0());
            	    				
            	    otherlv_79=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_79, grammarAccess.getServiceAccess().getColonKeyword_4_25_1());
            	    				
            	    // InternalComposeFileParser.g:1098:5: ( (lv_isolation_80_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1099:6: (lv_isolation_80_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1099:6: (lv_isolation_80_0= ruleValue )
            	    // InternalComposeFileParser.g:1100:7: lv_isolation_80_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getIsolationValueParserRuleCall_4_25_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_isolation_80_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"isolation",
            	    								lv_isolation_80_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 27 :
            	    // InternalComposeFileParser.g:1119:4: (otherlv_81= Labels otherlv_82= Colon ( (lv_labels_83_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:1119:4: (otherlv_81= Labels otherlv_82= Colon ( (lv_labels_83_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:1120:5: otherlv_81= Labels otherlv_82= Colon ( (lv_labels_83_0= ruleListOrMapping ) )
            	    {
            	    otherlv_81=(Token)match(input,Labels,FOLLOW_3); 

            	    					newLeafNode(otherlv_81, grammarAccess.getServiceAccess().getLabelsKeyword_4_26_0());
            	    				
            	    otherlv_82=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_82, grammarAccess.getServiceAccess().getColonKeyword_4_26_1());
            	    				
            	    // InternalComposeFileParser.g:1128:5: ( (lv_labels_83_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:1129:6: (lv_labels_83_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:1129:6: (lv_labels_83_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:1130:7: lv_labels_83_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getLabelsListOrMappingParserRuleCall_4_26_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_labels_83_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"labels",
            	    								lv_labels_83_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 28 :
            	    // InternalComposeFileParser.g:1149:4: (otherlv_84= Links otherlv_85= Colon ( (lv_links_86_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:1149:4: (otherlv_84= Links otherlv_85= Colon ( (lv_links_86_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:1150:5: otherlv_84= Links otherlv_85= Colon ( (lv_links_86_0= ruleListOrMapping ) )
            	    {
            	    otherlv_84=(Token)match(input,Links,FOLLOW_3); 

            	    					newLeafNode(otherlv_84, grammarAccess.getServiceAccess().getLinksKeyword_4_27_0());
            	    				
            	    otherlv_85=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_85, grammarAccess.getServiceAccess().getColonKeyword_4_27_1());
            	    				
            	    // InternalComposeFileParser.g:1158:5: ( (lv_links_86_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:1159:6: (lv_links_86_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:1159:6: (lv_links_86_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:1160:7: lv_links_86_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getLinksListOrMappingParserRuleCall_4_27_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_links_86_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"links",
            	    								lv_links_86_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 29 :
            	    // InternalComposeFileParser.g:1179:4: (otherlv_87= Logging otherlv_88= Colon ( (lv_logging_89_0= ruleLogging ) ) )
            	    {
            	    // InternalComposeFileParser.g:1179:4: (otherlv_87= Logging otherlv_88= Colon ( (lv_logging_89_0= ruleLogging ) ) )
            	    // InternalComposeFileParser.g:1180:5: otherlv_87= Logging otherlv_88= Colon ( (lv_logging_89_0= ruleLogging ) )
            	    {
            	    otherlv_87=(Token)match(input,Logging,FOLLOW_3); 

            	    					newLeafNode(otherlv_87, grammarAccess.getServiceAccess().getLoggingKeyword_4_28_0());
            	    				
            	    otherlv_88=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_88, grammarAccess.getServiceAccess().getColonKeyword_4_28_1());
            	    				
            	    // InternalComposeFileParser.g:1188:5: ( (lv_logging_89_0= ruleLogging ) )
            	    // InternalComposeFileParser.g:1189:6: (lv_logging_89_0= ruleLogging )
            	    {
            	    // InternalComposeFileParser.g:1189:6: (lv_logging_89_0= ruleLogging )
            	    // InternalComposeFileParser.g:1190:7: lv_logging_89_0= ruleLogging
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getLoggingLoggingParserRuleCall_4_28_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_logging_89_0=ruleLogging();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"logging",
            	    								lv_logging_89_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Logging");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 30 :
            	    // InternalComposeFileParser.g:1209:4: (otherlv_90= Mac_address otherlv_91= Colon ( (lv_mac_address_92_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1209:4: (otherlv_90= Mac_address otherlv_91= Colon ( (lv_mac_address_92_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1210:5: otherlv_90= Mac_address otherlv_91= Colon ( (lv_mac_address_92_0= ruleValue ) )
            	    {
            	    otherlv_90=(Token)match(input,Mac_address,FOLLOW_3); 

            	    					newLeafNode(otherlv_90, grammarAccess.getServiceAccess().getMac_addressKeyword_4_29_0());
            	    				
            	    otherlv_91=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_91, grammarAccess.getServiceAccess().getColonKeyword_4_29_1());
            	    				
            	    // InternalComposeFileParser.g:1218:5: ( (lv_mac_address_92_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1219:6: (lv_mac_address_92_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1219:6: (lv_mac_address_92_0= ruleValue )
            	    // InternalComposeFileParser.g:1220:7: lv_mac_address_92_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getMac_addressValueParserRuleCall_4_29_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_mac_address_92_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"mac_address",
            	    								lv_mac_address_92_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 31 :
            	    // InternalComposeFileParser.g:1239:4: (otherlv_93= Network_mode otherlv_94= Colon ( (lv_network_mode_95_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1239:4: (otherlv_93= Network_mode otherlv_94= Colon ( (lv_network_mode_95_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1240:5: otherlv_93= Network_mode otherlv_94= Colon ( (lv_network_mode_95_0= ruleValue ) )
            	    {
            	    otherlv_93=(Token)match(input,Network_mode,FOLLOW_3); 

            	    					newLeafNode(otherlv_93, grammarAccess.getServiceAccess().getNetwork_modeKeyword_4_30_0());
            	    				
            	    otherlv_94=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_94, grammarAccess.getServiceAccess().getColonKeyword_4_30_1());
            	    				
            	    // InternalComposeFileParser.g:1248:5: ( (lv_network_mode_95_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1249:6: (lv_network_mode_95_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1249:6: (lv_network_mode_95_0= ruleValue )
            	    // InternalComposeFileParser.g:1250:7: lv_network_mode_95_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getNetwork_modeValueParserRuleCall_4_30_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_network_mode_95_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"network_mode",
            	    								lv_network_mode_95_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 32 :
            	    // InternalComposeFileParser.g:1269:4: (otherlv_96= Networks otherlv_97= Colon ( (lv_networks_98_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:1269:4: (otherlv_96= Networks otherlv_97= Colon ( (lv_networks_98_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:1270:5: otherlv_96= Networks otherlv_97= Colon ( (lv_networks_98_0= ruleList ) )
            	    {
            	    otherlv_96=(Token)match(input,Networks,FOLLOW_3); 

            	    					newLeafNode(otherlv_96, grammarAccess.getServiceAccess().getNetworksKeyword_4_31_0());
            	    				
            	    otherlv_97=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_97, grammarAccess.getServiceAccess().getColonKeyword_4_31_1());
            	    				
            	    // InternalComposeFileParser.g:1278:5: ( (lv_networks_98_0= ruleList ) )
            	    // InternalComposeFileParser.g:1279:6: (lv_networks_98_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:1279:6: (lv_networks_98_0= ruleList )
            	    // InternalComposeFileParser.g:1280:7: lv_networks_98_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getNetworksListParserRuleCall_4_31_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_networks_98_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"networks",
            	    								lv_networks_98_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 33 :
            	    // InternalComposeFileParser.g:1299:4: (otherlv_99= Pid otherlv_100= Colon ( (lv_pid_101_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1299:4: (otherlv_99= Pid otherlv_100= Colon ( (lv_pid_101_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1300:5: otherlv_99= Pid otherlv_100= Colon ( (lv_pid_101_0= ruleValue ) )
            	    {
            	    otherlv_99=(Token)match(input,Pid,FOLLOW_3); 

            	    					newLeafNode(otherlv_99, grammarAccess.getServiceAccess().getPidKeyword_4_32_0());
            	    				
            	    otherlv_100=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_100, grammarAccess.getServiceAccess().getColonKeyword_4_32_1());
            	    				
            	    // InternalComposeFileParser.g:1308:5: ( (lv_pid_101_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1309:6: (lv_pid_101_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1309:6: (lv_pid_101_0= ruleValue )
            	    // InternalComposeFileParser.g:1310:7: lv_pid_101_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getPidValueParserRuleCall_4_32_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_pid_101_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"pid",
            	    								lv_pid_101_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 34 :
            	    // InternalComposeFileParser.g:1329:4: (otherlv_102= Ports otherlv_103= Colon ( (lv_ports_104_0= rulePorts ) ) )
            	    {
            	    // InternalComposeFileParser.g:1329:4: (otherlv_102= Ports otherlv_103= Colon ( (lv_ports_104_0= rulePorts ) ) )
            	    // InternalComposeFileParser.g:1330:5: otherlv_102= Ports otherlv_103= Colon ( (lv_ports_104_0= rulePorts ) )
            	    {
            	    otherlv_102=(Token)match(input,Ports,FOLLOW_3); 

            	    					newLeafNode(otherlv_102, grammarAccess.getServiceAccess().getPortsKeyword_4_33_0());
            	    				
            	    otherlv_103=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_103, grammarAccess.getServiceAccess().getColonKeyword_4_33_1());
            	    				
            	    // InternalComposeFileParser.g:1338:5: ( (lv_ports_104_0= rulePorts ) )
            	    // InternalComposeFileParser.g:1339:6: (lv_ports_104_0= rulePorts )
            	    {
            	    // InternalComposeFileParser.g:1339:6: (lv_ports_104_0= rulePorts )
            	    // InternalComposeFileParser.g:1340:7: lv_ports_104_0= rulePorts
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getPortsPortsParserRuleCall_4_33_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_ports_104_0=rulePorts();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"ports",
            	    								lv_ports_104_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Ports");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 35 :
            	    // InternalComposeFileParser.g:1359:4: (otherlv_105= Privileged otherlv_106= Colon ( (lv_privileged_107_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1359:4: (otherlv_105= Privileged otherlv_106= Colon ( (lv_privileged_107_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1360:5: otherlv_105= Privileged otherlv_106= Colon ( (lv_privileged_107_0= ruleValue ) )
            	    {
            	    otherlv_105=(Token)match(input,Privileged,FOLLOW_3); 

            	    					newLeafNode(otherlv_105, grammarAccess.getServiceAccess().getPrivilegedKeyword_4_34_0());
            	    				
            	    otherlv_106=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_106, grammarAccess.getServiceAccess().getColonKeyword_4_34_1());
            	    				
            	    // InternalComposeFileParser.g:1368:5: ( (lv_privileged_107_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1369:6: (lv_privileged_107_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1369:6: (lv_privileged_107_0= ruleValue )
            	    // InternalComposeFileParser.g:1370:7: lv_privileged_107_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getPrivilegedValueParserRuleCall_4_34_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_privileged_107_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"privileged",
            	    								lv_privileged_107_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 36 :
            	    // InternalComposeFileParser.g:1389:4: (otherlv_108= Read_only otherlv_109= Colon ( (lv_read_only_110_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1389:4: (otherlv_108= Read_only otherlv_109= Colon ( (lv_read_only_110_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1390:5: otherlv_108= Read_only otherlv_109= Colon ( (lv_read_only_110_0= ruleValue ) )
            	    {
            	    otherlv_108=(Token)match(input,Read_only,FOLLOW_3); 

            	    					newLeafNode(otherlv_108, grammarAccess.getServiceAccess().getRead_onlyKeyword_4_35_0());
            	    				
            	    otherlv_109=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_109, grammarAccess.getServiceAccess().getColonKeyword_4_35_1());
            	    				
            	    // InternalComposeFileParser.g:1398:5: ( (lv_read_only_110_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1399:6: (lv_read_only_110_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1399:6: (lv_read_only_110_0= ruleValue )
            	    // InternalComposeFileParser.g:1400:7: lv_read_only_110_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getRead_onlyValueParserRuleCall_4_35_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_read_only_110_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"read_only",
            	    								lv_read_only_110_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 37 :
            	    // InternalComposeFileParser.g:1419:4: (otherlv_111= Restart otherlv_112= Colon ( (lv_restart_113_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1419:4: (otherlv_111= Restart otherlv_112= Colon ( (lv_restart_113_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1420:5: otherlv_111= Restart otherlv_112= Colon ( (lv_restart_113_0= ruleValue ) )
            	    {
            	    otherlv_111=(Token)match(input,Restart,FOLLOW_3); 

            	    					newLeafNode(otherlv_111, grammarAccess.getServiceAccess().getRestartKeyword_4_36_0());
            	    				
            	    otherlv_112=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_112, grammarAccess.getServiceAccess().getColonKeyword_4_36_1());
            	    				
            	    // InternalComposeFileParser.g:1428:5: ( (lv_restart_113_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1429:6: (lv_restart_113_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1429:6: (lv_restart_113_0= ruleValue )
            	    // InternalComposeFileParser.g:1430:7: lv_restart_113_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getRestartValueParserRuleCall_4_36_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_restart_113_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"restart",
            	    								lv_restart_113_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 38 :
            	    // InternalComposeFileParser.g:1449:4: (otherlv_114= Secrets otherlv_115= Colon ( (lv_secrets_116_0= ruleServiceSecrets ) ) )
            	    {
            	    // InternalComposeFileParser.g:1449:4: (otherlv_114= Secrets otherlv_115= Colon ( (lv_secrets_116_0= ruleServiceSecrets ) ) )
            	    // InternalComposeFileParser.g:1450:5: otherlv_114= Secrets otherlv_115= Colon ( (lv_secrets_116_0= ruleServiceSecrets ) )
            	    {
            	    otherlv_114=(Token)match(input,Secrets,FOLLOW_3); 

            	    					newLeafNode(otherlv_114, grammarAccess.getServiceAccess().getSecretsKeyword_4_37_0());
            	    				
            	    otherlv_115=(Token)match(input,Colon,FOLLOW_13); 

            	    					newLeafNode(otherlv_115, grammarAccess.getServiceAccess().getColonKeyword_4_37_1());
            	    				
            	    // InternalComposeFileParser.g:1458:5: ( (lv_secrets_116_0= ruleServiceSecrets ) )
            	    // InternalComposeFileParser.g:1459:6: (lv_secrets_116_0= ruleServiceSecrets )
            	    {
            	    // InternalComposeFileParser.g:1459:6: (lv_secrets_116_0= ruleServiceSecrets )
            	    // InternalComposeFileParser.g:1460:7: lv_secrets_116_0= ruleServiceSecrets
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getSecretsServiceSecretsParserRuleCall_4_37_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_secrets_116_0=ruleServiceSecrets();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"secrets",
            	    								lv_secrets_116_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ServiceSecrets");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 39 :
            	    // InternalComposeFileParser.g:1479:4: (otherlv_117= Security_opt otherlv_118= Colon ( (lv_security_opt_119_0= ruleList ) ) )
            	    {
            	    // InternalComposeFileParser.g:1479:4: (otherlv_117= Security_opt otherlv_118= Colon ( (lv_security_opt_119_0= ruleList ) ) )
            	    // InternalComposeFileParser.g:1480:5: otherlv_117= Security_opt otherlv_118= Colon ( (lv_security_opt_119_0= ruleList ) )
            	    {
            	    otherlv_117=(Token)match(input,Security_opt,FOLLOW_3); 

            	    					newLeafNode(otherlv_117, grammarAccess.getServiceAccess().getSecurity_optKeyword_4_38_0());
            	    				
            	    otherlv_118=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_118, grammarAccess.getServiceAccess().getColonKeyword_4_38_1());
            	    				
            	    // InternalComposeFileParser.g:1488:5: ( (lv_security_opt_119_0= ruleList ) )
            	    // InternalComposeFileParser.g:1489:6: (lv_security_opt_119_0= ruleList )
            	    {
            	    // InternalComposeFileParser.g:1489:6: (lv_security_opt_119_0= ruleList )
            	    // InternalComposeFileParser.g:1490:7: lv_security_opt_119_0= ruleList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getSecurity_optListParserRuleCall_4_38_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_security_opt_119_0=ruleList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"security_opt",
            	    								lv_security_opt_119_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 40 :
            	    // InternalComposeFileParser.g:1509:4: (otherlv_120= Shm_size otherlv_121= Colon ( (lv_shm_size_122_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1509:4: (otherlv_120= Shm_size otherlv_121= Colon ( (lv_shm_size_122_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1510:5: otherlv_120= Shm_size otherlv_121= Colon ( (lv_shm_size_122_0= ruleValue ) )
            	    {
            	    otherlv_120=(Token)match(input,Shm_size,FOLLOW_3); 

            	    					newLeafNode(otherlv_120, grammarAccess.getServiceAccess().getShm_sizeKeyword_4_39_0());
            	    				
            	    otherlv_121=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_121, grammarAccess.getServiceAccess().getColonKeyword_4_39_1());
            	    				
            	    // InternalComposeFileParser.g:1518:5: ( (lv_shm_size_122_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1519:6: (lv_shm_size_122_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1519:6: (lv_shm_size_122_0= ruleValue )
            	    // InternalComposeFileParser.g:1520:7: lv_shm_size_122_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getShm_sizeValueParserRuleCall_4_39_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_shm_size_122_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"shm_size",
            	    								lv_shm_size_122_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 41 :
            	    // InternalComposeFileParser.g:1539:4: (otherlv_123= Stdin_open otherlv_124= Colon ( (lv_stdin_open_125_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1539:4: (otherlv_123= Stdin_open otherlv_124= Colon ( (lv_stdin_open_125_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1540:5: otherlv_123= Stdin_open otherlv_124= Colon ( (lv_stdin_open_125_0= ruleValue ) )
            	    {
            	    otherlv_123=(Token)match(input,Stdin_open,FOLLOW_3); 

            	    					newLeafNode(otherlv_123, grammarAccess.getServiceAccess().getStdin_openKeyword_4_40_0());
            	    				
            	    otherlv_124=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_124, grammarAccess.getServiceAccess().getColonKeyword_4_40_1());
            	    				
            	    // InternalComposeFileParser.g:1548:5: ( (lv_stdin_open_125_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1549:6: (lv_stdin_open_125_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1549:6: (lv_stdin_open_125_0= ruleValue )
            	    // InternalComposeFileParser.g:1550:7: lv_stdin_open_125_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getStdin_openValueParserRuleCall_4_40_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_stdin_open_125_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"stdin_open",
            	    								lv_stdin_open_125_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 42 :
            	    // InternalComposeFileParser.g:1569:4: (otherlv_126= Stop_grace_period otherlv_127= Colon ( (lv_stop_grace_period_128_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1569:4: (otherlv_126= Stop_grace_period otherlv_127= Colon ( (lv_stop_grace_period_128_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1570:5: otherlv_126= Stop_grace_period otherlv_127= Colon ( (lv_stop_grace_period_128_0= ruleValue ) )
            	    {
            	    otherlv_126=(Token)match(input,Stop_grace_period,FOLLOW_3); 

            	    					newLeafNode(otherlv_126, grammarAccess.getServiceAccess().getStop_grace_periodKeyword_4_41_0());
            	    				
            	    otherlv_127=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_127, grammarAccess.getServiceAccess().getColonKeyword_4_41_1());
            	    				
            	    // InternalComposeFileParser.g:1578:5: ( (lv_stop_grace_period_128_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1579:6: (lv_stop_grace_period_128_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1579:6: (lv_stop_grace_period_128_0= ruleValue )
            	    // InternalComposeFileParser.g:1580:7: lv_stop_grace_period_128_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getStop_grace_periodValueParserRuleCall_4_41_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_stop_grace_period_128_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"stop_grace_period",
            	    								lv_stop_grace_period_128_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 43 :
            	    // InternalComposeFileParser.g:1599:4: (otherlv_129= Stop_signal otherlv_130= Colon ( (lv_stop_signal_131_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1599:4: (otherlv_129= Stop_signal otherlv_130= Colon ( (lv_stop_signal_131_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1600:5: otherlv_129= Stop_signal otherlv_130= Colon ( (lv_stop_signal_131_0= ruleValue ) )
            	    {
            	    otherlv_129=(Token)match(input,Stop_signal,FOLLOW_3); 

            	    					newLeafNode(otherlv_129, grammarAccess.getServiceAccess().getStop_signalKeyword_4_42_0());
            	    				
            	    otherlv_130=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_130, grammarAccess.getServiceAccess().getColonKeyword_4_42_1());
            	    				
            	    // InternalComposeFileParser.g:1608:5: ( (lv_stop_signal_131_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1609:6: (lv_stop_signal_131_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1609:6: (lv_stop_signal_131_0= ruleValue )
            	    // InternalComposeFileParser.g:1610:7: lv_stop_signal_131_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getStop_signalValueParserRuleCall_4_42_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_stop_signal_131_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"stop_signal",
            	    								lv_stop_signal_131_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 44 :
            	    // InternalComposeFileParser.g:1629:4: (otherlv_132= Sysctls otherlv_133= Colon ( (lv_sysctls_134_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:1629:4: (otherlv_132= Sysctls otherlv_133= Colon ( (lv_sysctls_134_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:1630:5: otherlv_132= Sysctls otherlv_133= Colon ( (lv_sysctls_134_0= ruleListOrMapping ) )
            	    {
            	    otherlv_132=(Token)match(input,Sysctls,FOLLOW_3); 

            	    					newLeafNode(otherlv_132, grammarAccess.getServiceAccess().getSysctlsKeyword_4_43_0());
            	    				
            	    otherlv_133=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_133, grammarAccess.getServiceAccess().getColonKeyword_4_43_1());
            	    				
            	    // InternalComposeFileParser.g:1638:5: ( (lv_sysctls_134_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:1639:6: (lv_sysctls_134_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:1639:6: (lv_sysctls_134_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:1640:7: lv_sysctls_134_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getSysctlsListOrMappingParserRuleCall_4_43_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_sysctls_134_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"sysctls",
            	    								lv_sysctls_134_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 45 :
            	    // InternalComposeFileParser.g:1659:4: (otherlv_135= Tmpfs otherlv_136= Colon ( (lv_sysctls_137_0= ruleValueOrList ) ) )
            	    {
            	    // InternalComposeFileParser.g:1659:4: (otherlv_135= Tmpfs otherlv_136= Colon ( (lv_sysctls_137_0= ruleValueOrList ) ) )
            	    // InternalComposeFileParser.g:1660:5: otherlv_135= Tmpfs otherlv_136= Colon ( (lv_sysctls_137_0= ruleValueOrList ) )
            	    {
            	    otherlv_135=(Token)match(input,Tmpfs,FOLLOW_3); 

            	    					newLeafNode(otherlv_135, grammarAccess.getServiceAccess().getTmpfsKeyword_4_44_0());
            	    				
            	    otherlv_136=(Token)match(input,Colon,FOLLOW_13); 

            	    					newLeafNode(otherlv_136, grammarAccess.getServiceAccess().getColonKeyword_4_44_1());
            	    				
            	    // InternalComposeFileParser.g:1668:5: ( (lv_sysctls_137_0= ruleValueOrList ) )
            	    // InternalComposeFileParser.g:1669:6: (lv_sysctls_137_0= ruleValueOrList )
            	    {
            	    // InternalComposeFileParser.g:1669:6: (lv_sysctls_137_0= ruleValueOrList )
            	    // InternalComposeFileParser.g:1670:7: lv_sysctls_137_0= ruleValueOrList
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getSysctlsValueOrListParserRuleCall_4_44_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_sysctls_137_0=ruleValueOrList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"sysctls",
            	    								lv_sysctls_137_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ValueOrList");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 46 :
            	    // InternalComposeFileParser.g:1689:4: (otherlv_138= Tty otherlv_139= Colon ( (lv_tty_140_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1689:4: (otherlv_138= Tty otherlv_139= Colon ( (lv_tty_140_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1690:5: otherlv_138= Tty otherlv_139= Colon ( (lv_tty_140_0= ruleValue ) )
            	    {
            	    otherlv_138=(Token)match(input,Tty,FOLLOW_3); 

            	    					newLeafNode(otherlv_138, grammarAccess.getServiceAccess().getTtyKeyword_4_45_0());
            	    				
            	    otherlv_139=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_139, grammarAccess.getServiceAccess().getColonKeyword_4_45_1());
            	    				
            	    // InternalComposeFileParser.g:1698:5: ( (lv_tty_140_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1699:6: (lv_tty_140_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1699:6: (lv_tty_140_0= ruleValue )
            	    // InternalComposeFileParser.g:1700:7: lv_tty_140_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getTtyValueParserRuleCall_4_45_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_tty_140_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"tty",
            	    								lv_tty_140_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 47 :
            	    // InternalComposeFileParser.g:1719:4: (otherlv_141= Ulimits otherlv_142= Colon ( (lv_ulimits_143_0= ruleUlimits ) ) )
            	    {
            	    // InternalComposeFileParser.g:1719:4: (otherlv_141= Ulimits otherlv_142= Colon ( (lv_ulimits_143_0= ruleUlimits ) ) )
            	    // InternalComposeFileParser.g:1720:5: otherlv_141= Ulimits otherlv_142= Colon ( (lv_ulimits_143_0= ruleUlimits ) )
            	    {
            	    otherlv_141=(Token)match(input,Ulimits,FOLLOW_3); 

            	    					newLeafNode(otherlv_141, grammarAccess.getServiceAccess().getUlimitsKeyword_4_46_0());
            	    				
            	    otherlv_142=(Token)match(input,Colon,FOLLOW_17); 

            	    					newLeafNode(otherlv_142, grammarAccess.getServiceAccess().getColonKeyword_4_46_1());
            	    				
            	    // InternalComposeFileParser.g:1728:5: ( (lv_ulimits_143_0= ruleUlimits ) )
            	    // InternalComposeFileParser.g:1729:6: (lv_ulimits_143_0= ruleUlimits )
            	    {
            	    // InternalComposeFileParser.g:1729:6: (lv_ulimits_143_0= ruleUlimits )
            	    // InternalComposeFileParser.g:1730:7: lv_ulimits_143_0= ruleUlimits
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getUlimitsUlimitsParserRuleCall_4_46_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_ulimits_143_0=ruleUlimits();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"ulimits",
            	    								lv_ulimits_143_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Ulimits");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 48 :
            	    // InternalComposeFileParser.g:1749:4: (otherlv_144= User otherlv_145= Colon ( (lv_user_146_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1749:4: (otherlv_144= User otherlv_145= Colon ( (lv_user_146_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1750:5: otherlv_144= User otherlv_145= Colon ( (lv_user_146_0= ruleValue ) )
            	    {
            	    otherlv_144=(Token)match(input,User,FOLLOW_3); 

            	    					newLeafNode(otherlv_144, grammarAccess.getServiceAccess().getUserKeyword_4_47_0());
            	    				
            	    otherlv_145=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_145, grammarAccess.getServiceAccess().getColonKeyword_4_47_1());
            	    				
            	    // InternalComposeFileParser.g:1758:5: ( (lv_user_146_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1759:6: (lv_user_146_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1759:6: (lv_user_146_0= ruleValue )
            	    // InternalComposeFileParser.g:1760:7: lv_user_146_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getUserValueParserRuleCall_4_47_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_user_146_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"user",
            	    								lv_user_146_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 49 :
            	    // InternalComposeFileParser.g:1779:4: (otherlv_147= Userns_mode otherlv_148= Colon ( (lv_userns_mode_149_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1779:4: (otherlv_147= Userns_mode otherlv_148= Colon ( (lv_userns_mode_149_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1780:5: otherlv_147= Userns_mode otherlv_148= Colon ( (lv_userns_mode_149_0= ruleValue ) )
            	    {
            	    otherlv_147=(Token)match(input,Userns_mode,FOLLOW_3); 

            	    					newLeafNode(otherlv_147, grammarAccess.getServiceAccess().getUserns_modeKeyword_4_48_0());
            	    				
            	    otherlv_148=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_148, grammarAccess.getServiceAccess().getColonKeyword_4_48_1());
            	    				
            	    // InternalComposeFileParser.g:1788:5: ( (lv_userns_mode_149_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1789:6: (lv_userns_mode_149_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1789:6: (lv_userns_mode_149_0= ruleValue )
            	    // InternalComposeFileParser.g:1790:7: lv_userns_mode_149_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getUserns_modeValueParserRuleCall_4_48_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_userns_mode_149_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"userns_mode",
            	    								lv_userns_mode_149_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 50 :
            	    // InternalComposeFileParser.g:1809:4: (otherlv_150= Volumes otherlv_151= Colon ( (lv_volumes_152_0= ruleServiceVolumes ) ) )
            	    {
            	    // InternalComposeFileParser.g:1809:4: (otherlv_150= Volumes otherlv_151= Colon ( (lv_volumes_152_0= ruleServiceVolumes ) ) )
            	    // InternalComposeFileParser.g:1810:5: otherlv_150= Volumes otherlv_151= Colon ( (lv_volumes_152_0= ruleServiceVolumes ) )
            	    {
            	    otherlv_150=(Token)match(input,Volumes,FOLLOW_3); 

            	    					newLeafNode(otherlv_150, grammarAccess.getServiceAccess().getVolumesKeyword_4_49_0());
            	    				
            	    otherlv_151=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_151, grammarAccess.getServiceAccess().getColonKeyword_4_49_1());
            	    				
            	    // InternalComposeFileParser.g:1818:5: ( (lv_volumes_152_0= ruleServiceVolumes ) )
            	    // InternalComposeFileParser.g:1819:6: (lv_volumes_152_0= ruleServiceVolumes )
            	    {
            	    // InternalComposeFileParser.g:1819:6: (lv_volumes_152_0= ruleServiceVolumes )
            	    // InternalComposeFileParser.g:1820:7: lv_volumes_152_0= ruleServiceVolumes
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getVolumesServiceVolumesParserRuleCall_4_49_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_volumes_152_0=ruleServiceVolumes();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"volumes",
            	    								lv_volumes_152_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ServiceVolumes");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 51 :
            	    // InternalComposeFileParser.g:1839:4: (otherlv_153= Working_dir otherlv_154= Colon ( (lv_working_dir_155_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1839:4: (otherlv_153= Working_dir otherlv_154= Colon ( (lv_working_dir_155_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1840:5: otherlv_153= Working_dir otherlv_154= Colon ( (lv_working_dir_155_0= ruleValue ) )
            	    {
            	    otherlv_153=(Token)match(input,Working_dir,FOLLOW_3); 

            	    					newLeafNode(otherlv_153, grammarAccess.getServiceAccess().getWorking_dirKeyword_4_50_0());
            	    				
            	    otherlv_154=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_154, grammarAccess.getServiceAccess().getColonKeyword_4_50_1());
            	    				
            	    // InternalComposeFileParser.g:1848:5: ( (lv_working_dir_155_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1849:6: (lv_working_dir_155_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1849:6: (lv_working_dir_155_0= ruleValue )
            	    // InternalComposeFileParser.g:1850:7: lv_working_dir_155_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getWorking_dirValueParserRuleCall_4_50_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_working_dir_155_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"working_dir",
            	    								lv_working_dir_155_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


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

            this_END_156=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_156, grammarAccess.getServiceAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleBuild"
    // InternalComposeFileParser.g:1877:1: entryRuleBuild returns [EObject current=null] : iv_ruleBuild= ruleBuild EOF ;
    public final EObject entryRuleBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuild = null;


        try {
            // InternalComposeFileParser.g:1877:46: (iv_ruleBuild= ruleBuild EOF )
            // InternalComposeFileParser.g:1878:2: iv_ruleBuild= ruleBuild EOF
            {
             newCompositeNode(grammarAccess.getBuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuild=ruleBuild();

            state._fsp--;

             current =iv_ruleBuild; 
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
    // $ANTLR end "entryRuleBuild"


    // $ANTLR start "ruleBuild"
    // InternalComposeFileParser.g:1884:1: ruleBuild returns [EObject current=null] : ( ( () ( (lv_build_1_0= ruleValue ) ) ) | this_BuildLongSyntax_2= ruleBuildLongSyntax ) ;
    public final EObject ruleBuild() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_build_1_0 = null;

        EObject this_BuildLongSyntax_2 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:1890:2: ( ( ( () ( (lv_build_1_0= ruleValue ) ) ) | this_BuildLongSyntax_2= ruleBuildLongSyntax ) )
            // InternalComposeFileParser.g:1891:2: ( ( () ( (lv_build_1_0= ruleValue ) ) ) | this_BuildLongSyntax_2= ruleBuildLongSyntax )
            {
            // InternalComposeFileParser.g:1891:2: ( ( () ( (lv_build_1_0= ruleValue ) ) ) | this_BuildLongSyntax_2= ruleBuildLongSyntax )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_BEGIN) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalComposeFileParser.g:1892:3: ( () ( (lv_build_1_0= ruleValue ) ) )
                    {
                    // InternalComposeFileParser.g:1892:3: ( () ( (lv_build_1_0= ruleValue ) ) )
                    // InternalComposeFileParser.g:1893:4: () ( (lv_build_1_0= ruleValue ) )
                    {
                    // InternalComposeFileParser.g:1893:4: ()
                    // InternalComposeFileParser.g:1894:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBuildAccess().getBuildAction_0_0(),
                    						current);
                    				

                    }

                    // InternalComposeFileParser.g:1900:4: ( (lv_build_1_0= ruleValue ) )
                    // InternalComposeFileParser.g:1901:5: (lv_build_1_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:1901:5: (lv_build_1_0= ruleValue )
                    // InternalComposeFileParser.g:1902:6: lv_build_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getBuildAccess().getBuildValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_build_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildRule());
                    						}
                    						set(
                    							current,
                    							"build",
                    							lv_build_1_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:1921:3: this_BuildLongSyntax_2= ruleBuildLongSyntax
                    {

                    			newCompositeNode(grammarAccess.getBuildAccess().getBuildLongSyntaxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildLongSyntax_2=ruleBuildLongSyntax();

                    state._fsp--;


                    			current = this_BuildLongSyntax_2;
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
    // $ANTLR end "ruleBuild"


    // $ANTLR start "entryRuleBuildLongSyntax"
    // InternalComposeFileParser.g:1933:1: entryRuleBuildLongSyntax returns [EObject current=null] : iv_ruleBuildLongSyntax= ruleBuildLongSyntax EOF ;
    public final EObject entryRuleBuildLongSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildLongSyntax = null;


        try {
            // InternalComposeFileParser.g:1933:56: (iv_ruleBuildLongSyntax= ruleBuildLongSyntax EOF )
            // InternalComposeFileParser.g:1934:2: iv_ruleBuildLongSyntax= ruleBuildLongSyntax EOF
            {
             newCompositeNode(grammarAccess.getBuildLongSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildLongSyntax=ruleBuildLongSyntax();

            state._fsp--;

             current =iv_ruleBuildLongSyntax; 
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
    // $ANTLR end "entryRuleBuildLongSyntax"


    // $ANTLR start "ruleBuildLongSyntax"
    // InternalComposeFileParser.g:1940:1: ruleBuildLongSyntax returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( (otherlv_1= Context otherlv_2= Colon ( (lv_context_3_0= ruleValue ) ) ) | (otherlv_4= Dockerfile otherlv_5= Colon ( (lv_dockerfile_6_0= ruleValue ) ) ) | (otherlv_7= Args otherlv_8= Colon ( (lv_args_9_0= ruleListOrMapping ) ) ) | (otherlv_10= Labels otherlv_11= Colon ( (lv_labels_12_0= ruleListOrMapping ) ) ) | (otherlv_13= Cache_from otherlv_14= Colon ( (lv_cache_from_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Network otherlv_17= Colon ( (lv_network_18_0= ruleValue ) ) ) | (otherlv_19= Target otherlv_20= Colon ( (lv_target_21_0= ruleValue ) ) ) | (otherlv_22= Shm_size otherlv_23= Colon ( (lv_shm_size_24_0= ruleValue ) ) ) )+ this_END_25= RULE_END ) ;
    public final EObject ruleBuildLongSyntax() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token this_END_25=null;
        AntlrDatatypeRuleToken lv_context_3_0 = null;

        AntlrDatatypeRuleToken lv_dockerfile_6_0 = null;

        EObject lv_args_9_0 = null;

        EObject lv_labels_12_0 = null;

        EObject lv_cache_from_15_0 = null;

        AntlrDatatypeRuleToken lv_network_18_0 = null;

        AntlrDatatypeRuleToken lv_target_21_0 = null;

        AntlrDatatypeRuleToken lv_shm_size_24_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:1946:2: ( (this_BEGIN_0= RULE_BEGIN ( (otherlv_1= Context otherlv_2= Colon ( (lv_context_3_0= ruleValue ) ) ) | (otherlv_4= Dockerfile otherlv_5= Colon ( (lv_dockerfile_6_0= ruleValue ) ) ) | (otherlv_7= Args otherlv_8= Colon ( (lv_args_9_0= ruleListOrMapping ) ) ) | (otherlv_10= Labels otherlv_11= Colon ( (lv_labels_12_0= ruleListOrMapping ) ) ) | (otherlv_13= Cache_from otherlv_14= Colon ( (lv_cache_from_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Network otherlv_17= Colon ( (lv_network_18_0= ruleValue ) ) ) | (otherlv_19= Target otherlv_20= Colon ( (lv_target_21_0= ruleValue ) ) ) | (otherlv_22= Shm_size otherlv_23= Colon ( (lv_shm_size_24_0= ruleValue ) ) ) )+ this_END_25= RULE_END ) )
            // InternalComposeFileParser.g:1947:2: (this_BEGIN_0= RULE_BEGIN ( (otherlv_1= Context otherlv_2= Colon ( (lv_context_3_0= ruleValue ) ) ) | (otherlv_4= Dockerfile otherlv_5= Colon ( (lv_dockerfile_6_0= ruleValue ) ) ) | (otherlv_7= Args otherlv_8= Colon ( (lv_args_9_0= ruleListOrMapping ) ) ) | (otherlv_10= Labels otherlv_11= Colon ( (lv_labels_12_0= ruleListOrMapping ) ) ) | (otherlv_13= Cache_from otherlv_14= Colon ( (lv_cache_from_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Network otherlv_17= Colon ( (lv_network_18_0= ruleValue ) ) ) | (otherlv_19= Target otherlv_20= Colon ( (lv_target_21_0= ruleValue ) ) ) | (otherlv_22= Shm_size otherlv_23= Colon ( (lv_shm_size_24_0= ruleValue ) ) ) )+ this_END_25= RULE_END )
            {
            // InternalComposeFileParser.g:1947:2: (this_BEGIN_0= RULE_BEGIN ( (otherlv_1= Context otherlv_2= Colon ( (lv_context_3_0= ruleValue ) ) ) | (otherlv_4= Dockerfile otherlv_5= Colon ( (lv_dockerfile_6_0= ruleValue ) ) ) | (otherlv_7= Args otherlv_8= Colon ( (lv_args_9_0= ruleListOrMapping ) ) ) | (otherlv_10= Labels otherlv_11= Colon ( (lv_labels_12_0= ruleListOrMapping ) ) ) | (otherlv_13= Cache_from otherlv_14= Colon ( (lv_cache_from_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Network otherlv_17= Colon ( (lv_network_18_0= ruleValue ) ) ) | (otherlv_19= Target otherlv_20= Colon ( (lv_target_21_0= ruleValue ) ) ) | (otherlv_22= Shm_size otherlv_23= Colon ( (lv_shm_size_24_0= ruleValue ) ) ) )+ this_END_25= RULE_END )
            // InternalComposeFileParser.g:1948:3: this_BEGIN_0= RULE_BEGIN ( (otherlv_1= Context otherlv_2= Colon ( (lv_context_3_0= ruleValue ) ) ) | (otherlv_4= Dockerfile otherlv_5= Colon ( (lv_dockerfile_6_0= ruleValue ) ) ) | (otherlv_7= Args otherlv_8= Colon ( (lv_args_9_0= ruleListOrMapping ) ) ) | (otherlv_10= Labels otherlv_11= Colon ( (lv_labels_12_0= ruleListOrMapping ) ) ) | (otherlv_13= Cache_from otherlv_14= Colon ( (lv_cache_from_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Network otherlv_17= Colon ( (lv_network_18_0= ruleValue ) ) ) | (otherlv_19= Target otherlv_20= Colon ( (lv_target_21_0= ruleValue ) ) ) | (otherlv_22= Shm_size otherlv_23= Colon ( (lv_shm_size_24_0= ruleValue ) ) ) )+ this_END_25= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getBuildLongSyntaxAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalComposeFileParser.g:1952:3: ( (otherlv_1= Context otherlv_2= Colon ( (lv_context_3_0= ruleValue ) ) ) | (otherlv_4= Dockerfile otherlv_5= Colon ( (lv_dockerfile_6_0= ruleValue ) ) ) | (otherlv_7= Args otherlv_8= Colon ( (lv_args_9_0= ruleListOrMapping ) ) ) | (otherlv_10= Labels otherlv_11= Colon ( (lv_labels_12_0= ruleListOrMapping ) ) ) | (otherlv_13= Cache_from otherlv_14= Colon ( (lv_cache_from_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Network otherlv_17= Colon ( (lv_network_18_0= ruleValue ) ) ) | (otherlv_19= Target otherlv_20= Colon ( (lv_target_21_0= ruleValue ) ) ) | (otherlv_22= Shm_size otherlv_23= Colon ( (lv_shm_size_24_0= ruleValue ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=9;
                switch ( input.LA(1) ) {
                case Context:
                    {
                    alt13=1;
                    }
                    break;
                case Dockerfile:
                    {
                    alt13=2;
                    }
                    break;
                case Args:
                    {
                    alt13=3;
                    }
                    break;
                case Labels:
                    {
                    alt13=4;
                    }
                    break;
                case Cache_from:
                    {
                    alt13=5;
                    }
                    break;
                case Network:
                    {
                    alt13=6;
                    }
                    break;
                case Target:
                    {
                    alt13=7;
                    }
                    break;
                case Shm_size:
                    {
                    alt13=8;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalComposeFileParser.g:1953:4: (otherlv_1= Context otherlv_2= Colon ( (lv_context_3_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1953:4: (otherlv_1= Context otherlv_2= Colon ( (lv_context_3_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1954:5: otherlv_1= Context otherlv_2= Colon ( (lv_context_3_0= ruleValue ) )
            	    {
            	    otherlv_1=(Token)match(input,Context,FOLLOW_3); 

            	    					newLeafNode(otherlv_1, grammarAccess.getBuildLongSyntaxAccess().getContextKeyword_1_0_0());
            	    				
            	    otherlv_2=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_2, grammarAccess.getBuildLongSyntaxAccess().getColonKeyword_1_0_1());
            	    				
            	    // InternalComposeFileParser.g:1962:5: ( (lv_context_3_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1963:6: (lv_context_3_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1963:6: (lv_context_3_0= ruleValue )
            	    // InternalComposeFileParser.g:1964:7: lv_context_3_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getBuildLongSyntaxAccess().getContextValueParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_context_3_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildLongSyntaxRule());
            	    							}
            	    							set(
            	    								current,
            	    								"context",
            	    								lv_context_3_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:1983:4: (otherlv_4= Dockerfile otherlv_5= Colon ( (lv_dockerfile_6_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:1983:4: (otherlv_4= Dockerfile otherlv_5= Colon ( (lv_dockerfile_6_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:1984:5: otherlv_4= Dockerfile otherlv_5= Colon ( (lv_dockerfile_6_0= ruleValue ) )
            	    {
            	    otherlv_4=(Token)match(input,Dockerfile,FOLLOW_3); 

            	    					newLeafNode(otherlv_4, grammarAccess.getBuildLongSyntaxAccess().getDockerfileKeyword_1_1_0());
            	    				
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_5, grammarAccess.getBuildLongSyntaxAccess().getColonKeyword_1_1_1());
            	    				
            	    // InternalComposeFileParser.g:1992:5: ( (lv_dockerfile_6_0= ruleValue ) )
            	    // InternalComposeFileParser.g:1993:6: (lv_dockerfile_6_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:1993:6: (lv_dockerfile_6_0= ruleValue )
            	    // InternalComposeFileParser.g:1994:7: lv_dockerfile_6_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getBuildLongSyntaxAccess().getDockerfileValueParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_dockerfile_6_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildLongSyntaxRule());
            	    							}
            	    							set(
            	    								current,
            	    								"dockerfile",
            	    								lv_dockerfile_6_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:2013:4: (otherlv_7= Args otherlv_8= Colon ( (lv_args_9_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:2013:4: (otherlv_7= Args otherlv_8= Colon ( (lv_args_9_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:2014:5: otherlv_7= Args otherlv_8= Colon ( (lv_args_9_0= ruleListOrMapping ) )
            	    {
            	    otherlv_7=(Token)match(input,Args,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getBuildLongSyntaxAccess().getArgsKeyword_1_2_0());
            	    				
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getBuildLongSyntaxAccess().getColonKeyword_1_2_1());
            	    				
            	    // InternalComposeFileParser.g:2022:5: ( (lv_args_9_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:2023:6: (lv_args_9_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:2023:6: (lv_args_9_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:2024:7: lv_args_9_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getBuildLongSyntaxAccess().getArgsListOrMappingParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_args_9_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildLongSyntaxRule());
            	    							}
            	    							set(
            	    								current,
            	    								"args",
            	    								lv_args_9_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComposeFileParser.g:2043:4: (otherlv_10= Labels otherlv_11= Colon ( (lv_labels_12_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:2043:4: (otherlv_10= Labels otherlv_11= Colon ( (lv_labels_12_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:2044:5: otherlv_10= Labels otherlv_11= Colon ( (lv_labels_12_0= ruleListOrMapping ) )
            	    {
            	    otherlv_10=(Token)match(input,Labels,FOLLOW_3); 

            	    					newLeafNode(otherlv_10, grammarAccess.getBuildLongSyntaxAccess().getLabelsKeyword_1_3_0());
            	    				
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_11, grammarAccess.getBuildLongSyntaxAccess().getColonKeyword_1_3_1());
            	    				
            	    // InternalComposeFileParser.g:2052:5: ( (lv_labels_12_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:2053:6: (lv_labels_12_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:2053:6: (lv_labels_12_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:2054:7: lv_labels_12_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getBuildLongSyntaxAccess().getLabelsListOrMappingParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_labels_12_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildLongSyntaxRule());
            	    							}
            	    							set(
            	    								current,
            	    								"labels",
            	    								lv_labels_12_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComposeFileParser.g:2073:4: (otherlv_13= Cache_from otherlv_14= Colon ( (lv_cache_from_15_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:2073:4: (otherlv_13= Cache_from otherlv_14= Colon ( (lv_cache_from_15_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:2074:5: otherlv_13= Cache_from otherlv_14= Colon ( (lv_cache_from_15_0= ruleListOrMapping ) )
            	    {
            	    otherlv_13=(Token)match(input,Cache_from,FOLLOW_3); 

            	    					newLeafNode(otherlv_13, grammarAccess.getBuildLongSyntaxAccess().getCache_fromKeyword_1_4_0());
            	    				
            	    otherlv_14=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_14, grammarAccess.getBuildLongSyntaxAccess().getColonKeyword_1_4_1());
            	    				
            	    // InternalComposeFileParser.g:2082:5: ( (lv_cache_from_15_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:2083:6: (lv_cache_from_15_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:2083:6: (lv_cache_from_15_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:2084:7: lv_cache_from_15_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getBuildLongSyntaxAccess().getCache_fromListOrMappingParserRuleCall_1_4_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_cache_from_15_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildLongSyntaxRule());
            	    							}
            	    							set(
            	    								current,
            	    								"cache_from",
            	    								lv_cache_from_15_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalComposeFileParser.g:2103:4: (otherlv_16= Network otherlv_17= Colon ( (lv_network_18_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:2103:4: (otherlv_16= Network otherlv_17= Colon ( (lv_network_18_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:2104:5: otherlv_16= Network otherlv_17= Colon ( (lv_network_18_0= ruleValue ) )
            	    {
            	    otherlv_16=(Token)match(input,Network,FOLLOW_3); 

            	    					newLeafNode(otherlv_16, grammarAccess.getBuildLongSyntaxAccess().getNetworkKeyword_1_5_0());
            	    				
            	    otherlv_17=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_17, grammarAccess.getBuildLongSyntaxAccess().getColonKeyword_1_5_1());
            	    				
            	    // InternalComposeFileParser.g:2112:5: ( (lv_network_18_0= ruleValue ) )
            	    // InternalComposeFileParser.g:2113:6: (lv_network_18_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:2113:6: (lv_network_18_0= ruleValue )
            	    // InternalComposeFileParser.g:2114:7: lv_network_18_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getBuildLongSyntaxAccess().getNetworkValueParserRuleCall_1_5_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_network_18_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildLongSyntaxRule());
            	    							}
            	    							set(
            	    								current,
            	    								"network",
            	    								lv_network_18_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalComposeFileParser.g:2133:4: (otherlv_19= Target otherlv_20= Colon ( (lv_target_21_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:2133:4: (otherlv_19= Target otherlv_20= Colon ( (lv_target_21_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:2134:5: otherlv_19= Target otherlv_20= Colon ( (lv_target_21_0= ruleValue ) )
            	    {
            	    otherlv_19=(Token)match(input,Target,FOLLOW_3); 

            	    					newLeafNode(otherlv_19, grammarAccess.getBuildLongSyntaxAccess().getTargetKeyword_1_6_0());
            	    				
            	    otherlv_20=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_20, grammarAccess.getBuildLongSyntaxAccess().getColonKeyword_1_6_1());
            	    				
            	    // InternalComposeFileParser.g:2142:5: ( (lv_target_21_0= ruleValue ) )
            	    // InternalComposeFileParser.g:2143:6: (lv_target_21_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:2143:6: (lv_target_21_0= ruleValue )
            	    // InternalComposeFileParser.g:2144:7: lv_target_21_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getBuildLongSyntaxAccess().getTargetValueParserRuleCall_1_6_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_target_21_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildLongSyntaxRule());
            	    							}
            	    							set(
            	    								current,
            	    								"target",
            	    								lv_target_21_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalComposeFileParser.g:2163:4: (otherlv_22= Shm_size otherlv_23= Colon ( (lv_shm_size_24_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:2163:4: (otherlv_22= Shm_size otherlv_23= Colon ( (lv_shm_size_24_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:2164:5: otherlv_22= Shm_size otherlv_23= Colon ( (lv_shm_size_24_0= ruleValue ) )
            	    {
            	    otherlv_22=(Token)match(input,Shm_size,FOLLOW_3); 

            	    					newLeafNode(otherlv_22, grammarAccess.getBuildLongSyntaxAccess().getShm_sizeKeyword_1_7_0());
            	    				
            	    otherlv_23=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_23, grammarAccess.getBuildLongSyntaxAccess().getColonKeyword_1_7_1());
            	    				
            	    // InternalComposeFileParser.g:2172:5: ( (lv_shm_size_24_0= ruleValue ) )
            	    // InternalComposeFileParser.g:2173:6: (lv_shm_size_24_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:2173:6: (lv_shm_size_24_0= ruleValue )
            	    // InternalComposeFileParser.g:2174:7: lv_shm_size_24_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getBuildLongSyntaxAccess().getShm_sizeValueParserRuleCall_1_7_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_shm_size_24_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildLongSyntaxRule());
            	    							}
            	    							set(
            	    								current,
            	    								"shm_size",
            	    								lv_shm_size_24_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            this_END_25=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_25, grammarAccess.getBuildLongSyntaxAccess().getENDTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleBuildLongSyntax"


    // $ANTLR start "entryRuleDeployConfigs"
    // InternalComposeFileParser.g:2201:1: entryRuleDeployConfigs returns [EObject current=null] : iv_ruleDeployConfigs= ruleDeployConfigs EOF ;
    public final EObject entryRuleDeployConfigs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployConfigs = null;


        try {
            // InternalComposeFileParser.g:2201:54: (iv_ruleDeployConfigs= ruleDeployConfigs EOF )
            // InternalComposeFileParser.g:2202:2: iv_ruleDeployConfigs= ruleDeployConfigs EOF
            {
             newCompositeNode(grammarAccess.getDeployConfigsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployConfigs=ruleDeployConfigs();

            state._fsp--;

             current =iv_ruleDeployConfigs; 
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
    // $ANTLR end "entryRuleDeployConfigs"


    // $ANTLR start "ruleDeployConfigs"
    // InternalComposeFileParser.g:2208:1: ruleDeployConfigs returns [EObject current=null] : ( ( () ( (lv_list_1_0= ruleListOrMapping ) ) ) | this_DeployConfigsLongSyntax_2= ruleDeployConfigsLongSyntax | this_Config_3= ruleConfig ) ;
    public final EObject ruleDeployConfigs() throws RecognitionException {
        EObject current = null;

        EObject lv_list_1_0 = null;

        EObject this_DeployConfigsLongSyntax_2 = null;

        EObject this_Config_3 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:2214:2: ( ( ( () ( (lv_list_1_0= ruleListOrMapping ) ) ) | this_DeployConfigsLongSyntax_2= ruleDeployConfigsLongSyntax | this_Config_3= ruleConfig ) )
            // InternalComposeFileParser.g:2215:2: ( ( () ( (lv_list_1_0= ruleListOrMapping ) ) ) | this_DeployConfigsLongSyntax_2= ruleDeployConfigsLongSyntax | this_Config_3= ruleConfig )
            {
            // InternalComposeFileParser.g:2215:2: ( ( () ( (lv_list_1_0= ruleListOrMapping ) ) ) | this_DeployConfigsLongSyntax_2= ruleDeployConfigsLongSyntax | this_Config_3= ruleConfig )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BEGIN) ) {
                switch ( input.LA(2) ) {
                case HyphenMinusSpace:
                    {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==Source) ) {
                        alt14=2;
                    }
                    else if ( (LA14_2==RULE_ID||LA14_2==RULE_STRING) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                case RULE_STRING:
                    {
                    alt14=1;
                    }
                    break;
                case Max_failure_ratio:
                case Failure_action:
                case Parallelism:
                case Monitor:
                case Delay:
                case Order:
                    {
                    alt14=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalComposeFileParser.g:2216:3: ( () ( (lv_list_1_0= ruleListOrMapping ) ) )
                    {
                    // InternalComposeFileParser.g:2216:3: ( () ( (lv_list_1_0= ruleListOrMapping ) ) )
                    // InternalComposeFileParser.g:2217:4: () ( (lv_list_1_0= ruleListOrMapping ) )
                    {
                    // InternalComposeFileParser.g:2217:4: ()
                    // InternalComposeFileParser.g:2218:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDeployConfigsAccess().getConfigsAction_0_0(),
                    						current);
                    				

                    }

                    // InternalComposeFileParser.g:2224:4: ( (lv_list_1_0= ruleListOrMapping ) )
                    // InternalComposeFileParser.g:2225:5: (lv_list_1_0= ruleListOrMapping )
                    {
                    // InternalComposeFileParser.g:2225:5: (lv_list_1_0= ruleListOrMapping )
                    // InternalComposeFileParser.g:2226:6: lv_list_1_0= ruleListOrMapping
                    {

                    						newCompositeNode(grammarAccess.getDeployConfigsAccess().getListListOrMappingParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_list_1_0=ruleListOrMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeployConfigsRule());
                    						}
                    						set(
                    							current,
                    							"list",
                    							lv_list_1_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:2245:3: this_DeployConfigsLongSyntax_2= ruleDeployConfigsLongSyntax
                    {

                    			newCompositeNode(grammarAccess.getDeployConfigsAccess().getDeployConfigsLongSyntaxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeployConfigsLongSyntax_2=ruleDeployConfigsLongSyntax();

                    state._fsp--;


                    			current = this_DeployConfigsLongSyntax_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComposeFileParser.g:2254:3: this_Config_3= ruleConfig
                    {

                    			newCompositeNode(grammarAccess.getDeployConfigsAccess().getConfigParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Config_3=ruleConfig();

                    state._fsp--;


                    			current = this_Config_3;
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
    // $ANTLR end "ruleDeployConfigs"


    // $ANTLR start "entryRuleDeployConfigsLongSyntax"
    // InternalComposeFileParser.g:2266:1: entryRuleDeployConfigsLongSyntax returns [EObject current=null] : iv_ruleDeployConfigsLongSyntax= ruleDeployConfigsLongSyntax EOF ;
    public final EObject entryRuleDeployConfigsLongSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployConfigsLongSyntax = null;


        try {
            // InternalComposeFileParser.g:2266:64: (iv_ruleDeployConfigsLongSyntax= ruleDeployConfigsLongSyntax EOF )
            // InternalComposeFileParser.g:2267:2: iv_ruleDeployConfigsLongSyntax= ruleDeployConfigsLongSyntax EOF
            {
             newCompositeNode(grammarAccess.getDeployConfigsLongSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployConfigsLongSyntax=ruleDeployConfigsLongSyntax();

            state._fsp--;

             current =iv_ruleDeployConfigsLongSyntax; 
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
    // $ANTLR end "entryRuleDeployConfigsLongSyntax"


    // $ANTLR start "ruleDeployConfigsLongSyntax"
    // InternalComposeFileParser.g:2273:1: ruleDeployConfigsLongSyntax returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END ) ;
    public final EObject ruleDeployConfigsLongSyntax() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token this_END_17=null;
        AntlrDatatypeRuleToken lv_source_4_0 = null;

        AntlrDatatypeRuleToken lv_target_7_0 = null;

        AntlrDatatypeRuleToken lv_uid_10_0 = null;

        AntlrDatatypeRuleToken lv_gid_13_0 = null;

        AntlrDatatypeRuleToken lv_mode_16_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:2279:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END ) )
            // InternalComposeFileParser.g:2280:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END )
            {
            // InternalComposeFileParser.g:2280:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END )
            // InternalComposeFileParser.g:2281:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getDeployConfigsLongSyntaxAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalComposeFileParser.g:2285:3: (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) )
            // InternalComposeFileParser.g:2286:4: otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) )
            {
            otherlv_1=(Token)match(input,HyphenMinusSpace,FOLLOW_21); 

            				newLeafNode(otherlv_1, grammarAccess.getDeployConfigsLongSyntaxAccess().getHyphenMinusSpaceKeyword_1_0());
            			
            otherlv_2=(Token)match(input,Source,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getDeployConfigsLongSyntaxAccess().getSourceKeyword_1_1());
            			
            otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getDeployConfigsLongSyntaxAccess().getColonKeyword_1_2());
            			
            // InternalComposeFileParser.g:2298:4: ( (lv_source_4_0= ruleValue ) )
            // InternalComposeFileParser.g:2299:5: (lv_source_4_0= ruleValue )
            {
            // InternalComposeFileParser.g:2299:5: (lv_source_4_0= ruleValue )
            // InternalComposeFileParser.g:2300:6: lv_source_4_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getDeployConfigsLongSyntaxAccess().getSourceValueParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_22);
            lv_source_4_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDeployConfigsLongSyntaxRule());
            						}
            						set(
            							current,
            							"source",
            							lv_source_4_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:2318:3: (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) )
            // InternalComposeFileParser.g:2319:4: otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) )
            {
            otherlv_5=(Token)match(input,Target,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getDeployConfigsLongSyntaxAccess().getTargetKeyword_2_0());
            			
            otherlv_6=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_6, grammarAccess.getDeployConfigsLongSyntaxAccess().getColonKeyword_2_1());
            			
            // InternalComposeFileParser.g:2327:4: ( (lv_target_7_0= ruleValue ) )
            // InternalComposeFileParser.g:2328:5: (lv_target_7_0= ruleValue )
            {
            // InternalComposeFileParser.g:2328:5: (lv_target_7_0= ruleValue )
            // InternalComposeFileParser.g:2329:6: lv_target_7_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getDeployConfigsLongSyntaxAccess().getTargetValueParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_23);
            lv_target_7_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDeployConfigsLongSyntaxRule());
            						}
            						set(
            							current,
            							"target",
            							lv_target_7_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:2347:3: (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) )
            // InternalComposeFileParser.g:2348:4: otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) )
            {
            otherlv_8=(Token)match(input,Uid,FOLLOW_3); 

            				newLeafNode(otherlv_8, grammarAccess.getDeployConfigsLongSyntaxAccess().getUidKeyword_3_0());
            			
            otherlv_9=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_9, grammarAccess.getDeployConfigsLongSyntaxAccess().getColonKeyword_3_1());
            			
            // InternalComposeFileParser.g:2356:4: ( (lv_uid_10_0= ruleValue ) )
            // InternalComposeFileParser.g:2357:5: (lv_uid_10_0= ruleValue )
            {
            // InternalComposeFileParser.g:2357:5: (lv_uid_10_0= ruleValue )
            // InternalComposeFileParser.g:2358:6: lv_uid_10_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getDeployConfigsLongSyntaxAccess().getUidValueParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_24);
            lv_uid_10_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDeployConfigsLongSyntaxRule());
            						}
            						set(
            							current,
            							"uid",
            							lv_uid_10_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:2376:3: (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) )
            // InternalComposeFileParser.g:2377:4: otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) )
            {
            otherlv_11=(Token)match(input,Gid,FOLLOW_3); 

            				newLeafNode(otherlv_11, grammarAccess.getDeployConfigsLongSyntaxAccess().getGidKeyword_4_0());
            			
            otherlv_12=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_12, grammarAccess.getDeployConfigsLongSyntaxAccess().getColonKeyword_4_1());
            			
            // InternalComposeFileParser.g:2385:4: ( (lv_gid_13_0= ruleValue ) )
            // InternalComposeFileParser.g:2386:5: (lv_gid_13_0= ruleValue )
            {
            // InternalComposeFileParser.g:2386:5: (lv_gid_13_0= ruleValue )
            // InternalComposeFileParser.g:2387:6: lv_gid_13_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getDeployConfigsLongSyntaxAccess().getGidValueParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_25);
            lv_gid_13_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDeployConfigsLongSyntaxRule());
            						}
            						set(
            							current,
            							"gid",
            							lv_gid_13_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:2405:3: (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) )
            // InternalComposeFileParser.g:2406:4: otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) )
            {
            otherlv_14=(Token)match(input,Mode,FOLLOW_3); 

            				newLeafNode(otherlv_14, grammarAccess.getDeployConfigsLongSyntaxAccess().getModeKeyword_5_0());
            			
            otherlv_15=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_15, grammarAccess.getDeployConfigsLongSyntaxAccess().getColonKeyword_5_1());
            			
            // InternalComposeFileParser.g:2414:4: ( (lv_mode_16_0= ruleValue ) )
            // InternalComposeFileParser.g:2415:5: (lv_mode_16_0= ruleValue )
            {
            // InternalComposeFileParser.g:2415:5: (lv_mode_16_0= ruleValue )
            // InternalComposeFileParser.g:2416:6: lv_mode_16_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getDeployConfigsLongSyntaxAccess().getModeValueParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_26);
            lv_mode_16_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDeployConfigsLongSyntaxRule());
            						}
            						set(
            							current,
            							"mode",
            							lv_mode_16_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_END_17=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_17, grammarAccess.getDeployConfigsLongSyntaxAccess().getENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleDeployConfigsLongSyntax"


    // $ANTLR start "entryRuleCredentialSpec"
    // InternalComposeFileParser.g:2442:1: entryRuleCredentialSpec returns [EObject current=null] : iv_ruleCredentialSpec= ruleCredentialSpec EOF ;
    public final EObject entryRuleCredentialSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCredentialSpec = null;


        try {
            // InternalComposeFileParser.g:2442:55: (iv_ruleCredentialSpec= ruleCredentialSpec EOF )
            // InternalComposeFileParser.g:2443:2: iv_ruleCredentialSpec= ruleCredentialSpec EOF
            {
             newCompositeNode(grammarAccess.getCredentialSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCredentialSpec=ruleCredentialSpec();

            state._fsp--;

             current =iv_ruleCredentialSpec; 
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
    // $ANTLR end "entryRuleCredentialSpec"


    // $ANTLR start "ruleCredentialSpec"
    // InternalComposeFileParser.g:2449:1: ruleCredentialSpec returns [EObject current=null] : ( ( () (otherlv_1= File otherlv_2= Colon ( (lv_file_3_0= ruleValue ) ) ) ) | (otherlv_4= Registry otherlv_5= Colon ( (lv_registry_6_0= ruleValue ) ) ) ) ;
    public final EObject ruleCredentialSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_file_3_0 = null;

        AntlrDatatypeRuleToken lv_registry_6_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:2455:2: ( ( ( () (otherlv_1= File otherlv_2= Colon ( (lv_file_3_0= ruleValue ) ) ) ) | (otherlv_4= Registry otherlv_5= Colon ( (lv_registry_6_0= ruleValue ) ) ) ) )
            // InternalComposeFileParser.g:2456:2: ( ( () (otherlv_1= File otherlv_2= Colon ( (lv_file_3_0= ruleValue ) ) ) ) | (otherlv_4= Registry otherlv_5= Colon ( (lv_registry_6_0= ruleValue ) ) ) )
            {
            // InternalComposeFileParser.g:2456:2: ( ( () (otherlv_1= File otherlv_2= Colon ( (lv_file_3_0= ruleValue ) ) ) ) | (otherlv_4= Registry otherlv_5= Colon ( (lv_registry_6_0= ruleValue ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==File) ) {
                alt15=1;
            }
            else if ( (LA15_0==Registry) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalComposeFileParser.g:2457:3: ( () (otherlv_1= File otherlv_2= Colon ( (lv_file_3_0= ruleValue ) ) ) )
                    {
                    // InternalComposeFileParser.g:2457:3: ( () (otherlv_1= File otherlv_2= Colon ( (lv_file_3_0= ruleValue ) ) ) )
                    // InternalComposeFileParser.g:2458:4: () (otherlv_1= File otherlv_2= Colon ( (lv_file_3_0= ruleValue ) ) )
                    {
                    // InternalComposeFileParser.g:2458:4: ()
                    // InternalComposeFileParser.g:2459:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCredentialSpecAccess().getCredentialSpecAction_0_0(),
                    						current);
                    				

                    }

                    // InternalComposeFileParser.g:2465:4: (otherlv_1= File otherlv_2= Colon ( (lv_file_3_0= ruleValue ) ) )
                    // InternalComposeFileParser.g:2466:5: otherlv_1= File otherlv_2= Colon ( (lv_file_3_0= ruleValue ) )
                    {
                    otherlv_1=(Token)match(input,File,FOLLOW_3); 

                    					newLeafNode(otherlv_1, grammarAccess.getCredentialSpecAccess().getFileKeyword_0_1_0());
                    				
                    otherlv_2=(Token)match(input,Colon,FOLLOW_15); 

                    					newLeafNode(otherlv_2, grammarAccess.getCredentialSpecAccess().getColonKeyword_0_1_1());
                    				
                    // InternalComposeFileParser.g:2474:5: ( (lv_file_3_0= ruleValue ) )
                    // InternalComposeFileParser.g:2475:6: (lv_file_3_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:2475:6: (lv_file_3_0= ruleValue )
                    // InternalComposeFileParser.g:2476:7: lv_file_3_0= ruleValue
                    {

                    							newCompositeNode(grammarAccess.getCredentialSpecAccess().getFileValueParserRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_file_3_0=ruleValue();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCredentialSpecRule());
                    							}
                    							set(
                    								current,
                    								"file",
                    								lv_file_3_0,
                    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:2496:3: (otherlv_4= Registry otherlv_5= Colon ( (lv_registry_6_0= ruleValue ) ) )
                    {
                    // InternalComposeFileParser.g:2496:3: (otherlv_4= Registry otherlv_5= Colon ( (lv_registry_6_0= ruleValue ) ) )
                    // InternalComposeFileParser.g:2497:4: otherlv_4= Registry otherlv_5= Colon ( (lv_registry_6_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,Registry,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCredentialSpecAccess().getRegistryKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,Colon,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getCredentialSpecAccess().getColonKeyword_1_1());
                    			
                    // InternalComposeFileParser.g:2505:4: ( (lv_registry_6_0= ruleValue ) )
                    // InternalComposeFileParser.g:2506:5: (lv_registry_6_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:2506:5: (lv_registry_6_0= ruleValue )
                    // InternalComposeFileParser.g:2507:6: lv_registry_6_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getCredentialSpecAccess().getRegistryValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_registry_6_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCredentialSpecRule());
                    						}
                    						set(
                    							current,
                    							"registry",
                    							lv_registry_6_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleCredentialSpec"


    // $ANTLR start "entryRuleDeploy"
    // InternalComposeFileParser.g:2529:1: entryRuleDeploy returns [EObject current=null] : iv_ruleDeploy= ruleDeploy EOF ;
    public final EObject entryRuleDeploy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploy = null;


        try {
            // InternalComposeFileParser.g:2529:47: (iv_ruleDeploy= ruleDeploy EOF )
            // InternalComposeFileParser.g:2530:2: iv_ruleDeploy= ruleDeploy EOF
            {
             newCompositeNode(grammarAccess.getDeployRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploy=ruleDeploy();

            state._fsp--;

             current =iv_ruleDeploy; 
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
    // $ANTLR end "entryRuleDeploy"


    // $ANTLR start "ruleDeploy"
    // InternalComposeFileParser.g:2536:1: ruleDeploy returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Endpoint_mode otherlv_3= Colon ( (lv_endpoint_mode_4_0= ruleValue ) ) ) | (otherlv_5= Labels otherlv_6= Colon ( (lv_labels_7_0= ruleMapping ) ) ) | (otherlv_8= Mode otherlv_9= Colon ( (lv_mode_10_0= ruleValue ) ) ) | (otherlv_11= Placement otherlv_12= Colon ( (lv_placement_13_0= rulePlacement ) ) ) | (otherlv_14= Replicas otherlv_15= Colon ( (lv_replicas_16_0= ruleValue ) ) ) | (otherlv_17= Resources otherlv_18= Colon ( (lv_resources_19_0= ruleValue ) ) ) | (otherlv_20= Restart_policy otherlv_21= Colon ( (lv_restart_policy_22_0= ruleRestartPolicy ) ) ) | (otherlv_23= Rollback_config otherlv_24= Colon ( (lv_rollback_config_25_0= ruleDeployConfigs ) ) ) | (otherlv_26= Update_config otherlv_27= Colon ( (lv_update_config_28_0= ruleDeployConfigs ) ) ) )+ this_END_29= RULE_END ) ;
    public final EObject ruleDeploy() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token this_END_29=null;
        AntlrDatatypeRuleToken lv_endpoint_mode_4_0 = null;

        EObject lv_labels_7_0 = null;

        AntlrDatatypeRuleToken lv_mode_10_0 = null;

        EObject lv_placement_13_0 = null;

        AntlrDatatypeRuleToken lv_replicas_16_0 = null;

        AntlrDatatypeRuleToken lv_resources_19_0 = null;

        EObject lv_restart_policy_22_0 = null;

        EObject lv_rollback_config_25_0 = null;

        EObject lv_update_config_28_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:2542:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Endpoint_mode otherlv_3= Colon ( (lv_endpoint_mode_4_0= ruleValue ) ) ) | (otherlv_5= Labels otherlv_6= Colon ( (lv_labels_7_0= ruleMapping ) ) ) | (otherlv_8= Mode otherlv_9= Colon ( (lv_mode_10_0= ruleValue ) ) ) | (otherlv_11= Placement otherlv_12= Colon ( (lv_placement_13_0= rulePlacement ) ) ) | (otherlv_14= Replicas otherlv_15= Colon ( (lv_replicas_16_0= ruleValue ) ) ) | (otherlv_17= Resources otherlv_18= Colon ( (lv_resources_19_0= ruleValue ) ) ) | (otherlv_20= Restart_policy otherlv_21= Colon ( (lv_restart_policy_22_0= ruleRestartPolicy ) ) ) | (otherlv_23= Rollback_config otherlv_24= Colon ( (lv_rollback_config_25_0= ruleDeployConfigs ) ) ) | (otherlv_26= Update_config otherlv_27= Colon ( (lv_update_config_28_0= ruleDeployConfigs ) ) ) )+ this_END_29= RULE_END ) )
            // InternalComposeFileParser.g:2543:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Endpoint_mode otherlv_3= Colon ( (lv_endpoint_mode_4_0= ruleValue ) ) ) | (otherlv_5= Labels otherlv_6= Colon ( (lv_labels_7_0= ruleMapping ) ) ) | (otherlv_8= Mode otherlv_9= Colon ( (lv_mode_10_0= ruleValue ) ) ) | (otherlv_11= Placement otherlv_12= Colon ( (lv_placement_13_0= rulePlacement ) ) ) | (otherlv_14= Replicas otherlv_15= Colon ( (lv_replicas_16_0= ruleValue ) ) ) | (otherlv_17= Resources otherlv_18= Colon ( (lv_resources_19_0= ruleValue ) ) ) | (otherlv_20= Restart_policy otherlv_21= Colon ( (lv_restart_policy_22_0= ruleRestartPolicy ) ) ) | (otherlv_23= Rollback_config otherlv_24= Colon ( (lv_rollback_config_25_0= ruleDeployConfigs ) ) ) | (otherlv_26= Update_config otherlv_27= Colon ( (lv_update_config_28_0= ruleDeployConfigs ) ) ) )+ this_END_29= RULE_END )
            {
            // InternalComposeFileParser.g:2543:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Endpoint_mode otherlv_3= Colon ( (lv_endpoint_mode_4_0= ruleValue ) ) ) | (otherlv_5= Labels otherlv_6= Colon ( (lv_labels_7_0= ruleMapping ) ) ) | (otherlv_8= Mode otherlv_9= Colon ( (lv_mode_10_0= ruleValue ) ) ) | (otherlv_11= Placement otherlv_12= Colon ( (lv_placement_13_0= rulePlacement ) ) ) | (otherlv_14= Replicas otherlv_15= Colon ( (lv_replicas_16_0= ruleValue ) ) ) | (otherlv_17= Resources otherlv_18= Colon ( (lv_resources_19_0= ruleValue ) ) ) | (otherlv_20= Restart_policy otherlv_21= Colon ( (lv_restart_policy_22_0= ruleRestartPolicy ) ) ) | (otherlv_23= Rollback_config otherlv_24= Colon ( (lv_rollback_config_25_0= ruleDeployConfigs ) ) ) | (otherlv_26= Update_config otherlv_27= Colon ( (lv_update_config_28_0= ruleDeployConfigs ) ) ) )+ this_END_29= RULE_END )
            // InternalComposeFileParser.g:2544:3: () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Endpoint_mode otherlv_3= Colon ( (lv_endpoint_mode_4_0= ruleValue ) ) ) | (otherlv_5= Labels otherlv_6= Colon ( (lv_labels_7_0= ruleMapping ) ) ) | (otherlv_8= Mode otherlv_9= Colon ( (lv_mode_10_0= ruleValue ) ) ) | (otherlv_11= Placement otherlv_12= Colon ( (lv_placement_13_0= rulePlacement ) ) ) | (otherlv_14= Replicas otherlv_15= Colon ( (lv_replicas_16_0= ruleValue ) ) ) | (otherlv_17= Resources otherlv_18= Colon ( (lv_resources_19_0= ruleValue ) ) ) | (otherlv_20= Restart_policy otherlv_21= Colon ( (lv_restart_policy_22_0= ruleRestartPolicy ) ) ) | (otherlv_23= Rollback_config otherlv_24= Colon ( (lv_rollback_config_25_0= ruleDeployConfigs ) ) ) | (otherlv_26= Update_config otherlv_27= Colon ( (lv_update_config_28_0= ruleDeployConfigs ) ) ) )+ this_END_29= RULE_END
            {
            // InternalComposeFileParser.g:2544:3: ()
            // InternalComposeFileParser.g:2545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeployAccess().getDeployAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_27); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getDeployAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalComposeFileParser.g:2555:3: ( (otherlv_2= Endpoint_mode otherlv_3= Colon ( (lv_endpoint_mode_4_0= ruleValue ) ) ) | (otherlv_5= Labels otherlv_6= Colon ( (lv_labels_7_0= ruleMapping ) ) ) | (otherlv_8= Mode otherlv_9= Colon ( (lv_mode_10_0= ruleValue ) ) ) | (otherlv_11= Placement otherlv_12= Colon ( (lv_placement_13_0= rulePlacement ) ) ) | (otherlv_14= Replicas otherlv_15= Colon ( (lv_replicas_16_0= ruleValue ) ) ) | (otherlv_17= Resources otherlv_18= Colon ( (lv_resources_19_0= ruleValue ) ) ) | (otherlv_20= Restart_policy otherlv_21= Colon ( (lv_restart_policy_22_0= ruleRestartPolicy ) ) ) | (otherlv_23= Rollback_config otherlv_24= Colon ( (lv_rollback_config_25_0= ruleDeployConfigs ) ) ) | (otherlv_26= Update_config otherlv_27= Colon ( (lv_update_config_28_0= ruleDeployConfigs ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=10;
                switch ( input.LA(1) ) {
                case Endpoint_mode:
                    {
                    alt16=1;
                    }
                    break;
                case Labels:
                    {
                    alt16=2;
                    }
                    break;
                case Mode:
                    {
                    alt16=3;
                    }
                    break;
                case Placement:
                    {
                    alt16=4;
                    }
                    break;
                case Replicas:
                    {
                    alt16=5;
                    }
                    break;
                case Resources:
                    {
                    alt16=6;
                    }
                    break;
                case Restart_policy:
                    {
                    alt16=7;
                    }
                    break;
                case Rollback_config:
                    {
                    alt16=8;
                    }
                    break;
                case Update_config:
                    {
                    alt16=9;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalComposeFileParser.g:2556:4: (otherlv_2= Endpoint_mode otherlv_3= Colon ( (lv_endpoint_mode_4_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:2556:4: (otherlv_2= Endpoint_mode otherlv_3= Colon ( (lv_endpoint_mode_4_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:2557:5: otherlv_2= Endpoint_mode otherlv_3= Colon ( (lv_endpoint_mode_4_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,Endpoint_mode,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getDeployAccess().getEndpoint_modeKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_3, grammarAccess.getDeployAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalComposeFileParser.g:2565:5: ( (lv_endpoint_mode_4_0= ruleValue ) )
            	    // InternalComposeFileParser.g:2566:6: (lv_endpoint_mode_4_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:2566:6: (lv_endpoint_mode_4_0= ruleValue )
            	    // InternalComposeFileParser.g:2567:7: lv_endpoint_mode_4_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getDeployAccess().getEndpoint_modeValueParserRuleCall_2_0_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_endpoint_mode_4_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDeployRule());
            	    							}
            	    							set(
            	    								current,
            	    								"endpoint_mode",
            	    								lv_endpoint_mode_4_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:2586:4: (otherlv_5= Labels otherlv_6= Colon ( (lv_labels_7_0= ruleMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:2586:4: (otherlv_5= Labels otherlv_6= Colon ( (lv_labels_7_0= ruleMapping ) ) )
            	    // InternalComposeFileParser.g:2587:5: otherlv_5= Labels otherlv_6= Colon ( (lv_labels_7_0= ruleMapping ) )
            	    {
            	    otherlv_5=(Token)match(input,Labels,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getDeployAccess().getLabelsKeyword_2_1_0());
            	    				
            	    otherlv_6=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getDeployAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalComposeFileParser.g:2595:5: ( (lv_labels_7_0= ruleMapping ) )
            	    // InternalComposeFileParser.g:2596:6: (lv_labels_7_0= ruleMapping )
            	    {
            	    // InternalComposeFileParser.g:2596:6: (lv_labels_7_0= ruleMapping )
            	    // InternalComposeFileParser.g:2597:7: lv_labels_7_0= ruleMapping
            	    {

            	    							newCompositeNode(grammarAccess.getDeployAccess().getLabelsMappingParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_labels_7_0=ruleMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDeployRule());
            	    							}
            	    							set(
            	    								current,
            	    								"labels",
            	    								lv_labels_7_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Mapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:2616:4: (otherlv_8= Mode otherlv_9= Colon ( (lv_mode_10_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:2616:4: (otherlv_8= Mode otherlv_9= Colon ( (lv_mode_10_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:2617:5: otherlv_8= Mode otherlv_9= Colon ( (lv_mode_10_0= ruleValue ) )
            	    {
            	    otherlv_8=(Token)match(input,Mode,FOLLOW_3); 

            	    					newLeafNode(otherlv_8, grammarAccess.getDeployAccess().getModeKeyword_2_2_0());
            	    				
            	    otherlv_9=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_9, grammarAccess.getDeployAccess().getColonKeyword_2_2_1());
            	    				
            	    // InternalComposeFileParser.g:2625:5: ( (lv_mode_10_0= ruleValue ) )
            	    // InternalComposeFileParser.g:2626:6: (lv_mode_10_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:2626:6: (lv_mode_10_0= ruleValue )
            	    // InternalComposeFileParser.g:2627:7: lv_mode_10_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getDeployAccess().getModeValueParserRuleCall_2_2_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_mode_10_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDeployRule());
            	    							}
            	    							set(
            	    								current,
            	    								"mode",
            	    								lv_mode_10_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComposeFileParser.g:2646:4: (otherlv_11= Placement otherlv_12= Colon ( (lv_placement_13_0= rulePlacement ) ) )
            	    {
            	    // InternalComposeFileParser.g:2646:4: (otherlv_11= Placement otherlv_12= Colon ( (lv_placement_13_0= rulePlacement ) ) )
            	    // InternalComposeFileParser.g:2647:5: otherlv_11= Placement otherlv_12= Colon ( (lv_placement_13_0= rulePlacement ) )
            	    {
            	    otherlv_11=(Token)match(input,Placement,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getDeployAccess().getPlacementKeyword_2_3_0());
            	    				
            	    otherlv_12=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_12, grammarAccess.getDeployAccess().getColonKeyword_2_3_1());
            	    				
            	    // InternalComposeFileParser.g:2655:5: ( (lv_placement_13_0= rulePlacement ) )
            	    // InternalComposeFileParser.g:2656:6: (lv_placement_13_0= rulePlacement )
            	    {
            	    // InternalComposeFileParser.g:2656:6: (lv_placement_13_0= rulePlacement )
            	    // InternalComposeFileParser.g:2657:7: lv_placement_13_0= rulePlacement
            	    {

            	    							newCompositeNode(grammarAccess.getDeployAccess().getPlacementPlacementParserRuleCall_2_3_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_placement_13_0=rulePlacement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDeployRule());
            	    							}
            	    							set(
            	    								current,
            	    								"placement",
            	    								lv_placement_13_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Placement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComposeFileParser.g:2676:4: (otherlv_14= Replicas otherlv_15= Colon ( (lv_replicas_16_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:2676:4: (otherlv_14= Replicas otherlv_15= Colon ( (lv_replicas_16_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:2677:5: otherlv_14= Replicas otherlv_15= Colon ( (lv_replicas_16_0= ruleValue ) )
            	    {
            	    otherlv_14=(Token)match(input,Replicas,FOLLOW_3); 

            	    					newLeafNode(otherlv_14, grammarAccess.getDeployAccess().getReplicasKeyword_2_4_0());
            	    				
            	    otherlv_15=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_15, grammarAccess.getDeployAccess().getColonKeyword_2_4_1());
            	    				
            	    // InternalComposeFileParser.g:2685:5: ( (lv_replicas_16_0= ruleValue ) )
            	    // InternalComposeFileParser.g:2686:6: (lv_replicas_16_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:2686:6: (lv_replicas_16_0= ruleValue )
            	    // InternalComposeFileParser.g:2687:7: lv_replicas_16_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getDeployAccess().getReplicasValueParserRuleCall_2_4_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_replicas_16_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDeployRule());
            	    							}
            	    							set(
            	    								current,
            	    								"replicas",
            	    								lv_replicas_16_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalComposeFileParser.g:2706:4: (otherlv_17= Resources otherlv_18= Colon ( (lv_resources_19_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:2706:4: (otherlv_17= Resources otherlv_18= Colon ( (lv_resources_19_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:2707:5: otherlv_17= Resources otherlv_18= Colon ( (lv_resources_19_0= ruleValue ) )
            	    {
            	    otherlv_17=(Token)match(input,Resources,FOLLOW_3); 

            	    					newLeafNode(otherlv_17, grammarAccess.getDeployAccess().getResourcesKeyword_2_5_0());
            	    				
            	    otherlv_18=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_18, grammarAccess.getDeployAccess().getColonKeyword_2_5_1());
            	    				
            	    // InternalComposeFileParser.g:2715:5: ( (lv_resources_19_0= ruleValue ) )
            	    // InternalComposeFileParser.g:2716:6: (lv_resources_19_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:2716:6: (lv_resources_19_0= ruleValue )
            	    // InternalComposeFileParser.g:2717:7: lv_resources_19_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getDeployAccess().getResourcesValueParserRuleCall_2_5_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_resources_19_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDeployRule());
            	    							}
            	    							set(
            	    								current,
            	    								"resources",
            	    								lv_resources_19_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalComposeFileParser.g:2736:4: (otherlv_20= Restart_policy otherlv_21= Colon ( (lv_restart_policy_22_0= ruleRestartPolicy ) ) )
            	    {
            	    // InternalComposeFileParser.g:2736:4: (otherlv_20= Restart_policy otherlv_21= Colon ( (lv_restart_policy_22_0= ruleRestartPolicy ) ) )
            	    // InternalComposeFileParser.g:2737:5: otherlv_20= Restart_policy otherlv_21= Colon ( (lv_restart_policy_22_0= ruleRestartPolicy ) )
            	    {
            	    otherlv_20=(Token)match(input,Restart_policy,FOLLOW_3); 

            	    					newLeafNode(otherlv_20, grammarAccess.getDeployAccess().getRestart_policyKeyword_2_6_0());
            	    				
            	    otherlv_21=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_21, grammarAccess.getDeployAccess().getColonKeyword_2_6_1());
            	    				
            	    // InternalComposeFileParser.g:2745:5: ( (lv_restart_policy_22_0= ruleRestartPolicy ) )
            	    // InternalComposeFileParser.g:2746:6: (lv_restart_policy_22_0= ruleRestartPolicy )
            	    {
            	    // InternalComposeFileParser.g:2746:6: (lv_restart_policy_22_0= ruleRestartPolicy )
            	    // InternalComposeFileParser.g:2747:7: lv_restart_policy_22_0= ruleRestartPolicy
            	    {

            	    							newCompositeNode(grammarAccess.getDeployAccess().getRestart_policyRestartPolicyParserRuleCall_2_6_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_restart_policy_22_0=ruleRestartPolicy();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDeployRule());
            	    							}
            	    							set(
            	    								current,
            	    								"restart_policy",
            	    								lv_restart_policy_22_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.RestartPolicy");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalComposeFileParser.g:2766:4: (otherlv_23= Rollback_config otherlv_24= Colon ( (lv_rollback_config_25_0= ruleDeployConfigs ) ) )
            	    {
            	    // InternalComposeFileParser.g:2766:4: (otherlv_23= Rollback_config otherlv_24= Colon ( (lv_rollback_config_25_0= ruleDeployConfigs ) ) )
            	    // InternalComposeFileParser.g:2767:5: otherlv_23= Rollback_config otherlv_24= Colon ( (lv_rollback_config_25_0= ruleDeployConfigs ) )
            	    {
            	    otherlv_23=(Token)match(input,Rollback_config,FOLLOW_3); 

            	    					newLeafNode(otherlv_23, grammarAccess.getDeployAccess().getRollback_configKeyword_2_7_0());
            	    				
            	    otherlv_24=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_24, grammarAccess.getDeployAccess().getColonKeyword_2_7_1());
            	    				
            	    // InternalComposeFileParser.g:2775:5: ( (lv_rollback_config_25_0= ruleDeployConfigs ) )
            	    // InternalComposeFileParser.g:2776:6: (lv_rollback_config_25_0= ruleDeployConfigs )
            	    {
            	    // InternalComposeFileParser.g:2776:6: (lv_rollback_config_25_0= ruleDeployConfigs )
            	    // InternalComposeFileParser.g:2777:7: lv_rollback_config_25_0= ruleDeployConfigs
            	    {

            	    							newCompositeNode(grammarAccess.getDeployAccess().getRollback_configDeployConfigsParserRuleCall_2_7_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_rollback_config_25_0=ruleDeployConfigs();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDeployRule());
            	    							}
            	    							set(
            	    								current,
            	    								"rollback_config",
            	    								lv_rollback_config_25_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.DeployConfigs");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalComposeFileParser.g:2796:4: (otherlv_26= Update_config otherlv_27= Colon ( (lv_update_config_28_0= ruleDeployConfigs ) ) )
            	    {
            	    // InternalComposeFileParser.g:2796:4: (otherlv_26= Update_config otherlv_27= Colon ( (lv_update_config_28_0= ruleDeployConfigs ) ) )
            	    // InternalComposeFileParser.g:2797:5: otherlv_26= Update_config otherlv_27= Colon ( (lv_update_config_28_0= ruleDeployConfigs ) )
            	    {
            	    otherlv_26=(Token)match(input,Update_config,FOLLOW_3); 

            	    					newLeafNode(otherlv_26, grammarAccess.getDeployAccess().getUpdate_configKeyword_2_8_0());
            	    				
            	    otherlv_27=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_27, grammarAccess.getDeployAccess().getColonKeyword_2_8_1());
            	    				
            	    // InternalComposeFileParser.g:2805:5: ( (lv_update_config_28_0= ruleDeployConfigs ) )
            	    // InternalComposeFileParser.g:2806:6: (lv_update_config_28_0= ruleDeployConfigs )
            	    {
            	    // InternalComposeFileParser.g:2806:6: (lv_update_config_28_0= ruleDeployConfigs )
            	    // InternalComposeFileParser.g:2807:7: lv_update_config_28_0= ruleDeployConfigs
            	    {

            	    							newCompositeNode(grammarAccess.getDeployAccess().getUpdate_configDeployConfigsParserRuleCall_2_8_2_0());
            	    						
            	    pushFollow(FOLLOW_28);
            	    lv_update_config_28_0=ruleDeployConfigs();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDeployRule());
            	    							}
            	    							set(
            	    								current,
            	    								"update_config",
            	    								lv_update_config_28_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.DeployConfigs");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


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

            this_END_29=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_29, grammarAccess.getDeployAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleDeploy"


    // $ANTLR start "entryRulePlacement"
    // InternalComposeFileParser.g:2834:1: entryRulePlacement returns [EObject current=null] : iv_rulePlacement= rulePlacement EOF ;
    public final EObject entryRulePlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacement = null;


        try {
            // InternalComposeFileParser.g:2834:50: (iv_rulePlacement= rulePlacement EOF )
            // InternalComposeFileParser.g:2835:2: iv_rulePlacement= rulePlacement EOF
            {
             newCompositeNode(grammarAccess.getPlacementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlacement=rulePlacement();

            state._fsp--;

             current =iv_rulePlacement; 
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
    // $ANTLR end "entryRulePlacement"


    // $ANTLR start "rulePlacement"
    // InternalComposeFileParser.g:2841:1: rulePlacement returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Constraints otherlv_3= Colon ( (lv_constraints_4_0= ruleValueOrList ) ) ) | (otherlv_5= Preferences otherlv_6= Colon ( (lv_preferences_7_0= ruleListOrMapping ) ) ) )+ this_END_8= RULE_END ) ;
    public final EObject rulePlacement() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        EObject lv_constraints_4_0 = null;

        EObject lv_preferences_7_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:2847:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Constraints otherlv_3= Colon ( (lv_constraints_4_0= ruleValueOrList ) ) ) | (otherlv_5= Preferences otherlv_6= Colon ( (lv_preferences_7_0= ruleListOrMapping ) ) ) )+ this_END_8= RULE_END ) )
            // InternalComposeFileParser.g:2848:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Constraints otherlv_3= Colon ( (lv_constraints_4_0= ruleValueOrList ) ) ) | (otherlv_5= Preferences otherlv_6= Colon ( (lv_preferences_7_0= ruleListOrMapping ) ) ) )+ this_END_8= RULE_END )
            {
            // InternalComposeFileParser.g:2848:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Constraints otherlv_3= Colon ( (lv_constraints_4_0= ruleValueOrList ) ) ) | (otherlv_5= Preferences otherlv_6= Colon ( (lv_preferences_7_0= ruleListOrMapping ) ) ) )+ this_END_8= RULE_END )
            // InternalComposeFileParser.g:2849:3: () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Constraints otherlv_3= Colon ( (lv_constraints_4_0= ruleValueOrList ) ) ) | (otherlv_5= Preferences otherlv_6= Colon ( (lv_preferences_7_0= ruleListOrMapping ) ) ) )+ this_END_8= RULE_END
            {
            // InternalComposeFileParser.g:2849:3: ()
            // InternalComposeFileParser.g:2850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlacementAccess().getPlacementAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getPlacementAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalComposeFileParser.g:2860:3: ( (otherlv_2= Constraints otherlv_3= Colon ( (lv_constraints_4_0= ruleValueOrList ) ) ) | (otherlv_5= Preferences otherlv_6= Colon ( (lv_preferences_7_0= ruleListOrMapping ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Constraints) ) {
                    alt17=1;
                }
                else if ( (LA17_0==Preferences) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComposeFileParser.g:2861:4: (otherlv_2= Constraints otherlv_3= Colon ( (lv_constraints_4_0= ruleValueOrList ) ) )
            	    {
            	    // InternalComposeFileParser.g:2861:4: (otherlv_2= Constraints otherlv_3= Colon ( (lv_constraints_4_0= ruleValueOrList ) ) )
            	    // InternalComposeFileParser.g:2862:5: otherlv_2= Constraints otherlv_3= Colon ( (lv_constraints_4_0= ruleValueOrList ) )
            	    {
            	    otherlv_2=(Token)match(input,Constraints,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPlacementAccess().getConstraintsKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,Colon,FOLLOW_13); 

            	    					newLeafNode(otherlv_3, grammarAccess.getPlacementAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalComposeFileParser.g:2870:5: ( (lv_constraints_4_0= ruleValueOrList ) )
            	    // InternalComposeFileParser.g:2871:6: (lv_constraints_4_0= ruleValueOrList )
            	    {
            	    // InternalComposeFileParser.g:2871:6: (lv_constraints_4_0= ruleValueOrList )
            	    // InternalComposeFileParser.g:2872:7: lv_constraints_4_0= ruleValueOrList
            	    {

            	    							newCompositeNode(grammarAccess.getPlacementAccess().getConstraintsValueOrListParserRuleCall_2_0_2_0());
            	    						
            	    pushFollow(FOLLOW_30);
            	    lv_constraints_4_0=ruleValueOrList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlacementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"constraints",
            	    								lv_constraints_4_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ValueOrList");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:2891:4: (otherlv_5= Preferences otherlv_6= Colon ( (lv_preferences_7_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:2891:4: (otherlv_5= Preferences otherlv_6= Colon ( (lv_preferences_7_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:2892:5: otherlv_5= Preferences otherlv_6= Colon ( (lv_preferences_7_0= ruleListOrMapping ) )
            	    {
            	    otherlv_5=(Token)match(input,Preferences,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getPlacementAccess().getPreferencesKeyword_2_1_0());
            	    				
            	    otherlv_6=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getPlacementAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalComposeFileParser.g:2900:5: ( (lv_preferences_7_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:2901:6: (lv_preferences_7_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:2901:6: (lv_preferences_7_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:2902:7: lv_preferences_7_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getPlacementAccess().getPreferencesListOrMappingParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_30);
            	    lv_preferences_7_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlacementRule());
            	    							}
            	    							set(
            	    								current,
            	    								"preferences",
            	    								lv_preferences_7_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getPlacementAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "rulePlacement"


    // $ANTLR start "entryRuleRestartPolicy"
    // InternalComposeFileParser.g:2929:1: entryRuleRestartPolicy returns [EObject current=null] : iv_ruleRestartPolicy= ruleRestartPolicy EOF ;
    public final EObject entryRuleRestartPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartPolicy = null;


        try {
            // InternalComposeFileParser.g:2929:54: (iv_ruleRestartPolicy= ruleRestartPolicy EOF )
            // InternalComposeFileParser.g:2930:2: iv_ruleRestartPolicy= ruleRestartPolicy EOF
            {
             newCompositeNode(grammarAccess.getRestartPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestartPolicy=ruleRestartPolicy();

            state._fsp--;

             current =iv_ruleRestartPolicy; 
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
    // $ANTLR end "entryRuleRestartPolicy"


    // $ANTLR start "ruleRestartPolicy"
    // InternalComposeFileParser.g:2936:1: ruleRestartPolicy returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Condition otherlv_3= Colon ( (lv_condition_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Max_attempts otherlv_9= Colon ( (lv_max_attempts_10_0= ruleValue ) ) ) | (otherlv_11= Window otherlv_12= Colon ( (lv_window_13_0= ruleValue ) ) ) )+ this_END_14= RULE_END ) ;
    public final EObject ruleRestartPolicy() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_END_14=null;
        AntlrDatatypeRuleToken lv_condition_4_0 = null;

        AntlrDatatypeRuleToken lv_delay_7_0 = null;

        AntlrDatatypeRuleToken lv_max_attempts_10_0 = null;

        AntlrDatatypeRuleToken lv_window_13_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:2942:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Condition otherlv_3= Colon ( (lv_condition_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Max_attempts otherlv_9= Colon ( (lv_max_attempts_10_0= ruleValue ) ) ) | (otherlv_11= Window otherlv_12= Colon ( (lv_window_13_0= ruleValue ) ) ) )+ this_END_14= RULE_END ) )
            // InternalComposeFileParser.g:2943:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Condition otherlv_3= Colon ( (lv_condition_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Max_attempts otherlv_9= Colon ( (lv_max_attempts_10_0= ruleValue ) ) ) | (otherlv_11= Window otherlv_12= Colon ( (lv_window_13_0= ruleValue ) ) ) )+ this_END_14= RULE_END )
            {
            // InternalComposeFileParser.g:2943:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Condition otherlv_3= Colon ( (lv_condition_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Max_attempts otherlv_9= Colon ( (lv_max_attempts_10_0= ruleValue ) ) ) | (otherlv_11= Window otherlv_12= Colon ( (lv_window_13_0= ruleValue ) ) ) )+ this_END_14= RULE_END )
            // InternalComposeFileParser.g:2944:3: () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Condition otherlv_3= Colon ( (lv_condition_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Max_attempts otherlv_9= Colon ( (lv_max_attempts_10_0= ruleValue ) ) ) | (otherlv_11= Window otherlv_12= Colon ( (lv_window_13_0= ruleValue ) ) ) )+ this_END_14= RULE_END
            {
            // InternalComposeFileParser.g:2944:3: ()
            // InternalComposeFileParser.g:2945:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestartPolicyAccess().getRestartPolicyAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_31); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getRestartPolicyAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalComposeFileParser.g:2955:3: ( (otherlv_2= Condition otherlv_3= Colon ( (lv_condition_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Max_attempts otherlv_9= Colon ( (lv_max_attempts_10_0= ruleValue ) ) ) | (otherlv_11= Window otherlv_12= Colon ( (lv_window_13_0= ruleValue ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=5;
                switch ( input.LA(1) ) {
                case Condition:
                    {
                    alt18=1;
                    }
                    break;
                case Delay:
                    {
                    alt18=2;
                    }
                    break;
                case Max_attempts:
                    {
                    alt18=3;
                    }
                    break;
                case Window:
                    {
                    alt18=4;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalComposeFileParser.g:2956:4: (otherlv_2= Condition otherlv_3= Colon ( (lv_condition_4_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:2956:4: (otherlv_2= Condition otherlv_3= Colon ( (lv_condition_4_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:2957:5: otherlv_2= Condition otherlv_3= Colon ( (lv_condition_4_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,Condition,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getRestartPolicyAccess().getConditionKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_3, grammarAccess.getRestartPolicyAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalComposeFileParser.g:2965:5: ( (lv_condition_4_0= ruleValue ) )
            	    // InternalComposeFileParser.g:2966:6: (lv_condition_4_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:2966:6: (lv_condition_4_0= ruleValue )
            	    // InternalComposeFileParser.g:2967:7: lv_condition_4_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getRestartPolicyAccess().getConditionValueParserRuleCall_2_0_2_0());
            	    						
            	    pushFollow(FOLLOW_32);
            	    lv_condition_4_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRestartPolicyRule());
            	    							}
            	    							set(
            	    								current,
            	    								"condition",
            	    								lv_condition_4_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:2986:4: (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:2986:4: (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:2987:5: otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Delay,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getRestartPolicyAccess().getDelayKeyword_2_1_0());
            	    				
            	    otherlv_6=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_6, grammarAccess.getRestartPolicyAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalComposeFileParser.g:2995:5: ( (lv_delay_7_0= ruleValue ) )
            	    // InternalComposeFileParser.g:2996:6: (lv_delay_7_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:2996:6: (lv_delay_7_0= ruleValue )
            	    // InternalComposeFileParser.g:2997:7: lv_delay_7_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getRestartPolicyAccess().getDelayValueParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_32);
            	    lv_delay_7_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRestartPolicyRule());
            	    							}
            	    							set(
            	    								current,
            	    								"delay",
            	    								lv_delay_7_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:3016:4: (otherlv_8= Max_attempts otherlv_9= Colon ( (lv_max_attempts_10_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3016:4: (otherlv_8= Max_attempts otherlv_9= Colon ( (lv_max_attempts_10_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3017:5: otherlv_8= Max_attempts otherlv_9= Colon ( (lv_max_attempts_10_0= ruleValue ) )
            	    {
            	    otherlv_8=(Token)match(input,Max_attempts,FOLLOW_3); 

            	    					newLeafNode(otherlv_8, grammarAccess.getRestartPolicyAccess().getMax_attemptsKeyword_2_2_0());
            	    				
            	    otherlv_9=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_9, grammarAccess.getRestartPolicyAccess().getColonKeyword_2_2_1());
            	    				
            	    // InternalComposeFileParser.g:3025:5: ( (lv_max_attempts_10_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3026:6: (lv_max_attempts_10_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3026:6: (lv_max_attempts_10_0= ruleValue )
            	    // InternalComposeFileParser.g:3027:7: lv_max_attempts_10_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getRestartPolicyAccess().getMax_attemptsValueParserRuleCall_2_2_2_0());
            	    						
            	    pushFollow(FOLLOW_32);
            	    lv_max_attempts_10_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRestartPolicyRule());
            	    							}
            	    							set(
            	    								current,
            	    								"max_attempts",
            	    								lv_max_attempts_10_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComposeFileParser.g:3046:4: (otherlv_11= Window otherlv_12= Colon ( (lv_window_13_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3046:4: (otherlv_11= Window otherlv_12= Colon ( (lv_window_13_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3047:5: otherlv_11= Window otherlv_12= Colon ( (lv_window_13_0= ruleValue ) )
            	    {
            	    otherlv_11=(Token)match(input,Window,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getRestartPolicyAccess().getWindowKeyword_2_3_0());
            	    				
            	    otherlv_12=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_12, grammarAccess.getRestartPolicyAccess().getColonKeyword_2_3_1());
            	    				
            	    // InternalComposeFileParser.g:3055:5: ( (lv_window_13_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3056:6: (lv_window_13_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3056:6: (lv_window_13_0= ruleValue )
            	    // InternalComposeFileParser.g:3057:7: lv_window_13_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getRestartPolicyAccess().getWindowValueParserRuleCall_2_3_2_0());
            	    						
            	    pushFollow(FOLLOW_32);
            	    lv_window_13_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRestartPolicyRule());
            	    							}
            	    							set(
            	    								current,
            	    								"window",
            	    								lv_window_13_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_14, grammarAccess.getRestartPolicyAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleRestartPolicy"


    // $ANTLR start "entryRuleConfig"
    // InternalComposeFileParser.g:3084:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalComposeFileParser.g:3084:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalComposeFileParser.g:3085:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalComposeFileParser.g:3091:1: ruleConfig returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Parallelism otherlv_3= Colon ( (lv_parallelism_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Failure_action otherlv_9= Colon ( (lv_failure_action_10_0= ruleValue ) ) ) | (otherlv_11= Monitor otherlv_12= Colon ( (lv_monitor_13_0= ruleValue ) ) ) | (otherlv_14= Max_failure_ratio otherlv_15= Colon ( (lv_max_failure_ratio_16_0= ruleValue ) ) ) | (otherlv_17= Order otherlv_18= Colon ( (lv_order_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token this_END_20=null;
        AntlrDatatypeRuleToken lv_parallelism_4_0 = null;

        AntlrDatatypeRuleToken lv_delay_7_0 = null;

        AntlrDatatypeRuleToken lv_failure_action_10_0 = null;

        AntlrDatatypeRuleToken lv_monitor_13_0 = null;

        AntlrDatatypeRuleToken lv_max_failure_ratio_16_0 = null;

        AntlrDatatypeRuleToken lv_order_19_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:3097:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Parallelism otherlv_3= Colon ( (lv_parallelism_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Failure_action otherlv_9= Colon ( (lv_failure_action_10_0= ruleValue ) ) ) | (otherlv_11= Monitor otherlv_12= Colon ( (lv_monitor_13_0= ruleValue ) ) ) | (otherlv_14= Max_failure_ratio otherlv_15= Colon ( (lv_max_failure_ratio_16_0= ruleValue ) ) ) | (otherlv_17= Order otherlv_18= Colon ( (lv_order_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END ) )
            // InternalComposeFileParser.g:3098:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Parallelism otherlv_3= Colon ( (lv_parallelism_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Failure_action otherlv_9= Colon ( (lv_failure_action_10_0= ruleValue ) ) ) | (otherlv_11= Monitor otherlv_12= Colon ( (lv_monitor_13_0= ruleValue ) ) ) | (otherlv_14= Max_failure_ratio otherlv_15= Colon ( (lv_max_failure_ratio_16_0= ruleValue ) ) ) | (otherlv_17= Order otherlv_18= Colon ( (lv_order_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END )
            {
            // InternalComposeFileParser.g:3098:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Parallelism otherlv_3= Colon ( (lv_parallelism_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Failure_action otherlv_9= Colon ( (lv_failure_action_10_0= ruleValue ) ) ) | (otherlv_11= Monitor otherlv_12= Colon ( (lv_monitor_13_0= ruleValue ) ) ) | (otherlv_14= Max_failure_ratio otherlv_15= Colon ( (lv_max_failure_ratio_16_0= ruleValue ) ) ) | (otherlv_17= Order otherlv_18= Colon ( (lv_order_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END )
            // InternalComposeFileParser.g:3099:3: () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Parallelism otherlv_3= Colon ( (lv_parallelism_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Failure_action otherlv_9= Colon ( (lv_failure_action_10_0= ruleValue ) ) ) | (otherlv_11= Monitor otherlv_12= Colon ( (lv_monitor_13_0= ruleValue ) ) ) | (otherlv_14= Max_failure_ratio otherlv_15= Colon ( (lv_max_failure_ratio_16_0= ruleValue ) ) ) | (otherlv_17= Order otherlv_18= Colon ( (lv_order_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END
            {
            // InternalComposeFileParser.g:3099:3: ()
            // InternalComposeFileParser.g:3100:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getConfigAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalComposeFileParser.g:3110:3: ( (otherlv_2= Parallelism otherlv_3= Colon ( (lv_parallelism_4_0= ruleValue ) ) ) | (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) ) | (otherlv_8= Failure_action otherlv_9= Colon ( (lv_failure_action_10_0= ruleValue ) ) ) | (otherlv_11= Monitor otherlv_12= Colon ( (lv_monitor_13_0= ruleValue ) ) ) | (otherlv_14= Max_failure_ratio otherlv_15= Colon ( (lv_max_failure_ratio_16_0= ruleValue ) ) ) | (otherlv_17= Order otherlv_18= Colon ( (lv_order_19_0= ruleValue ) ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=7;
                switch ( input.LA(1) ) {
                case Parallelism:
                    {
                    alt19=1;
                    }
                    break;
                case Delay:
                    {
                    alt19=2;
                    }
                    break;
                case Failure_action:
                    {
                    alt19=3;
                    }
                    break;
                case Monitor:
                    {
                    alt19=4;
                    }
                    break;
                case Max_failure_ratio:
                    {
                    alt19=5;
                    }
                    break;
                case Order:
                    {
                    alt19=6;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalComposeFileParser.g:3111:4: (otherlv_2= Parallelism otherlv_3= Colon ( (lv_parallelism_4_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3111:4: (otherlv_2= Parallelism otherlv_3= Colon ( (lv_parallelism_4_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3112:5: otherlv_2= Parallelism otherlv_3= Colon ( (lv_parallelism_4_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,Parallelism,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getParallelismKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalComposeFileParser.g:3120:5: ( (lv_parallelism_4_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3121:6: (lv_parallelism_4_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3121:6: (lv_parallelism_4_0= ruleValue )
            	    // InternalComposeFileParser.g:3122:7: lv_parallelism_4_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getConfigAccess().getParallelismValueParserRuleCall_2_0_2_0());
            	    						
            	    pushFollow(FOLLOW_34);
            	    lv_parallelism_4_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfigRule());
            	    							}
            	    							set(
            	    								current,
            	    								"parallelism",
            	    								lv_parallelism_4_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:3141:4: (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3141:4: (otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3142:5: otherlv_5= Delay otherlv_6= Colon ( (lv_delay_7_0= ruleValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Delay,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getDelayKeyword_2_1_0());
            	    				
            	    otherlv_6=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalComposeFileParser.g:3150:5: ( (lv_delay_7_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3151:6: (lv_delay_7_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3151:6: (lv_delay_7_0= ruleValue )
            	    // InternalComposeFileParser.g:3152:7: lv_delay_7_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getConfigAccess().getDelayValueParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_34);
            	    lv_delay_7_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfigRule());
            	    							}
            	    							set(
            	    								current,
            	    								"delay",
            	    								lv_delay_7_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:3171:4: (otherlv_8= Failure_action otherlv_9= Colon ( (lv_failure_action_10_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3171:4: (otherlv_8= Failure_action otherlv_9= Colon ( (lv_failure_action_10_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3172:5: otherlv_8= Failure_action otherlv_9= Colon ( (lv_failure_action_10_0= ruleValue ) )
            	    {
            	    otherlv_8=(Token)match(input,Failure_action,FOLLOW_3); 

            	    					newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getFailure_actionKeyword_2_2_0());
            	    				
            	    otherlv_9=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_9, grammarAccess.getConfigAccess().getColonKeyword_2_2_1());
            	    				
            	    // InternalComposeFileParser.g:3180:5: ( (lv_failure_action_10_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3181:6: (lv_failure_action_10_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3181:6: (lv_failure_action_10_0= ruleValue )
            	    // InternalComposeFileParser.g:3182:7: lv_failure_action_10_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getConfigAccess().getFailure_actionValueParserRuleCall_2_2_2_0());
            	    						
            	    pushFollow(FOLLOW_34);
            	    lv_failure_action_10_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfigRule());
            	    							}
            	    							set(
            	    								current,
            	    								"failure_action",
            	    								lv_failure_action_10_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComposeFileParser.g:3201:4: (otherlv_11= Monitor otherlv_12= Colon ( (lv_monitor_13_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3201:4: (otherlv_11= Monitor otherlv_12= Colon ( (lv_monitor_13_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3202:5: otherlv_11= Monitor otherlv_12= Colon ( (lv_monitor_13_0= ruleValue ) )
            	    {
            	    otherlv_11=(Token)match(input,Monitor,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getConfigAccess().getMonitorKeyword_2_3_0());
            	    				
            	    otherlv_12=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_12, grammarAccess.getConfigAccess().getColonKeyword_2_3_1());
            	    				
            	    // InternalComposeFileParser.g:3210:5: ( (lv_monitor_13_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3211:6: (lv_monitor_13_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3211:6: (lv_monitor_13_0= ruleValue )
            	    // InternalComposeFileParser.g:3212:7: lv_monitor_13_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getConfigAccess().getMonitorValueParserRuleCall_2_3_2_0());
            	    						
            	    pushFollow(FOLLOW_34);
            	    lv_monitor_13_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfigRule());
            	    							}
            	    							set(
            	    								current,
            	    								"monitor",
            	    								lv_monitor_13_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComposeFileParser.g:3231:4: (otherlv_14= Max_failure_ratio otherlv_15= Colon ( (lv_max_failure_ratio_16_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3231:4: (otherlv_14= Max_failure_ratio otherlv_15= Colon ( (lv_max_failure_ratio_16_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3232:5: otherlv_14= Max_failure_ratio otherlv_15= Colon ( (lv_max_failure_ratio_16_0= ruleValue ) )
            	    {
            	    otherlv_14=(Token)match(input,Max_failure_ratio,FOLLOW_3); 

            	    					newLeafNode(otherlv_14, grammarAccess.getConfigAccess().getMax_failure_ratioKeyword_2_4_0());
            	    				
            	    otherlv_15=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_15, grammarAccess.getConfigAccess().getColonKeyword_2_4_1());
            	    				
            	    // InternalComposeFileParser.g:3240:5: ( (lv_max_failure_ratio_16_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3241:6: (lv_max_failure_ratio_16_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3241:6: (lv_max_failure_ratio_16_0= ruleValue )
            	    // InternalComposeFileParser.g:3242:7: lv_max_failure_ratio_16_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getConfigAccess().getMax_failure_ratioValueParserRuleCall_2_4_2_0());
            	    						
            	    pushFollow(FOLLOW_34);
            	    lv_max_failure_ratio_16_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfigRule());
            	    							}
            	    							set(
            	    								current,
            	    								"max_failure_ratio",
            	    								lv_max_failure_ratio_16_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalComposeFileParser.g:3261:4: (otherlv_17= Order otherlv_18= Colon ( (lv_order_19_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3261:4: (otherlv_17= Order otherlv_18= Colon ( (lv_order_19_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3262:5: otherlv_17= Order otherlv_18= Colon ( (lv_order_19_0= ruleValue ) )
            	    {
            	    otherlv_17=(Token)match(input,Order,FOLLOW_3); 

            	    					newLeafNode(otherlv_17, grammarAccess.getConfigAccess().getOrderKeyword_2_5_0());
            	    				
            	    otherlv_18=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_18, grammarAccess.getConfigAccess().getColonKeyword_2_5_1());
            	    				
            	    // InternalComposeFileParser.g:3270:5: ( (lv_order_19_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3271:6: (lv_order_19_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3271:6: (lv_order_19_0= ruleValue )
            	    // InternalComposeFileParser.g:3272:7: lv_order_19_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getConfigAccess().getOrderValueParserRuleCall_2_5_2_0());
            	    						
            	    pushFollow(FOLLOW_34);
            	    lv_order_19_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfigRule());
            	    							}
            	    							set(
            	    								current,
            	    								"order",
            	    								lv_order_19_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            this_END_20=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_20, grammarAccess.getConfigAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleHealthcheck"
    // InternalComposeFileParser.g:3299:1: entryRuleHealthcheck returns [EObject current=null] : iv_ruleHealthcheck= ruleHealthcheck EOF ;
    public final EObject entryRuleHealthcheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthcheck = null;


        try {
            // InternalComposeFileParser.g:3299:52: (iv_ruleHealthcheck= ruleHealthcheck EOF )
            // InternalComposeFileParser.g:3300:2: iv_ruleHealthcheck= ruleHealthcheck EOF
            {
             newCompositeNode(grammarAccess.getHealthcheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHealthcheck=ruleHealthcheck();

            state._fsp--;

             current =iv_ruleHealthcheck; 
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
    // $ANTLR end "entryRuleHealthcheck"


    // $ANTLR start "ruleHealthcheck"
    // InternalComposeFileParser.g:3306:1: ruleHealthcheck returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Disable otherlv_3= Colon ( (lv_disable_4_0= ruleValue ) ) ) | (otherlv_5= Interval otherlv_6= Colon ( (lv_interval_7_0= ruleValue ) ) ) | (otherlv_8= Retries otherlv_9= Colon ( (lv_retries_10_0= ruleValue ) ) ) | (otherlv_11= Test otherlv_12= Colon ( (lv_test_13_0= ruleValueOrList ) ) ) | (otherlv_14= Timeout otherlv_15= Colon ( (lv_timeout_16_0= ruleValue ) ) ) | (otherlv_17= Start_period otherlv_18= Colon ( (lv_start_period_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END ) ;
    public final EObject ruleHealthcheck() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token this_END_20=null;
        AntlrDatatypeRuleToken lv_disable_4_0 = null;

        AntlrDatatypeRuleToken lv_interval_7_0 = null;

        AntlrDatatypeRuleToken lv_retries_10_0 = null;

        EObject lv_test_13_0 = null;

        AntlrDatatypeRuleToken lv_timeout_16_0 = null;

        AntlrDatatypeRuleToken lv_start_period_19_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:3312:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Disable otherlv_3= Colon ( (lv_disable_4_0= ruleValue ) ) ) | (otherlv_5= Interval otherlv_6= Colon ( (lv_interval_7_0= ruleValue ) ) ) | (otherlv_8= Retries otherlv_9= Colon ( (lv_retries_10_0= ruleValue ) ) ) | (otherlv_11= Test otherlv_12= Colon ( (lv_test_13_0= ruleValueOrList ) ) ) | (otherlv_14= Timeout otherlv_15= Colon ( (lv_timeout_16_0= ruleValue ) ) ) | (otherlv_17= Start_period otherlv_18= Colon ( (lv_start_period_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END ) )
            // InternalComposeFileParser.g:3313:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Disable otherlv_3= Colon ( (lv_disable_4_0= ruleValue ) ) ) | (otherlv_5= Interval otherlv_6= Colon ( (lv_interval_7_0= ruleValue ) ) ) | (otherlv_8= Retries otherlv_9= Colon ( (lv_retries_10_0= ruleValue ) ) ) | (otherlv_11= Test otherlv_12= Colon ( (lv_test_13_0= ruleValueOrList ) ) ) | (otherlv_14= Timeout otherlv_15= Colon ( (lv_timeout_16_0= ruleValue ) ) ) | (otherlv_17= Start_period otherlv_18= Colon ( (lv_start_period_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END )
            {
            // InternalComposeFileParser.g:3313:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Disable otherlv_3= Colon ( (lv_disable_4_0= ruleValue ) ) ) | (otherlv_5= Interval otherlv_6= Colon ( (lv_interval_7_0= ruleValue ) ) ) | (otherlv_8= Retries otherlv_9= Colon ( (lv_retries_10_0= ruleValue ) ) ) | (otherlv_11= Test otherlv_12= Colon ( (lv_test_13_0= ruleValueOrList ) ) ) | (otherlv_14= Timeout otherlv_15= Colon ( (lv_timeout_16_0= ruleValue ) ) ) | (otherlv_17= Start_period otherlv_18= Colon ( (lv_start_period_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END )
            // InternalComposeFileParser.g:3314:3: () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Disable otherlv_3= Colon ( (lv_disable_4_0= ruleValue ) ) ) | (otherlv_5= Interval otherlv_6= Colon ( (lv_interval_7_0= ruleValue ) ) ) | (otherlv_8= Retries otherlv_9= Colon ( (lv_retries_10_0= ruleValue ) ) ) | (otherlv_11= Test otherlv_12= Colon ( (lv_test_13_0= ruleValueOrList ) ) ) | (otherlv_14= Timeout otherlv_15= Colon ( (lv_timeout_16_0= ruleValue ) ) ) | (otherlv_17= Start_period otherlv_18= Colon ( (lv_start_period_19_0= ruleValue ) ) ) )+ this_END_20= RULE_END
            {
            // InternalComposeFileParser.g:3314:3: ()
            // InternalComposeFileParser.g:3315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHealthcheckAccess().getHealthcheckAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_35); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getHealthcheckAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalComposeFileParser.g:3325:3: ( (otherlv_2= Disable otherlv_3= Colon ( (lv_disable_4_0= ruleValue ) ) ) | (otherlv_5= Interval otherlv_6= Colon ( (lv_interval_7_0= ruleValue ) ) ) | (otherlv_8= Retries otherlv_9= Colon ( (lv_retries_10_0= ruleValue ) ) ) | (otherlv_11= Test otherlv_12= Colon ( (lv_test_13_0= ruleValueOrList ) ) ) | (otherlv_14= Timeout otherlv_15= Colon ( (lv_timeout_16_0= ruleValue ) ) ) | (otherlv_17= Start_period otherlv_18= Colon ( (lv_start_period_19_0= ruleValue ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=7;
                switch ( input.LA(1) ) {
                case Disable:
                    {
                    alt20=1;
                    }
                    break;
                case Interval:
                    {
                    alt20=2;
                    }
                    break;
                case Retries:
                    {
                    alt20=3;
                    }
                    break;
                case Test:
                    {
                    alt20=4;
                    }
                    break;
                case Timeout:
                    {
                    alt20=5;
                    }
                    break;
                case Start_period:
                    {
                    alt20=6;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalComposeFileParser.g:3326:4: (otherlv_2= Disable otherlv_3= Colon ( (lv_disable_4_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3326:4: (otherlv_2= Disable otherlv_3= Colon ( (lv_disable_4_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3327:5: otherlv_2= Disable otherlv_3= Colon ( (lv_disable_4_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,Disable,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getHealthcheckAccess().getDisableKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_3, grammarAccess.getHealthcheckAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalComposeFileParser.g:3335:5: ( (lv_disable_4_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3336:6: (lv_disable_4_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3336:6: (lv_disable_4_0= ruleValue )
            	    // InternalComposeFileParser.g:3337:7: lv_disable_4_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getDisableValueParserRuleCall_2_0_2_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_disable_4_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"disable",
            	    								lv_disable_4_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:3356:4: (otherlv_5= Interval otherlv_6= Colon ( (lv_interval_7_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3356:4: (otherlv_5= Interval otherlv_6= Colon ( (lv_interval_7_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3357:5: otherlv_5= Interval otherlv_6= Colon ( (lv_interval_7_0= ruleValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Interval,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getHealthcheckAccess().getIntervalKeyword_2_1_0());
            	    				
            	    otherlv_6=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_6, grammarAccess.getHealthcheckAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalComposeFileParser.g:3365:5: ( (lv_interval_7_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3366:6: (lv_interval_7_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3366:6: (lv_interval_7_0= ruleValue )
            	    // InternalComposeFileParser.g:3367:7: lv_interval_7_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getIntervalValueParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_interval_7_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"interval",
            	    								lv_interval_7_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:3386:4: (otherlv_8= Retries otherlv_9= Colon ( (lv_retries_10_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3386:4: (otherlv_8= Retries otherlv_9= Colon ( (lv_retries_10_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3387:5: otherlv_8= Retries otherlv_9= Colon ( (lv_retries_10_0= ruleValue ) )
            	    {
            	    otherlv_8=(Token)match(input,Retries,FOLLOW_3); 

            	    					newLeafNode(otherlv_8, grammarAccess.getHealthcheckAccess().getRetriesKeyword_2_2_0());
            	    				
            	    otherlv_9=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_9, grammarAccess.getHealthcheckAccess().getColonKeyword_2_2_1());
            	    				
            	    // InternalComposeFileParser.g:3395:5: ( (lv_retries_10_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3396:6: (lv_retries_10_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3396:6: (lv_retries_10_0= ruleValue )
            	    // InternalComposeFileParser.g:3397:7: lv_retries_10_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getRetriesValueParserRuleCall_2_2_2_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_retries_10_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"retries",
            	    								lv_retries_10_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComposeFileParser.g:3416:4: (otherlv_11= Test otherlv_12= Colon ( (lv_test_13_0= ruleValueOrList ) ) )
            	    {
            	    // InternalComposeFileParser.g:3416:4: (otherlv_11= Test otherlv_12= Colon ( (lv_test_13_0= ruleValueOrList ) ) )
            	    // InternalComposeFileParser.g:3417:5: otherlv_11= Test otherlv_12= Colon ( (lv_test_13_0= ruleValueOrList ) )
            	    {
            	    otherlv_11=(Token)match(input,Test,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getHealthcheckAccess().getTestKeyword_2_3_0());
            	    				
            	    otherlv_12=(Token)match(input,Colon,FOLLOW_13); 

            	    					newLeafNode(otherlv_12, grammarAccess.getHealthcheckAccess().getColonKeyword_2_3_1());
            	    				
            	    // InternalComposeFileParser.g:3425:5: ( (lv_test_13_0= ruleValueOrList ) )
            	    // InternalComposeFileParser.g:3426:6: (lv_test_13_0= ruleValueOrList )
            	    {
            	    // InternalComposeFileParser.g:3426:6: (lv_test_13_0= ruleValueOrList )
            	    // InternalComposeFileParser.g:3427:7: lv_test_13_0= ruleValueOrList
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getTestValueOrListParserRuleCall_2_3_2_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_test_13_0=ruleValueOrList();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"test",
            	    								lv_test_13_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ValueOrList");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComposeFileParser.g:3446:4: (otherlv_14= Timeout otherlv_15= Colon ( (lv_timeout_16_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3446:4: (otherlv_14= Timeout otherlv_15= Colon ( (lv_timeout_16_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3447:5: otherlv_14= Timeout otherlv_15= Colon ( (lv_timeout_16_0= ruleValue ) )
            	    {
            	    otherlv_14=(Token)match(input,Timeout,FOLLOW_3); 

            	    					newLeafNode(otherlv_14, grammarAccess.getHealthcheckAccess().getTimeoutKeyword_2_4_0());
            	    				
            	    otherlv_15=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_15, grammarAccess.getHealthcheckAccess().getColonKeyword_2_4_1());
            	    				
            	    // InternalComposeFileParser.g:3455:5: ( (lv_timeout_16_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3456:6: (lv_timeout_16_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3456:6: (lv_timeout_16_0= ruleValue )
            	    // InternalComposeFileParser.g:3457:7: lv_timeout_16_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getTimeoutValueParserRuleCall_2_4_2_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_timeout_16_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"timeout",
            	    								lv_timeout_16_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalComposeFileParser.g:3476:4: (otherlv_17= Start_period otherlv_18= Colon ( (lv_start_period_19_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:3476:4: (otherlv_17= Start_period otherlv_18= Colon ( (lv_start_period_19_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3477:5: otherlv_17= Start_period otherlv_18= Colon ( (lv_start_period_19_0= ruleValue ) )
            	    {
            	    otherlv_17=(Token)match(input,Start_period,FOLLOW_3); 

            	    					newLeafNode(otherlv_17, grammarAccess.getHealthcheckAccess().getStart_periodKeyword_2_5_0());
            	    				
            	    otherlv_18=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_18, grammarAccess.getHealthcheckAccess().getColonKeyword_2_5_1());
            	    				
            	    // InternalComposeFileParser.g:3485:5: ( (lv_start_period_19_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3486:6: (lv_start_period_19_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3486:6: (lv_start_period_19_0= ruleValue )
            	    // InternalComposeFileParser.g:3487:7: lv_start_period_19_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getStart_periodValueParserRuleCall_2_5_2_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_start_period_19_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"start_period",
            	    								lv_start_period_19_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            this_END_20=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_20, grammarAccess.getHealthcheckAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleHealthcheck"


    // $ANTLR start "entryRuleLogging"
    // InternalComposeFileParser.g:3514:1: entryRuleLogging returns [EObject current=null] : iv_ruleLogging= ruleLogging EOF ;
    public final EObject entryRuleLogging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogging = null;


        try {
            // InternalComposeFileParser.g:3514:48: (iv_ruleLogging= ruleLogging EOF )
            // InternalComposeFileParser.g:3515:2: iv_ruleLogging= ruleLogging EOF
            {
             newCompositeNode(grammarAccess.getLoggingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogging=ruleLogging();

            state._fsp--;

             current =iv_ruleLogging; 
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
    // $ANTLR end "entryRuleLogging"


    // $ANTLR start "ruleLogging"
    // InternalComposeFileParser.g:3521:1: ruleLogging returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Options otherlv_6= Colon ( (lv_options_7_0= ruleMapping ) ) ) )+ this_END_8= RULE_END ) ;
    public final EObject ruleLogging() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_driver_4_0 = null;

        EObject lv_options_7_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:3527:2: ( ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Options otherlv_6= Colon ( (lv_options_7_0= ruleMapping ) ) ) )+ this_END_8= RULE_END ) )
            // InternalComposeFileParser.g:3528:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Options otherlv_6= Colon ( (lv_options_7_0= ruleMapping ) ) ) )+ this_END_8= RULE_END )
            {
            // InternalComposeFileParser.g:3528:2: ( () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Options otherlv_6= Colon ( (lv_options_7_0= ruleMapping ) ) ) )+ this_END_8= RULE_END )
            // InternalComposeFileParser.g:3529:3: () this_BEGIN_1= RULE_BEGIN ( (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Options otherlv_6= Colon ( (lv_options_7_0= ruleMapping ) ) ) )+ this_END_8= RULE_END
            {
            // InternalComposeFileParser.g:3529:3: ()
            // InternalComposeFileParser.g:3530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoggingAccess().getLoggingAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getLoggingAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalComposeFileParser.g:3540:3: ( (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Options otherlv_6= Colon ( (lv_options_7_0= ruleMapping ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Driver) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComposeFileParser.g:3541:4: (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Options otherlv_6= Colon ( (lv_options_7_0= ruleMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:3541:4: (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:3542:5: otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,Driver,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getLoggingAccess().getDriverKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_3, grammarAccess.getLoggingAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalComposeFileParser.g:3550:5: ( (lv_driver_4_0= ruleValue ) )
            	    // InternalComposeFileParser.g:3551:6: (lv_driver_4_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:3551:6: (lv_driver_4_0= ruleValue )
            	    // InternalComposeFileParser.g:3552:7: lv_driver_4_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getLoggingAccess().getDriverValueParserRuleCall_2_0_2_0());
            	    						
            	    pushFollow(FOLLOW_38);
            	    lv_driver_4_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLoggingRule());
            	    							}
            	    							set(
            	    								current,
            	    								"driver",
            	    								lv_driver_4_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }

            	    // InternalComposeFileParser.g:3570:4: (otherlv_5= Options otherlv_6= Colon ( (lv_options_7_0= ruleMapping ) ) )
            	    // InternalComposeFileParser.g:3571:5: otherlv_5= Options otherlv_6= Colon ( (lv_options_7_0= ruleMapping ) )
            	    {
            	    otherlv_5=(Token)match(input,Options,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getLoggingAccess().getOptionsKeyword_2_1_0());
            	    				
            	    otherlv_6=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getLoggingAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalComposeFileParser.g:3579:5: ( (lv_options_7_0= ruleMapping ) )
            	    // InternalComposeFileParser.g:3580:6: (lv_options_7_0= ruleMapping )
            	    {
            	    // InternalComposeFileParser.g:3580:6: (lv_options_7_0= ruleMapping )
            	    // InternalComposeFileParser.g:3581:7: lv_options_7_0= ruleMapping
            	    {

            	    							newCompositeNode(grammarAccess.getLoggingAccess().getOptionsMappingParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_39);
            	    lv_options_7_0=ruleMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLoggingRule());
            	    							}
            	    							set(
            	    								current,
            	    								"options",
            	    								lv_options_7_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Mapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getLoggingAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleLogging"


    // $ANTLR start "entryRulePorts"
    // InternalComposeFileParser.g:3608:1: entryRulePorts returns [EObject current=null] : iv_rulePorts= rulePorts EOF ;
    public final EObject entryRulePorts() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePorts = null;


        try {
            // InternalComposeFileParser.g:3608:46: (iv_rulePorts= rulePorts EOF )
            // InternalComposeFileParser.g:3609:2: iv_rulePorts= rulePorts EOF
            {
             newCompositeNode(grammarAccess.getPortsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePorts=rulePorts();

            state._fsp--;

             current =iv_rulePorts; 
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
    // $ANTLR end "entryRulePorts"


    // $ANTLR start "rulePorts"
    // InternalComposeFileParser.g:3615:1: rulePorts returns [EObject current=null] : ( ( () ( (lv_ports_1_0= ruleList ) ) ) | this_PortLongSyntax_2= rulePortLongSyntax ) ;
    public final EObject rulePorts() throws RecognitionException {
        EObject current = null;

        EObject lv_ports_1_0 = null;

        EObject this_PortLongSyntax_2 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:3621:2: ( ( ( () ( (lv_ports_1_0= ruleList ) ) ) | this_PortLongSyntax_2= rulePortLongSyntax ) )
            // InternalComposeFileParser.g:3622:2: ( ( () ( (lv_ports_1_0= ruleList ) ) ) | this_PortLongSyntax_2= rulePortLongSyntax )
            {
            // InternalComposeFileParser.g:3622:2: ( ( () ( (lv_ports_1_0= ruleList ) ) ) | this_PortLongSyntax_2= rulePortLongSyntax )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BEGIN) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==HyphenMinusSpace) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==RULE_ID||LA22_2==RULE_STRING) ) {
                        alt22=1;
                    }
                    else if ( (LA22_2==Target) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalComposeFileParser.g:3623:3: ( () ( (lv_ports_1_0= ruleList ) ) )
                    {
                    // InternalComposeFileParser.g:3623:3: ( () ( (lv_ports_1_0= ruleList ) ) )
                    // InternalComposeFileParser.g:3624:4: () ( (lv_ports_1_0= ruleList ) )
                    {
                    // InternalComposeFileParser.g:3624:4: ()
                    // InternalComposeFileParser.g:3625:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPortsAccess().getPortsAction_0_0(),
                    						current);
                    				

                    }

                    // InternalComposeFileParser.g:3631:4: ( (lv_ports_1_0= ruleList ) )
                    // InternalComposeFileParser.g:3632:5: (lv_ports_1_0= ruleList )
                    {
                    // InternalComposeFileParser.g:3632:5: (lv_ports_1_0= ruleList )
                    // InternalComposeFileParser.g:3633:6: lv_ports_1_0= ruleList
                    {

                    						newCompositeNode(grammarAccess.getPortsAccess().getPortsListParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ports_1_0=ruleList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortsRule());
                    						}
                    						set(
                    							current,
                    							"ports",
                    							lv_ports_1_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.List");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:3652:3: this_PortLongSyntax_2= rulePortLongSyntax
                    {

                    			newCompositeNode(grammarAccess.getPortsAccess().getPortLongSyntaxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortLongSyntax_2=rulePortLongSyntax();

                    state._fsp--;


                    			current = this_PortLongSyntax_2;
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
    // $ANTLR end "rulePorts"


    // $ANTLR start "entryRulePortLongSyntax"
    // InternalComposeFileParser.g:3664:1: entryRulePortLongSyntax returns [EObject current=null] : iv_rulePortLongSyntax= rulePortLongSyntax EOF ;
    public final EObject entryRulePortLongSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortLongSyntax = null;


        try {
            // InternalComposeFileParser.g:3664:55: (iv_rulePortLongSyntax= rulePortLongSyntax EOF )
            // InternalComposeFileParser.g:3665:2: iv_rulePortLongSyntax= rulePortLongSyntax EOF
            {
             newCompositeNode(grammarAccess.getPortLongSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortLongSyntax=rulePortLongSyntax();

            state._fsp--;

             current =iv_rulePortLongSyntax; 
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
    // $ANTLR end "entryRulePortLongSyntax"


    // $ANTLR start "rulePortLongSyntax"
    // InternalComposeFileParser.g:3671:1: rulePortLongSyntax returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Target otherlv_3= Colon ( (lv_target_4_0= ruleValue ) ) ) (otherlv_5= Published otherlv_6= Colon ( (lv_published_7_0= ruleValue ) ) ) (otherlv_8= Protocol otherlv_9= Colon ( (lv_protocol_10_0= ruleValue ) ) ) (otherlv_11= Mode otherlv_12= Colon ( (lv_mode_13_0= ruleValue ) ) ) this_END_14= RULE_END ) ;
    public final EObject rulePortLongSyntax() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_END_14=null;
        AntlrDatatypeRuleToken lv_target_4_0 = null;

        AntlrDatatypeRuleToken lv_published_7_0 = null;

        AntlrDatatypeRuleToken lv_protocol_10_0 = null;

        AntlrDatatypeRuleToken lv_mode_13_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:3677:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Target otherlv_3= Colon ( (lv_target_4_0= ruleValue ) ) ) (otherlv_5= Published otherlv_6= Colon ( (lv_published_7_0= ruleValue ) ) ) (otherlv_8= Protocol otherlv_9= Colon ( (lv_protocol_10_0= ruleValue ) ) ) (otherlv_11= Mode otherlv_12= Colon ( (lv_mode_13_0= ruleValue ) ) ) this_END_14= RULE_END ) )
            // InternalComposeFileParser.g:3678:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Target otherlv_3= Colon ( (lv_target_4_0= ruleValue ) ) ) (otherlv_5= Published otherlv_6= Colon ( (lv_published_7_0= ruleValue ) ) ) (otherlv_8= Protocol otherlv_9= Colon ( (lv_protocol_10_0= ruleValue ) ) ) (otherlv_11= Mode otherlv_12= Colon ( (lv_mode_13_0= ruleValue ) ) ) this_END_14= RULE_END )
            {
            // InternalComposeFileParser.g:3678:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Target otherlv_3= Colon ( (lv_target_4_0= ruleValue ) ) ) (otherlv_5= Published otherlv_6= Colon ( (lv_published_7_0= ruleValue ) ) ) (otherlv_8= Protocol otherlv_9= Colon ( (lv_protocol_10_0= ruleValue ) ) ) (otherlv_11= Mode otherlv_12= Colon ( (lv_mode_13_0= ruleValue ) ) ) this_END_14= RULE_END )
            // InternalComposeFileParser.g:3679:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Target otherlv_3= Colon ( (lv_target_4_0= ruleValue ) ) ) (otherlv_5= Published otherlv_6= Colon ( (lv_published_7_0= ruleValue ) ) ) (otherlv_8= Protocol otherlv_9= Colon ( (lv_protocol_10_0= ruleValue ) ) ) (otherlv_11= Mode otherlv_12= Colon ( (lv_mode_13_0= ruleValue ) ) ) this_END_14= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getPortLongSyntaxAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalComposeFileParser.g:3683:3: (otherlv_1= HyphenMinusSpace otherlv_2= Target otherlv_3= Colon ( (lv_target_4_0= ruleValue ) ) )
            // InternalComposeFileParser.g:3684:4: otherlv_1= HyphenMinusSpace otherlv_2= Target otherlv_3= Colon ( (lv_target_4_0= ruleValue ) )
            {
            otherlv_1=(Token)match(input,HyphenMinusSpace,FOLLOW_22); 

            				newLeafNode(otherlv_1, grammarAccess.getPortLongSyntaxAccess().getHyphenMinusSpaceKeyword_1_0());
            			
            otherlv_2=(Token)match(input,Target,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getPortLongSyntaxAccess().getTargetKeyword_1_1());
            			
            otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getPortLongSyntaxAccess().getColonKeyword_1_2());
            			
            // InternalComposeFileParser.g:3696:4: ( (lv_target_4_0= ruleValue ) )
            // InternalComposeFileParser.g:3697:5: (lv_target_4_0= ruleValue )
            {
            // InternalComposeFileParser.g:3697:5: (lv_target_4_0= ruleValue )
            // InternalComposeFileParser.g:3698:6: lv_target_4_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getPortLongSyntaxAccess().getTargetValueParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_40);
            lv_target_4_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPortLongSyntaxRule());
            						}
            						set(
            							current,
            							"target",
            							lv_target_4_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:3716:3: (otherlv_5= Published otherlv_6= Colon ( (lv_published_7_0= ruleValue ) ) )
            // InternalComposeFileParser.g:3717:4: otherlv_5= Published otherlv_6= Colon ( (lv_published_7_0= ruleValue ) )
            {
            otherlv_5=(Token)match(input,Published,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getPortLongSyntaxAccess().getPublishedKeyword_2_0());
            			
            otherlv_6=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_6, grammarAccess.getPortLongSyntaxAccess().getColonKeyword_2_1());
            			
            // InternalComposeFileParser.g:3725:4: ( (lv_published_7_0= ruleValue ) )
            // InternalComposeFileParser.g:3726:5: (lv_published_7_0= ruleValue )
            {
            // InternalComposeFileParser.g:3726:5: (lv_published_7_0= ruleValue )
            // InternalComposeFileParser.g:3727:6: lv_published_7_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getPortLongSyntaxAccess().getPublishedValueParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_41);
            lv_published_7_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPortLongSyntaxRule());
            						}
            						set(
            							current,
            							"published",
            							lv_published_7_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:3745:3: (otherlv_8= Protocol otherlv_9= Colon ( (lv_protocol_10_0= ruleValue ) ) )
            // InternalComposeFileParser.g:3746:4: otherlv_8= Protocol otherlv_9= Colon ( (lv_protocol_10_0= ruleValue ) )
            {
            otherlv_8=(Token)match(input,Protocol,FOLLOW_3); 

            				newLeafNode(otherlv_8, grammarAccess.getPortLongSyntaxAccess().getProtocolKeyword_3_0());
            			
            otherlv_9=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_9, grammarAccess.getPortLongSyntaxAccess().getColonKeyword_3_1());
            			
            // InternalComposeFileParser.g:3754:4: ( (lv_protocol_10_0= ruleValue ) )
            // InternalComposeFileParser.g:3755:5: (lv_protocol_10_0= ruleValue )
            {
            // InternalComposeFileParser.g:3755:5: (lv_protocol_10_0= ruleValue )
            // InternalComposeFileParser.g:3756:6: lv_protocol_10_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getPortLongSyntaxAccess().getProtocolValueParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_25);
            lv_protocol_10_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPortLongSyntaxRule());
            						}
            						set(
            							current,
            							"protocol",
            							lv_protocol_10_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:3774:3: (otherlv_11= Mode otherlv_12= Colon ( (lv_mode_13_0= ruleValue ) ) )
            // InternalComposeFileParser.g:3775:4: otherlv_11= Mode otherlv_12= Colon ( (lv_mode_13_0= ruleValue ) )
            {
            otherlv_11=(Token)match(input,Mode,FOLLOW_3); 

            				newLeafNode(otherlv_11, grammarAccess.getPortLongSyntaxAccess().getModeKeyword_4_0());
            			
            otherlv_12=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_12, grammarAccess.getPortLongSyntaxAccess().getColonKeyword_4_1());
            			
            // InternalComposeFileParser.g:3783:4: ( (lv_mode_13_0= ruleValue ) )
            // InternalComposeFileParser.g:3784:5: (lv_mode_13_0= ruleValue )
            {
            // InternalComposeFileParser.g:3784:5: (lv_mode_13_0= ruleValue )
            // InternalComposeFileParser.g:3785:6: lv_mode_13_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getPortLongSyntaxAccess().getModeValueParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_26);
            lv_mode_13_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPortLongSyntaxRule());
            						}
            						set(
            							current,
            							"mode",
            							lv_mode_13_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_14, grammarAccess.getPortLongSyntaxAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "rulePortLongSyntax"


    // $ANTLR start "entryRuleServiceSecrets"
    // InternalComposeFileParser.g:3811:1: entryRuleServiceSecrets returns [EObject current=null] : iv_ruleServiceSecrets= ruleServiceSecrets EOF ;
    public final EObject entryRuleServiceSecrets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSecrets = null;


        try {
            // InternalComposeFileParser.g:3811:55: (iv_ruleServiceSecrets= ruleServiceSecrets EOF )
            // InternalComposeFileParser.g:3812:2: iv_ruleServiceSecrets= ruleServiceSecrets EOF
            {
             newCompositeNode(grammarAccess.getServiceSecretsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceSecrets=ruleServiceSecrets();

            state._fsp--;

             current =iv_ruleServiceSecrets; 
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
    // $ANTLR end "entryRuleServiceSecrets"


    // $ANTLR start "ruleServiceSecrets"
    // InternalComposeFileParser.g:3818:1: ruleServiceSecrets returns [EObject current=null] : ( ( () ( (lv_secret_1_0= ruleValue ) ) ) | this_ServiceSecretsLongSyntax_2= ruleServiceSecretsLongSyntax ) ;
    public final EObject ruleServiceSecrets() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_secret_1_0 = null;

        EObject this_ServiceSecretsLongSyntax_2 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:3824:2: ( ( ( () ( (lv_secret_1_0= ruleValue ) ) ) | this_ServiceSecretsLongSyntax_2= ruleServiceSecretsLongSyntax ) )
            // InternalComposeFileParser.g:3825:2: ( ( () ( (lv_secret_1_0= ruleValue ) ) ) | this_ServiceSecretsLongSyntax_2= ruleServiceSecretsLongSyntax )
            {
            // InternalComposeFileParser.g:3825:2: ( ( () ( (lv_secret_1_0= ruleValue ) ) ) | this_ServiceSecretsLongSyntax_2= ruleServiceSecretsLongSyntax )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_BEGIN) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalComposeFileParser.g:3826:3: ( () ( (lv_secret_1_0= ruleValue ) ) )
                    {
                    // InternalComposeFileParser.g:3826:3: ( () ( (lv_secret_1_0= ruleValue ) ) )
                    // InternalComposeFileParser.g:3827:4: () ( (lv_secret_1_0= ruleValue ) )
                    {
                    // InternalComposeFileParser.g:3827:4: ()
                    // InternalComposeFileParser.g:3828:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getServiceSecretsAccess().getServiceSecretsAction_0_0(),
                    						current);
                    				

                    }

                    // InternalComposeFileParser.g:3834:4: ( (lv_secret_1_0= ruleValue ) )
                    // InternalComposeFileParser.g:3835:5: (lv_secret_1_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:3835:5: (lv_secret_1_0= ruleValue )
                    // InternalComposeFileParser.g:3836:6: lv_secret_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getServiceSecretsAccess().getSecretValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_secret_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceSecretsRule());
                    						}
                    						set(
                    							current,
                    							"secret",
                    							lv_secret_1_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:3855:3: this_ServiceSecretsLongSyntax_2= ruleServiceSecretsLongSyntax
                    {

                    			newCompositeNode(grammarAccess.getServiceSecretsAccess().getServiceSecretsLongSyntaxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServiceSecretsLongSyntax_2=ruleServiceSecretsLongSyntax();

                    state._fsp--;


                    			current = this_ServiceSecretsLongSyntax_2;
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
    // $ANTLR end "ruleServiceSecrets"


    // $ANTLR start "entryRuleServiceSecretsLongSyntax"
    // InternalComposeFileParser.g:3867:1: entryRuleServiceSecretsLongSyntax returns [EObject current=null] : iv_ruleServiceSecretsLongSyntax= ruleServiceSecretsLongSyntax EOF ;
    public final EObject entryRuleServiceSecretsLongSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSecretsLongSyntax = null;


        try {
            // InternalComposeFileParser.g:3867:65: (iv_ruleServiceSecretsLongSyntax= ruleServiceSecretsLongSyntax EOF )
            // InternalComposeFileParser.g:3868:2: iv_ruleServiceSecretsLongSyntax= ruleServiceSecretsLongSyntax EOF
            {
             newCompositeNode(grammarAccess.getServiceSecretsLongSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceSecretsLongSyntax=ruleServiceSecretsLongSyntax();

            state._fsp--;

             current =iv_ruleServiceSecretsLongSyntax; 
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
    // $ANTLR end "entryRuleServiceSecretsLongSyntax"


    // $ANTLR start "ruleServiceSecretsLongSyntax"
    // InternalComposeFileParser.g:3874:1: ruleServiceSecretsLongSyntax returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END ) ;
    public final EObject ruleServiceSecretsLongSyntax() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token this_END_17=null;
        AntlrDatatypeRuleToken lv_source_4_0 = null;

        AntlrDatatypeRuleToken lv_target_7_0 = null;

        AntlrDatatypeRuleToken lv_uid_10_0 = null;

        AntlrDatatypeRuleToken lv_gid_13_0 = null;

        AntlrDatatypeRuleToken lv_mode_16_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:3880:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END ) )
            // InternalComposeFileParser.g:3881:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END )
            {
            // InternalComposeFileParser.g:3881:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END )
            // InternalComposeFileParser.g:3882:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) ) (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) ) (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) ) (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) ) (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) ) this_END_17= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getServiceSecretsLongSyntaxAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalComposeFileParser.g:3886:3: (otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) ) )
            // InternalComposeFileParser.g:3887:4: otherlv_1= HyphenMinusSpace otherlv_2= Source otherlv_3= Colon ( (lv_source_4_0= ruleValue ) )
            {
            otherlv_1=(Token)match(input,HyphenMinusSpace,FOLLOW_21); 

            				newLeafNode(otherlv_1, grammarAccess.getServiceSecretsLongSyntaxAccess().getHyphenMinusSpaceKeyword_1_0());
            			
            otherlv_2=(Token)match(input,Source,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getServiceSecretsLongSyntaxAccess().getSourceKeyword_1_1());
            			
            otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getServiceSecretsLongSyntaxAccess().getColonKeyword_1_2());
            			
            // InternalComposeFileParser.g:3899:4: ( (lv_source_4_0= ruleValue ) )
            // InternalComposeFileParser.g:3900:5: (lv_source_4_0= ruleValue )
            {
            // InternalComposeFileParser.g:3900:5: (lv_source_4_0= ruleValue )
            // InternalComposeFileParser.g:3901:6: lv_source_4_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getServiceSecretsLongSyntaxAccess().getSourceValueParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_22);
            lv_source_4_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServiceSecretsLongSyntaxRule());
            						}
            						set(
            							current,
            							"source",
            							lv_source_4_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:3919:3: (otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) ) )
            // InternalComposeFileParser.g:3920:4: otherlv_5= Target otherlv_6= Colon ( (lv_target_7_0= ruleValue ) )
            {
            otherlv_5=(Token)match(input,Target,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getServiceSecretsLongSyntaxAccess().getTargetKeyword_2_0());
            			
            otherlv_6=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_6, grammarAccess.getServiceSecretsLongSyntaxAccess().getColonKeyword_2_1());
            			
            // InternalComposeFileParser.g:3928:4: ( (lv_target_7_0= ruleValue ) )
            // InternalComposeFileParser.g:3929:5: (lv_target_7_0= ruleValue )
            {
            // InternalComposeFileParser.g:3929:5: (lv_target_7_0= ruleValue )
            // InternalComposeFileParser.g:3930:6: lv_target_7_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getServiceSecretsLongSyntaxAccess().getTargetValueParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_23);
            lv_target_7_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServiceSecretsLongSyntaxRule());
            						}
            						set(
            							current,
            							"target",
            							lv_target_7_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:3948:3: (otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) ) )
            // InternalComposeFileParser.g:3949:4: otherlv_8= Uid otherlv_9= Colon ( (lv_uid_10_0= ruleValue ) )
            {
            otherlv_8=(Token)match(input,Uid,FOLLOW_3); 

            				newLeafNode(otherlv_8, grammarAccess.getServiceSecretsLongSyntaxAccess().getUidKeyword_3_0());
            			
            otherlv_9=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_9, grammarAccess.getServiceSecretsLongSyntaxAccess().getColonKeyword_3_1());
            			
            // InternalComposeFileParser.g:3957:4: ( (lv_uid_10_0= ruleValue ) )
            // InternalComposeFileParser.g:3958:5: (lv_uid_10_0= ruleValue )
            {
            // InternalComposeFileParser.g:3958:5: (lv_uid_10_0= ruleValue )
            // InternalComposeFileParser.g:3959:6: lv_uid_10_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getServiceSecretsLongSyntaxAccess().getUidValueParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_24);
            lv_uid_10_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServiceSecretsLongSyntaxRule());
            						}
            						set(
            							current,
            							"uid",
            							lv_uid_10_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:3977:3: (otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) ) )
            // InternalComposeFileParser.g:3978:4: otherlv_11= Gid otherlv_12= Colon ( (lv_gid_13_0= ruleValue ) )
            {
            otherlv_11=(Token)match(input,Gid,FOLLOW_3); 

            				newLeafNode(otherlv_11, grammarAccess.getServiceSecretsLongSyntaxAccess().getGidKeyword_4_0());
            			
            otherlv_12=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_12, grammarAccess.getServiceSecretsLongSyntaxAccess().getColonKeyword_4_1());
            			
            // InternalComposeFileParser.g:3986:4: ( (lv_gid_13_0= ruleValue ) )
            // InternalComposeFileParser.g:3987:5: (lv_gid_13_0= ruleValue )
            {
            // InternalComposeFileParser.g:3987:5: (lv_gid_13_0= ruleValue )
            // InternalComposeFileParser.g:3988:6: lv_gid_13_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getServiceSecretsLongSyntaxAccess().getGidValueParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_25);
            lv_gid_13_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServiceSecretsLongSyntaxRule());
            						}
            						set(
            							current,
            							"gid",
            							lv_gid_13_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:4006:3: (otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) ) )
            // InternalComposeFileParser.g:4007:4: otherlv_14= Mode otherlv_15= Colon ( (lv_mode_16_0= ruleValue ) )
            {
            otherlv_14=(Token)match(input,Mode,FOLLOW_3); 

            				newLeafNode(otherlv_14, grammarAccess.getServiceSecretsLongSyntaxAccess().getModeKeyword_5_0());
            			
            otherlv_15=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_15, grammarAccess.getServiceSecretsLongSyntaxAccess().getColonKeyword_5_1());
            			
            // InternalComposeFileParser.g:4015:4: ( (lv_mode_16_0= ruleValue ) )
            // InternalComposeFileParser.g:4016:5: (lv_mode_16_0= ruleValue )
            {
            // InternalComposeFileParser.g:4016:5: (lv_mode_16_0= ruleValue )
            // InternalComposeFileParser.g:4017:6: lv_mode_16_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getServiceSecretsLongSyntaxAccess().getModeValueParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_26);
            lv_mode_16_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServiceSecretsLongSyntaxRule());
            						}
            						set(
            							current,
            							"mode",
            							lv_mode_16_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_END_17=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_17, grammarAccess.getServiceSecretsLongSyntaxAccess().getENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleServiceSecretsLongSyntax"


    // $ANTLR start "entryRuleUlimits"
    // InternalComposeFileParser.g:4043:1: entryRuleUlimits returns [EObject current=null] : iv_ruleUlimits= ruleUlimits EOF ;
    public final EObject entryRuleUlimits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUlimits = null;


        try {
            // InternalComposeFileParser.g:4043:48: (iv_ruleUlimits= ruleUlimits EOF )
            // InternalComposeFileParser.g:4044:2: iv_ruleUlimits= ruleUlimits EOF
            {
             newCompositeNode(grammarAccess.getUlimitsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUlimits=ruleUlimits();

            state._fsp--;

             current =iv_ruleUlimits; 
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
    // $ANTLR end "entryRuleUlimits"


    // $ANTLR start "ruleUlimits"
    // InternalComposeFileParser.g:4050:1: ruleUlimits returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Colon this_BEGIN_5= RULE_BEGIN otherlv_6= Soft otherlv_7= Colon ( (lv_soft_8_0= ruleValue ) ) otherlv_9= Hard otherlv_10= Colon ( (lv_hard_11_0= ruleValue ) ) this_END_12= RULE_END ) ) ;
    public final EObject ruleUlimits() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_soft_8_0 = null;

        AntlrDatatypeRuleToken lv_hard_11_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:4056:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Colon this_BEGIN_5= RULE_BEGIN otherlv_6= Soft otherlv_7= Colon ( (lv_soft_8_0= ruleValue ) ) otherlv_9= Hard otherlv_10= Colon ( (lv_hard_11_0= ruleValue ) ) this_END_12= RULE_END ) ) )
            // InternalComposeFileParser.g:4057:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Colon this_BEGIN_5= RULE_BEGIN otherlv_6= Soft otherlv_7= Colon ( (lv_soft_8_0= ruleValue ) ) otherlv_9= Hard otherlv_10= Colon ( (lv_hard_11_0= ruleValue ) ) this_END_12= RULE_END ) )
            {
            // InternalComposeFileParser.g:4057:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Colon this_BEGIN_5= RULE_BEGIN otherlv_6= Soft otherlv_7= Colon ( (lv_soft_8_0= ruleValue ) ) otherlv_9= Hard otherlv_10= Colon ( (lv_hard_11_0= ruleValue ) ) this_END_12= RULE_END ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==Colon) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==RULE_BEGIN) ) {
                        alt24=2;
                    }
                    else if ( (LA24_2==RULE_ID||LA24_2==RULE_STRING) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalComposeFileParser.g:4058:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
                    {
                    // InternalComposeFileParser.g:4058:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
                    // InternalComposeFileParser.g:4059:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
                    {
                    // InternalComposeFileParser.g:4059:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalComposeFileParser.g:4060:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalComposeFileParser.g:4060:5: (lv_name_0_0= RULE_ID )
                    // InternalComposeFileParser.g:4061:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getUlimitsAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUlimitsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,Colon,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getUlimitsAccess().getColonKeyword_0_1());
                    			
                    // InternalComposeFileParser.g:4081:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalComposeFileParser.g:4082:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:4082:5: (lv_value_2_0= ruleValue )
                    // InternalComposeFileParser.g:4083:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getUlimitsAccess().getValueValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUlimitsRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:4102:3: ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Colon this_BEGIN_5= RULE_BEGIN otherlv_6= Soft otherlv_7= Colon ( (lv_soft_8_0= ruleValue ) ) otherlv_9= Hard otherlv_10= Colon ( (lv_hard_11_0= ruleValue ) ) this_END_12= RULE_END )
                    {
                    // InternalComposeFileParser.g:4102:3: ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Colon this_BEGIN_5= RULE_BEGIN otherlv_6= Soft otherlv_7= Colon ( (lv_soft_8_0= ruleValue ) ) otherlv_9= Hard otherlv_10= Colon ( (lv_hard_11_0= ruleValue ) ) this_END_12= RULE_END )
                    // InternalComposeFileParser.g:4103:4: ( (lv_name_3_0= RULE_ID ) ) otherlv_4= Colon this_BEGIN_5= RULE_BEGIN otherlv_6= Soft otherlv_7= Colon ( (lv_soft_8_0= ruleValue ) ) otherlv_9= Hard otherlv_10= Colon ( (lv_hard_11_0= ruleValue ) ) this_END_12= RULE_END
                    {
                    // InternalComposeFileParser.g:4103:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalComposeFileParser.g:4104:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalComposeFileParser.g:4104:5: (lv_name_3_0= RULE_ID )
                    // InternalComposeFileParser.g:4105:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getUlimitsAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUlimitsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,Colon,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getUlimitsAccess().getColonKeyword_1_1());
                    			
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

                    				newLeafNode(this_BEGIN_5, grammarAccess.getUlimitsAccess().getBEGINTerminalRuleCall_1_2());
                    			
                    otherlv_6=(Token)match(input,Soft,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getUlimitsAccess().getSoftKeyword_1_3());
                    			
                    otherlv_7=(Token)match(input,Colon,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getUlimitsAccess().getColonKeyword_1_4());
                    			
                    // InternalComposeFileParser.g:4137:4: ( (lv_soft_8_0= ruleValue ) )
                    // InternalComposeFileParser.g:4138:5: (lv_soft_8_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:4138:5: (lv_soft_8_0= ruleValue )
                    // InternalComposeFileParser.g:4139:6: lv_soft_8_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getUlimitsAccess().getSoftValueParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_soft_8_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUlimitsRule());
                    						}
                    						set(
                    							current,
                    							"soft",
                    							lv_soft_8_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,Hard,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getUlimitsAccess().getHardKeyword_1_6());
                    			
                    otherlv_10=(Token)match(input,Colon,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getUlimitsAccess().getColonKeyword_1_7());
                    			
                    // InternalComposeFileParser.g:4164:4: ( (lv_hard_11_0= ruleValue ) )
                    // InternalComposeFileParser.g:4165:5: (lv_hard_11_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:4165:5: (lv_hard_11_0= ruleValue )
                    // InternalComposeFileParser.g:4166:6: lv_hard_11_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getUlimitsAccess().getHardValueParserRuleCall_1_8_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_hard_11_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUlimitsRule());
                    						}
                    						set(
                    							current,
                    							"hard",
                    							lv_hard_11_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_12, grammarAccess.getUlimitsAccess().getENDTerminalRuleCall_1_9());
                    			

                    }


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
    // $ANTLR end "ruleUlimits"


    // $ANTLR start "entryRuleServiceVolumes"
    // InternalComposeFileParser.g:4192:1: entryRuleServiceVolumes returns [EObject current=null] : iv_ruleServiceVolumes= ruleServiceVolumes EOF ;
    public final EObject entryRuleServiceVolumes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceVolumes = null;


        try {
            // InternalComposeFileParser.g:4192:55: (iv_ruleServiceVolumes= ruleServiceVolumes EOF )
            // InternalComposeFileParser.g:4193:2: iv_ruleServiceVolumes= ruleServiceVolumes EOF
            {
             newCompositeNode(grammarAccess.getServiceVolumesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceVolumes=ruleServiceVolumes();

            state._fsp--;

             current =iv_ruleServiceVolumes; 
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
    // $ANTLR end "entryRuleServiceVolumes"


    // $ANTLR start "ruleServiceVolumes"
    // InternalComposeFileParser.g:4199:1: ruleServiceVolumes returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= HyphenMinusSpace ( ( (lv_volumes_2_0= ruleValue ) ) | this_ServiceVolumeLongSyntax_3= ruleServiceVolumeLongSyntax ) this_END_4= RULE_END ) ;
    public final EObject ruleServiceVolumes() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_volumes_2_0 = null;

        EObject this_ServiceVolumeLongSyntax_3 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:4205:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= HyphenMinusSpace ( ( (lv_volumes_2_0= ruleValue ) ) | this_ServiceVolumeLongSyntax_3= ruleServiceVolumeLongSyntax ) this_END_4= RULE_END ) )
            // InternalComposeFileParser.g:4206:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= HyphenMinusSpace ( ( (lv_volumes_2_0= ruleValue ) ) | this_ServiceVolumeLongSyntax_3= ruleServiceVolumeLongSyntax ) this_END_4= RULE_END )
            {
            // InternalComposeFileParser.g:4206:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= HyphenMinusSpace ( ( (lv_volumes_2_0= ruleValue ) ) | this_ServiceVolumeLongSyntax_3= ruleServiceVolumeLongSyntax ) this_END_4= RULE_END )
            // InternalComposeFileParser.g:4207:3: this_BEGIN_0= RULE_BEGIN otherlv_1= HyphenMinusSpace ( ( (lv_volumes_2_0= ruleValue ) ) | this_ServiceVolumeLongSyntax_3= ruleServiceVolumeLongSyntax ) this_END_4= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getServiceVolumesAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,HyphenMinusSpace,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceVolumesAccess().getHyphenMinusSpaceKeyword_1());
            		
            // InternalComposeFileParser.g:4215:3: ( ( (lv_volumes_2_0= ruleValue ) ) | this_ServiceVolumeLongSyntax_3= ruleServiceVolumeLongSyntax )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==Type) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalComposeFileParser.g:4216:4: ( (lv_volumes_2_0= ruleValue ) )
                    {
                    // InternalComposeFileParser.g:4216:4: ( (lv_volumes_2_0= ruleValue ) )
                    // InternalComposeFileParser.g:4217:5: (lv_volumes_2_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:4217:5: (lv_volumes_2_0= ruleValue )
                    // InternalComposeFileParser.g:4218:6: lv_volumes_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getServiceVolumesAccess().getVolumesValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_volumes_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceVolumesRule());
                    						}
                    						set(
                    							current,
                    							"volumes",
                    							lv_volumes_2_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:4236:4: this_ServiceVolumeLongSyntax_3= ruleServiceVolumeLongSyntax
                    {

                    				newCompositeNode(grammarAccess.getServiceVolumesAccess().getServiceVolumeLongSyntaxParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_26);
                    this_ServiceVolumeLongSyntax_3=ruleServiceVolumeLongSyntax();

                    state._fsp--;


                    				current = this_ServiceVolumeLongSyntax_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getServiceVolumesAccess().getENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleServiceVolumes"


    // $ANTLR start "entryRuleServiceVolumeLongSyntax"
    // InternalComposeFileParser.g:4253:1: entryRuleServiceVolumeLongSyntax returns [EObject current=null] : iv_ruleServiceVolumeLongSyntax= ruleServiceVolumeLongSyntax EOF ;
    public final EObject entryRuleServiceVolumeLongSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceVolumeLongSyntax = null;


        try {
            // InternalComposeFileParser.g:4253:64: (iv_ruleServiceVolumeLongSyntax= ruleServiceVolumeLongSyntax EOF )
            // InternalComposeFileParser.g:4254:2: iv_ruleServiceVolumeLongSyntax= ruleServiceVolumeLongSyntax EOF
            {
             newCompositeNode(grammarAccess.getServiceVolumeLongSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceVolumeLongSyntax=ruleServiceVolumeLongSyntax();

            state._fsp--;

             current =iv_ruleServiceVolumeLongSyntax; 
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
    // $ANTLR end "entryRuleServiceVolumeLongSyntax"


    // $ANTLR start "ruleServiceVolumeLongSyntax"
    // InternalComposeFileParser.g:4260:1: ruleServiceVolumeLongSyntax returns [EObject current=null] : (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleValue ) ) (otherlv_3= Source otherlv_4= Colon ( (lv_source_5_0= ruleValue ) ) ) (otherlv_6= Target otherlv_7= Colon ( (lv_target_8_0= ruleValue ) ) ) (otherlv_9= Read_only otherlv_10= Colon ( (lv_read_only_11_0= ruleValue ) ) ) (otherlv_12= Consistency otherlv_13= Colon ( (lv_consistency_14_0= ruleValue ) ) ) (otherlv_15= Bind otherlv_16= Colon (this_BEGIN_17= RULE_BEGIN otherlv_18= Propagation otherlv_19= Colon ( (lv_bindPropagation_20_0= ruleValue ) ) this_END_21= RULE_END ) ) (otherlv_22= Volume otherlv_23= Colon (this_BEGIN_24= RULE_BEGIN otherlv_25= Nocopy otherlv_26= Colon ( (lv_volumeNocopy_27_0= ruleValue ) ) this_END_28= RULE_END ) ) (otherlv_29= Tmpfs otherlv_30= Colon (this_BEGIN_31= RULE_BEGIN otherlv_32= Size otherlv_33= Colon ( (lv_tmpfsSize_34_0= ruleValue ) ) this_END_35= RULE_END ) ) ) ;
    public final EObject ruleServiceVolumeLongSyntax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token this_BEGIN_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token this_END_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token this_BEGIN_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token this_END_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token this_BEGIN_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token this_END_35=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_source_5_0 = null;

        AntlrDatatypeRuleToken lv_target_8_0 = null;

        AntlrDatatypeRuleToken lv_read_only_11_0 = null;

        AntlrDatatypeRuleToken lv_consistency_14_0 = null;

        AntlrDatatypeRuleToken lv_bindPropagation_20_0 = null;

        AntlrDatatypeRuleToken lv_volumeNocopy_27_0 = null;

        AntlrDatatypeRuleToken lv_tmpfsSize_34_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:4266:2: ( (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleValue ) ) (otherlv_3= Source otherlv_4= Colon ( (lv_source_5_0= ruleValue ) ) ) (otherlv_6= Target otherlv_7= Colon ( (lv_target_8_0= ruleValue ) ) ) (otherlv_9= Read_only otherlv_10= Colon ( (lv_read_only_11_0= ruleValue ) ) ) (otherlv_12= Consistency otherlv_13= Colon ( (lv_consistency_14_0= ruleValue ) ) ) (otherlv_15= Bind otherlv_16= Colon (this_BEGIN_17= RULE_BEGIN otherlv_18= Propagation otherlv_19= Colon ( (lv_bindPropagation_20_0= ruleValue ) ) this_END_21= RULE_END ) ) (otherlv_22= Volume otherlv_23= Colon (this_BEGIN_24= RULE_BEGIN otherlv_25= Nocopy otherlv_26= Colon ( (lv_volumeNocopy_27_0= ruleValue ) ) this_END_28= RULE_END ) ) (otherlv_29= Tmpfs otherlv_30= Colon (this_BEGIN_31= RULE_BEGIN otherlv_32= Size otherlv_33= Colon ( (lv_tmpfsSize_34_0= ruleValue ) ) this_END_35= RULE_END ) ) ) )
            // InternalComposeFileParser.g:4267:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleValue ) ) (otherlv_3= Source otherlv_4= Colon ( (lv_source_5_0= ruleValue ) ) ) (otherlv_6= Target otherlv_7= Colon ( (lv_target_8_0= ruleValue ) ) ) (otherlv_9= Read_only otherlv_10= Colon ( (lv_read_only_11_0= ruleValue ) ) ) (otherlv_12= Consistency otherlv_13= Colon ( (lv_consistency_14_0= ruleValue ) ) ) (otherlv_15= Bind otherlv_16= Colon (this_BEGIN_17= RULE_BEGIN otherlv_18= Propagation otherlv_19= Colon ( (lv_bindPropagation_20_0= ruleValue ) ) this_END_21= RULE_END ) ) (otherlv_22= Volume otherlv_23= Colon (this_BEGIN_24= RULE_BEGIN otherlv_25= Nocopy otherlv_26= Colon ( (lv_volumeNocopy_27_0= ruleValue ) ) this_END_28= RULE_END ) ) (otherlv_29= Tmpfs otherlv_30= Colon (this_BEGIN_31= RULE_BEGIN otherlv_32= Size otherlv_33= Colon ( (lv_tmpfsSize_34_0= ruleValue ) ) this_END_35= RULE_END ) ) )
            {
            // InternalComposeFileParser.g:4267:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleValue ) ) (otherlv_3= Source otherlv_4= Colon ( (lv_source_5_0= ruleValue ) ) ) (otherlv_6= Target otherlv_7= Colon ( (lv_target_8_0= ruleValue ) ) ) (otherlv_9= Read_only otherlv_10= Colon ( (lv_read_only_11_0= ruleValue ) ) ) (otherlv_12= Consistency otherlv_13= Colon ( (lv_consistency_14_0= ruleValue ) ) ) (otherlv_15= Bind otherlv_16= Colon (this_BEGIN_17= RULE_BEGIN otherlv_18= Propagation otherlv_19= Colon ( (lv_bindPropagation_20_0= ruleValue ) ) this_END_21= RULE_END ) ) (otherlv_22= Volume otherlv_23= Colon (this_BEGIN_24= RULE_BEGIN otherlv_25= Nocopy otherlv_26= Colon ( (lv_volumeNocopy_27_0= ruleValue ) ) this_END_28= RULE_END ) ) (otherlv_29= Tmpfs otherlv_30= Colon (this_BEGIN_31= RULE_BEGIN otherlv_32= Size otherlv_33= Colon ( (lv_tmpfsSize_34_0= ruleValue ) ) this_END_35= RULE_END ) ) )
            // InternalComposeFileParser.g:4268:3: otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleValue ) ) (otherlv_3= Source otherlv_4= Colon ( (lv_source_5_0= ruleValue ) ) ) (otherlv_6= Target otherlv_7= Colon ( (lv_target_8_0= ruleValue ) ) ) (otherlv_9= Read_only otherlv_10= Colon ( (lv_read_only_11_0= ruleValue ) ) ) (otherlv_12= Consistency otherlv_13= Colon ( (lv_consistency_14_0= ruleValue ) ) ) (otherlv_15= Bind otherlv_16= Colon (this_BEGIN_17= RULE_BEGIN otherlv_18= Propagation otherlv_19= Colon ( (lv_bindPropagation_20_0= ruleValue ) ) this_END_21= RULE_END ) ) (otherlv_22= Volume otherlv_23= Colon (this_BEGIN_24= RULE_BEGIN otherlv_25= Nocopy otherlv_26= Colon ( (lv_volumeNocopy_27_0= ruleValue ) ) this_END_28= RULE_END ) ) (otherlv_29= Tmpfs otherlv_30= Colon (this_BEGIN_31= RULE_BEGIN otherlv_32= Size otherlv_33= Colon ( (lv_tmpfsSize_34_0= ruleValue ) ) this_END_35= RULE_END ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceVolumeLongSyntaxAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_1());
            		
            // InternalComposeFileParser.g:4276:3: ( (lv_type_2_0= ruleValue ) )
            // InternalComposeFileParser.g:4277:4: (lv_type_2_0= ruleValue )
            {
            // InternalComposeFileParser.g:4277:4: (lv_type_2_0= ruleValue )
            // InternalComposeFileParser.g:4278:5: lv_type_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getServiceVolumeLongSyntaxAccess().getTypeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_type_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceVolumeLongSyntaxRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComposeFileParser.g:4295:3: (otherlv_3= Source otherlv_4= Colon ( (lv_source_5_0= ruleValue ) ) )
            // InternalComposeFileParser.g:4296:4: otherlv_3= Source otherlv_4= Colon ( (lv_source_5_0= ruleValue ) )
            {
            otherlv_3=(Token)match(input,Source,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getServiceVolumeLongSyntaxAccess().getSourceKeyword_3_0());
            			
            otherlv_4=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_4, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_3_1());
            			
            // InternalComposeFileParser.g:4304:4: ( (lv_source_5_0= ruleValue ) )
            // InternalComposeFileParser.g:4305:5: (lv_source_5_0= ruleValue )
            {
            // InternalComposeFileParser.g:4305:5: (lv_source_5_0= ruleValue )
            // InternalComposeFileParser.g:4306:6: lv_source_5_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getServiceVolumeLongSyntaxAccess().getSourceValueParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_22);
            lv_source_5_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServiceVolumeLongSyntaxRule());
            						}
            						set(
            							current,
            							"source",
            							lv_source_5_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:4324:3: (otherlv_6= Target otherlv_7= Colon ( (lv_target_8_0= ruleValue ) ) )
            // InternalComposeFileParser.g:4325:4: otherlv_6= Target otherlv_7= Colon ( (lv_target_8_0= ruleValue ) )
            {
            otherlv_6=(Token)match(input,Target,FOLLOW_3); 

            				newLeafNode(otherlv_6, grammarAccess.getServiceVolumeLongSyntaxAccess().getTargetKeyword_4_0());
            			
            otherlv_7=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_7, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_4_1());
            			
            // InternalComposeFileParser.g:4333:4: ( (lv_target_8_0= ruleValue ) )
            // InternalComposeFileParser.g:4334:5: (lv_target_8_0= ruleValue )
            {
            // InternalComposeFileParser.g:4334:5: (lv_target_8_0= ruleValue )
            // InternalComposeFileParser.g:4335:6: lv_target_8_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getServiceVolumeLongSyntaxAccess().getTargetValueParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_45);
            lv_target_8_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServiceVolumeLongSyntaxRule());
            						}
            						set(
            							current,
            							"target",
            							lv_target_8_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:4353:3: (otherlv_9= Read_only otherlv_10= Colon ( (lv_read_only_11_0= ruleValue ) ) )
            // InternalComposeFileParser.g:4354:4: otherlv_9= Read_only otherlv_10= Colon ( (lv_read_only_11_0= ruleValue ) )
            {
            otherlv_9=(Token)match(input,Read_only,FOLLOW_3); 

            				newLeafNode(otherlv_9, grammarAccess.getServiceVolumeLongSyntaxAccess().getRead_onlyKeyword_5_0());
            			
            otherlv_10=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_10, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_5_1());
            			
            // InternalComposeFileParser.g:4362:4: ( (lv_read_only_11_0= ruleValue ) )
            // InternalComposeFileParser.g:4363:5: (lv_read_only_11_0= ruleValue )
            {
            // InternalComposeFileParser.g:4363:5: (lv_read_only_11_0= ruleValue )
            // InternalComposeFileParser.g:4364:6: lv_read_only_11_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getServiceVolumeLongSyntaxAccess().getRead_onlyValueParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_46);
            lv_read_only_11_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServiceVolumeLongSyntaxRule());
            						}
            						set(
            							current,
            							"read_only",
            							lv_read_only_11_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:4382:3: (otherlv_12= Consistency otherlv_13= Colon ( (lv_consistency_14_0= ruleValue ) ) )
            // InternalComposeFileParser.g:4383:4: otherlv_12= Consistency otherlv_13= Colon ( (lv_consistency_14_0= ruleValue ) )
            {
            otherlv_12=(Token)match(input,Consistency,FOLLOW_3); 

            				newLeafNode(otherlv_12, grammarAccess.getServiceVolumeLongSyntaxAccess().getConsistencyKeyword_6_0());
            			
            otherlv_13=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_13, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_6_1());
            			
            // InternalComposeFileParser.g:4391:4: ( (lv_consistency_14_0= ruleValue ) )
            // InternalComposeFileParser.g:4392:5: (lv_consistency_14_0= ruleValue )
            {
            // InternalComposeFileParser.g:4392:5: (lv_consistency_14_0= ruleValue )
            // InternalComposeFileParser.g:4393:6: lv_consistency_14_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getServiceVolumeLongSyntaxAccess().getConsistencyValueParserRuleCall_6_2_0());
            					
            pushFollow(FOLLOW_47);
            lv_consistency_14_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServiceVolumeLongSyntaxRule());
            						}
            						set(
            							current,
            							"consistency",
            							lv_consistency_14_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:4411:3: (otherlv_15= Bind otherlv_16= Colon (this_BEGIN_17= RULE_BEGIN otherlv_18= Propagation otherlv_19= Colon ( (lv_bindPropagation_20_0= ruleValue ) ) this_END_21= RULE_END ) )
            // InternalComposeFileParser.g:4412:4: otherlv_15= Bind otherlv_16= Colon (this_BEGIN_17= RULE_BEGIN otherlv_18= Propagation otherlv_19= Colon ( (lv_bindPropagation_20_0= ruleValue ) ) this_END_21= RULE_END )
            {
            otherlv_15=(Token)match(input,Bind,FOLLOW_3); 

            				newLeafNode(otherlv_15, grammarAccess.getServiceVolumeLongSyntaxAccess().getBindKeyword_7_0());
            			
            otherlv_16=(Token)match(input,Colon,FOLLOW_6); 

            				newLeafNode(otherlv_16, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_7_1());
            			
            // InternalComposeFileParser.g:4420:4: (this_BEGIN_17= RULE_BEGIN otherlv_18= Propagation otherlv_19= Colon ( (lv_bindPropagation_20_0= ruleValue ) ) this_END_21= RULE_END )
            // InternalComposeFileParser.g:4421:5: this_BEGIN_17= RULE_BEGIN otherlv_18= Propagation otherlv_19= Colon ( (lv_bindPropagation_20_0= ruleValue ) ) this_END_21= RULE_END
            {
            this_BEGIN_17=(Token)match(input,RULE_BEGIN,FOLLOW_48); 

            					newLeafNode(this_BEGIN_17, grammarAccess.getServiceVolumeLongSyntaxAccess().getBEGINTerminalRuleCall_7_2_0());
            				
            otherlv_18=(Token)match(input,Propagation,FOLLOW_3); 

            					newLeafNode(otherlv_18, grammarAccess.getServiceVolumeLongSyntaxAccess().getPropagationKeyword_7_2_1());
            				
            otherlv_19=(Token)match(input,Colon,FOLLOW_15); 

            					newLeafNode(otherlv_19, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_7_2_2());
            				
            // InternalComposeFileParser.g:4433:5: ( (lv_bindPropagation_20_0= ruleValue ) )
            // InternalComposeFileParser.g:4434:6: (lv_bindPropagation_20_0= ruleValue )
            {
            // InternalComposeFileParser.g:4434:6: (lv_bindPropagation_20_0= ruleValue )
            // InternalComposeFileParser.g:4435:7: lv_bindPropagation_20_0= ruleValue
            {

            							newCompositeNode(grammarAccess.getServiceVolumeLongSyntaxAccess().getBindPropagationValueParserRuleCall_7_2_3_0());
            						
            pushFollow(FOLLOW_26);
            lv_bindPropagation_20_0=ruleValue();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getServiceVolumeLongSyntaxRule());
            							}
            							set(
            								current,
            								"bindPropagation",
            								lv_bindPropagation_20_0,
            								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            							afterParserOrEnumRuleCall();
            						

            }


            }

            this_END_21=(Token)match(input,RULE_END,FOLLOW_49); 

            					newLeafNode(this_END_21, grammarAccess.getServiceVolumeLongSyntaxAccess().getENDTerminalRuleCall_7_2_4());
            				

            }


            }

            // InternalComposeFileParser.g:4458:3: (otherlv_22= Volume otherlv_23= Colon (this_BEGIN_24= RULE_BEGIN otherlv_25= Nocopy otherlv_26= Colon ( (lv_volumeNocopy_27_0= ruleValue ) ) this_END_28= RULE_END ) )
            // InternalComposeFileParser.g:4459:4: otherlv_22= Volume otherlv_23= Colon (this_BEGIN_24= RULE_BEGIN otherlv_25= Nocopy otherlv_26= Colon ( (lv_volumeNocopy_27_0= ruleValue ) ) this_END_28= RULE_END )
            {
            otherlv_22=(Token)match(input,Volume,FOLLOW_3); 

            				newLeafNode(otherlv_22, grammarAccess.getServiceVolumeLongSyntaxAccess().getVolumeKeyword_8_0());
            			
            otherlv_23=(Token)match(input,Colon,FOLLOW_6); 

            				newLeafNode(otherlv_23, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_8_1());
            			
            // InternalComposeFileParser.g:4467:4: (this_BEGIN_24= RULE_BEGIN otherlv_25= Nocopy otherlv_26= Colon ( (lv_volumeNocopy_27_0= ruleValue ) ) this_END_28= RULE_END )
            // InternalComposeFileParser.g:4468:5: this_BEGIN_24= RULE_BEGIN otherlv_25= Nocopy otherlv_26= Colon ( (lv_volumeNocopy_27_0= ruleValue ) ) this_END_28= RULE_END
            {
            this_BEGIN_24=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            					newLeafNode(this_BEGIN_24, grammarAccess.getServiceVolumeLongSyntaxAccess().getBEGINTerminalRuleCall_8_2_0());
            				
            otherlv_25=(Token)match(input,Nocopy,FOLLOW_3); 

            					newLeafNode(otherlv_25, grammarAccess.getServiceVolumeLongSyntaxAccess().getNocopyKeyword_8_2_1());
            				
            otherlv_26=(Token)match(input,Colon,FOLLOW_15); 

            					newLeafNode(otherlv_26, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_8_2_2());
            				
            // InternalComposeFileParser.g:4480:5: ( (lv_volumeNocopy_27_0= ruleValue ) )
            // InternalComposeFileParser.g:4481:6: (lv_volumeNocopy_27_0= ruleValue )
            {
            // InternalComposeFileParser.g:4481:6: (lv_volumeNocopy_27_0= ruleValue )
            // InternalComposeFileParser.g:4482:7: lv_volumeNocopy_27_0= ruleValue
            {

            							newCompositeNode(grammarAccess.getServiceVolumeLongSyntaxAccess().getVolumeNocopyValueParserRuleCall_8_2_3_0());
            						
            pushFollow(FOLLOW_26);
            lv_volumeNocopy_27_0=ruleValue();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getServiceVolumeLongSyntaxRule());
            							}
            							set(
            								current,
            								"volumeNocopy",
            								lv_volumeNocopy_27_0,
            								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            							afterParserOrEnumRuleCall();
            						

            }


            }

            this_END_28=(Token)match(input,RULE_END,FOLLOW_51); 

            					newLeafNode(this_END_28, grammarAccess.getServiceVolumeLongSyntaxAccess().getENDTerminalRuleCall_8_2_4());
            				

            }


            }

            // InternalComposeFileParser.g:4505:3: (otherlv_29= Tmpfs otherlv_30= Colon (this_BEGIN_31= RULE_BEGIN otherlv_32= Size otherlv_33= Colon ( (lv_tmpfsSize_34_0= ruleValue ) ) this_END_35= RULE_END ) )
            // InternalComposeFileParser.g:4506:4: otherlv_29= Tmpfs otherlv_30= Colon (this_BEGIN_31= RULE_BEGIN otherlv_32= Size otherlv_33= Colon ( (lv_tmpfsSize_34_0= ruleValue ) ) this_END_35= RULE_END )
            {
            otherlv_29=(Token)match(input,Tmpfs,FOLLOW_3); 

            				newLeafNode(otherlv_29, grammarAccess.getServiceVolumeLongSyntaxAccess().getTmpfsKeyword_9_0());
            			
            otherlv_30=(Token)match(input,Colon,FOLLOW_6); 

            				newLeafNode(otherlv_30, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_9_1());
            			
            // InternalComposeFileParser.g:4514:4: (this_BEGIN_31= RULE_BEGIN otherlv_32= Size otherlv_33= Colon ( (lv_tmpfsSize_34_0= ruleValue ) ) this_END_35= RULE_END )
            // InternalComposeFileParser.g:4515:5: this_BEGIN_31= RULE_BEGIN otherlv_32= Size otherlv_33= Colon ( (lv_tmpfsSize_34_0= ruleValue ) ) this_END_35= RULE_END
            {
            this_BEGIN_31=(Token)match(input,RULE_BEGIN,FOLLOW_52); 

            					newLeafNode(this_BEGIN_31, grammarAccess.getServiceVolumeLongSyntaxAccess().getBEGINTerminalRuleCall_9_2_0());
            				
            otherlv_32=(Token)match(input,Size,FOLLOW_3); 

            					newLeafNode(otherlv_32, grammarAccess.getServiceVolumeLongSyntaxAccess().getSizeKeyword_9_2_1());
            				
            otherlv_33=(Token)match(input,Colon,FOLLOW_15); 

            					newLeafNode(otherlv_33, grammarAccess.getServiceVolumeLongSyntaxAccess().getColonKeyword_9_2_2());
            				
            // InternalComposeFileParser.g:4527:5: ( (lv_tmpfsSize_34_0= ruleValue ) )
            // InternalComposeFileParser.g:4528:6: (lv_tmpfsSize_34_0= ruleValue )
            {
            // InternalComposeFileParser.g:4528:6: (lv_tmpfsSize_34_0= ruleValue )
            // InternalComposeFileParser.g:4529:7: lv_tmpfsSize_34_0= ruleValue
            {

            							newCompositeNode(grammarAccess.getServiceVolumeLongSyntaxAccess().getTmpfsSizeValueParserRuleCall_9_2_3_0());
            						
            pushFollow(FOLLOW_26);
            lv_tmpfsSize_34_0=ruleValue();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getServiceVolumeLongSyntaxRule());
            							}
            							set(
            								current,
            								"tmpfsSize",
            								lv_tmpfsSize_34_0,
            								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            							afterParserOrEnumRuleCall();
            						

            }


            }

            this_END_35=(Token)match(input,RULE_END,FOLLOW_2); 

            					newLeafNode(this_END_35, grammarAccess.getServiceVolumeLongSyntaxAccess().getENDTerminalRuleCall_9_2_4());
            				

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
    // $ANTLR end "ruleServiceVolumeLongSyntax"


    // $ANTLR start "entryRuleVolumes"
    // InternalComposeFileParser.g:4556:1: entryRuleVolumes returns [EObject current=null] : iv_ruleVolumes= ruleVolumes EOF ;
    public final EObject entryRuleVolumes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumes = null;


        try {
            // InternalComposeFileParser.g:4556:48: (iv_ruleVolumes= ruleVolumes EOF )
            // InternalComposeFileParser.g:4557:2: iv_ruleVolumes= ruleVolumes EOF
            {
             newCompositeNode(grammarAccess.getVolumesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolumes=ruleVolumes();

            state._fsp--;

             current =iv_ruleVolumes; 
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
    // $ANTLR end "entryRuleVolumes"


    // $ANTLR start "ruleVolumes"
    // InternalComposeFileParser.g:4563:1: ruleVolumes returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= External otherlv_11= Colon ( (lv_external_12_0= ruleValue ) ) ) | (otherlv_13= Labels otherlv_14= Colon ( (lv_labels_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Name otherlv_17= Colon ( (lv_customName_18_0= ruleValue ) ) ) )* this_END_19= RULE_END ) ;
    public final EObject ruleVolumes() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_END_19=null;
        AntlrDatatypeRuleToken lv_driver_6_0 = null;

        EObject lv_driver_opts_9_0 = null;

        AntlrDatatypeRuleToken lv_external_12_0 = null;

        EObject lv_labels_15_0 = null;

        AntlrDatatypeRuleToken lv_customName_18_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:4569:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= External otherlv_11= Colon ( (lv_external_12_0= ruleValue ) ) ) | (otherlv_13= Labels otherlv_14= Colon ( (lv_labels_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Name otherlv_17= Colon ( (lv_customName_18_0= ruleValue ) ) ) )* this_END_19= RULE_END ) )
            // InternalComposeFileParser.g:4570:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= External otherlv_11= Colon ( (lv_external_12_0= ruleValue ) ) ) | (otherlv_13= Labels otherlv_14= Colon ( (lv_labels_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Name otherlv_17= Colon ( (lv_customName_18_0= ruleValue ) ) ) )* this_END_19= RULE_END )
            {
            // InternalComposeFileParser.g:4570:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= External otherlv_11= Colon ( (lv_external_12_0= ruleValue ) ) ) | (otherlv_13= Labels otherlv_14= Colon ( (lv_labels_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Name otherlv_17= Colon ( (lv_customName_18_0= ruleValue ) ) ) )* this_END_19= RULE_END )
            // InternalComposeFileParser.g:4571:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= External otherlv_11= Colon ( (lv_external_12_0= ruleValue ) ) ) | (otherlv_13= Labels otherlv_14= Colon ( (lv_labels_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Name otherlv_17= Colon ( (lv_customName_18_0= ruleValue ) ) ) )* this_END_19= RULE_END
            {
            // InternalComposeFileParser.g:4571:3: ()
            // InternalComposeFileParser.g:4572:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumesAccess().getVolumesAction_0(),
            					current);
            			

            }

            // InternalComposeFileParser.g:4578:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComposeFileParser.g:4579:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComposeFileParser.g:4579:4: (lv_name_1_0= RULE_ID )
            // InternalComposeFileParser.g:4580:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVolumesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVolumesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumesAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_53); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getVolumesAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalComposeFileParser.g:4604:3: ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= External otherlv_11= Colon ( (lv_external_12_0= ruleValue ) ) ) | (otherlv_13= Labels otherlv_14= Colon ( (lv_labels_15_0= ruleListOrMapping ) ) ) | (otherlv_16= Name otherlv_17= Colon ( (lv_customName_18_0= ruleValue ) ) ) )*
            loop26:
            do {
                int alt26=6;
                switch ( input.LA(1) ) {
                case Driver:
                    {
                    alt26=1;
                    }
                    break;
                case Driver_opts:
                    {
                    alt26=2;
                    }
                    break;
                case External:
                    {
                    alt26=3;
                    }
                    break;
                case Labels:
                    {
                    alt26=4;
                    }
                    break;
                case Name:
                    {
                    alt26=5;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalComposeFileParser.g:4605:4: (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:4605:4: (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:4606:5: otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) )
            	    {
            	    otherlv_4=(Token)match(input,Driver,FOLLOW_3); 

            	    					newLeafNode(otherlv_4, grammarAccess.getVolumesAccess().getDriverKeyword_4_0_0());
            	    				
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_5, grammarAccess.getVolumesAccess().getColonKeyword_4_0_1());
            	    				
            	    // InternalComposeFileParser.g:4614:5: ( (lv_driver_6_0= ruleValue ) )
            	    // InternalComposeFileParser.g:4615:6: (lv_driver_6_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:4615:6: (lv_driver_6_0= ruleValue )
            	    // InternalComposeFileParser.g:4616:7: lv_driver_6_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getVolumesAccess().getDriverValueParserRuleCall_4_0_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
            	    lv_driver_6_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVolumesRule());
            	    							}
            	    							set(
            	    								current,
            	    								"driver",
            	    								lv_driver_6_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:4635:4: (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:4635:4: (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) )
            	    // InternalComposeFileParser.g:4636:5: otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) )
            	    {
            	    otherlv_7=(Token)match(input,Driver_opts,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getVolumesAccess().getDriver_optsKeyword_4_1_0());
            	    				
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getVolumesAccess().getColonKeyword_4_1_1());
            	    				
            	    // InternalComposeFileParser.g:4644:5: ( (lv_driver_opts_9_0= ruleMapping ) )
            	    // InternalComposeFileParser.g:4645:6: (lv_driver_opts_9_0= ruleMapping )
            	    {
            	    // InternalComposeFileParser.g:4645:6: (lv_driver_opts_9_0= ruleMapping )
            	    // InternalComposeFileParser.g:4646:7: lv_driver_opts_9_0= ruleMapping
            	    {

            	    							newCompositeNode(grammarAccess.getVolumesAccess().getDriver_optsMappingParserRuleCall_4_1_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
            	    lv_driver_opts_9_0=ruleMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVolumesRule());
            	    							}
            	    							set(
            	    								current,
            	    								"driver_opts",
            	    								lv_driver_opts_9_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Mapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:4665:4: (otherlv_10= External otherlv_11= Colon ( (lv_external_12_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:4665:4: (otherlv_10= External otherlv_11= Colon ( (lv_external_12_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:4666:5: otherlv_10= External otherlv_11= Colon ( (lv_external_12_0= ruleValue ) )
            	    {
            	    otherlv_10=(Token)match(input,External,FOLLOW_3); 

            	    					newLeafNode(otherlv_10, grammarAccess.getVolumesAccess().getExternalKeyword_4_2_0());
            	    				
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_11, grammarAccess.getVolumesAccess().getColonKeyword_4_2_1());
            	    				
            	    // InternalComposeFileParser.g:4674:5: ( (lv_external_12_0= ruleValue ) )
            	    // InternalComposeFileParser.g:4675:6: (lv_external_12_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:4675:6: (lv_external_12_0= ruleValue )
            	    // InternalComposeFileParser.g:4676:7: lv_external_12_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getVolumesAccess().getExternalValueParserRuleCall_4_2_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
            	    lv_external_12_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVolumesRule());
            	    							}
            	    							set(
            	    								current,
            	    								"external",
            	    								lv_external_12_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComposeFileParser.g:4695:4: (otherlv_13= Labels otherlv_14= Colon ( (lv_labels_15_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:4695:4: (otherlv_13= Labels otherlv_14= Colon ( (lv_labels_15_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:4696:5: otherlv_13= Labels otherlv_14= Colon ( (lv_labels_15_0= ruleListOrMapping ) )
            	    {
            	    otherlv_13=(Token)match(input,Labels,FOLLOW_3); 

            	    					newLeafNode(otherlv_13, grammarAccess.getVolumesAccess().getLabelsKeyword_4_3_0());
            	    				
            	    otherlv_14=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_14, grammarAccess.getVolumesAccess().getColonKeyword_4_3_1());
            	    				
            	    // InternalComposeFileParser.g:4704:5: ( (lv_labels_15_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:4705:6: (lv_labels_15_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:4705:6: (lv_labels_15_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:4706:7: lv_labels_15_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getVolumesAccess().getLabelsListOrMappingParserRuleCall_4_3_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
            	    lv_labels_15_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVolumesRule());
            	    							}
            	    							set(
            	    								current,
            	    								"labels",
            	    								lv_labels_15_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComposeFileParser.g:4725:4: (otherlv_16= Name otherlv_17= Colon ( (lv_customName_18_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:4725:4: (otherlv_16= Name otherlv_17= Colon ( (lv_customName_18_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:4726:5: otherlv_16= Name otherlv_17= Colon ( (lv_customName_18_0= ruleValue ) )
            	    {
            	    otherlv_16=(Token)match(input,Name,FOLLOW_3); 

            	    					newLeafNode(otherlv_16, grammarAccess.getVolumesAccess().getNameKeyword_4_4_0());
            	    				
            	    otherlv_17=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_17, grammarAccess.getVolumesAccess().getColonKeyword_4_4_1());
            	    				
            	    // InternalComposeFileParser.g:4734:5: ( (lv_customName_18_0= ruleValue ) )
            	    // InternalComposeFileParser.g:4735:6: (lv_customName_18_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:4735:6: (lv_customName_18_0= ruleValue )
            	    // InternalComposeFileParser.g:4736:7: lv_customName_18_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getVolumesAccess().getCustomNameValueParserRuleCall_4_4_2_0());
            	    						
            	    pushFollow(FOLLOW_53);
            	    lv_customName_18_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getVolumesRule());
            	    							}
            	    							set(
            	    								current,
            	    								"customName",
            	    								lv_customName_18_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            this_END_19=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_19, grammarAccess.getVolumesAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleVolumes"


    // $ANTLR start "entryRuleNetworks"
    // InternalComposeFileParser.g:4763:1: entryRuleNetworks returns [EObject current=null] : iv_ruleNetworks= ruleNetworks EOF ;
    public final EObject entryRuleNetworks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworks = null;


        try {
            // InternalComposeFileParser.g:4763:49: (iv_ruleNetworks= ruleNetworks EOF )
            // InternalComposeFileParser.g:4764:2: iv_ruleNetworks= ruleNetworks EOF
            {
             newCompositeNode(grammarAccess.getNetworksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworks=ruleNetworks();

            state._fsp--;

             current =iv_ruleNetworks; 
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
    // $ANTLR end "entryRuleNetworks"


    // $ANTLR start "ruleNetworks"
    // InternalComposeFileParser.g:4770:1: ruleNetworks returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= Attachable otherlv_11= Colon ( (lv_attachable_12_0= ruleValue ) ) ) | (otherlv_13= Enable_ipv6 otherlv_14= Colon ( (lv_enable_ipv6_15_0= ruleValue ) ) ) | (otherlv_16= Ipam otherlv_17= Colon ( (lv_ipam_18_0= ruleIpam ) ) ) | (otherlv_19= Internal otherlv_20= Colon ( (lv_internal_21_0= ruleValue ) ) ) | (otherlv_22= Labels otherlv_23= Colon ( (lv_labels_24_0= ruleListOrMapping ) ) ) | (otherlv_25= External otherlv_26= Colon ( (lv_external_27_0= ruleValue ) ) ) | (otherlv_28= Name otherlv_29= Colon ( (lv_customName_30_0= ruleValue ) ) ) )* this_END_31= RULE_END ) ;
    public final EObject ruleNetworks() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token this_END_31=null;
        AntlrDatatypeRuleToken lv_driver_6_0 = null;

        EObject lv_driver_opts_9_0 = null;

        AntlrDatatypeRuleToken lv_attachable_12_0 = null;

        AntlrDatatypeRuleToken lv_enable_ipv6_15_0 = null;

        EObject lv_ipam_18_0 = null;

        AntlrDatatypeRuleToken lv_internal_21_0 = null;

        EObject lv_labels_24_0 = null;

        AntlrDatatypeRuleToken lv_external_27_0 = null;

        AntlrDatatypeRuleToken lv_customName_30_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:4776:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= Attachable otherlv_11= Colon ( (lv_attachable_12_0= ruleValue ) ) ) | (otherlv_13= Enable_ipv6 otherlv_14= Colon ( (lv_enable_ipv6_15_0= ruleValue ) ) ) | (otherlv_16= Ipam otherlv_17= Colon ( (lv_ipam_18_0= ruleIpam ) ) ) | (otherlv_19= Internal otherlv_20= Colon ( (lv_internal_21_0= ruleValue ) ) ) | (otherlv_22= Labels otherlv_23= Colon ( (lv_labels_24_0= ruleListOrMapping ) ) ) | (otherlv_25= External otherlv_26= Colon ( (lv_external_27_0= ruleValue ) ) ) | (otherlv_28= Name otherlv_29= Colon ( (lv_customName_30_0= ruleValue ) ) ) )* this_END_31= RULE_END ) )
            // InternalComposeFileParser.g:4777:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= Attachable otherlv_11= Colon ( (lv_attachable_12_0= ruleValue ) ) ) | (otherlv_13= Enable_ipv6 otherlv_14= Colon ( (lv_enable_ipv6_15_0= ruleValue ) ) ) | (otherlv_16= Ipam otherlv_17= Colon ( (lv_ipam_18_0= ruleIpam ) ) ) | (otherlv_19= Internal otherlv_20= Colon ( (lv_internal_21_0= ruleValue ) ) ) | (otherlv_22= Labels otherlv_23= Colon ( (lv_labels_24_0= ruleListOrMapping ) ) ) | (otherlv_25= External otherlv_26= Colon ( (lv_external_27_0= ruleValue ) ) ) | (otherlv_28= Name otherlv_29= Colon ( (lv_customName_30_0= ruleValue ) ) ) )* this_END_31= RULE_END )
            {
            // InternalComposeFileParser.g:4777:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= Attachable otherlv_11= Colon ( (lv_attachable_12_0= ruleValue ) ) ) | (otherlv_13= Enable_ipv6 otherlv_14= Colon ( (lv_enable_ipv6_15_0= ruleValue ) ) ) | (otherlv_16= Ipam otherlv_17= Colon ( (lv_ipam_18_0= ruleIpam ) ) ) | (otherlv_19= Internal otherlv_20= Colon ( (lv_internal_21_0= ruleValue ) ) ) | (otherlv_22= Labels otherlv_23= Colon ( (lv_labels_24_0= ruleListOrMapping ) ) ) | (otherlv_25= External otherlv_26= Colon ( (lv_external_27_0= ruleValue ) ) ) | (otherlv_28= Name otherlv_29= Colon ( (lv_customName_30_0= ruleValue ) ) ) )* this_END_31= RULE_END )
            // InternalComposeFileParser.g:4778:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= Attachable otherlv_11= Colon ( (lv_attachable_12_0= ruleValue ) ) ) | (otherlv_13= Enable_ipv6 otherlv_14= Colon ( (lv_enable_ipv6_15_0= ruleValue ) ) ) | (otherlv_16= Ipam otherlv_17= Colon ( (lv_ipam_18_0= ruleIpam ) ) ) | (otherlv_19= Internal otherlv_20= Colon ( (lv_internal_21_0= ruleValue ) ) ) | (otherlv_22= Labels otherlv_23= Colon ( (lv_labels_24_0= ruleListOrMapping ) ) ) | (otherlv_25= External otherlv_26= Colon ( (lv_external_27_0= ruleValue ) ) ) | (otherlv_28= Name otherlv_29= Colon ( (lv_customName_30_0= ruleValue ) ) ) )* this_END_31= RULE_END
            {
            // InternalComposeFileParser.g:4778:3: ()
            // InternalComposeFileParser.g:4779:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworksAccess().getNetworksAction_0(),
            					current);
            			

            }

            // InternalComposeFileParser.g:4785:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComposeFileParser.g:4786:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComposeFileParser.g:4786:4: (lv_name_1_0= RULE_ID )
            // InternalComposeFileParser.g:4787:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNetworksAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworksRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworksAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_54); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getNetworksAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalComposeFileParser.g:4811:3: ( (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) ) | (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) ) | (otherlv_10= Attachable otherlv_11= Colon ( (lv_attachable_12_0= ruleValue ) ) ) | (otherlv_13= Enable_ipv6 otherlv_14= Colon ( (lv_enable_ipv6_15_0= ruleValue ) ) ) | (otherlv_16= Ipam otherlv_17= Colon ( (lv_ipam_18_0= ruleIpam ) ) ) | (otherlv_19= Internal otherlv_20= Colon ( (lv_internal_21_0= ruleValue ) ) ) | (otherlv_22= Labels otherlv_23= Colon ( (lv_labels_24_0= ruleListOrMapping ) ) ) | (otherlv_25= External otherlv_26= Colon ( (lv_external_27_0= ruleValue ) ) ) | (otherlv_28= Name otherlv_29= Colon ( (lv_customName_30_0= ruleValue ) ) ) )*
            loop27:
            do {
                int alt27=10;
                switch ( input.LA(1) ) {
                case Driver:
                    {
                    alt27=1;
                    }
                    break;
                case Driver_opts:
                    {
                    alt27=2;
                    }
                    break;
                case Attachable:
                    {
                    alt27=3;
                    }
                    break;
                case Enable_ipv6:
                    {
                    alt27=4;
                    }
                    break;
                case Ipam:
                    {
                    alt27=5;
                    }
                    break;
                case Internal:
                    {
                    alt27=6;
                    }
                    break;
                case Labels:
                    {
                    alt27=7;
                    }
                    break;
                case External:
                    {
                    alt27=8;
                    }
                    break;
                case Name:
                    {
                    alt27=9;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // InternalComposeFileParser.g:4812:4: (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:4812:4: (otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:4813:5: otherlv_4= Driver otherlv_5= Colon ( (lv_driver_6_0= ruleValue ) )
            	    {
            	    otherlv_4=(Token)match(input,Driver,FOLLOW_3); 

            	    					newLeafNode(otherlv_4, grammarAccess.getNetworksAccess().getDriverKeyword_4_0_0());
            	    				
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_5, grammarAccess.getNetworksAccess().getColonKeyword_4_0_1());
            	    				
            	    // InternalComposeFileParser.g:4821:5: ( (lv_driver_6_0= ruleValue ) )
            	    // InternalComposeFileParser.g:4822:6: (lv_driver_6_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:4822:6: (lv_driver_6_0= ruleValue )
            	    // InternalComposeFileParser.g:4823:7: lv_driver_6_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getNetworksAccess().getDriverValueParserRuleCall_4_0_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_driver_6_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
            	    							}
            	    							set(
            	    								current,
            	    								"driver",
            	    								lv_driver_6_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:4842:4: (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:4842:4: (otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) ) )
            	    // InternalComposeFileParser.g:4843:5: otherlv_7= Driver_opts otherlv_8= Colon ( (lv_driver_opts_9_0= ruleMapping ) )
            	    {
            	    otherlv_7=(Token)match(input,Driver_opts,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getNetworksAccess().getDriver_optsKeyword_4_1_0());
            	    				
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getNetworksAccess().getColonKeyword_4_1_1());
            	    				
            	    // InternalComposeFileParser.g:4851:5: ( (lv_driver_opts_9_0= ruleMapping ) )
            	    // InternalComposeFileParser.g:4852:6: (lv_driver_opts_9_0= ruleMapping )
            	    {
            	    // InternalComposeFileParser.g:4852:6: (lv_driver_opts_9_0= ruleMapping )
            	    // InternalComposeFileParser.g:4853:7: lv_driver_opts_9_0= ruleMapping
            	    {

            	    							newCompositeNode(grammarAccess.getNetworksAccess().getDriver_optsMappingParserRuleCall_4_1_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_driver_opts_9_0=ruleMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
            	    							}
            	    							set(
            	    								current,
            	    								"driver_opts",
            	    								lv_driver_opts_9_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Mapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:4872:4: (otherlv_10= Attachable otherlv_11= Colon ( (lv_attachable_12_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:4872:4: (otherlv_10= Attachable otherlv_11= Colon ( (lv_attachable_12_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:4873:5: otherlv_10= Attachable otherlv_11= Colon ( (lv_attachable_12_0= ruleValue ) )
            	    {
            	    otherlv_10=(Token)match(input,Attachable,FOLLOW_3); 

            	    					newLeafNode(otherlv_10, grammarAccess.getNetworksAccess().getAttachableKeyword_4_2_0());
            	    				
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_11, grammarAccess.getNetworksAccess().getColonKeyword_4_2_1());
            	    				
            	    // InternalComposeFileParser.g:4881:5: ( (lv_attachable_12_0= ruleValue ) )
            	    // InternalComposeFileParser.g:4882:6: (lv_attachable_12_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:4882:6: (lv_attachable_12_0= ruleValue )
            	    // InternalComposeFileParser.g:4883:7: lv_attachable_12_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getNetworksAccess().getAttachableValueParserRuleCall_4_2_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_attachable_12_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
            	    							}
            	    							set(
            	    								current,
            	    								"attachable",
            	    								lv_attachable_12_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComposeFileParser.g:4902:4: (otherlv_13= Enable_ipv6 otherlv_14= Colon ( (lv_enable_ipv6_15_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:4902:4: (otherlv_13= Enable_ipv6 otherlv_14= Colon ( (lv_enable_ipv6_15_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:4903:5: otherlv_13= Enable_ipv6 otherlv_14= Colon ( (lv_enable_ipv6_15_0= ruleValue ) )
            	    {
            	    otherlv_13=(Token)match(input,Enable_ipv6,FOLLOW_3); 

            	    					newLeafNode(otherlv_13, grammarAccess.getNetworksAccess().getEnable_ipv6Keyword_4_3_0());
            	    				
            	    otherlv_14=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_14, grammarAccess.getNetworksAccess().getColonKeyword_4_3_1());
            	    				
            	    // InternalComposeFileParser.g:4911:5: ( (lv_enable_ipv6_15_0= ruleValue ) )
            	    // InternalComposeFileParser.g:4912:6: (lv_enable_ipv6_15_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:4912:6: (lv_enable_ipv6_15_0= ruleValue )
            	    // InternalComposeFileParser.g:4913:7: lv_enable_ipv6_15_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getNetworksAccess().getEnable_ipv6ValueParserRuleCall_4_3_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_enable_ipv6_15_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
            	    							}
            	    							set(
            	    								current,
            	    								"enable_ipv6",
            	    								lv_enable_ipv6_15_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComposeFileParser.g:4932:4: (otherlv_16= Ipam otherlv_17= Colon ( (lv_ipam_18_0= ruleIpam ) ) )
            	    {
            	    // InternalComposeFileParser.g:4932:4: (otherlv_16= Ipam otherlv_17= Colon ( (lv_ipam_18_0= ruleIpam ) ) )
            	    // InternalComposeFileParser.g:4933:5: otherlv_16= Ipam otherlv_17= Colon ( (lv_ipam_18_0= ruleIpam ) )
            	    {
            	    otherlv_16=(Token)match(input,Ipam,FOLLOW_3); 

            	    					newLeafNode(otherlv_16, grammarAccess.getNetworksAccess().getIpamKeyword_4_4_0());
            	    				
            	    otherlv_17=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_17, grammarAccess.getNetworksAccess().getColonKeyword_4_4_1());
            	    				
            	    // InternalComposeFileParser.g:4941:5: ( (lv_ipam_18_0= ruleIpam ) )
            	    // InternalComposeFileParser.g:4942:6: (lv_ipam_18_0= ruleIpam )
            	    {
            	    // InternalComposeFileParser.g:4942:6: (lv_ipam_18_0= ruleIpam )
            	    // InternalComposeFileParser.g:4943:7: lv_ipam_18_0= ruleIpam
            	    {

            	    							newCompositeNode(grammarAccess.getNetworksAccess().getIpamIpamParserRuleCall_4_4_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_ipam_18_0=ruleIpam();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
            	    							}
            	    							set(
            	    								current,
            	    								"ipam",
            	    								lv_ipam_18_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Ipam");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalComposeFileParser.g:4962:4: (otherlv_19= Internal otherlv_20= Colon ( (lv_internal_21_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:4962:4: (otherlv_19= Internal otherlv_20= Colon ( (lv_internal_21_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:4963:5: otherlv_19= Internal otherlv_20= Colon ( (lv_internal_21_0= ruleValue ) )
            	    {
            	    otherlv_19=(Token)match(input,Internal,FOLLOW_3); 

            	    					newLeafNode(otherlv_19, grammarAccess.getNetworksAccess().getInternalKeyword_4_5_0());
            	    				
            	    otherlv_20=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_20, grammarAccess.getNetworksAccess().getColonKeyword_4_5_1());
            	    				
            	    // InternalComposeFileParser.g:4971:5: ( (lv_internal_21_0= ruleValue ) )
            	    // InternalComposeFileParser.g:4972:6: (lv_internal_21_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:4972:6: (lv_internal_21_0= ruleValue )
            	    // InternalComposeFileParser.g:4973:7: lv_internal_21_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getNetworksAccess().getInternalValueParserRuleCall_4_5_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_internal_21_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
            	    							}
            	    							set(
            	    								current,
            	    								"internal",
            	    								lv_internal_21_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalComposeFileParser.g:4992:4: (otherlv_22= Labels otherlv_23= Colon ( (lv_labels_24_0= ruleListOrMapping ) ) )
            	    {
            	    // InternalComposeFileParser.g:4992:4: (otherlv_22= Labels otherlv_23= Colon ( (lv_labels_24_0= ruleListOrMapping ) ) )
            	    // InternalComposeFileParser.g:4993:5: otherlv_22= Labels otherlv_23= Colon ( (lv_labels_24_0= ruleListOrMapping ) )
            	    {
            	    otherlv_22=(Token)match(input,Labels,FOLLOW_3); 

            	    					newLeafNode(otherlv_22, grammarAccess.getNetworksAccess().getLabelsKeyword_4_6_0());
            	    				
            	    otherlv_23=(Token)match(input,Colon,FOLLOW_6); 

            	    					newLeafNode(otherlv_23, grammarAccess.getNetworksAccess().getColonKeyword_4_6_1());
            	    				
            	    // InternalComposeFileParser.g:5001:5: ( (lv_labels_24_0= ruleListOrMapping ) )
            	    // InternalComposeFileParser.g:5002:6: (lv_labels_24_0= ruleListOrMapping )
            	    {
            	    // InternalComposeFileParser.g:5002:6: (lv_labels_24_0= ruleListOrMapping )
            	    // InternalComposeFileParser.g:5003:7: lv_labels_24_0= ruleListOrMapping
            	    {

            	    							newCompositeNode(grammarAccess.getNetworksAccess().getLabelsListOrMappingParserRuleCall_4_6_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_labels_24_0=ruleListOrMapping();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
            	    							}
            	    							set(
            	    								current,
            	    								"labels",
            	    								lv_labels_24_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalComposeFileParser.g:5022:4: (otherlv_25= External otherlv_26= Colon ( (lv_external_27_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:5022:4: (otherlv_25= External otherlv_26= Colon ( (lv_external_27_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:5023:5: otherlv_25= External otherlv_26= Colon ( (lv_external_27_0= ruleValue ) )
            	    {
            	    otherlv_25=(Token)match(input,External,FOLLOW_3); 

            	    					newLeafNode(otherlv_25, grammarAccess.getNetworksAccess().getExternalKeyword_4_7_0());
            	    				
            	    otherlv_26=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_26, grammarAccess.getNetworksAccess().getColonKeyword_4_7_1());
            	    				
            	    // InternalComposeFileParser.g:5031:5: ( (lv_external_27_0= ruleValue ) )
            	    // InternalComposeFileParser.g:5032:6: (lv_external_27_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:5032:6: (lv_external_27_0= ruleValue )
            	    // InternalComposeFileParser.g:5033:7: lv_external_27_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getNetworksAccess().getExternalValueParserRuleCall_4_7_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_external_27_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
            	    							}
            	    							set(
            	    								current,
            	    								"external",
            	    								lv_external_27_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalComposeFileParser.g:5052:4: (otherlv_28= Name otherlv_29= Colon ( (lv_customName_30_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:5052:4: (otherlv_28= Name otherlv_29= Colon ( (lv_customName_30_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:5053:5: otherlv_28= Name otherlv_29= Colon ( (lv_customName_30_0= ruleValue ) )
            	    {
            	    otherlv_28=(Token)match(input,Name,FOLLOW_3); 

            	    					newLeafNode(otherlv_28, grammarAccess.getNetworksAccess().getNameKeyword_4_8_0());
            	    				
            	    otherlv_29=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_29, grammarAccess.getNetworksAccess().getColonKeyword_4_8_1());
            	    				
            	    // InternalComposeFileParser.g:5061:5: ( (lv_customName_30_0= ruleValue ) )
            	    // InternalComposeFileParser.g:5062:6: (lv_customName_30_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:5062:6: (lv_customName_30_0= ruleValue )
            	    // InternalComposeFileParser.g:5063:7: lv_customName_30_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getNetworksAccess().getCustomNameValueParserRuleCall_4_8_2_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_customName_30_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
            	    							}
            	    							set(
            	    								current,
            	    								"customName",
            	    								lv_customName_30_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            this_END_31=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_31, grammarAccess.getNetworksAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleNetworks"


    // $ANTLR start "entryRuleIpam"
    // InternalComposeFileParser.g:5090:1: entryRuleIpam returns [EObject current=null] : iv_ruleIpam= ruleIpam EOF ;
    public final EObject entryRuleIpam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIpam = null;


        try {
            // InternalComposeFileParser.g:5090:45: (iv_ruleIpam= ruleIpam EOF )
            // InternalComposeFileParser.g:5091:2: iv_ruleIpam= ruleIpam EOF
            {
             newCompositeNode(grammarAccess.getIpamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIpam=ruleIpam();

            state._fsp--;

             current =iv_ruleIpam; 
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
    // $ANTLR end "entryRuleIpam"


    // $ANTLR start "ruleIpam"
    // InternalComposeFileParser.g:5097:1: ruleIpam returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Config otherlv_6= Colon ( (lv_config_7_0= ruleListOrMapping ) ) ) this_END_8= RULE_END ) ;
    public final EObject ruleIpam() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_driver_4_0 = null;

        EObject lv_config_7_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5103:2: ( ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Config otherlv_6= Colon ( (lv_config_7_0= ruleListOrMapping ) ) ) this_END_8= RULE_END ) )
            // InternalComposeFileParser.g:5104:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Config otherlv_6= Colon ( (lv_config_7_0= ruleListOrMapping ) ) ) this_END_8= RULE_END )
            {
            // InternalComposeFileParser.g:5104:2: ( () this_BEGIN_1= RULE_BEGIN (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Config otherlv_6= Colon ( (lv_config_7_0= ruleListOrMapping ) ) ) this_END_8= RULE_END )
            // InternalComposeFileParser.g:5105:3: () this_BEGIN_1= RULE_BEGIN (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) ) (otherlv_5= Config otherlv_6= Colon ( (lv_config_7_0= ruleListOrMapping ) ) ) this_END_8= RULE_END
            {
            // InternalComposeFileParser.g:5105:3: ()
            // InternalComposeFileParser.g:5106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIpamAccess().getIpamAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getIpamAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalComposeFileParser.g:5116:3: (otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) ) )
            // InternalComposeFileParser.g:5117:4: otherlv_2= Driver otherlv_3= Colon ( (lv_driver_4_0= ruleValue ) )
            {
            otherlv_2=(Token)match(input,Driver,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getIpamAccess().getDriverKeyword_2_0());
            			
            otherlv_3=(Token)match(input,Colon,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getIpamAccess().getColonKeyword_2_1());
            			
            // InternalComposeFileParser.g:5125:4: ( (lv_driver_4_0= ruleValue ) )
            // InternalComposeFileParser.g:5126:5: (lv_driver_4_0= ruleValue )
            {
            // InternalComposeFileParser.g:5126:5: (lv_driver_4_0= ruleValue )
            // InternalComposeFileParser.g:5127:6: lv_driver_4_0= ruleValue
            {

            						newCompositeNode(grammarAccess.getIpamAccess().getDriverValueParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_55);
            lv_driver_4_0=ruleValue();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getIpamRule());
            						}
            						set(
            							current,
            							"driver",
            							lv_driver_4_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalComposeFileParser.g:5145:3: (otherlv_5= Config otherlv_6= Colon ( (lv_config_7_0= ruleListOrMapping ) ) )
            // InternalComposeFileParser.g:5146:4: otherlv_5= Config otherlv_6= Colon ( (lv_config_7_0= ruleListOrMapping ) )
            {
            otherlv_5=(Token)match(input,Config,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getIpamAccess().getConfigKeyword_3_0());
            			
            otherlv_6=(Token)match(input,Colon,FOLLOW_6); 

            				newLeafNode(otherlv_6, grammarAccess.getIpamAccess().getColonKeyword_3_1());
            			
            // InternalComposeFileParser.g:5154:4: ( (lv_config_7_0= ruleListOrMapping ) )
            // InternalComposeFileParser.g:5155:5: (lv_config_7_0= ruleListOrMapping )
            {
            // InternalComposeFileParser.g:5155:5: (lv_config_7_0= ruleListOrMapping )
            // InternalComposeFileParser.g:5156:6: lv_config_7_0= ruleListOrMapping
            {

            						newCompositeNode(grammarAccess.getIpamAccess().getConfigListOrMappingParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_26);
            lv_config_7_0=ruleListOrMapping();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getIpamRule());
            						}
            						set(
            							current,
            							"config",
            							lv_config_7_0,
            							"org.palladiosimulator.somox.docker.compose.ComposeFile.ListOrMapping");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getIpamAccess().getENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleIpam"


    // $ANTLR start "entryRuleConfigs"
    // InternalComposeFileParser.g:5182:1: entryRuleConfigs returns [EObject current=null] : iv_ruleConfigs= ruleConfigs EOF ;
    public final EObject entryRuleConfigs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigs = null;


        try {
            // InternalComposeFileParser.g:5182:48: (iv_ruleConfigs= ruleConfigs EOF )
            // InternalComposeFileParser.g:5183:2: iv_ruleConfigs= ruleConfigs EOF
            {
             newCompositeNode(grammarAccess.getConfigsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigs=ruleConfigs();

            state._fsp--;

             current =iv_ruleConfigs; 
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
    // $ANTLR end "entryRuleConfigs"


    // $ANTLR start "ruleConfigs"
    // InternalComposeFileParser.g:5189:1: ruleConfigs returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END ) ;
    public final EObject ruleConfigs() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_file_6_0 = null;

        AntlrDatatypeRuleToken lv_external_9_0 = null;

        AntlrDatatypeRuleToken lv_customName_12_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5195:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END ) )
            // InternalComposeFileParser.g:5196:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END )
            {
            // InternalComposeFileParser.g:5196:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END )
            // InternalComposeFileParser.g:5197:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END
            {
            // InternalComposeFileParser.g:5197:3: ()
            // InternalComposeFileParser.g:5198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigsAccess().getConfigsAction_0(),
            					current);
            			

            }

            // InternalComposeFileParser.g:5204:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComposeFileParser.g:5205:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComposeFileParser.g:5205:4: (lv_name_1_0= RULE_ID )
            // InternalComposeFileParser.g:5206:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigsAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_56); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getConfigsAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalComposeFileParser.g:5230:3: ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=4;
                switch ( input.LA(1) ) {
                case File:
                    {
                    alt28=1;
                    }
                    break;
                case External:
                    {
                    alt28=2;
                    }
                    break;
                case Name:
                    {
                    alt28=3;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // InternalComposeFileParser.g:5231:4: (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:5231:4: (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:5232:5: otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) )
            	    {
            	    otherlv_4=(Token)match(input,File,FOLLOW_3); 

            	    					newLeafNode(otherlv_4, grammarAccess.getConfigsAccess().getFileKeyword_4_0_0());
            	    				
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_5, grammarAccess.getConfigsAccess().getColonKeyword_4_0_1());
            	    				
            	    // InternalComposeFileParser.g:5240:5: ( (lv_file_6_0= ruleValue ) )
            	    // InternalComposeFileParser.g:5241:6: (lv_file_6_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:5241:6: (lv_file_6_0= ruleValue )
            	    // InternalComposeFileParser.g:5242:7: lv_file_6_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getConfigsAccess().getFileValueParserRuleCall_4_0_2_0());
            	    						
            	    pushFollow(FOLLOW_57);
            	    lv_file_6_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfigsRule());
            	    							}
            	    							set(
            	    								current,
            	    								"file",
            	    								lv_file_6_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:5261:4: (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:5261:4: (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:5262:5: otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) )
            	    {
            	    otherlv_7=(Token)match(input,External,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getConfigsAccess().getExternalKeyword_4_1_0());
            	    				
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_8, grammarAccess.getConfigsAccess().getColonKeyword_4_1_1());
            	    				
            	    // InternalComposeFileParser.g:5270:5: ( (lv_external_9_0= ruleValue ) )
            	    // InternalComposeFileParser.g:5271:6: (lv_external_9_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:5271:6: (lv_external_9_0= ruleValue )
            	    // InternalComposeFileParser.g:5272:7: lv_external_9_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getConfigsAccess().getExternalValueParserRuleCall_4_1_2_0());
            	    						
            	    pushFollow(FOLLOW_57);
            	    lv_external_9_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfigsRule());
            	    							}
            	    							set(
            	    								current,
            	    								"external",
            	    								lv_external_9_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:5291:4: (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:5291:4: (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:5292:5: otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) )
            	    {
            	    otherlv_10=(Token)match(input,Name,FOLLOW_3); 

            	    					newLeafNode(otherlv_10, grammarAccess.getConfigsAccess().getNameKeyword_4_2_0());
            	    				
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_11, grammarAccess.getConfigsAccess().getColonKeyword_4_2_1());
            	    				
            	    // InternalComposeFileParser.g:5300:5: ( (lv_customName_12_0= ruleValue ) )
            	    // InternalComposeFileParser.g:5301:6: (lv_customName_12_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:5301:6: (lv_customName_12_0= ruleValue )
            	    // InternalComposeFileParser.g:5302:7: lv_customName_12_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getConfigsAccess().getCustomNameValueParserRuleCall_4_2_2_0());
            	    						
            	    pushFollow(FOLLOW_57);
            	    lv_customName_12_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConfigsRule());
            	    							}
            	    							set(
            	    								current,
            	    								"customName",
            	    								lv_customName_12_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_13, grammarAccess.getConfigsAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleConfigs"


    // $ANTLR start "entryRuleSecrets"
    // InternalComposeFileParser.g:5329:1: entryRuleSecrets returns [EObject current=null] : iv_ruleSecrets= ruleSecrets EOF ;
    public final EObject entryRuleSecrets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecrets = null;


        try {
            // InternalComposeFileParser.g:5329:48: (iv_ruleSecrets= ruleSecrets EOF )
            // InternalComposeFileParser.g:5330:2: iv_ruleSecrets= ruleSecrets EOF
            {
             newCompositeNode(grammarAccess.getSecretsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecrets=ruleSecrets();

            state._fsp--;

             current =iv_ruleSecrets; 
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
    // $ANTLR end "entryRuleSecrets"


    // $ANTLR start "ruleSecrets"
    // InternalComposeFileParser.g:5336:1: ruleSecrets returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END ) ;
    public final EObject ruleSecrets() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_file_6_0 = null;

        AntlrDatatypeRuleToken lv_external_9_0 = null;

        AntlrDatatypeRuleToken lv_customName_12_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5342:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END ) )
            // InternalComposeFileParser.g:5343:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END )
            {
            // InternalComposeFileParser.g:5343:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END )
            // InternalComposeFileParser.g:5344:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+ this_END_13= RULE_END
            {
            // InternalComposeFileParser.g:5344:3: ()
            // InternalComposeFileParser.g:5345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecretsAccess().getSecretsAction_0(),
            					current);
            			

            }

            // InternalComposeFileParser.g:5351:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComposeFileParser.g:5352:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComposeFileParser.g:5352:4: (lv_name_1_0= RULE_ID )
            // InternalComposeFileParser.g:5353:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSecretsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecretsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSecretsAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_56); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSecretsAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalComposeFileParser.g:5377:3: ( (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) ) | (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) ) | (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=4;
                switch ( input.LA(1) ) {
                case File:
                    {
                    alt29=1;
                    }
                    break;
                case External:
                    {
                    alt29=2;
                    }
                    break;
                case Name:
                    {
                    alt29=3;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // InternalComposeFileParser.g:5378:4: (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:5378:4: (otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:5379:5: otherlv_4= File otherlv_5= Colon ( (lv_file_6_0= ruleValue ) )
            	    {
            	    otherlv_4=(Token)match(input,File,FOLLOW_3); 

            	    					newLeafNode(otherlv_4, grammarAccess.getSecretsAccess().getFileKeyword_4_0_0());
            	    				
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSecretsAccess().getColonKeyword_4_0_1());
            	    				
            	    // InternalComposeFileParser.g:5387:5: ( (lv_file_6_0= ruleValue ) )
            	    // InternalComposeFileParser.g:5388:6: (lv_file_6_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:5388:6: (lv_file_6_0= ruleValue )
            	    // InternalComposeFileParser.g:5389:7: lv_file_6_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getSecretsAccess().getFileValueParserRuleCall_4_0_2_0());
            	    						
            	    pushFollow(FOLLOW_57);
            	    lv_file_6_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSecretsRule());
            	    							}
            	    							set(
            	    								current,
            	    								"file",
            	    								lv_file_6_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComposeFileParser.g:5408:4: (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:5408:4: (otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:5409:5: otherlv_7= External otherlv_8= Colon ( (lv_external_9_0= ruleValue ) )
            	    {
            	    otherlv_7=(Token)match(input,External,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getSecretsAccess().getExternalKeyword_4_1_0());
            	    				
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_8, grammarAccess.getSecretsAccess().getColonKeyword_4_1_1());
            	    				
            	    // InternalComposeFileParser.g:5417:5: ( (lv_external_9_0= ruleValue ) )
            	    // InternalComposeFileParser.g:5418:6: (lv_external_9_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:5418:6: (lv_external_9_0= ruleValue )
            	    // InternalComposeFileParser.g:5419:7: lv_external_9_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getSecretsAccess().getExternalValueParserRuleCall_4_1_2_0());
            	    						
            	    pushFollow(FOLLOW_57);
            	    lv_external_9_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSecretsRule());
            	    							}
            	    							set(
            	    								current,
            	    								"external",
            	    								lv_external_9_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComposeFileParser.g:5438:4: (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) )
            	    {
            	    // InternalComposeFileParser.g:5438:4: (otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) ) )
            	    // InternalComposeFileParser.g:5439:5: otherlv_10= Name otherlv_11= Colon ( (lv_customName_12_0= ruleValue ) )
            	    {
            	    otherlv_10=(Token)match(input,Name,FOLLOW_3); 

            	    					newLeafNode(otherlv_10, grammarAccess.getSecretsAccess().getNameKeyword_4_2_0());
            	    				
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_15); 

            	    					newLeafNode(otherlv_11, grammarAccess.getSecretsAccess().getColonKeyword_4_2_1());
            	    				
            	    // InternalComposeFileParser.g:5447:5: ( (lv_customName_12_0= ruleValue ) )
            	    // InternalComposeFileParser.g:5448:6: (lv_customName_12_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:5448:6: (lv_customName_12_0= ruleValue )
            	    // InternalComposeFileParser.g:5449:7: lv_customName_12_0= ruleValue
            	    {

            	    							newCompositeNode(grammarAccess.getSecretsAccess().getCustomNameValueParserRuleCall_4_2_2_0());
            	    						
            	    pushFollow(FOLLOW_57);
            	    lv_customName_12_0=ruleValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSecretsRule());
            	    							}
            	    							set(
            	    								current,
            	    								"customName",
            	    								lv_customName_12_0,
            	    								"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_13, grammarAccess.getSecretsAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleSecrets"


    // $ANTLR start "entryRuleValueOrList"
    // InternalComposeFileParser.g:5476:1: entryRuleValueOrList returns [EObject current=null] : iv_ruleValueOrList= ruleValueOrList EOF ;
    public final EObject entryRuleValueOrList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueOrList = null;


        try {
            // InternalComposeFileParser.g:5476:52: (iv_ruleValueOrList= ruleValueOrList EOF )
            // InternalComposeFileParser.g:5477:2: iv_ruleValueOrList= ruleValueOrList EOF
            {
             newCompositeNode(grammarAccess.getValueOrListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueOrList=ruleValueOrList();

            state._fsp--;

             current =iv_ruleValueOrList; 
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
    // $ANTLR end "entryRuleValueOrList"


    // $ANTLR start "ruleValueOrList"
    // InternalComposeFileParser.g:5483:1: ruleValueOrList returns [EObject current=null] : ( ( () ( (lv_list_1_0= ruleValue ) ) ) | this_List_2= ruleList ) ;
    public final EObject ruleValueOrList() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_list_1_0 = null;

        EObject this_List_2 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5489:2: ( ( ( () ( (lv_list_1_0= ruleValue ) ) ) | this_List_2= ruleList ) )
            // InternalComposeFileParser.g:5490:2: ( ( () ( (lv_list_1_0= ruleValue ) ) ) | this_List_2= ruleList )
            {
            // InternalComposeFileParser.g:5490:2: ( ( () ( (lv_list_1_0= ruleValue ) ) ) | this_List_2= ruleList )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_BEGIN) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalComposeFileParser.g:5491:3: ( () ( (lv_list_1_0= ruleValue ) ) )
                    {
                    // InternalComposeFileParser.g:5491:3: ( () ( (lv_list_1_0= ruleValue ) ) )
                    // InternalComposeFileParser.g:5492:4: () ( (lv_list_1_0= ruleValue ) )
                    {
                    // InternalComposeFileParser.g:5492:4: ()
                    // InternalComposeFileParser.g:5493:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueOrListAccess().getListAction_0_0(),
                    						current);
                    				

                    }

                    // InternalComposeFileParser.g:5499:4: ( (lv_list_1_0= ruleValue ) )
                    // InternalComposeFileParser.g:5500:5: (lv_list_1_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:5500:5: (lv_list_1_0= ruleValue )
                    // InternalComposeFileParser.g:5501:6: lv_list_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getValueOrListAccess().getListValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_list_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueOrListRule());
                    						}
                    						add(
                    							current,
                    							"list",
                    							lv_list_1_0,
                    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:5520:3: this_List_2= ruleList
                    {

                    			newCompositeNode(grammarAccess.getValueOrListAccess().getListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_2=ruleList();

                    state._fsp--;


                    			current = this_List_2;
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
    // $ANTLR end "ruleValueOrList"


    // $ANTLR start "entryRuleListOrMapping"
    // InternalComposeFileParser.g:5532:1: entryRuleListOrMapping returns [EObject current=null] : iv_ruleListOrMapping= ruleListOrMapping EOF ;
    public final EObject entryRuleListOrMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOrMapping = null;


        try {
            // InternalComposeFileParser.g:5532:54: (iv_ruleListOrMapping= ruleListOrMapping EOF )
            // InternalComposeFileParser.g:5533:2: iv_ruleListOrMapping= ruleListOrMapping EOF
            {
             newCompositeNode(grammarAccess.getListOrMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOrMapping=ruleListOrMapping();

            state._fsp--;

             current =iv_ruleListOrMapping; 
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
    // $ANTLR end "entryRuleListOrMapping"


    // $ANTLR start "ruleListOrMapping"
    // InternalComposeFileParser.g:5539:1: ruleListOrMapping returns [EObject current=null] : (this_List_0= ruleList | this_Mapping_1= ruleMapping ) ;
    public final EObject ruleListOrMapping() throws RecognitionException {
        EObject current = null;

        EObject this_List_0 = null;

        EObject this_Mapping_1 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5545:2: ( (this_List_0= ruleList | this_Mapping_1= ruleMapping ) )
            // InternalComposeFileParser.g:5546:2: (this_List_0= ruleList | this_Mapping_1= ruleMapping )
            {
            // InternalComposeFileParser.g:5546:2: (this_List_0= ruleList | this_Mapping_1= ruleMapping )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_BEGIN) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==HyphenMinusSpace) ) {
                    int LA31_2 = input.LA(3);

                    if ( (LA31_2==RULE_STRING) ) {
                        int LA31_4 = input.LA(4);

                        if ( ((LA31_4>=Colon && LA31_4<=EqualsSign)) ) {
                            alt31=2;
                        }
                        else if ( (LA31_4==HyphenMinusSpace||LA31_4==RULE_END) ) {
                            alt31=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA31_2==RULE_ID) ) {
                        int LA31_5 = input.LA(4);

                        if ( (LA31_5==HyphenMinusSpace||LA31_5==RULE_END) ) {
                            alt31=1;
                        }
                        else if ( ((LA31_5>=Colon && LA31_5<=EqualsSign)) ) {
                            alt31=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA31_1==RULE_ID||LA31_1==RULE_STRING) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalComposeFileParser.g:5547:3: this_List_0= ruleList
                    {

                    			newCompositeNode(grammarAccess.getListOrMappingAccess().getListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_0=ruleList();

                    state._fsp--;


                    			current = this_List_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:5556:3: this_Mapping_1= ruleMapping
                    {

                    			newCompositeNode(grammarAccess.getListOrMappingAccess().getMappingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mapping_1=ruleMapping();

                    state._fsp--;


                    			current = this_Mapping_1;
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
    // $ANTLR end "ruleListOrMapping"


    // $ANTLR start "entryRuleList"
    // InternalComposeFileParser.g:5568:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalComposeFileParser.g:5568:45: (iv_ruleList= ruleList EOF )
            // InternalComposeFileParser.g:5569:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalComposeFileParser.g:5575:1: ruleList returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace ( (lv_list_2_0= ruleValue ) ) )+ this_END_3= RULE_END ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token this_END_3=null;
        AntlrDatatypeRuleToken lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5581:2: ( (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace ( (lv_list_2_0= ruleValue ) ) )+ this_END_3= RULE_END ) )
            // InternalComposeFileParser.g:5582:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace ( (lv_list_2_0= ruleValue ) ) )+ this_END_3= RULE_END )
            {
            // InternalComposeFileParser.g:5582:2: (this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace ( (lv_list_2_0= ruleValue ) ) )+ this_END_3= RULE_END )
            // InternalComposeFileParser.g:5583:3: this_BEGIN_0= RULE_BEGIN (otherlv_1= HyphenMinusSpace ( (lv_list_2_0= ruleValue ) ) )+ this_END_3= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getListAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalComposeFileParser.g:5587:3: (otherlv_1= HyphenMinusSpace ( (lv_list_2_0= ruleValue ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==HyphenMinusSpace) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalComposeFileParser.g:5588:4: otherlv_1= HyphenMinusSpace ( (lv_list_2_0= ruleValue ) )
            	    {
            	    otherlv_1=(Token)match(input,HyphenMinusSpace,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getListAccess().getHyphenMinusSpaceKeyword_1_0());
            	    			
            	    // InternalComposeFileParser.g:5592:4: ( (lv_list_2_0= ruleValue ) )
            	    // InternalComposeFileParser.g:5593:5: (lv_list_2_0= ruleValue )
            	    {
            	    // InternalComposeFileParser.g:5593:5: (lv_list_2_0= ruleValue )
            	    // InternalComposeFileParser.g:5594:6: lv_list_2_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getListAccess().getListValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_58);
            	    lv_list_2_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_2_0,
            	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getListAccess().getENDTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleMapping"
    // InternalComposeFileParser.g:5620:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalComposeFileParser.g:5620:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalComposeFileParser.g:5621:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalComposeFileParser.g:5627:1: ruleMapping returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( ( (lv_map_1_0= ruleMappingWithPrefixAndColon ) )+ | ( (lv_map_2_0= ruleMappingWithoutPrefixAndColon ) )+ | ( (lv_map_3_0= ruleMappingWithPrefixAndEqual ) )+ | ( (lv_map_4_0= ruleMappingWithoutPrefixAndEqual ) )+ ) this_END_5= RULE_END ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token this_END_5=null;
        EObject lv_map_1_0 = null;

        EObject lv_map_2_0 = null;

        EObject lv_map_3_0 = null;

        EObject lv_map_4_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5633:2: ( (this_BEGIN_0= RULE_BEGIN ( ( (lv_map_1_0= ruleMappingWithPrefixAndColon ) )+ | ( (lv_map_2_0= ruleMappingWithoutPrefixAndColon ) )+ | ( (lv_map_3_0= ruleMappingWithPrefixAndEqual ) )+ | ( (lv_map_4_0= ruleMappingWithoutPrefixAndEqual ) )+ ) this_END_5= RULE_END ) )
            // InternalComposeFileParser.g:5634:2: (this_BEGIN_0= RULE_BEGIN ( ( (lv_map_1_0= ruleMappingWithPrefixAndColon ) )+ | ( (lv_map_2_0= ruleMappingWithoutPrefixAndColon ) )+ | ( (lv_map_3_0= ruleMappingWithPrefixAndEqual ) )+ | ( (lv_map_4_0= ruleMappingWithoutPrefixAndEqual ) )+ ) this_END_5= RULE_END )
            {
            // InternalComposeFileParser.g:5634:2: (this_BEGIN_0= RULE_BEGIN ( ( (lv_map_1_0= ruleMappingWithPrefixAndColon ) )+ | ( (lv_map_2_0= ruleMappingWithoutPrefixAndColon ) )+ | ( (lv_map_3_0= ruleMappingWithPrefixAndEqual ) )+ | ( (lv_map_4_0= ruleMappingWithoutPrefixAndEqual ) )+ ) this_END_5= RULE_END )
            // InternalComposeFileParser.g:5635:3: this_BEGIN_0= RULE_BEGIN ( ( (lv_map_1_0= ruleMappingWithPrefixAndColon ) )+ | ( (lv_map_2_0= ruleMappingWithoutPrefixAndColon ) )+ | ( (lv_map_3_0= ruleMappingWithPrefixAndEqual ) )+ | ( (lv_map_4_0= ruleMappingWithoutPrefixAndEqual ) )+ ) this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_59); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getMappingAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalComposeFileParser.g:5639:3: ( ( (lv_map_1_0= ruleMappingWithPrefixAndColon ) )+ | ( (lv_map_2_0= ruleMappingWithoutPrefixAndColon ) )+ | ( (lv_map_3_0= ruleMappingWithPrefixAndEqual ) )+ | ( (lv_map_4_0= ruleMappingWithoutPrefixAndEqual ) )+ )
            int alt37=4;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalComposeFileParser.g:5640:4: ( (lv_map_1_0= ruleMappingWithPrefixAndColon ) )+
                    {
                    // InternalComposeFileParser.g:5640:4: ( (lv_map_1_0= ruleMappingWithPrefixAndColon ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==HyphenMinusSpace) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalComposeFileParser.g:5641:5: (lv_map_1_0= ruleMappingWithPrefixAndColon )
                    	    {
                    	    // InternalComposeFileParser.g:5641:5: (lv_map_1_0= ruleMappingWithPrefixAndColon )
                    	    // InternalComposeFileParser.g:5642:6: lv_map_1_0= ruleMappingWithPrefixAndColon
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getMapMappingWithPrefixAndColonParserRuleCall_1_0_0());
                    	    					
                    	    pushFollow(FOLLOW_58);
                    	    lv_map_1_0=ruleMappingWithPrefixAndColon();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"map",
                    	    							lv_map_1_0,
                    	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.MappingWithPrefixAndColon");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:5660:4: ( (lv_map_2_0= ruleMappingWithoutPrefixAndColon ) )+
                    {
                    // InternalComposeFileParser.g:5660:4: ( (lv_map_2_0= ruleMappingWithoutPrefixAndColon ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID||LA34_0==RULE_STRING) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalComposeFileParser.g:5661:5: (lv_map_2_0= ruleMappingWithoutPrefixAndColon )
                    	    {
                    	    // InternalComposeFileParser.g:5661:5: (lv_map_2_0= ruleMappingWithoutPrefixAndColon )
                    	    // InternalComposeFileParser.g:5662:6: lv_map_2_0= ruleMappingWithoutPrefixAndColon
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getMapMappingWithoutPrefixAndColonParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_60);
                    	    lv_map_2_0=ruleMappingWithoutPrefixAndColon();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"map",
                    	    							lv_map_2_0,
                    	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.MappingWithoutPrefixAndColon");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalComposeFileParser.g:5680:4: ( (lv_map_3_0= ruleMappingWithPrefixAndEqual ) )+
                    {
                    // InternalComposeFileParser.g:5680:4: ( (lv_map_3_0= ruleMappingWithPrefixAndEqual ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==HyphenMinusSpace) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalComposeFileParser.g:5681:5: (lv_map_3_0= ruleMappingWithPrefixAndEqual )
                    	    {
                    	    // InternalComposeFileParser.g:5681:5: (lv_map_3_0= ruleMappingWithPrefixAndEqual )
                    	    // InternalComposeFileParser.g:5682:6: lv_map_3_0= ruleMappingWithPrefixAndEqual
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getMapMappingWithPrefixAndEqualParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_58);
                    	    lv_map_3_0=ruleMappingWithPrefixAndEqual();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"map",
                    	    							lv_map_3_0,
                    	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.MappingWithPrefixAndEqual");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // InternalComposeFileParser.g:5700:4: ( (lv_map_4_0= ruleMappingWithoutPrefixAndEqual ) )+
                    {
                    // InternalComposeFileParser.g:5700:4: ( (lv_map_4_0= ruleMappingWithoutPrefixAndEqual ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_ID||LA36_0==RULE_STRING) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalComposeFileParser.g:5701:5: (lv_map_4_0= ruleMappingWithoutPrefixAndEqual )
                    	    {
                    	    // InternalComposeFileParser.g:5701:5: (lv_map_4_0= ruleMappingWithoutPrefixAndEqual )
                    	    // InternalComposeFileParser.g:5702:6: lv_map_4_0= ruleMappingWithoutPrefixAndEqual
                    	    {

                    	    						newCompositeNode(grammarAccess.getMappingAccess().getMapMappingWithoutPrefixAndEqualParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_61);
                    	    lv_map_4_0=ruleMappingWithoutPrefixAndEqual();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"map",
                    	    							lv_map_4_0,
                    	    							"org.palladiosimulator.somox.docker.compose.ComposeFile.MappingWithoutPrefixAndEqual");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


                    }
                    break;

            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getMappingAccess().getENDTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMappingWithPrefixAndColon"
    // InternalComposeFileParser.g:5728:1: entryRuleMappingWithPrefixAndColon returns [EObject current=null] : iv_ruleMappingWithPrefixAndColon= ruleMappingWithPrefixAndColon EOF ;
    public final EObject entryRuleMappingWithPrefixAndColon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingWithPrefixAndColon = null;


        try {
            // InternalComposeFileParser.g:5728:66: (iv_ruleMappingWithPrefixAndColon= ruleMappingWithPrefixAndColon EOF )
            // InternalComposeFileParser.g:5729:2: iv_ruleMappingWithPrefixAndColon= ruleMappingWithPrefixAndColon EOF
            {
             newCompositeNode(grammarAccess.getMappingWithPrefixAndColonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingWithPrefixAndColon=ruleMappingWithPrefixAndColon();

            state._fsp--;

             current =iv_ruleMappingWithPrefixAndColon; 
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
    // $ANTLR end "entryRuleMappingWithPrefixAndColon"


    // $ANTLR start "ruleMappingWithPrefixAndColon"
    // InternalComposeFileParser.g:5735:1: ruleMappingWithPrefixAndColon returns [EObject current=null] : (otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= Colon ( (lv_value_3_0= ruleValue ) )? ) ;
    public final EObject ruleMappingWithPrefixAndColon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5741:2: ( (otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= Colon ( (lv_value_3_0= ruleValue ) )? ) )
            // InternalComposeFileParser.g:5742:2: (otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= Colon ( (lv_value_3_0= ruleValue ) )? )
            {
            // InternalComposeFileParser.g:5742:2: (otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= Colon ( (lv_value_3_0= ruleValue ) )? )
            // InternalComposeFileParser.g:5743:3: otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= Colon ( (lv_value_3_0= ruleValue ) )?
            {
            otherlv_0=(Token)match(input,HyphenMinusSpace,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingWithPrefixAndColonAccess().getHyphenMinusSpaceKeyword_0());
            		
            // InternalComposeFileParser.g:5747:3: ( (lv_name_1_0= ruleValue ) )
            // InternalComposeFileParser.g:5748:4: (lv_name_1_0= ruleValue )
            {
            // InternalComposeFileParser.g:5748:4: (lv_name_1_0= ruleValue )
            // InternalComposeFileParser.g:5749:5: lv_name_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getMappingWithPrefixAndColonAccess().getNameValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingWithPrefixAndColonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingWithPrefixAndColonAccess().getColonKeyword_2());
            		
            // InternalComposeFileParser.g:5770:3: ( (lv_value_3_0= ruleValue ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalComposeFileParser.g:5771:4: (lv_value_3_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:5771:4: (lv_value_3_0= ruleValue )
                    // InternalComposeFileParser.g:5772:5: lv_value_3_0= ruleValue
                    {

                    					newCompositeNode(grammarAccess.getMappingWithPrefixAndColonAccess().getValueValueParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMappingWithPrefixAndColonRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMappingWithPrefixAndColon"


    // $ANTLR start "entryRuleMappingWithoutPrefixAndColon"
    // InternalComposeFileParser.g:5793:1: entryRuleMappingWithoutPrefixAndColon returns [EObject current=null] : iv_ruleMappingWithoutPrefixAndColon= ruleMappingWithoutPrefixAndColon EOF ;
    public final EObject entryRuleMappingWithoutPrefixAndColon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingWithoutPrefixAndColon = null;


        try {
            // InternalComposeFileParser.g:5793:69: (iv_ruleMappingWithoutPrefixAndColon= ruleMappingWithoutPrefixAndColon EOF )
            // InternalComposeFileParser.g:5794:2: iv_ruleMappingWithoutPrefixAndColon= ruleMappingWithoutPrefixAndColon EOF
            {
             newCompositeNode(grammarAccess.getMappingWithoutPrefixAndColonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingWithoutPrefixAndColon=ruleMappingWithoutPrefixAndColon();

            state._fsp--;

             current =iv_ruleMappingWithoutPrefixAndColon; 
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
    // $ANTLR end "entryRuleMappingWithoutPrefixAndColon"


    // $ANTLR start "ruleMappingWithoutPrefixAndColon"
    // InternalComposeFileParser.g:5800:1: ruleMappingWithoutPrefixAndColon returns [EObject current=null] : ( ( (lv_name_0_0= ruleValue ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )? ) ;
    public final EObject ruleMappingWithoutPrefixAndColon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5806:2: ( ( ( (lv_name_0_0= ruleValue ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )? ) )
            // InternalComposeFileParser.g:5807:2: ( ( (lv_name_0_0= ruleValue ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )? )
            {
            // InternalComposeFileParser.g:5807:2: ( ( (lv_name_0_0= ruleValue ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )? )
            // InternalComposeFileParser.g:5808:3: ( (lv_name_0_0= ruleValue ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )?
            {
            // InternalComposeFileParser.g:5808:3: ( (lv_name_0_0= ruleValue ) )
            // InternalComposeFileParser.g:5809:4: (lv_name_0_0= ruleValue )
            {
            // InternalComposeFileParser.g:5809:4: (lv_name_0_0= ruleValue )
            // InternalComposeFileParser.g:5810:5: lv_name_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getMappingWithoutPrefixAndColonAccess().getNameValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingWithoutPrefixAndColonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingWithoutPrefixAndColonAccess().getColonKeyword_1());
            		
            // InternalComposeFileParser.g:5831:3: ( (lv_value_2_0= ruleValue ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==EOF||(LA39_1>=RULE_END && LA39_1<=RULE_ID)||LA39_1==RULE_STRING) ) {
                    alt39=1;
                }
            }
            else if ( (LA39_0==RULE_ID) ) {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==EOF||(LA39_2>=RULE_END && LA39_2<=RULE_ID)||LA39_2==RULE_STRING) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalComposeFileParser.g:5832:4: (lv_value_2_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:5832:4: (lv_value_2_0= ruleValue )
                    // InternalComposeFileParser.g:5833:5: lv_value_2_0= ruleValue
                    {

                    					newCompositeNode(grammarAccess.getMappingWithoutPrefixAndColonAccess().getValueValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMappingWithoutPrefixAndColonRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMappingWithoutPrefixAndColon"


    // $ANTLR start "entryRuleMappingWithPrefixAndEqual"
    // InternalComposeFileParser.g:5854:1: entryRuleMappingWithPrefixAndEqual returns [EObject current=null] : iv_ruleMappingWithPrefixAndEqual= ruleMappingWithPrefixAndEqual EOF ;
    public final EObject entryRuleMappingWithPrefixAndEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingWithPrefixAndEqual = null;


        try {
            // InternalComposeFileParser.g:5854:66: (iv_ruleMappingWithPrefixAndEqual= ruleMappingWithPrefixAndEqual EOF )
            // InternalComposeFileParser.g:5855:2: iv_ruleMappingWithPrefixAndEqual= ruleMappingWithPrefixAndEqual EOF
            {
             newCompositeNode(grammarAccess.getMappingWithPrefixAndEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingWithPrefixAndEqual=ruleMappingWithPrefixAndEqual();

            state._fsp--;

             current =iv_ruleMappingWithPrefixAndEqual; 
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
    // $ANTLR end "entryRuleMappingWithPrefixAndEqual"


    // $ANTLR start "ruleMappingWithPrefixAndEqual"
    // InternalComposeFileParser.g:5861:1: ruleMappingWithPrefixAndEqual returns [EObject current=null] : (otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleValue ) )? ) ;
    public final EObject ruleMappingWithPrefixAndEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5867:2: ( (otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleValue ) )? ) )
            // InternalComposeFileParser.g:5868:2: (otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleValue ) )? )
            {
            // InternalComposeFileParser.g:5868:2: (otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleValue ) )? )
            // InternalComposeFileParser.g:5869:3: otherlv_0= HyphenMinusSpace ( (lv_name_1_0= ruleValue ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleValue ) )?
            {
            otherlv_0=(Token)match(input,HyphenMinusSpace,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingWithPrefixAndEqualAccess().getHyphenMinusSpaceKeyword_0());
            		
            // InternalComposeFileParser.g:5873:3: ( (lv_name_1_0= ruleValue ) )
            // InternalComposeFileParser.g:5874:4: (lv_name_1_0= ruleValue )
            {
            // InternalComposeFileParser.g:5874:4: (lv_name_1_0= ruleValue )
            // InternalComposeFileParser.g:5875:5: lv_name_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getMappingWithPrefixAndEqualAccess().getNameValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_63);
            lv_name_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingWithPrefixAndEqualRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingWithPrefixAndEqualAccess().getEqualsSignKeyword_2());
            		
            // InternalComposeFileParser.g:5896:3: ( (lv_value_3_0= ruleValue ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalComposeFileParser.g:5897:4: (lv_value_3_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:5897:4: (lv_value_3_0= ruleValue )
                    // InternalComposeFileParser.g:5898:5: lv_value_3_0= ruleValue
                    {

                    					newCompositeNode(grammarAccess.getMappingWithPrefixAndEqualAccess().getValueValueParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMappingWithPrefixAndEqualRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMappingWithPrefixAndEqual"


    // $ANTLR start "entryRuleMappingWithoutPrefixAndEqual"
    // InternalComposeFileParser.g:5919:1: entryRuleMappingWithoutPrefixAndEqual returns [EObject current=null] : iv_ruleMappingWithoutPrefixAndEqual= ruleMappingWithoutPrefixAndEqual EOF ;
    public final EObject entryRuleMappingWithoutPrefixAndEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingWithoutPrefixAndEqual = null;


        try {
            // InternalComposeFileParser.g:5919:69: (iv_ruleMappingWithoutPrefixAndEqual= ruleMappingWithoutPrefixAndEqual EOF )
            // InternalComposeFileParser.g:5920:2: iv_ruleMappingWithoutPrefixAndEqual= ruleMappingWithoutPrefixAndEqual EOF
            {
             newCompositeNode(grammarAccess.getMappingWithoutPrefixAndEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingWithoutPrefixAndEqual=ruleMappingWithoutPrefixAndEqual();

            state._fsp--;

             current =iv_ruleMappingWithoutPrefixAndEqual; 
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
    // $ANTLR end "entryRuleMappingWithoutPrefixAndEqual"


    // $ANTLR start "ruleMappingWithoutPrefixAndEqual"
    // InternalComposeFileParser.g:5926:1: ruleMappingWithoutPrefixAndEqual returns [EObject current=null] : ( ( (lv_name_0_0= ruleValue ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) )? ) ;
    public final EObject ruleMappingWithoutPrefixAndEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalComposeFileParser.g:5932:2: ( ( ( (lv_name_0_0= ruleValue ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) )? ) )
            // InternalComposeFileParser.g:5933:2: ( ( (lv_name_0_0= ruleValue ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) )? )
            {
            // InternalComposeFileParser.g:5933:2: ( ( (lv_name_0_0= ruleValue ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) )? )
            // InternalComposeFileParser.g:5934:3: ( (lv_name_0_0= ruleValue ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) )?
            {
            // InternalComposeFileParser.g:5934:3: ( (lv_name_0_0= ruleValue ) )
            // InternalComposeFileParser.g:5935:4: (lv_name_0_0= ruleValue )
            {
            // InternalComposeFileParser.g:5935:4: (lv_name_0_0= ruleValue )
            // InternalComposeFileParser.g:5936:5: lv_name_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getMappingWithoutPrefixAndEqualAccess().getNameValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_63);
            lv_name_0_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingWithoutPrefixAndEqualRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingWithoutPrefixAndEqualAccess().getEqualsSignKeyword_1());
            		
            // InternalComposeFileParser.g:5957:3: ( (lv_value_2_0= ruleValue ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||(LA41_1>=RULE_END && LA41_1<=RULE_ID)||LA41_1==RULE_STRING) ) {
                    alt41=1;
                }
            }
            else if ( (LA41_0==RULE_ID) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==EOF||(LA41_2>=RULE_END && LA41_2<=RULE_ID)||LA41_2==RULE_STRING) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalComposeFileParser.g:5958:4: (lv_value_2_0= ruleValue )
                    {
                    // InternalComposeFileParser.g:5958:4: (lv_value_2_0= ruleValue )
                    // InternalComposeFileParser.g:5959:5: lv_value_2_0= ruleValue
                    {

                    					newCompositeNode(grammarAccess.getMappingWithoutPrefixAndEqualAccess().getValueValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMappingWithoutPrefixAndEqualRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.palladiosimulator.somox.docker.compose.ComposeFile.Value");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMappingWithoutPrefixAndEqual"


    // $ANTLR start "entryRuleValue"
    // InternalComposeFileParser.g:5980:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalComposeFileParser.g:5980:45: (iv_ruleValue= ruleValue EOF )
            // InternalComposeFileParser.g:5981:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalComposeFileParser.g:5987:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComposeFileParser.g:5993:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComposeFileParser.g:5994:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComposeFileParser.g:5994:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalComposeFileParser.g:5995:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComposeFileParser.g:6003:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getValueAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleValue"

    // Delegated rules


    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\162\1\167\4\163\4\uffff";
    static final String dfa_3s = "\2\171\4\164\4\uffff";
    static final String dfa_4s = "\6\uffff\1\2\1\4\1\1\1\3";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\3\1\uffff\1\2",
            "\1\5\1\uffff\1\4",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\10\1\11",
            "\1\10\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "5639:3: ( ( (lv_map_1_0= ruleMappingWithPrefixAndColon ) )+ | ( (lv_map_2_0= ruleMappingWithoutPrefixAndColon ) )+ | ( (lv_map_3_0= ruleMappingWithPrefixAndEqual ) )+ | ( (lv_map_4_0= ruleMappingWithoutPrefixAndEqual ) )+ )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x4440000000000002L,0x0000000000004200L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4040000000000002L,0x0000000000004200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x4040000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x784B4BD9C7831360L,0x0001D8086A0D568DL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x02A0000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x784B4BD9C7831360L,0x0041D8086A0D568DL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0280000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0100000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x8800002400000000L,0x0000000080480020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8800002400000000L,0x0040000080480020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0200900000006880L,0x0000002000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200900000006880L,0x0040002000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010100000L,0x0040000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000008000L,0x0000000005000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000008000L,0x0040000005000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000410L,0x0000000014000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000410L,0x0040000014000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000040000L,0x0000020000000902L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000040000L,0x0040020000000902L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0040000000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0280040000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000000200000L,0x00400040000A0000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0014000200600000L,0x00400050000A0000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004000000000000L,0x0000004200000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0004000000000000L,0x0040004200000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0044000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0284000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x02C0000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x02C4000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0280000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});

}