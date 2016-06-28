package retail.solutions.pvt.Ltd.Media_Application_99RSPL;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button submitButton,btn_media_activity;
    Button showjson;
    EditText storeID;
    String STORE_ID;
    public String JSON_STRING,JSON_STRING1;
  //  public List<Model> firsttable_titlearray ;
   // public List<Model> secondtable_titlearray ;
    private ArrayList<String>title2;
    private ArrayList<String>data2;
    private ArrayList<String>data6;
    private ArrayList<String>data8;
    private ArrayList<String>data10;
    private ArrayList<String>data11;
    private ArrayList<String>data12;
    private  ArrayList<String>data13;
    private ArrayList<String>data15;
    private ArrayList<String>data16;
    private ArrayList<String>data17;
    private ArrayList<String>data18;
    private ArrayList<String>data19;
    private ArrayList<String>data22;
    private ArrayList<String>data23;
    private ArrayList<String>data35;
    private ArrayList<String>data36;
    private ArrayList<String>data45;
    private ArrayList<String>data46;
    private ArrayList<String> field1 ;
    private ArrayList<String> field2 ;
    private ArrayList<String> field3 ;
    private ArrayList<String> field4 ;
    private ArrayList<String> field5;
    private ArrayList<String> field6 ;
    private ArrayList<String> field7 ;
    private ArrayList<String> field8 ;
    private ArrayList<String> field9 ;
    private ArrayList<String> field10 ;
    private ArrayList<String> field11 ;
    private ArrayList<String> field12 ;
    private ArrayList<String> field13 ;
    private ArrayList<String> field14 ;
    private ArrayList<String> field15;
    private ArrayList<String> field16 ;
    private ArrayList<String> field17 ;
    private ArrayList<String> field18 ;
    private ArrayList<String> field19 ;
    private ArrayList<String> field20 ;
    private ArrayList<String> field21 ;
    private ArrayList<String> field22 ;
    private ArrayList<String> field23 ;
    private ArrayList<String> field24 ;
    private ArrayList<String> field25;
    private ArrayList<String> field26 ;
    private ArrayList<String> field27 ;
    private ArrayList<String> field28 ;
    private ArrayList<String> field29 ;
    private ArrayList<String> field30 ;
    private ArrayList<String> field31 ;
    private ArrayList<String> field32 ;
    private ArrayList<String> field33 ;
    private ArrayList<String> field34 ;
    private ArrayList<String> field35;
    private ArrayList<String> field36 ;
    private ArrayList<String> field37 ;
    private ArrayList<String> field38 ;
    private ArrayList<String> field39 ;
    private ArrayList<String> field40 ;
    private ArrayList<String> field41 ;
    private ArrayList<String> field42;
    private ArrayList<String> field43 ;
    private ArrayList<String> field44;
    private ArrayList<String> field45;
    private ArrayList<String> field46;
    private ArrayList<String>field57;


    private ArrayList<String>values=new ArrayList<>();


    String tablename_first="ret_ticket_install_register";
    String tablename_second="retail_ad_blinkinglogo";
    String tablename_third="retail_ad_blinkinglogo_cont";
    String tablename_fourth="retail_ad_store_main";
    String tablename_fifth="retail_ad_store_main_cont";
    String tablename_sixth="retail_ad_ticker ";
    String tablename_seventh="retail_ad_ticker_cont";
    String tablename_eigth="retail_card_define";
    String tablename_ninth="retail_card_define_mfg";
    String tablename_tenth="retail_comp_btl";
    String tablename_11="retail_cust";
    String tablename_12="retail_cust_loyalty";
    String tablename_13="retail_inventory";
    String tablename_14="retail_media";
    String tablename_15="retail_mfg_btl";
    String tablename_16="retail_store";
    String tablename_17="retail_store_maint";
    String tablename_18="retail_store_prod";
    String tablename_19="retail_store_prod_local_cpg";
    String tablename_20="retail_store_reports";
    String tablename_21="retail_store_vend_reject";
    String tablename_22="retail_store_vendor";
    String tablename_23="retail_str_dstr";
    String tablename_24="retail_str_grn_detail";
    String tablename_25="retail_str_grn_master";
    String tablename_26="retail_str_po_detail";
    String tablename_27="retail_str_po_master";
    String tablename_28="retail_str_sales_detail";
    String tablename_29="retail_str_sales_details_return";
    String tablename_30="retail_str_sales_master";
    String tablename_31="retail_str_stock_master";
    String tablename_32="retail_str_vendor_detail_return";
    String tablename_33="retail_str_vendor_master_return";
    String tablename_34="retail_tax";
    String tablename_35="retail_top_product";
    String tablename_36="retail_vend_dstr";
    String tablename_37="retail_videodata";
    String tablename_38="retail_videodata_cont";
    String tablename_39="retail_videodata_cont1";
    String tablename_40="rule_defination";
    String tablename_41="tmp_retail_pay_desc";
    String tablename_42="ad_ticker_main";
    String tablename_43="bank_details";
    String tablename_44="retail_store_prod_com";
    String tablename_45 = "retail_store_prod_cpg";
    String tablename_46= "retail_store_prod_local";
    String tablename_57 ="retail_media_click";
    String id,INSERT;

    //---------------------------------------------Fields For Retail_Cust Table--------------------------------------------------------//

    String t_11_id,t_11_name,t_11_email,t_11_credit_cust,t_11_password,t_11_last_update,t_11_mobile,t_11_s_flag;

    //============================================Fields For Temp_Retail_Dstr Table===================================================//

    String t_23_store_id,t_23_dstr_id,t_23_Dstr_Name,t_23_Dstr_cntct_nm,t_23_add_1,t_23_city,t_23_Ctr_nm,t_23_zip,t_23_tele,t_23_mobile,t_23_dstr_inv,t_23_active,t_23_email,t_23_lastupdate,t_23_user,t_23_flag;

    //============================================Fields for ret_ticket_install_register==============================================//

    String store_id,ticket_id,sim1,sim2,imei_number1,imei_number2,scanner1,scanner2,wallet1,wallet2,other,team_memb,start_date,end_date,prefix,t_1_user,t_1_last_update,t_1_s_flag;

//=======================================//\\Fields for retail_product_local_cpg======================================================//

    String t_19_ind_nm,t_19_conv_fact,t_19_store_id,t_19_prod_id,t_19_prod_nm,t_19_barcode,t_19_mrp,t_19_s_price,t_19_p_price,t_19_tax_id,t_19_internet_price,t_19_is_prod_rel_int,t_19_active,t_19_profit_margin,t_19_last_update,t_19_s_flag;


//==========================================//\\Fields for Retail_Ad_Blinking_Logo//\\================================================//

    String t_2_store_id,t_2_ad_main_id,t_2_user,t_2_store_media_id,t_2_ad_desc,t_2_ad_file,t_2_ad_start_date,t_2_ad_end_date,t_2_mfg_id,t_2_comp_id,t_2_prod_id,t_2_ind_id,t_2_ad_revenue,t_2_ad_cst_slb1,t_2_ad_cst_slb2,t_2_ad_cst_slb3,t_2_status,t_2_active,t_2_lastupdate,t_2_s_flag;

//=============================================//\\//Retail Ad Ticker//\\//===========================================================//

    String  t_6_store_id,t_6_ad_main_id,t_6_user,t_6_store_media_id,t_6_ad_desc,t_6_ad_text,t_6_ad_start_date,t_6_ad_end_date,t_6_mfg_id,t_6_comp_id,t_6_prod_id,t_6_ind_id,t_6_ad_revenue,t_6_ad_cst_slb1,t_6_ad_cst_slb2,t_6_ad_cst_slb3,t_6_status,t_6_active,t_6_lastupdate,t_6_s_flag;

//==============================================//\\Retail Card Define\\//===========================================================//

    String t_8_Store_Id, t_8_Id, t_8_User, t_8_Card_Type, t_8_Points_Range, t_8_Last_Update, t_8_S_Flag;


//===================================================//\\Retail Inventory//\\=========================================================//

    String t_13_store_id,t_13_barcode,t_13_prod_id,t_13_batch_no,t_13_prod_nm,t_13_exp_date,t_13_qty,t_13_mrp,t_13_amount,t_13_uom,t_13_s_price,t_13_p_price,t_13_active,t_13_s_flag;

//================================================//\\Retail Store MainT//\\========================================================//

    String t_17_ticket_id,t_17_store_id,t_17_subject_desc,t_17_date,t_17_support_priority,t_17_support_ticket_status,t_17_team_group,t_17_team_member,t_17_comment,t_17_last_update,t_17_status,t_17_user,t_17_s_flag;

//===============================================//\\Retail Store vendor\\//========================================================//

    String t_22_store_id,t_22_vend_id,t_22_vend_nm,t_22_vend_cntct_nm,t_22_add_1,t_22_city,t_22_ctr_desc,t_22_zip,t_22_tele_n,t_22_mobile,t_22_email,t_22_vendor_inv,t_22_active,t_22_last_update,t_22_s_flag;


//================================================//\\RETAIL STORE\\//==============================================================//

    String t_16_Store_id,t_16_store_media_id,t_16_str_nm,t_16_add,t_16_City,t_16_str_ctr,t_16_zip,t_16_str_cntct_nm,t_16_tele,t_16_e_Mail,t_16_tan_number,t_16_dstr_number,t_16_footer,t_16_flag,t_16_str_ind_desc,t_16_ret_cls_id,t_16_team_memb,t_16_status,t_16_curr_status,t_16_creation_date,t_16_Closure_date,t_16_Activation_date,t_16_De_Activation_Date,t_16_otp,t_16_Lastupdate,t_16_userl,t_16_s_Flag,t_16_s_3_flag;


//==============================================//\\ RETAIL STORE PROD CPG\\//=========================================================\\

    String t_45_Store_id,t_45_prod_Id,t_45_Prod_nm,t_45_barcode,t_45_mrp,t_45_s_price,t_45_P_price,t_45_Selling_Order_unit,t_45_Internet_price,t_45_Is_Prod_Rel_int,t_45_tax_desc,t_45_Prod_hier_Desc_3,t_45_Pack_unit_1,t_45_Pack_unit_2,t_45_mfg,t_45_IS_Batch,t_45_active,t_45_c_img,t_45_conv_fact,t_45_Profit_margin,t_45_lastupdate,t_45_user,t_45_s_Flag,t_45_Ind_nm;

//=============================================//\\Retail Store Prod Local\\//=======================================================//

    String t_46_ind_nm,t_46_conv_fact,t_46_store_id,t_46_prod_id,t_46_prod_nm,t_46_barcode,t_46_mrp,t_46_s_price,t_46_p_price,t_46_tax_id,t_46_internet_price,t_46_is_prod_rel_int,t_46_active,t_46_profit_margin,t_46_last_update,t_46_s_flag;

