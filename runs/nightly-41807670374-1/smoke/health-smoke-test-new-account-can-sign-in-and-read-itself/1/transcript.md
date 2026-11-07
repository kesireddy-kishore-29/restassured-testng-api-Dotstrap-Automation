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
| 1 | `POST /v1/accounts` | 201 | 352 | `qa-5981f18c-d84c-40ad-a3d7-580db942e2b5` |
| 2 | `POST /v1/auth/token` | 200 | 53 | `qa-f72c685f-6bab-4cf8-97e2-808c3f799982` |
| 3 | `GET /v1/accounts/me` | 200 | 40 | `qa-c96f2a6c-253e-4ddb-ba67-7c5ed4976732` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-758c7078-2218-400d-88a6-e499629a1ec1` |
| 5 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-6109f8be-0d43-487c-a73a-3923b13f0298` |
| 6 | `POST /v1/auth/token` | 401 | 9 | `qa-bc0d5f26-bd41-46cb-9712-37dbd5e67246` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5981f18c-d84c-40ad-a3d7-580db942e2b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5981f18c-d84c-40ad-a3d7-580db942e2b5
Content-Type: application/json

--- request body ---
{"handle":"qa-c02092b903ff","displayName":"QA c02092b903ff","password":"****","region":"eu"}

--- response: 201 in 352 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-5981f18c-d84c-40ad-a3d7-580db942e2b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-c02092b903ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a35fde59-140e-4b04-a37c-02c3e448faf4","handle":"qa-c02092b903ff","displayName":"QA c02092b903ff","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.537901475Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f72c685f-6bab-4cf8-97e2-808c3f799982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f72c685f-6bab-4cf8-97e2-808c3f799982
Content-Type: application/json

--- request body ---
{"handle":"qa-c02092b903ff","password":"****"}

--- response: 200 in 53 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f72c685f-6bab-4cf8-97e2-808c3f799982
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a35fde59-140e-4b04-a37c-02c3e448faf4"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c96f2a6c-253e-4ddb-ba67-7c5ed4976732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c96f2a6c-253e-4ddb-ba67-7c5ed4976732
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c96f2a6c-253e-4ddb-ba67-7c5ed4976732
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

{"id":"acc_a35fde59-140e-4b04-a37c-02c3e448faf4","handle":"qa-c02092b903ff","displayName":"QA c02092b903ff","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.537901475Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-758c7078-2218-400d-88a6-e499629a1ec1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-758c7078-2218-400d-88a6-e499629a1ec1
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-758c7078-2218-400d-88a6-e499629a1ec1
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

{"id":"acc_a35fde59-140e-4b04-a37c-02c3e448faf4","handle":"qa-c02092b903ff","displayName":"QA c02092b903ff","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.537901475Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6109f8be-0d43-487c-a73a-3923b13f0298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6109f8be-0d43-487c-a73a-3923b13f0298
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6109f8be-0d43-487c-a73a-3923b13f0298
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
correlation: qa-bc0d5f26-bd41-46cb-9712-37dbd5e67246

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc0d5f26-bd41-46cb-9712-37dbd5e67246
Content-Type: application/json

--- request body ---
{"handle":"qa-c02092b903ff","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc0d5f26-bd41-46cb-9712-37dbd5e67246
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc0d5f26-bd41-46cb-9712-37dbd5e67246"}
```
