<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph role="graph" edgeids="false" edgemode="directed" id="start">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n0">
            <attr name="layout">
                <string>129 539 141 112</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>533 566 91 48</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>535 503 81 32</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>699 637 90 48</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>697 505 90 48</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>131 741 141 112</string>
            </attr>
        </node>
        <node id="n9">
            <attr name="layout">
                <string>328 765 91 48</string>
            </attr>
        </node>
        <node id="n3">
            <attr name="layout">
                <string>533 653 81 32</string>
            </attr>
        </node>
        <node id="n10">
            <attr name="layout">
                <string>465 778 81 16</string>
            </attr>
        </node>
        <node id="n11">
            <attr name="layout">
                <string>589 760 90 48</string>
            </attr>
        </node>
        <node id="n12">
            <attr name="layout">
                <string>729 743 85 80</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>355 567 97 48</string>
            </attr>
        </node>
        <node id="n8">
            <attr name="layout">
                <string>352 498 108 32</string>
            </attr>
        </node>
        <node id="n13">
            <attr name="layout">
                <string>353 653 108 32</string>
            </attr>
        </node>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:RxID = 3</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:action = "TAKE"</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:duration = 10</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:medication = "warfarin"</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:repeats = 0</string>
            </attr>
        </edge>
        <edge from="n0" to="n0">
            <attr name="label">
                <string>let:start = "01.04.2015"</string>
            </attr>
        </edge>
        <edge from="n0" to="n1">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:frame = "DAY"</string>
            </attr>
        </edge>
        <edge from="n2" to="n2">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n2" to="n4">
            <attr name="label">
                <string>point</string>
            </attr>
            <attr name="layout">
                <string>520 26 578 590 575 519 11</string>
            </attr>
        </edge>
        <edge from="n2" to="n3">
            <attr name="label">
                <string>point</string>
            </attr>
            <attr name="layout">
                <string>485 -31 578 590 573 669 11</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>type:AtomicPoint</string>
            </attr>
        </edge>
        <edge from="n4" to="n4">
            <attr name="label">
                <string>let:value = 20</string>
            </attr>
        </edge>
        <edge from="n4" to="n6">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:amount = 100</string>
            </attr>
        </edge>
        <edge from="n5" to="n5">
            <attr name="label">
                <string>let:unit = "mg"</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:amount = 200</string>
            </attr>
        </edge>
        <edge from="n6" to="n6">
            <attr name="label">
                <string>let:unit = "mg"</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>type:Prescription</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:RxID = 6</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:action = "TAKE"</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:duration = 10</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:medication = "aspirin"</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:repeats = 1</string>
            </attr>
        </edge>
        <edge from="n7" to="n7">
            <attr name="label">
                <string>let:start = "01.04.2015"</string>
            </attr>
        </edge>
        <edge from="n7" to="n9">
            <attr name="label">
                <string>timing</string>
            </attr>
            <attr name="layout">
                <string>447 -20 201 797 373 789 11</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:frame = "DAY"</string>
            </attr>
        </edge>
        <edge from="n9" to="n9">
            <attr name="label">
                <string>let:frequency = 1</string>
            </attr>
        </edge>
        <edge from="n9" to="n10">
            <attr name="label">
                <string>point</string>
            </attr>
            <attr name="layout">
                <string>571 -19 373 789 505 786 11</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>type:AtomicPoint</string>
            </attr>
        </edge>
        <edge from="n3" to="n3">
            <attr name="label">
                <string>let:value = 8</string>
            </attr>
        </edge>
        <edge from="n3" to="n5">
            <attr name="label">
                <string>dosing</string>
            </attr>
        </edge>
        <edge from="n10" to="n10">
            <attr name="label">
                <string>type:AtomicPoint</string>
            </attr>
        </edge>
        <edge from="n10" to="n11">
            <attr name="label">
                <string>dosing</string>
            </attr>
            <attr name="layout">
                <string>242 -21 505 786 634 784 11</string>
            </attr>
        </edge>
        <edge from="n11" to="n11">
            <attr name="label">
                <string>type:Dosing</string>
            </attr>
        </edge>
        <edge from="n11" to="n11">
            <attr name="label">
                <string>let:amount = 100</string>
            </attr>
        </edge>
        <edge from="n11" to="n11">
            <attr name="label">
                <string>let:unit = "mg"</string>
            </attr>
        </edge>
        <edge from="n11" to="n12">
            <attr name="label">
                <string>titrate</string>
            </attr>
            <attr name="layout">
                <string>425 -35 634 784 771 783 11</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>type:Titrate</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>let:dstep = 10</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>let:dunit = "mg"</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>let:tstep = 1</string>
            </attr>
        </edge>
        <edge from="n12" to="n12">
            <attr name="label">
                <string>let:tunit = "DAY"</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>type:TimeFrame</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frame = "WEEK"</string>
            </attr>
        </edge>
        <edge from="n1" to="n1">
            <attr name="label">
                <string>let:frequency = 2</string>
            </attr>
        </edge>
        <edge from="n1" to="n8">
            <attr name="label">
                <string>point</string>
            </attr>
            <attr name="layout">
                <string>419 -30 403 591 406 514 11</string>
            </attr>
        </edge>
        <edge from="n1" to="n13">
            <attr name="label">
                <string>point</string>
            </attr>
            <attr name="layout">
                <string>437 28 403 591 407 669 11</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n8" to="n8">
            <attr name="label">
                <string>let:value = 1</string>
            </attr>
        </edge>
        <edge from="n8" to="n2">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
        <edge from="n13" to="n13">
            <attr name="label">
                <string>type:CompoundPoint</string>
            </attr>
        </edge>
        <edge from="n13" to="n13">
            <attr name="label">
                <string>let:value = 4</string>
            </attr>
        </edge>
        <edge from="n13" to="n2">
            <attr name="label">
                <string>timing</string>
            </attr>
        </edge>
    </graph>
</gxl>
