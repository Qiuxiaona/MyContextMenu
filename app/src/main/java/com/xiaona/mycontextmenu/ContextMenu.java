package com.xiaona.mycontextmenu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ContextMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //没有下面内容点击无反应
        TextView tv=new TextView(this);
        tv.setText("上下文菜单的载体");
        registerForContextMenu(tv);
        setContentView(tv);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        super.onContextItemSelected(item);
        switch(item.getItemId()){
            case 1://做新建事情
                break;
            case 2://做打开事情
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,1,1,R.string.new1);
        menu.add(0,2,2,R.string.open);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}
