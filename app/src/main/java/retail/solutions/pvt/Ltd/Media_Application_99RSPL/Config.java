package retail.solutions.pvt.Ltd.Media_Application_99RSPL;

/**
 * Created by Aman Marji on 02-06-2016.
 */
public class Config {
    public static final String LINK_JSON = "http://52.76.28.14/Android/json1.php?STORE_ID=";
    public static final String Link_Update = "http://52.76.28.14/Android/update.php";
    public static final String Link_Download = "http://52.76.28.14/Android/json.php";
    public static final String Link_Upload = "http://52.76.28.14/Android/retail_videodata.php";
    public static final String Link_Upload_Media_Click = "http://52.76.28.14/Android/retail_media_click.php";




    /***************************************RETAIL VIDEO DATA INSERT DATA INTO DATABASE***********************************************/

    public static final String MEDIACLICK_ADPLAYID= "ad_play";
    public static final String MEDIACLICK_STOREMEDIAID= "media_store_id";
    public static final String MEDIACLICK_NUMBEROFCLICK= "number_of_click";
    public static final String MEDIACLICK_MOBILENUMBER= "mobile_number";



    /***************************************RETAIL MEDIA CLICK DATA INSERT DATA INTO DATABASE***********************************************/

    public static final String VIDEODATA_ADPLAY= "ad_play";
    public static final String VIDEODATA_STOREID= "store_id";
    public static final String VIDEODATA_MEDIAID= "store_media_id";
    public static final String VIDEODATA_VIDEONAME= "video_name";
    public static final String VIDEODATA_STARTDATE= "start_date";
    public static final String VIDEODATA_ENDDATE= "end_date";
    public static final String VIDEODATA_STARTTIME= "start_time";
    public static final String VIDEODATA_ENDTIME= "end_time";







    //====================================JSON TAGS FOR TABLE NAME=====================================================================//

    public static final String TAG_ARRAY_TABLE_ONE = "ret_ticket_install_register";
    public static final String TAG_ARRAY_TABLE_TWO = "retail_ad_blinkinglogo ";
    public static final String TAG_ARRAY_TABLE_THREE = "retail_ad_blinkinglogo_cont";
    public static final String TAG_ARRAY_TABLE_FOUR = "retail_ad_store_main";
    public static final String TAG_ARRAY_TABLE_FIVE = "retail_ad_store_main_cont";
    public static final String TAG_ARRAY_TABLE_SIX = "retail_ad_ticker";
    public static final String TAG_ARRAY_TABLE_SEVEN = "retail_ad_ticker_cont";
    public static final String TAG_ARRAY_TABLE_EIGHT = "retail_card_define";
    public static final String TAG_ARRAY_TABLE_NINE = "retail_card_define_mfg";
    public static final String TAG_ARRAY_TABLE_TEN = "retail_comp_btl";
    public static final String TAG_ARRAY_TABLE_ELEVEN = "retail_cust";
    public static final String TAG_ARRAY_TABLE_TWELVE = "retail_cust_loyalty";
    public static final String TAG_ARRAY_TABLE_THIRTEEN = "retail_inventory";
    public static final String TAG_ARRAY_TABLE_FOURTEEN = "retail_media";
    public static final String TAG_ARRAY_TABLE_FIFTEEN = "retail_mfg_btl";
    public static final String TAG_ARRAY_TABLE_SIXTEEN = "retail_store";
    public static final String TAG_ARRAY_TABLE_SEVENTEEN = "retail_store_maint";
    public static final String TAG_ARRAY_TABLE_EIGHTEEN = "retail_store_prod";
    public static final String TAG_ARRAY_TABLE_NINETEEN = "retail_store_prod_local_cpg";
    public static final String TAG_ARRAY_TABLE_TWENTY = "retail_store_reports";
    public static final String TAG_ARRAY_TABLE_21 = "retail_store_vend_reject";
    public static final String TAG_ARRAY_TABLE_22 = "retail_store_vendor";
    public static final String TAG_ARRAY_TABLE_23 = "retail_str_dstr";
    public static final String TAG_ARRAY_TABLE_24 = "retail_str_grn_detail";
    public static final String TAG_ARRAY_TABLE_25 = "retail_str_grn_master";
    public static final String TAG_ARRAY_TABLE_26 = "retail_str_po_detail";
    public static final String TAG_ARRAY_TABLE_27 = "retail_str_po_master";
    public static final String TAG_ARRAY_TABLE_28 = "retail_str_sales_detail";
    public static final String TAG_ARRAY_TABLE_29 = "retail_str_sales_details_return";
    public static final String TAG_ARRAY_TABLE_30 = "retail_str_sales_master_return";
    public static final String TAG_ARRAY_TABLE_31 = "retail_str_stock_master";
    public static final String TAG_ARRAY_TABLE_32 = "retail_str_vendor_detail_return";
    public static final String TAG_ARRAY_TABLE_33 = "retail_str_vendor_master_return";
    public static final String TAG_ARRAY_TABLE_34 = "retail_tax";
    public static final String TAG_ARRAY_TABLE_35 = "retail_top_product";
    public static final String TAG_ARRAY_TABLE_36 = "retail_vend_dstr";
    public static final String TAG_ARRAY_TABLE_37 = "retail_videodata";
    public static final String TAG_ARRAY_TABLE_38 = "retail_videodata_cont";
    public static final String TAG_ARRAY_TABLE_39 = "retail_videodata_cont1";
    public static final String TAG_ARRAY_TABLE_40 = "rule_defination";
    public static final String TAG_ARRAY_TABLE_41 = "tmp_retail_pay_desc";
    public static final String TAG_ARRAY_TABLE_42 = "ad_ticker_main";
    public static final String TAG_ARRAY_TABLE_43 = "bank_details";
    public static final String TAG_ARRAY_TABLE_44 = "retail_store_prod_com";
    public static final String TAG_ARRAY_TABLE_45 = "retail_store_prod_cpg";
    public static final String TAG_ARRAY_TABLE_46 = "retail_store_prod_local";
    public static final String TAG_ARRAY_TABLE_57 = "retail_media_click";

//================================================TAG ARRAY==========================================================================//

