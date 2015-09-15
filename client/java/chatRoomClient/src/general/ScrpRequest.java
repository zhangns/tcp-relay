// Abstract base class for all SCRP requests

// Copyright (C) 2015 Zhang NS, Zifan Li, Zichao Li

// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License along
// with this program; if not, write to the Free Software Foundation, Inc.,
// 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.

package general;

import org.json.JSONObject;

public class ScrpRequest {
    public static JSONObject createSignUpJSON(int requestID, String userID,
                                              String userPwd, String userNickname) {
        JSONObject signUpJSON = new JSONObject().put("req_id", requestID);
        signUpJSON.put("method", "SIGN_UP");
        signUpJSON.put("user_id", userID);
        signUpJSON.put("user_password", userPwd);
        signUpJSON.put("user_nickname", userNickname);
        return signUpJSON;
    }

    public static JSONObject createLogInJSON(int requestID, String userID,
                                             String userPwd) {
        JSONObject logInJSON = new JSONObject().put("req_id", requestID);
        logInJSON.put("method", "LOG_IN");
        logInJSON.put("user_id", userID);
        logInJSON.put("user_password", userPwd);
        return logInJSON;
    }

    public static JSONObject createDeleteUserJSON(int requestID,
                                                  String userPwd) {
        JSONObject deleteUserJSON = new JSONObject().put("req_id", requestID);
        deleteUserJSON.put("method", "DELETE_USER");
        deleteUserJSON.put("user_password", userPwd);
        return deleteUserJSON;
    }

    public static JSONObject createChangePwdJSON(int requestID,
                                                 String oldPwd, String newPwd) {
        JSONObject changePwdJSON = new JSONObject().put("req_id", requestID);
        changePwdJSON.put("method", "CHANGE_USER_PASSWORD");
        changePwdJSON.put("old_user_password", oldPwd);
        changePwdJSON.put("new_user_password", newPwd);
        return changePwdJSON;
    }

    public static JSONObject createChangeUserNicknameJSON(int requestID,
                                                          String userNickname) {
        JSONObject changeUserNicknameJSON = new JSONObject().put("req_id", requestID);
        changeUserNicknameJSON.put("method", "CHANGE_USER_NICKNAME");
        changeUserNicknameJSON.put("user_nickname", userNickname);
        return changeUserNicknameJSON;
    }

    public static JSONObject createGetTimeJSON(int requestID) {
        JSONObject getTimeJSON = new JSONObject().put("req_id", requestID);
        getTimeJSON.put("method", "GET_TIME");
        return getTimeJSON;
    }

    public static JSONObject createCreateRoomJSON(int requestID, String roomID,
                                                  String roomNickname,
                                                  Utils.RoomAccessType roomAccess) {
        JSONObject createRoomJSON = new JSONObject().put("req_id", requestID);
        createRoomJSON.put("method", "CREATE_ROOM");
        createRoomJSON.put("room_id", roomID);
        createRoomJSON.put("room_nickname", roomNickname);
        createRoomJSON.put("room_access", roomAccess);
        return createRoomJSON;
    }

    public static JSONObject createCreatePwdRoomJSON(int requestID, String roomID,
                                                     String roomNickname,
                                                     Utils.RoomAccessType roomAccess,
                                                     String roomPassword) {
        JSONObject createRoomPwdJSON = new JSONObject().put("req_id", requestID);
        createRoomPwdJSON.put("method", "CREATE_ROOM");
        createRoomPwdJSON.put("room_id", roomID);
        createRoomPwdJSON.put("room_nickname", roomNickname);
        createRoomPwdJSON.put("room_access", roomAccess);
        createRoomPwdJSON.put("room_password",roomPassword);
        return createRoomPwdJSON;
    }

    public static JSONObject createEnterRoomJSON(int requestID, String roomID) {
        JSONObject enterRoomJSON = new JSONObject().put("req_id", requestID);
        enterRoomJSON.put("method", "Enter_ROOM");
        enterRoomJSON.put("room_id", roomID);
        return enterRoomJSON;
    }

    public static JSONObject createEnterPwdRoomJSON(int requestID, String roomID,
                                                    String roomPassword) {
        JSONObject enterPwdRoomJSON = new JSONObject().put("req_id", requestID);
        enterPwdRoomJSON.put("method", "Enter_ROOM");
        enterPwdRoomJSON.put("room_id", roomID);
        enterPwdRoomJSON.put("room_password", roomPassword);
        return enterPwdRoomJSON;
    }

    public static JSONObject createRemoveRoomJSON(int requestID, String roomID) {
        JSONObject enterPwdRoomJSON = new JSONObject().put("req_id", requestID);
        enterPwdRoomJSON.put("method", "Remove_ROOM");
        enterPwdRoomJSON.put("room_id", roomID);
        return enterPwdRoomJSON;
    }
}
