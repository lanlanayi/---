package test;


//������largenumberOperationMultiply
public class largenumberOperationMultiply {

  //���巽��multiply�Ĺ���
  public String multiply(String str1,String str2){
      int[] num1 = new int[str1.length()];
      int[] num2 = new int[str2.length()];
      int[] result = new int[str1.length() + str2.length()];

      //�������ַ���ת���������飬˳��ת���������±�ԽС�����ֶ�Ӧ��λ��Խ��
      for (int i = 0;i < str1.length(); i++){
          num1[i] = Integer.parseInt(str1.substring(i,i+1));
      }
      for (int i = 0;i < str2.length(); i++){
          num2[i] = Integer.parseInt(str2.substring(i,i+1));
      }

      //���������
      for (int a = 0;a < str1.length(); a++){
          for (int b = 0;b < str2.length(); b++){
              result[a+b] += num1[a]*num2[b];
          }
      }

      ////�ж��Ƿ���Ҫ��λ����10��1,��Ϊ�洢˳����λ���ߵ��෴�����Բ��������λ
      int temp;
      for (int k = result.length-1; k > 0; k--){
              temp=result[k]/10;  //�����±����������±�С�Ľ�λ
              result[k-1] += temp;
              result[k] = result[k]%10;
          }

      //�������������ת��Ϊ�ַ���
      String resultstr = "";
      for (int i = 0; i < result.length-1; i++){
          resultstr += "" + result[i];
      }

      return resultstr;
  }

  
}