    public static final String TAG_ARRAY =     "Ret_ticket_install_register";
    public static final String TAG_ARRAY_2 =   "Retail_ad_blinkinglogo";
    public static final String TAG_ARRAY_6 =   "Retail_ad_ticker";
    public static final String TAG_ARRAY_8 =   "Retail_card_define";
    public static final String TAG_ARRAY_10 =  "Retail_comp_btl";
    public static final String TAG_ARRAY_11 =  "Retail_cust";
    public static final String TAG_ARRAY_12 =  "Retail_cust_loyalty";
    public static final String TAG_ARRAY_13 =  "Retail_inventory";
    public static final String TAG_ARRAY_15 =  "Retail_mfg_btl";
    public static final String TAG_ARRAY_16 =  "Retail_store";
    public static final String TAG_ARRAY_17  = "Retail_store_maint";
    public static final String TAG_ARRAY_18 =  "Retail_store_prod";
    public static final String TAG_ARRAY_19 =  "Retail_store_prod_local_cpg";
    public static final String TAG_ARRAY_22 =  "retail_store_vendor";
    public static final String TAG_ARRAY_23 =  "Retail_str_dstr";
    public static final String TAG_ARRAY_35 =  "Retail_top_product";
    public static final String TAG_ARRAY_36 =  "Retail_vend_dstr";
    public static final String TAG_ARRAY_45 =  "retail_store_prod_cpg";
    public static final String TAG_ARRAY_46 =  "Retail_store_prod_local";

    //=====================================TAg Fields OF Retail_Cust==================================================================//


    public static final String RETAIL_CUST_TAG_NAME = "Name";
    public static final String RETAIL_CUST_TAG_EMAIL = "E_mail";
    public static final String RETAIL_CUST_TAG_PHONE = "mobile_no";
    public static final String RETAIL_CUST_TAG_LAST_UPDATE = "lastupdate";
    public static final String RETAIL_CUST_TAG_PASSWORD = "Password";
    public static final String RETAIL_CUST_TAG_CREDIT_CUST = "credit_cust";
    public static final String RETAIL_CUST_TAG_ID = "cust_Id";
    public static final String RETAIL_CUST_TAG_S_FLAG = "s_Flag";


    //------------------------------------------Tags Of Retail_Dstr_Str--------------------------------------------------------//

