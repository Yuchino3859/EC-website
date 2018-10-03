package com.internousdev.sampleweb.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class InputChecker {

	public List<String> doCheck(String propertyName,String value,int minLength,int maxLength,boolean availableAlphabeticCharacters,boolean availableKanji,boolean availableHiragana,boolean availableHalfWidthDigit,boolean availableHalfWidthSymbols,boolean availableKatakana,boolean availableFullWidthSymbols){

		List<String>stringList=new ArrayList<String>();
		List<String>characterTypeList=new ArrayList<String>();

		if(StringUtils.isEmpty(value)){
			stringList.add(propertyName+"を入力してください。");
		}

		if(value.length() < minLength || value.length()>maxLength){
			stringList.add(propertyName+"は"+minLength+"文字以上"+maxLength+"文字以下で入力してください。");
		}

		String regularExpression="";
		String errorExpression="";

		if(availableAlphabeticCharacters || availableKanji || availableHiragana || availableHalfWidthDigit || availableHalfWidthSymbols || availableKatakana || availableFullWidthSymbols){
		    regularExpression="[^";
		}
		if(!(availableAlphabeticCharacters) || !(availableKanji) || !(availableHiragana) || !(availableHalfWidthDigit) || !(availableHalfWidthSymbols)|| !(availableKatakana)|| !(availableFullWidthSymbols)){
			errorExpression = "[^";
		}
		if(availableAlphabeticCharacters){
			regularExpression+="a-zA-Z";
			characterTypeList.add("半角英字");
		}else{
			errorExpression+="a-zA-Z";
		}

		if(availableKanji){
			regularExpression+="一-鉞";
			characterTypeList.add("漢字");
		}else{
			errorExpression+="一-鉞";
		}

		if(availableHiragana){
			regularExpression+="ぁ-ん";
			characterTypeList.add("ひらがな");
		}else{
			errorExpression +="ぁ-ん";
		}

		if(availableHalfWidthDigit){
			regularExpression+="0-9";
			characterTypeList.add("半角数字");
		}else{
			errorExpression+="0-9";
		}

		if(availableHalfWidthSymbols){
			regularExpression+="@..;:!#$%&*+-/=?^_'{|}~";
		    characterTypeList.add("半角記号");
		}else{
			errorExpression+="@..;:!#$%&*+-/=?^_'{|}~";
		}

		if(availableKatakana){
			regularExpression+="ァ-ヲ";
			characterTypeList.add("カタカナ");
	    }else{
	    	errorExpression+="ァ-ヲ";
	    }

		if(availableFullWidthSymbols){
			regularExpression +="＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～";
			characterTypeList.add("全角記号");
		}else{
			errorExpression +="＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～";
		}

	    if(!StringUtils.isEmpty(regularExpression)){
	    	regularExpression+="]+";
	    }
	    if(!StringUtils.isEmpty(errorExpression)){
	    	errorExpression+="]+";
		}

		String characterType="";
		for(int i=0;i<characterTypeList.size();i++){
			if(i==0){
				characterType+=characterTypeList.get(i).toString();
			}else{
				characterType+="、 "+characterTypeList.get(i).toString();
			}
		}
		if(errorExpression.equals("")){
			if(value.matches(regularExpression)){
				stringList.add(propertyName+"は"+characterType+"で入力してください。");
			}
		}else{
			if(value.matches(regularExpression)||(!value.matches(errorExpression)&&!value.equals(""))){
			    stringList.add(propertyName+"は"+characterType+"で入力してください。");
			}
		}
		return stringList;
	}

	public List<String>doPasswordCheck(String password,String reConfirmationPassword){
		List<String>stringList=new ArrayList<String>();
		if(!(password.equals(reConfirmationPassword))){
			stringList.add("入力されたパスワードが異なります。");
		}
		return stringList;
	}
}
