package org.palladiosimulator.somox.docker.compose.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComposeFileLexer extends Lexer {
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

    public InternalComposeFileLexer() {;} 
    public InternalComposeFileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalComposeFileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalComposeFileLexer.g"; }

    // $ANTLR start "Max_failure_ratio"
    public final void mMax_failure_ratio() throws RecognitionException {
        try {
            int _type = Max_failure_ratio;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:14:19: ( 'max_failure_ratio' )
            // InternalComposeFileLexer.g:14:21: 'max_failure_ratio'
            {
            match("max_failure_ratio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Max_failure_ratio"

    // $ANTLR start "Stop_grace_period"
    public final void mStop_grace_period() throws RecognitionException {
        try {
            int _type = Stop_grace_period;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:16:19: ( 'stop_grace_period' )
            // InternalComposeFileLexer.g:16:21: 'stop_grace_period'
            {
            match("stop_grace_period"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stop_grace_period"

    // $ANTLR start "Credential_spec"
    public final void mCredential_spec() throws RecognitionException {
        try {
            int _type = Credential_spec;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:18:17: ( 'credential_spec' )
            // InternalComposeFileLexer.g:18:19: 'credential_spec'
            {
            match("credential_spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Credential_spec"

    // $ANTLR start "Rollback_config"
    public final void mRollback_config() throws RecognitionException {
        try {
            int _type = Rollback_config;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:20:17: ( 'rollback_config' )
            // InternalComposeFileLexer.g:20:19: 'rollback_config'
            {
            match("rollback_config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rollback_config"

    // $ANTLR start "Container_name"
    public final void mContainer_name() throws RecognitionException {
        try {
            int _type = Container_name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:22:16: ( 'container_name' )
            // InternalComposeFileLexer.g:22:18: 'container_name'
            {
            match("container_name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Container_name"

    // $ANTLR start "External_links"
    public final void mExternal_links() throws RecognitionException {
        try {
            int _type = External_links;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:24:16: ( 'external_links' )
            // InternalComposeFileLexer.g:24:18: 'external_links'
            {
            match("external_links"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "External_links"

    // $ANTLR start "Failure_action"
    public final void mFailure_action() throws RecognitionException {
        try {
            int _type = Failure_action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:26:16: ( 'failure_action' )
            // InternalComposeFileLexer.g:26:18: 'failure_action'
            {
            match("failure_action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Failure_action"

    // $ANTLR start "Restart_policy"
    public final void mRestart_policy() throws RecognitionException {
        try {
            int _type = Restart_policy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:28:16: ( 'restart_policy' )
            // InternalComposeFileLexer.g:28:18: 'restart_policy'
            {
            match("restart_policy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Restart_policy"

    // $ANTLR start "Cgroup_parent"
    public final void mCgroup_parent() throws RecognitionException {
        try {
            int _type = Cgroup_parent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:30:15: ( 'cgroup_parent' )
            // InternalComposeFileLexer.g:30:17: 'cgroup_parent'
            {
            match("cgroup_parent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cgroup_parent"

    // $ANTLR start "Endpoint_mode"
    public final void mEndpoint_mode() throws RecognitionException {
        try {
            int _type = Endpoint_mode;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:32:15: ( 'endpoint_mode' )
            // InternalComposeFileLexer.g:32:17: 'endpoint_mode'
            {
            match("endpoint_mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Endpoint_mode"

    // $ANTLR start "Update_config"
    public final void mUpdate_config() throws RecognitionException {
        try {
            int _type = Update_config;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:34:15: ( 'update_config' )
            // InternalComposeFileLexer.g:34:17: 'update_config'
            {
            match("update_config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Update_config"

    // $ANTLR start "Max_attempts"
    public final void mMax_attempts() throws RecognitionException {
        try {
            int _type = Max_attempts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:36:14: ( 'max_attempts' )
            // InternalComposeFileLexer.g:36:16: 'max_attempts'
            {
            match("max_attempts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Max_attempts"

    // $ANTLR start "Network_mode"
    public final void mNetwork_mode() throws RecognitionException {
        try {
            int _type = Network_mode;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:38:14: ( 'network_mode' )
            // InternalComposeFileLexer.g:38:16: 'network_mode'
            {
            match("network_mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Network_mode"

    // $ANTLR start "Security_opt"
    public final void mSecurity_opt() throws RecognitionException {
        try {
            int _type = Security_opt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:40:14: ( 'security_opt' )
            // InternalComposeFileLexer.g:40:16: 'security_opt'
            {
            match("security_opt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Security_opt"

    // $ANTLR start "Start_period"
    public final void mStart_period() throws RecognitionException {
        try {
            int _type = Start_period;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:42:14: ( 'start_period' )
            // InternalComposeFileLexer.g:42:16: 'start_period'
            {
            match("start_period"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Start_period"

    // $ANTLR start "Consistency"
    public final void mConsistency() throws RecognitionException {
        try {
            int _type = Consistency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:44:13: ( 'consistency' )
            // InternalComposeFileLexer.g:44:15: 'consistency'
            {
            match("consistency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Consistency"

    // $ANTLR start "Constraints"
    public final void mConstraints() throws RecognitionException {
        try {
            int _type = Constraints;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:46:13: ( 'constraints' )
            // InternalComposeFileLexer.g:46:15: 'constraints'
            {
            match("constraints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constraints"

    // $ANTLR start "Driver_opts"
    public final void mDriver_opts() throws RecognitionException {
        try {
            int _type = Driver_opts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:48:13: ( 'driver_opts' )
            // InternalComposeFileLexer.g:48:15: 'driver_opts'
            {
            match("driver_opts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Driver_opts"

    // $ANTLR start "Enable_ipv6"
    public final void mEnable_ipv6() throws RecognitionException {
        try {
            int _type = Enable_ipv6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:50:13: ( 'enable_ipv6' )
            // InternalComposeFileLexer.g:50:15: 'enable_ipv6'
            {
            match("enable_ipv6"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enable_ipv6"

    // $ANTLR start "Environment"
    public final void mEnvironment() throws RecognitionException {
        try {
            int _type = Environment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:52:13: ( 'environment' )
            // InternalComposeFileLexer.g:52:15: 'environment'
            {
            match("environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Environment"

    // $ANTLR start "Extra_hosts"
    public final void mExtra_hosts() throws RecognitionException {
        try {
            int _type = Extra_hosts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:54:13: ( 'extra_hosts' )
            // InternalComposeFileLexer.g:54:15: 'extra_hosts'
            {
            match("extra_hosts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extra_hosts"

    // $ANTLR start "Healthcheck"
    public final void mHealthcheck() throws RecognitionException {
        try {
            int _type = Healthcheck;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:56:13: ( 'healthcheck' )
            // InternalComposeFileLexer.g:56:15: 'healthcheck'
            {
            match("healthcheck"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Healthcheck"

    // $ANTLR start "Mac_address"
    public final void mMac_address() throws RecognitionException {
        try {
            int _type = Mac_address;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:58:13: ( 'mac_address' )
            // InternalComposeFileLexer.g:58:15: 'mac_address'
            {
            match("mac_address"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mac_address"

    // $ANTLR start "Parallelism"
    public final void mParallelism() throws RecognitionException {
        try {
            int _type = Parallelism;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:60:13: ( 'parallelism' )
            // InternalComposeFileLexer.g:60:15: 'parallelism'
            {
            match("parallelism"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parallelism"

    // $ANTLR start "Preferences"
    public final void mPreferences() throws RecognitionException {
        try {
            int _type = Preferences;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:62:13: ( 'preferences' )
            // InternalComposeFileLexer.g:62:15: 'preferences'
            {
            match("preferences"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Preferences"

    // $ANTLR start "Propagation"
    public final void mPropagation() throws RecognitionException {
        try {
            int _type = Propagation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:64:13: ( 'propagation' )
            // InternalComposeFileLexer.g:64:15: 'propagation'
            {
            match("propagation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Propagation"

    // $ANTLR start "Stop_signal"
    public final void mStop_signal() throws RecognitionException {
        try {
            int _type = Stop_signal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:66:13: ( 'stop_signal' )
            // InternalComposeFileLexer.g:66:15: 'stop_signal'
            {
            match("stop_signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stop_signal"

    // $ANTLR start "Userns_mode"
    public final void mUserns_mode() throws RecognitionException {
        try {
            int _type = Userns_mode;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:68:13: ( 'userns_mode' )
            // InternalComposeFileLexer.g:68:15: 'userns_mode'
            {
            match("userns_mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Userns_mode"

    // $ANTLR start "Working_dir"
    public final void mWorking_dir() throws RecognitionException {
        try {
            int _type = Working_dir;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:70:13: ( 'working_dir' )
            // InternalComposeFileLexer.g:70:15: 'working_dir'
            {
            match("working_dir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Working_dir"

    // $ANTLR start "Attachable"
    public final void mAttachable() throws RecognitionException {
        try {
            int _type = Attachable;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:72:12: ( 'attachable' )
            // InternalComposeFileLexer.g:72:14: 'attachable'
            {
            match("attachable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Attachable"

    // $ANTLR start "Cache_from"
    public final void mCache_from() throws RecognitionException {
        try {
            int _type = Cache_from;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:74:12: ( 'cache_from' )
            // InternalComposeFileLexer.g:74:14: 'cache_from'
            {
            match("cache_from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cache_from"

    // $ANTLR start "Depends_on"
    public final void mDepends_on() throws RecognitionException {
        try {
            int _type = Depends_on;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:76:12: ( 'depends_on' )
            // InternalComposeFileLexer.g:76:14: 'depends_on'
            {
            match("depends_on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Depends_on"

    // $ANTLR start "Dns_search"
    public final void mDns_search() throws RecognitionException {
        try {
            int _type = Dns_search;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:78:12: ( 'dns_search' )
            // InternalComposeFileLexer.g:78:14: 'dns_search'
            {
            match("dns_search"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dns_search"

    // $ANTLR start "Dockerfile"
    public final void mDockerfile() throws RecognitionException {
        try {
            int _type = Dockerfile;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:80:12: ( 'dockerfile' )
            // InternalComposeFileLexer.g:80:14: 'dockerfile'
            {
            match("dockerfile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dockerfile"

    // $ANTLR start "Domainname"
    public final void mDomainname() throws RecognitionException {
        try {
            int _type = Domainname;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:82:12: ( 'domainname' )
            // InternalComposeFileLexer.g:82:14: 'domainname'
            {
            match("domainname"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Domainname"

    // $ANTLR start "Entrypoint"
    public final void mEntrypoint() throws RecognitionException {
        try {
            int _type = Entrypoint;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:84:12: ( 'entrypoint' )
            // InternalComposeFileLexer.g:84:14: 'entrypoint'
            {
            match("entrypoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Entrypoint"

    // $ANTLR start "Privileged"
    public final void mPrivileged() throws RecognitionException {
        try {
            int _type = Privileged;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:86:12: ( 'privileged' )
            // InternalComposeFileLexer.g:86:14: 'privileged'
            {
            match("privileged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Privileged"

    // $ANTLR start "Stdin_open"
    public final void mStdin_open() throws RecognitionException {
        try {
            int _type = Stdin_open;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:88:12: ( 'stdin_open' )
            // InternalComposeFileLexer.g:88:14: 'stdin_open'
            {
            match("stdin_open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stdin_open"

    // $ANTLR start "Condition"
    public final void mCondition() throws RecognitionException {
        try {
            int _type = Condition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:90:11: ( 'condition' )
            // InternalComposeFileLexer.g:90:13: 'condition'
            {
            match("condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Condition"

    // $ANTLR start "Isolation"
    public final void mIsolation() throws RecognitionException {
        try {
            int _type = Isolation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:92:11: ( 'isolation' )
            // InternalComposeFileLexer.g:92:13: 'isolation'
            {
            match("isolation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Isolation"

    // $ANTLR start "Placement"
    public final void mPlacement() throws RecognitionException {
        try {
            int _type = Placement;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:94:11: ( 'placement' )
            // InternalComposeFileLexer.g:94:13: 'placement'
            {
            match("placement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Placement"

    // $ANTLR start "Published"
    public final void mPublished() throws RecognitionException {
        try {
            int _type = Published;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:96:11: ( 'published' )
            // InternalComposeFileLexer.g:96:13: 'published'
            {
            match("published"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Published"

    // $ANTLR start "Read_only"
    public final void mRead_only() throws RecognitionException {
        try {
            int _type = Read_only;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:98:11: ( 'read_only' )
            // InternalComposeFileLexer.g:98:13: 'read_only'
            {
            match("read_only"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Read_only"

    // $ANTLR start "Resources"
    public final void mResources() throws RecognitionException {
        try {
            int _type = Resources;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:100:11: ( 'resources' )
            // InternalComposeFileLexer.g:100:13: 'resources'
            {
            match("resources"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Resources"

    // $ANTLR start "Cap_drop"
    public final void mCap_drop() throws RecognitionException {
        try {
            int _type = Cap_drop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:102:10: ( 'cap_drop' )
            // InternalComposeFileLexer.g:102:12: 'cap_drop'
            {
            match("cap_drop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cap_drop"

    // $ANTLR start "Env_file"
    public final void mEnv_file() throws RecognitionException {
        try {
            int _type = Env_file;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:104:10: ( 'env_file' )
            // InternalComposeFileLexer.g:104:12: 'env_file'
            {
            match("env_file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Env_file"

    // $ANTLR start "External"
    public final void mExternal() throws RecognitionException {
        try {
            int _type = External;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:106:10: ( 'external' )
            // InternalComposeFileLexer.g:106:12: 'external'
            {
            match("external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "External"

    // $ANTLR start "Hostname"
    public final void mHostname() throws RecognitionException {
        try {
            int _type = Hostname;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:108:10: ( 'hostname' )
            // InternalComposeFileLexer.g:108:12: 'hostname'
            {
            match("hostname"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Hostname"

    // $ANTLR start "Internal"
    public final void mInternal() throws RecognitionException {
        try {
            int _type = Internal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:110:10: ( 'internal' )
            // InternalComposeFileLexer.g:110:12: 'internal'
            {
            match("internal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Internal"

    // $ANTLR start "Interval"
    public final void mInterval() throws RecognitionException {
        try {
            int _type = Interval;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:112:10: ( 'interval' )
            // InternalComposeFileLexer.g:112:12: 'interval'
            {
            match("interval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interval"

    // $ANTLR start "Networks"
    public final void mNetworks() throws RecognitionException {
        try {
            int _type = Networks;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:114:10: ( 'networks' )
            // InternalComposeFileLexer.g:114:12: 'networks'
            {
            match("networks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Networks"

    // $ANTLR start "Protocol"
    public final void mProtocol() throws RecognitionException {
        try {
            int _type = Protocol;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:116:10: ( 'protocol' )
            // InternalComposeFileLexer.g:116:12: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Protocol"

    // $ANTLR start "Registry"
    public final void mRegistry() throws RecognitionException {
        try {
            int _type = Registry;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:118:10: ( 'registry' )
            // InternalComposeFileLexer.g:118:12: 'registry'
            {
            match("registry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Registry"

    // $ANTLR start "Replicas"
    public final void mReplicas() throws RecognitionException {
        try {
            int _type = Replicas;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:120:10: ( 'replicas' )
            // InternalComposeFileLexer.g:120:12: 'replicas'
            {
            match("replicas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Replicas"

    // $ANTLR start "Services"
    public final void mServices() throws RecognitionException {
        try {
            int _type = Services;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:122:10: ( 'services' )
            // InternalComposeFileLexer.g:122:12: 'services'
            {
            match("services"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Services"

    // $ANTLR start "Shm_size"
    public final void mShm_size() throws RecognitionException {
        try {
            int _type = Shm_size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:124:10: ( 'shm_size' )
            // InternalComposeFileLexer.g:124:12: 'shm_size'
            {
            match("shm_size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Shm_size"

    // $ANTLR start "Cap_add"
    public final void mCap_add() throws RecognitionException {
        try {
            int _type = Cap_add;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:126:9: ( 'cap_add' )
            // InternalComposeFileLexer.g:126:11: 'cap_add'
            {
            match("cap_add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cap_add"

    // $ANTLR start "Command"
    public final void mCommand() throws RecognitionException {
        try {
            int _type = Command;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:128:9: ( 'command' )
            // InternalComposeFileLexer.g:128:11: 'command'
            {
            match("command"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Command"

    // $ANTLR start "Configs"
    public final void mConfigs() throws RecognitionException {
        try {
            int _type = Configs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:130:9: ( 'configs' )
            // InternalComposeFileLexer.g:130:11: 'configs'
            {
            match("configs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Configs"

    // $ANTLR start "Context"
    public final void mContext() throws RecognitionException {
        try {
            int _type = Context;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:132:9: ( 'context' )
            // InternalComposeFileLexer.g:132:11: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Context"

    // $ANTLR start "Devices"
    public final void mDevices() throws RecognitionException {
        try {
            int _type = Devices;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:134:9: ( 'devices' )
            // InternalComposeFileLexer.g:134:11: 'devices'
            {
            match("devices"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Devices"

    // $ANTLR start "Disable"
    public final void mDisable() throws RecognitionException {
        try {
            int _type = Disable;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:136:9: ( 'disable' )
            // InternalComposeFileLexer.g:136:11: 'disable'
            {
            match("disable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Disable"

    // $ANTLR start "Image"
    public final void mImage() throws RecognitionException {
        try {
            int _type = Image;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:138:7: ( 'image: ' )
            // InternalComposeFileLexer.g:138:9: 'image: '
            {
            match("image: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Image"

    // $ANTLR start "Logging"
    public final void mLogging() throws RecognitionException {
        try {
            int _type = Logging;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:140:9: ( 'logging' )
            // InternalComposeFileLexer.g:140:11: 'logging'
            {
            match("logging"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Logging"

    // $ANTLR start "Monitor"
    public final void mMonitor() throws RecognitionException {
        try {
            int _type = Monitor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:142:9: ( 'monitor' )
            // InternalComposeFileLexer.g:142:11: 'monitor'
            {
            match("monitor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Monitor"

    // $ANTLR start "Network"
    public final void mNetwork() throws RecognitionException {
        try {
            int _type = Network;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:144:9: ( 'network' )
            // InternalComposeFileLexer.g:144:11: 'network'
            {
            match("network"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Network"

    // $ANTLR start "Options"
    public final void mOptions() throws RecognitionException {
        try {
            int _type = Options;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:146:9: ( 'options' )
            // InternalComposeFileLexer.g:146:11: 'options'
            {
            match("options"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Options"

    // $ANTLR start "Restart"
    public final void mRestart() throws RecognitionException {
        try {
            int _type = Restart;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:148:9: ( 'restart' )
            // InternalComposeFileLexer.g:148:11: 'restart'
            {
            match("restart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Restart"

    // $ANTLR start "Retries"
    public final void mRetries() throws RecognitionException {
        try {
            int _type = Retries;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:150:9: ( 'retries' )
            // InternalComposeFileLexer.g:150:11: 'retries'
            {
            match("retries"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Retries"

    // $ANTLR start "Secrets"
    public final void mSecrets() throws RecognitionException {
        try {
            int _type = Secrets;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:152:9: ( 'secrets' )
            // InternalComposeFileLexer.g:152:11: 'secrets'
            {
            match("secrets"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Secrets"

    // $ANTLR start "Sysctls"
    public final void mSysctls() throws RecognitionException {
        try {
            int _type = Sysctls;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:154:9: ( 'sysctls' )
            // InternalComposeFileLexer.g:154:11: 'sysctls'
            {
            match("sysctls"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sysctls"

    // $ANTLR start "Timeout"
    public final void mTimeout() throws RecognitionException {
        try {
            int _type = Timeout;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:156:9: ( 'timeout' )
            // InternalComposeFileLexer.g:156:11: 'timeout'
            {
            match("timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Timeout"

    // $ANTLR start "Ulimits"
    public final void mUlimits() throws RecognitionException {
        try {
            int _type = Ulimits;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:158:9: ( 'ulimits' )
            // InternalComposeFileLexer.g:158:11: 'ulimits'
            {
            match("ulimits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ulimits"

    // $ANTLR start "Version"
    public final void mVersion() throws RecognitionException {
        try {
            int _type = Version;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:160:9: ( 'version' )
            // InternalComposeFileLexer.g:160:11: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Version"

    // $ANTLR start "Volumes"
    public final void mVolumes() throws RecognitionException {
        try {
            int _type = Volumes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:162:9: ( 'volumes' )
            // InternalComposeFileLexer.g:162:11: 'volumes'
            {
            match("volumes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Volumes"

    // $ANTLR start "Config"
    public final void mConfig() throws RecognitionException {
        try {
            int _type = Config;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:164:8: ( 'config' )
            // InternalComposeFileLexer.g:164:10: 'config'
            {
            match("config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Config"

    // $ANTLR start "Deploy"
    public final void mDeploy() throws RecognitionException {
        try {
            int _type = Deploy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:166:8: ( 'deploy' )
            // InternalComposeFileLexer.g:166:10: 'deploy'
            {
            match("deploy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Deploy"

    // $ANTLR start "Driver"
    public final void mDriver() throws RecognitionException {
        try {
            int _type = Driver;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:168:8: ( 'driver' )
            // InternalComposeFileLexer.g:168:10: 'driver'
            {
            match("driver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Driver"

    // $ANTLR start "Expose"
    public final void mExpose() throws RecognitionException {
        try {
            int _type = Expose;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:170:8: ( 'expose' )
            // InternalComposeFileLexer.g:170:10: 'expose'
            {
            match("expose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Expose"

    // $ANTLR start "Labels"
    public final void mLabels() throws RecognitionException {
        try {
            int _type = Labels;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:172:8: ( 'labels' )
            // InternalComposeFileLexer.g:172:10: 'labels'
            {
            match("labels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Labels"

    // $ANTLR start "Nocopy"
    public final void mNocopy() throws RecognitionException {
        try {
            int _type = Nocopy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:174:8: ( 'nocopy' )
            // InternalComposeFileLexer.g:174:10: 'nocopy'
            {
            match("nocopy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nocopy"

    // $ANTLR start "Source"
    public final void mSource() throws RecognitionException {
        try {
            int _type = Source;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:176:8: ( 'source' )
            // InternalComposeFileLexer.g:176:10: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Source"

    // $ANTLR start "Target"
    public final void mTarget() throws RecognitionException {
        try {
            int _type = Target;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:178:8: ( 'target' )
            // InternalComposeFileLexer.g:178:10: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Target"

    // $ANTLR start "Volume"
    public final void mVolume() throws RecognitionException {
        try {
            int _type = Volume;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:180:8: ( 'volume' )
            // InternalComposeFileLexer.g:180:10: 'volume'
            {
            match("volume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Volume"

    // $ANTLR start "Window"
    public final void mWindow() throws RecognitionException {
        try {
            int _type = Window;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:182:8: ( 'window' )
            // InternalComposeFileLexer.g:182:10: 'window'
            {
            match("window"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Window"

    // $ANTLR start "Build"
    public final void mBuild() throws RecognitionException {
        try {
            int _type = Build;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:184:7: ( 'build' )
            // InternalComposeFileLexer.g:184:9: 'build'
            {
            match("build"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Build"

    // $ANTLR start "Delay"
    public final void mDelay() throws RecognitionException {
        try {
            int _type = Delay;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:186:7: ( 'delay' )
            // InternalComposeFileLexer.g:186:9: 'delay'
            {
            match("delay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Delay"

    // $ANTLR start "Links"
    public final void mLinks() throws RecognitionException {
        try {
            int _type = Links;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:188:7: ( 'links' )
            // InternalComposeFileLexer.g:188:9: 'links'
            {
            match("links"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Links"

    // $ANTLR start "Order"
    public final void mOrder() throws RecognitionException {
        try {
            int _type = Order;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:190:7: ( 'order' )
            // InternalComposeFileLexer.g:190:9: 'order'
            {
            match("order"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Order"

    // $ANTLR start "Ports"
    public final void mPorts() throws RecognitionException {
        try {
            int _type = Ports;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:192:7: ( 'ports' )
            // InternalComposeFileLexer.g:192:9: 'ports'
            {
            match("ports"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ports"

    // $ANTLR start "Tmpfs"
    public final void mTmpfs() throws RecognitionException {
        try {
            int _type = Tmpfs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:194:7: ( 'tmpfs' )
            // InternalComposeFileLexer.g:194:9: 'tmpfs'
            {
            match("tmpfs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tmpfs"

    // $ANTLR start "Args"
    public final void mArgs() throws RecognitionException {
        try {
            int _type = Args;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:196:6: ( 'args' )
            // InternalComposeFileLexer.g:196:8: 'args'
            {
            match("args"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Args"

    // $ANTLR start "Bind"
    public final void mBind() throws RecognitionException {
        try {
            int _type = Bind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:198:6: ( 'bind' )
            // InternalComposeFileLexer.g:198:8: 'bind'
            {
            match("bind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bind"

    // $ANTLR start "File"
    public final void mFile() throws RecognitionException {
        try {
            int _type = File;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:200:6: ( 'file' )
            // InternalComposeFileLexer.g:200:8: 'file'
            {
            match("file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "File"

    // $ANTLR start "Hard"
    public final void mHard() throws RecognitionException {
        try {
            int _type = Hard;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:202:6: ( 'hard' )
            // InternalComposeFileLexer.g:202:8: 'hard'
            {
            match("hard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Hard"

    // $ANTLR start "Init"
    public final void mInit() throws RecognitionException {
        try {
            int _type = Init;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:204:6: ( 'init' )
            // InternalComposeFileLexer.g:204:8: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Init"

    // $ANTLR start "Ipam"
    public final void mIpam() throws RecognitionException {
        try {
            int _type = Ipam;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:206:6: ( 'ipam' )
            // InternalComposeFileLexer.g:206:8: 'ipam'
            {
            match("ipam"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ipam"

    // $ANTLR start "Mode"
    public final void mMode() throws RecognitionException {
        try {
            int _type = Mode;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:208:6: ( 'mode' )
            // InternalComposeFileLexer.g:208:8: 'mode'
            {
            match("mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mode"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:210:6: ( 'name' )
            // InternalComposeFileLexer.g:210:8: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Size"
    public final void mSize() throws RecognitionException {
        try {
            int _type = Size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:212:6: ( 'size' )
            // InternalComposeFileLexer.g:212:8: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Size"

    // $ANTLR start "Soft"
    public final void mSoft() throws RecognitionException {
        try {
            int _type = Soft;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:214:6: ( 'soft' )
            // InternalComposeFileLexer.g:214:8: 'soft'
            {
            match("soft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Soft"

    // $ANTLR start "Test"
    public final void mTest() throws RecognitionException {
        try {
            int _type = Test;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:216:6: ( 'test' )
            // InternalComposeFileLexer.g:216:8: 'test'
            {
            match("test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Test"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:218:6: ( 'type' )
            // InternalComposeFileLexer.g:218:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "User"
    public final void mUser() throws RecognitionException {
        try {
            int _type = User;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:220:6: ( 'user' )
            // InternalComposeFileLexer.g:220:8: 'user'
            {
            match("user"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "User"

    // $ANTLR start "Dns"
    public final void mDns() throws RecognitionException {
        try {
            int _type = Dns;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:222:5: ( 'dns' )
            // InternalComposeFileLexer.g:222:7: 'dns'
            {
            match("dns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dns"

    // $ANTLR start "Gid"
    public final void mGid() throws RecognitionException {
        try {
            int _type = Gid;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:224:5: ( 'gid' )
            // InternalComposeFileLexer.g:224:7: 'gid'
            {
            match("gid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Gid"

    // $ANTLR start "Ipc"
    public final void mIpc() throws RecognitionException {
        try {
            int _type = Ipc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:226:5: ( 'ipc' )
            // InternalComposeFileLexer.g:226:7: 'ipc'
            {
            match("ipc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ipc"

    // $ANTLR start "Pid"
    public final void mPid() throws RecognitionException {
        try {
            int _type = Pid;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:228:5: ( 'pid' )
            // InternalComposeFileLexer.g:228:7: 'pid'
            {
            match("pid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pid"

    // $ANTLR start "Tty"
    public final void mTty() throws RecognitionException {
        try {
            int _type = Tty;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:230:5: ( 'tty' )
            // InternalComposeFileLexer.g:230:7: 'tty'
            {
            match("tty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tty"

    // $ANTLR start "Uid"
    public final void mUid() throws RecognitionException {
        try {
            int _type = Uid;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:232:5: ( 'uid' )
            // InternalComposeFileLexer.g:232:7: 'uid'
            {
            match("uid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uid"

    // $ANTLR start "HyphenMinusSpace"
    public final void mHyphenMinusSpace() throws RecognitionException {
        try {
            int _type = HyphenMinusSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:234:18: ( '- ' )
            // InternalComposeFileLexer.g:234:20: '- '
            {
            match("- "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusSpace"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:236:7: ( ':' )
            // InternalComposeFileLexer.g:236:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:238:12: ( '=' )
            // InternalComposeFileLexer.g:238:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalComposeFileLexer.g:240:21: ()
            // InternalComposeFileLexer.g:240:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalComposeFileLexer.g:242:19: ()
            // InternalComposeFileLexer.g:242:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:244:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalComposeFileLexer.g:244:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalComposeFileLexer.g:244:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComposeFileLexer.g:244:11: '^'
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

            // InternalComposeFileLexer.g:244:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComposeFileLexer.g:
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
            	    break loop2;
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
            // InternalComposeFileLexer.g:246:10: ( ( '0' .. '9' )+ )
            // InternalComposeFileLexer.g:246:12: ( '0' .. '9' )+
            {
            // InternalComposeFileLexer.g:246:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComposeFileLexer.g:246:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalComposeFileLexer.g:248:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalComposeFileLexer.g:248:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalComposeFileLexer.g:248:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalComposeFileLexer.g:248:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalComposeFileLexer.g:248:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalComposeFileLexer.g:248:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComposeFileLexer.g:248:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalComposeFileLexer.g:248:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalComposeFileLexer.g:248:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalComposeFileLexer.g:248:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComposeFileLexer.g:248:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalComposeFileLexer.g:250:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalComposeFileLexer.g:250:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalComposeFileLexer.g:250:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComposeFileLexer.g:250:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:252:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalComposeFileLexer.g:252:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalComposeFileLexer.g:252:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComposeFileLexer.g:252:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalComposeFileLexer.g:252:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComposeFileLexer.g:252:41: ( '\\r' )? '\\n'
                    {
                    // InternalComposeFileLexer.g:252:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalComposeFileLexer.g:252:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:254:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalComposeFileLexer.g:254:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalComposeFileLexer.g:254:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComposeFileLexer.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComposeFileLexer.g:256:16: ( . )
            // InternalComposeFileLexer.g:256:18: .
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
        // InternalComposeFileLexer.g:1:8: ( Max_failure_ratio | Stop_grace_period | Credential_spec | Rollback_config | Container_name | External_links | Failure_action | Restart_policy | Cgroup_parent | Endpoint_mode | Update_config | Max_attempts | Network_mode | Security_opt | Start_period | Consistency | Constraints | Driver_opts | Enable_ipv6 | Environment | Extra_hosts | Healthcheck | Mac_address | Parallelism | Preferences | Propagation | Stop_signal | Userns_mode | Working_dir | Attachable | Cache_from | Depends_on | Dns_search | Dockerfile | Domainname | Entrypoint | Privileged | Stdin_open | Condition | Isolation | Placement | Published | Read_only | Resources | Cap_drop | Env_file | External | Hostname | Internal | Interval | Networks | Protocol | Registry | Replicas | Services | Shm_size | Cap_add | Command | Configs | Context | Devices | Disable | Image | Logging | Monitor | Network | Options | Restart | Retries | Secrets | Sysctls | Timeout | Ulimits | Version | Volumes | Config | Deploy | Driver | Expose | Labels | Nocopy | Source | Target | Volume | Window | Build | Delay | Links | Order | Ports | Tmpfs | Args | Bind | File | Hard | Init | Ipam | Mode | Name | Size | Soft | Test | Type | User | Dns | Gid | Ipc | Pid | Tty | Uid | HyphenMinusSpace | Colon | EqualsSign | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=120;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalComposeFileLexer.g:1:10: Max_failure_ratio
                {
                mMax_failure_ratio(); 

                }
                break;
            case 2 :
                // InternalComposeFileLexer.g:1:28: Stop_grace_period
                {
                mStop_grace_period(); 

                }
                break;
            case 3 :
                // InternalComposeFileLexer.g:1:46: Credential_spec
                {
                mCredential_spec(); 

                }
                break;
            case 4 :
                // InternalComposeFileLexer.g:1:62: Rollback_config
                {
                mRollback_config(); 

                }
                break;
            case 5 :
                // InternalComposeFileLexer.g:1:78: Container_name
                {
                mContainer_name(); 

                }
                break;
            case 6 :
                // InternalComposeFileLexer.g:1:93: External_links
                {
                mExternal_links(); 

                }
                break;
            case 7 :
                // InternalComposeFileLexer.g:1:108: Failure_action
                {
                mFailure_action(); 

                }
                break;
            case 8 :
                // InternalComposeFileLexer.g:1:123: Restart_policy
                {
                mRestart_policy(); 

                }
                break;
            case 9 :
                // InternalComposeFileLexer.g:1:138: Cgroup_parent
                {
                mCgroup_parent(); 

                }
                break;
            case 10 :
                // InternalComposeFileLexer.g:1:152: Endpoint_mode
                {
                mEndpoint_mode(); 

                }
                break;
            case 11 :
                // InternalComposeFileLexer.g:1:166: Update_config
                {
                mUpdate_config(); 

                }
                break;
            case 12 :
                // InternalComposeFileLexer.g:1:180: Max_attempts
                {
                mMax_attempts(); 

                }
                break;
            case 13 :
                // InternalComposeFileLexer.g:1:193: Network_mode
                {
                mNetwork_mode(); 

                }
                break;
            case 14 :
                // InternalComposeFileLexer.g:1:206: Security_opt
                {
                mSecurity_opt(); 

                }
                break;
            case 15 :
                // InternalComposeFileLexer.g:1:219: Start_period
                {
                mStart_period(); 

                }
                break;
            case 16 :
                // InternalComposeFileLexer.g:1:232: Consistency
                {
                mConsistency(); 

                }
                break;
            case 17 :
                // InternalComposeFileLexer.g:1:244: Constraints
                {
                mConstraints(); 

                }
                break;
            case 18 :
                // InternalComposeFileLexer.g:1:256: Driver_opts
                {
                mDriver_opts(); 

                }
                break;
            case 19 :
                // InternalComposeFileLexer.g:1:268: Enable_ipv6
                {
                mEnable_ipv6(); 

                }
                break;
            case 20 :
                // InternalComposeFileLexer.g:1:280: Environment
                {
                mEnvironment(); 

                }
                break;
            case 21 :
                // InternalComposeFileLexer.g:1:292: Extra_hosts
                {
                mExtra_hosts(); 

                }
                break;
            case 22 :
                // InternalComposeFileLexer.g:1:304: Healthcheck
                {
                mHealthcheck(); 

                }
                break;
            case 23 :
                // InternalComposeFileLexer.g:1:316: Mac_address
                {
                mMac_address(); 

                }
                break;
            case 24 :
                // InternalComposeFileLexer.g:1:328: Parallelism
                {
                mParallelism(); 

                }
                break;
            case 25 :
                // InternalComposeFileLexer.g:1:340: Preferences
                {
                mPreferences(); 

                }
                break;
            case 26 :
                // InternalComposeFileLexer.g:1:352: Propagation
                {
                mPropagation(); 

                }
                break;
            case 27 :
                // InternalComposeFileLexer.g:1:364: Stop_signal
                {
                mStop_signal(); 

                }
                break;
            case 28 :
                // InternalComposeFileLexer.g:1:376: Userns_mode
                {
                mUserns_mode(); 

                }
                break;
            case 29 :
                // InternalComposeFileLexer.g:1:388: Working_dir
                {
                mWorking_dir(); 

                }
                break;
            case 30 :
                // InternalComposeFileLexer.g:1:400: Attachable
                {
                mAttachable(); 

                }
                break;
            case 31 :
                // InternalComposeFileLexer.g:1:411: Cache_from
                {
                mCache_from(); 

                }
                break;
            case 32 :
                // InternalComposeFileLexer.g:1:422: Depends_on
                {
                mDepends_on(); 

                }
                break;
            case 33 :
                // InternalComposeFileLexer.g:1:433: Dns_search
                {
                mDns_search(); 

                }
                break;
            case 34 :
                // InternalComposeFileLexer.g:1:444: Dockerfile
                {
                mDockerfile(); 

                }
                break;
            case 35 :
                // InternalComposeFileLexer.g:1:455: Domainname
                {
                mDomainname(); 

                }
                break;
            case 36 :
                // InternalComposeFileLexer.g:1:466: Entrypoint
                {
                mEntrypoint(); 

                }
                break;
            case 37 :
                // InternalComposeFileLexer.g:1:477: Privileged
                {
                mPrivileged(); 

                }
                break;
            case 38 :
                // InternalComposeFileLexer.g:1:488: Stdin_open
                {
                mStdin_open(); 

                }
                break;
            case 39 :
                // InternalComposeFileLexer.g:1:499: Condition
                {
                mCondition(); 

                }
                break;
            case 40 :
                // InternalComposeFileLexer.g:1:509: Isolation
                {
                mIsolation(); 

                }
                break;
            case 41 :
                // InternalComposeFileLexer.g:1:519: Placement
                {
                mPlacement(); 

                }
                break;
            case 42 :
                // InternalComposeFileLexer.g:1:529: Published
                {
                mPublished(); 

                }
                break;
            case 43 :
                // InternalComposeFileLexer.g:1:539: Read_only
                {
                mRead_only(); 

                }
                break;
            case 44 :
                // InternalComposeFileLexer.g:1:549: Resources
                {
                mResources(); 

                }
                break;
            case 45 :
                // InternalComposeFileLexer.g:1:559: Cap_drop
                {
                mCap_drop(); 

                }
                break;
            case 46 :
                // InternalComposeFileLexer.g:1:568: Env_file
                {
                mEnv_file(); 

                }
                break;
            case 47 :
                // InternalComposeFileLexer.g:1:577: External
                {
                mExternal(); 

                }
                break;
            case 48 :
                // InternalComposeFileLexer.g:1:586: Hostname
                {
                mHostname(); 

                }
                break;
            case 49 :
                // InternalComposeFileLexer.g:1:595: Internal
                {
                mInternal(); 

                }
                break;
            case 50 :
                // InternalComposeFileLexer.g:1:604: Interval
                {
                mInterval(); 

                }
                break;
            case 51 :
                // InternalComposeFileLexer.g:1:613: Networks
                {
                mNetworks(); 

                }
                break;
            case 52 :
                // InternalComposeFileLexer.g:1:622: Protocol
                {
                mProtocol(); 

                }
                break;
            case 53 :
                // InternalComposeFileLexer.g:1:631: Registry
                {
                mRegistry(); 

                }
                break;
            case 54 :
                // InternalComposeFileLexer.g:1:640: Replicas
                {
                mReplicas(); 

                }
                break;
            case 55 :
                // InternalComposeFileLexer.g:1:649: Services
                {
                mServices(); 

                }
                break;
            case 56 :
                // InternalComposeFileLexer.g:1:658: Shm_size
                {
                mShm_size(); 

                }
                break;
            case 57 :
                // InternalComposeFileLexer.g:1:667: Cap_add
                {
                mCap_add(); 

                }
                break;
            case 58 :
                // InternalComposeFileLexer.g:1:675: Command
                {
                mCommand(); 

                }
                break;
            case 59 :
                // InternalComposeFileLexer.g:1:683: Configs
                {
                mConfigs(); 

                }
                break;
            case 60 :
                // InternalComposeFileLexer.g:1:691: Context
                {
                mContext(); 

                }
                break;
            case 61 :
                // InternalComposeFileLexer.g:1:699: Devices
                {
                mDevices(); 

                }
                break;
            case 62 :
                // InternalComposeFileLexer.g:1:707: Disable
                {
                mDisable(); 

                }
                break;
            case 63 :
                // InternalComposeFileLexer.g:1:715: Image
                {
                mImage(); 

                }
                break;
            case 64 :
                // InternalComposeFileLexer.g:1:721: Logging
                {
                mLogging(); 

                }
                break;
            case 65 :
                // InternalComposeFileLexer.g:1:729: Monitor
                {
                mMonitor(); 

                }
                break;
            case 66 :
                // InternalComposeFileLexer.g:1:737: Network
                {
                mNetwork(); 

                }
                break;
            case 67 :
                // InternalComposeFileLexer.g:1:745: Options
                {
                mOptions(); 

                }
                break;
            case 68 :
                // InternalComposeFileLexer.g:1:753: Restart
                {
                mRestart(); 

                }
                break;
            case 69 :
                // InternalComposeFileLexer.g:1:761: Retries
                {
                mRetries(); 

                }
                break;
            case 70 :
                // InternalComposeFileLexer.g:1:769: Secrets
                {
                mSecrets(); 

                }
                break;
            case 71 :
                // InternalComposeFileLexer.g:1:777: Sysctls
                {
                mSysctls(); 

                }
                break;
            case 72 :
                // InternalComposeFileLexer.g:1:785: Timeout
                {
                mTimeout(); 

                }
                break;
            case 73 :
                // InternalComposeFileLexer.g:1:793: Ulimits
                {
                mUlimits(); 

                }
                break;
            case 74 :
                // InternalComposeFileLexer.g:1:801: Version
                {
                mVersion(); 

                }
                break;
            case 75 :
                // InternalComposeFileLexer.g:1:809: Volumes
                {
                mVolumes(); 

                }
                break;
            case 76 :
                // InternalComposeFileLexer.g:1:817: Config
                {
                mConfig(); 

                }
                break;
            case 77 :
                // InternalComposeFileLexer.g:1:824: Deploy
                {
                mDeploy(); 

                }
                break;
            case 78 :
                // InternalComposeFileLexer.g:1:831: Driver
                {
                mDriver(); 

                }
                break;
            case 79 :
                // InternalComposeFileLexer.g:1:838: Expose
                {
                mExpose(); 

                }
                break;
            case 80 :
                // InternalComposeFileLexer.g:1:845: Labels
                {
                mLabels(); 

                }
                break;
            case 81 :
                // InternalComposeFileLexer.g:1:852: Nocopy
                {
                mNocopy(); 

                }
                break;
            case 82 :
                // InternalComposeFileLexer.g:1:859: Source
                {
                mSource(); 

                }
                break;
            case 83 :
                // InternalComposeFileLexer.g:1:866: Target
                {
                mTarget(); 

                }
                break;
            case 84 :
                // InternalComposeFileLexer.g:1:873: Volume
                {
                mVolume(); 

                }
                break;
            case 85 :
                // InternalComposeFileLexer.g:1:880: Window
                {
                mWindow(); 

                }
                break;
            case 86 :
                // InternalComposeFileLexer.g:1:887: Build
                {
                mBuild(); 

                }
                break;
            case 87 :
                // InternalComposeFileLexer.g:1:893: Delay
                {
                mDelay(); 

                }
                break;
            case 88 :
                // InternalComposeFileLexer.g:1:899: Links
                {
                mLinks(); 

                }
                break;
            case 89 :
                // InternalComposeFileLexer.g:1:905: Order
                {
                mOrder(); 

                }
                break;
            case 90 :
                // InternalComposeFileLexer.g:1:911: Ports
                {
                mPorts(); 

                }
                break;
            case 91 :
                // InternalComposeFileLexer.g:1:917: Tmpfs
                {
                mTmpfs(); 

                }
                break;
            case 92 :
                // InternalComposeFileLexer.g:1:923: Args
                {
                mArgs(); 

                }
                break;
            case 93 :
                // InternalComposeFileLexer.g:1:928: Bind
                {
                mBind(); 

                }
                break;
            case 94 :
                // InternalComposeFileLexer.g:1:933: File
                {
                mFile(); 

                }
                break;
            case 95 :
                // InternalComposeFileLexer.g:1:938: Hard
                {
                mHard(); 

                }
                break;
            case 96 :
                // InternalComposeFileLexer.g:1:943: Init
                {
                mInit(); 

                }
                break;
            case 97 :
                // InternalComposeFileLexer.g:1:948: Ipam
                {
                mIpam(); 

                }
                break;
            case 98 :
                // InternalComposeFileLexer.g:1:953: Mode
                {
                mMode(); 

                }
                break;
            case 99 :
                // InternalComposeFileLexer.g:1:958: Name
                {
                mName(); 

                }
                break;
            case 100 :
                // InternalComposeFileLexer.g:1:963: Size
                {
                mSize(); 

                }
                break;
            case 101 :
                // InternalComposeFileLexer.g:1:968: Soft
                {
                mSoft(); 

                }
                break;
            case 102 :
                // InternalComposeFileLexer.g:1:973: Test
                {
                mTest(); 

                }
                break;
            case 103 :
                // InternalComposeFileLexer.g:1:978: Type
                {
                mType(); 

                }
                break;
            case 104 :
                // InternalComposeFileLexer.g:1:983: User
                {
                mUser(); 

                }
                break;
            case 105 :
                // InternalComposeFileLexer.g:1:988: Dns
                {
                mDns(); 

                }
                break;
            case 106 :
                // InternalComposeFileLexer.g:1:992: Gid
                {
                mGid(); 

                }
                break;
            case 107 :
                // InternalComposeFileLexer.g:1:996: Ipc
                {
                mIpc(); 

                }
                break;
            case 108 :
                // InternalComposeFileLexer.g:1:1000: Pid
                {
                mPid(); 

                }
                break;
            case 109 :
                // InternalComposeFileLexer.g:1:1004: Tty
                {
                mTty(); 

                }
                break;
            case 110 :
                // InternalComposeFileLexer.g:1:1008: Uid
                {
                mUid(); 

                }
                break;
            case 111 :
                // InternalComposeFileLexer.g:1:1012: HyphenMinusSpace
                {
                mHyphenMinusSpace(); 

                }
                break;
            case 112 :
                // InternalComposeFileLexer.g:1:1029: Colon
                {
                mColon(); 

                }
                break;
            case 113 :
                // InternalComposeFileLexer.g:1:1035: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 114 :
                // InternalComposeFileLexer.g:1:1046: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 115 :
                // InternalComposeFileLexer.g:1:1054: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 116 :
                // InternalComposeFileLexer.g:1:1063: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 117 :
                // InternalComposeFileLexer.g:1:1075: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 118 :
                // InternalComposeFileLexer.g:1:1091: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 119 :
                // InternalComposeFileLexer.g:1:1107: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 120 :
                // InternalComposeFileLexer.g:1:1115: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\24\42\1\37\2\uffff\1\37\2\uffff\3\37\2\uffff\2\42\1\uffff\75\42\10\uffff\45\42\1\u00ea\7\42\1\u00f4\15\42\1\u0103\11\42\1\u010d\12\42\1\u0118\4\42\1\u011d\3\42\1\u0122\11\42\1\u012c\1\u012d\31\42\1\u014a\1\42\1\u014d\1\42\1\uffff\2\42\1\u0151\6\42\1\uffff\5\42\1\u015d\10\42\1\uffff\3\42\1\u0169\2\42\1\u016c\1\42\1\u016e\1\uffff\10\42\1\u0177\1\u0178\1\uffff\3\42\1\u017c\1\uffff\4\42\1\uffff\11\42\2\uffff\34\42\1\uffff\2\42\1\uffff\3\42\1\uffff\4\42\1\u01b0\6\42\1\uffff\7\42\1\u01be\3\42\1\uffff\2\42\1\uffff\1\42\1\uffff\2\42\1\u01c8\1\42\1\u01ca\2\42\1\u01cd\2\uffff\2\42\1\u01d0\1\uffff\15\42\1\u01de\6\42\1\u01e6\16\42\1\u01f5\12\42\1\u0200\1\u0202\1\42\1\u0204\1\42\1\uffff\15\42\1\uffff\1\42\1\u0214\4\42\1\uffff\1\42\1\u021a\1\uffff\1\42\1\uffff\1\42\1\u021d\1\uffff\1\42\1\u0220\1\uffff\3\42\1\u0224\5\42\1\u022a\2\42\1\u022d\1\uffff\2\42\1\u0230\3\42\1\u0234\1\uffff\1\u0235\3\42\1\u0239\1\42\1\u023c\4\42\1\u0241\2\42\1\uffff\10\42\1\u024c\1\u024f\1\uffff\1\42\1\uffff\1\42\1\uffff\1\u0252\3\42\1\u0256\12\42\1\uffff\4\42\1\u0265\1\uffff\1\u0266\1\u0267\1\uffff\1\u0268\1\u0269\1\uffff\3\42\1\uffff\5\42\1\uffff\1\u0272\1\u0273\1\uffff\2\42\1\uffff\3\42\2\uffff\2\42\1\u027b\1\uffff\2\42\1\uffff\2\42\1\u0280\1\u0281\1\uffff\1\u0283\4\42\1\u0288\4\42\1\uffff\1\42\1\u028e\1\uffff\2\42\1\uffff\3\42\1\uffff\1\42\1\u0295\3\42\1\u0299\6\42\1\u02a0\1\u02a1\5\uffff\10\42\2\uffff\4\42\1\u02ae\2\42\1\uffff\2\42\1\u02b3\1\u02b4\2\uffff\1\42\1\uffff\4\42\1\uffff\5\42\1\uffff\6\42\1\uffff\3\42\1\uffff\1\42\1\u02c9\1\u02ca\2\42\1\u02cd\2\uffff\6\42\1\u02d4\5\42\1\uffff\1\42\1\u02db\2\42\2\uffff\5\42\1\u02e3\5\42\1\u02e9\1\u02ea\1\u02eb\1\u02ec\4\42\1\u02f1\2\uffff\1\42\1\u02f3\1\uffff\2\42\1\u02f6\1\42\1\u02f8\1\42\1\uffff\3\42\1\u02fd\1\u02fe\1\42\1\uffff\3\42\1\u0303\1\42\1\u0305\1\u0306\1\uffff\2\42\1\u0309\1\42\1\u030b\4\uffff\1\u030c\1\u030d\1\u030e\1\u030f\1\uffff\1\u0310\1\uffff\1\42\1\u0312\1\uffff\1\42\1\uffff\1\u0314\1\u0315\2\42\2\uffff\4\42\1\uffff\1\42\2\uffff\2\42\1\uffff\1\u031f\6\uffff\1\42\1\uffff\1\42\2\uffff\2\42\1\u0324\3\42\1\u0328\1\42\1\u032a\1\uffff\3\42\1\u032e\1\uffff\1\42\1\u0330\1\u0331\1\uffff\1\u0332\1\uffff\2\42\1\u0335\1\uffff\1\u0336\3\uffff\2\42\2\uffff\1\u0339\1\u033a\2\uffff";
    static final String DFA12_eofS =
        "\u033b\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\145\1\141\1\145\1\156\1\141\1\151\1\141\1\145\2\141\1\151\1\162\1\155\1\141\1\160\1\141\1\145\2\151\1\40\2\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\144\1\uffff\1\141\1\143\1\155\1\163\1\146\1\172\1\145\1\155\1\162\1\143\1\154\1\141\1\160\1\141\1\151\1\154\1\144\1\145\1\151\1\144\1\164\1\143\1\155\1\151\1\154\1\163\1\143\1\163\1\141\1\163\2\162\1\145\1\141\1\142\1\162\1\144\1\162\1\156\1\164\1\147\1\157\1\151\2\141\1\147\1\142\1\156\1\164\1\144\1\155\1\162\1\160\1\163\1\160\1\171\1\162\1\154\1\151\1\156\1\144\10\uffff\2\137\1\151\1\145\1\160\1\162\1\151\1\162\1\166\1\137\1\143\1\162\1\164\1\145\2\144\1\155\1\157\1\150\1\137\1\154\1\157\1\144\1\151\1\154\1\162\1\145\1\157\1\160\1\142\1\137\1\162\1\154\1\145\1\141\1\162\1\155\1\60\1\167\1\157\1\145\1\166\1\145\1\151\1\141\1\60\1\153\2\141\1\154\1\164\1\144\1\141\1\146\1\160\1\166\1\143\1\154\1\164\1\60\1\153\1\144\1\141\1\163\1\154\1\145\1\164\1\147\1\155\1\60\1\147\1\145\1\153\1\151\2\145\1\147\1\146\1\164\1\145\1\60\1\163\1\165\1\154\1\144\1\60\2\141\1\164\1\60\1\137\1\164\1\156\1\162\1\145\1\151\1\163\1\164\1\143\2\60\1\145\1\141\3\151\1\141\1\165\1\145\1\141\1\142\1\141\1\165\1\137\1\163\2\151\1\162\1\141\1\163\1\157\1\154\1\162\1\146\1\171\1\165\1\60\1\164\1\60\1\151\1\uffff\1\157\1\160\1\60\1\145\1\156\1\157\1\143\1\171\1\163\1\uffff\1\145\1\151\1\142\1\164\1\156\1\60\1\154\1\145\1\141\1\157\1\151\1\145\1\151\1\163\1\uffff\1\151\1\157\1\143\1\60\1\141\1\162\1\60\1\145\1\60\1\uffff\1\151\1\154\1\163\1\157\1\162\1\157\1\145\1\163\2\60\1\uffff\1\151\1\155\1\144\1\60\1\uffff\1\141\1\164\1\144\1\157\1\uffff\1\147\2\137\1\151\1\164\1\143\1\151\1\154\1\145\2\uffff\1\156\1\151\1\170\1\163\1\162\1\164\1\147\1\156\1\160\1\137\1\162\1\144\1\141\2\162\1\157\1\164\1\143\1\145\1\156\1\137\1\145\1\151\1\145\1\157\1\151\1\160\1\162\1\uffff\1\145\1\163\1\uffff\1\164\1\162\1\171\1\uffff\1\162\1\144\1\171\1\145\1\60\1\145\1\162\1\156\1\154\1\150\1\141\1\uffff\1\154\1\162\1\147\1\143\1\154\1\155\1\163\1\60\1\156\1\167\1\150\1\uffff\1\164\1\156\1\uffff\1\72\1\uffff\1\156\1\163\1\60\1\156\1\60\1\165\1\164\1\60\2\uffff\1\157\1\145\1\60\1\uffff\1\151\1\164\1\144\2\162\1\151\1\160\1\157\1\164\1\163\1\145\1\172\1\163\1\60\1\164\1\156\2\164\1\141\1\151\1\60\1\144\1\137\1\146\1\157\1\144\1\143\1\164\1\143\1\156\1\162\1\141\1\163\1\141\1\150\1\60\1\156\1\137\1\156\1\154\1\157\1\145\2\137\1\163\1\153\2\60\1\163\1\60\1\163\1\uffff\1\141\1\146\1\156\1\145\1\143\1\155\2\145\1\141\1\157\2\145\1\150\1\uffff\1\147\1\60\1\141\1\151\2\141\1\uffff\1\147\1\60\1\uffff\1\163\1\uffff\1\164\1\60\1\uffff\1\156\1\60\1\uffff\1\154\1\145\1\162\1\60\1\141\1\147\1\145\1\160\1\171\1\60\1\163\1\145\1\60\1\uffff\1\151\1\145\1\60\1\145\1\151\1\157\1\60\1\uffff\1\60\1\160\1\162\1\160\1\60\1\153\1\60\1\145\1\154\1\171\1\163\1\60\1\154\1\157\1\uffff\1\164\1\151\1\155\1\145\1\151\1\137\1\143\1\155\2\60\1\uffff\1\157\1\uffff\1\137\1\uffff\1\60\1\162\1\151\1\141\1\60\1\150\1\145\1\154\1\156\1\164\1\154\1\147\1\156\1\145\1\137\1\uffff\1\142\1\157\2\154\1\60\1\uffff\2\60\1\uffff\2\60\1\uffff\1\165\1\155\1\145\1\uffff\1\143\1\156\1\162\1\145\1\137\1\uffff\2\60\1\uffff\1\141\1\162\1\uffff\3\156\2\uffff\1\141\1\157\1\60\1\uffff\1\137\1\160\1\uffff\1\163\1\171\2\60\1\uffff\1\60\1\163\1\137\1\160\1\145\1\60\1\156\1\141\2\157\1\uffff\1\155\1\60\1\uffff\1\160\1\157\1\uffff\1\143\1\154\1\155\1\uffff\1\145\1\60\1\151\1\143\1\151\1\60\1\145\1\164\2\144\1\154\1\156\2\60\5\uffff\1\162\1\160\1\163\1\145\1\141\1\151\1\156\1\157\2\uffff\1\154\1\137\1\143\1\164\1\60\1\162\1\155\1\uffff\1\143\1\157\2\60\2\uffff\1\154\1\uffff\1\164\1\155\1\166\1\156\1\uffff\1\164\1\143\1\156\1\144\1\157\1\uffff\1\164\1\156\1\150\2\145\1\143\1\uffff\1\163\1\145\1\157\1\uffff\1\144\2\60\1\151\1\145\1\60\2\uffff\1\145\1\164\1\163\1\137\1\154\1\157\1\60\1\160\1\137\1\156\1\171\1\163\1\uffff\1\145\1\60\1\157\1\154\2\uffff\1\151\1\163\1\157\1\66\1\164\1\60\1\164\1\146\1\145\1\144\1\163\4\60\1\153\1\155\1\163\1\156\1\60\2\uffff\1\162\1\60\1\uffff\1\137\1\163\1\60\1\160\1\60\1\144\1\uffff\1\164\1\163\1\141\2\60\1\156\1\uffff\1\156\1\151\1\156\1\60\1\144\2\60\1\uffff\2\151\1\60\1\145\1\60\4\uffff\4\60\1\uffff\1\60\1\uffff\1\162\1\60\1\uffff\1\145\1\uffff\2\60\1\160\1\155\2\uffff\1\164\1\146\1\143\1\153\1\uffff\1\145\2\uffff\1\157\1\147\1\uffff\1\60\6\uffff\1\141\1\uffff\1\162\2\uffff\2\145\1\60\1\151\1\171\1\163\1\60\1\156\1\60\1\uffff\1\164\1\151\1\143\1\60\1\uffff\1\147\2\60\1\uffff\1\60\1\uffff\1\151\1\157\1\60\1\uffff\1\60\3\uffff\1\157\1\144\2\uffff\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\171\1\162\1\157\1\170\1\151\1\163\1\157\1\162\1\157\1\165\1\157\1\164\1\163\1\157\1\162\1\171\1\157\1\165\1\151\1\40\2\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\170\1\156\1\uffff\1\157\1\162\1\155\1\163\1\165\1\172\1\145\1\156\1\162\1\160\1\154\2\164\1\166\1\151\1\154\1\144\1\145\1\151\1\144\1\164\1\143\1\155\1\151\1\166\1\163\1\155\1\163\1\141\1\163\2\162\1\157\1\141\1\142\1\162\1\144\1\162\1\156\1\164\1\147\1\157\1\164\1\141\1\143\1\147\1\142\1\156\1\164\1\144\1\155\1\162\1\160\1\163\1\160\1\171\1\162\1\154\1\151\1\156\1\144\10\uffff\2\137\1\151\1\145\1\160\1\162\1\151\1\165\1\166\1\137\1\143\1\162\1\164\1\145\1\144\1\164\1\155\1\157\1\150\1\137\1\154\1\164\1\144\1\151\1\154\2\162\1\157\1\160\1\142\1\151\1\162\1\154\1\145\1\141\1\162\1\155\1\172\1\167\1\157\1\145\1\166\1\154\1\151\1\141\1\172\1\153\2\141\1\154\1\164\1\144\1\141\1\146\1\164\1\166\1\143\1\154\1\164\1\172\1\153\1\144\1\141\1\163\1\154\1\145\1\164\1\147\1\155\1\172\1\147\1\145\1\153\1\151\2\145\1\147\1\146\1\164\1\145\1\172\1\163\1\165\1\154\1\144\1\172\1\146\1\141\1\164\1\172\1\137\1\164\1\156\1\162\1\145\1\151\1\163\1\164\1\143\2\172\2\145\1\164\2\151\1\141\1\165\1\145\1\144\1\142\1\141\1\165\1\137\1\163\2\151\1\162\1\141\1\163\1\157\1\154\1\162\1\146\1\171\1\165\1\172\1\164\1\172\1\151\1\uffff\1\157\1\160\1\172\1\145\1\156\1\157\1\143\1\171\1\163\1\uffff\1\145\1\151\1\142\1\164\1\156\1\172\1\154\1\145\1\141\1\157\1\151\1\145\1\151\1\163\1\uffff\1\151\1\157\1\143\1\172\1\141\1\162\1\172\1\145\1\172\1\uffff\1\151\1\154\1\163\1\157\1\162\1\157\1\145\1\163\2\172\1\uffff\1\151\1\155\1\144\1\172\1\uffff\1\141\1\164\1\144\1\157\1\uffff\1\163\2\137\1\151\1\164\1\143\1\151\1\154\1\145\2\uffff\1\156\1\151\1\170\1\163\1\162\1\164\1\147\1\156\1\160\1\137\1\162\1\144\1\141\2\162\1\157\1\164\1\143\1\145\1\156\1\137\1\145\1\151\1\145\1\157\1\151\1\160\1\162\1\uffff\1\145\1\163\1\uffff\1\164\1\162\1\171\1\uffff\1\162\1\144\1\171\1\145\1\172\1\145\1\162\1\156\1\154\1\150\1\141\1\uffff\1\154\1\162\1\147\1\143\1\154\1\155\1\163\1\172\1\156\1\167\1\150\1\uffff\1\164\1\166\1\uffff\1\72\1\uffff\1\156\1\163\1\172\1\156\1\172\1\165\1\164\1\172\2\uffff\1\157\1\145\1\172\1\uffff\1\151\1\164\1\144\2\162\1\151\1\160\1\157\1\164\1\163\1\145\1\172\1\163\1\172\1\164\1\156\2\164\1\141\1\151\1\172\1\144\1\137\1\146\1\157\1\144\1\143\1\164\1\143\1\156\1\162\1\141\1\163\1\141\1\150\1\172\1\156\1\137\1\156\1\154\1\157\1\145\2\137\1\163\1\153\2\172\1\163\1\172\1\163\1\uffff\1\141\1\146\1\156\1\145\1\143\1\155\2\145\1\141\1\157\2\145\1\150\1\uffff\1\147\1\172\1\141\1\151\2\141\1\uffff\1\147\1\172\1\uffff\1\163\1\uffff\1\164\1\172\1\uffff\1\156\1\172\1\uffff\1\154\1\145\1\162\1\172\1\141\1\147\1\145\1\160\1\171\1\172\1\163\1\145\1\172\1\uffff\1\151\1\145\1\172\1\145\1\151\1\157\1\172\1\uffff\1\172\1\160\1\162\1\160\1\172\1\153\1\172\1\145\1\154\1\171\1\163\1\172\1\154\1\157\1\uffff\1\164\1\151\1\155\1\145\1\151\1\137\1\143\1\155\2\172\1\uffff\1\157\1\uffff\1\137\1\uffff\1\172\1\162\1\151\1\141\1\172\1\150\1\145\1\154\1\156\1\164\1\154\1\147\1\156\1\145\1\137\1\uffff\1\142\1\157\2\154\1\172\1\uffff\2\172\1\uffff\2\172\1\uffff\1\165\1\155\1\145\1\uffff\1\143\1\156\1\162\1\145\1\137\1\uffff\2\172\1\uffff\1\141\1\162\1\uffff\3\156\2\uffff\1\141\1\157\1\172\1\uffff\1\137\1\160\1\uffff\1\163\1\171\2\172\1\uffff\1\172\1\163\1\137\1\160\1\145\1\172\1\156\1\141\2\157\1\uffff\1\155\1\172\1\uffff\1\160\1\157\1\uffff\1\143\1\154\1\155\1\uffff\1\145\1\172\1\151\1\143\1\151\1\172\1\145\1\164\2\144\1\154\1\156\2\172\5\uffff\1\162\1\160\1\163\1\145\1\141\1\151\1\156\1\157\2\uffff\1\154\1\137\1\143\1\164\1\172\1\162\1\155\1\uffff\1\143\1\157\2\172\2\uffff\1\154\1\uffff\1\164\1\155\1\166\1\156\1\uffff\1\164\1\143\1\156\1\144\1\157\1\uffff\1\164\1\156\1\150\2\145\1\143\1\uffff\1\163\1\145\1\157\1\uffff\1\144\2\172\1\151\1\145\1\172\2\uffff\1\145\1\164\1\163\1\137\1\154\1\157\1\172\1\160\1\137\1\156\1\171\1\163\1\uffff\1\145\1\172\1\157\1\154\2\uffff\1\151\1\163\1\157\1\66\1\164\1\172\1\164\1\146\1\145\1\144\1\163\4\172\1\153\1\155\1\163\1\156\1\172\2\uffff\1\162\1\172\1\uffff\1\137\1\163\1\172\1\160\1\172\1\144\1\uffff\1\164\1\163\1\141\2\172\1\156\1\uffff\1\156\1\151\1\156\1\172\1\144\2\172\1\uffff\2\151\1\172\1\145\1\172\4\uffff\4\172\1\uffff\1\172\1\uffff\1\162\1\172\1\uffff\1\145\1\uffff\2\172\1\160\1\155\2\uffff\1\164\1\146\1\143\1\153\1\uffff\1\145\2\uffff\1\157\1\147\1\uffff\1\172\6\uffff\1\141\1\uffff\1\162\2\uffff\2\145\1\172\1\151\1\171\1\163\1\172\1\156\1\172\1\uffff\1\164\1\151\1\143\1\172\1\uffff\1\147\2\172\1\uffff\1\172\1\uffff\1\151\1\157\1\172\1\uffff\1\172\3\uffff\1\157\1\144\2\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\26\uffff\1\160\1\161\1\uffff\1\162\1\163\3\uffff\1\167\1\170\2\uffff\1\162\75\uffff\1\157\1\160\1\161\1\163\1\164\1\165\1\166\1\167\u0082\uffff\1\156\11\uffff\1\151\16\uffff\1\154\11\uffff\1\153\12\uffff\1\155\4\uffff\1\152\4\uffff\1\142\11\uffff\1\145\1\144\34\uffff\1\136\2\uffff\1\150\3\uffff\1\143\13\uffff\1\137\13\uffff\1\134\2\uffff\1\140\1\uffff\1\141\10\uffff\1\146\1\147\3\uffff\1\135\63\uffff\1\127\15\uffff\1\132\6\uffff\1\77\2\uffff\1\130\1\uffff\1\131\2\uffff\1\133\2\uffff\1\126\15\uffff\1\122\7\uffff\1\114\16\uffff\1\117\12\uffff\1\121\1\uffff\1\116\1\uffff\1\115\17\uffff\1\125\5\uffff\1\120\2\uffff\1\123\2\uffff\1\124\3\uffff\1\101\5\uffff\1\106\2\uffff\1\107\2\uffff\1\74\3\uffff\1\73\1\72\3\uffff\1\71\2\uffff\1\104\4\uffff\1\105\12\uffff\1\111\2\uffff\1\102\2\uffff\1\75\3\uffff\1\76\16\uffff\1\100\1\103\1\110\1\112\1\113\10\uffff\1\67\1\70\7\uffff\1\55\4\uffff\1\65\1\66\1\uffff\1\57\4\uffff\1\56\5\uffff\1\63\6\uffff\1\60\3\uffff\1\64\6\uffff\1\61\1\62\14\uffff\1\47\4\uffff\1\54\1\53\24\uffff\1\51\1\52\2\uffff\1\50\6\uffff\1\46\6\uffff\1\37\7\uffff\1\44\5\uffff\1\40\1\41\1\42\1\43\4\uffff\1\45\1\uffff\1\36\2\uffff\1\27\1\uffff\1\33\4\uffff\1\20\1\21\4\uffff\1\25\1\uffff\1\23\1\24\2\uffff\1\34\1\uffff\1\22\1\26\1\30\1\31\1\32\1\35\1\uffff\1\14\1\uffff\1\17\1\16\11\uffff\1\15\4\uffff\1\11\3\uffff\1\12\1\uffff\1\13\3\uffff\1\5\1\uffff\1\10\1\6\1\7\2\uffff\1\3\1\4\2\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\1\0\32\uffff\1\1\1\2\u031e\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\5\37\1\25\1\37\1\35\12\32\1\26\2\37\1\27\3\37\32\31\3\37\1\30\1\31\1\37\1\15\1\23\1\3\1\11\1\5\1\6\1\24\1\12\1\16\2\31\1\17\1\1\1\10\1\20\1\13\1\31\1\4\1\2\1\21\1\7\1\22\1\14\3\31\uff85\37",
            "\1\40\15\uffff\1\41",
            "\1\44\2\uffff\1\45\1\50\5\uffff\1\47\4\uffff\1\43\4\uffff\1\46",
            "\1\54\5\uffff\1\53\7\uffff\1\52\2\uffff\1\51",
            "\1\56\11\uffff\1\55",
            "\1\60\11\uffff\1\57",
            "\1\61\7\uffff\1\62",
            "\1\66\2\uffff\1\65\3\uffff\1\63\2\uffff\1\64",
            "\1\71\3\uffff\1\67\11\uffff\1\70",
            "\1\73\3\uffff\1\76\4\uffff\1\74\1\75\2\uffff\1\72",
            "\1\101\3\uffff\1\77\11\uffff\1\100",
            "\1\102\7\uffff\1\107\2\uffff\1\104\2\uffff\1\106\2\uffff\1\103\2\uffff\1\105",
            "\1\111\5\uffff\1\110",
            "\1\113\1\uffff\1\112",
            "\1\116\1\115\1\uffff\1\117\2\uffff\1\114",
            "\1\121\7\uffff\1\122\5\uffff\1\120",
            "\1\123\1\uffff\1\124",
            "\1\126\3\uffff\1\130\3\uffff\1\125\3\uffff\1\127\6\uffff\1\132\4\uffff\1\131",
            "\1\133\11\uffff\1\134",
            "\1\136\13\uffff\1\135",
            "\1\137",
            "\1\140",
            "",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\144",
            "\0\144",
            "\1\145\4\uffff\1\146",
            "",
            "",
            "\1\151\24\uffff\1\150",
            "\1\153\11\uffff\1\152",
            "",
            "\1\155\2\uffff\1\156\12\uffff\1\154",
            "\1\157\16\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\164\16\uffff\1\163",
            "\1\165",
            "\1\166",
            "\1\170\1\167",
            "\1\171",
            "\1\172\14\uffff\1\173",
            "\1\174",
            "\1\176\5\uffff\1\177\10\uffff\1\u0080\2\uffff\1\175\1\u0081",
            "\1\u0083\3\uffff\1\u0082",
            "\1\u0085\2\uffff\1\u0084\17\uffff\1\u0087\1\uffff\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0094\3\uffff\1\u0092\5\uffff\1\u0093",
            "\1\u0095",
            "\1\u0096\11\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\3\uffff\1\u009f\5\uffff\1\u009e",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00aa\12\uffff\1\u00a9",
            "\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c6\2\uffff\1\u00c5",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00d0\1\uffff\1\u00d1\14\uffff\1\u00cf\1\u00ce",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d8\4\uffff\1\u00d7",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd\14\uffff\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e3\11\uffff\1\u00e2",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef\6\uffff\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\12\42\7\uffff\32\42\4\uffff\1\u00f3\1\uffff\32\42",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd\3\uffff\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u011f\4\uffff\1\u011e",
            "\1\u0120",
            "\1\u0121",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u012e",
            "\1\u012f\3\uffff\1\u0130",
            "\1\u0131\12\uffff\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0139\2\uffff\1\u0138",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u014b",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u014c\14\42",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u016a",
            "\1\u016b",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u016d",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "",
            "\1\u0181\13\uffff\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "",
            "",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "\1\u01c3\7\uffff\1\u01c4",
            "",
            "\1\u01c5",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u01c9",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u01cb",
            "\1\u01cc",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u01ce",
            "\1\u01cf",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u01e5\7\42",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\u0201\1\uffff\32\42",
            "\1\u0203",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0205",
            "",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "",
            "\1\u0213",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "",
            "\1\u0219",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u021b",
            "",
            "\1\u021c",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u021e",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u021f\7\42",
            "",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u022b",
            "\1\u022c",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u022e",
            "\1\u022f",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u023a",
            "\12\42\7\uffff\32\42\4\uffff\1\u023b\1\uffff\32\42",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0242",
            "\1\u0243",
            "",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\u024d\1\uffff\22\42\1\u024e\7\42",
            "",
            "\1\u0250",
            "",
            "\1\u0251",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0274",
            "\1\u0275",
            "",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "",
            "",
            "\1\u0279",
            "\1\u027a",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u027c",
            "\1\u027d",
            "",
            "\1\u027e",
            "\1\u027f",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\u0282\1\uffff\32\42",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "",
            "\1\u028d",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u028f",
            "\1\u0290",
            "",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "",
            "\1\u0294",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "",
            "",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u02af",
            "\1\u02b0",
            "",
            "\1\u02b1",
            "\1\u02b2",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u02b5",
            "",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "",
            "\1\u02c8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u02cb",
            "\1\u02cc",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "",
            "\1\u02da",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u02dc",
            "\1\u02dd",
            "",
            "",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u02f2",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u02f4",
            "\1\u02f5",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u02f7",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u02f9",
            "",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u02ff",
            "",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0304",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0307",
            "\1\u0308",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u030a",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0311",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0313",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0316",
            "\1\u0317",
            "",
            "",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "",
            "\1\u031c",
            "",
            "",
            "\1\u031d",
            "\1\u031e",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0320",
            "",
            "\1\u0321",
            "",
            "",
            "\1\u0322",
            "\1\u0323",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0329",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u032f",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0333",
            "\1\u0334",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\u0337",
            "\1\u0338",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Max_failure_ratio | Stop_grace_period | Credential_spec | Rollback_config | Container_name | External_links | Failure_action | Restart_policy | Cgroup_parent | Endpoint_mode | Update_config | Max_attempts | Network_mode | Security_opt | Start_period | Consistency | Constraints | Driver_opts | Enable_ipv6 | Environment | Extra_hosts | Healthcheck | Mac_address | Parallelism | Preferences | Propagation | Stop_signal | Userns_mode | Working_dir | Attachable | Cache_from | Depends_on | Dns_search | Dockerfile | Domainname | Entrypoint | Privileged | Stdin_open | Condition | Isolation | Placement | Published | Read_only | Resources | Cap_drop | Env_file | External | Hostname | Internal | Interval | Networks | Protocol | Registry | Replicas | Services | Shm_size | Cap_add | Command | Configs | Context | Devices | Disable | Image | Logging | Monitor | Network | Options | Restart | Retries | Secrets | Sysctls | Timeout | Ulimits | Version | Volumes | Config | Deploy | Driver | Expose | Labels | Nocopy | Source | Target | Volume | Window | Build | Delay | Links | Order | Ports | Tmpfs | Args | Bind | File | Hard | Init | Ipam | Mode | Name | Size | Soft | Test | Type | User | Dns | Gid | Ipc | Pid | Tty | Uid | HyphenMinusSpace | Colon | EqualsSign | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='m') ) {s = 1;}

                        else if ( (LA12_0=='s') ) {s = 2;}

                        else if ( (LA12_0=='c') ) {s = 3;}

                        else if ( (LA12_0=='r') ) {s = 4;}

                        else if ( (LA12_0=='e') ) {s = 5;}

                        else if ( (LA12_0=='f') ) {s = 6;}

                        else if ( (LA12_0=='u') ) {s = 7;}

                        else if ( (LA12_0=='n') ) {s = 8;}

                        else if ( (LA12_0=='d') ) {s = 9;}

                        else if ( (LA12_0=='h') ) {s = 10;}

                        else if ( (LA12_0=='p') ) {s = 11;}

                        else if ( (LA12_0=='w') ) {s = 12;}

                        else if ( (LA12_0=='a') ) {s = 13;}

                        else if ( (LA12_0=='i') ) {s = 14;}

                        else if ( (LA12_0=='l') ) {s = 15;}

                        else if ( (LA12_0=='o') ) {s = 16;}

                        else if ( (LA12_0=='t') ) {s = 17;}

                        else if ( (LA12_0=='v') ) {s = 18;}

                        else if ( (LA12_0=='b') ) {s = 19;}

                        else if ( (LA12_0=='g') ) {s = 20;}

                        else if ( (LA12_0=='-') ) {s = 21;}

                        else if ( (LA12_0==':') ) {s = 22;}

                        else if ( (LA12_0=='=') ) {s = 23;}

                        else if ( (LA12_0=='^') ) {s = 24;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='j' && LA12_0<='k')||LA12_0=='q'||(LA12_0>='x' && LA12_0<='z')) ) {s = 25;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 26;}

                        else if ( (LA12_0=='\"') ) {s = 27;}

                        else if ( (LA12_0=='\'') ) {s = 28;}

                        else if ( (LA12_0=='/') ) {s = 29;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 30;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=',')||LA12_0=='.'||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_27 = input.LA(1);

                        s = -1;
                        if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFF')) ) {s = 100;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_28 = input.LA(1);

                        s = -1;
                        if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFF')) ) {s = 100;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}