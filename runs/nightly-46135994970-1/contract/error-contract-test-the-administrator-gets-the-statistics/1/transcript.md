# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-a13a0079-8d28-40c3-ba39-870269694cd6` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-512b29da-f8d6-4b2c-9364-d87ab42f0e4c` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-50fcad92-0a72-4647-b324-4eee96e306b0` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-4cfdde40-fc79-477c-8136-fdb6aa3dfc83` |
| 5 | `POST /v1/auth/token` | 200 | 35 | `qa-3ee295b0-4293-41f2-baef-705e38fef550` |
| 6 | `GET /v1/admin/stats` | 200 | 8 | `qa-63c4e787-2410-4aec-a831-6fa86694dee1` |
| 7 | `POST /v1/auth/token` | 200 | 31 | `qa-db727f00-a7c8-4b3b-8a98-521b561e353e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-f7453ab7-9904-49ae-9224-679e729e7ab6` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-76f18d76-4489-492e-aa87-0a52a9375d01` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-13e38e76-366e-4d85-b5a5-096e3d39b707` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-5969f75c-9fcc-4b35-92f5-d528003627b7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a13a0079-8d28-40c3-ba39-870269694cd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a13a0079-8d28-40c3-ba39-870269694cd6
Content-Type: application/json

--- request body ---
{"handle":"qa-db5651c2e3fa","displayName":"QA db5651c2e3fa","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a13a0079-8d28-40c3-ba39-870269694cd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Location: /v1/accounts/qa-db5651c2e3fa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a472ae4e-3711-4dbe-afd0-9c9154df6d1b","handle":"qa-db5651c2e3fa","displayName":"QA db5651c2e3fa","region":"eu","role":"user","createdAt":"2026-11-28T10:37:26.099332276Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-512b29da-f8d6-4b2c-9364-d87ab42f0e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-512b29da-f8d6-4b2c-9364-d87ab42f0e4c
Content-Type: application/json

--- request body ---
{"handle":"qa-68472e164531","displayName":"QA 68472e164531","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-512b29da-f8d6-4b2c-9364-d87ab42f0e4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 6
Location: /v1/accounts/qa-68472e164531
X-Served-Region: eu
Content-Length: 181

{"id":"acc_166bf5a2-f26d-4dfe-9df2-d5f0a93671c4","handle":"qa-68472e164531","displayName":"QA 68472e164531","region":"eu","role":"user","createdAt":"2026-11-28T10:37:26.124791978Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-50fcad92-0a72-4647-b324-4eee96e306b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50fcad92-0a72-4647-b324-4eee96e306b0
Content-Type: application/json

--- request body ---
{"handle":"qa-db5651c2e3fa","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-50fcad92-0a72-4647-b324-4eee96e306b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a472ae4e-3711-4dbe-afd0-9c9154df6d1b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4cfdde40-fc79-477c-8136-fdb6aa3dfc83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cfdde40-fc79-477c-8136-fdb6aa3dfc83
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-68472e164531","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cfdde40-fc79-477c-8136-fdb6aa3dfc83
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
Location: /v1/conversations/cnv_b2974445-6642-4d63-a58e-8faef2059b8a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b2974445-6642-4d63-a58e-8faef2059b8a","subject":"Error contract","status":"open","region":"eu","participants":["qa-db5651c2e3fa","qa-68472e164531"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:26.192749863Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-3ee295b0-4293-41f2-baef-705e38fef550

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ee295b0-4293-41f2-baef-705e38fef550
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ee295b0-4293-41f2-baef-705e38fef550
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c770d8c1-e010-4b55-b9e5-dd6279d0ae57"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-63c4e787-2410-4aec-a831-6fa86694dee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63c4e787-2410-4aec-a831-6fa86694dee1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-63c4e787-2410-4aec-a831-6fa86694dee1
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
Content-Length: 46

{"accounts":9,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-db727f00-a7c8-4b3b-8a98-521b561e353e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db727f00-a7c8-4b3b-8a98-521b561e353e
Content-Type: application/json

--- request body ---
{"handle":"qa-68472e164531","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-db727f00-a7c8-4b3b-8a98-521b561e353e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_166bf5a2-f26d-4dfe-9df2-d5f0a93671c4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f7453ab7-9904-49ae-9224-679e729e7ab6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7453ab7-9904-49ae-9224-679e729e7ab6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f7453ab7-9904-49ae-9224-679e729e7ab6
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-76f18d76-4489-492e-aa87-0a52a9375d01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76f18d76-4489-492e-aa87-0a52a9375d01
Content-Type: application/json

--- request body ---
{"handle":"qa-68472e164531","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76f18d76-4489-492e-aa87-0a52a9375d01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76f18d76-4489-492e-aa87-0a52a9375d01"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-13e38e76-366e-4d85-b5a5-096e3d39b707

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13e38e76-366e-4d85-b5a5-096e3d39b707
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-13e38e76-366e-4d85-b5a5-096e3d39b707
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-5969f75c-9fcc-4b35-92f5-d528003627b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5969f75c-9fcc-4b35-92f5-d528003627b7
Content-Type: application/json

--- request body ---
{"handle":"qa-db5651c2e3fa","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5969f75c-9fcc-4b35-92f5-d528003627b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5969f75c-9fcc-4b35-92f5-d528003627b7"}
```
