# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-84873437-36ad-4042-92aa-cf5adb24edfc` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-f641487a-028e-48cc-92ba-61f9bbf0b469` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-a671dcce-15e6-4699-83e6-93eeaf6e182b` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-1e881203-3150-4e41-aae2-690c041cf5a4` |
| 5 | `POST /v1/accounts` | 400 | 15 | `qa-28a00629-b67e-4c5b-9b9f-da5fe9a2cb34` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-ad47b02d-4413-498a-93bc-12f8c45f017b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-4bb25291-71b3-45a7-8d64-4a9cf7b24905` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-3525c66d-88c9-4d95-9ac3-281aa172c2b2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-105fd37c-474c-40f5-81f4-ef2e7f96f9a5` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-43d5b947-b304-4a0d-aee0-f471ce559931` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-84873437-36ad-4042-92aa-cf5adb24edfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84873437-36ad-4042-92aa-cf5adb24edfc
Content-Type: application/json

--- request body ---
{"handle":"qa-c91f8c3bd57a","displayName":"QA c91f8c3bd57a","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-84873437-36ad-4042-92aa-cf5adb24edfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-c91f8c3bd57a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0415cf14-51dc-4d3a-b015-d706c77e3a08","handle":"qa-c91f8c3bd57a","displayName":"QA c91f8c3bd57a","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.188845288Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f641487a-028e-48cc-92ba-61f9bbf0b469

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f641487a-028e-48cc-92ba-61f9bbf0b469
Content-Type: application/json

--- request body ---
{"handle":"qa-90872873576c","displayName":"QA 90872873576c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f641487a-028e-48cc-92ba-61f9bbf0b469
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-90872873576c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99caf058-f031-4f6f-8603-32d88c3d9bdb","handle":"qa-90872873576c","displayName":"QA 90872873576c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.238236523Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a671dcce-15e6-4699-83e6-93eeaf6e182b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a671dcce-15e6-4699-83e6-93eeaf6e182b
Content-Type: application/json

--- request body ---
{"handle":"qa-c91f8c3bd57a","password":"****"}

--- response: 200 in 53 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a671dcce-15e6-4699-83e6-93eeaf6e182b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0415cf14-51dc-4d3a-b015-d706c77e3a08"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1e881203-3150-4e41-aae2-690c041cf5a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e881203-3150-4e41-aae2-690c041cf5a4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-90872873576c","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e881203-3150-4e41-aae2-690c041cf5a4
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
Location: /v1/conversations/cnv_b9638a3d-4662-4dee-b826-b4154a0d2692
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b9638a3d-4662-4dee-b826-b4154a0d2692","subject":"Error contract","status":"open","region":"eu","participants":["qa-c91f8c3bd57a","qa-90872873576c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.340054872Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-28a00629-b67e-4c5b-9b9f-da5fe9a2cb34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28a00629-b67e-4c5b-9b9f-da5fe9a2cb34
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28a00629-b67e-4c5b-9b9f-da5fe9a2cb34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-28a00629-b67e-4c5b-9b9f-da5fe9a2cb34"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ad47b02d-4413-498a-93bc-12f8c45f017b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad47b02d-4413-498a-93bc-12f8c45f017b
Content-Type: application/json

--- request body ---
{"handle":"qa-90872873576c","password":"****"}

--- response: 200 in 40 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad47b02d-4413-498a-93bc-12f8c45f017b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99caf058-f031-4f6f-8603-32d88c3d9bdb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4bb25291-71b3-45a7-8d64-4a9cf7b24905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bb25291-71b3-45a7-8d64-4a9cf7b24905
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4bb25291-71b3-45a7-8d64-4a9cf7b24905
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-3525c66d-88c9-4d95-9ac3-281aa172c2b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3525c66d-88c9-4d95-9ac3-281aa172c2b2
Content-Type: application/json

--- request body ---
{"handle":"qa-90872873576c","password":"****"}

--- response: 401 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3525c66d-88c9-4d95-9ac3-281aa172c2b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3525c66d-88c9-4d95-9ac3-281aa172c2b2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-105fd37c-474c-40f5-81f4-ef2e7f96f9a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-105fd37c-474c-40f5-81f4-ef2e7f96f9a5
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-105fd37c-474c-40f5-81f4-ef2e7f96f9a5
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-43d5b947-b304-4a0d-aee0-f471ce559931

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43d5b947-b304-4a0d-aee0-f471ce559931
Content-Type: application/json

--- request body ---
{"handle":"qa-c91f8c3bd57a","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43d5b947-b304-4a0d-aee0-f471ce559931
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43d5b947-b304-4a0d-aee0-f471ce559931"}
```
