<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="s24">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n3"/>
        <node id="n0"/>
        <node id="n6"/>
        <node id="n1"/>
        <node id="n34"/>
        <node id="n35"/>
        <node id="n38"/>
        <node id="n40"/>
        <node id="n44"/>
        <node id="n45"/>
        <node id="n47"/>
        <node id="n49"/>
        <node id="n51"/>
        <node id="n52"/>
        <node id="n54"/>
        <node id="n56"/>
        <node id="n57"/>
        <node id="n58"/>
        <node id="n61"/>
        <node id="n63"/>
        <node id="n65"/>
        <node id="n66"/>
        <node id="n67"/>
        <node id="n68"/>
        <node id="n71"/>
        <node id="n72"/>
        <node id="n73"/>
        <node id="n74"/>
        <node id="n76"/>
        <node id="n77"/>
        <node id="n78"/>
        <node id="n79"/>
        <node id="n82"/>
        <node id="n83"/>
        <node id="n84"/>
        <node id="n85"/>
        <node id="n87"/>
        <node id="n88"/>
        <node id="n89"/>
        <node id="n90"/>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:instant = int:20</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
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
        <edge from="n0" to="n76">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n0" to="n6">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:amount = int:100</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:order = int:0</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n1" to="n3">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n34" to="n35">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n34" to="n34">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n34" to="n40">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n35" to="n35">
            <attr name="label">
                <string>let:order = int:8</string>
            </attr>
        </edge>
        <edge from="n35" to="n38">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n38" to="n38">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n38" to="n38">
            <attr name="label">
                <string>let:instant = int:20</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:amount = int:100</string>
            </attr>
        </edge>
        <edge from="n40" to="n40">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n44" to="n49">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n44" to="n45">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n44" to="n44">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n44" to="n87">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>let:order = int:6</string>
            </attr>
        </edge>
        <edge from="n45" to="n45">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n45" to="n47">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n47" to="n47">
            <attr name="label">
                <string>let:instant = int:20</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n49" to="n49">
            <attr name="label">
                <string>let:amount = int:100</string>
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
        <edge from="n51" to="n52">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n51" to="n51">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n51" to="n82">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n51" to="n56">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>let:order = int:4</string>
            </attr>
        </edge>
        <edge from="n52" to="n52">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n52" to="n54">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n54" to="n54">
            <attr name="label">
                <string>let:instant = int:20</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n56" to="n56">
            <attr name="label">
                <string>let:amount = int:100</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n57" to="n63">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n57" to="n58">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n57" to="n57">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n57" to="n71">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:order = int:2</string>
            </attr>
        </edge>
        <edge from="n58" to="n58">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n58" to="n61">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n61" to="n61">
            <attr name="label">
                <string>let:instant = int:20</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n63" to="n63">
            <attr name="label">
                <string>let:amount = int:100</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n65" to="n65">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n66" to="n66">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n66" to="n0">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n66" to="n68">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n66" to="n65">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n67" to="n67">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:order = int:0</string>
            </attr>
        </edge>
        <edge from="n68" to="n67">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n68" to="n68">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n71" to="n71">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n71" to="n73">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n71" to="n51">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n71" to="n74">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n72" to="n72">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n72" to="n72">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n73" to="n73">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>let:order = int:4</string>
            </attr>
        </edge>
        <edge from="n74" to="n72">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n74" to="n74">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n76" to="n76">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n76" to="n76">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n76" to="n76">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n76" to="n78">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n76" to="n57">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n76" to="n79">
            <attr name="label">
                <string>timing</string>
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
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>let:order = int:2</string>
            </attr>
        </edge>
        <edge from="n79" to="n77">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n79" to="n79">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n82" to="n82">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n82" to="n84">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n82" to="n82">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n82" to="n82">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n82" to="n44">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n82" to="n85">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n83" to="n83">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n83" to="n83">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n84" to="n84">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n84" to="n84">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n84" to="n84">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n85" to="n85">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n85" to="n85">
            <attr name="label">
                <string>let:order = int:6</string>
            </attr>
        </edge>
        <edge from="n85" to="n83">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n85" to="n85">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
        <edge from="n87" to="n87">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n87" to="n87">
            <attr name="label">
                <string>let:action = string:&quot;TAKE&quot;</string>
            </attr>
        </edge>
        <edge from="n87" to="n87">
            <attr name="label">
                <string>let:medication = string:&quot;aspirin&quot;</string>
            </attr>
        </edge>
        <edge from="n87" to="n89">
            <attr name="label">
                <string>dose</string>
            </attr>
        </edge>
        <edge from="n87" to="n34">
            <attr name="label">
                <string>then</string>
            </attr>
        </edge>
        <edge from="n87" to="n90">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n88" to="n88">
            <attr name="label">
                <string>type:Instant</string>
            </attr>
        </edge>
        <edge from="n88" to="n88">
            <attr name="label">
                <string>let:instant = int:8</string>
            </attr>
        </edge>
        <edge from="n89" to="n89">
            <attr name="label">
                <string>type:Dose</string>
            </attr>
        </edge>
        <edge from="n89" to="n89">
            <attr name="label">
                <string>let:unit = string:&quot;MG&quot;</string>
            </attr>
        </edge>
        <edge from="n89" to="n89">
            <attr name="label">
                <string>let:amount = int:81</string>
            </attr>
        </edge>
        <edge from="n90" to="n90">
            <attr name="label">
                <string>type:Timing</string>
            </attr>
        </edge>
        <edge from="n90" to="n90">
            <attr name="label">
                <string>let:order = int:8</string>
            </attr>
        </edge>
        <edge from="n90" to="n88">
            <attr name="label">
                <string>instant</string>
            </attr>
        </edge>
        <edge from="n90" to="n90">
            <attr name="label">
                <string>let:unit = string:&quot;DAY&quot;</string>
            </attr>
        </edge>
    </graph>
</gxl>
