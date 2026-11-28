# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-454ec995-cf36-4585-a3f7-c9149dc6e65d` |
| 2 | `POST /v1/auth/token` | 200 | 34 | `qa-799420af-0248-4a43-9aad-254b16c219d7` |
| 3 | `GET /v1/accounts/me` | 200 | 21 | `qa-7085502d-0f2a-411e-82d0-a46a0c014a28` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-4f02291c-8176-4eae-a4dd-fa24c6b2bb16` |
| 5 | `GET /v1/accounts/me` | 200 | 14 | `qa-80943539-623c-4b46-a0c4-b79b98c5fee2` |
| 6 | `GET /v1/accounts/me` | 401 | 11 | `qa-e93b9457-b800-4460-9624-7869bf343421` |
| 7 | `GET /v1/accounts/me` | 401 | 9 | `qa-dc2ae1e0-1bdb-464c-91c4-0f5803acc20d` |
| 8 | `POST /v1/auth/token` | 200 | 12 | `qa-fa33c819-02f6-4be2-918f-d21a03bfd1c8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-729a34cc-1f91-4fa2-9755-212049f011bd` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-b84d0995-3cf2-423e-8e39-b1226c6aa988` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-454ec995-cf36-4585-a3f7-c9149dc6e65d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-454ec995-cf36-4585-a3f7-c9149dc6e65d
Content-Type: application/json

--- request body ---
{"handle":"qa-72496324dbd8","displayName":"QA 72496324dbd8","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-454ec995-cf36-4585-a3f7-c9149dc6e65d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-72496324dbd8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4affc56-4d4c-4ada-9164-00d0eaf7b67d","handle":"qa-72496324dbd8","displayName":"QA 72496324dbd8","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.319586673Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-799420af-0248-4a43-9aad-254b16c219d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-799420af-0248-4a43-9aad-254b16c219d7
Content-Type: application/json

--- request body ---
{"handle":"qa-72496324dbd8","password":"****","ttlSeconds":1}

--- response: 200 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-799420af-0248-4a43-9aad-254b16c219d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_e4affc56-4d4c-4ada-9164-00d0eaf7b67d"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-7085502d-0f2a-411e-82d0-a46a0c014a28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7085502d-0f2a-411e-82d0-a46a0c014a28
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7085502d-0f2a-411e-82d0-a46a0c014a28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4affc56-4d4c-4ada-9164-00d0eaf7b67d","handle":"qa-72496324dbd8","displayName":"QA 72496324dbd8","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.319586673Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-4f02291c-8176-4eae-a4dd-fa24c6b2bb16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f02291c-8176-4eae-a4dd-fa24c6b2bb16
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f02291c-8176-4eae-a4dd-fa24c6b2bb16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4affc56-4d4c-4ada-9164-00d0eaf7b67d","handle":"qa-72496324dbd8","displayName":"QA 72496324dbd8","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.319586673Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-80943539-623c-4b46-a0c4-b79b98c5fee2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80943539-623c-4b46-a0c4-b79b98c5fee2
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-80943539-623c-4b46-a0c4-b79b98c5fee2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4affc56-4d4c-4ada-9164-00d0eaf7b67d","handle":"qa-72496324dbd8","displayName":"QA 72496324dbd8","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.319586673Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-e93b9457-b800-4460-9624-7869bf343421

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e93b9457-b800-4460-9624-7869bf343421
Content-Type: application/json

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e93b9457-b800-4460-9624-7869bf343421
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-e93b9457-b800-4460-9624-7869bf343421"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc2ae1e0-1bdb-464c-91c4-0f5803acc20d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc2ae1e0-1bdb-464c-91c4-0f5803acc20d
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc2ae1e0-1bdb-464c-91c4-0f5803acc20d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-dc2ae1e0-1bdb-464c-91c4-0f5803acc20d"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-fa33c819-02f6-4be2-918f-d21a03bfd1c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa33c819-02f6-4be2-918f-d21a03bfd1c8
Content-Type: application/json

--- request body ---
{"handle":"qa-72496324dbd8","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa33c819-02f6-4be2-918f-d21a03bfd1c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4affc56-4d4c-4ada-9164-00d0eaf7b67d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-729a34cc-1f91-4fa2-9755-212049f011bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-729a34cc-1f91-4fa2-9755-212049f011bd
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-729a34cc-1f91-4fa2-9755-212049f011bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b84d0995-3cf2-423e-8e39-b1226c6aa988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b84d0995-3cf2-423e-8e39-b1226c6aa988
Content-Type: application/json

--- request body ---
{"handle":"qa-72496324dbd8","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b84d0995-3cf2-423e-8e39-b1226c6aa988
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b84d0995-3cf2-423e-8e39-b1226c6aa988"}
```