    public static final String TAG_FIELD = "Field";
    public static final String RETAIL_DSTR_TAG_DSTR_STORE_ID = "store_Id";
    public static final String RETAIL_DSTR_TAG_DSTR_ID = "dstr_Id";
    public static final String RETAIL_DSTR_TAG_DSTR_NM = "dstr_Nm";
    public static final String RETAIL_DSTR_TAG_DSTR_cntct = "dstr_Cntct_Nm";
    public static final String RETAIL_DSTR_TAG_ADDRESS1 = "add_1";
    public static final String RETAIL_DSTR_TAG_CITY = "Cty";
    public static final String RETAIL_DSTR_TAG_CTR_NM = "ctr_Nm";
    public static final String RETAIL_DSTR_TAG_ZIP = "zip";
    public static final String RETAIL_DSTR_TAG_tele = "tele";
    public static final String RETAIL_DSTR_TAG_Mobile = "Mobile_N";
    public static final String RETAIL_DSTR_TAG_dstr_inv = "dstr_Inv";
    public static final String RETAIL_DSTR_TAG_active = "Active_t";
    public static final String RETAIL_DSTR_TAG_email = "Email_A";
    public static final String RETAIL_DSTR_TAG_last_update = "last_Update";
    public static final String RETAIL_DSTR_TAG_user = "user";
    public static final String RETAIL_DSTR_TAG_flag = "s_Flag";


    //============================================Tags Of ret_ticket_install_register==================================================//

    public static final String RET_TICKET_INSTALL_REGISTER_TICKET_ID = "ticket_Id";
    public static final String RET_TICKET_INSTALL_REGISTER_STORE_ID = "store_Id";
    public static final String RET_TICKET_INSTALL_REGISTER_IMEI_NUMBER = "IMEI_number";
    public static final String RET_TICKET_INSTALL_REGISTER_IMEI_NUMBER2 = "IMEI_number2";
    public static final String RET_TICKET_INSTALL_REGISTER_SIM1 = "SIm1";
    public static final String RET_TICKET_INSTALL_REGISTER_SIM2 = "SIm2";
    public static final String RET_TICKET_INSTALL_REGISTER_SCANNER1 = "scanner1";
    public static final String RET_TICKET_INSTALL_REGISTER_SCANNER2 = "scanner2";
    public static final String RET_TICKET_INSTALL_REGISTER_WALLET1 = "wallet1";
    public static final String RET_TICKET_INSTALL_REGISTER_WALLET2 = "wallet2";
    public static final String RET_TICKET_INSTALL_REGISTER_OTHER = "other";
    public static final String RET_TICKET_INSTALL_REGISTER_TEAM_MEMB = "Teammemb";
    public static final String RET_TICKET_INSTALL_REGISTER_START_DATE = "Startdate";
    public static final String RET_TICKET_INSTALL_REGISTER_END_DATE = "Enddate";
    public static final String RET_TICKET_INSTALL_REGISTER_PREFIX = "prefix";
    public static final String RET_TICKET_INSTALL_REGISTER_USER = "user";
    public static final String RET_TICKET_INSTALL_REGISTER_LAST_UPDATE = "lastupdate";
    public static final String RET_TICKET_INSTALL_REGISTER_S_FLAG = "s_Flag";

    public static final String RET_TICKET_STORE_ID = "STORE_ID";


    //==========================================retail_store_prod_local_cpg========================================================//
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_STORE_ID = "Store_id";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_PROD_ID = "prod_Id";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_PROD_NAME = "Prod_nm";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_BARCODE = "barcode";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_MRP = "mrp";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_S_PRICE = "s_price";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_P_PRICE = "P_price";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_TAX_ID = "tax_Id";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_INTERNET_PRICE = "Internet_price";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_IS_PROD_REL_INT = "Is_Prod_Rel_int";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_ACTIVE = "active";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_PROFIT_MARGIN = "Profit_margin";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_LAST_UPDATE = "lastupdate";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_S_FLAG = "s_Flag";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_IND_NM = "Ind_nm";
    public static final String RETAIL_STORE_PROD_LOCAL_CPG_CONV_FACT = "conv_Fact";


    //===============================================Retail Ad Blinking Logo==========================================================//

