<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="s19">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0"/>
        <node id="n1"/>
        <node id="n2"/>
        <node id="n4"/>
        <node id="n26"/>
        <node id="n27"/>
        <node id="n29"/>
        <node id="n30"/>
        <node id="n33"/>
        <node id="n34"/>
        <node id="n36"/>
        <node id="n37"/>
        <node id="n41"/>
        <node id="n43"/>
        <node id="n44"/>
        <node id="n45"/>
        <node id="n49"/>
        <node id="n51"/>
        <node id="n52"/>
        <node id="n53"/>
        <node id="n56"/>
        <node id="n58"/>
        <node id="n59"/>
        <node id="n60"/>
        <node id="n62"/>
        <node id="n63"/>
        <node id="n65"/>
        <node id="n66"/>
        <node id="n68"/>
        <node id="n69"/>
        <node id="n71"/>
        <node id="n72"/>
        <node id="n74"/>
        <node id="n75"/>
        <node id="n77"/>
        <node id="n78"/>
        <node id="n79"/>
        <node id="n81"/>
        <node id="n82"/>
        <node id="n83"/>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = int:0</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n0" to="n4">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n0" to="n81">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:order = int:0</string>
            </attr>
        </edge>
        <edge from="n1" to="n2">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:amount = int:10</string>
            </attr>
        </edge>
        <edge from="n26" to="n26">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n26" to="n26">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n26" to="n26">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n26" to="n27">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n26" to="n30">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n27" to="n27">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n27" to="n27">
            <attr name="label">
                <string>let:order = int:9</string>
            </attr>
        </edge>
        <edge from="n27" to="n27">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n27" to="n29">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n29" to="n29">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n29" to="n29">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n30" to="n30">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n30" to="n30">
            <attr name="label">
                <string>let:amount = int:1</string>
            </attr>
        </edge>
        <edge from="n30" to="n30">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n33" to="n33">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n33" to="n33">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n33" to="n33">
            <attr name="label">
                <string>let:order = int:8</string>
            </attr>
        </edge>
        <edge from="n33" to="n36">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n34" to="n33">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n34" to="n26">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n34" to="n37">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n36" to="n36">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n37" to="n37">
            <attr name="label">
                <string>let:amount = int:2</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>let:order = int:7</string>
            </attr>
        </edge>
        <edge from="n41" to="n41">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n41" to="n44">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n43" to="n43">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n43" to="n41">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n43" to="n34">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n43" to="n45">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>let:amount = int:3</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:order = int:6</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n49" to="n52">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n51" to="n51">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n51" to="n51">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n51" to="n51">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n51" to="n49">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n51" to="n43">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n51" to="n53">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n53" to="n53">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n53" to="n53">
            <attr name="label">
                <string>let:amount = int:4</string>
            </attr>
        </edge>
        <edge from="n53" to="n53">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>let:order = int:5</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n56" to="n59">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n58" to="n56">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n58" to="n51">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n58" to="n60">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n59" to="n59">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:amount = int:5</string>
            </attr>
        </edge>
        <edge from="n60" to="n60">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n62" to="n62">
            <attr name="label">
                <string>let:order = int:4</string>
            </attr>
        </edge>
        <edge from="n62" to="n65">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n63" to="n66">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n63" to="n62">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n63" to="n58">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>let:amount = int:6</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:order = int:3</string>
            </attr>
        </edge>
        <edge from="n68" to="n71">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n69" to="n72">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n69" to="n68">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n69" to="n69">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n69" to="n63">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n72" to="n72">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n72" to="n72">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n72" to="n72">
            <attr name="label">
                <string>let:amount = int:7</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>let:order = int:2</string>
            </attr>
        </edge>
        <edge from="n74" to="n77">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n75" to="n75">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n75" to="n78">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n75" to="n75">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n75" to="n74">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n75" to="n75">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n75" to="n69">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n77" to="n77">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n77" to="n77">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n78" to="n78">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n78" to="n78">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n78" to="n78">
            <attr name="label">
                <string>let:amount = int:8</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>let:order = int:1</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n79" to="n82">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n81" to="n81">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n81" to="n83">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n81" to="n81">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n81" to="n81">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n81" to="n79">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n81" to="n75">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n82" to="n82">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n82" to="n82">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n83" to="n83">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n83" to="n83">
            <attr name="label">
                <string>let:amount = int:9</string>
            </attr>
        </edge>
        <edge from="n83" to="n83">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
