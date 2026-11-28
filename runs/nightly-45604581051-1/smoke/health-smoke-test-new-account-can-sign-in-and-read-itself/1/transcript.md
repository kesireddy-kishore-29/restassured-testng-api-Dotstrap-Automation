# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 458 | `qa-95988742-96c2-4acd-97d9-e70a43c8a9ab` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-13f3c993-a106-43a4-b1c2-ffa55b5e088a` |
| 3 | `GET /v1/accounts/me` | 200 | 62 | `qa-a074aff0-f248-4c7c-bcf9-23c42f101d8e` |
| 4 | `GET /v1/accounts/me` | 200 | 20 | `qa-0506d002-8483-4bc8-ae38-0164f21b0564` |
| 5 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-8a9a409d-4d88-412a-892a-92d267e4d67a` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-caef5cee-7a8b-4092-9742-ec99740485c8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-95988742-96c2-4acd-97d9-e70a43c8a9ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95988742-96c2-4acd-97d9-e70a43c8a9ab
Content-Type: application/json

--- request body ---
{"handle":"qa-5045623c53fb","displayName":"QA 5045623c53fb","password":"****","region":"eu"}

--- response: 201 in 458 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-95988742-96c2-4acd-97d9-e70a43c8a9ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-5045623c53fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aacd3bfe-c45b-4b1b-9060-47c4ea5a4169","handle":"qa-5045623c53fb","displayName":"QA 5045623c53fb","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.355220783Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-13f3c993-a106-43a4-b1c2-ffa55b5e088a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13f3c993-a106-43a4-b1c2-ffa55b5e088a
Content-Type: application/json

--- request body ---
{"handle":"qa-5045623c53fb","password":"****"}

--- response: 200 in 54 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-13f3c993-a106-43a4-b1c2-ffa55b5e088a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aacd3bfe-c45b-4b1b-9060-47c4ea5a4169"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a074aff0-f248-4c7c-bcf9-23c42f101d8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a074aff0-f248-4c7c-bcf9-23c42f101d8e
Content-Type: application/json

--- response: 200 in 62 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a074aff0-f248-4c7c-bcf9-23c42f101d8e
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

{"id":"acc_aacd3bfe-c45b-4b1b-9060-47c4ea5a4169","handle":"qa-5045623c53fb","displayName":"QA 5045623c53fb","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.355220783Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-0506d002-8483-4bc8-ae38-0164f21b0564

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0506d002-8483-4bc8-ae38-0164f21b0564
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-0506d002-8483-4bc8-ae38-0164f21b0564
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

{"id":"acc_aacd3bfe-c45b-4b1b-9060-47c4ea5a4169","handle":"qa-5045623c53fb","displayName":"QA 5045623c53fb","region":"eu","role":"user","createdAt":"2026-11-25T11:27:53.355220783Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8a9a409d-4d88-412a-892a-92d267e4d67a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a9a409d-4d88-412a-892a-92d267e4d67a
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8a9a409d-4d88-412a-892a-92d267e4d67a
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-caef5cee-7a8b-4092-9742-ec99740485c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caef5cee-7a8b-4092-9742-ec99740485c8
Content-Type: application/json

--- request body ---
{"handle":"qa-5045623c53fb","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-caef5cee-7a8b-4092-9742-ec99740485c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-caef5cee-7a8b-4092-9742-ec99740485c8"}
```