    public static final String RETAIL_AD_BLINKING_LOGO_STORE_ID = "store_Id";
    public static final String RETAIL_AD_BLINKING_LOGO_AD_MAIN_ID = "Ad_main_Id";
    public static final String RETAIL_AD_BLINKING_LOGO_USER = "user";
    public static final String RETAIL_AD_BLINKING_LOGO_STORE_MEDIA_ID = "store_Media_Id";
    public static final String RETAIL_AD_BLINKING_LOGO_AD_DESC = "Ad_desc";
    public static final String RETAIL_AD_BLINKING_LOGO_AD_FILE = "Ad_file";
    public static final String RETAIL_AD_BLINKING_LOGO_AD_STRT_DT = "Ad_Strt_dt";
    public static final String RETAIL_AD_BLINKING_LOGO_AD_END_DT = "Ad_End_dt";
    public static final String RETAIL_AD_BLINKING_LOGO_MFG_ID = "Mfg_id";
    public static final String RETAIL_AD_BLINKING_LOGO_COMP_ID = "comp_Id";
    public static final String RETAIL_AD_BLINKING_LOGO_PROD_ID = "prod_Id";
    public static final String RETAIL_AD_BLINKING_LOGO_IND_ID = "Ind_id";
    public static final String RETAIL_AD_BLINKING_LOGO_AD_REVENUE = "Ad_revenue";
    public static final String RETAIL_AD_BLINKING_LOGO_AD_CST_SLB1 = "Ad_Cst_slb1";
    public static final String RETAIL_AD_BLINKING_LOGO_AD_CST_SLB2 = "Ad_Cst_slb2";
    public static final String RETAIL_AD_BLINKING_LOGO_AD_CST_SLB3 = "Ad_Cst_slb3";
    public static final String RETAIL_AD_BLINKING_LOGO_STATUS = "status";
    public static final String RETAIL_AD_BLINKING_LOGO_ACTIVE = "active";
    public static final String RETAIL_AD_BLINKING_LOGO_LAST_UPDATE = "Lastupdate";
    public static final String RETAIL_AD_BLINKING_LOGO_S_FLAG = "s_Flag";


    //============================================Retail ad Ticker===================================================================//

    public static final String RETAIL_AD_TICKER_STORE_ID = "store_Id";
    public static final String RETAIL_AD_TICKER_AD_MAIN_ID = "Ad_main_Id";
    public static final String RETAIL_AD_TICKER_USER = "user";
    public static final String RETAIL_AD_TICKER_STORE_MEDIA_ID = "store_Media_Id";
    public static final String RETAIL_AD_TICKER_AD_DESC = "Ad_desc";
    public static final String RETAIL_AD_TICKER_AD_TEXT = "Ad_Text";
    public static final String RETAIL_AD_TICKER_AD_STRT_DT = "Ad_Strt_dt";
    public static final String RETAIL_AD_TICKER_AD_END_DT = "Ad_End_dt";
    public static final String RETAIL_AD_TICKER_MFG_ID = "Mfg_id";
    public static final String RETAIL_AD_TICKER_COMP_ID = "comp_Id";
    public static final String RETAIL_AD_TICKER_PROD_ID = "prod_Id";
    public static final String RETAIL_AD_TICKER_IND_ID = "Ind_id";
    public static final String RETAIL_AD_TICKER_AD_REVENUE = "Ad_revenue";
    public static final String RETAIL_AD_TICKER_AD_CST_SLB1 = "Ad_Cst_slb1";
    public static final String RETAIL_AD_TICKER_AD_CST_SLB2 = "Ad_Cst_slb2";
    public static final String RETAIL_AD_TICKER_AD_CST_SLB3 = "Ad_Cst_slb3";
    public static final String RETAIL_AD_TICKER_STATUS = "status";
    public static final String RETAIL_AD_TICKER_ACTIVE = "active";
    public static final String RETAIL_AD_TICKER_LAST_UPDATE = "Lastupdate";
    public static final String RETAIL_AD_TICKER_S_FLAG = "s_Flag";

    //=================================================Retail Card Define===========================================================//


    public static final String RETAIL_CARD_DEFINE_STORE_ID = "store_Id";
    public static final String RETAIL_CARD_DEFINE_ID = "ID";
    public static final String RETAIL_CARD_DEFINE_USER = "user";
    public static final String RETAIL_CARD_DEFINE_CARD_TYPE = "Card_type";
    public static final String RETAIL_CARD_DEFINE_POINTS_RANGE = "Points_range";
    public static final String RETAIL_CARD_DEFINE_LAST_UPDATE = "lastupdate";
    public static final String RETAIL_CARD_DEFINE_S_FLAG = "s_Flag";


