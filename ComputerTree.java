import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
public class ComputerTree extends JFrame{
    JTree tree;
    public ComputerTree() {
        // Root 
        DefaultMutableTreeNode computerRoot = new DefaultMutableTreeNode("My Computer");

        // Contains head nodes
        DefaultMutableTreeNode hardwareNode = new DefaultMutableTreeNode("Hardware");
        DefaultMutableTreeNode softwareNode = new DefaultMutableTreeNode("Software");

        // Roots
        computerRoot.add(hardwareNode);
        computerRoot.add(softwareNode);

        // Hardware Contents

        // Processor
        DefaultMutableTreeNode processorNode = new DefaultMutableTreeNode("Processor");
        hardwareNode.add(processorNode);
        DefaultMutableTreeNode clockSpeed = new DefaultMutableTreeNode("3.50GHz");
        DefaultMutableTreeNode coreThreadCounts = new DefaultMutableTreeNode("Dual-core processor with four threads");
        DefaultMutableTreeNode generation = new DefaultMutableTreeNode("7th-gen Pentium");
        DefaultMutableTreeNode wattage = new DefaultMutableTreeNode("54W TDP");
        processorNode.add(clockSpeed);
        processorNode.add(coreThreadCounts);
        processorNode.add(generation);
        processorNode.add(wattage);

        // Monitor 
        DefaultMutableTreeNode monitorNode = new DefaultMutableTreeNode("Monitor");
        hardwareNode.add(monitorNode);
        DefaultMutableTreeNode resolution = new DefaultMutableTreeNode("1920x1080");
        DefaultMutableTreeNode screenPhysicalSize = new DefaultMutableTreeNode("22 in");
        DefaultMutableTreeNode screenType = new DefaultMutableTreeNode("LED");
        monitorNode.add(resolution);
        monitorNode.add(screenPhysicalSize);
        monitorNode.add(screenType);

        // Storage Devices
        DefaultMutableTreeNode storageNode = new DefaultMutableTreeNode("Storage");
        hardwareNode.add(storageNode);
        DefaultMutableTreeNode primarySsdNode = new DefaultMutableTreeNode("Main SSD");
        storageNode.add(primarySsdNode);
        DefaultMutableTreeNode hddNode1 = new DefaultMutableTreeNode("HDD 1");
        storageNode.add(hddNode1);
        DefaultMutableTreeNode hddNode2 = new DefaultMutableTreeNode("HDD 2");
        storageNode.add(hddNode2);
        
        DefaultMutableTreeNode ssdSize = new DefaultMutableTreeNode("480GB");
        primarySsdNode.add(ssdSize);
        DefaultMutableTreeNode sataVersion = new DefaultMutableTreeNode("SATA-3");
        
        DefaultMutableTreeNode ssdVariant = new DefaultMutableTreeNode("SanDisk Ultra II");
        primarySsdNode.add(ssdVariant);
        primarySsdNode.add(sataVersion);
        DefaultMutableTreeNode hddSize = new DefaultMutableTreeNode("1TB");
        hddNode1.add(hddSize);
        DefaultMutableTreeNode hdd1sataVersion = new DefaultMutableTreeNode("SATA-3");
        DefaultMutableTreeNode hdd1Variant = new DefaultMutableTreeNode("WD Blue");
        hddNode1.add(hdd1Variant);
        hddNode1.add(hdd1sataVersion);


        DefaultMutableTreeNode hdd2Size = new DefaultMutableTreeNode("1TB");
        hddNode2.add(hdd2Size);
        DefaultMutableTreeNode hdd2sataVersion = new DefaultMutableTreeNode("SATA-3");
        DefaultMutableTreeNode hdd2Variant = new DefaultMutableTreeNode("WD Green");
        hddNode2.add(hdd2Variant);
        hddNode2.add(hdd2sataVersion);

        // Memory
        DefaultMutableTreeNode memoryNode = new DefaultMutableTreeNode("Memory");
        hardwareNode.add(memoryNode);
        DefaultMutableTreeNode memorySpeed = new DefaultMutableTreeNode("2400MHz");
        DefaultMutableTreeNode memorySize = new DefaultMutableTreeNode("4GB");
        DefaultMutableTreeNode memoryGen = new DefaultMutableTreeNode("DDR-4");
        DefaultMutableTreeNode memoryCount = new DefaultMutableTreeNode("Count: 2");
        memoryNode.add(memoryGen);
        memoryNode.add(memorySpeed);
        memoryNode.add(memorySize);
        memoryNode.add(memoryCount);

        // Graphics Card
        DefaultMutableTreeNode gpuNode = new DefaultMutableTreeNode("Graphics Card");
        hardwareNode.add(gpuNode);
        DefaultMutableTreeNode gpuModel = new DefaultMutableTreeNode("Palit GTX 1050");
        DefaultMutableTreeNode gpuMemSize = new DefaultMutableTreeNode("2GB");
        DefaultMutableTreeNode gpuClock = new DefaultMutableTreeNode("1455 MHz");
        DefaultMutableTreeNode gpuMemClock = new DefaultMutableTreeNode("3500MHz");
 
        gpuNode.add(gpuModel);
        gpuNode.add(gpuClock);
        gpuNode.add(gpuMemSize);
        gpuNode.add(gpuMemClock);

        // Power Supply
        DefaultMutableTreeNode psuNode = new DefaultMutableTreeNode("Power Supply");
        hardwareNode.add(psuNode);
        DefaultMutableTreeNode psuModel = new DefaultMutableTreeNode("FSP Hexa+");
        DefaultMutableTreeNode psuWattage = new DefaultMutableTreeNode("450W");
        DefaultMutableTreeNode psuVoltage = new DefaultMutableTreeNode("110/220V");
 
 
        psuNode.add(psuModel);
        psuNode.add(psuWattage);
        psuNode.add(psuVoltage);

        // Mouse
        DefaultMutableTreeNode mouseNode = new DefaultMutableTreeNode("Mouse");
        hardwareNode.add(mouseNode);
        DefaultMutableTreeNode mouseName = new DefaultMutableTreeNode("Logitech G102 v2");
        DefaultMutableTreeNode mouseSens = new DefaultMutableTreeNode("1200 DPI");
        DefaultMutableTreeNode mouseExtraFeats = new DefaultMutableTreeNode("LightSync");
        mouseNode.add(mouseName);
        mouseNode.add(mouseSens);
        mouseNode.add(mouseExtraFeats);

        // Keyboard
        DefaultMutableTreeNode keyboardNode = new DefaultMutableTreeNode("Keyboard");
        hardwareNode.add(keyboardNode);
        DefaultMutableTreeNode keyboardKind = new DefaultMutableTreeNode("Mechanical");
        DefaultMutableTreeNode keyboardLayout = new DefaultMutableTreeNode("US-QWERTY");
        DefaultMutableTreeNode keyboardSizeLayout = new DefaultMutableTreeNode("Full-size");
        keyboardNode.add(keyboardKind);
        keyboardNode.add(keyboardLayout);
        keyboardNode.add(keyboardSizeLayout);


        /*
                            SOFTWARE NODE
                            =============
        */

        // Operating System
        DefaultMutableTreeNode osNode = new DefaultMutableTreeNode("Operating System");
        softwareNode.add(osNode);
        DefaultMutableTreeNode osVendor= new DefaultMutableTreeNode("Microsoft");
        DefaultMutableTreeNode osName = new DefaultMutableTreeNode("Windows 10");
        DefaultMutableTreeNode osBuildNum = new DefaultMutableTreeNode("Version 2004, Build 19041.572");
        osNode.add(osVendor);
        osNode.add(osName);
        osNode.add(osBuildNum);

        // Browsers
        DefaultMutableTreeNode browserNode = new DefaultMutableTreeNode("Browsers");
        softwareNode.add(browserNode);
        DefaultMutableTreeNode browser1= new DefaultMutableTreeNode("Google Chrome");
        DefaultMutableTreeNode browser2 = new DefaultMutableTreeNode("Microsoft Edge");
        DefaultMutableTreeNode browser3 = new DefaultMutableTreeNode("Firefox");
        browserNode.add(browser1);
        browserNode.add(browser2);
        browserNode.add(browser3);

        // Communcations
        DefaultMutableTreeNode commsNode = new DefaultMutableTreeNode("Communication Apps");
        softwareNode.add(commsNode);
        DefaultMutableTreeNode comms1= new DefaultMutableTreeNode("Discord");
        DefaultMutableTreeNode comms2 = new DefaultMutableTreeNode("MS Teams");
        DefaultMutableTreeNode comms3 = new DefaultMutableTreeNode("Telegram");
        commsNode.add(comms1);
        commsNode.add(comms2);
        commsNode.add(comms3);

        // Services
        DefaultMutableTreeNode servicesNode = new DefaultMutableTreeNode("Services");
        softwareNode.add(servicesNode);
        DefaultMutableTreeNode svc1 = new DefaultMutableTreeNode("Microsoft IIS Web Server");
        DefaultMutableTreeNode svc2 = new DefaultMutableTreeNode("File Service");
        DefaultMutableTreeNode svc3 = new DefaultMutableTreeNode("Secure Shell");
        DefaultMutableTreeNode svc4 = new DefaultMutableTreeNode("Remote Desktop Service");
        servicesNode.add(svc1);
        servicesNode.add(svc2);
        servicesNode.add(svc3);
        servicesNode.add(svc4);

        // Antivirus 
        DefaultMutableTreeNode avNode = new DefaultMutableTreeNode("Antivirus");
        softwareNode.add(avNode);
        DefaultMutableTreeNode av1 = new DefaultMutableTreeNode("Microsoft Defender");
        avNode.add(av1);

        // Productivity and tools

        DefaultMutableTreeNode ptNode = new DefaultMutableTreeNode("Productivity and Tools");
        softwareNode.add(ptNode);
        DefaultMutableTreeNode msOffice = new DefaultMutableTreeNode("Microsoft Office 365");
        DefaultMutableTreeNode msOneDrive = new DefaultMutableTreeNode("Microsoft OneDrive (Cloud)");
        DefaultMutableTreeNode vsCode = new DefaultMutableTreeNode("Visual Studio Code");
        DefaultMutableTreeNode vs19 = new DefaultMutableTreeNode("Visual Studio 2019");
        DefaultMutableTreeNode obs = new DefaultMutableTreeNode("Open Broadcater Software");
        DefaultMutableTreeNode nvSvc = new DefaultMutableTreeNode("Nvidia ShadowPlay");
        DefaultMutableTreeNode as = new DefaultMutableTreeNode("Android Studio");
        DefaultMutableTreeNode jbIJ = new DefaultMutableTreeNode("Jetbrains IntelliJ IDEA Community");
        DefaultMutableTreeNode jbWS = new DefaultMutableTreeNode("Jetbrains WebStorm");
        DefaultMutableTreeNode jbPHS = new DefaultMutableTreeNode("Jetbrains PHPStorm");
        DefaultMutableTreeNode tg = new DefaultMutableTreeNode("The GIMP");
        DefaultMutableTreeNode app = new DefaultMutableTreeNode("Adobe Premiere Pro 2020");
        DefaultMutableTreeNode aae = new DefaultMutableTreeNode("Adobe After Effects 2020");
        DefaultMutableTreeNode ame = new DefaultMutableTreeNode("Adobe Media Encoder 2020");
        DefaultMutableTreeNode kde = new DefaultMutableTreeNode("kdenlive");
        DefaultMutableTreeNode llc = new DefaultMutableTreeNode("LosslessCut");
        DefaultMutableTreeNode be = new DefaultMutableTreeNode("balenaEtcher");
        DefaultMutableTreeNode vp17 = new DefaultMutableTreeNode("VEGAS PRO 17");
        DefaultMutableTreeNode ida = new DefaultMutableTreeNode("IDA Pro");
        DefaultMutableTreeNode gh = new DefaultMutableTreeNode("NSA Ghidra");
        DefaultMutableTreeNode npp = new DefaultMutableTreeNode("Notepad++");
        DefaultMutableTreeNode pn = new DefaultMutableTreeNode("Paint.NET");
        DefaultMutableTreeNode shx = new DefaultMutableTreeNode("ShareX");
        ptNode.add(msOffice);
        ptNode.add(msOneDrive);
        ptNode.add(vsCode);
        ptNode.add(vs19);
        ptNode.add(obs);
        ptNode.add(nvSvc);
        ptNode.add(as);
        ptNode.add(jbIJ);
        ptNode.add(jbWS);
        ptNode.add(jbPHS);
        ptNode.add(tg);
        ptNode.add(app);
        ptNode.add(aae);
        ptNode.add(ame);
        ptNode.add(kde);
        ptNode.add(llc);
        ptNode.add(be);
        ptNode.add(vp17);
        ptNode.add(ida);
        ptNode.add(gh);
        ptNode.add(npp);
        ptNode.add(pn);
        ptNode.add(shx);
        tree = new JTree(computerRoot);
        add(tree);
        this.setTitle("Computer Specifications");
        this.setSize(300,300);
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        new ComputerTree();
    }
}
