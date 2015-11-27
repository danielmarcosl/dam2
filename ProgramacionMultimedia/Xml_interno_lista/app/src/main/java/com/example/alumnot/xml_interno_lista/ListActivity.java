package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Daniel Marcos Lorrio on 25/11/2015.
 */
public class ListActivity extends Activity {
    // ArrayList that will contain each 'videogame' tag
    private ArrayList<Videogame> videogamesList = new ArrayList<Videogame>();
    // ArrayList that will contain the value of 'name' attribute of each 'game' tag
    private ArrayList<String> headerList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        try {
            parseXML();
            mountListView();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end onCreate

    /**
     * Parse a XML document and get the values of the attributes of the tags
     * @throws XmlPullParserException
     * @throws IOException
     */
    private void parseXML() throws XmlPullParserException, IOException {

        XmlPullParser parser = getResources().getXml(R.xml.videogames);
        int eventType = -1;

        while (eventType != XmlResourceParser.END_DOCUMENT) {
            eventType = parser.next();
            if (eventType == XmlResourceParser.START_TAG) {
                String currentTagName = parser.getName();
                if (currentTagName.equals("game")) {
                    String nameValue = parser.getAttributeValue(null, "name");
                    String platformValue = parser.getAttributeValue(null, "platform");
                    String yearValue = parser.getAttributeValue(null, "year");
                    String descriptionValue = parser.getAttributeValue(null, "description");

                    Videogame currentVideogame = new Videogame(nameValue, platformValue, yearValue, descriptionValue);

                    videogamesList.add(currentVideogame);
                    headerList.add(nameValue);
                }
            }
        }
    } // end parseXML

    /**
     * Create the view of the details of the selected item
     */
    private void mountListView() {
        ListView listView = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, headerList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListActivity.this, DetailActivity.class);

                i.putExtra("videogames", videogamesList.get(position));
                startActivity(i);
            }
        });
    } // end mountListView
}