package single_inheritance.smart_home;

class Thermostat extends Device{
    double tempSetting;
    Thermostat(int deviceID,String status,double tempSetting){
        super(deviceID,status);
        this.tempSetting=tempSetting;
    }
    public void displayStatus(){
        System.out.println("ID of Device:"+deviceID);
        System.out.println("Status of device:"+status);
        System.out.println("Temperature Setting:"+tempSetting);
    }

}