    //==================================================Retail Inventory============================================================//
    public static final String RETAIL_INVENTORY_STORE_ID ="Store_id";
    public static final String RETAIL_INVENTORY_PROD_ID = "Prod_id";
    public static final String RETAIL_INVENTORY_BARCODE="barcode";
    public static final String RETAIL_INVENTORY_BATCH_NO = "batch_no";
    public static final String RETAIL_INVENTORY_PROD_NM = "prod_nm";
    public static final String RETAIL_INVENTORY_EXP_DATE = "exp_date";
    public static final String RETAIL_INVENTORY_QUANTITY = "qty";
    public static final String RETAIL_INVENTORY_MRP = "mrp";
    public static final String RETAIL_INVENTORY_AMOUNT = "amount";
    public static final String RETAIL_INVENTORY_UOM = "uom";
    public static final String RETAIL_INVENTORY_S_PRICE = "s_price";
    public static final String RETAIL_INVENTORY_P_PRICE = "p_price";
    public static final String RETAIL_INVENTORY_ACTIVE = "active";
    public static final String RETAIL_INVENTORY_S_FLAG = "s_Flag";

    //=============================================Retail Store MainT===============================================================//

    public static final String RETAIL_STORE_MAINT_TICKET_ID = "ticket_Id";
    public static final String RETAIL_STORE_MAINT_STORE_ID = "Store_id";
    public static final String RETAIL_STORE_MAINT_SUBJECT_DESC = "Subject_desc";
    public static final String RETAIL_STORE_MAINT_DATE= "date";
    public static final String RETAIL_STORE_MAINT_SUPPORT_PRIORITY = "Support_priority";
    public static final String RETAIL_STORE_MAINT_SUPPORT_TICKET_STATUS = "Support_Ticket_status";
    public static final String RETAIL_STORE_MAINT_TEAM_GROUP = "Team_group";
    public static final String RETAIL_STORE_MAINT_TEAM_MEMBER = "Team_member";
    public static final String RETAIL_STORE_MAINT_COMMENT = "comment";
    public static final String RETAIL_STORE_MAINT_LAST_UPDATE = "Lastupdate";
    public static final String RETAIL_STORE_MAINT_STATUS = "status";
    public static final String RETAIL_STORE_MAINT_USER = "User";
    public static final String RETAIL_STORE_MAINT_S_FLAG = "s_Flag";

//============================================\\//Retail Store Vendor//\\===========================================================//

