
// 1
package br.com.inf3cm.priceresearch;

public class User {

    private static final String TAG = "User";


    private int mId;
    private String mtelefoneName;
    private String mindereco;
    private String mPassword;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String gettelefoneName() {
        return mtelefoneName;
    }

    public void settelefoneName(String telefoneName) {
        mtelefoneName = telefoneName;
    }

    public String getindereco() {
        return mindereco;
    }

    public void setindereco(String indereco) {
        mindereco = indereco;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getEmail() {
        return mEmail.toLowerCase().trim();
    }

    public User(String password, String email) {
        mPassword = password;
        mEmail = email;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public long getCreateDate() {
        return mCreateDate;
    }

    public void setCreateDate(long createDate) {
        mCreateDate = createDate;
    }

    public String getApiKey() {
        return mApiKey;
    }

    public void setApiKey(String apiKey) {
        mApiKey = apiKey;
    }

    public String getResetPasswordOtp() {
        return mResetPasswordOtp;
    }

    public void setResetPasswordOtp(String resetPasswordOtp) {
        mResetPasswordOtp = resetPasswordOtp;
    }

    public long getResetPasswordCreatedAt() {
        return mResetPasswordCreatedAt;
    }

    public void setResetPasswordCreatedAt(long resetPasswordCreatedAt) {
        mResetPasswordCreatedAt = resetPasswordCreatedAt;
    }

    private String mEmail;

    public User(String telefoneName, String indereco, String password, String email, long createDate, String apiKey, String resetPasswordOtp, long resetPasswordCreatedAt) {
        mtelefoneName = telefoneName;
        mindereco = indereco;
        mPassword = password;
        mEmail = email;
        mCreateDate = createDate;
        mApiKey = apiKey;
        mResetPasswordOtp = resetPasswordOtp;
        mResetPasswordCreatedAt = resetPasswordCreatedAt;
    }

    public User(int id, String telefoneName, String indereco, String password, String email, long createDate, String apiKey, String resetPasswordOtp, long resetPasswordCreatedAt) {
        mId = id;
        mtelefoneName = telefoneName;
        mindereco = indereco;
        mPassword = password;
        mEmail = email;
        mCreateDate = createDate;
        mApiKey = apiKey;
        mResetPasswordOtp = resetPasswordOtp;
        mResetPasswordCreatedAt = resetPasswordCreatedAt;
    }

    public User(int id, String telefoneName, String indereco, String password, String email) {
        mId = id;
        mtelefoneName = telefoneName;
        mindereco = indereco;
        mPassword = password;
        mEmail = email;
    }

    private long mCreateDate;
    private String mApiKey;
    private String mResetPasswordOtp;
    private long mResetPasswordCreatedAt;

    @Override
    public String toString() {
        return "User{" +
                "mId=" + mId +
                ", mtelefoneName='" + mtelefoneName + '\'' +
                ", mindereco='" + mindereco + '\'' +
                ", mPassword='" + mPassword + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mCreateDate=" + mCreateDate +
                ", mApiKey='" + mApiKey + '\'' +
                ", mResetPasswordOtp='" + mResetPasswordOtp + '\'' +
                ", mResetPasswordCreatedAt=" + mResetPasswordCreatedAt +
                '}';
    }
}
