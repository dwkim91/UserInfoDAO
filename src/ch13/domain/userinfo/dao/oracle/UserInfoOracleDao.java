package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into ORACLE Db userID = " + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into ORACLE Db userID = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUsetInfo(UserInfo userInfo) {
		System.out.println("Delete from ORACLE Db userID = " + userInfo.getUserId());
		
	}

}