//===================================================//\\Retail Comp Btl\\//=========================================================//

    String t_10_comp_id, t_10_store_id, t_10_user, t_10_comp_nm, t_10_store_nm, t_10_target_amount, t_10_btl_desc, t_10_target_value, t_10_initial_amount, t_10_start_date, t_10_end_date, t_10_last_update, t_10_s_flag;


//==================================================//\\Retail Cust Loyalty//\\======================================================//

    String t_12_cust_id, t_12_store_id, t_12_mobile, t_12_name, t_12_email, t_12_password, t_12_points_earned, t_12_points_reedeemed, t_12_points_avaialaible, t_12_last_update, t_12_s_flag;


//================================================//\\Retail mfg btl//\\============================================================//

    String t_15_mfg_id, t_15_store_id, t_15_user, t_15_mfg_nm, t_15_store_nm, t_15_target_amount, t_15_btl_desc, t_15_target_value, t_15_start_date, t_15_end_date, t_15_last_update, t_15_s_flag;


//================================================//\\Retail top product//\\========================================================//

    String t_35_store_id, t_35_prod_id, t_35_prod_nm, t_35_prod_short_name, t_35_last_update, t_35_s_flag;

//===============================================//\\Retail vend dstr\\//===========================================================//

    String t_36_user,t_36_vend_dstr_id,t_36_store_id,t_36_vend_dstr_nm,t_36_email,t_36_vend_dstr_add,t_36_vend_dstr_city,t_36_vend_dstr_ctr,t_36_vend_dstr_zip,t_36_vend_dstr_inv,t_36_active,t_36_lastupdate,t_36_s_flag;


