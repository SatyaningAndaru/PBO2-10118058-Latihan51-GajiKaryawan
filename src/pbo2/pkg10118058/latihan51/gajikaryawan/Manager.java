/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan51.gajikaryawan;

/**
 *
 * @author user
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan,tunjanganJabatan,tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
        
    }

    @Override
    public void setGolongan(int golongan) {
        super.setGolongan(golongan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getGolongan() {
        return super.getGolongan(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJabatan(String jabatan) {
        super.setJabatan(jabatan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJabatan() {
        return super.getJabatan(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNik(String nik) {
        super.setNik(nik); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNik() {
        return super.getNik(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public float tunjanganKehadiran(int hadir){
        return kehadiran *10000;
    
    }
       public float tunjanganJabatan(String jabatan ){
          
           jabatan = super.getJabatan();
          if(jabatan.equalsIgnoreCase("manager")){
              tunjanganJabatan= 2000000;
          } else if (jabatan.equalsIgnoreCase("kabag")){
              tunjanganJabatan= 1000000;
          } else {
              tunjanganJabatan= 0;
          }
           return tunjanganJabatan;
    
    }
          public float tunjanganGolongan(int golongan){
              golongan = super.getGolongan();
              switch (golongan){
                  case 1 :
                      tunjanganGolongan = 500000;
                      break;
                  case 2 : 
                      tunjanganGolongan = 1000000;
                      break;
                  case 3 : 
                      tunjanganGolongan = 1500000;
                      break;
              }
             return tunjanganGolongan;
    
    }
          public float gajiTotal(){
          return tunjanganGolongan+tunjanganKehadiran+tunjanganJabatan;
          }
}
