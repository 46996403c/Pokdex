package sample;

import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Datos {
    public ImageView IVsprite;
    public TextField TFescribirPokemon;
    public MenuButton MBseleccionarPokemon;
    public Text TnombreVariable;
    public Text TpesoVariable;
    public Text TalturaVariable;
    public Text TtipoVariable;
    public Text TespecieVariable;
    public Slider SBzoom;
    //=============151 POKEMON===================
    public MenuItem MIBulbasaur;
    public MenuItem MIIvysaur;
    public MenuItem MIVenusaur;
    public MenuItem MICharmander;
    public MenuItem MICharmeleon;
    public MenuItem MICharizard;
    public MenuItem MISquirtle;
    public MenuItem MIWartortle;
    public MenuItem MIBlastoise;
    public MenuItem MICaterpie;
    public MenuItem MIMetapod;
    public MenuItem MIButterfree;
    public MenuItem MIWeedle;
    public MenuItem MIKakuna;
    public MenuItem MIBeedrill;
    public MenuItem MIPidgey;
    public MenuItem MIPidgeotto;
    public MenuItem MIPidgeot;
    public MenuItem MIRattata;
    public MenuItem MIRaticate;
    public MenuItem MISpearow;
    public MenuItem MIFearow;
    public MenuItem MIEkans;
    public MenuItem MIArbok;
    public MenuItem MIPikachu;
    public MenuItem MIRaichu;
    public MenuItem MISandshrew;
    public MenuItem MISandslash;
    public MenuItem MINidoran_Hembra;
    public MenuItem MINidorina;
    public MenuItem MINidoqueen;
    public MenuItem MINidoran_Macho;
    public MenuItem MINidorino;
    public MenuItem MINidoking;
    public MenuItem MIClefairy;
    public MenuItem MIClefable;
    public MenuItem MIVulpix;
    public MenuItem MINinetales;
    public MenuItem MIJigglypuff;
    public MenuItem MIWigglytuff;
    public MenuItem MIZubat;
    public MenuItem MIGolbat;
    public MenuItem MIOddish;
    public MenuItem MIGloom;
    public MenuItem MIVileplume;
    public MenuItem MIParas;
    public MenuItem MIParasect;
    public MenuItem MIVenonat;
    public MenuItem MIVenomoth;
    public MenuItem MIDiglett;
    public MenuItem MIDugtrio;
    public MenuItem MIMeowth;
    public MenuItem MIPersian;
    public MenuItem MIPsyduck;
    public MenuItem MIGolduck;
    public MenuItem MIMankey;
    public MenuItem MIPrimeape;
    public MenuItem MIGrowlithe;
    public MenuItem MIArcanine;
    public MenuItem MIPoliwag;
    public MenuItem MIPoliwhirl;
    public MenuItem MIPoliwrath;
    public MenuItem MIAbra;
    public MenuItem MIKadabra;
    public MenuItem MIAlakazam;
    public MenuItem MIMachop;
    public MenuItem MIMachoke;
    public MenuItem MIMachamp;
    public MenuItem MIBellsprout;
    public MenuItem MIWeepinbell;
    public MenuItem MIVictreebel;
    public MenuItem MITentacool;
    public MenuItem MITentacruel;
    public MenuItem MIGeodude;
    public MenuItem MIGraveler;
    public MenuItem MIGolem;
    public MenuItem MIPonyta;
    public MenuItem MIRapidash;
    public MenuItem MISlowpoke;
    public MenuItem MISlowbro;
    public MenuItem MIMagnemite;
    public MenuItem MIMagneton;
    public MenuItem MIFarfetch_d;
    public MenuItem MIDoduo;
    public MenuItem MIDodrio;
    public MenuItem MISeel;
    public MenuItem MIDewgong;
    public MenuItem MIGrimer;
    public MenuItem MIMuk;
    public MenuItem MIShellder;
    public MenuItem MICloyster;
    public MenuItem MIGastly;
    public MenuItem MIHaunter;
    public MenuItem MIGengar;
    public MenuItem MIOnix;
    public MenuItem MIDrowzee;
    public MenuItem MIHypno;
    public MenuItem MIKrabby;
    public MenuItem MIKingler;
    public MenuItem MIVoltorb;
    public MenuItem MIElectrode;
    public MenuItem MIExeggcute;
    public MenuItem MIExeggutor;
    public MenuItem MICubone;
    public MenuItem MIMarowak;
    public MenuItem MIHitmonlee;
    public MenuItem MIHitmonchan;
    public MenuItem MILickitung;
    public MenuItem MIKoffing;
    public MenuItem MIWeezing;
    public MenuItem MIRhyhorn;
    public MenuItem MIRhydon;
    public MenuItem MIChansey;
    public MenuItem MITangela;
    public MenuItem MIKangaskhan;
    public MenuItem MIHorsea;
    public MenuItem MISeadra;
    public MenuItem MIGoldeen;
    public MenuItem MISeaking;
    public MenuItem MIStaryu;
    public MenuItem MIStarmie;
    public MenuItem MIMr_Mime;
    public MenuItem MIScyther;
    public MenuItem MIJynx;
    public MenuItem MIElectabuzz;
    public MenuItem MIMagmar;
    public MenuItem MIPinsir;
    public MenuItem MITauros;
    public MenuItem MIMagikarp;
    public MenuItem MIGyarados;
    public MenuItem MILapras;
    public MenuItem MIDitto;
    public MenuItem MIEevee;
    public MenuItem MIVaporeon;
    public MenuItem MIJolteon;
    public MenuItem MIFlareon;
    public MenuItem MIPorygon;
    public MenuItem MIOmanyte;
    public MenuItem MIOmastar;
    public MenuItem MIKabuto;
    public MenuItem MIKabutops;
    public MenuItem MIAerodactyl;
    public MenuItem MISnorlax;
    public MenuItem MIArticuno;
    public MenuItem MIZapdos;
    public MenuItem MIMoltres;
    public MenuItem MIDratini;
    public MenuItem MIDragonair;
    public MenuItem MIDragonite;
    public MenuItem MIMewtwo;
    public MenuItem MIMew;

    public String nombre2;
    public String ID="";
    public String URLbase = "http://pokeapi.co/api/v1/pokemon/";
    public JSONObject obj;

    public void Reset(){
        //TFescribirPokemon.clear();
        TnombreVariable.setText("");
        TpesoVariable.setText("");
        TalturaVariable.setText("");
        TtipoVariable.setText("");
        TespecieVariable.setText("");
        MBseleccionarPokemon.setText("Selecciona un Pokemon");
        IVsprite.setImage(null);
        ID="";
        ResetZoom();
    }
    public void ResetZoom(){
        SBzoom.setValue(120);
    }
    public void VerPokemons (javafx.event.ActionEvent actionEventPokmon) throws ParserConfigurationException, IOException, SAXException, JSONException {
        Reset();
        if (actionEventPokmon.getSource().equals(MIBulbasaur)) {
            ID = "1";
        }
        if (actionEventPokmon.getSource().equals(MIIvysaur)) {
            ID = "2";
        }
        if (actionEventPokmon.getSource().equals(MIVenusaur)) {
            ID = "3";
        }
        if (actionEventPokmon.getSource().equals(MICharmander)) {
            ID = "4";
        }
        if (actionEventPokmon.getSource().equals(MICharmeleon)) {
            ID = "5";
        }
        if (actionEventPokmon.getSource().equals(MICharizard)) {
            ID = "6";
        }
        if (actionEventPokmon.getSource().equals(MISquirtle)) {
            ID = "7";
        }
        if (actionEventPokmon.getSource().equals(MIWartortle)) {
            ID = "8";
        }
        if (actionEventPokmon.getSource().equals(MIBlastoise)) {
            ID = "9";
        }
        if (actionEventPokmon.getSource().equals(MICaterpie)) {
            ID = "10";
        }
        if (actionEventPokmon.getSource().equals(MIMetapod)) {
            ID = "11";
        }
        if (actionEventPokmon.getSource().equals(MIButterfree)) {
            ID = "12";
        }
        if (actionEventPokmon.getSource().equals(MIWeedle)) {
            ID = "13";
        }
        if (actionEventPokmon.getSource().equals(MIKakuna)) {
            ID = "14";
        }
        if (actionEventPokmon.getSource().equals(MIBeedrill)) {
            ID = "15";
        }
        if (actionEventPokmon.getSource().equals(MIPidgey)) {
            ID = "16";
        }
        if (actionEventPokmon.getSource().equals(MIPidgeotto)) {
            ID = "17";
        }
        if (actionEventPokmon.getSource().equals(MIPidgeot)) {
            ID = "18";
        }
        if (actionEventPokmon.getSource().equals(MIRattata)) {
            ID = "19";
        }
        if (actionEventPokmon.getSource().equals(MIRaticate)) {
            ID = "20";
        }
        if (actionEventPokmon.getSource().equals(MISpearow)) {
            ID = "21";
        }
        if (actionEventPokmon.getSource().equals(MIFearow)) {
            ID = "22";
        }
        if (actionEventPokmon.getSource().equals(MIEkans)) {
            ID = "23";
        }
        if (actionEventPokmon.getSource().equals(MIArbok)) {
            ID = "24";
        }
        if (actionEventPokmon.getSource().equals(MIPikachu)) {
            ID = "25";
        }
        if (actionEventPokmon.getSource().equals(MIRaichu)) {
            ID = "26";
        }
        if (actionEventPokmon.getSource().equals(MISandshrew)) {
            ID = "27";
        }
        if (actionEventPokmon.getSource().equals(MISandslash)) {
            ID = "28";
        }
        if (actionEventPokmon.getSource().equals(MINidoran_Hembra)) {
            ID = "29";
        }
        if (actionEventPokmon.getSource().equals(MINidorina)) {
            ID = "30";
        }
        if (actionEventPokmon.getSource().equals(MINidoqueen)) {
            ID = "31";
        }
        if (actionEventPokmon.getSource().equals(MINidoran_Macho)) {
            ID = "32";
        }
        if (actionEventPokmon.getSource().equals(MINidorino)) {
            ID = "33";
        }
        if (actionEventPokmon.getSource().equals(MINidoking)) {
            ID = "34";
        }
        if (actionEventPokmon.getSource().equals(MIClefairy)) {
            ID = "35";
        }
        if (actionEventPokmon.getSource().equals(MIClefable)) {
            ID = "36";
        }
        if (actionEventPokmon.getSource().equals(MIVulpix)) {
            ID = "37";
        }
        if (actionEventPokmon.getSource().equals(MINinetales)) {
            ID = "38";
        }
        if (actionEventPokmon.getSource().equals(MIJigglypuff)) {
            ID = "39";
        }
        if (actionEventPokmon.getSource().equals(MIWigglytuff)) {
            ID = "40";
        }
        if (actionEventPokmon.getSource().equals(MIZubat)) {
            ID = "41";
        }
        if (actionEventPokmon.getSource().equals(MIGolbat)) {
            ID = "42";
        }
        if (actionEventPokmon.getSource().equals(MIOddish)) {
            ID = "43";
        }
        if (actionEventPokmon.getSource().equals(MIGloom)) {
            ID = "44";
        }
        if (actionEventPokmon.getSource().equals(MIVileplume)) {
            ID = "45";
        }
        if (actionEventPokmon.getSource().equals(MIParas)) {
            ID = "46";
        }
        if (actionEventPokmon.getSource().equals(MIParasect)) {
            ID = "47";
        }
        if (actionEventPokmon.getSource().equals(MIVenonat)) {
            ID = "48";
        }
        if (actionEventPokmon.getSource().equals(MIVenomoth)) {
            ID = "49";
        }
        if (actionEventPokmon.getSource().equals(MIDiglett)) {
            ID = "50";
        }
        if (actionEventPokmon.getSource().equals(MIDugtrio)) {
            ID = "51";
        }
        if (actionEventPokmon.getSource().equals(MIMeowth)) {
            ID = "52";
        }
        if (actionEventPokmon.getSource().equals(MIPersian)) {
            ID = "53";
        }
        if (actionEventPokmon.getSource().equals(MIPsyduck)) {
            ID = "54";
        }
        if (actionEventPokmon.getSource().equals(MIGolduck)) {
            ID = "55";
        }
        if (actionEventPokmon.getSource().equals(MIMankey)) {
            ID = "56";
        }
        if (actionEventPokmon.getSource().equals(MIPrimeape)) {
            ID = "57";
        }
        if (actionEventPokmon.getSource().equals(MIGrowlithe)) {
            ID = "58";
        }
        if (actionEventPokmon.getSource().equals(MIArcanine)) {
            ID = "59";
        }
        if (actionEventPokmon.getSource().equals(MIPoliwag)) {
            ID = "60";
        }
        if (actionEventPokmon.getSource().equals(MIPoliwhirl)) {
            ID = "61";
        }
        if (actionEventPokmon.getSource().equals(MIPoliwrath)) {
            ID = "62";
        }
        if (actionEventPokmon.getSource().equals(MIAbra)) {
            ID = "63";
        }
        if (actionEventPokmon.getSource().equals(MIKadabra)) {
            ID = "64";
        }
        if (actionEventPokmon.getSource().equals(MIAlakazam)) {
            ID = "65";
        }
        if (actionEventPokmon.getSource().equals(MIMachop)) {
            ID = "66";
        }
        if (actionEventPokmon.getSource().equals(MIMachoke)) {
            ID = "67";
        }
        if (actionEventPokmon.getSource().equals(MIMachamp)) {
            ID = "68";
        }
        if (actionEventPokmon.getSource().equals(MIBellsprout)) {
            ID = "69";
        }
        if (actionEventPokmon.getSource().equals(MIWeepinbell)) {
            ID = "70";
        }
        if (actionEventPokmon.getSource().equals(MIVictreebel)) {
            ID = "71";
        }
        if (actionEventPokmon.getSource().equals(MITentacool)) {
            ID = "72";
        }
        if (actionEventPokmon.getSource().equals(MITentacruel)) {
            ID = "73";
        }
        if (actionEventPokmon.getSource().equals(MIGeodude)) {
            ID = "74";
        }
        if (actionEventPokmon.getSource().equals(MIGraveler)) {
            ID = "75";
        }
        if (actionEventPokmon.getSource().equals(MIGolem)) {
            ID = "76";
        }
        if (actionEventPokmon.getSource().equals(MIPonyta)) {
            ID = "77";
        }
        if (actionEventPokmon.getSource().equals(MIRapidash)) {
            ID = "78";
        }
        if (actionEventPokmon.getSource().equals(MISlowpoke)) {
            ID = "79";
        }
        if (actionEventPokmon.getSource().equals(MISlowbro)) {
            ID = "80";
        }
        if (actionEventPokmon.getSource().equals(MIMagnemite)) {
            ID = "81";
        }
        if (actionEventPokmon.getSource().equals(MIMagneton)) {
            ID = "82";
        }
        if (actionEventPokmon.getSource().equals(MIFarfetch_d)) {
            ID = "83";
        }
        if (actionEventPokmon.getSource().equals(MIDoduo)) {
            ID = "84";
        }
        if (actionEventPokmon.getSource().equals(MIDodrio)) {
            ID = "85";
        }
        if (actionEventPokmon.getSource().equals(MISeel)) {
            ID = "86";
        }
        if (actionEventPokmon.getSource().equals(MIDewgong)) {
            ID = "87";
        }
        if (actionEventPokmon.getSource().equals(MIGrimer)) {
            ID = "88";
        }
        if (actionEventPokmon.getSource().equals(MIMuk)) {
            ID = "89";
        }
        if (actionEventPokmon.getSource().equals(MIShellder)) {
            ID = "90";
        }
        if (actionEventPokmon.getSource().equals(MICloyster)) {
            ID = "91";
        }
        if (actionEventPokmon.getSource().equals(MIGastly)) {
            ID = "92";
        }
        if (actionEventPokmon.getSource().equals(MIHaunter)) {
            ID = "93";
        }
        if (actionEventPokmon.getSource().equals(MIGengar)) {
            ID = "94";
        }
        if (actionEventPokmon.getSource().equals(MIOnix)) {
            ID = "95";
        }
        if (actionEventPokmon.getSource().equals(MIDrowzee)) {
            ID = "96";
        }
        if (actionEventPokmon.getSource().equals(MIHypno)) {
            ID = "97";
        }
        if (actionEventPokmon.getSource().equals(MIKrabby)) {
            ID = "98";
        }
        if (actionEventPokmon.getSource().equals(MIKingler)) {
            ID = "99";
        }
        if (actionEventPokmon.getSource().equals(MIVoltorb)) {
            ID = "100";
        }
        if (actionEventPokmon.getSource().equals(MIElectrode)) {
            ID = "101";
        }
        if (actionEventPokmon.getSource().equals(MIExeggcute)) {
            ID = "102";
        }
        if (actionEventPokmon.getSource().equals(MIExeggutor)) {
            ID = "103";
        }
        if (actionEventPokmon.getSource().equals(MICubone)) {
            ID = "104";
        }
        if (actionEventPokmon.getSource().equals(MIMarowak)) {
            ID = "105";
        }
        if (actionEventPokmon.getSource().equals(MIHitmonlee)) {
            ID = "106";
        }
        if (actionEventPokmon.getSource().equals(MIHitmonchan)) {
            ID = "107";
        }
        if (actionEventPokmon.getSource().equals(MILickitung)) {
            ID = "108";
        }
        if (actionEventPokmon.getSource().equals(MIKoffing)) {
            ID = "109";
        }
        if (actionEventPokmon.getSource().equals(MIWeezing)) {
            ID = "110";
        }
        if (actionEventPokmon.getSource().equals(MIRhyhorn)) {
            ID = "111";
        }
        if (actionEventPokmon.getSource().equals(MIRhydon)) {
            ID = "112";
        }
        if (actionEventPokmon.getSource().equals(MIChansey)) {
            ID = "113";
        }
        if (actionEventPokmon.getSource().equals(MITangela)) {
            ID = "114";
        }
        if (actionEventPokmon.getSource().equals(MIKangaskhan)) {
            ID = "115";
        }
        if (actionEventPokmon.getSource().equals(MIHorsea)) {
            ID = "116";
        }
        if (actionEventPokmon.getSource().equals(MISeadra)) {
            ID = "117";
        }
        if (actionEventPokmon.getSource().equals(MIGoldeen)) {
            ID = "118";
        }
        if (actionEventPokmon.getSource().equals(MISeaking)) {
            ID = "119";
        }
        if (actionEventPokmon.getSource().equals(MIStaryu)) {
            ID = "120";
        }
        if (actionEventPokmon.getSource().equals(MIStarmie)) {
            ID = "121";
        }
        if (actionEventPokmon.getSource().equals(MIMr_Mime)) {
            ID = "122";
        }
        if (actionEventPokmon.getSource().equals(MIScyther)) {
            ID = "123";
        }
        if (actionEventPokmon.getSource().equals(MIJynx)) {
            ID = "124";
        }
        if (actionEventPokmon.getSource().equals(MIElectabuzz)) {
            ID = "125";
        }
        if (actionEventPokmon.getSource().equals(MIMagmar)) {
            ID = "126";
        }
        if (actionEventPokmon.getSource().equals(MIPinsir)) {
            ID = "127";
        }
        if (actionEventPokmon.getSource().equals(MITauros)) {
            ID = "128";
        }
        if (actionEventPokmon.getSource().equals(MIMagikarp)) {
            ID = "129";
        }
        if (actionEventPokmon.getSource().equals(MIGyarados)) {
            ID = "130";
        }
        if (actionEventPokmon.getSource().equals(MILapras)) {
            ID = "131";
        }
        if (actionEventPokmon.getSource().equals(MIDitto)) {
            ID = "132";
        }
        if (actionEventPokmon.getSource().equals(MIEevee)) {
            ID = "133";
        }
        if (actionEventPokmon.getSource().equals(MIVaporeon)) {
            ID = "134";
        }
        if (actionEventPokmon.getSource().equals(MIJolteon)) {
            ID = "135";
        }
        if (actionEventPokmon.getSource().equals(MIFlareon)) {
            ID = "136";
        }
        if (actionEventPokmon.getSource().equals(MIPorygon)) {
            ID = "137";
        }
        if (actionEventPokmon.getSource().equals(MIOmanyte)) {
            ID = "138";
        }
        if (actionEventPokmon.getSource().equals(MIOmastar)) {
            ID = "139";
        }
        if (actionEventPokmon.getSource().equals(MIKabuto)) {
            ID = "140";
        }
        if (actionEventPokmon.getSource().equals(MIKabutops)) {
            ID = "141";
        }
        if (actionEventPokmon.getSource().equals(MIAerodactyl)) {
            ID = "142";
        }
        if (actionEventPokmon.getSource().equals(MISnorlax)) {
            ID = "143";
        }
        if (actionEventPokmon.getSource().equals(MIArticuno)) {
            ID = "144";
        }
        if (actionEventPokmon.getSource().equals(MIZapdos)) {
            ID = "145";
        }
        if (actionEventPokmon.getSource().equals(MIMoltres)) {
            ID = "146";
        }
        if (actionEventPokmon.getSource().equals(MIDratini)) {
            ID = "147";
        }
        if (actionEventPokmon.getSource().equals(MIDragonair)) {
            ID = "148";
        }
        if (actionEventPokmon.getSource().equals(MIDragonite)) {
            ID = "149";
        }
        if (actionEventPokmon.getSource().equals(MIMewtwo)) {
            ID = "150";
        }
        if (actionEventPokmon.getSource().equals(MIMew)) {
            ID = "151";
        }

        String nombre = String.valueOf(actionEventPokmon.getSource().toString());
        System.out.println(nombre);
        nombre2 = nombre.substring(14, nombre.indexOf(","));
        System.out.println(nombre2);

        LlamadaApi();
    }
    public void LlamadaApi() throws IOException, JSONException {
        System.out.println("http://pokeapi.co/media/img/"+ this.ID +".png");
        Image imgPoke = new Image("http://pokeapi.co/media/img/"+ this.ID +".png");
        IVsprite.setImage(imgPoke);

        MBseleccionarPokemon.setText(nombre2);

        // build a URL
        URL urlApi = new URL(URLbase+ this.ID);
        System.out.println(urlApi);

        // read from the URL
        Scanner scan = new Scanner(urlApi.openStream());
        String str = "";
        while (scan.hasNext())
            str += scan.nextLine();
        scan.close();

        // build a JSON object
        obj = new JSONObject(str);

        // get the first result
        TnombreVariable.setText(obj.getString("name"));
        if (obj.getString("name").isEmpty()){
            TnombreVariable.setText("???");
        }
        TpesoVariable.setText(obj.getString("weight"));
        if (obj.getString("weight").isEmpty()){
            TpesoVariable.setText("???");
        }
        TalturaVariable.setText(obj.getString("height"));
        if (obj.getString("height").isEmpty()){
            TalturaVariable.setText("???");
        }
        TespecieVariable.setText(obj.getString("species"));
        if (obj.getString("species").isEmpty()){
            TespecieVariable.setText("???");
        }

        String tipo;
        String tipo2;
        tipo = String.valueOf(obj.getJSONArray("types").getJSONObject(0).getString("name"));
        if (!obj.getJSONArray("types").isNull(1)){
            tipo2 = String.valueOf(obj.getJSONArray("types").getJSONObject(1).getString("name"));
        } else{
            tipo2 = "";
        }
        TtipoVariable.setText(tipo+" "+tipo2);
    }
}