    public static final String RETAIL_STORE_VENDOR_STORE_ID = "store_Id";
    public static final String RETAIL_STORE_VENDOR_VENDOR_ID = "vend_Id";
    public static final String RETAIL_STORE_VENDOR_VENDOR_NAME = "vend_Nm";
    public static final String RETAIL_STORE_VENDOR_VEND_CNTCT_NAME = "vend_cntct_Nm";
    public static final String RETAIL_STORE_VENDOR_ADDRESS1 = "add_1";
    public static final String RETAIL_STORE_VENDOR_CITY = "city";
    public static final String RETAIL_STORE_VENDOR_CTR_DESC= "Ctr_Desc";
    public static final String RETAIL_STORE_VENDOR_ZIP = "zip";
    public static final String RETAIL_STORE_VENDOR_TELE_N = "Tele_N";
    public static final String RETAIL_STORE_VENDOR_MOBILE_N = "Mobile_N";
    public static final String RETAIL_STORE_VENDOR_EMAIL_ADD = "Email_A";
    public static final String RETAIL_STORE_VENDOR_VENDOR_INV = "Vendor_Inv";
    public static final String RETAIL_STORE_VENDOR_ACTIVE = "Active_t";
    public static final String RETAIL_STORE_VENDOR_LAST_UPDATE = "Last_Update";
    public static final String RETAIL_STORE_VENDOR_S_FLAG = "s_Flag";

//===============================================//\\Retail Store Prod//\\==========================================================//
    public static final String RETAIL_STORE_PROD_STORE_ID="Store_id";
    public static final String RETAIL_STORE_PROD_PROD_ID="prod_Id";
    public static final String RETAIL_STORE_PROD_PROD_NAME="prod_nm";
    public static final String RETAIL_STORE_PROD_BARCODE="barcode";
    public static final String RETAIL_STORE_PROD_MRP="mrp";
    public static final String RETAIL_STORE_PROD_S_PRICE="s_price";
    public static final String RETAIL_STORE_PROD_P_PRICE="P_price";
    public static final String RETAIL_STORE_PROD_TAX_DESC="tax_desc";
    public static final String RETAIL_STORE_PROD_PROD_HIER_DESC3="prod_hier_desc_3";
    public static final String RETAIL_STORE_PROD_PURCH_ORDER_UNIT="Purch_Order_Unit";
    public static final String RETAIL_STORE_PROD_TH_CLASS_1="th_class_1";
    public static final String RETAIL_STORE_PROD_TH_CLASS_2="th-class_2";
    public static final String RETAIL_STORE_PROD_TH_CLASS_3="th_class_3";
    public static final String RETAIL_STORE_PROD_TH_CLASS_4="th_class_4";
    public static final String RETAIL_STORE_PROD_MFG="mfg";
    public static final String RETAIL_STORE_PROD_SELLING_ORDER_UNIT="selling_order_unit";
    public static final String RETAIL_STORE_PROD_IS_PRESE_REL="IS_prese_rel";
    public static final String RETAIL_STORE_PROD_IS_PHARMA_REL="IS_pharma_rel";
    public static final String RETAIL_STORE_PROD_IS_BATCH="Is_batch";
    public static final String RETAIL_STORE_PROD_INTERNET_PICE="Internet_price";
    public static final String RETAIL_STORE_PROD_IS_PROD_REL_INT="Is_Prod_Rel_int";
    public static final String RETAIL_STORE_PROD_ACTIVE="active";
    public static final String RETAIL_STORE_PROD_C_IMAGE="C_IMG";
    public static final String RETAIL_STORE_PROD_LAST_UPDATED="lastupdate";
    public static final String RETAIL_STORE_PROD_CONVERSION_FACTOR="conv_Fact";
    public static final String RETAIL_STORE_PROD_PROFIT_MARGIN="Profit_margin";
    public static final String RETAIL_STORE_PROD_USER="user";
    public static final String RETAIL_STORE_PROD_S_FLAG="s_Flag";
    public static final String RETAIL_STORE_PROD_IND_NM="Ind_nm";


//=================================================\\//Retail Store//\\=============================================================//\
    public static final String RETAIL_STORE_STORE_ID = "Store_id";
    public static final String RETAIL_STORE_STORE_MEDIA_ID = "store_media_id";
    public static final String RETAIL_STORE_STORE_NAME = "str_nm";
    public static final String RETAIL_STORE_ADDRESS_1 = "add_1";
    public static final String RETAIL_STORE_CITY = "City";
    public static final String RETAIL_STORE_STR_CTR = "str_ctr";
    public static final String RETAIL_STORE_ZIP = "zip";
    public static final String RETAIL_STORE_STR_CNTCT_NAME = "str_cntct_nm";
    public static final String RETAIL_STORE_TELE = "tele";
    public static final String RETAIL_STORE_E_MAIL = "e_Mail";
    public static final String RETAIL_STORE_TAN_NUMBER = "tan_number";
    public static final String RETAIL_STORE_DSTR_NUMBER = "dstr_number";
    public static final String RETAIL_STORE_FOOTER = "footer";
    public static final String RETAIL_STORE_FLAG = "flag";
    public static final String RETAIL_STORE_STR_IND_DESC = "str_ind_desc";
    public static final String RETAIL_STORE_RET_CLS_ID = "ret_cls_id";
    public static final String RETAIL_STORE_TEAM_MEMB = "team_memb";
    public static final String RETAIL_STORE_STATUS = "status";
    public static final String RETAIL_STORE_CURRENT_STATUS = "curr_status";
    public static final String RETAIL_STORE_CREATION_DATE = "creation_date";
    public static final String RETAIL_STORE_CLOSURE_DATE = "Closure_date";
    public static final String RETAIL_STORE_ACTIVATION_DATE = "Activation_date";
    public static final String RETAIL_STORE_DEACTIVATION_DATE = "De_Activation_Date";
    public static final String RETAIL_STORE_OTP = "otp";
    public static final String RETAIL_STORE_LAST_UPDATE = "Lastupdate";
    public static final String RETAIL_STORE_USER = "user";
    public static final String RETAIL_STORE_S_FLAG = "s_Flag";
    public static final String RETAIL_STORE_S_FLAG_3="s3_Flag";


//======================================================Retail Store Prod Cpg=======================================================//