//=============================================//\\Retail Store Prod//\\=============================================================//

    String t_18_store_id,t_18_prod_id,t_18_prod_name,t_18_barcode,t_18_mrp,t_18_s_price,t_18_p_price,t_18_tax_desc,t_18_prod_hier_desc_3,t_18_purc_order_unit,t_18_th_class1,t_18_th_class_2,t_18_th_class_3,t_18_th_class_4,t_18_mfg,t_18_selling_order_unit,t_18_is_prese_rel,t_18_is_pharma_rel,t_18_is_batch,t_18_internet_price,t_18_is_prod_rel_int,t_18_active,t_18_c_image,t_18_lastupdate,t_18_conv_fact,t_18_profit_margin,t_18_user,t_18_s_flag,t_18_ind_nm;

    SQLiteDatabase myDataBase;
    SQLiteStatement insertStmt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=(Button)findViewById(R.id.btnSubmit);
        submitButton.setOnClickListener(this);


        btn_media_activity=(Button)findViewById(R.id.btnmedia);
        btn_media_activity.setOnClickListener(this);

        showjson=(Button)findViewById(R.id.button);
        showjson.setOnClickListener(this);
        storeID=(EditText)findViewById(R.id.txtStoreId);

        getJSON();


    }

    void jsonparsed(String input) {

        field1 = new ArrayList<>();
        field2 = new ArrayList<>();
        field3 = new ArrayList<>();
        field4 = new ArrayList<>();
        field5 = new ArrayList<>();
        field6 = new ArrayList<>();
        field7 = new ArrayList<>();
        field8 = new ArrayList<>();
        field9 = new ArrayList<>();
        field10 = new ArrayList<>();
        field11 = new ArrayList<>();
        field12 = new ArrayList<>();
        field13 = new ArrayList<>();
        field14 = new ArrayList<>();
        field15 = new ArrayList<>();
        field16 = new ArrayList<>();
        field17 = new ArrayList<>();
        field18 = new ArrayList<>();
        field19 = new ArrayList<>();
        field20 = new ArrayList<>();
        field21 = new ArrayList<>();
        field22 = new ArrayList<>();
        field23 = new ArrayList<>();
        field24 = new ArrayList<>();
        field25 = new ArrayList<>();
        field26 = new ArrayList<>();
        field27 = new ArrayList<>();
        field28 = new ArrayList<>();
        field29 = new ArrayList<>();
        field30 = new ArrayList<>();
        field31 = new ArrayList<>();
        field32 = new ArrayList<>();
        field33 = new ArrayList<>();
        field34 = new ArrayList<>();
        field35 = new ArrayList<>();
        field36 = new ArrayList<>();
        field37 = new ArrayList<>();
        field38 = new ArrayList<>();
        field39 = new ArrayList<>();
        field40 = new ArrayList<>();
        field41 = new ArrayList<>();
        field42 = new ArrayList<>();
        field43 = new ArrayList<>();
        field44 = new ArrayList<>();
        field45 = new ArrayList<>();
        field46 = new ArrayList<>();
        field57= new ArrayList<>();

        title2=new ArrayList<>();

        data2=new ArrayList<>();
        data6=new ArrayList<>();
        data8=new ArrayList<>();
        data10=new ArrayList<>();
        data11= new ArrayList<>();
        data12=new ArrayList<>();
        data13= new ArrayList<>();
        data15=new ArrayList<>();
        data16= new ArrayList<>();
        data17= new ArrayList<>();
        data18=new ArrayList<>();
        data19=new ArrayList<>();
        data22=new ArrayList<>();
        data23=new ArrayList<>();
        data35=new ArrayList<>();
        data36 = new ArrayList<>();
        data45= new ArrayList<>();
        data46= new ArrayList<>();






        try {
            //storeId = storeID.getText().toString();

            JSONObject jsonaman = new JSONObject(input);
            JSONArray firsttitlearray = jsonaman.getJSONArray(Config.TAG_ARRAY_TABLE_ONE);
            for (int i = 0; i < firsttitlearray.length(); i++)
            {
                JSONObject obj1 = (JSONObject) firsttitlearray.get(i);
                id = obj1.getString(Config.TAG_FIELD);
                field1.add(id);

            }
            createDynamicDatabase(MainActivity.this, tablename_first, field1);
        }
        catch (JSONException e) {
            Log.e("exception 1", e.toString());
        }

        try {

            JSONObject jsonObject2 = new JSONObject(input);
            JSONArray firsttitlearray2 = jsonObject2.getJSONArray(Config.TAG_ARRAY_TABLE_TWO);
            for (int i = 0; i < firsttitlearray2.length(); i++)
            {
                JSONObject obj2 = (JSONObject) firsttitlearray2.get(i);
                id = obj2.getString(Config.TAG_FIELD);
                field2.add(id);

            }
            createDynamicDatabase(MainActivity.this, tablename_second, field2);
        }
        catch (Exception e)
        {
            Log.e("exception 2", e.toString());
        }
        try {
            JSONObject jsonObject3 = new JSONObject(input);
            JSONArray firsttitlearray3 = jsonObject3.getJSONArray(Config.TAG_ARRAY_TABLE_THREE);
            for (int i = 0; i < firsttitlearray3.length(); i++)
            {
                JSONObject obj3 = (JSONObject) firsttitlearray3.get(i);
                id = obj3.getString(Config.TAG_FIELD);
                field3.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_third, field3);
        }
        catch (Exception e)
        {
            Log.e("exception 3", e.toString());
        }
        try {
            JSONObject jsonObject4 = new JSONObject(input);
            JSONArray firsttitlearray4 = jsonObject4.getJSONArray(Config.TAG_ARRAY_TABLE_FOUR);
            for (int i = 0; i < firsttitlearray4.length(); i++)
            {
                JSONObject obj4 = (JSONObject) firsttitlearray4.get(i);
                id = obj4.getString(Config.TAG_FIELD);
                field4.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_fourth, field4);
        }
        catch (Exception e)
        {
            Log.e("exception 4", e.toString());
        }
        try
        {
            JSONObject jsonObject5 = new JSONObject(input);
            JSONArray firsttitlearray5 = jsonObject5.getJSONArray(Config.TAG_ARRAY_TABLE_FIVE);
            for (int i = 0; i < firsttitlearray5.length(); i++) {
                JSONObject obj5 = (JSONObject) firsttitlearray5.get(i);
                id = obj5.getString(Config.TAG_FIELD);
                field5.add(id);
            }

            createDynamicDatabase(MainActivity.this, tablename_fifth,field5);
        }
        catch (Exception e)
        {
            Log.e("exception 5", e.toString());
        }
        try {
            JSONObject jsonObject6 = new JSONObject(input);
            JSONArray firsttitlearray6 = jsonObject6.getJSONArray(Config.TAG_ARRAY_TABLE_SIX);
            for (int i = 0; i < firsttitlearray6.length(); i++)
            {
                JSONObject obj6 = (JSONObject) firsttitlearray6.get(i);
                id = obj6.getString(Config.TAG_FIELD);
                field6.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_sixth,field6);
        }
        catch (Exception e)
        {
            Log.e("exception 6", e.toString());
        }
        try {
            JSONObject jsonObject7 = new JSONObject(input);
            JSONArray firsttitlearray7 = jsonObject7.getJSONArray(Config.TAG_ARRAY_TABLE_SEVEN);
            for (int i = 0; i < firsttitlearray7.length(); i++)
            {

                JSONObject obj7 = (JSONObject) firsttitlearray7.get(i);
                id = obj7.getString(Config.TAG_FIELD);
                field7.add(id);

            }
            createDynamicDatabase(MainActivity.this, tablename_seventh,field7);
        } catch (Exception e)
        {
            Log.e("exception 7", e.toString());
        }
        try
        {
            JSONObject jsonObject8 = new JSONObject(input);
            JSONArray firsttitlearray8 = jsonObject8.getJSONArray(Config.TAG_ARRAY_TABLE_EIGHT);
            for (int i = 0; i < firsttitlearray8.length(); i++) {
                JSONObject obj8 = (JSONObject) firsttitlearray8.get(i);
                id = obj8.getString(Config.TAG_FIELD);
                field8.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_eigth, field8);
        }
        catch (Exception e)
        {
            Log.e("exception 8", e.toString());
        }
        try
        {
            JSONObject jsonObject9 = new JSONObject(input);
            JSONArray firsttitlearray9 = jsonObject9.getJSONArray(Config.TAG_ARRAY_TABLE_NINE);
            for (int i = 0; i < firsttitlearray9.length(); i++)
            {

                JSONObject obj9 = (JSONObject) firsttitlearray9.get(i);
                id = obj9.getString(Config.TAG_FIELD);
                field9.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_ninth,field9);
        }
        catch (Exception e)
        {
            Log.e("exception 9", e.toString());
        }
        try
        {
            JSONObject jsonObject10 = new JSONObject(input);
            JSONArray firsttitlearray10 = jsonObject10.getJSONArray(Config.TAG_ARRAY_TABLE_TEN);
            for (int i = 0; i < firsttitlearray10.length(); i++)
            {
                JSONObject obj10 = (JSONObject) firsttitlearray10.get(i);
                id = obj10.getString(Config.TAG_FIELD);
                field10.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_tenth,field10);
        } catch (Exception e)
        {
            Log.e("exception 10", e.toString());
        }
        try
        {
            JSONObject jsonObject11 = new JSONObject(input);
            JSONArray firsttitlearray11 = jsonObject11.getJSONArray(Config.TAG_ARRAY_TABLE_ELEVEN);
            for (int i = 0; i < firsttitlearray11.length(); i++)
            {
                JSONObject obj11 = (JSONObject) firsttitlearray11.get(i);
                id = obj11.getString(Config.TAG_FIELD);
                field11.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_11,field11);
        } catch (Exception e)
        {
            Log.e("exception 11", e.toString());
        }
        try
        {
            JSONObject jsonObject12 = new JSONObject(input);
            JSONArray firsttitlearray12 = jsonObject12.getJSONArray(Config.TAG_ARRAY_TABLE_TWELVE);
            for (int i = 0; i < firsttitlearray12.length(); i++)
            {
                JSONObject obj12 = (JSONObject) firsttitlearray12.get(i);
                id = obj12.getString(Config.TAG_FIELD);
                field12.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_12,field12);
        } catch (Exception e)
        {
            Log.e("exception 12", e.toString());
        }
        try
        {
            JSONObject jsonObject13 = new JSONObject(input);
            JSONArray firsttitlearray13 = jsonObject13.getJSONArray(Config.TAG_ARRAY_TABLE_THIRTEEN);
            for (int i = 0; i < firsttitlearray13.length(); i++)
            {
                JSONObject obj13 = (JSONObject) firsttitlearray13.get(i);
                id = obj13.getString(Config.TAG_FIELD);
                field13.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_13,field13);
        } catch (Exception e)
        {
            Log.e("exception 13", e.toString());
        }
        try
        {
            JSONObject jsonObject14 = new JSONObject(input);
            JSONArray firsttitlearray14 = jsonObject14.getJSONArray(Config.TAG_ARRAY_TABLE_FOURTEEN);
            for (int i = 0; i < firsttitlearray14.length(); i++)
            {
                JSONObject obj14 = (JSONObject) firsttitlearray14.get(i);
                id = obj14.getString(Config.TAG_FIELD);
                field14.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_14,field14);
        } catch (Exception e)
        {
            Log.e("exception 14", e.toString());
        }
        try
        {
            JSONObject jsonObject15 = new JSONObject(input);
            JSONArray firsttitlearray15 = jsonObject15.getJSONArray(Config.TAG_ARRAY_TABLE_FIFTEEN);
            for (int i = 0; i < firsttitlearray15.length(); i++)
            {
                JSONObject obj15 = (JSONObject) firsttitlearray15.get(i);
                id = obj15.getString(Config.TAG_FIELD);
                field15.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_15,field15);
        } catch (Exception e)
        {
            Log.e("exception 15", e.toString());
        }
        try
        {
            JSONObject jsonObject16 = new JSONObject(input);
            JSONArray firsttitlearray16 = jsonObject16.getJSONArray(Config.TAG_ARRAY_TABLE_SIXTEEN);
            for (int i = 0; i < firsttitlearray16.length(); i++)
            {
                JSONObject obj16 = (JSONObject) firsttitlearray16.get(i);
                id = obj16.getString(Config.TAG_FIELD);
                field16.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_16,field16);
        } catch (Exception e)
        {
            Log.e("exception 16", e.toString());
        }
        try
        {
            JSONObject jsonObject17 = new JSONObject(input);
            JSONArray firsttitlearray17 = jsonObject17.getJSONArray(Config.TAG_ARRAY_TABLE_SEVENTEEN);
            for (int i = 0; i < firsttitlearray17.length(); i++)
            {
                JSONObject obj17 = (JSONObject) firsttitlearray17.get(i);
                id = obj17.getString(Config.TAG_FIELD);
                field17.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_17,field17);
        } catch (Exception e)
        {
            Log.e("exception 17", e.toString());
        }
        try
        {
            JSONObject jsonObject18 = new JSONObject(input);
            JSONArray firsttitlearray18 = jsonObject18.getJSONArray(Config.TAG_ARRAY_TABLE_EIGHTEEN);
            for (int i = 0; i < firsttitlearray18.length(); i++)
            {
                JSONObject obj18 = (JSONObject) firsttitlearray18.get(i);
                id = obj18.getString(Config.TAG_FIELD);
                field18.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_18,field18);
        } catch (Exception e)
        {
            Log.e("exception 18", e.toString());
        }
        try
        {
            JSONObject jsonObject19 = new JSONObject(input);
            JSONArray firsttitlearray19 = jsonObject19.getJSONArray(Config.TAG_ARRAY_TABLE_NINETEEN);
            for (int i = 0; i < firsttitlearray19.length(); i++)
            {
                JSONObject obj19 = (JSONObject) firsttitlearray19.get(i);
                id = obj19.getString(Config.TAG_FIELD);
                field19.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_19,field19);
        } catch (Exception e)
        {
            Log.e("exception 19", e.toString());
        }
        try
        {
            JSONObject jsonObject20 = new JSONObject(input);
            JSONArray firsttitlearray20 = jsonObject20.getJSONArray(Config.TAG_ARRAY_TABLE_TWENTY);
            for (int i = 0; i < firsttitlearray20.length(); i++)
            {
                JSONObject obj20 = (JSONObject) firsttitlearray20.get(i);
                id = obj20.getString(Config.TAG_FIELD);
                field20.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_20,field20);
        } catch (Exception e)
        {
            Log.e("exception 20", e.toString());
        }
        try
        {
            JSONObject jsonObject21 = new JSONObject(input);
            JSONArray firsttitlearray21= jsonObject21.getJSONArray(Config.TAG_ARRAY_TABLE_21);
            for (int i = 0; i < firsttitlearray21.length(); i++)
            {
                JSONObject obj21 = (JSONObject) firsttitlearray21.get(i);
                id = obj21.getString(Config.TAG_FIELD);
                field21.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_21,field21);
        } catch (Exception e)
        {
            Log.e("exception 21", e.toString());
        }
        try
        {
            JSONObject jsonObject22 = new JSONObject(input);
            JSONArray firsttitlearray22= jsonObject22.getJSONArray(Config.TAG_ARRAY_TABLE_22);
            for (int i = 0; i < firsttitlearray22.length(); i++)
            {
                JSONObject obj22 = (JSONObject) firsttitlearray22.get(i);
                id = obj22.getString(Config.TAG_FIELD);
                field22.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_22,field22);
        } catch (Exception e)
        {
            Log.e("exception 22", e.toString());
        }
        try
        {
            JSONObject jsonObject23 = new JSONObject(input);
            JSONArray firsttitlearray23= jsonObject23.getJSONArray(Config.TAG_ARRAY_TABLE_23);
            for (int i = 0; i < firsttitlearray23.length(); i++)
            {
                JSONObject obj23 = (JSONObject) firsttitlearray23.get(i);
                id = obj23.getString(Config.TAG_FIELD);
                field23.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_23,field23);
        } catch (Exception e)
        {
            Log.e("exception 23", e.toString());
        }
        try
        {
            JSONObject jsonObject24 = new JSONObject(input);
            JSONArray firsttitlearray24= jsonObject24.getJSONArray(Config.TAG_ARRAY_TABLE_24);
            for (int i = 0; i < firsttitlearray24.length(); i++)
            {
                JSONObject obj24 = (JSONObject) firsttitlearray24.get(i);
                id = obj24.getString(Config.TAG_FIELD);
                field24.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_24,field24);
        } catch (Exception e)
        {
            Log.e("exception 24", e.toString());
        }
        try
        {
            JSONObject jsonObject25 = new JSONObject(input);
            JSONArray firsttitlearray25= jsonObject25.getJSONArray(Config.TAG_ARRAY_TABLE_25);
            for (int i = 0; i < firsttitlearray25.length(); i++)
            {
                JSONObject obj25 = (JSONObject) firsttitlearray25.get(i);
                id = obj25.getString(Config.TAG_FIELD);
                field25.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_25,field25);
        } catch (Exception e)
        {
            Log.e("exception 25", e.toString());
        }
        try
        {
            JSONObject jsonObject26 = new JSONObject(input);
            JSONArray firsttitlearray26= jsonObject26.getJSONArray(Config.TAG_ARRAY_TABLE_26);
            for (int i = 0; i < firsttitlearray26.length(); i++)
            {
                JSONObject obj26 = (JSONObject) firsttitlearray26.get(i);
                id = obj26.getString(Config.TAG_FIELD);
                field26.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_26,field26);
        } catch (Exception e)
        {
            Log.e("exception 26", e.toString());
        }
        try
        {
            JSONObject jsonObject27 = new JSONObject(input);
            JSONArray firsttitlearray27= jsonObject27.getJSONArray(Config.TAG_ARRAY_TABLE_27);
            for (int i = 0; i < firsttitlearray27.length(); i++)
            {
                JSONObject obj27 = (JSONObject) firsttitlearray27.get(i);
                id = obj27.getString(Config.TAG_FIELD);
                field27.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_27,field27);
        } catch (Exception e)
        {
            Log.e("exception 27", e.toString());
        }
        try
        {
            JSONObject jsonObject28 = new JSONObject(input);
            JSONArray firsttitlearray28= jsonObject28.getJSONArray(Config.TAG_ARRAY_TABLE_28);
            for (int i = 0; i < firsttitlearray28.length(); i++)
            {
                JSONObject obj28 = (JSONObject) firsttitlearray28.get(i);
                id = obj28.getString(Config.TAG_FIELD);
                field28.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_28,field28);
        } catch (Exception e)
        {
            Log.e("exception 28", e.toString());
        }
        try
        {
            JSONObject jsonObject29 = new JSONObject(input);
            JSONArray firsttitlearray29= jsonObject29.getJSONArray(Config.TAG_ARRAY_TABLE_29);
            for (int i = 0; i < firsttitlearray29.length(); i++)
            {
                JSONObject obj29 = (JSONObject) firsttitlearray29.get(i);
                id = obj29.getString(Config.TAG_FIELD);
                field29.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_29,field29);
        } catch (Exception e)
        {
            Log.e("exception 29", e.toString());
        }
        try
        {
            JSONObject jsonObject30 = new JSONObject(input);
            JSONArray firsttitlearray30= jsonObject30.getJSONArray(Config.TAG_ARRAY_TABLE_30);
            for (int i = 0; i < firsttitlearray30.length(); i++)
            {
                JSONObject obj30 = (JSONObject) firsttitlearray30.get(i);
                id = obj30.getString(Config.TAG_FIELD);
                field30.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_30,field30);
        } catch (Exception e)
        {
            Log.e("exception 30", e.toString());
        }
        try
        {
            JSONObject jsonObject31 = new JSONObject(input);
            JSONArray firsttitlearray31= jsonObject31.getJSONArray(Config.TAG_ARRAY_TABLE_31);
            for (int i = 0; i < firsttitlearray31.length(); i++)
            {
                JSONObject obj31 = (JSONObject) firsttitlearray31.get(i);
                id = obj31.getString(Config.TAG_FIELD);
                field31.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_31,field31);
        } catch (Exception e)
        {
            Log.e("exception 31", e.toString());
        }
        try
        {
            JSONObject jsonObject32 = new JSONObject(input);
            JSONArray firsttitlearray32= jsonObject32.getJSONArray(Config.TAG_ARRAY_TABLE_32);
            for (int i = 0; i < firsttitlearray32.length(); i++)
            {
                JSONObject obj32 = (JSONObject) firsttitlearray32.get(i);
                id = obj32.getString(Config.TAG_FIELD);
                field32.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_32,field32);
        } catch (Exception e)
        {
            Log.e("exception 32", e.toString());
        }
        try
        {
            JSONObject jsonObject33 = new JSONObject(input);
            JSONArray firsttitlearray33= jsonObject33.getJSONArray(Config.TAG_ARRAY_TABLE_33);
            for (int i = 0; i < firsttitlearray33.length(); i++)
            {
                JSONObject obj33 = (JSONObject) firsttitlearray33.get(i);
                id = obj33.getString(Config.TAG_FIELD);
                field33.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_33,field33);
        } catch (Exception e)
        {
            Log.e("exception 33", e.toString());
        }
        try
        {
            JSONObject jsonObject34 = new JSONObject(input);
            JSONArray firsttitlearray34= jsonObject34.getJSONArray(Config.TAG_ARRAY_TABLE_34);
            for (int i = 0; i < firsttitlearray34.length(); i++)
            {
                JSONObject obj34 = (JSONObject) firsttitlearray34.get(i);
                id = obj34.getString(Config.TAG_FIELD);
                field34.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_34,field34);
        } catch (Exception e)
        {
            Log.e("exception 34", e.toString());
        }
        try
        {
            JSONObject jsonObject35 = new JSONObject(input);
            JSONArray firsttitlearray35= jsonObject35.getJSONArray(Config.TAG_ARRAY_TABLE_35);
            for (int i = 0; i < firsttitlearray35.length(); i++)
            {
                JSONObject obj35 = (JSONObject) firsttitlearray35.get(i);
                id = obj35.getString(Config.TAG_FIELD);
                field35.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_35,field35);
        } catch (Exception e)
        {
            Log.e("exception 35", e.toString());
        }
        try
        {
            JSONObject jsonObject36 = new JSONObject(input);
            JSONArray firsttitlearray36= jsonObject36.getJSONArray(Config.TAG_ARRAY_TABLE_36);
            for (int i = 0; i < firsttitlearray36.length(); i++)
            {
                JSONObject obj36 = (JSONObject) firsttitlearray36.get(i);
                id = obj36.getString(Config.TAG_FIELD);
                field36.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_36,field36);
        } catch (Exception e)
        {
            Log.e("exception 36", e.toString());
        }
        try
        {
            JSONObject jsonObject37 = new JSONObject(input);
            JSONArray firsttitlearray37= jsonObject37.getJSONArray(Config.TAG_ARRAY_TABLE_37);
            for (int i = 0; i < firsttitlearray37.length(); i++)
            {
                JSONObject obj37 = (JSONObject) firsttitlearray37.get(i);
                id = obj37.getString(Config.TAG_FIELD);
                field37.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_37,field37);
        } catch (Exception e)
        {
            Log.e("exception 37", e.toString());
        }
        try
        {
            JSONObject jsonObject38 = new JSONObject(input);
            JSONArray firsttitlearray38= jsonObject38.getJSONArray(Config.TAG_ARRAY_TABLE_38);
            for (int i = 0; i < firsttitlearray38.length(); i++)
            {
                JSONObject obj38 = (JSONObject) firsttitlearray38.get(i);
                id = obj38.getString(Config.TAG_FIELD);
                field38.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_38,field38);
        } catch (Exception e)
        {
            Log.e("exception 38", e.toString());
        }
        try
        {
            JSONObject jsonObject39 = new JSONObject(input);
            JSONArray firsttitlearray39= jsonObject39.getJSONArray(Config.TAG_ARRAY_TABLE_39);
            for (int i = 0; i < firsttitlearray39.length(); i++)
            {
                JSONObject obj39 = (JSONObject) firsttitlearray39.get(i);
                id = obj39.getString(Config.TAG_FIELD);
                field39.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_39,field39);
        } catch (Exception e)
        {
            Log.e("exception 39", e.toString());
        }
        try
        {
            JSONObject jsonObject40 = new JSONObject(input);
            JSONArray firsttitlearray40= jsonObject40.getJSONArray(Config.TAG_ARRAY_TABLE_40);
            for (int i = 0; i < firsttitlearray40.length(); i++)
            {
                JSONObject obj40 = (JSONObject) firsttitlearray40.get(i);
                id = obj40.getString(Config.TAG_FIELD);
                field40.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_40,field40);
        } catch (Exception e)
        {
            Log.e("exception 40", e.toString());
        }
        try
        {
            JSONObject jsonObject41 = new JSONObject(input);
            JSONArray firsttitlearray41= jsonObject41.getJSONArray(Config.TAG_ARRAY_TABLE_41);
            for (int i = 0; i < firsttitlearray41.length(); i++)
            {
                JSONObject obj41 = (JSONObject) firsttitlearray41.get(i);
                id = obj41.getString(Config.TAG_FIELD);
                field41.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_41,field41);
        } catch (Exception e)
        {
            Log.e("exception 41", e.toString());
        }
        try
        {
            JSONObject jsonObject42 = new JSONObject(input);
            JSONArray firsttitlearray42= jsonObject42.getJSONArray(Config.TAG_ARRAY_TABLE_42);
            for (int i = 0; i < firsttitlearray42.length(); i++)
            {
                JSONObject obj42 = (JSONObject) firsttitlearray42.get(i);
                id = obj42.getString(Config.TAG_FIELD);
                field42.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_42,field42);
        } catch (Exception e)
        {
            Log.e("exception 42", e.toString());
        }
        try
        {
            JSONObject jsonObject43 = new JSONObject(input);
            JSONArray firsttitlearray43= jsonObject43.getJSONArray(Config.TAG_ARRAY_TABLE_43);
            for (int i = 0; i < firsttitlearray43.length(); i++)
            {
                JSONObject obj43 = (JSONObject) firsttitlearray43.get(i);
                id = obj43.getString(Config.TAG_FIELD);
                field43.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_43,field43);
            Toast.makeText(getApplicationContext(),"Tables Created",Toast.LENGTH_LONG).show();
        } catch (Exception e)
        {
            Log.e("exception 43", e.toString());
        }
        try
        {
            JSONObject jsonObject44 = new JSONObject(input);
            JSONArray firsttitlearray44= jsonObject44.getJSONArray(Config.TAG_ARRAY_TABLE_44);
            for (int i = 0; i < firsttitlearray44.length(); i++)
            {
                JSONObject obj44 = (JSONObject) firsttitlearray44.get(i);
                id = obj44.getString(Config.TAG_FIELD);
                field44.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_44, field44);

        } catch (Exception e)
        {
            Log.e("exception 44", e.toString());
        }
        try
        {
            JSONObject jsonObject45 = new JSONObject(input);
            JSONArray firsttitlearray45= jsonObject45.getJSONArray(Config.TAG_ARRAY_TABLE_45);
            for (int i = 0; i < firsttitlearray45.length(); i++)
            {
                JSONObject obj45 = (JSONObject) firsttitlearray45.get(i);
                id = obj45.getString(Config.TAG_FIELD);
                field45.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_45, field45);

        } catch (Exception e)
        {
            Log.e("exception 45", e.toString());
        }
        try
        {
            JSONObject jsonObject46 = new JSONObject(input);
            JSONArray firsttitlearray46= jsonObject46.getJSONArray(Config.TAG_ARRAY_TABLE_46);
            for (int i = 0; i < firsttitlearray46.length(); i++)
            {
                JSONObject obj46 = (JSONObject) firsttitlearray46.get(i);
                id = obj46.getString(Config.TAG_FIELD);
                field46.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_46,field46);

        } catch (Exception e)
        {
            Log.e("exception 46", e.toString());
        }

        try
        {
            JSONObject jsonObject57 = new JSONObject(input);
            JSONArray firsttitlearray57= jsonObject57.getJSONArray(Config.TAG_ARRAY_TABLE_57);
            for (int i = 0; i < firsttitlearray57.length(); i++)
            {
                JSONObject obj57= (JSONObject) firsttitlearray57.get(i);
                id = obj57.getString(Config.TAG_FIELD);
                field57.add(id);
            }
            createDynamicDatabase(MainActivity.this, tablename_57,field57);

        } catch (Exception e)
        {
            Log.e("exception 57", e.toString());
        }

        Toast.makeText(getApplicationContext(),"Tables Created",Toast.LENGTH_LONG).show();


    }
    void jsonInsert(String input_data) {
        try {

            JSONObject jsonObject_insert = new JSONObject(input_data);

            JSONArray second_array = jsonObject_insert.getJSONArray(Config.TAG_ARRAY);
            for (int c = 0; c < second_array.length(); c++) {
                JSONObject jsonObjectone = (JSONObject) second_array.get(c);
                store_id = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_STORE_ID);
                ticket_id = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_TICKET_ID);
                imei_number1 = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_IMEI_NUMBER);
                imei_number2 = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_IMEI_NUMBER2);
                sim1 = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_SIM1);
                sim2 = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_SIM2);
                scanner1 = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_SCANNER1);
                scanner2 = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_SCANNER2);
                wallet1 = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_WALLET1);
                wallet2 = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_WALLET2);
                other = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_OTHER);
                team_memb = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_TEAM_MEMB);
                start_date = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_START_DATE);
                end_date = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_END_DATE);
                prefix = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_PREFIX);
                t_1_user = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_USER);
                t_1_last_update = jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_LAST_UPDATE);
                t_1_s_flag=jsonObjectone.getString(Config.RET_TICKET_INSTALL_REGISTER_S_FLAG);


                title2.add(store_id);
                title2.add(ticket_id);
                title2.add(imei_number1);
                title2.add(imei_number2);
                title2.add(sim1);
                title2.add("");
                title2.add(scanner1);
                title2.add(scanner2);
                title2.add(wallet1);
                title2.add(wallet2);
                title2.add(other);
                title2.add(team_memb);
                title2.add(start_date);
                title2.add(end_date);
                title2.add(prefix);
                title2.add(t_1_user);
                title2.add(t_1_last_update);
                title2.add(t_1_s_flag);

                Log.d("INSIDE JSON", second_array.toString());


            }

            int rows_number = field1.size();
            int row_index = 0;
            for (int i = 0; i < title2.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, title2, field1, tablename_first, row_index);
                row_index += rows_number;
                Log.d("Insertion Method Called", String.valueOf(row_index));


            }

        } catch (Exception e)
        {
            Log.e("Exception in table 1", e.toString());
        }

        try
        {
            JSONObject jsonObject_insert_6= new JSONObject(input_data);
            JSONArray jsonArray6 = jsonObject_insert_6.getJSONArray(Config.TAG_ARRAY_6);
            for(int c = 0;c<jsonArray6.length();c++){
                JSONObject jsonObject_getting_6=(JSONObject)jsonArray6.get(c);
                t_6_store_id=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_STORE_ID);
                t_6_ad_main_id=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_AD_MAIN_ID);
                t_6_user=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_USER);
                t_6_store_media_id=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_STORE_MEDIA_ID);
                t_6_ad_desc=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_AD_DESC);
                t_6_ad_text=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_AD_TEXT);
                t_6_ad_start_date=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_AD_STRT_DT);
                t_6_ad_end_date=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_AD_END_DT);
                t_6_mfg_id=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_MFG_ID);
                t_6_comp_id=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_COMP_ID);
                t_6_prod_id=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_PROD_ID);
                t_6_ind_id=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_IND_ID);
                t_6_ad_revenue=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_AD_REVENUE);
                t_6_ad_cst_slb1=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_AD_CST_SLB1);
                t_6_ad_cst_slb2=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_AD_CST_SLB2);
                t_6_ad_cst_slb3=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_AD_CST_SLB3);
                t_6_status=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_STATUS);
                t_6_active=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_ACTIVE);
                t_6_lastupdate=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_LAST_UPDATE);
                t_6_s_flag=jsonObject_getting_6.getString(Config.RETAIL_AD_TICKER_S_FLAG);

                data6.add(t_6_store_id);
                data6.add(t_6_ad_main_id);
                data6.add(t_6_user);
                data6.add(t_6_store_media_id);
                data6.add(t_6_ad_desc);
                data6.add(t_6_ad_text);
                data6.add(t_6_ad_start_date);
                data6.add(t_6_ad_end_date);
                data6.add(t_6_mfg_id);
                data6.add(t_6_comp_id);
                data6.add(t_6_prod_id);
                data6.add(t_6_ind_id);
                data6.add(t_6_ad_revenue);
                data6.add(t_6_ad_cst_slb1);
                data6.add(t_6_ad_cst_slb2);
                data6.add(t_6_ad_cst_slb3);
                data6.add(t_6_status);
                data6.add(t_6_active);
                data6.add(t_6_lastupdate);
                data6.add(t_6_s_flag);


            }
            int rows_number = field6.size();
            int row_index = 0;
            for (int i = 0; i <data6.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data6, field6, tablename_sixth, row_index);
                row_index += rows_number;
            }
        }catch(Exception e){
            Log.e("Exception in table 6",e.toString());
        }
        try{JSONObject jsonObject_insert_8 = new JSONObject(input_data);
            JSONArray jsonArray8 = jsonObject_insert_8.getJSONArray(Config.TAG_ARRAY_8);
            for (int c = 0; c < jsonArray8.length(); c++){
                JSONObject jsonObject_getting_8=(JSONObject)jsonArray8.get(c);
                t_8_Store_Id=jsonObject_getting_8.getString(Config.RETAIL_CARD_DEFINE_STORE_ID);
                t_8_Id=jsonObject_getting_8.getString(Config.RETAIL_CARD_DEFINE_ID);
                t_8_User=jsonObject_getting_8.getString(Config.RETAIL_CARD_DEFINE_USER);
                t_8_Card_Type=jsonObject_getting_8.getString(Config.RETAIL_CARD_DEFINE_CARD_TYPE);
                t_8_Points_Range=jsonObject_getting_8.getString(Config.RETAIL_CARD_DEFINE_POINTS_RANGE);
                t_8_Last_Update=jsonObject_getting_8.getString(Config.RETAIL_CARD_DEFINE_LAST_UPDATE);
                t_8_S_Flag=jsonObject_getting_8.getString(Config.RETAIL_CARD_DEFINE_S_FLAG);

                data8.add(t_8_Store_Id);
                data8.add(t_8_Id);
                data8.add(t_8_User);
                data8.add(t_8_Card_Type);
                data8.add(t_8_Points_Range);
                data8.add(t_8_Last_Update);
                data8.add(t_8_S_Flag);



            }
            int rows_number = field8.size();
            int row_index = 0;
            for (int i = 0; i <data8.size() - 1; i = i + rows_number)
            {

                insert(MainActivity.this, data8, field8, tablename_eigth, row_index);
                row_index += rows_number;
            }
        }

        catch (Exception e)
        {
            Log.e("Exception in Table 8",e.toString());
        }
        try{
            JSONObject jsonObject_insert_10 = new JSONObject(input_data);
            JSONArray jsonArray10 = jsonObject_insert_10.getJSONArray(Config.TAG_ARRAY_10);
            for (int c = 0; c < jsonArray10.length(); c++) {
                JSONObject jsonObject_getting_10 = (JSONObject) jsonArray10.get(c);
                t_10_comp_id=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_COMP_ID);
                t_10_store_id=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_STORE_ID);
                t_10_user=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_USER);
                t_10_comp_nm=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_COMP_NM);
                t_10_store_nm=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_STORE_NAME);
                t_10_target_amount=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_TARGET_AMOUNT);
                t_10_btl_desc=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_BTL_DESC);
                t_10_target_value=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_TARGET_VALUE);
                t_10_initial_amount=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_INITIAL_AMOUNT);
                t_10_start_date=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_START_DATE);
                t_10_end_date=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_END_DATE);
                t_10_last_update=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_LAST_UPDATE);
                t_10_s_flag=jsonObject_getting_10.getString(Config.RETAIL_COMP_BTL_S_FLAG);


                data10.add(t_10_comp_id);
                data10.add(t_10_store_id);
                data10.add(t_10_user);
                data10.add(t_10_comp_nm);
                data10.add(t_10_store_nm);
                data10.add(t_10_target_amount);
                data10.add(t_10_btl_desc);
                data10.add(t_10_target_value);
                data10.add(t_10_initial_amount);
                data10.add(t_10_start_date);
                data10.add(t_10_end_date);
                data10.add(t_10_last_update);
                data10.add(t_10_s_flag);



            }
            int rows_number = field10.size();
            int row_index = 0;
            for (int i = 0; i <data10.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data10, field10, tablename_tenth, row_index);
                row_index += rows_number;
            }

        }catch(Exception e){Log.e("Exception in table 10",e.toString());}

        try{
            JSONObject jsonObject_insert_11 = new JSONObject(input_data);
            JSONArray jsonArray11 = jsonObject_insert_11.getJSONArray(Config.TAG_ARRAY_11);
            for (int c = 0; c < jsonArray11.length(); c++){
                JSONObject jsonObject_getting_11 = (JSONObject) jsonArray11.get(c);
                t_11_id=jsonObject_getting_11.getString(Config.RETAIL_CUST_TAG_ID);
                t_11_name=jsonObject_getting_11.getString(Config.RETAIL_CUST_TAG_NAME);
                t_11_email=jsonObject_getting_11.getString(Config.RETAIL_CUST_TAG_EMAIL);
                t_11_mobile=jsonObject_getting_11.getString(Config.RETAIL_CUST_TAG_PHONE);
                t_11_last_update=jsonObject_getting_11.getString(Config.RETAIL_CUST_TAG_LAST_UPDATE);
                t_11_password=jsonObject_getting_11.getString(Config.RETAIL_CUST_TAG_PASSWORD);
                t_11_credit_cust=jsonObject_getting_11.getString(Config.RETAIL_CUST_TAG_CREDIT_CUST);
                t_11_s_flag=jsonObject_getting_11.getString(Config.RETAIL_CUST_TAG_S_FLAG);

                data11.add(t_11_id);
                data11.add(t_11_name);
                data11.add(t_11_email);
                data11.add(t_11_mobile);
                data11.add(t_11_last_update);
                data11.add(t_11_password);
                data11.add(t_11_credit_cust);
                data11.add(t_11_s_flag);


            }

            int rows_number = field11.size();
            int row_index = 0;
            for (int i = 0; i <data11.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data11, field11, tablename_11, row_index);
                row_index += rows_number;
            }

        }catch (Exception e){
            Log.e("Exception in Table 11",e.toString());
        }

        try{
            JSONObject jsonObject_insert_12 = new JSONObject(input_data);
            JSONArray jsonArray12 = jsonObject_insert_12.getJSONArray(Config.TAG_ARRAY_12);
            for (int c = 0; c < jsonArray12.length(); c++) {
                JSONObject jsonObject_getting_12 = (JSONObject) jsonArray12.get(c);

                t_12_cust_id=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_CUST_ID);
                t_12_store_id=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_STORE_ID);
                t_12_mobile=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_MOBILE);
                t_12_name=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_NAME);
                t_12_email=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_EMAIL);
                t_12_password=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_PASSWORD);
                t_12_points_earned=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_POINTS_EARNED);
                t_12_points_reedeemed=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_POINTS_REEDEEMED);
                t_12_points_avaialaible=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_POINTS_AVAILAIBLE);
                t_12_last_update=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_LAST_UPDATE);
                t_12_s_flag=jsonObject_getting_12.getString(Config.RETAIL_CUST_LOYALTY_S_FLAG);

                data12.add(t_12_cust_id);
                data12.add(t_12_store_id);
                data12.add(t_12_mobile);
                data12.add(t_12_name);
                data12.add(t_12_email);
                data12.add(t_12_password);
                data12.add(t_12_points_earned);
                data12.add(t_12_points_reedeemed);
                data12.add(t_12_points_avaialaible);
                data12.add(t_12_last_update);
                data12.add(t_12_s_flag);


            }
            int rows_number = field12.size();
            int row_index = 0;
            for (int i = 0; i <data12.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data12, field12, tablename_12, row_index);
                row_index += rows_number;

            }


        }catch (Exception e){Log.e("Exception in Table 12",e.toString());}
        try{
            JSONObject jsonObject_insert_13 = new JSONObject(input_data);
            JSONArray jsonArray13 = jsonObject_insert_13.getJSONArray(Config.TAG_ARRAY_13);
            for (int c = 0; c < jsonArray13.length(); c++){
                JSONObject jsonObject_getting_13 = (JSONObject) jsonArray13.get(c);
                t_13_store_id=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_STORE_ID);
                t_13_prod_id=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_PROD_ID);
                t_13_batch_no=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_BATCH_NO);
                t_13_prod_nm=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_PROD_NM);
                t_13_barcode=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_BARCODE);
                t_13_exp_date=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_EXP_DATE);
                t_13_qty=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_QUANTITY);
                t_13_mrp=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_MRP);
                t_13_amount=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_AMOUNT);
                t_13_uom=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_UOM);
                t_13_s_price=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_S_PRICE);
                t_13_p_price=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_P_PRICE);
                t_13_active=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_ACTIVE);
                t_13_s_flag=jsonObject_getting_13.getString(Config.RETAIL_INVENTORY_S_FLAG);

                data13.add(t_13_store_id);
                data13.add(t_13_prod_id);
                data13.add(t_13_batch_no);
                data13.add(t_13_prod_nm);
                data13.add(t_13_barcode);
                data13.add(t_13_exp_date);
                data13.add(t_13_qty);
                data13.add(t_13_mrp);
                data13.add(t_13_amount);
                data13.add(t_13_uom);
                data13.add(t_13_s_price);
                data13.add(t_13_p_price);
                data13.add(t_13_active);
                data13.add(t_13_s_flag);



            }
            int rows_number = field13.size();
            int row_index = 0;
            for (int i = 0; i <data13.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data13, field13, tablename_13, row_index);
                row_index += rows_number;

            }

        }catch(Exception e){Log.e("Exception in table 13",e.toString());}


        try
        {
            JSONObject jsonObject_insert_15 = new JSONObject(input_data);
            JSONArray jsonArray15 = jsonObject_insert_15.getJSONArray(Config.TAG_ARRAY_15);
            for (int c = 0; c < jsonArray15.length(); c++) {
                JSONObject jsonObject_getting_15 = (JSONObject) jsonArray15.get(c);

                t_15_mfg_id=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_MFG_ID);
                t_15_store_id=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_STORE_ID);
                t_15_user=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_USER);
                t_15_mfg_nm=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_MFG_NAME);
                t_15_store_nm=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_STORE_NAME);
                t_15_target_amount=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_TARGET_AMOUNT);
                t_15_btl_desc=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_BTL_DESC);
                t_15_target_value=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_TARGET_VALUE);
                t_15_start_date=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_START_DATE);
                t_15_end_date =jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_END_DATE);
                t_15_last_update=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_LAST_UPDATE);
                t_15_s_flag=jsonObject_getting_15.getString(Config.RETAIL_MFG_BTL_S_FLAG);

                data15.add(t_15_mfg_id);
                data15.add(t_15_store_id);
                data15.add(t_15_user);
                data15.add(t_15_mfg_nm);
                data15.add(t_15_store_nm);
                data15.add(t_15_target_amount);
                data15.add(t_15_btl_desc);
                data15.add(t_15_target_value);
                data15.add(t_15_start_date);
                data15.add(t_15_end_date);
                data15.add(t_15_last_update);
                data15.add(t_15_s_flag);



            }
            int rows_number = field15.size();
            int row_index = 0;
            for (int i = 0; i <data15.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data15, field15, tablename_15, row_index);
                row_index += rows_number;

            }


        }catch(Exception e){Log.e("Exception in Table 15",e.toString());}

        try{
            JSONObject jsonObject_insert_16 = new JSONObject(input_data);
            JSONArray jsonArray16 = jsonObject_insert_16.getJSONArray(Config.TAG_ARRAY_16);
            for (int c = 0; c < jsonArray16.length(); c++) {
                JSONObject jsonObject_getting_16 = (JSONObject) jsonArray16.get(c);
                t_16_Store_id =jsonObject_getting_16.getString(Config.RETAIL_STORE_STORE_ID);
                t_16_store_media_id=jsonObject_getting_16.getString(Config.RETAIL_STORE_STORE_MEDIA_ID);
                t_16_str_nm=jsonObject_getting_16.getString(Config.RETAIL_STORE_STORE_NAME);
                t_16_add=jsonObject_getting_16.getString(Config.RETAIL_STORE_ADDRESS_1);
                t_16_City=jsonObject_getting_16.getString(Config.RETAIL_STORE_CITY);
                t_16_str_ctr=jsonObject_getting_16.getString(Config.RETAIL_STORE_STR_CTR);
                t_16_zip=jsonObject_getting_16.getString(Config.RETAIL_STORE_ZIP);
                t_16_str_cntct_nm=jsonObject_getting_16.getString(Config.RETAIL_STORE_STR_CNTCT_NAME);
                t_16_tele=jsonObject_getting_16.getString(Config.RETAIL_STORE_TELE);
                t_16_e_Mail=jsonObject_getting_16.getString(Config.RETAIL_STORE_E_MAIL);
                t_16_tan_number=jsonObject_getting_16.getString(Config.RETAIL_STORE_TAN_NUMBER);
                t_16_dstr_number=jsonObject_getting_16.getString(Config.RETAIL_STORE_DSTR_NUMBER);
                t_16_footer=jsonObject_getting_16.getString(Config.RETAIL_STORE_FOOTER);
                t_16_flag=jsonObject_getting_16.getString(Config.RETAIL_STORE_FLAG);
                t_16_str_ind_desc=jsonObject_getting_16.getString(Config.RETAIL_STORE_STR_IND_DESC);
                t_16_ret_cls_id=jsonObject_getting_16.getString(Config.RETAIL_STORE_RET_CLS_ID);
                t_16_team_memb=jsonObject_getting_16.getString(Config.RETAIL_STORE_TEAM_MEMB);
                t_16_status=jsonObject_getting_16.getString(Config.RETAIL_STORE_STATUS);
                t_16_curr_status=jsonObject_getting_16.getString(Config.RETAIL_STORE_CURRENT_STATUS);
                t_16_creation_date=jsonObject_getting_16.getString(Config.RETAIL_STORE_CREATION_DATE);
                t_16_Closure_date=jsonObject_getting_16.getString(Config.RETAIL_STORE_CLOSURE_DATE);
                t_16_Activation_date=jsonObject_getting_16.getString(Config.RETAIL_STORE_ACTIVATION_DATE);
                t_16_De_Activation_Date=jsonObject_getting_16.getString(Config.RETAIL_STORE_DEACTIVATION_DATE);
                t_16_otp=jsonObject_getting_16.getString(Config.RETAIL_STORE_OTP);
                t_16_Lastupdate=jsonObject_getting_16.getString(Config.RETAIL_STORE_LAST_UPDATE);
                t_16_userl=jsonObject_getting_16.getString(Config.RETAIL_STORE_USER);
                t_16_s_Flag=jsonObject_getting_16.getString(Config.RETAIL_STORE_S_FLAG);
                t_16_s_3_flag=jsonObject_getting_16.getString(Config.RETAIL_STORE_S_FLAG_3);


                data16.add(t_16_Store_id);
                data16.add(t_16_store_media_id);
                data16.add(t_16_str_nm);
                data16.add(t_16_add);
                data16.add(t_16_City);
                data16.add(t_16_str_ctr);
                data16.add(t_16_zip);
                data16.add(t_16_str_cntct_nm);
                data16.add(t_16_tele);
                data16.add(t_16_e_Mail);
                data16.add(t_16_tan_number);
                data16.add(t_16_dstr_number);
                data16.add(t_16_footer);
                data16.add(t_16_flag);
                data16.add(t_16_str_ind_desc);
                data16.add(t_16_ret_cls_id);
                data16.add(t_16_team_memb);
                data16.add(t_16_status);
                data16.add(t_16_curr_status);
                data16.add(t_16_creation_date);
                data16.add(t_16_Closure_date);
                data16.add(t_16_Activation_date);
                data16.add(t_16_De_Activation_Date);
                data16.add(t_16_otp);
                data16.add(t_16_Lastupdate);
                data16.add(t_16_userl);
                data16.add(t_16_s_Flag);
                data16.add(t_16_s_3_flag);

            }

            int rows_number = field16.size();
            int row_index = 0;
            for (int i = 0; i <data16.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data16, field16, tablename_16, row_index);
                row_index += rows_number;

            }

        }catch(Exception e){Log.e("Exception in table 16",e.toString());}


        try
        {
            JSONObject jsonObject_insert_17 = new JSONObject(input_data);
            JSONArray jsonArray17 = jsonObject_insert_17.getJSONArray(Config.TAG_ARRAY_17);
            for (int c = 0; c < jsonArray17.length(); c++) {
                JSONObject jsonObject_getting_17 = (JSONObject) jsonArray17.get(c);
                t_17_ticket_id=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_TICKET_ID);
                t_17_store_id=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_STORE_ID);
                t_17_subject_desc=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_SUBJECT_DESC);
                t_17_date=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_DATE);
                t_17_support_priority=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_SUPPORT_PRIORITY);
                t_17_support_ticket_status=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_SUPPORT_TICKET_STATUS);
                t_17_team_group=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_TEAM_GROUP);
                t_17_team_member=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_TEAM_MEMBER);
                t_17_comment=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_COMMENT);
                t_17_last_update=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_LAST_UPDATE);
                t_17_status=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_STATUS);
                t_17_user=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_USER);
                t_17_s_flag=jsonObject_getting_17.getString(Config.RETAIL_STORE_MAINT_S_FLAG);

                data17.add(t_17_ticket_id);
                data17.add(t_17_store_id);
                data17.add(t_17_subject_desc);
                data17.add(t_17_date);
                data17.add(t_17_support_priority);
                data17.add(t_17_support_ticket_status);
                data17.add(t_17_team_group);
                data17.add(t_17_team_member);
                data17.add(t_17_comment);
                data17.add(t_17_last_update);
                data17.add(t_17_status);
                data17.add(t_17_user);
                data17.add(t_17_s_flag);
            }
            int rows_number = field17.size();
            int row_index = 0;
            for (int i = 0; i <data17.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data17, field17, tablename_17, row_index);
                row_index += rows_number;

            }


        }catch(Exception e)
        {
            Log.e("Exception in table 17",e.toString());
        }
        try
        {
            JSONObject jsonObject_insert_18 = new JSONObject(input_data);
            JSONArray jsonArray18 = jsonObject_insert_18.getJSONArray(Config.TAG_ARRAY_18);
            for (int c = 0; c < jsonArray18.length(); c++) {
                JSONObject jsonObject_getting_18 = (JSONObject) jsonArray18.get(c);
                t_18_store_id=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_STORE_ID);
                t_18_prod_id=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_PROD_ID);
                t_18_prod_name=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_PROD_NAME);
                t_18_barcode=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_BARCODE);
                t_18_mrp=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_MRP);
                t_18_s_price=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_S_PRICE);
                t_18_p_price=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_P_PRICE);
                t_18_tax_desc=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_TAX_DESC);
                t_18_prod_hier_desc_3=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_PROD_HIER_DESC3);
                t_18_purc_order_unit=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_PURCH_ORDER_UNIT);
                t_18_th_class1=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_TH_CLASS_1);
                t_18_th_class_2=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_TH_CLASS_2);
                t_18_th_class_3=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_TH_CLASS_3);
                t_18_th_class_4=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_TH_CLASS_4);
                t_18_mfg=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_MFG);
                t_18_selling_order_unit=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_SELLING_ORDER_UNIT);
                t_18_is_prese_rel=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_IS_PRESE_REL);
                t_18_is_pharma_rel=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_IS_PHARMA_REL);
                t_18_is_batch=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_IS_BATCH);
                t_18_internet_price=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_INTERNET_PICE);
                t_18_is_prod_rel_int=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_IS_PROD_REL_INT);
                t_18_active=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_ACTIVE);
                t_18_c_image=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_C_IMAGE);
                t_18_lastupdate=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_LAST_UPDATED);
                t_18_conv_fact=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_CONVERSION_FACTOR);
                t_18_profit_margin=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_PROFIT_MARGIN);
                t_18_user=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_USER);
                t_18_s_flag=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_S_FLAG);
                t_18_ind_nm=jsonObject_getting_18.getString(Config.RETAIL_STORE_PROD_IND_NM);


                data18.add(t_18_store_id);
                data18.add(t_18_prod_id);
                data18.add(t_18_prod_name);
                data18.add(t_18_barcode);
                data18.add(t_18_mrp);
                data18.add(t_18_s_price);
                data18.add(t_18_p_price);
                data18.add(t_18_tax_desc);
                data18.add(t_18_prod_hier_desc_3);
                data18.add(t_18_purc_order_unit);
                data18.add(t_18_th_class1);
                data18.add(t_18_th_class_2);
                data18.add(t_18_th_class_3);
                data18.add(t_18_th_class_4);
                data18.add(t_18_mfg);
                data18.add(t_18_selling_order_unit);
                data18.add(t_18_is_prese_rel);
                data18.add(t_18_is_pharma_rel);
                data18.add(t_18_is_batch);
                data18.add(t_18_internet_price);
                data18.add(t_18_is_prod_rel_int);
                data18.add(t_18_active);
                data18.add(t_18_c_image);
                data18.add(t_18_lastupdate);
                data18.add(t_18_conv_fact);
                data18.add(t_18_profit_margin);
                data18.add(t_18_user);
                data18.add(t_18_s_flag);
                data18.add(t_18_ind_nm);


            }
            int rows_number = field18.size();
            int row_index = 0;
            for (int i = 0; i <data18.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data18, field18, tablename_18, row_index);
                row_index += rows_number;

            }



        }catch(Exception e)
        {
            Log.e("Exception in table 18",e.toString());
        }

        try {
            JSONObject jsonObject_insert_19 = new JSONObject(input_data);
            JSONArray jsonArray19 = jsonObject_insert_19.getJSONArray(Config.TAG_ARRAY_19);
            for (int c = 0; c < jsonArray19.length(); c++)
            {
                JSONObject jsonObject191 = (JSONObject) jsonArray19.get(c);
                t_19_store_id = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_STORE_ID);
                t_19_prod_id = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_PROD_ID);
                t_19_prod_nm = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_PROD_NAME);
                t_19_barcode = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_BARCODE);
                t_19_mrp = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_MRP);
                t_19_s_price = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_S_PRICE);
                t_19_p_price = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_P_PRICE);
                t_19_tax_id = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_TAX_ID);
                t_19_internet_price = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_INTERNET_PRICE);
                t_19_is_prod_rel_int = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_IS_PROD_REL_INT);
                t_19_active = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_ACTIVE);
                t_19_profit_margin = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_PROFIT_MARGIN);
                t_19_last_update = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_LAST_UPDATE);
                t_19_s_flag = jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_S_FLAG);
                t_19_ind_nm=jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_IND_NM);
                t_19_conv_fact=jsonObject191.getString(Config.RETAIL_STORE_PROD_LOCAL_CPG_CONV_FACT);

                data19.add(t_19_store_id);
                data19.add(t_19_prod_id);
                data19.add(t_19_prod_nm);
                data19.add(t_19_barcode);
                data19.add(t_19_mrp);
                data19.add(t_19_s_price);
                data19.add(t_19_p_price);
                data19.add(t_19_tax_id);
                data19.add(t_19_internet_price);
                data19.add(t_19_is_prod_rel_int);
                data19.add(t_19_active);
                data19.add(t_19_profit_margin);
                data19.add(t_19_last_update);
                data19.add(t_19_s_flag);
                data19.add(t_19_ind_nm);
                data19.add(t_19_conv_fact);




            }


            int rows_number = field19.size();
            int row_index = 0;
            for (int i = 0; i <data19.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data19, field19, tablename_19, row_index);
                row_index += rows_number;

            }


        }catch (Exception e){ Log.e("Exception in table 19",e.toString());}
        try{
            JSONObject jsonObject_insert_22 = new JSONObject(input_data);
            JSONArray jsonArray22 = jsonObject_insert_22.getJSONArray(Config.TAG_ARRAY_22);
            for (int c = 0; c < jsonArray22.length(); c++) {
                JSONObject jsonObject_getting_22 = (JSONObject) jsonArray22.get(c);
                t_22_store_id=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_STORE_ID);
                t_22_vend_id=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_VENDOR_ID);
                t_22_vend_nm=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_VENDOR_NAME);
                t_22_vend_cntct_nm=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_VEND_CNTCT_NAME);
                t_22_add_1=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_ADDRESS1);
                t_22_city=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_CITY);
                t_22_ctr_desc=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_CTR_DESC);
                t_22_zip=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_ZIP);
                t_22_tele_n=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_TELE_N);
                t_22_mobile=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_MOBILE_N);
                t_22_email=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_EMAIL_ADD);
                t_22_vendor_inv=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_VENDOR_INV);
                t_22_active=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_ACTIVE);
                t_22_last_update=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_LAST_UPDATE);
                t_22_s_flag=jsonObject_getting_22.getString(Config.RETAIL_STORE_VENDOR_S_FLAG);

                data22.add(t_22_store_id);
                data22.add(t_22_vend_id);
                data22.add(t_22_vend_nm);
                data22.add(t_22_vend_cntct_nm);
                data22.add(t_22_add_1);
                data22.add(t_22_city);
                data22.add(t_22_ctr_desc);
                data22.add(t_22_zip);
                data22.add(t_22_tele_n);
                data22.add(t_22_mobile);
                data22.add(t_22_email);
                data22.add(t_22_vendor_inv);
                data22.add(t_22_active);
                data22.add(t_22_last_update);
                data22.add(t_22_s_flag);
            }


            int rows_number = field22.size();
            int row_index = 0;
            for (int i = 0; i <data22.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data22, field22, tablename_22, row_index);
                row_index += rows_number;

            }

        }catch(Exception e){Log.e("Exception in Table 22",e.toString());}


        try{
            JSONObject jsonObject_insert_23 = new JSONObject(input_data);
            JSONArray jsonArray23 = jsonObject_insert_23.getJSONArray(Config.TAG_ARRAY_23);
            for (int c = 0; c < jsonArray23.length(); c++) {
                JSONObject jsonObject_getting_23 = (JSONObject) jsonArray23.get(c);
                t_23_store_id=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_DSTR_STORE_ID);
                t_23_dstr_id=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_DSTR_ID);
                t_23_Dstr_Name=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_DSTR_NM);
                t_23_Dstr_cntct_nm=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_DSTR_cntct);
                t_23_add_1=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_ADDRESS1);
                t_23_city=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_CITY);
                t_23_Ctr_nm=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_CTR_NM);
                t_23_zip=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_ZIP);
                t_23_tele=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_tele);
                t_23_mobile=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_Mobile);
                t_23_dstr_inv=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_dstr_inv);
                t_23_active=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_active);
                t_23_email=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_email);
                t_23_lastupdate=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_last_update);
                t_23_user=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_user);
                t_23_flag=jsonObject_getting_23.getString(Config.RETAIL_DSTR_TAG_flag);

                data23.add(t_23_store_id);
                data23.add(t_23_dstr_id);
                data23.add(t_23_Dstr_Name);
                data23.add(t_23_Dstr_cntct_nm);
                data23.add(t_23_add_1);
                data23.add(t_23_city);
                data23.add(t_23_Ctr_nm);
                data23.add(t_23_zip);
                data23.add(t_23_tele);
                data23.add(t_23_mobile);
                data23.add(t_23_dstr_inv);
                data23.add(t_23_active);
                data23.add(t_23_email);
                data23.add(t_23_lastupdate);
                data23.add(t_23_user);
                data23.add(t_23_flag);




            }
            int rows_number = field23.size();
            int row_index = 0;
            for (int i = 0; i <data23.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data23, field23, tablename_23, row_index);
                row_index += rows_number;
            }

        }catch(Exception e){Log.e("Exception in table 23",e.toString());}
        try{

            JSONObject jsonObject_insert_35 = new JSONObject(input_data);
            JSONArray jsonArray35 = jsonObject_insert_35.getJSONArray(Config.TAG_ARRAY_35);
            for (int c = 0; c < jsonArray35.length(); c++) {
                JSONObject jsonObject_getting_35 = (JSONObject) jsonArray35.get(c);
                t_35_store_id=jsonObject_getting_35.getString(Config.RETAIL_TOP_PRODUCT_STORE_ID);
                t_35_prod_id=jsonObject_getting_35.getString(Config.RETAIL_TOP_PRODUCT_PROD_ID);
                t_35_prod_nm=jsonObject_getting_35.getString(Config.RETAIL_TOP_PRODUCT_PROD_NM);
                t_35_prod_short_name=jsonObject_getting_35.getString(Config.RETAIL_TOP_PRODUCT_PROD_SHORT_NM);
                t_35_last_update=jsonObject_getting_35.getString(Config.RETAIL_TOP_PRODUCT_LAST_UPDATE);
                t_35_s_flag=jsonObject_getting_35.getString(Config.RETAIL_TOP_PRODUCT_S_FLAG);


                data35.add(t_35_store_id);
                data35.add(t_35_prod_id);
                data35.add(t_35_prod_nm);
                data35.add(t_35_prod_short_name);
                data35.add(t_35_last_update);
                data35.add(t_35_s_flag);



            }
            int rows_number = field35.size();
            int row_index = 0;
            for (int i = 0; i <data35.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data35, field35, tablename_35, row_index);
                row_index += rows_number;
            }
        }catch(Exception e){Log.e("Exception in table 35",e.toString());}

        try{
            JSONObject jsonObject_insert_36 = new JSONObject(input_data);
            JSONArray jsonArray36 = jsonObject_insert_36.getJSONArray(Config.TAG_ARRAY_36);
            for (int c = 0; c < jsonArray36.length(); c++) {
                JSONObject jsonObject_getting_36 = (JSONObject) jsonArray36.get(c);

                t_36_vend_dstr_id=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_VEND_DSTR_ID);
                t_36_store_id=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_STORE_ID);
                t_36_vend_dstr_nm=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_VEND_DSTR_NM);
                t_36_email=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_EMAIL);
                t_36_vend_dstr_add=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_VEND_DSTR_ADD);
                t_36_vend_dstr_city=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_VEND_DSTR_CITY);
                t_36_vend_dstr_ctr=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_VEND_DSTR_CTR);
                t_36_vend_dstr_zip=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_VEND_DSTR_ZIP);
                t_36_vend_dstr_inv=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_VEND_DSTR_INV);
                t_36_active=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_ACTIVE);
                t_36_lastupdate=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_LAST_UPDATE);
                t_36_s_flag=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_S_FLAG);
                t_36_user=jsonObject_getting_36.getString(Config.RETAIL_VEND_DSTR_USER);

                data36.add(t_36_vend_dstr_id);
                data36.add(t_36_store_id);
                data36.add(t_36_vend_dstr_nm);
                data36.add(t_36_email);
                data36.add(t_36_vend_dstr_add);
                data36.add(t_36_vend_dstr_city);
                data36.add(t_36_vend_dstr_ctr);
                data36.add(t_36_vend_dstr_zip);
                data36.add(t_36_vend_dstr_inv);
                data36.add(t_36_active);
                data36.add(t_36_lastupdate);
                data36.add(t_36_s_flag);
                data36.add(t_36_user);


            }
            int rows_number = field36.size();
            int row_index = 0;
            for (int i = 0; i <data36.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data36, field36, tablename_36, row_index);
                row_index += rows_number;

            }

        }catch (Exception e){Log.e("Exception in Table 36",e.toString());}



        try{

            JSONObject jsonObject_insert_45 = new JSONObject(input_data);
            JSONArray jsonArray45 = jsonObject_insert_45.getJSONArray(Config.TAG_ARRAY_45);
            for (int c = 0; c < jsonArray45.length(); c++) {
                JSONObject jsonObject_getting_45 = (JSONObject) jsonArray45.get(c);
                t_45_Store_id=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_STORE_ID);
                t_45_prod_Id=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_PROD_ID);
                t_45_Prod_nm=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_PROD_NM);
                t_45_barcode=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_BARCODE);
                t_45_mrp=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_MRP);
                t_45_s_price=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_S_PRICE);
                t_45_P_price=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_P_PRICE);
                t_45_Selling_Order_unit=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_SELLING_ORDER_UNIT);
                t_45_Internet_price=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_INTERNET_PRICE);
                t_45_Is_Prod_Rel_int=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_IS_PROD_REL_INT);
                t_45_tax_desc=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_TAX_DESC);
                t_45_Prod_hier_Desc_3=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_PROD_HIER_DESC_3);
                t_45_Pack_unit_1=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_PACK_UNIT_1);
                t_45_Pack_unit_2=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_PACK_UNIT_2);
                t_45_mfg=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_MFG);
                t_45_IS_Batch=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_IS_BATCH);
                t_45_active=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_ACTIVE);
                t_45_c_img=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_C_IMG);
                t_45_conv_fact=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_CONV_FACT);
                t_45_Profit_margin=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_PROFIT_MARGIN);
                t_45_lastupdate=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_LAST_UPDATE);
                t_45_user=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_USER);
                t_45_s_Flag=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_S_FLAG);
                t_45_Ind_nm=jsonObject_getting_45.getString(Config.RETAIL_STORE_PROD_CPG_IND_NM);

                data45.add(t_45_Store_id);
                data45.add(t_45_prod_Id);
                data45.add(t_45_Prod_nm);
                data45.add(t_45_barcode);
                data45.add(t_45_mrp);
                data45.add(t_45_s_price);
                data45.add(t_45_P_price);
                data45.add(t_45_Selling_Order_unit);
                data45.add(t_45_Internet_price);
                data45.add(t_45_Is_Prod_Rel_int);
                data45.add(t_45_tax_desc);
                data45.add(t_45_Prod_hier_Desc_3);
                data45.add(t_45_Pack_unit_1);
                data45.add(t_45_Pack_unit_2);
                data45.add(t_45_mfg);
                data45.add(t_45_IS_Batch);
                data45.add(t_45_active);
                data45.add(t_45_c_img);
                data45.add(t_45_conv_fact);
                data45.add(t_45_Profit_margin);
                data45.add(t_45_lastupdate);
                data45.add(t_45_user);
                data45.add(t_45_s_Flag);
                data45.add(t_45_Ind_nm);




            }
            int rows_number = field45.size();
            int row_index = 0;
            for (int i = 0; i <data45.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data45, field45, tablename_45, row_index);
                row_index += rows_number;

            }

        }catch(Exception e){Log.e("Exception in Table 45",e.toString());}

        try {
            JSONObject jsonObject_insert_46 = new JSONObject(input_data);
            JSONArray jsonArray46 = jsonObject_insert_46.getJSONArray(Config.TAG_ARRAY_46);
            for (int c = 0; c < jsonArray46.length(); c++) {
                JSONObject jsonObject_getting_46 = (JSONObject) jsonArray46.get(c);
                t_46_store_id = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_STORE_ID);
                t_46_prod_id = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_PROD_ID);
                t_46_prod_nm = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_PROD_NAME);
                t_46_barcode = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_BARCODE);
                t_46_mrp = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_MRP);
                t_46_s_price = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_S_PRICE);
                t_46_p_price = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_P_PRICE);
                t_46_tax_id = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_SELLING_ORDER_UNIT);
                t_46_internet_price = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_INTERNET_PRICE);
                t_46_is_prod_rel_int = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_IS_PROD_REL_INT);
                t_46_active = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_ACTIVE);
                t_46_profit_margin = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_PROFIT_MARGIN);
                t_46_last_update = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_LAST_UPDATE);
                t_46_s_flag = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_S_FLAG);
                t_46_ind_nm = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_IND_NM);
                t_46_conv_fact = jsonObject_getting_46.getString(Config.RETAIL_STORE_PROD_LOCAL_CONV_FACT);

                data46.add(t_46_store_id);
                data46.add(t_46_prod_id);
                data46.add(t_46_prod_nm);
                data46.add(t_46_barcode);
                data46.add(t_46_mrp);
                data46.add(t_46_s_price);
                data46.add(t_46_p_price);
                data46.add(t_46_tax_id);
                data46.add(t_46_internet_price);
                data46.add(t_46_is_prod_rel_int);
                data46.add(t_46_active);
                data46.add(t_46_profit_margin);
                data46.add(t_46_last_update);
                data46.add(t_46_s_flag);
                data46.add(t_46_ind_nm);
                data46.add(t_46_conv_fact);
            }
            int rows_number = field46.size();
            int row_index = 0;
            for (int i = 0; i <data46.size() - 1; i = i + rows_number) {

                insert(MainActivity.this, data46, field46, tablename_46, row_index);
                row_index += rows_number;

            }
        }
        catch(Exception e){Log.e("Exception in Table 46",e.toString());}

        Toast.makeText(getApplicationContext(),"Download Completed",Toast.LENGTH_LONG).show();
    }



    public void createDynamicDatabase(Context context, String tableName, ArrayList<String> title) {
        Log.i("INSIDE LoginDatabase", "****creatLoginDatabase*****");
        try {
            int i;
            String querryString;
            myDataBase = context.openOrCreateDatabase("Db", Context.MODE_WORLD_WRITEABLE, null);         //Opens database in writable mode.

            querryString = title.get(0) + " NVARCHAR(30),";
            Log.d("**createDynamicDatabase", "in oncreate");
            for (i = 1; i < title.size()-1; i++) {
                querryString += title.get(i);
                querryString += " NVARCHAR(30) ";
                querryString += ",";
            }
            querryString += title.get(i) + " NVARCHAR(30) ";
            querryString = "CREATE TABLE IF NOT EXISTS " + tableName + "(" + querryString + ");";
            System.out.println("Create Table Stmt : " + querryString);

            myDataBase.execSQL(querryString);
            //   Toast.makeText(this, "Table "+ tablename_first +" created.", Toast.LENGTH_SHORT).show();
           myDataBase.close();
        } catch (SQLException ex) {
            Log.i("CreateDB Exception ", ex.getMessage());
        }
    }
    int insertion_index=0;
    public void insert(Context context, ArrayList<String>array_vals, ArrayList<String> title, String TABLE_NAME, int row_index) {
        Log.d("Inside Insert", "Insertion starts for table name: " + TABLE_NAME);
        myDataBase = context.openOrCreateDatabase("Db", Context.MODE_WORLD_WRITEABLE, null);         //Opens database in writable mode.

        String titleString = null;
        String markString = null;
        int i=0,c=0;
        titleString = title.get(0) + ",";
        markString ="'" + array_vals.get(row_index) + "','";



        for (i = 1; i < title.size() - 1; i++) {
            titleString += title.get(i);
            titleString += ",";


        }


        for (c = row_index+1; c <row_index+(title.size()-1); c++) {
            Log.d("**Inserting Column", "in On create");
            Log.d("Column index", String.valueOf(c));
            markString += array_vals.get(c);
            markString += "','";
        }

        Log.d("**createDynamicDatabase", "in oncreate");

        titleString += title.get(i);
        markString += array_vals.get(c) + "'";

        INSERT = "insert into " + TABLE_NAME + "(" + titleString + ")" + "values" + "(" + markString + ")";
        insertion_index++;

        Log.d("Insert called", String.valueOf(insertion_index));

        System.out.println("Insert statement: " + INSERT);
        int s = 0;

        //  while (s < array_vals.size()) {

        //System.out.println("Size of array1" + array_vals.size());
        int j = 1;
        this.insertStmt = this.myDataBase.compileStatement(INSERT);
         /*   for (int k = 0; k < title.size(); k++) {

                System.out.println("BindString: insertStmt.bindString(" + j + "," + array_vals.get(k + s) + ")");
              //  insertStmt.bindString(j, array_vals.get(k + s));
                j++;
            }*/
        //  s += title.size();
        // }
        insertStmt.executeInsert();

        int flagger=1;
        myDataBase.close();

    }
    private void getJSON() {
        class GetJSON extends AsyncTask<Void, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this, "Fetching Data", "Wait...", false, false);


            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                JSON_STRING = s;
                jsonparsed(s);



            }

            @Override
            protected String doInBackground(Void... params) {
                JSONParser rh = new JSONParser();
                String s = rh.sendGetRequest(Config.Link_Download);
                return s;

            }
        }
        GetJSON gj = new GetJSON();
        gj.execute();
    }
    private void getJSON_TABLE_DATA() {
        class GetJSON2 extends AsyncTask<Void, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this, "Fetching Data", "Wait...", false, false);


            }

            @Override
            protected void onPostExecute(String s1) {
                super.onPostExecute(s1);
                loading.dismiss();
                JSON_STRING1 = s1;
                jsonInsert(s1);



            }

            @Override
            protected String doInBackground(Void... params) {
//                loading = ProgressDialog.show(MainActivity.this, "Loading Data", "Wait...", false, false);

                JSONParser rh = new JSONParser();
                String s1 = rh.sendGetRequestParam(Config.LINK_JSON,STORE_ID);
                return s1;

            }
        }
        GetJSON2 gj1 = new GetJSON2();
        gj1.execute();
    }

    @Override
    public void onClick(View v) {
        if(v==showjson){
           /* JSONParser jsonParser=new JSONParser();
            String s= jsonParser.sendGetRequest(Config.LINK_JSON);
            jsonparsed(s);*/
          //  Intent intent = new Intent(getApplicationContext(),ShowTable.class);
           // startActivity(intent);
      Toast.makeText(getApplicationContext(),"No Class",Toast.LENGTH_LONG).show();

        }
        if(v==submitButton){
            STORE_ID = storeID.getText().toString().trim();

            getJSON_TABLE_DATA();
        }

        if(v==btn_media_activity){

            Intent intent = new Intent(getApplicationContext(),MediaActivity.class);
            startActivity(intent);



        }

    }
}
