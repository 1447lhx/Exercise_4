package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.exercise_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MainActivity extends AppCompatActivity {
    private  final static String NAME="Sname";
    private final static String CLASS="Sclass";
    private final static String NUMBER="Snum";
    private final static String SEX="Ssex";
    private final static String TEL="Stel";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String sname[]={"张三","李四"};
        String sclass[]={"1401","1402"};
        String snum[]={"20140112","20140113"};
        String ssex[]={"男","男"};
        String stel[]={"3289374","7238922"};
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<sname.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME,sname[i]);
            item.put(CLASS,sclass[i]);
            item.put(NUMBER,snum[i]);
            item.put(SEX,ssex[i]);
            item.put(TEL,stel);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,
                new String[]{NAME,CLASS,NUMBER,SEX,TEL},new int[]{R.id.name,R.id.classes,R.id.num,R.id.sex,R.id.tel});
        ListView list=(ListView)findViewById(R.id.item_list);
        list.setAdapter(adapter);
    }}