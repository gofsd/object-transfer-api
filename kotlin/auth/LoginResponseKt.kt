//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: auth.proto

package auth;

@kotlin.jvm.JvmName("-initializeloginResponse")
public inline fun loginResponse(block: auth.LoginResponseKt.Dsl.() -> kotlin.Unit): auth.LoginResponse =
  auth.LoginResponseKt.Dsl._create(auth.LoginResponse.newBuilder()).apply { block() }._build()
public object LoginResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: auth.LoginResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: auth.LoginResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): auth.LoginResponse = _builder.build()

    /**
     * <code>string token = 1;</code>
     */
    public var token: kotlin.String
      @JvmName("getToken")
      get() = _builder.getToken()
      @JvmName("setToken")
      set(value) {
        _builder.setToken(value)
      }
    /**
     * <code>string token = 1;</code>
     */
    public fun clearToken() {
      _builder.clearToken()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun auth.LoginResponse.copy(block: auth.LoginResponseKt.Dsl.() -> kotlin.Unit): auth.LoginResponse =
  auth.LoginResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