    public static final String RETAIL_STORE_PROD_CPG_STORE_ID = "Store_id";
    public static final String RETAIL_STORE_PROD_CPG_PROD_ID = "prod_Id";
    public static final String RETAIL_STORE_PROD_CPG_PROD_NM = "Prod_nm";
    public static final String RETAIL_STORE_PROD_CPG_BARCODE = "barcode";
    public static final String RETAIL_STORE_PROD_CPG_MRP = "mrp";
    public static final String RETAIL_STORE_PROD_CPG_S_PRICE = "s_price";
    public static final String RETAIL_STORE_PROD_CPG_P_PRICE = "P_price";
    public static final String RETAIL_STORE_PROD_CPG_SELLING_ORDER_UNIT = "Selling_Order_unit";
    public static final String RETAIL_STORE_PROD_CPG_INTERNET_PRICE = "Internet_price";
    public static final String RETAIL_STORE_PROD_CPG_IS_PROD_REL_INT = "Is_Prod_Rel_int";
    public static final String RETAIL_STORE_PROD_CPG_TAX_DESC = "tax_desc";
    public static final String RETAIL_STORE_PROD_CPG_PROD_HIER_DESC_3 = "Prod_hier_Desc_3";
    public static final String RETAIL_STORE_PROD_CPG_PACK_UNIT_1 = "Pack_unit_1";
    public static final String RETAIL_STORE_PROD_CPG_PACK_UNIT_2 = "Pack_unit_2";
    public static final String RETAIL_STORE_PROD_CPG_MFG = "mfg";
    public static final String RETAIL_STORE_PROD_CPG_IS_BATCH = "IS_Batch";
    public static final String RETAIL_STORE_PROD_CPG_ACTIVE = "active";
    public static final String RETAIL_STORE_PROD_CPG_C_IMG = "c_img";
    public static final String RETAIL_STORE_PROD_CPG_PROFIT_MARGIN = "Profit_margin";
    public static final String RETAIL_STORE_PROD_CPG_LAST_UPDATE = "lastupdate";
    public static final String RETAIL_STORE_PROD_CPG_USER = "lastupdate";
    public static final String RETAIL_STORE_PROD_CPG_S_FLAG = "s_Flag";
    public static final String RETAIL_STORE_PROD_CPG_CONV_FACT = "conv_fact";
    public static final String RETAIL_STORE_PROD_CPG_IND_NM = "Ind_nm";



//================================================Retail Store Prod Local===========================================================//

    public static final String RETAIL_STORE_PROD_LOCAL_STORE_ID = "Store_id";
    public static final String RETAIL_STORE_PROD_LOCAL_PROD_ID = "prod_Id";
    public static final String RETAIL_STORE_PROD_LOCAL_PROD_NAME = "Prod_nm";
    public static final String RETAIL_STORE_PROD_LOCAL_BARCODE = "barcode";
    public static final String RETAIL_STORE_PROD_LOCAL_MRP = "mrp";
    public static final String RETAIL_STORE_PROD_LOCAL_S_PRICE = "s_price";
    public static final String RETAIL_STORE_PROD_LOCAL_P_PRICE = "p_price";
    public static final String RETAIL_STORE_PROD_LOCAL_SELLING_ORDER_UNIT = "selling_Order_Unit";
    public static final String RETAIL_STORE_PROD_LOCAL_INTERNET_PRICE = "Internet_price";
    public static final String RETAIL_STORE_PROD_LOCAL_IS_PROD_REL_INT = "Is_Prod_Rel_int";
    public static final String RETAIL_STORE_PROD_LOCAL_ACTIVE = "active";
    public static final String RETAIL_STORE_PROD_LOCAL_PROFIT_MARGIN = "profit_margin";
    public static final String RETAIL_STORE_PROD_LOCAL_LAST_UPDATE = "lastupdate";
    public static final String RETAIL_STORE_PROD_LOCAL_S_FLAG = "s_Flag";
    public static final String RETAIL_STORE_PROD_LOCAL_IND_NM = "Ind_nm";
    public static final String RETAIL_STORE_PROD_LOCAL_CONV_FACT = "conv_Fact";

//==============================================Retail Comp Btl===================================================================//

