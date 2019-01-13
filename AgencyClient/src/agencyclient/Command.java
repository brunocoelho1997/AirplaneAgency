package agencyclient;

public class Command {
    
    public static final String EXIT = "exit";
    public static final String HELP = "help";
    public static final String CLS = "cls";
    
    //users
    public static final String SIGNIN = "signin";
    public static final String SIGNUP = "signup";
    public static final String LOGOUT = "logout";
    public static final String GUEST = "asguest";
    public static final String ACCEPTUSER = "acceptuser";
    public static final String DEPOSITTOACCOUNT = "deposittoaccount";
    public static final String FINDALLUSERS = "findallusers";
    
    //planes
    public static final String FINDALLPLANES = "findallplanes";
    public static final String ADDPLANE = "addplane";
    public static final String EDITPLANE = "editplane";
    public static final String REMOVEPLANE = "removeplane";
    
    //airlines
    public static final String FINDALLAIRLINES = "findallairlines";
    public static final String ADDAIRLINE = "addairline";
    public static final String EDITAIRLINE = "editairline";
    public static final String REMOVEAIRLINE = "removeairline";
    
    //places
    public static final String FINDALLPLACES = "findallplaces";
    public static final String ADDPLACE = "addplace";
    public static final String EDITPLACE = "editplace";
    public static final String REMOVEPLACE = "removeplace";
    
    //places feedback
    public static final String ADDPLACEFEEDBACK = "addplacefeedback";
    public static final String EDITPLACEFEEDBACK = "editplacefeedback";
    public static final String REMOVEPLACEFEEDBACK = "removeplacefeedback";
    
    //trip
    public static final String FINDALLTRIPS = "findalltrips";
    public static final String ADDTRIP = "addtrip";
    public static final String EDITTRIP = "edittrip";
    public static final String REMOVETRIP = "removetrip";
    public static final String CANCELTRIP = "canceltrip";
    public static final String SETTRIPDONE = "settripdone";
    
    //trips feedback
    public static final String ADDTRIPFEEDBACK = "addtripfeedback";
    public static final String EDITTRIPFEEDBACK = "edittripfeedback";
    public static final String REMOVETRIPFEEDBACK = "removetripfeedback";
    
    //date
    public static final String GETACTUALDATE = "getactualdate";
    public static final String SETACTUALDATE = "setactualdate";
    public static final String SETDURATIONTIMER = "setdurationtimer";
    public static final String GETTIMERINFORMATION = "gettimerinformation";
    
    // logs
    public static final String GET_LOGS = "getlogs";
    
    //purchases
    public static final String FINDALLPURCHASES = "findallpurchases";
    public static final String FINDALLPURCHASESOFUSER = "findallpurchasesofuser";
    public static final String GETACTUALPURCHASE = "getactualpurchase";
    public static final String BUYSEATSTOTRIP = "buyseatstotrip";
    public static final String EDITACTUALPURCHASE = "editactualpurchase";
    public static final String REMOVESEATSOFACTUALPURCHASE = "removeseatsofactualpurchase";
    public static final String REMOVEACTUALPURCHASE = "removeactualpurchase";
    public static final String FINISHACTUALPURCHASE = "finishactualpurchase";
    
    //auctioned seats
    public static final String FINDALLAUCTIONEDSEATS = "findallauctionedseats";
    public static final String BIDAUCTIONEDSEAT = "bidauctionedseat";
    public static final String GETMYBIDS = "getmybids";
    public static final String REMOVEMYBID = "removemybid";
    public static final String REMOVEBID = "removebid";

    

}