    public static final String RETAIL_COMP_BTL_COMP_ID = "comp_Id";
    public static final String RETAIL_COMP_BTL_STORE_ID = "store_Id";
    public static final String RETAIL_COMP_BTL_USER = "user";
    public static final String RETAIL_COMP_BTL_COMP_NM = "Comp_nm";
    public static final String RETAIL_COMP_BTL_STORE_NAME = "store_nm";
    public static final String RETAIL_COMP_BTL_TARGET_AMOUNT = "target_amount";
    public static final String RETAIL_COMP_BTL_BTL_DESC = "Btl_desc";
    public static final String RETAIL_COMP_BTL_TARGET_VALUE = "target_Value";
    public static final String RETAIL_COMP_BTL_INITIAL_AMOUNT = "Initial_amount";
    public static final String RETAIL_COMP_BTL_START_DATE = "Start_Date";
    public static final String RETAIL_COMP_BTL_END_DATE = "End_date";
    public static final String RETAIL_COMP_BTL_LAST_UPDATE = "laastupdate";
    public static final String RETAIL_COMP_BTL_S_FLAG = "s_Flag";


//===============================================Retail Cust Loyalty=================================================================//
    public static final String RETAIL_CUST_LOYALTY_CUST_ID ="cust_Id";
    public static final String RETAIL_CUST_LOYALTY_STORE_ID ="Store_Id";
    public static final String RETAIL_CUST_LOYALTY_MOBILE ="Mobile_no";
    public static final String RETAIL_CUST_LOYALTY_NAME ="name";
    public static final String RETAIL_CUST_LOYALTY_EMAIL ="E_mail";
    public static final String RETAIL_CUST_LOYALTY_PASSWORD ="Password";
    public static final String RETAIL_CUST_LOYALTY_POINTS_EARNED ="Points_earned";
    public static final String RETAIL_CUST_LOYALTY_POINTS_REEDEEMED ="points_redeemed";
    public static final String RETAIL_CUST_LOYALTY_POINTS_AVAILAIBLE ="points_available";
    public static final String RETAIL_CUST_LOYALTY_LAST_UPDATE ="lastupdate";
    public static final String RETAIL_CUST_LOYALTY_S_FLAG ="s_Flag";

//====================================================Retail Mfg Btl================================================================//
    public static final String RETAIL_MFG_BTL_MFG_ID = "Mfg_id";
    public static final String RETAIL_MFG_BTL_STORE_ID = "Store_id";
    public static final String RETAIL_MFG_BTL_USER = "user";
    public static final String RETAIL_MFG_BTL_MFG_NAME = "Mfg_nm";
    public static final String RETAIL_MFG_BTL_STORE_NAME = "Store_nm";
    public static final String RETAIL_MFG_BTL_TARGET_AMOUNT = "Target_amount";
    public static final String RETAIL_MFG_BTL_BTL_DESC = "btl_desc";
    public static final String RETAIL_MFG_BTL_TARGET_VALUE = "Target_value";
    public static final String RETAIL_MFG_BTL_START_DATE = "start_date";
    public static final String RETAIL_MFG_BTL_END_DATE = "End_date";
    public static final String RETAIL_MFG_BTL_LAST_UPDATE = "lastupdate";
    public static final String RETAIL_MFG_BTL_S_FLAG = "s_Flag";

//==================================================Retail_top_product==========================================================//

    public static final String RETAIL_TOP_PRODUCT_STORE_ID = "";
    public static final String RETAIL_TOP_PRODUCT_PROD_ID = "";
    public static final String RETAIL_TOP_PRODUCT_PROD_NM = "";
    public static final String RETAIL_TOP_PRODUCT_PROD_SHORT_NM = "";
    public static final String RETAIL_TOP_PRODUCT_LAST_UPDATE = "";
    public static final String RETAIL_TOP_PRODUCT_S_FLAG = "";

//=================================================Retail Vend Dstr================================================================//

    public static final String RETAIL_VEND_DSTR_VEND_DSTR_ID = "vend_Dstr_Id";
    public static final String RETAIL_VEND_DSTR_STORE_ID = "store_Id";
    public static final String RETAIL_VEND_DSTR_VEND_DSTR_NM = "vend_Dstr_Nm";
    public static final String RETAIL_VEND_DSTR_EMAIL = "email";
    public static final String RETAIL_VEND_DSTR_VEND_DSTR_ADD = "vend_Dstr_Add";
    public static final String RETAIL_VEND_DSTR_VEND_DSTR_CITY = "vend_Dstr_City";
    public static final String RETAIL_VEND_DSTR_VEND_DSTR_CTR = "vend_Dstr_Ctr";
    public static final String RETAIL_VEND_DSTR_VEND_DSTR_ZIP = "vend_Dstr_Zip";
    public static final String RETAIL_VEND_DSTR_VEND_DSTR_INV = "vend_Dstr_Inv";
    public static final String RETAIL_VEND_DSTR_ACTIVE = "active";
    public static final String RETAIL_VEND_DSTR_LAST_UPDATE = "lastupdate";
    public static final String RETAIL_VEND_DSTR_S_FLAG = "s_Flag";

    public static final String RETAIL_VEND_DSTR_USER="user";


//=============================================Retail Store Prod Com================================================================//







}


